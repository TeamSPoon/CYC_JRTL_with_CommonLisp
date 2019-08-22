package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_assertion_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_assertion_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_assertion_utilities";

    public static final String myFingerPrint = "63b24526759c6c36a244292e29a45b3ce443722c2ced28e0d2345a71a5ec9a06";



    // Internal Constants
    public static final SubLString $str0$HYP_RKF = makeString("HYP-RKF");

    private static final SubLSymbol RKF_ASSERTION_ATTRIBUTION_MT = makeSymbol("RKF-ASSERTION-ATTRIBUTION-MT");

    private static final SubLObject $$UIABookkeepingMt = reader_make_constant_shell(makeString("UIABookkeepingMt"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLSymbol $rkf_assertion_attribution_mt_caching_state$ = makeSymbol("*RKF-ASSERTION-ATTRIBUTION-MT-CACHING-STATE*");

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLObject $$assertedUsingTool = reader_make_constant_shell(makeString("assertedUsingTool"));



    private static final SubLSymbol HL_CONJUNCT_TO_SUPPORT = makeSymbol("HL-CONJUNCT-TO-SUPPORT");

    private static final SubLList $list9 = list(makeSymbol("MT"), makeSymbol("SENTENCE"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));







    private static final SubLObject $$rejectedSentence = reader_make_constant_shell(makeString("rejectedSentence"));

    public static final SubLList $list20 = list(makeKeyword("ISA"), makeKeyword("GENLS"));



    private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

    private static final SubLList $list23 = list(makeKeyword("MT"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list25 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER);

    private static final SubLObject $const26$defaultDefiningMtForSentenceOnTer = reader_make_constant_shell(makeString("defaultDefiningMtForSentenceOnTerm"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$defaultDefiningMtForSentence = reader_make_constant_shell(makeString("defaultDefiningMtForSentence"));

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    private static final SubLSymbol $kw31$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");



    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));

    private static final SubLList $list34 = list(makeKeyword("ARG"), reader_make_constant_shell(makeString("CycLAssertion")));

    public static SubLObject rkf_assert(final SubLObject formula, SubLObject mt, SubLObject nowP, SubLObject assume_wffP) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        if (assume_wffP == UNPROVIDED) {
            assume_wffP = NIL;
        }
        return rkf_assert_int(formula, mt, nowP, assume_wffP);
    }

    public static SubLObject rkf_assert_now(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        return rkf_assert_int(formula, mt, T, NIL);
    }

    public static SubLObject rkf_assert_wff_now(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        return rkf_assert_int(formula, mt, T, T);
    }

    public static SubLObject rkf_assert_int(final SubLObject formula, final SubLObject mt, final SubLObject nowP, final SubLObject assume_wffP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject successP = NIL;
        SubLObject error = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            if (NIL != nowP) {
                if (NIL != assume_wffP) {
                    thread.resetMultipleValues();
                    final SubLObject successP_$1 = ke.ke_assert_wff_now(formula, mt, UNPROVIDED, UNPROVIDED);
                    final SubLObject error_$2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    successP = successP_$1;
                    error = error_$2;
                } else {
                    thread.resetMultipleValues();
                    final SubLObject successP_$2 = ke.ke_assert_now(formula, mt, UNPROVIDED, UNPROVIDED);
                    final SubLObject error_$3 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    successP = successP_$2;
                    error = error_$3;
                }
            } else
                if (NIL != assume_wffP) {
                    successP = ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                    error = fi.$fi_error$.getDynamicValue(thread);
                } else {
                    successP = ke.ke_assert(formula, mt, UNPROVIDED, UNPROVIDED);
                    error = fi.$fi_error$.getDynamicValue(thread);
                }

        } finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != successP) {
            final SubLObject tool = rkf_macros.$rkf_asserting_tool$.getDynamicValue(thread);
            if (NIL != tool) {
                final SubLObject new_as = czer_meta.find_assertion_cycl(formula, mt);
                if (NIL != assertion_handles.assertion_p(new_as)) {
                    rkf_attribute_assertion_to_tool(formula, mt, tool);
                }
            }
            rkf_event_dispatcher.rkf_post_assert_event(formula, mt, NIL, tool);
        }
        return values(successP, error);
    }

    public static SubLObject rkf_hypothesize(final SubLObject formula, final SubLObject domain_mt, SubLObject prefix) {
        if (prefix == UNPROVIDED) {
            prefix = $str0$HYP_RKF;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_string = NIL;
        SubLObject terms = NIL;
        terms = prove.fi_hypothesize_int(formula, domain_mt, prefix, UNPROVIDED);
        if (NIL == terms) {
            error_string = fi.fi_error_string(fi.$fi_error$.getDynamicValue(thread));
        }
        return values(terms, error_string);
    }

    public static SubLObject clear_rkf_assertion_attribution_mt() {
        final SubLObject cs = $rkf_assertion_attribution_mt_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rkf_assertion_attribution_mt() {
        return memoization_state.caching_state_remove_function_results_with_args($rkf_assertion_attribution_mt_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_assertion_attribution_mt_internal() {
        return NIL != valid_constantP($$UIABookkeepingMt, UNPROVIDED) ? $$UIABookkeepingMt : $$BookkeepingMt;
    }

    public static SubLObject rkf_assertion_attribution_mt() {
        SubLObject caching_state = $rkf_assertion_attribution_mt_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RKF_ASSERTION_ATTRIBUTION_MT, $rkf_assertion_attribution_mt_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rkf_assertion_attribution_mt_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject rkf_attribute_assertion_to_tool(final SubLObject sentence, final SubLObject mt, final SubLObject tool) {
        final SubLObject arg_sentence = make_binary_formula($$ist, mt, sentence);
        final SubLObject author_sentence = make_binary_formula($$assertedUsingTool, arg_sentence, tool);
        return ke.ke_assert(author_sentence, rkf_assertion_attribution_mt(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_unassert(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $rkf_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject el_sentence = NIL;
        if (NIL != assertion_handles.assertion_p(sentence)) {
            el_sentence = uncanonicalizer.assertion_el_formula(sentence);
            mt = assertions_high.assertion_mt(sentence);
            v_answer = ke.ke_unassert_assertion_now(sentence);
        } else {
            thread.resetMultipleValues();
            final SubLObject assertions = czer_meta.find_assertions_cycl(sentence, mt);
            final SubLObject missingP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            el_sentence = sentence;
            if (NIL == assertions) {
                v_answer = NIL;
            } else {
                v_answer = ke.ke_unassert_now(sentence, mt);
                if ((NIL != v_answer) && (NIL != missingP)) {
                    v_answer = $PARTIAL;
                }
            }
        }
        if (NIL != v_answer) {
            rkf_event_dispatcher.rkf_post_unassert_event(el_sentence, mt, UNPROVIDED, UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject rkf_scenario_assert(final SubLObject formula, final SubLObject mt) {
        return rkf_assert(formula, mt, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_why_not_assertible_compliant(final SubLObject sentence, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $within_assert$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$validate_expansionsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_admit_consistent_nautsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$at_admit_consistent_nartsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$include_suf_defn_violationsP$.currentBinding(thread);
        try {
            $within_assert$.bind(T, thread);
            wff_vars.$validate_expansionsP$.bind(T, thread);
            at_vars.$at_admit_consistent_nautsP$.bind(T, thread);
            at_vars.$at_admit_consistent_nartsP$.bind(NIL, thread);
            wff_vars.$include_suf_defn_violationsP$.bind(NIL, thread);
            result = rkf_supports_for_why_not_wff(sentence, domain_mt);
        } finally {
            wff_vars.$include_suf_defn_violationsP$.rebind(_prev_bind_5, thread);
            at_vars.$at_admit_consistent_nartsP$.rebind(_prev_bind_4, thread);
            at_vars.$at_admit_consistent_nautsP$.rebind(_prev_bind_3, thread);
            wff_vars.$validate_expansionsP$.rebind(_prev_bind_2, thread);
            $within_assert$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rkf_supports_for_why_not_wff(final SubLObject sentence, final SubLObject domain_mt) {
        return hl_explanation_to_argument(wff.hl_explanation_of_why_not_wff(sentence, domain_mt));
    }

    public static SubLObject rkf_supports_for_why_not_wft(final SubLObject expression, final SubLObject domain_mt) {
        return hl_explanation_to_argument(wff.hl_explanation_of_why_not_wft(expression, domain_mt));
    }

    public static SubLObject hl_explanation_to_argument(final SubLObject hl_explanation) {
        if (NIL == hl_explanation) {
            return NIL;
        }
        if (NIL != el_conjunction_p(hl_explanation)) {
            return nreverse(delete(NIL, Mapping.mapcar(HL_CONJUNCT_TO_SUPPORT, cycl_utilities.formula_args(hl_explanation, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return delete(NIL, list(hl_conjunct_to_support(hl_explanation)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hl_conjunct_to_support(final SubLObject hl_conjunct) {
        if (NIL != arguments.support_p(hl_conjunct)) {
            return hl_conjunct;
        }
        if (NIL != el_formula_with_operator_p(hl_conjunct, $$ist)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.formula_args(hl_conjunct, UNPROVIDED);
            SubLObject mt = NIL;
            SubLObject sentence = NIL;
            destructuring_bind_must_consp(current, datum, $list9);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list9);
            sentence = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL != hlmt.hlmt_p(mt)) && (NIL != possibly_sentence_p(sentence))) {
                    final SubLObject modified_sentence = fix_hl_conjunct_sentence(sentence, mt);
                    final SubLObject hl_support_module = hl_support_module_for_sentence(modified_sentence);
                    return arguments.make_hl_support(hl_support_module, modified_sentence, mt, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list9);
            }
        } else
            if (NIL != possibly_sentence_p(hl_conjunct)) {
                final SubLObject modified_sentence2 = fix_hl_conjunct_sentence(hl_conjunct, UNPROVIDED);
                final SubLObject hl_support_module2 = hl_support_module_for_sentence(modified_sentence2);
                return arguments.make_hl_support(hl_support_module2, modified_sentence2, UNPROVIDED, UNPROVIDED);
            }

        return NIL;
    }

    public static SubLObject fix_hl_conjunct_sentence(SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != disjoint_with_hl_conjunct_sentenceP(sentence)) {
            return hl_conjunct_sentence_to_disjoint_with(sentence);
        }
        if ((NIL != el_negation_p(sentence)) && (NIL == fi.fi_ask_int(sentence, mt, ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED))) {
            sentence = make_unary_formula($$unknownSentence, cycl_utilities.formula_arg1(sentence, UNPROVIDED));
        }
        return sentence;
    }

    public static SubLObject disjoint_with_hl_conjunct_sentenceP(final SubLObject sentence) {
        if ((NIL != el_negation_p(sentence)) && (NIL != el_conjunction_p(cycl_utilities.formula_arg1(sentence, UNPROVIDED)))) {
            SubLObject failP = NIL;
            SubLObject var = NIL;
            if (NIL == failP) {
                SubLObject csome_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(sentence, UNPROVIDED), UNPROVIDED);
                SubLObject conjunct = NIL;
                conjunct = csome_list_var.first();
                while ((NIL == failP) && (NIL != csome_list_var)) {
                    if ((NIL != el_formula_with_operator_p(conjunct, $$isa)) && ((NIL == var) || var.eql(cycl_utilities.formula_arg1(conjunct, UNPROVIDED)))) {
                        if (NIL == var) {
                            var = cycl_utilities.formula_arg1(conjunct, UNPROVIDED);
                        }
                    } else {
                        failP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    conjunct = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == failP);
        }
        return NIL;
    }

    public static SubLObject hl_conjunct_sentence_to_disjoint_with(final SubLObject sentence) {
        SubLObject disjoint_cols = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(sentence, UNPROVIDED), UNPROVIDED);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            disjoint_cols = cons(cycl_utilities.formula_arg2(conjunct, UNPROVIDED), disjoint_cols);
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return make_el_formula($$disjointWith, nreverse(disjoint_cols), UNPROVIDED);
    }

    public static SubLObject hl_support_module_for_sentence(final SubLObject sentence) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(sentence);
        if (pcase_var.eql($$not)) {
            return hl_support_module_for_sentence(cycl_utilities.formula_arg1(sentence, UNPROVIDED));
        }
        if (pcase_var.eql($$isa)) {
            return $ISA;
        }
        if (pcase_var.eql($$genls)) {
            return $GENLS;
        }
        if (pcase_var.eql($$disjointWith)) {
            return $DISJOINTWITH;
        }
        return $OPAQUE;
    }

    public static SubLObject rkf_edit_with_implicature(final SubLObject old_sentence, final SubLObject new_sentence, final SubLObject domain_mt) {
        rkf_unassert(old_sentence, domain_mt);
        return rkf_assert_with_implicature(new_sentence, domain_mt, UNPROVIDED);
    }

    public static SubLObject rkf_assert_with_implicature(SubLObject sentence, SubLObject domain_mt, SubLObject now) {
        if (now == UNPROVIDED) {
            now = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject successes = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject sentence_$5 = czer_utilities.unwrap_if_ist(sentence, domain_mt, UNPROVIDED);
        final SubLObject domain_mt_$6 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        sentence = sentence_$5;
        domain_mt = domain_mt_$6;
        thread.resetMultipleValues();
        final SubLObject successP = rkf_assert_with_implicature_int(sentence, domain_mt, successes, now);
        final SubLObject reason = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(successP, reason, set.set_element_list(successes));
    }

    public static SubLObject rkf_assert_with_implicature_int(final SubLObject sentence, final SubLObject domain_mt, final SubLObject successes, SubLObject now) {
        if (now == UNPROVIDED) {
            now = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != rkf_assert(sentence, domain_mt, now, UNPROVIDED)) {
            rkf_note_successful_assertion(sentence, successes);
            return values(T, sentence);
        }
        final SubLObject reasons = rkf_why_not_assertible_compliant(sentence, domain_mt);
        SubLObject repairs = ZERO_INTEGER;
        SubLObject cdolist_list_var = reasons;
        SubLObject argument = NIL;
        argument = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject can_be_fixedP = rkf_formula_usable_for_implicature_repairP(argument);
            final SubLObject how = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != can_be_fixedP) {
                final SubLObject missing_sentence = how;
                if (missing_sentence.equal(sentence)) {
                    return values(NIL, make_unary_formula($$rejectedSentence, make_binary_formula($$ist, domain_mt, missing_sentence)));
                }
                if (NIL != rkf_contradiction_finder.rkf_rejected(missing_sentence, domain_mt, UNPROVIDED, UNPROVIDED)) {
                    return values(NIL, arguments.support_formula(argument));
                }
                if (NIL != rkf_assertion_that_succeededP(missing_sentence, successes)) {
                    return values(NIL, make_unary_formula($$rejectedSentence, make_binary_formula($$ist, domain_mt, arguments.support_formula(argument))));
                }
                thread.resetMultipleValues();
                final SubLObject successP = rkf_assert_with_implicature_int(missing_sentence, domain_mt, successes, now);
                final SubLObject reason = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == successP) {
                    return values(NIL, reason);
                }
                repairs = add(repairs, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            argument = cdolist_list_var.first();
        } 
        if (!repairs.isPositive()) {
            return values(NIL, sentence);
        }
        return rkf_assert_with_implicature_int(sentence, domain_mt, successes, now);
    }

    public static SubLObject rkf_note_successful_assertion(final SubLObject sentence, final SubLObject v_set) {
        return set.set_add(sentence, v_set);
    }

    public static SubLObject rkf_assertion_that_succeededP(final SubLObject sentence, final SubLObject v_set) {
        return set.set_memberP(sentence, v_set);
    }

    public static SubLObject rkf_formula_usable_for_implicature_repairP(final SubLObject argument) {
        final SubLObject module = arguments.support_module(argument);
        final SubLObject formula = arguments.support_sentence(argument);
        if ((NIL != hl_supports.opaque_hl_support_p(argument)) && cycl_utilities.formula_arg0(formula).eql($$unknownSentence)) {
            final SubLObject repair_sentence = cycl_utilities.formula_arg1(formula, UNPROVIDED);
            SubLObject fix_will_workP = T;
            if (NIL != kb_accessors.not_assertible_predicateP(cycl_utilities.formula_arg0(repair_sentence), UNPROVIDED)) {
                fix_will_workP = NIL;
            }
            return values(fix_will_workP, repair_sentence);
        }
        if ((NIL != subl_promotions.memberP(module, $list20, UNPROVIDED, UNPROVIDED)) && cycl_utilities.formula_arg0(formula).eql($$not)) {
            return values(T, cycl_utilities.formula_arg1(formula, UNPROVIDED));
        }
        return values(NIL, NIL);
    }

    public static SubLObject rkf_best_defining_mt_for_fort(final SubLObject fort, final SubLObject default_mt) {
        SubLObject result = NIL;
        final SubLObject default_defining_mts = ask_utilities.query_variable($MT, listS($$definingMt, fort, $list23), $$InferencePSC, $list25);
        result = (NIL != default_defining_mts.first()) ? default_defining_mts.first() : default_mt;
        return result;
    }

    public static SubLObject rkf_best_defining_mt_for_fort_and_sentence(final SubLObject fort, final SubLObject sentence, final SubLObject default_mt) {
        if (NIL != el_formula_p(sentence)) {
            SubLObject result = NIL;
            final SubLObject default_defining_mts = ask_utilities.query_variable($MT, listS($const26$defaultDefiningMtForSentenceOnTer, sentence, fort, $list23), $$InferencePSC, $list25);
            result = (NIL != default_defining_mts.first()) ? default_defining_mts.first() : default_mt;
            return result;
        }
        return NIL;
    }

    public static SubLObject rkf_best_defining_mt_for_sentence(final SubLObject sentence, final SubLObject default_mt) {
        SubLObject result = NIL;
        final SubLObject presupposed_asserts = rkf_gather_expression_assertion_args(sentence, UNPROVIDED);
        final SubLObject precondition_sentence = (NIL != presupposed_asserts) ? cons($$and, presupposed_asserts) : NIL;
        final SubLObject query_sentence = (NIL != precondition_sentence) ? list($$implies, precondition_sentence, listS($$defaultDefiningMtForSentence, sentence, $list23)) : listS($$defaultDefiningMtForSentence, sentence, $list23);
        final SubLObject conditionalP = inference_strategist.inference_conditional_sentence_p(query_sentence);
        final SubLObject default_defining_mts = ask_utilities.query_variable($MT, query_sentence, $$InferencePSC, list($MAX_TRANSFORMATION_DEPTH, TWO_INTEGER, $kw31$CONDITIONAL_SENTENCE_, conditionalP));
        result = (NIL != default_defining_mts.first()) ? default_defining_mts.first() : default_mt;
        return result;
    }

    public static SubLObject rkf_gather_expression_assertion_args(final SubLObject sentence, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject meta_preds = (NIL != czer_meta.meta_predicateP(cycl_utilities.formula_arg0(sentence), UNPROVIDED)) ? list(cycl_utilities.formula_arg0(sentence)) : NIL;
        SubLObject assertion_args = NIL;
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(NIL != mt ? mt : mt_relevance_macros.$mt$.getDynamicValue(thread));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = meta_preds;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                assertion_args = cconcatenate(ask_utilities.ask_variable($ARG, listS($$argIsa, pred, $list34), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), assertion_args);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = assertion_args;
        SubLObject arg_num = NIL;
        arg_num = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            result = cons(cycl_utilities.formula_arg(sentence, arg_num, UNPROVIDED), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            arg_num = cdolist_list_var2.first();
        } 
        return result;
    }

    public static SubLObject declare_rkf_assertion_utilities_file() {
        declareFunction(me, "rkf_assert", "RKF-ASSERT", 1, 3, false);
        declareFunction(me, "rkf_assert_now", "RKF-ASSERT-NOW", 1, 1, false);
        declareFunction(me, "rkf_assert_wff_now", "RKF-ASSERT-WFF-NOW", 1, 1, false);
        declareFunction(me, "rkf_assert_int", "RKF-ASSERT-INT", 4, 0, false);
        declareFunction(me, "rkf_hypothesize", "RKF-HYPOTHESIZE", 2, 1, false);
        declareFunction(me, "clear_rkf_assertion_attribution_mt", "CLEAR-RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false);
        declareFunction(me, "remove_rkf_assertion_attribution_mt", "REMOVE-RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false);
        declareFunction(me, "rkf_assertion_attribution_mt_internal", "RKF-ASSERTION-ATTRIBUTION-MT-INTERNAL", 0, 0, false);
        declareFunction(me, "rkf_assertion_attribution_mt", "RKF-ASSERTION-ATTRIBUTION-MT", 0, 0, false);
        declareFunction(me, "rkf_attribute_assertion_to_tool", "RKF-ATTRIBUTE-ASSERTION-TO-TOOL", 3, 0, false);
        declareFunction(me, "rkf_unassert", "RKF-UNASSERT", 1, 1, false);
        declareFunction(me, "rkf_scenario_assert", "RKF-SCENARIO-ASSERT", 2, 0, false);
        declareFunction(me, "rkf_why_not_assertible_compliant", "RKF-WHY-NOT-ASSERTIBLE-COMPLIANT", 2, 0, false);
        declareFunction(me, "rkf_supports_for_why_not_wff", "RKF-SUPPORTS-FOR-WHY-NOT-WFF", 2, 0, false);
        declareFunction(me, "rkf_supports_for_why_not_wft", "RKF-SUPPORTS-FOR-WHY-NOT-WFT", 2, 0, false);
        declareFunction(me, "hl_explanation_to_argument", "HL-EXPLANATION-TO-ARGUMENT", 1, 0, false);
        declareFunction(me, "hl_conjunct_to_support", "HL-CONJUNCT-TO-SUPPORT", 1, 0, false);
        declareFunction(me, "fix_hl_conjunct_sentence", "FIX-HL-CONJUNCT-SENTENCE", 1, 1, false);
        declareFunction(me, "disjoint_with_hl_conjunct_sentenceP", "DISJOINT-WITH-HL-CONJUNCT-SENTENCE?", 1, 0, false);
        declareFunction(me, "hl_conjunct_sentence_to_disjoint_with", "HL-CONJUNCT-SENTENCE-TO-DISJOINT-WITH", 1, 0, false);
        declareFunction(me, "hl_support_module_for_sentence", "HL-SUPPORT-MODULE-FOR-SENTENCE", 1, 0, false);
        declareFunction(me, "rkf_edit_with_implicature", "RKF-EDIT-WITH-IMPLICATURE", 3, 0, false);
        declareFunction(me, "rkf_assert_with_implicature", "RKF-ASSERT-WITH-IMPLICATURE", 2, 1, false);
        declareFunction(me, "rkf_assert_with_implicature_int", "RKF-ASSERT-WITH-IMPLICATURE-INT", 3, 1, false);
        declareFunction(me, "rkf_note_successful_assertion", "RKF-NOTE-SUCCESSFUL-ASSERTION", 2, 0, false);
        declareFunction(me, "rkf_assertion_that_succeededP", "RKF-ASSERTION-THAT-SUCCEEDED?", 2, 0, false);
        declareFunction(me, "rkf_formula_usable_for_implicature_repairP", "RKF-FORMULA-USABLE-FOR-IMPLICATURE-REPAIR?", 1, 0, false);
        declareFunction(me, "rkf_best_defining_mt_for_fort", "RKF-BEST-DEFINING-MT-FOR-FORT", 2, 0, false);
        declareFunction(me, "rkf_best_defining_mt_for_fort_and_sentence", "RKF-BEST-DEFINING-MT-FOR-FORT-AND-SENTENCE", 3, 0, false);
        declareFunction(me, "rkf_best_defining_mt_for_sentence", "RKF-BEST-DEFINING-MT-FOR-SENTENCE", 2, 0, false);
        declareFunction(me, "rkf_gather_expression_assertion_args", "RKF-GATHER-EXPRESSION-ASSERTION-ARGS", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_rkf_assertion_utilities_file() {
        deflexical("*RKF-ASSERTION-ATTRIBUTION-MT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_assertion_utilities_file() {
        memoization_state.note_globally_cached_function(RKF_ASSERTION_ATTRIBUTION_MT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_assertion_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_assertion_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_assertion_utilities_file();
    }

    
}

/**
 * Total time: 264 ms
 */
