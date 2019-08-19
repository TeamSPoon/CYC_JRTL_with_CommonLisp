package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hl_storage_modules;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.sort_variants;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_rule_cascade extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_rule_cascade";
	public static String myFingerPrint = "324e66cf9f465ddafc373a1404059dac34b10b65081f2ffc7aab2b8a270a329f";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 1100L)
	private static SubLSymbol $default_first_implied_dependent_of_sentence_check_cost$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2000L)
	private static SubLSymbol $debug_first_implied_dependent_of_sentenceP$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2100L)
	private static SubLSymbol $cascade_rule_ordering_rule_pairs_for_sort$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2200L)
	private static SubLSymbol $cascade_rule_parent_rules_for_sort$;
	@SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2200L)
	private static SubLSymbol $cascade_rule_terminal_rules_for_sort$;
	private static SubLObject $const0$firstImpliedDependentOfSentence;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$REMOVAL_FIRST_IMPLIED_DEPENDENT_OF_SENTENCE_CHECK;
	private static SubLList $list3;
	private static SubLString $str4$first_implied_dependent_of_senten;
	private static SubLSymbol $sym5$QUEUE_P;
	private static SubLSymbol $kw$OPAQUE;
	private static SubLString $str7$first_implied_dependent_of_senten;
	private static SubLObject $const8$parentNodeOfCascade;
	private static SubLSymbol $kw$GAF;
	private static SubLObject $const10$terminalNodeOfCascade;
	private static SubLObject $const11$successorRulesInCascade;
	private static SubLSymbol $sym12$CASCADE_RULE__;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 2300L)
	public static SubLObject removal_first_implied_dependent_of_sentence_check_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject sentence = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject rule_cascade = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject rules = sorted_rules_in_cascade(rule_cascade);
		SubLObject asent_mt = arguments.support_mt(forward.current_forward_inference_gaf());
		if (NIL != $debug_first_implied_dependent_of_sentenceP$.getDynamicValue(thread)) {
			format_nil.force_format(T, $str4$first_implied_dependent_of_senten, Sequences.length(rules), rule_cascade,
					asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		SubLObject result_bindings = NIL;
		SubLObject result_mt = NIL;
		SubLObject deduction_spec_supports = NIL;
		SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$
				.currentBinding(thread);
		SubLObject _prev_bind_2 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
		SubLObject _prev_bind_3 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
		try {
			czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind(T, thread);
			kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
			control_vars.$prefer_forward_skolemization$.bind(NIL, thread);
			SubLObject environment = forward.get_forward_inference_environment();
			assert NIL != queues.queue_p(environment) : environment;
			SubLObject _prev_bind_0_$1 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
			SubLObject _prev_bind_1_$2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
			try {
				kb_control_vars.$forward_inference_environment$.bind(environment, thread);
				utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
				try {
					if (NIL == result_bindings) {
						SubLObject csome_list_var = rules;
						SubLObject rule = NIL;
						rule = csome_list_var.first();
						while ((NIL == result_bindings) && (NIL != csome_list_var)) {
							SubLObject assertibles_queue = forward
									.forward_propagate_one_support_wrt_rule_and_generate_assertibles_cached(
											arguments.make_hl_support($kw$OPAQUE, sentence, asent_mt, UNPROVIDED),
											rule);
							SubLObject rest;
							SubLObject hl_assertible_var;
							SubLObject assertible;
							SubLObject argument_spec;
							SubLObject hl_assertion_spec_var_$3;
							SubLObject hl_assertion_spec_var;
							SubLObject cnf;
							SubLObject mt;
							SubLObject direction;
							SubLObject variable_map;
							SubLObject possible_result_bindings;
							SubLObject deduction_spec;
							SubLObject deduction_spec_bindings;
							for (rest = NIL, rest = queues.do_queue_elements_queue_elements(
									assertibles_queue); (NIL == result_bindings) && (NIL != rest); rest = rest.rest()) {
								assertible = (hl_assertible_var = rest.first());
								argument_spec = hl_storage_modules.hl_assertible_argument_spec(hl_assertible_var);
								hl_assertion_spec_var = (hl_assertion_spec_var_$3 = hl_storage_modules
										.hl_assertible_hl_assertion_spec(hl_assertible_var));
								cnf = hl_storage_modules.hl_assertion_spec_cnf(hl_assertion_spec_var_$3);
								mt = hl_storage_modules.hl_assertion_spec_mt(hl_assertion_spec_var_$3);
								direction = hl_storage_modules.hl_assertion_spec_direction(hl_assertion_spec_var_$3);
								variable_map = hl_storage_modules
										.hl_assertion_spec_variable_map(hl_assertion_spec_var_$3);
								possible_result_bindings = unification_utilities.term_unify(arg2,
										uncanonicalizer.cnf_el_formula(cnf, UNPROVIDED, UNPROVIDED), UNPROVIDED,
										UNPROVIDED);
								if (NIL != possible_result_bindings) {
									result_bindings = possible_result_bindings;
									deduction_spec = (NIL != deductions_high.deduction_spec_p(argument_spec))
											? argument_spec
											: NIL;
									deduction_spec_bindings = (NIL != deductions_high.deduction_spec_p(deduction_spec))
											? deductions_high.deduction_spec_bindings(deduction_spec)
											: NIL;
									result_mt = mt;
									deduction_spec_supports = (NIL != deductions_high.deduction_spec_p(deduction_spec))
											? deductions_high.deduction_spec_supports(deduction_spec)
											: NIL;
								}
							}
							csome_list_var = csome_list_var.rest();
							rule = csome_list_var.first();
						}
					}
				} finally {
					SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind(T, thread);
						SubLObject _values = Values.getValuesAsVector();
						forward.clear_current_forward_problem_store();
						Values.restoreValuesFromVector(_values);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
					}
				}
			} finally {
				utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_$2, thread);
				kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$1, thread);
			}
		} finally {
			control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_3, thread);
			kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_2, thread);
			czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind(_prev_bind_0, thread);
		}
		if (NIL != result_bindings) {
			SubLObject result_asent = bindings.apply_bindings(result_bindings, arg2);
			if (NIL != $debug_first_implied_dependent_of_sentenceP$.getDynamicValue(thread)) {
				format_nil.force_format(T, $str7$first_implied_dependent_of_senten, result_asent, UNPROVIDED,
						UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			backward.removal_add_node(
					arguments.make_hl_support($kw$OPAQUE,
							el_utilities.make_ternary_formula($const0$firstImpliedDependentOfSentence, sentence,
									result_asent, rule_cascade),
							UNPROVIDED, UNPROVIDED),
					result_bindings, deduction_spec_supports);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 4700L)
	public static SubLObject sorted_rules_in_cascade(SubLObject rule_cascade) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject rules = NIL;
		SubLObject _prev_bind_0 = $cascade_rule_ordering_rule_pairs_for_sort$.currentBinding(thread);
		SubLObject _prev_bind_2 = $cascade_rule_parent_rules_for_sort$.currentBinding(thread);
		SubLObject _prev_bind_3 = $cascade_rule_terminal_rules_for_sort$.currentBinding(thread);
		try {
			$cascade_rule_ordering_rule_pairs_for_sort$.bind(NIL, thread);
			$cascade_rule_parent_rules_for_sort$.bind(NIL, thread);
			$cascade_rule_terminal_rules_for_sort$.bind(NIL, thread);
			SubLObject pred_var = $const8$parentNodeOfCascade;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cascade, TWO_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cascade,
						TWO_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var,
							token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw$GAF,
									NIL, NIL);
							SubLObject done_var_$5 = NIL;
							SubLObject token_var_$6 = NIL;
							while (NIL == done_var_$5) {
								SubLObject gaf = iteration
										.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$6);
								SubLObject valid_$7 = makeBoolean(!token_var_$6.eql(gaf));
								if (NIL != valid_$7) {
									SubLObject item_var = assertions_high.gaf_arg1(gaf);
									if (NIL == conses_high.member(item_var, rules, Symbols.symbol_function(EQL),
											Symbols.symbol_function(IDENTITY))) {
										rules = cons(item_var, rules);
									}
									item_var = assertions_high.gaf_arg1(gaf);
									if (NIL == conses_high.member(item_var,
											$cascade_rule_parent_rules_for_sort$.getDynamicValue(thread),
											Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
										$cascade_rule_parent_rules_for_sort$.setDynamicValue(
												cons(item_var,
														$cascade_rule_parent_rules_for_sort$.getDynamicValue(thread)),
												thread);
									}
								}
								done_var_$5 = makeBoolean(NIL == valid_$7);
							}
						} finally {
							SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
							}
						}
					}
					done_var = makeBoolean(NIL == valid);
				}
			}
			pred_var = $const10$terminalNodeOfCascade;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cascade, TWO_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cascade,
						TWO_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var,
							token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw$GAF,
									NIL, NIL);
							SubLObject done_var_$6 = NIL;
							SubLObject token_var_$7 = NIL;
							while (NIL == done_var_$6) {
								SubLObject gaf = iteration
										.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
								SubLObject valid_$8 = makeBoolean(!token_var_$7.eql(gaf));
								if (NIL != valid_$8) {
									SubLObject item_var = assertions_high.gaf_arg1(gaf);
									if (NIL == conses_high.member(item_var, rules, Symbols.symbol_function(EQL),
											Symbols.symbol_function(IDENTITY))) {
										rules = cons(item_var, rules);
									}
									item_var = assertions_high.gaf_arg1(gaf);
									if (NIL == conses_high.member(item_var,
											$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread),
											Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
										$cascade_rule_terminal_rules_for_sort$.setDynamicValue(
												cons(item_var,
														$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread)),
												thread);
									}
								}
								done_var_$6 = makeBoolean(NIL == valid_$8);
							}
						} finally {
							SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values2 = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values2);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
							}
						}
					}
					done_var = makeBoolean(NIL == valid);
				}
			}
			pred_var = $const11$successorRulesInCascade;
			if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(rule_cascade, ONE_INTEGER, pred_var)) {
				SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(rule_cascade,
						ONE_INTEGER, pred_var);
				SubLObject done_var = NIL;
				SubLObject token_var = NIL;
				while (NIL == done_var) {
					SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var,
							token_var);
					SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
					if (NIL != valid) {
						SubLObject final_index_iterator = NIL;
						try {
							final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw$GAF,
									NIL, NIL);
							SubLObject done_var_$7 = NIL;
							SubLObject token_var_$8 = NIL;
							while (NIL == done_var_$7) {
								SubLObject gaf = iteration
										.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
								SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(gaf));
								if (NIL != valid_$9) {
									SubLObject item_var = assertions_high.gaf_arg2(gaf);
									if (NIL == conses_high.member(item_var, rules, Symbols.symbol_function(EQL),
											Symbols.symbol_function(IDENTITY))) {
										rules = cons(item_var, rules);
									}
									item_var = assertions_high.gaf_arg3(gaf);
									if (NIL == conses_high.member(item_var, rules, Symbols.symbol_function(EQL),
											Symbols.symbol_function(IDENTITY))) {
										rules = cons(item_var, rules);
									}
									item_var = list(assertions_high.gaf_arg2(gaf), assertions_high.gaf_arg3(gaf));
									if (NIL == conses_high.member(item_var,
											$cascade_rule_ordering_rule_pairs_for_sort$.getDynamicValue(thread),
											Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
										$cascade_rule_ordering_rule_pairs_for_sort$.setDynamicValue(cons(item_var,
												$cascade_rule_ordering_rule_pairs_for_sort$.getDynamicValue(thread)),
												thread);
									}
								}
								done_var_$7 = makeBoolean(NIL == valid_$9);
							}
						} finally {
							SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$
									.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values3 = Values.getValuesAsVector();
								if (NIL != final_index_iterator) {
									kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
								}
								Values.restoreValuesFromVector(_values3);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
							}
						}
					}
					done_var = makeBoolean(NIL == valid);
				}
			}
			rules = sort_variants.merge_sort_list(rules, $sym12$CASCADE_RULE__, UNPROVIDED);
		} finally {
			$cascade_rule_terminal_rules_for_sort$.rebind(_prev_bind_3, thread);
			$cascade_rule_parent_rules_for_sort$.rebind(_prev_bind_2, thread);
			$cascade_rule_ordering_rule_pairs_for_sort$.rebind(_prev_bind_0, thread);
		}
		return rules;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-rule-cascade.lisp", position = 5600L)
	public static SubLObject cascade_rule_L(SubLObject rule1, SubLObject rule2) {
		SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != subl_promotions.memberP(list(rule1, rule2),
				$cascade_rule_ordering_rule_pairs_for_sort$.getDynamicValue(thread), Symbols.symbol_function(EQUAL),
				UNPROVIDED))
			return T;
		if (NIL != subl_promotions.memberP(list(rule2, rule1),
				$cascade_rule_ordering_rule_pairs_for_sort$.getDynamicValue(thread), Symbols.symbol_function(EQUAL),
				UNPROVIDED))
			return NIL;
		if ((NIL != subl_promotions.memberP(rule1, $cascade_rule_parent_rules_for_sort$.getDynamicValue(thread),
				UNPROVIDED, UNPROVIDED))
				&& (NIL == subl_promotions.memberP(rule2, $cascade_rule_parent_rules_for_sort$.getDynamicValue(thread),
						UNPROVIDED, UNPROVIDED)))
			return T;
		if ((NIL != subl_promotions.memberP(rule2, $cascade_rule_parent_rules_for_sort$.getDynamicValue(thread),
				UNPROVIDED, UNPROVIDED))
				&& (NIL == subl_promotions.memberP(rule1, $cascade_rule_parent_rules_for_sort$.getDynamicValue(thread),
						UNPROVIDED, UNPROVIDED)))
			return NIL;
		if ((NIL != subl_promotions.memberP(rule1, $cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread),
				UNPROVIDED, UNPROVIDED))
				&& (NIL == subl_promotions.memberP(rule2,
						$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)))
			return NIL;
		if ((NIL != subl_promotions.memberP(rule2, $cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread),
				UNPROVIDED, UNPROVIDED))
				&& (NIL == subl_promotions.memberP(rule1,
						$cascade_rule_terminal_rules_for_sort$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)))
			return T;
		return NIL;
	}

	public static SubLObject declare_removal_modules_rule_cascade_file() {
		declareFunction(myName, "removal_first_implied_dependent_of_sentence_check_expand",
				"REMOVAL-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK-EXPAND", 1, 1, false);
		declareFunction(myName, "sorted_rules_in_cascade", "SORTED-RULES-IN-CASCADE", 1, 0, false);
		declareFunction(myName, "cascade_rule_L", "CASCADE-RULE-<", 2, 0, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_rule_cascade_file() {
		$default_first_implied_dependent_of_sentence_check_cost$ = defparameter(
				"*DEFAULT-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK-COST*",
				control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
		$debug_first_implied_dependent_of_sentenceP$ = SubLFiles
				.defparameter("*DEBUG-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE?*", NIL);
		$cascade_rule_ordering_rule_pairs_for_sort$ = SubLFiles
				.defparameter("*CASCADE-RULE-ORDERING-RULE-PAIRS-FOR-SORT*", NIL);
		$cascade_rule_parent_rules_for_sort$ = defparameter("*CASCADE-RULE-PARENT-RULES-FOR-SORT*", NIL);
		$cascade_rule_terminal_rules_for_sort$ = defparameter("*CASCADE-RULE-TERMINAL-RULES-FOR-SORT*", NIL);
		return NIL;
	}

	public static SubLObject setup_removal_modules_rule_cascade_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$firstImpliedDependentOfSentence);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$firstImpliedDependentOfSentence, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$firstImpliedDependentOfSentence, THREE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_FIRST_IMPLIED_DEPENDENT_OF_SENTENCE_CHECK, $list3);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_rule_cascade_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_rule_cascade_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_rule_cascade_file();
	}

	static {
		me = new removal_modules_rule_cascade();
		$default_first_implied_dependent_of_sentence_check_cost$ = null;
		$debug_first_implied_dependent_of_sentenceP$ = null;
		$cascade_rule_ordering_rule_pairs_for_sort$ = null;
		$cascade_rule_parent_rules_for_sort$ = null;
		$cascade_rule_terminal_rules_for_sort$ = null;
		$const0$firstImpliedDependentOfSentence = constant_handles
				.reader_make_constant_shell(makeString("firstImpliedDependentOfSentence"));
		$kw$POS = makeKeyword("POS");
		$kw$REMOVAL_FIRST_IMPLIED_DEPENDENT_OF_SENTENCE_CHECK = makeKeyword(
				"REMOVAL-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK");
		$list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("firstImpliedDependentOfSentence")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("firstImpliedDependentOfSentence")),
						makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-FIRST-IMPLIED-DEPENDENT-OF-SENTENCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$firstImpliedDependentOfSentence <fully-bound> <anything> <fully-bound>) by internally triggering the supplied rules, in order, using the fully bound sentence and returning a fully bound consequent setnence and stopping after the first success."),
				makeKeyword("EXAMPLE"), makeString(
						"(#$firstImpliedDependentOfSentence (#$stepObject (#$TheList 5 4 3 2 1)) ?RESULT #$ListSortingDemoRuleCascade)") });
		$str4$first_implied_dependent_of_senten = makeString(
				"first-implied-dependent-of-sentence has ~A rules in cascade ~S for ~S~%");
		$sym5$QUEUE_P = makeSymbol("QUEUE-P");
		$kw$OPAQUE = makeKeyword("OPAQUE");
		$str7$first_implied_dependent_of_senten = makeString("first-implied-dependent-of-sentence returning ~S~%");
		$const8$parentNodeOfCascade = constant_handles.reader_make_constant_shell(makeString("parentNodeOfCascade"));
		$kw$GAF = makeKeyword("GAF");
		$const10$terminalNodeOfCascade = constant_handles
				.reader_make_constant_shell(makeString("terminalNodeOfCascade"));
		$const11$successorRulesInCascade = constant_handles
				.reader_make_constant_shell(makeString("successorRulesInCascade"));
		$sym12$CASCADE_RULE__ = makeSymbol("CASCADE-RULE-<");
	}
}
/*
 *
 * Total time: 251 ms
 *
 */