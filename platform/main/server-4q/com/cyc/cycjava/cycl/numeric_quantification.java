/**
 *
 */
/**
 * //
 */
/**
 *
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class numeric_quantification extends SubLTranslatedFile {
    public static final SubLFile me = new numeric_quantification();

    public static final String myName = "com.cyc.cycjava.cycl.numeric_quantification";

    public static final String myFingerPrint = "2253b845553cf2ab893af96c26dc6f0ffa5c39e9363be0ef22c8174a9c6c5f46";

    // deflexical
    // Definitions
    /**
     * Do we support numeric quantification over sets where the function does not
     * apply to every item in the set. When this parameter is non-nil, such items
     * are ignored in the iteration.
     */
    public static final SubLSymbol $partial_numeric_quantification$ = makeSymbol("*PARTIAL-NUMERIC-QUANTIFICATION*");

    // defparameter
    public static final SubLSymbol $numeric_quantification_function$ = makeSymbol("*NUMERIC-QUANTIFICATION-FUNCTION*");

    // defparameter
    private static final SubLSymbol $cyc_sort_compare_pred$ = makeSymbol("*CYC-SORT-COMPARE-PRED*");

    // Internal Constants
    public static final SubLString $str0$A_KB_dependent_numerical_quantifi = makeString("A KB-dependent numerical quantification function was called, but the current Cyc KB does not contain knowledge about numerical quantification.");



    private static final SubLObject $$IdentityFn = reader_make_constant_shell(makeString("IdentityFn"));

    public static final SubLSymbol COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED = makeSymbol("COMPUTE-POSSIBLE-NUMERIC-QUANTIFICATION-VALUE-FORMULA-MEMOIZED");

    public static final SubLSymbol $sym4$_NQVAL = makeSymbol("?NQVAL");





    private static final SubLSymbol COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP = makeSymbol("COMPUTE-THE-SET-OF-ELEMENT-TO-NUMERIC-QUANT-VALUE-MAP");



    private static final SubLSymbol CYC_PLUS_ALL = makeSymbol("CYC-PLUS-ALL");

    private static final SubLSymbol CYC_TIMES_ALL = makeSymbol("CYC-TIMES-ALL");

    private static final SubLSymbol CYC_MAXIMUM = makeSymbol("CYC-MAXIMUM");

    private static final SubLSymbol CYC_MINIMUM = makeSymbol("CYC-MINIMUM");

    private static final SubLSymbol CYC_AVERAGE = makeSymbol("CYC-AVERAGE");

    private static final SubLSymbol CYC_LESS_THAN = makeSymbol("CYC-LESS-THAN");

    private static final SubLSymbol CYC_MEDIAN = makeSymbol("CYC-MEDIAN");

    private static final SubLList $list16 = list(makeSymbol("CANDIDATE-ITEM"), makeSymbol("CANDIDATE-VALUE"));

    private static final SubLSymbol CYC_EXTREME_MEMBER = makeSymbol("CYC-EXTREME-MEMBER");

    private static final SubLList $list18 = list(reader_make_constant_shell(makeString("greaterThan")), reader_make_constant_shell(makeString("lessThan")));

    private static final SubLSymbol NSIMPLIFY_NUMERIC_QUANTIFICATION_TUPLE_QUANTITY_VALUE = makeSymbol("NSIMPLIFY-NUMERIC-QUANTIFICATION-TUPLE-QUANTITY-VALUE");

    private static final SubLList $list20 = cons(makeSymbol("FIRST-TUPLE"), makeSymbol("REST-TUPLES"));

    private static final SubLSymbol CYC_SORT = makeSymbol("CYC-SORT");

    private static final SubLSymbol CYC_STABLE_SORT = makeSymbol("CYC-STABLE-SORT");



    private static final SubLSymbol CYC_SORT_FN = makeSymbol("CYC-SORT-FN");

    private static final SubLList $list25 = list(makeSymbol("CYC-SORT"));

    private static final SubLSymbol $sym26$CYC_SORT__ = makeSymbol("CYC-SORT-<");



    private static final SubLObject $$greaterThan = reader_make_constant_shell(makeString("greaterThan"));

    private static final SubLObject $$lessThan = reader_make_constant_shell(makeString("lessThan"));

    private static final SubLSymbol $sym30$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY = makeSymbol("NUMERIC-QUANTIFICATION-COMPARE-RECURSIVE-QUERY");

    private static final SubLInteger $int$8096 = makeInteger(8096);

    private static final SubLSymbol CYC_SORT_SET_VIA_BIN_PRED_FN = makeSymbol("CYC-SORT-SET-VIA-BIN-PRED-FN");

    public static SubLObject numeric_evaluate_all_unary(final SubLObject function, final SubLObject item_list) {
        if (NIL == kb_control_vars.quant_kb_loaded_p()) {
            Errors.error($str0$A_KB_dependent_numerical_quantifi);
        }
        return relation_evaluation.cyc_evaluate_all_unary(function, item_list, $partial_numeric_quantification$.getGlobalValue());
    }

    public static SubLObject numeric_quantification_group_items(final SubLObject item_group, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject items = NIL;
        final SubLObject _prev_bind_0 = $numeric_quantification_function$.currentBinding(thread);
        try {
            $numeric_quantification_function$.bind(function, thread);
            if (NIL != el_list_p(item_group)) {
                items = el_list_items(item_group);
            } else {
                items = quantities.evaluate_set_elements(item_group, $HL);
            }
        } finally {
            $numeric_quantification_function$.rebind(_prev_bind_0, thread);
        }
        return items;
    }

    public static SubLObject numeric_quantification_item_value_tuples(final SubLObject item_group, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = numeric_quantification_group_items(item_group, function);
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject value = numeric_quantification_apply_function(function, item);
            final SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                tuples = cons(list(item, value), tuples);
            } else
                if (NIL == $partial_numeric_quantification$.getGlobalValue()) {
                    relation_evaluation.throw_unevaluatable();
                }

            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(tuples);
    }

    public static SubLObject numeric_quantification_item_values(final SubLObject item_group, final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject items = numeric_quantification_group_items(item_group, function);
        SubLObject values = NIL;
        SubLObject cdolist_list_var = items;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject value = numeric_quantification_apply_function(function, item);
            final SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                values = cons(value, values);
            } else
                if (NIL == $partial_numeric_quantification$.getGlobalValue()) {
                    relation_evaluation.throw_unevaluatable();
                }

            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(values);
    }

    public static SubLObject numeric_quantification_apply_function(final SubLObject function, final SubLObject item) {
        if (function.eql($$IdentityFn)) {
            return values(item, T);
        }
        if (NIL != ask_utilities.the_set_of_problem_solvable_via_generalized_queryP(UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return numeric_quantification_item_value_via_generalized_query(function, item);
        }
        final SubLObject formula = make_unary_formula(function, item);
        return relation_evaluation.cyc_evaluate(formula);
    }

    public static SubLObject numeric_quantification_item_value_via_generalized_query(final SubLObject function, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject value = NIL;
        SubLObject valid = NIL;
        final SubLObject _prev_bind_0 = $numeric_quantification_function$.currentBinding(thread);
        try {
            $numeric_quantification_function$.bind(function, thread);
            thread.resetMultipleValues();
            final SubLObject value_$1 = the_set_of_element_value_via_generalized_query(item, UNPROVIDED, UNPROVIDED);
            final SubLObject valid_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            value = value_$1;
            valid = valid_$2;
        } finally {
            $numeric_quantification_function$.rebind(_prev_bind_0, thread);
        }
        return values(value, valid);
    }

    public static SubLObject compute_possible_numeric_quantification_value_formula(final SubLObject the_set_of_variable) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function = $numeric_quantification_function$.getDynamicValue(thread);
        if ((NIL != function) && (NIL != relation_evaluation.function_to_arg_function_p(function))) {
            final SubLObject output_argnum = cycl_utilities.formula_arg1(function, UNPROVIDED);
            final SubLObject predicate = cycl_utilities.formula_arg2(function, UNPROVIDED);
            return compute_possible_numeric_quantification_value_formula_memoized(the_set_of_variable, output_argnum, predicate);
        }
        return NIL;
    }

    public static SubLObject compute_possible_numeric_quantification_value_formula_memoized_internal(final SubLObject the_set_of_variable, final SubLObject output_argnum, final SubLObject predicate) {
        final SubLObject input_argnum = arity.binary_arg_swap(output_argnum);
        final SubLObject numeric_quant_value_variable = $sym4$_NQVAL;
        if ((NIL != kappa_predicate_p(predicate)) && TWO_INTEGER.numE(kappa_predicate_arity(predicate))) {
            final SubLObject scoped_vars = cycl_utilities.formula_arg1(predicate, UNPROVIDED);
            final SubLObject kappa_input_variable = nth(number_utilities.f_1_(input_argnum), scoped_vars);
            final SubLObject kappa_output_variable = nth(number_utilities.f_1_(output_argnum), scoped_vars);
            SubLObject value_formula = cycl_utilities.formula_arg2(predicate, UNPROVIDED);
            value_formula = subst(the_set_of_variable, kappa_input_variable, value_formula, UNPROVIDED, UNPROVIDED);
            value_formula = subst(numeric_quant_value_variable, kappa_output_variable, value_formula, UNPROVIDED, UNPROVIDED);
            return value_formula;
        }
        if ((NIL != forts.fort_p(predicate)) && (NIL != arity.binaryP(predicate))) {
            final SubLObject value_formula2 = make_binary_formula(predicate, $ARG1, $ARG2);
            set_nth(input_argnum, value_formula2, the_set_of_variable);
            set_nth(output_argnum, value_formula2, numeric_quant_value_variable);
            return value_formula2;
        }
        return NIL;
    }

    public static SubLObject compute_possible_numeric_quantification_value_formula_memoized(final SubLObject the_set_of_variable, final SubLObject output_argnum, final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return compute_possible_numeric_quantification_value_formula_memoized_internal(the_set_of_variable, output_argnum, predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(the_set_of_variable, output_argnum, predicate);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (the_set_of_variable.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (output_argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && predicate.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(compute_possible_numeric_quantification_value_formula_memoized_internal(the_set_of_variable, output_argnum, predicate)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(the_set_of_variable, output_argnum, predicate));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject the_set_of_element_value_via_generalized_query(final SubLObject element, SubLObject problem, SubLObject mt) {
        if (problem == UNPROVIDED) {
            problem = inference_worker.currently_active_problem();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLObject numeric_quant_value_map = compute_the_set_of_element_to_numeric_quant_value_map(problem, mt);
        return dictionary.dictionary_lookup(numeric_quant_value_map, element, NIL);
    }

    public static SubLObject compute_the_set_of_element_to_numeric_quant_value_map_internal(final SubLObject problem, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject generalized_query = ask_utilities.compute_the_set_of_elements_generalized_query(problem);
        final SubLObject the_set_of_variable = thread.secondMultipleValue();
        final SubLObject supported_restriction_bindings = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject expanded_answers = ask_utilities.the_set_of_elements_generalized_query_memoized(generalized_query, mt);
        final SubLObject result_map = dictionary.new_dictionary(symbol_function(EQUAL), ZERO_INTEGER);
        SubLObject cdolist_list_var = expanded_answers;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.fast_subsetP(supported_restriction_bindings, binding, symbol_function(EQUAL))) {
                final SubLObject element = bindings.variable_lookup(the_set_of_variable, binding);
                final SubLObject value = bindings.variable_lookup($sym4$_NQVAL, binding);
                dictionary.dictionary_enter(result_map, element, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return result_map;
    }

    public static SubLObject compute_the_set_of_element_to_numeric_quant_value_map(final SubLObject problem, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return compute_the_set_of_element_to_numeric_quant_value_map_internal(problem, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (problem.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(compute_the_set_of_element_to_numeric_quant_value_map_internal(problem, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject cyc_plus_all(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        final SubLObject v_answer = cyc_plus_all_internal(values);
        if (NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(v_answer);
    }

    public static SubLObject cyc_plus_all_internal(final SubLObject values) {
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = values;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_answer = (NIL != v_answer) ? arithmetic.cyc_plus_internal(v_answer, value) : value;
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return v_answer;
    }

    public static SubLObject cyc_times_all(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        SubLObject v_answer = ONE_INTEGER;
        SubLObject cdolist_list_var = values;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_answer = arithmetic.cyc_times_internal(v_answer, value);
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return arithmetic.arithmetic_answer(v_answer);
    }

    public static SubLObject cyc_maximum(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = values;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == v_answer) || (NIL != arithmetic.cyc_greater_than(value, v_answer))) {
                v_answer = value;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        if (NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(v_answer);
    }

    public static SubLObject cyc_minimum(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = values;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == v_answer) || (NIL != arithmetic.cyc_less_than(value, v_answer))) {
                v_answer = value;
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        if (NIL == v_answer) {
            relation_evaluation.throw_unevaluatable();
        }
        return arithmetic.arithmetic_answer(v_answer);
    }

    public static SubLObject cyc_average(final SubLObject v_set, final SubLObject function) {
        final SubLObject values = numeric_quantification_item_values(v_set, function);
        final SubLObject sum = cyc_plus_all_internal(values);
        final SubLObject count = length(values);
        return quantities.cyc_quotient(sum, count);
    }

    public static SubLObject cyc_median(final SubLObject v_set, final SubLObject function) {
        SubLObject values = numeric_quantification_item_values(v_set, function);
        final SubLObject total = length(values);
        final SubLObject middle_index = integerDivide(total, TWO_INTEGER);
        SubLObject v_answer = NIL;
        values = Sort.sort(values, CYC_LESS_THAN, UNPROVIDED);
        if (total.isZero()) {
            relation_evaluation.throw_unevaluatable();
        } else
            if (NIL != oddp(total)) {
                v_answer = nth(middle_index, values);
            } else {
                final SubLObject median_a_value = nth(middle_index, values);
                final SubLObject median_b_value = nth(number_utilities.f_1_(middle_index), values);
                v_answer = quantities.cyc_quotient(arithmetic.cyc_plus_internal(median_a_value, median_b_value), TWO_INTEGER);
            }

        return arithmetic.arithmetic_answer(v_answer);
    }

    public static SubLObject cyc_extreme_member(final SubLObject list, final SubLObject compare_pred, final SubLObject function) {
        if ((NIL == fort_types_interface.isa_predicateP(compare_pred, UNPROVIDED)) || (!TWO_INTEGER.eql(arity.arity(compare_pred)))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject tuples = numeric_quantification_item_value_tuples(list, function);
        SubLObject extreme_item = NIL;
        SubLObject extreme_value = NIL;
        SubLObject cdolist_list_var;
        tuples = cdolist_list_var = possibly_optimize_tuples_wrt_compare_pred(tuples, compare_pred);
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject candidate_item = NIL;
            SubLObject candidate_value = NIL;
            destructuring_bind_must_consp(current, datum, $list16);
            candidate_item = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list16);
            candidate_value = current.first();
            current = current.rest();
            if (NIL == current) {
                if ((NIL == extreme_item) || (NIL != numeric_quantification_compare(compare_pred, candidate_value, extreme_value))) {
                    extreme_item = candidate_item;
                    extreme_value = candidate_value;
                }
            } else {
                cdestructuring_bind_error(datum, $list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        if (NIL == extreme_item) {
            relation_evaluation.throw_unevaluatable();
        }
        return extreme_item;
    }

    public static SubLObject possibly_optimize_tuples_wrt_compare_pred(SubLObject tuples, final SubLObject compare_pred) {
        if ((NIL != list_utilities.member_eqP(compare_pred, $list18)) && (NIL != tuple_values_all_are_simply_uniform_quantitiesP(tuples))) {
            tuples = list_utilities.nmapcar(NSIMPLIFY_NUMERIC_QUANTIFICATION_TUPLE_QUANTITY_VALUE, tuples);
        }
        return tuples;
    }

    public static SubLObject tuple_values_all_are_simply_uniform_quantitiesP(final SubLObject tuples) {
        if (NIL != tuples) {
            SubLObject first_tuple = NIL;
            SubLObject rest_tuples = NIL;
            destructuring_bind_must_consp(tuples, tuples, $list20);
            first_tuple = tuples.first();
            final SubLObject current = rest_tuples = tuples.rest();
            final SubLObject first_value = second(first_tuple);
            if ((NIL != el_unary_formula_p(first_value)) && cycl_utilities.formula_arg1(first_value, UNPROVIDED).isNumber()) {
                final SubLObject unit = cycl_utilities.formula_operator(first_value);
                if (NIL != collection_defns.unit_of_measureP(unit, UNPROVIDED)) {
                    SubLObject witness = NIL;
                    if (NIL == witness) {
                        SubLObject csome_list_var = rest_tuples;
                        SubLObject other_tuple = NIL;
                        other_tuple = csome_list_var.first();
                        while ((NIL == witness) && (NIL != csome_list_var)) {
                            final SubLObject other_value = second(other_tuple);
                            if (((NIL == el_unary_formula_p(other_value)) || (!unit.equal(cycl_utilities.formula_operator(other_value)))) || (!cycl_utilities.formula_arg1(other_value, UNPROVIDED).isNumber())) {
                                witness = other_value;
                            }
                            csome_list_var = csome_list_var.rest();
                            other_tuple = csome_list_var.first();
                        } 
                    }
                    return makeBoolean(NIL == list_utilities.sublisp_boolean(witness));
                }
            }
        }
        return NIL;
    }

    public static SubLObject nsimplify_numeric_quantification_tuple_quantity_value(final SubLObject tuple) {
        final SubLObject quantity = second(tuple);
        final SubLObject number = cycl_utilities.formula_arg1(quantity, UNPROVIDED);
        set_nth(ONE_INTEGER, tuple, number);
        return tuple;
    }

    public static SubLObject cyc_sort(final SubLObject v_set, final SubLObject compare_pred, final SubLObject function) {
        return cyc_sort_item_group(v_set, compare_pred, function, NIL);
    }

    public static SubLObject cyc_stable_sort(final SubLObject list, final SubLObject compare_pred, final SubLObject function) {
        return cyc_sort_item_group(list, compare_pred, function, T);
    }

    public static SubLObject cyc_sort_item_group(final SubLObject item_group, final SubLObject compare_pred, final SubLObject function, final SubLObject stableP) {
        if ((NIL == fort_types_interface.isa_predicateP(compare_pred, UNPROVIDED)) || (!TWO_INTEGER.eql(arity.arity(compare_pred)))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject tuples = numeric_quantification_item_value_tuples(item_group, function);
        final SubLObject sorted_tuples = cyc_sort_item_group_tuples(tuples, compare_pred, stableP);
        final SubLObject sorted_items = Mapping.mapcar(symbol_function(FIRST), sorted_tuples);
        return make_el_list(sorted_items, UNPROVIDED);
    }

    public static SubLObject cyc_sort_fn(final SubLObject v_set, final SubLObject comparison, final SubLObject function) {
        return cyc_sort(v_set, comparison, function);
    }

    public static SubLObject cyc_sort_item_group_tuples(SubLObject tuples, final SubLObject compare_pred, final SubLObject stableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $cyc_sort_compare_pred$.currentBinding(thread);
        try {
            $cyc_sort_compare_pred$.bind(compare_pred, thread);
            if (NIL != stableP) {
                tuples = copy_list(tuples);
            } else {
                tuples = kb_utilities.sort_terms(tuples, NIL, NIL, T, NIL, symbol_function(FIRST), UNPROVIDED);
            }
            tuples = Sort.stable_sort(tuples, $sym26$CYC_SORT__, symbol_function(SECOND));
        } finally {
            $cyc_sort_compare_pred$.rebind(_prev_bind_0, thread);
        }
        return tuples;
    }

    public static SubLObject cyc_sort_L(final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject comparision = $cyc_sort_compare_pred$.getDynamicValue(thread);
        return numeric_quantification_compare(comparision, term1, term2);
    }

    public static SubLObject numeric_quantification_compare(final SubLObject compare_pred, final SubLObject term1, final SubLObject term2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (compare_pred.eql($$greaterThan)) {
            return arithmetic.cyc_greater_than(term1, term2);
        }
        if (compare_pred.eql($$lessThan)) {
            return arithmetic.cyc_less_than(term1, term2);
        }
        final SubLObject sentence = make_binary_formula(compare_pred, term1, term2);
        if (NIL != relation_evaluation.evaluatable_predicateP(compare_pred, UNPROVIDED)) {
            return relation_evaluation.cyc_evaluate(sentence);
        }
        final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject inverse_sentence = make_binary_formula(compare_pred, term2, term1);
                final SubLObject compareL = numeric_quantification_compare_recursive_query(sentence, mt, UNPROVIDED);
                final SubLObject compareG = numeric_quantification_compare_recursive_query(inverse_sentence, mt, UNPROVIDED);
                if (((NIL != compareL) && (NIL == compareG)) || ((NIL == compareL) && (NIL != compareG))) {
                    return compareL;
                }
                return kb_utilities.term_L(term1, term2, T, UNPROVIDED, UNPROVIDED);
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject numeric_quantification_compare_recursive_query_internal(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        return ask_utilities.recursive_query(sentence, mt, query_properties);
    }

    public static SubLObject numeric_quantification_compare_recursive_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return numeric_quantification_compare_recursive_query_internal(sentence, mt, query_properties);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY, THREE_INTEGER, $int$8096, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(sentence, mt, query_properties);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (sentence.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (mt.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && query_properties.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(numeric_quantification_compare_recursive_query_internal(sentence, mt, query_properties)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(sentence, mt, query_properties));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject cyc_sort_set_via_bin_pred_fn(final SubLObject v_set, final SubLObject compare_pred) {
        return cyc_sort(v_set, compare_pred, $$IdentityFn);
    }

    public static SubLObject declare_numeric_quantification_file() {
        declareFunction(me, "numeric_evaluate_all_unary", "NUMERIC-EVALUATE-ALL-UNARY", 2, 0, false);
        declareFunction(me, "numeric_quantification_group_items", "NUMERIC-QUANTIFICATION-GROUP-ITEMS", 2, 0, false);
        declareFunction(me, "numeric_quantification_item_value_tuples", "NUMERIC-QUANTIFICATION-ITEM-VALUE-TUPLES", 2, 0, false);
        declareFunction(me, "numeric_quantification_item_values", "NUMERIC-QUANTIFICATION-ITEM-VALUES", 2, 0, false);
        declareFunction(me, "numeric_quantification_apply_function", "NUMERIC-QUANTIFICATION-APPLY-FUNCTION", 2, 0, false);
        declareFunction(me, "numeric_quantification_item_value_via_generalized_query", "NUMERIC-QUANTIFICATION-ITEM-VALUE-VIA-GENERALIZED-QUERY", 2, 0, false);
        declareFunction(me, "compute_possible_numeric_quantification_value_formula", "COMPUTE-POSSIBLE-NUMERIC-QUANTIFICATION-VALUE-FORMULA", 1, 0, false);
        declareFunction(me, "compute_possible_numeric_quantification_value_formula_memoized_internal", "COMPUTE-POSSIBLE-NUMERIC-QUANTIFICATION-VALUE-FORMULA-MEMOIZED-INTERNAL", 3, 0, false);
        declareFunction(me, "compute_possible_numeric_quantification_value_formula_memoized", "COMPUTE-POSSIBLE-NUMERIC-QUANTIFICATION-VALUE-FORMULA-MEMOIZED", 3, 0, false);
        declareFunction(me, "the_set_of_element_value_via_generalized_query", "THE-SET-OF-ELEMENT-VALUE-VIA-GENERALIZED-QUERY", 1, 2, false);
        declareFunction(me, "compute_the_set_of_element_to_numeric_quant_value_map_internal", "COMPUTE-THE-SET-OF-ELEMENT-TO-NUMERIC-QUANT-VALUE-MAP-INTERNAL", 2, 0, false);
        declareFunction(me, "compute_the_set_of_element_to_numeric_quant_value_map", "COMPUTE-THE-SET-OF-ELEMENT-TO-NUMERIC-QUANT-VALUE-MAP", 2, 0, false);
        declareFunction(me, "cyc_plus_all", "CYC-PLUS-ALL", 2, 0, false);
        declareFunction(me, "cyc_plus_all_internal", "CYC-PLUS-ALL-INTERNAL", 1, 0, false);
        declareFunction(me, "cyc_times_all", "CYC-TIMES-ALL", 2, 0, false);
        declareFunction(me, "cyc_maximum", "CYC-MAXIMUM", 2, 0, false);
        declareFunction(me, "cyc_minimum", "CYC-MINIMUM", 2, 0, false);
        declareFunction(me, "cyc_average", "CYC-AVERAGE", 2, 0, false);
        declareFunction(me, "cyc_median", "CYC-MEDIAN", 2, 0, false);
        declareFunction(me, "cyc_extreme_member", "CYC-EXTREME-MEMBER", 3, 0, false);
        declareFunction(me, "possibly_optimize_tuples_wrt_compare_pred", "POSSIBLY-OPTIMIZE-TUPLES-WRT-COMPARE-PRED", 2, 0, false);
        declareFunction(me, "tuple_values_all_are_simply_uniform_quantitiesP", "TUPLE-VALUES-ALL-ARE-SIMPLY-UNIFORM-QUANTITIES?", 1, 0, false);
        declareFunction(me, "nsimplify_numeric_quantification_tuple_quantity_value", "NSIMPLIFY-NUMERIC-QUANTIFICATION-TUPLE-QUANTITY-VALUE", 1, 0, false);
        declareFunction(me, "cyc_sort", "CYC-SORT", 3, 0, false);
        declareFunction(me, "cyc_stable_sort", "CYC-STABLE-SORT", 3, 0, false);
        declareFunction(me, "cyc_sort_item_group", "CYC-SORT-ITEM-GROUP", 4, 0, false);
        declareFunction(me, "cyc_sort_fn", "CYC-SORT-FN", 3, 0, false);
        declareFunction(me, "cyc_sort_item_group_tuples", "CYC-SORT-ITEM-GROUP-TUPLES", 3, 0, false);
        declareFunction(me, "cyc_sort_L", "CYC-SORT-<", 2, 0, false);
        declareFunction(me, "numeric_quantification_compare", "NUMERIC-QUANTIFICATION-COMPARE", 3, 0, false);
        declareFunction(me, "numeric_quantification_compare_recursive_query_internal", "NUMERIC-QUANTIFICATION-COMPARE-RECURSIVE-QUERY-INTERNAL", 1, 2, false);
        declareFunction(me, "numeric_quantification_compare_recursive_query", "NUMERIC-QUANTIFICATION-COMPARE-RECURSIVE-QUERY", 1, 2, false);
        declareFunction(me, "cyc_sort_set_via_bin_pred_fn", "CYC-SORT-SET-VIA-BIN-PRED-FN", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_numeric_quantification_file() {
        deflexical("*PARTIAL-NUMERIC-QUANTIFICATION*", T);
        defparameter("*NUMERIC-QUANTIFICATION-FUNCTION*", NIL);
        defparameter("*CYC-SORT-COMPARE-PRED*", NIL);
        return NIL;
    }

    public static SubLObject setup_numeric_quantification_file() {
        memoization_state.note_memoized_function(COMPUTE_POSSIBLE_NUMERIC_QUANTIFICATION_VALUE_FORMULA_MEMOIZED);
        memoization_state.note_memoized_function(COMPUTE_THE_SET_OF_ELEMENT_TO_NUMERIC_QUANT_VALUE_MAP);
        register_kb_function(CYC_PLUS_ALL);
        register_kb_function(CYC_TIMES_ALL);
        register_kb_function(CYC_MAXIMUM);
        register_kb_function(CYC_MINIMUM);
        register_kb_function(CYC_AVERAGE);
        register_kb_function(CYC_MEDIAN);
        register_kb_function(CYC_EXTREME_MEMBER);
        note_funcall_helper_function(NSIMPLIFY_NUMERIC_QUANTIFICATION_TUPLE_QUANTITY_VALUE);
        register_kb_function(CYC_SORT);
        register_kb_function(CYC_STABLE_SORT);
        define_obsolete_register(CYC_SORT_FN, $list25);
        note_funcall_helper_function($sym26$CYC_SORT__);
        memoization_state.note_memoized_function(NUMERIC_QUANTIFICATION_COMPARE_RECURSIVE_QUERY);
        register_kb_function(CYC_SORT_SET_VIA_BIN_PRED_FN);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_numeric_quantification_file();
    }

    @Override
    public void initializeVariables() {
        init_numeric_quantification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_numeric_quantification_file();
    }

    
}

