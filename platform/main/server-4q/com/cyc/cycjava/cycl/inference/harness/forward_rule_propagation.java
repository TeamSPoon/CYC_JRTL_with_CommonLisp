package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.assertions_interface;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_hl_support_handles;
import com.cyc.cycjava.cycl.kb_hl_supports_high;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class forward_rule_propagation extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.harness.forward_rule_propagation";
	public static String myFingerPrint = "4645cb8f47c66914087d89fa25a4bad6224917b2991e9cdd25ec7882bcb9b431";
	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 3700L)
	public static SubLSymbol $forward_trigger_lazy_iteration_threshold$;
	private static SubLObject $const0$InferencePSC;
	private static SubLSymbol $sym1$RULE_ASSERTION_;
	private static SubLSymbol $sym2$NON_NEGATIVE_INTEGER_P;
	private static SubLString $str3$Triggering_rule_against__A__S_sup;
	private static SubLSymbol $sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
	private static SubLList $list5;
	private static SubLSymbol $sym6$CATCH_ERROR_MESSAGE_HANDLER;
	private static SubLSymbol $sym7$CSETQ;
	private static SubLString $str8$_A;
	private static SubLSymbol $sym9$ASSERTION_P;
	private static SubLSymbol $kw$FORWARD;
	private static SubLSymbol $sym11$QUEUE_P;
	private static SubLString $str12$time_to_use_a_real_query_iterator;
	private static SubLString $str13$Determining_trigger_GAFs_for_;
	private static SubLList $list14;
	private static SubLSymbol $sym15$NULL;
	private static SubLSymbol $sym16$FIRST_GAF_IN_SUPPORTS;
	private static SubLSymbol $sym17$KBEQ;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$ALL;
	private static SubLList $list20;
	private static SubLSymbol $kw$JOIN_ORDERED;
	private static SubLSymbol $sym22$TACTIC_HL_MODULE_NAME;
	private static SubLSymbol $kw$SPLIT;
	private static SubLString $str24$Can_t_determine_trigger_asent_for;
	private static SubLString $str25$Can_t_determine_trigger_asent_for;
	private static SubLString $str26$Can_t_create_inference_to_determi;
	private static SubLInteger $int27$100;
	private static SubLObject $const28$evaluate;
	private static SubLObject $const29$BaseKB;
	private static SubLSymbol $sym30$EQUALS_EL_;
	private static SubLSymbol $sym31$GAF_ASSERTION_;
	private static SubLSymbol $sym32$HL_SUPPORT_P;
	private static SubLSymbol $kw$ISA;
	private static SubLList $list34;

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 1300L)
	public static SubLObject forward_propagate_rule_via_trigger_gafs(SubLObject rule, SubLObject propagation_mt) {
		if (propagation_mt == UNPROVIDED) {
			propagation_mt = $const0$InferencePSC;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != assertions_high.rule_assertionP(rule) : rule;
		possibly_change_assertion_direction_to_forward_without_repropagation(rule);
		SubLObject rule_string = format_cycl_expression
				.format_cycl_expression_to_string(assertions_high.assertion_ist_formula(rule), UNPROVIDED);
		SubLObject before_dependents = assertions_high.assertion_dependent_count(rule);
		SubLObject sofar = ZERO_INTEGER;
		thread.resetMultipleValues();
		SubLObject iterator = new_forward_rule_trigger_gaf_iterator(rule, propagation_mt);
		SubLObject total = thread.secondMultipleValue();
		SubLObject focal_asent = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		assert NIL != subl_promotions.non_negative_integer_p(total) : total;
		SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
		try {
			utilities_macros.$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			utilities_macros.$last_percent_progress_prediction$.bind(NIL, thread);
			utilities_macros.$within_noting_percent_progress$.bind(T, thread);
			utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
			try {
				utilities_macros.noting_percent_progress_preamble(PrintLow.format(NIL,
						$str3$Triggering_rule_against__A__S_sup, new SubLObject[] { total, focal_asent, rule_string }));
				SubLObject valid;
				for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
					thread.resetMultipleValues();
					SubLObject trigger_gaf = iteration.iteration_next(iterator);
					valid = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != valid) {
						SubLObject message_var = NIL;
						SubLObject was_appendingP = Eval.eval($sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
						Eval.eval($list5);
						try {
							try {
								thread.throwStack
										.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
								SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding(thread);
								try {
									Errors.$error_handler$.bind($sym6$CATCH_ERROR_MESSAGE_HANDLER, thread);
									try {
										forward.repropagate_forward_gaf_wrt_rule(trigger_gaf, rule);
									} catch (Throwable catch_var) {
										Errors.handleThrowable(catch_var, NIL);
									}
								} finally {
									Errors.$error_handler$.rebind(_prev_bind_0_$1, thread);
								}
							} catch (Throwable ccatch_env_var) {
								message_var = Errors.handleThrowable(ccatch_env_var,
										subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
							} finally {
								thread.throwStack.pop();
							}
						} finally {
							SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values = Values.getValuesAsVector();
								Eval.eval(list($sym7$CSETQ, $sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__,
										was_appendingP));
								Values.restoreValuesFromVector(_values);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
							}
						}
						if (message_var.isString()) {
							Errors.warn($str8$_A, message_var);
						}
						sofar = Numbers.add(sofar, ONE_INTEGER);
						utilities_macros.note_percent_progress(sofar, total);
					}
				}
			} finally {
				SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					Threads.$is_thread_performing_cleanupP$.bind(T, thread);
					SubLObject _values2 = Values.getValuesAsVector();
					utilities_macros.noting_percent_progress_postamble();
					Values.restoreValuesFromVector(_values2);
				} finally {
					Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
				}
			}
		} finally {
			utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
			utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
			utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
			utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
		SubLObject after_dependents = assertions_high.assertion_dependent_count(rule);
		SubLObject new_dependents = Numbers.subtract(after_dependents, before_dependents);
		return Values.values(new_dependents, sofar);
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 2600L)
	public static SubLObject possibly_change_assertion_direction_to_forward_without_repropagation(
			SubLObject assertion) {
		assert NIL != assertion_handles.assertion_p(assertion) : assertion;
		if (NIL == assertions_high.forward_assertionP(assertion)) {
			assertions_interface.kb_set_assertion_direction(assertion, $kw$FORWARD);
			return assertions_high.forward_assertionP(assertion);
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 2900L)
	public static SubLObject repropagate_trigger_gaf_against_rule(SubLObject trigger_gaf, SubLObject rule) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		SubLObject _prev_bind_0 = forward.$forward_inference_shares_same_problem_storeP$.currentBinding(thread);
		try {
			forward.$forward_inference_shares_same_problem_storeP$.bind(NIL, thread);
			SubLObject environment = forward.get_forward_inference_environment();
			assert NIL != queues.queue_p(environment) : environment;
			SubLObject _prev_bind_0_$4 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
			SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
			try {
				kb_control_vars.$forward_inference_environment$.bind(environment, thread);
				utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
				try {
					result = forward.repropagate_forward_gaf_wrt_rule(trigger_gaf, rule);
				} finally {
					SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						Threads.$is_thread_performing_cleanupP$.bind(T, thread);
						SubLObject _values = Values.getValuesAsVector();
						forward.clear_current_forward_problem_store();
						Values.restoreValuesFromVector(_values);
					} finally {
						Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
					}
				}
			} finally {
				utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
				kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$4, thread);
			}
		} finally {
			forward.$forward_inference_shares_same_problem_storeP$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 3200L)
	public static SubLObject forward_rule_trigger_gafs(SubLObject rule, SubLObject propagation_mt) {
		if (propagation_mt == UNPROVIDED) {
			propagation_mt = $const0$InferencePSC;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != assertions_high.rule_assertionP(rule) : rule;
		thread.resetMultipleValues();
		SubLObject focal_asent = forward_rule_trigger_asent(rule, propagation_mt);
		SubLObject estimated_children = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != focal_asent)
			return forward_rule_trigger_gafs_int(focal_asent, propagation_mt);
		return NIL;
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 3900L)
	public static SubLObject new_forward_rule_trigger_gaf_iterator(SubLObject rule, SubLObject propagation_mt) {
		if (propagation_mt == UNPROVIDED) {
			propagation_mt = $const0$InferencePSC;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != assertions_high.rule_assertionP(rule) : rule;
		thread.resetMultipleValues();
		SubLObject focal_asent = forward_rule_trigger_asent(rule, propagation_mt);
		SubLObject estimated_children = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == focal_asent)
			return iteration.new_list_iterator(NIL);
		if (!$forward_trigger_lazy_iteration_threshold$.getGlobalValue().isNumber()
				|| estimated_children.numLE($forward_trigger_lazy_iteration_threshold$.getGlobalValue())) {
			SubLObject trigger_gafs = forward_rule_trigger_gafs_int(focal_asent, propagation_mt);
			return Values.values(iteration.new_list_iterator(trigger_gafs), Sequences.length(trigger_gafs),
					focal_asent);
		}
		return Errors.error($str12$time_to_use_a_real_query_iterator);
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 4600L)
	public static SubLObject forward_rule_trigger_gafs_int(SubLObject focal_asent, SubLObject propagation_mt) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject query_result = NIL;
		SubLObject trigger_gafs = NIL;
		SubLObject _prev_bind_0 = utilities_macros.$noting_progress_delayed_mode_seconds$.currentBinding(thread);
		SubLObject _prev_bind_2 = utilities_macros.$noting_progress_delayed_mode_string$.currentBinding(thread);
		try {
			utilities_macros.$noting_progress_delayed_mode_seconds$.bind(TWO_INTEGER, thread);
			utilities_macros.$noting_progress_delayed_mode_string$.bind(Sequences.cconcatenate(
					$str13$Determining_trigger_GAFs_for_, format_nil.format_nil_s_no_copy(focal_asent)), thread);
			SubLObject str = Sequences.cconcatenate($str13$Determining_trigger_GAFs_for_,
					format_nil.format_nil_s_no_copy(focal_asent));
			SubLObject _prev_bind_0_$6 = utilities_macros.$progress_start_time$.currentBinding(thread);
			SubLObject _prev_bind_1_$7 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
			SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$
					.currentBinding(thread);
			SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
			SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
			SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
			SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
			SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
			try {
				utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
				utilities_macros.$progress_last_pacification_time$
						.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
				utilities_macros.$progress_elapsed_seconds_for_notification$.bind(
						utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
				utilities_macros.$progress_notification_count$.bind(ZERO_INTEGER, thread);
				utilities_macros.$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
				utilities_macros.$progress_count$.bind(ZERO_INTEGER, thread);
				utilities_macros.$is_noting_progressP$.bind(T, thread);
				utilities_macros.$silent_progressP$
						.bind((NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : T, thread);
				utilities_macros.noting_progress_preamble(str);
				SubLObject environment = forward.get_forward_inference_environment();
				assert NIL != queues.queue_p(environment) : environment;
				SubLObject _prev_bind_0_$7 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
				SubLObject _prev_bind_1_$8 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
				try {
					kb_control_vars.$forward_inference_environment$.bind(environment, thread);
					utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
					try {
						SubLObject overriding_query_properties = $list14;
						SubLObject query_properties = forward.forward_inference_query_properties(clauses.empty_clause(),
								overriding_query_properties);
						query_result = inference_kernel.new_cyc_query(focal_asent, propagation_mt, query_properties);
					} finally {
						SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							Threads.$is_thread_performing_cleanupP$.bind(T, thread);
							SubLObject _values = Values.getValuesAsVector();
							forward.clear_current_forward_problem_store();
							Values.restoreValuesFromVector(_values);
						} finally {
							Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
						}
					}
				} finally {
					utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_$8, thread);
					kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$7, thread);
				}
				SubLObject raw_trigger_gafs = Sequences.remove_if($sym15$NULL,
						Mapping.mapcar(Symbols.symbol_function($sym16$FIRST_GAF_IN_SUPPORTS), query_result), UNPROVIDED,
						UNPROVIDED, UNPROVIDED, UNPROVIDED);
				trigger_gafs = assertion_utilities
						.sort_assertions(list_utilities.fast_delete_duplicates(raw_trigger_gafs,
								Symbols.symbol_function($sym17$KBEQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
				utilities_macros.noting_progress_postamble();
			} finally {
				utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
				utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
				utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
				utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
				utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
				utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
				utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$7, thread);
				utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$6, thread);
			}
		} finally {
			utilities_macros.$noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
			utilities_macros.$noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
		}
		return trigger_gafs;
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 5400L)
	public static SubLObject forward_rule_trigger_asent(SubLObject rule, SubLObject propagation_mt) {
		if (propagation_mt == UNPROVIDED) {
			propagation_mt = $const0$InferencePSC;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != assertions_high.rule_assertionP(rule) : rule;
		SubLObject cnf = assertions_high.assertion_cnf(rule);
		SubLObject neg_lits = clauses.neg_lits(cnf);
		SubLObject trigger_asent = NIL;
		SubLObject estimated_children = NIL;
		if (NIL != neg_lits) {
			if (NIL != list_utilities.singletonP(neg_lits)) {
				trigger_asent = neg_lits.first();
				estimated_children = inference_utilities.literal_removal_cost(trigger_asent, $kw$POS, propagation_mt,
						$kw$ALL);
			} else {
				SubLObject environment = forward.get_forward_inference_environment();
				assert NIL != queues.queue_p(environment) : environment;
				SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
				SubLObject _prev_bind_2 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
				try {
					kb_control_vars.$forward_inference_environment$.bind(environment, thread);
					utilities_macros.$current_forward_problem_store$.bind(NIL, thread);
					try {
						SubLObject query_dnf = clauses.make_dnf(NIL,
								obfuscate_non_trigger_literal_lits(neg_lits, rule, propagation_mt));
						SubLObject overriding_query_properties = $list20;
						SubLObject query_properties = forward.forward_inference_query_properties(clauses.empty_clause(),
								overriding_query_properties);
						SubLObject inference = NIL;
						try {
							inference = Values.nth_value_step_2(Values.nth_value_step_1(TWO_INTEGER), inference_kernel
									.new_cyc_query_from_dnf(query_dnf, propagation_mt, NIL, query_properties));
							if (NIL != inference) {
								SubLObject strategy = inference_datastructures_inference
										.simplest_inference_strategy(inference);
								SubLObject root_problem = inference_datastructures_inference
										.inference_root_problem(inference);
								SubLObject executed_tactics = inference_datastructures_problem
										.problem_executed_tactics(root_problem);
								SubLObject join_ordered_tactic = Sequences.find($kw$JOIN_ORDERED, executed_tactics,
										Symbols.symbol_function(EQ),
										Symbols.symbol_function($sym22$TACTIC_HL_MODULE_NAME), UNPROVIDED, UNPROVIDED);
								if (NIL != join_ordered_tactic) {
									SubLObject focal_problem = inference_worker_join_ordered
											.join_ordered_tactic_focal_problem(join_ordered_tactic);
									SubLObject productivity = inference_worker
											.simple_problem_estimated_total_global_productivity(focal_problem,
													strategy);
									trigger_asent = inference_datastructures_problem
											.single_literal_problem_atomic_sentence(focal_problem);
									estimated_children = inference_datastructures_enumerated_types
											.number_of_children_for_productivity(productivity);
								} else if (NIL != Sequences.find($kw$SPLIT, executed_tactics,
										Symbols.symbol_function(EQ),
										Symbols.symbol_function($sym22$TACTIC_HL_MODULE_NAME), UNPROVIDED,
										UNPROVIDED)) {
									Errors.warn($str24$Can_t_determine_trigger_asent_for, el_utilities.sefify(rule));
								} else {
									Errors.warn($str25$Can_t_determine_trigger_asent_for, el_utilities.sefify(rule));
								}
							} else {
								Errors.warn($str26$Can_t_create_inference_to_determi, el_utilities.sefify(rule));
							}
						} finally {
							SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$
									.currentBinding(thread);
							try {
								Threads.$is_thread_performing_cleanupP$.bind(T, thread);
								SubLObject _values = Values.getValuesAsVector();
								if (NIL != inference) {
								}
								Values.restoreValuesFromVector(_values);
							} finally {
								Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
							}
						}
					} finally {
						SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							Threads.$is_thread_performing_cleanupP$.bind(T, thread);
							SubLObject _values2 = Values.getValuesAsVector();
							forward.clear_current_forward_problem_store();
							Values.restoreValuesFromVector(_values2);
						} finally {
							Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
						}
					}
				} finally {
					utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_2, thread);
					kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
				}
			}
		}
		return Values.values(trigger_asent, estimated_children);
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 8100L)
	public static SubLObject obfuscate_non_trigger_literal_lits(SubLObject lits, SubLObject rule,
			SubLObject propagation_mt) {
		SubLObject non_trigger_literals = inference_worker_transformation.forward_rule_non_trigger_literals(rule,
				propagation_mt);
		SubLObject n = $int27$100;
		SubLObject result = NIL;
		SubLObject cdolist_list_var = lits;
		SubLObject lit = NIL;
		lit = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((NIL == kb_utilities.kbeq($const28$evaluate, el_utilities.literal_predicate(lit, UNPROVIDED)))
					&& ((NIL != kb_accessors.not_assertible_predicateP(el_utilities.literal_predicate(lit, UNPROVIDED),
							$const29$BaseKB))
							|| ((NIL != subl_promotions.memberP(lit, non_trigger_literals,
									Symbols.symbol_function($sym30$EQUALS_EL_), UNPROVIDED))
									&& (NIL == variables.variable_p(el_utilities.literal_arg0(lit, UNPROVIDED)))))) {
				result = cons(el_utilities.replace_formula_arg(ZERO_INTEGER, variables.get_variable(n), lit), result);
				n = Numbers.add(n, ONE_INTEGER);
			} else {
				result = cons(lit, result);
			}
			cdolist_list_var = cdolist_list_var.rest();
			lit = cdolist_list_var.first();
		}
		return Sequences.nreverse(result);
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 9000L)
	public static SubLObject forward_rule_initial_fanout(SubLObject rule, SubLObject propagation_mt) {
		if (propagation_mt == UNPROVIDED) {
			propagation_mt = $const0$InferencePSC;
		}
		return Values.nth_value_step_2(Values.nth_value_step_1(ONE_INTEGER),
				forward_rule_trigger_asent(rule, propagation_mt));
	}

	@SubL(source = "cycl/inference/harness/forward-rule-propagation.lisp", position = 9100L)
	public static SubLObject first_gaf_in_supports(SubLObject supports) {
		SubLObject result = Sequences.find_if(Symbols.symbol_function($sym31$GAF_ASSERTION_), supports, UNPROVIDED,
				UNPROVIDED, UNPROVIDED);
		if ((NIL == result) && (NIL != list_utilities.singletonP(supports))) {
			SubLObject justification = hl_supports.hl_justify(supports.first());
			if ((NIL != list_utilities.singletonP(justification))
					&& (NIL != assertions_high.gaf_assertionP(justification.first()))) {
				result = justification.first();
			}
		}
		if (NIL == result) {
			SubLObject v_hl_supports = list_utilities.find_all_if(Symbols.symbol_function($sym32$HL_SUPPORT_P),
					supports, UNPROVIDED);
			SubLObject isa_hl_supports = NIL;
			SubLObject cdolist_list_var = v_hl_supports;
			SubLObject hl_support = NIL;
			hl_support = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if ($kw$ISA == arguments.hl_support_module(hl_support)) {
					isa_hl_supports = cons(hl_support, isa_hl_supports);
				}
				cdolist_list_var = cdolist_list_var.rest();
				hl_support = cdolist_list_var.first();
			}
			if (NIL != list_utilities.singletonP(isa_hl_supports)) {
				SubLObject isa_hl_support = isa_hl_supports.first();
				SubLObject isa_assertions = NIL;
				SubLObject cdolist_list_var2 = (NIL != kb_hl_support_handles.kb_hl_support_p(isa_hl_support))
						? kb_hl_supports_high.kb_hl_support_justification(isa_hl_support)
						: hl_supports.hl_justify(isa_hl_support);
				SubLObject support = NIL;
				support = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2) {
					if (NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(support, $list34)) {
						isa_assertions = cons(support, isa_assertions);
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					support = cdolist_list_var2.first();
				}
				if (NIL != list_utilities.singletonP(isa_assertions)) {
					result = isa_assertions.first();
				}
			}
		}
		return result;
	}

	public static SubLObject declare_forward_rule_propagation_file() {
		declareFunction(myName, "forward_propagate_rule_via_trigger_gafs", "FORWARD-PROPAGATE-RULE-VIA-TRIGGER-GAFS", 1,
				1, false);
		declareFunction(myName, "possibly_change_assertion_direction_to_forward_without_repropagation",
				"POSSIBLY-CHANGE-ASSERTION-DIRECTION-TO-FORWARD-WITHOUT-REPROPAGATION", 1, 0, false);
		declareFunction(myName, "repropagate_trigger_gaf_against_rule", "REPROPAGATE-TRIGGER-GAF-AGAINST-RULE", 2, 0,
				false);
		declareFunction(myName, "forward_rule_trigger_gafs", "FORWARD-RULE-TRIGGER-GAFS", 1, 1, false);
		declareFunction(myName, "new_forward_rule_trigger_gaf_iterator", "NEW-FORWARD-RULE-TRIGGER-GAF-ITERATOR", 1, 1,
				false);
		declareFunction(myName, "forward_rule_trigger_gafs_int", "FORWARD-RULE-TRIGGER-GAFS-INT", 2, 0, false);
		declareFunction(myName, "forward_rule_trigger_asent", "FORWARD-RULE-TRIGGER-ASENT", 1, 1, false);
		declareFunction(myName, "obfuscate_non_trigger_literal_lits", "OBFUSCATE-NON-TRIGGER-LITERAL-LITS", 3, 0,
				false);
		declareFunction(myName, "forward_rule_initial_fanout", "FORWARD-RULE-INITIAL-FANOUT", 1, 1, false);
		declareFunction(myName, "first_gaf_in_supports", "FIRST-GAF-IN-SUPPORTS", 1, 0, false);
		return NIL;
	}

	public static SubLObject init_forward_rule_propagation_file() {
		$forward_trigger_lazy_iteration_threshold$ = deflexical("*FORWARD-TRIGGER-LAZY-ITERATION-THRESHOLD*", NIL);
		return NIL;
	}

	public static SubLObject setup_forward_rule_propagation_file() {
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_forward_rule_propagation_file();
	}

	@Override
	public void initializeVariables() {
		init_forward_rule_propagation_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_forward_rule_propagation_file();
	}

	static {
		me = new forward_rule_propagation();
		$forward_trigger_lazy_iteration_threshold$ = null;
		$const0$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
		$sym1$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
		$sym2$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
		$str3$Triggering_rule_against__A__S_sup = makeString("Triggering rule against ~A ~S support~:p: ~A");
		$sym4$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
		$list5 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);
		$sym6$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
		$sym7$CSETQ = makeSymbol("CSETQ");
		$str8$_A = makeString("~A");
		$sym9$ASSERTION_P = makeSymbol("ASSERTION-P");
		$kw$FORWARD = makeKeyword("FORWARD");
		$sym11$QUEUE_P = makeSymbol("QUEUE-P");
		$str12$time_to_use_a_real_query_iterator = makeString("time to use a real query iterator here");
		$str13$Determining_trigger_GAFs_for_ = makeString("Determining trigger GAFs for ");
		$list14 = list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("RETURN"),
				makeKeyword("SUPPORTS"));
		$sym15$NULL = makeSymbol("NULL");
		$sym16$FIRST_GAF_IN_SUPPORTS = makeSymbol("FIRST-GAF-IN-SUPPORTS");
		$sym17$KBEQ = makeSymbol("KBEQ");
		$kw$POS = makeKeyword("POS");
		$kw$ALL = makeKeyword("ALL");
		$list20 = list(makeKeyword("BROWSABLE?"), T, makeKeyword("MAX-STEP"), FIVE_INTEGER,
				makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ALLOWED-MODULES"),
				list(makeKeyword("NOT"),
						list(makeKeyword("OR"), list(makeKeyword("MODULE-TYPE"), makeKeyword("REMOVAL-CONJUNCTIVE")),
								makeKeyword("JOIN"), makeKeyword("REMOVAL-PRED-UNBOUND"))));
		$kw$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
		$sym22$TACTIC_HL_MODULE_NAME = makeSymbol("TACTIC-HL-MODULE-NAME");
		$kw$SPLIT = makeKeyword("SPLIT");
		$str24$Can_t_determine_trigger_asent_for = makeString(
				"Can't determine trigger asent for rule with split antecedent: ~S");
		$str25$Can_t_determine_trigger_asent_for = makeString("Can't determine trigger asent for rule: ~S");
		$str26$Can_t_create_inference_to_determi = makeString(
				"Can't create inference to determine trigger asent for rule: ~S");
		$int27$100 = makeInteger(100);
		$const28$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));
		$const29$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
		$sym30$EQUALS_EL_ = makeSymbol("EQUALS-EL?");
		$sym31$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
		$sym32$HL_SUPPORT_P = makeSymbol("HL-SUPPORT-P");
		$kw$ISA = makeKeyword("ISA");
		$list34 = list(constant_handles.reader_make_constant_shell(makeString("isa")),
				constant_handles.reader_make_constant_shell(makeString("quotedIsa")));
	}
}
/*
 *
 * Total time: 265 ms
 *
 */