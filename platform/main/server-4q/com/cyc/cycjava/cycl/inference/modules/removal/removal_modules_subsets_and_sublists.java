package com.cyc.cycjava.cycl.inference.modules.removal;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class removal_modules_subsets_and_sublists extends SubLTranslatedFile {
	public static SubLFile me;
	public static String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_subsets_and_sublists";
	public static String myFingerPrint = "7c4fb9e1736f45eda716013de32cf84984dc2f1ee3f8ddea7874401f52e43bb2";
	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 800L)
	private static SubLSymbol $default_list_has_max_sublist_meeting_condition_cost$;
	private static SubLObject $const0$listHasMaxSublistMeetingCondition;
	private static SubLSymbol $kw$POS;
	private static SubLSymbol $kw$REMOVAL_LIST_HAS_MAX_SUBLIST_MEETING_CONDITION;
	private static SubLList $list3;
	private static SubLSymbol $kw$EL_LIST_ARG_IS_NOT_AN_EL_LIST;
	private static SubLSymbol $kw$MIN_ARG_IS_NOT_A_POSITIVE_INTEGER;
	private static SubLSymbol $kw$MAX_ARG_IS_NOT_A_POSITIVE_INTEGER;
	private static SubLSymbol $kw$MAX_ARG_IS_NOT_GREATER_THAN_OR_EQUAL_TO_MIN_ARG;
	private static SubLObject $const8$Quote;
	private static SubLSymbol $kw$QUOTED_QUERY_ARG_IS_NOT_QUOTED;
	private static SubLSymbol $kw$QUERY_ARG_IS_NOT_AN_EL_FORMULA;
	private static SubLSymbol $kw$NO_OPEN_QUERY_VAR;
	private static SubLSymbol $kw$TOO_MANY_OPEN_QUERY_VARS;
	private static SubLSymbol $kw$OPAQUE;
	private static SubLObject $const14$resultOfSubstitutingTermsListForT;
	private static SubLSymbol $kw$REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA;
	private static SubLList $list16;
	private static SubLSymbol $sym17$EQUALS_EL_;
	private static SubLSymbol $sym18$TEST_REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA_E;
	private static SubLSymbol $kw$TEST;
	private static SubLSymbol $kw$OWNER;
	private static SubLSymbol $kw$CLASSES;
	private static SubLSymbol $kw$KB;
	private static SubLSymbol $kw$FULL;
	private static SubLSymbol $kw$WORKING_;
	private static SubLObject $list25;
	private static SubLObject $const26$resultOfSubstitutingListOfTermsLi;
	private static SubLSymbol $kw$REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFO;
	private static SubLList $list28;
	private static SubLSymbol $sym29$CATCH_ERROR_MESSAGE_HANDLER;
	private static SubLSymbol $sym30$TEST_REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLIS;
	private static SubLObject $list31;
	private static SubLObject $const32$maximalCompatibleListsFromList;
	private static SubLSymbol $sym33$EL_SET_ITEMS;
	private static SubLSymbol $sym34$EL_LIST_ITEMS;
	private static SubLSymbol $sym35$SETS_EQUAL_;
	private static SubLSymbol $kw$REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_CHECK_POS;
	private static SubLList $list37;
	private static SubLSymbol $kw$CODE;
	private static SubLObject $const39$UniversalVocabularyMt;
	private static SubLSymbol $kw$TRUE_MON;
	private static SubLSymbol $kw$REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_UNIFY_POS;
	private static SubLList $list42;
	private static SubLObject $const43$nthInList;
	private static SubLSymbol $kw$REMOVAL_NTHINLIST_UNIFY_POS;
	private static SubLList $list45;
	private static SubLObject $const46$numberOfOccurencesOfItemInList;
	private static SubLSymbol $kw$REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_UNIFY_POS;
	private static SubLList $list48;
	private static SubLSymbol $sym49$TEST_REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_EXPAND;
	private static SubLList $list50;

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 4200L)
	public static SubLObject removal_list_has_max_sublist_meeting_condition_expand(SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLObject max_sub_list_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject min_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject max_arg = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject el_list_arg = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		SubLObject quoted_query_arg = cycl_utilities.atomic_sentence_arg5(asent, UNPROVIDED);
		SubLObject query_arg = NIL;
		SubLObject open_query_var = NIL;
		if (NIL == el_utilities.el_list_p(el_list_arg))
			return Values.values(NIL, $kw$EL_LIST_ARG_IS_NOT_AN_EL_LIST);
		if (NIL == subl_promotions.positive_integer_p(min_arg))
			return Values.values($kw$MIN_ARG_IS_NOT_A_POSITIVE_INTEGER);
		if (NIL == subl_promotions.positive_integer_p(max_arg))
			return Values.values($kw$MAX_ARG_IS_NOT_A_POSITIVE_INTEGER);
		if (!max_arg.numGE(min_arg))
			return Values.values(NIL, $kw$MAX_ARG_IS_NOT_GREATER_THAN_OR_EQUAL_TO_MIN_ARG);
		if (NIL == el_utilities.el_formula_with_operator_p(quoted_query_arg, $const8$Quote))
			return Values.values(NIL, $kw$QUOTED_QUERY_ARG_IS_NOT_QUOTED);
		query_arg = cycl_utilities.el_formula_arg1(quoted_query_arg, UNPROVIDED);
		if (NIL == el_utilities.el_formula_p(query_arg))
			return Values.values(NIL, $kw$QUERY_ARG_IS_NOT_AN_EL_FORMULA);
		SubLObject open_query_vars = el_utilities.expression_free_variables(query_arg, UNPROVIDED);
		if (NIL == open_query_vars)
			return Values.values(NIL, $kw$NO_OPEN_QUERY_VAR);
		if (NIL == list_utilities.singletonP(open_query_vars))
			return Values.values(NIL, $kw$TOO_MANY_OPEN_QUERY_VARS);
		open_query_var = open_query_vars.first();
		SubLObject list_items = el_utilities.el_list_items(el_list_arg);
		SubLObject list_items_count = Sequences.length(list_items);
		SubLObject max_el_sublists;
		SubLObject sublist_length;
		SubLObject num_sublists_of_sublist_length;
		SubLObject n;
		SubLObject n_plus_sublist_length;
		SubLObject sublist;
		SubLObject el_sublist;
		SubLObject item_var;
		for (max_el_sublists = NIL, sublist_length = NIL, sublist_length = Numbers.min(max_arg,
				list_items_count); !sublist_length.numL(min_arg)
						&& (NIL == max_el_sublists); sublist_length = Numbers.subtract(sublist_length, ONE_INTEGER)) {
			for (num_sublists_of_sublist_length = Numbers.add(ONE_INTEGER,
					Numbers.subtract(list_items_count, sublist_length)), n = NIL, n = ZERO_INTEGER; n
							.numL(num_sublists_of_sublist_length); n = Numbers.add(n, ONE_INTEGER)) {
				n_plus_sublist_length = Numbers.add(n, sublist_length);
				sublist = Sequences.subseq(list_items, n, n_plus_sublist_length);
				el_sublist = el_utilities.make_el_list(sublist, UNPROVIDED);
				if (NIL != el_list_for_query_var_satisfies_queryP(el_sublist, open_query_var, query_arg)) {
					item_var = el_sublist;
					if (NIL == conses_high.member(item_var, max_el_sublists, Symbols.symbol_function(EQL),
							Symbols.symbol_function(IDENTITY))) {
						max_el_sublists = cons(item_var, max_el_sublists);
					}
				}
			}
		}
		if (NIL != max_el_sublists) {
			SubLObject cdolist_list_var = max_el_sublists;
			SubLObject max_el_sublist = NIL;
			max_el_sublist = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject v_bindings = unification_utilities.term_unify(max_sub_list_arg, max_el_sublist, UNPROVIDED,
						UNPROVIDED);
				if (NIL != v_bindings) {
					backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
							bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings,
							UNPROVIDED);
				}
				cdolist_list_var = cdolist_list_var.rest();
				max_el_sublist = cdolist_list_var.first();
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 6700L)
	public static SubLObject el_list_for_query_var_satisfies_queryP(SubLObject el_sublist, SubLObject open_query_var,
			SubLObject query_arg) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject query_sentence = cycl_utilities.expression_subst(el_sublist, open_query_var, query_arg, UNPROVIDED,
				UNPROVIDED);
		SubLObject query_properties = inference_trampolines.determine_sentence_recursive_query_properties(
				query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread));
		return ask_utilities.inference_recursive_query(query_sentence, mt_relevance_macros.$mt$.getDynamicValue(thread),
				query_properties);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 8900L)
	public static SubLObject removal_resultofsubstitutingtermslistfortermslistinformula_expand(SubLObject asent,
			SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
		SubLObject new_list_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject old_list_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject old_formula_arg = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject result_formula_arg = cycl_utilities.atomic_sentence_arg4(asent, UNPROVIDED);
		SubLObject result_asent = NIL;
		if (NIL != variables.not_fully_bound_p(result_formula_arg)) {
			SubLObject new_list = el_utilities.el_list_items(new_list_arg);
			SubLObject old_list = el_utilities.el_list_items(old_list_arg);
			thread.resetMultipleValues();
			SubLObject result_formula = list_utilities.list_subst_all_in_tree(new_list, old_list, old_formula_arg,
					$sym17$EQUALS_EL_);
			SubLObject replacedP = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if ((NIL != replacedP) && (NIL != wff.el_wfeP(result_formula, UNPROVIDED, UNPROVIDED))) {
				result_asent = el_utilities.make_quaternary_formula(pred, new_list_arg, old_list_arg, old_formula_arg,
						result_formula);
			}
		}
		if (NIL != result_asent) {
			SubLObject v_bindings = unification_utilities.term_unify(asent, result_asent, UNPROVIDED, UNPROVIDED);
			if (NIL != v_bindings) {
				backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
						bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings, UNPROVIDED);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 10000L)
	public static SubLObject test_removal_resultofsubstitutingtermslistfortermslistinformula_expand(SubLObject sentence,
			SubLObject mt, SubLObject query_properties) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (query_properties == UNPROVIDED) {
			query_properties = NIL;
		}
		return inference_kernel.new_cyc_query(sentence, mt, query_properties);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 18100L)
	public static SubLObject removal_resultofsubstitutinglistoftermslistforlistoftermslistinformula_expand(
			SubLObject asent, SubLObject sense) {
		if (sense == UNPROVIDED) {
			sense = NIL;
		}
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject pred = cycl_utilities.atomic_sentence_arg0(asent);
		SubLObject new_lists_arg = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject old_lists_arg = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject result_formula;
		SubLObject old_formula_arg = result_formula = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject result_asent = NIL;
		SubLObject failureP = NIL;
		SubLObject error_message = NIL;
		try {
			thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
			SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
			try {
				Errors.$error_handler$.bind($sym29$CATCH_ERROR_MESSAGE_HANDLER, thread);
				try {
					if (NIL == failureP) {
						SubLObject new_list_arg = NIL;
						SubLObject new_list_arg_$1 = NIL;
						SubLObject old_list_arg = NIL;
						SubLObject old_list_arg_$2 = NIL;
						new_list_arg = el_utilities.el_list_items(new_lists_arg);
						new_list_arg_$1 = new_list_arg.first();
						old_list_arg = el_utilities.el_list_items(old_lists_arg);
						old_list_arg_$2 = old_list_arg.first();
						while ((NIL == failureP) && ((NIL != old_list_arg) || (NIL != new_list_arg))) {
							SubLObject new_list = el_utilities.el_list_items(new_list_arg_$1);
							SubLObject old_list = el_utilities.el_list_items(old_list_arg_$2);
							thread.resetMultipleValues();
							SubLObject possible_result_formula = list_utilities.list_subst_all_in_tree(new_list,
									old_list, result_formula, $sym17$EQUALS_EL_);
							SubLObject replacedP = thread.secondMultipleValue();
							thread.resetMultipleValues();
							if ((NIL != replacedP)
									&& (NIL != wff.el_wfeP(possible_result_formula, UNPROVIDED, UNPROVIDED))) {
								result_formula = possible_result_formula;
							} else {
								failureP = T;
							}
							new_list_arg = new_list_arg.rest();
							new_list_arg_$1 = new_list_arg.first();
							old_list_arg = old_list_arg.rest();
							old_list_arg_$2 = old_list_arg.first();
						}
					}
				} catch (Throwable catch_var) {
					Errors.handleThrowable(catch_var, NIL);
				}
			} finally {
				Errors.$error_handler$.rebind(_prev_bind_0, thread);
			}
		} catch (Throwable ccatch_env_var) {
			error_message = Errors.handleThrowable(ccatch_env_var,
					subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
		} finally {
			thread.throwStack.pop();
		}
		if ((NIL == failureP) && (NIL == error_message)) {
			result_asent = el_utilities.make_quaternary_formula(pred, new_lists_arg, old_lists_arg, old_formula_arg,
					result_formula);
			if (NIL != result_asent) {
				SubLObject v_bindings = unification_utilities.term_unify(asent, result_asent, UNPROVIDED, UNPROVIDED);
				if (NIL != v_bindings) {
					backward.removal_add_node(arguments.make_hl_support($kw$OPAQUE,
							bindings.apply_bindings(v_bindings, asent), UNPROVIDED, UNPROVIDED), v_bindings,
							UNPROVIDED);
				}
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 19500L)
	public static SubLObject test_removal_resultofsubstitutinglistoftermslistforlistoftermslistinformula_expand(
			SubLObject sentence, SubLObject mt, SubLObject query_properties) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (query_properties == UNPROVIDED) {
			query_properties = NIL;
		}
		return inference_kernel.new_cyc_query(sentence, mt, query_properties);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 26700L)
	public static SubLObject extract_lists_from_el_set_of_sets(SubLObject el_set) {
		SubLObject el_sets = el_utilities.el_set_items(el_set);
		return Mapping.mapcar(Symbols.symbol_function($sym33$EL_SET_ITEMS), el_sets);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 26800L)
	public static SubLObject extract_lists_from_el_set_of_lists(SubLObject el_set) {
		SubLObject el_lists = el_utilities.el_set_items(el_set);
		return Mapping.mapcar(Symbols.symbol_function($sym34$EL_LIST_ITEMS), el_lists);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 27000L)
	public static SubLObject removal_maximal_compatible_lists_from_list_pos_check(SubLObject input_el_list,
			SubLObject incompatible_el_pairs, SubLObject maximal_el_list) {
		SubLObject input_list = el_utilities.el_list_items(input_el_list);
		SubLObject incompatible_pairs = extract_lists_from_el_set_of_sets(incompatible_el_pairs);
		SubLObject maximal_list = el_utilities.el_list_items(maximal_el_list);
		return Sequences.find(maximal_list,
				list_utilities.compute_all_compatible_sublists(input_list, incompatible_pairs, UNPROVIDED, UNPROVIDED),
				Symbols.symbol_function($sym35$SETS_EQUAL_), UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 29000L)
	public static SubLObject removal_maximal_compatible_lists_from_list_unify_pos_expand(SubLObject asent,
			SubLObject sense) {
		SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
		SubLObject input_list = el_utilities.el_list_items(arg1);
		SubLObject incompatible_pairs = extract_lists_from_el_set_of_sets(arg2);
		SubLObject cdolist_list_var;
		SubLObject all_maximal_lists = cdolist_list_var = list_utilities.compute_all_compatible_sublists(input_list,
				incompatible_pairs, UNPROVIDED, UNPROVIDED);
		SubLObject maximal_list = NIL;
		maximal_list = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject v_bindings = unification_utilities.term_unify(arg3,
					el_utilities.make_el_list(maximal_list, UNPROVIDED), UNPROVIDED, UNPROVIDED);
			if (NIL != v_bindings) {
				SubLObject unify_arg3 = el_utilities.make_el_list(bindings.subst_bindings(v_bindings, arg3),
						UNPROVIDED);
				SubLObject formula = list($const32$maximalCompatibleListsFromList, arg1, arg2, unify_arg3);
				backward.removal_add_node(
						arguments.make_hl_support($kw$CODE, formula, $const39$UniversalVocabularyMt, $kw$TRUE_MON),
						v_bindings, UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			maximal_list = cdolist_list_var.first();
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 31600L)
	public static SubLObject removal_nthinlist_unify_pos_cost(SubLObject asent) {
		if ((NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)))
				&& (NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED))))
			return el_utilities.el_list_length(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
		return control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 31900L)
	public static SubLObject removal_nthinlist_unify_pos_expand(SubLObject asent, SubLObject sense) {
		SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject input_list = el_utilities.el_list_items(arg1);
		SubLObject list_var = NIL;
		SubLObject elem = NIL;
		SubLObject num = NIL;
		list_var = input_list;
		elem = list_var.first();
		for (num = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), elem = list_var.first(), num = Numbers
				.add(ONE_INTEGER, num)) {
			SubLObject fully_bound_asent = el_utilities.make_ternary_formula($const43$nthInList, arg1,
					Numbers.add(num, ONE_INTEGER), elem);
			SubLObject v_bindings = unification_utilities.term_unify(asent, fully_bound_asent, UNPROVIDED, UNPROVIDED);
			if (NIL != v_bindings) {
				backward.removal_add_node(
						arguments.make_hl_support($kw$OPAQUE, fully_bound_asent, UNPROVIDED, UNPROVIDED), v_bindings,
						UNPROVIDED);
			}
		}
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 33500L)
	public static SubLObject removal_numberofoccurencesofiteminlist_unify_pos_cost(SubLObject asent) {
		if ((NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED)))
				&& (NIL != variables.not_fully_bound_p(cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED))))
			return Sequences.length(Sequences.remove_duplicates(
					el_utilities.el_list_items(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)),
					Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
		return control_vars.$cheap_hl_module_check_cost$.getGlobalValue();
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 33800L)
	public static SubLObject removal_numberofoccurencesofiteminlist_unify_pos_expand(SubLObject asent,
			SubLObject sense) {
		SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
		SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
		SubLObject input_list = el_utilities.el_list_items(arg1);
		SubLObject count_dictionary = dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED);
		if (NIL != variables.fully_bound_p(arg2)) {
			SubLObject count = Sequences.count(arg2, input_list, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED,
					UNPROVIDED);
			dictionary.dictionary_enter(count_dictionary, arg2, count);
		} else {
			SubLObject cdolist_list_var = input_list;
			SubLObject elem = NIL;
			elem = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				dictionary_utilities.dictionary_increment(count_dictionary, elem, UNPROVIDED);
				cdolist_list_var = cdolist_list_var.rest();
				elem = cdolist_list_var.first();
			}
		}
		SubLObject iteration_state;
		for (iteration_state = dictionary_contents.do_dictionary_contents_state(
				dictionary.dictionary_contents(count_dictionary)); NIL == dictionary_contents
						.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents
								.do_dictionary_contents_next(iteration_state)) {
			thread.resetMultipleValues();
			SubLObject elem = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject count2 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			SubLObject fully_bound_asent = el_utilities.make_ternary_formula($const46$numberOfOccurencesOfItemInList,
					arg1, elem, count2);
			SubLObject v_bindings = unification_utilities.term_unify(asent, fully_bound_asent, UNPROVIDED, UNPROVIDED);
			if (NIL != v_bindings) {
				backward.removal_add_node(
						arguments.make_hl_support($kw$OPAQUE, fully_bound_asent, UNPROVIDED, UNPROVIDED), v_bindings,
						UNPROVIDED);
			}
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return NIL;
	}

	@SubL(source = "cycl/inference/modules/removal/removal-modules-subsets-and-sublists.lisp", position = 34700L)
	public static SubLObject test_removal_numberofoccurencesofiteminlist_expand(SubLObject sentence, SubLObject mt,
			SubLObject query_properties) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (query_properties == UNPROVIDED) {
			query_properties = NIL;
		}
		SubLObject v_answer = inference_kernel.new_cyc_query(sentence, mt, query_properties);
		if (NIL != cyc_kernel.closed_query_success_token_p(v_answer))
			return T;
		if (NIL != bindings.bindings_p(v_answer))
			return bindings.bindings_values(v_answer.first()).first();
		return NIL;
	}

	public static SubLObject declare_removal_modules_subsets_and_sublists_file() {
		declareFunction(myName, "removal_list_has_max_sublist_meeting_condition_expand",
				"REMOVAL-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-EXPAND", 1, 1, false);
		declareFunction(myName, "el_list_for_query_var_satisfies_queryP", "EL-LIST-FOR-QUERY-VAR-SATISFIES-QUERY?", 3,
				0, false);
		declareFunction(myName, "removal_resultofsubstitutingtermslistfortermslistinformula_expand",
				"REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA-EXPAND", 1, 1, false);
		declareFunction(myName, "test_removal_resultofsubstitutingtermslistfortermslistinformula_expand",
				"TEST-REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA-EXPAND", 1, 2, false);
		declareFunction(myName, "removal_resultofsubstitutinglistoftermslistforlistoftermslistinformula_expand",
				"REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA-EXPAND", 1, 1, false);
		declareFunction(me, "test_removal_resultofsubstitutinglistoftermslistforlistoftermslistinformula_expand",
				"TEST-REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA-EXPAND", 1, 2, false);
		declareFunction(myName, "extract_lists_from_el_set_of_sets", "EXTRACT-LISTS-FROM-EL-SET-OF-SETS", 1, 0, false);
		declareFunction(myName, "extract_lists_from_el_set_of_lists", "EXTRACT-LISTS-FROM-EL-SET-OF-LISTS", 1, 0,
				false);
		declareFunction(myName, "removal_maximal_compatible_lists_from_list_pos_check",
				"REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-POS-CHECK", 3, 0, false);
		declareFunction(myName, "removal_maximal_compatible_lists_from_list_unify_pos_expand",
				"REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-UNIFY-POS-EXPAND", 2, 0, false);
		declareFunction(myName, "removal_nthinlist_unify_pos_cost", "REMOVAL-NTHINLIST-UNIFY-POS-COST", 1, 0, false);
		declareFunction(myName, "removal_nthinlist_unify_pos_expand", "REMOVAL-NTHINLIST-UNIFY-POS-EXPAND", 2, 0,
				false);
		declareFunction(myName, "removal_numberofoccurencesofiteminlist_unify_pos_cost",
				"REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS-COST", 1, 0, false);
		declareFunction(myName, "removal_numberofoccurencesofiteminlist_unify_pos_expand",
				"REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS-EXPAND", 2, 0, false);
		declareFunction(myName, "test_removal_numberofoccurencesofiteminlist_expand",
				"TEST-REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-EXPAND", 1, 2, false);
		return NIL;
	}

	public static SubLObject init_removal_modules_subsets_and_sublists_file() {
		$default_list_has_max_sublist_meeting_condition_cost$ = defparameter(
				"*DEFAULT-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-COST*",
				Numbers.multiply(THREE_INTEGER, control_vars.$expensive_hl_module_check_cost$.getGlobalValue()));
		return NIL;
	}

	public static SubLObject setup_removal_modules_subsets_and_sublists_file() {
		inference_modules.register_solely_specific_removal_module_predicate($const0$listHasMaxSublistMeetingCondition);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$listHasMaxSublistMeetingCondition, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$listHasMaxSublistMeetingCondition,
				THREE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$listHasMaxSublistMeetingCondition, FOUR_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const0$listHasMaxSublistMeetingCondition, FIVE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_LIST_HAS_MAX_SUBLIST_MEETING_CONDITION, $list3);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const14$resultOfSubstitutingTermsListForT, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const14$resultOfSubstitutingTermsListForT, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const14$resultOfSubstitutingTermsListForT,
				THREE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA,
				$list16);
		generic_testing.define_test_case_table_int(
				$sym18$TEST_REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA_E,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$FULL, $kw$WORKING_, T }),
				$list25);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const26$resultOfSubstitutingListOfTermsLi, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const26$resultOfSubstitutingListOfTermsLi, TWO_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const26$resultOfSubstitutingListOfTermsLi,
				THREE_INTEGER);
		inference_modules.inference_removal_module(
				$kw$REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFO, $list28);
		generic_testing.define_test_case_table_int(
				$sym30$TEST_REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLIS,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$FULL, $kw$WORKING_, T }),
				$list31);
		inference_modules.register_solely_specific_removal_module_predicate($const32$maximalCompatibleListsFromList);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const32$maximalCompatibleListsFromList, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const32$maximalCompatibleListsFromList, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_CHECK_POS, $list37);
		inference_modules.register_solely_specific_removal_module_predicate($const32$maximalCompatibleListsFromList);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const32$maximalCompatibleListsFromList, ONE_INTEGER);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const32$maximalCompatibleListsFromList, TWO_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_UNIFY_POS, $list42);
		inference_modules.register_solely_specific_removal_module_predicate($const43$nthInList);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const43$nthInList, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_NTHINLIST_UNIFY_POS, $list45);
		inference_modules.register_solely_specific_removal_module_predicate($const46$numberOfOccurencesOfItemInList);
		preference_modules.doomed_unless_arg_bindable($kw$POS, $const46$numberOfOccurencesOfItemInList, ONE_INTEGER);
		inference_modules.inference_removal_module($kw$REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_UNIFY_POS, $list48);
		generic_testing.define_test_case_table_int($sym49$TEST_REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_EXPAND,
				list(new SubLObject[] { $kw$TEST, Symbols.symbol_function(EQUAL), $kw$OWNER, NIL, $kw$CLASSES, NIL,
						$kw$KB, $kw$FULL, $kw$WORKING_, T }),
				$list50);
		return NIL;
	}

	private static SubLObject _constant_25_initializer() {
		return ConsesLow.list(new SubLObject[] {
				list(ConsesLow.list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								TWO_INTEGER, THREE_INTEGER),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						ConsesLow.list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								TWO_INTEGER, THREE_INTEGER, makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), SEVEN_INTEGER,
								EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("B"),
								makeString("C")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						constant_handles.reader_make_constant_shell(makeString("TheEmptyList")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("B"),
								makeString("C")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("b"),
								makeString("c")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("B"),
								makeString("C")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("b"), makeString("c"), makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("b"),
								makeString("c")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))), NIL),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FOURTEEN_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										NINE_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										NINE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("x"))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FOURTEEN_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("x")))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								ConsesLow.list(
										constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												TEN_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x")))),
						ConsesLow.list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												NINE_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("x"))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								ConsesLow.list(
										constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												NINE_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("x"))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												TEN_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												ZERO_INTEGER))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												makeInteger(220))),
								constant_handles.reader_make_constant_shell(makeString("InfixMinusFn")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												makeInteger(220)))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												makeInteger(220))),
								constant_handles.reader_make_constant_shell(makeString("InfixMinusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												makeInteger(220))),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								ConsesLow.list(
										constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												THREE_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x")))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												ZERO_INTEGER)),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												THREE_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						constant_handles.reader_make_constant_shell(makeString("TheEmptyList")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												makeInteger(220))),
								constant_handles.reader_make_constant_shell(makeString("InfixMinusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												makeInteger(220))),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn"))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												makeInteger(220))),
								constant_handles.reader_make_constant_shell(makeString("InfixMinusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("Volt")),
												makeInteger(220))),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								ConsesLow.list(
										constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												THREE_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x")))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												THREE_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										SIX_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(
												makeString("SimpleFractionFn")), makeInteger(102), SEVENTEEN_INTEGER))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										SEVEN_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												list(constant_handles
														.reader_make_constant_shell(makeString("SimpleFractionFn")),
														makeInteger(102), SEVENTEEN_INTEGER)))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										SEVEN_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												SIX_INTEGER)))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles
												.reader_make_constant_shell(makeString("SimpleFractionFn")),
												makeInteger(102), SEVENTEEN_INTEGER))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										SIX_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										SEVEN_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								ConsesLow.list(
										constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												SIX_INTEGER))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										SEVEN_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												list(constant_handles
														.reader_make_constant_shell(makeString("SimpleFractionFn")),
														makeInteger(102), SEVENTEEN_INTEGER))))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("SimpleFractionFn")), EIGHT_INTEGER, SIX_INTEGER)),
										constant_handles.reader_make_constant_shell(makeString("InfixMinusFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												list(constant_handles
														.reader_make_constant_shell(makeString("SimpleFractionFn")),
														THREE_INTEGER, SIX_INTEGER))))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("SimpleFractionFn")), FOUR_INTEGER, THREE_INTEGER)),
										constant_handles.reader_make_constant_shell(makeString("InfixMinusFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("SimpleFractionFn")), ONE_INTEGER, TWO_INTEGER))))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										TWO_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(constant_handles
												.reader_make_constant_shell(makeString("MathExpressionFn")),
												list(constant_handles
														.reader_make_constant_shell(makeString("MathQuantFn")),
														list(constant_handles.reader_make_constant_shell(
																makeString("SimpleFractionFn")), FOUR_INTEGER,
																THREE_INTEGER)),
												constant_handles.reader_make_constant_shell(makeString("InfixMinusFn")),
												list(constant_handles
														.reader_make_constant_shell(makeString("MathQuantFn")),
														list(constant_handles.reader_make_constant_shell(
																makeString("SimpleFractionFn")), ONE_INTEGER,
																TWO_INTEGER))))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										TWO_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(constant_handles
												.reader_make_constant_shell(makeString("MathExpressionFn")),
												list(constant_handles
														.reader_make_constant_shell(makeString("MathQuantFn")),
														list(constant_handles.reader_make_constant_shell(
																makeString("SimpleFractionFn")), EIGHT_INTEGER,
																SIX_INTEGER)),
												constant_handles.reader_make_constant_shell(makeString("InfixMinusFn")),
												list(constant_handles
														.reader_make_constant_shell(makeString("MathQuantFn")),
														list(constant_handles.reader_make_constant_shell(
																makeString("SimpleFractionFn")), THREE_INTEGER,
																SIX_INTEGER)))))))) });
	}

	private static SubLObject _constant_31_initializer() {
		return ConsesLow.list(new SubLObject[] { list(list(list(
				constant_handles.reader_make_constant_shell(
						makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
				list(constant_handles.reader_make_constant_shell(makeString("TheList")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								TWO_INTEGER, THREE_INTEGER),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("SOME")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("COOL"),
								makeString("BEANS"))),
				list(constant_handles.reader_make_constant_shell(makeString("TheList")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								TWO_INTEGER),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), THREE_INTEGER,
								makeString("D"))),
				list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
						makeString("B"), makeString("C"), makeString("D")),
				makeSymbol("?WHAT"))),
				ConsesLow.list(list(
						list(makeSymbol("?WHAT"), constant_handles.reader_make_constant_shell(makeString("TheList")),
								makeString("SOME"), makeString("COOL"), makeString("BEANS"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
										TWO_INTEGER, THREE_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("A"), makeString("B"), makeString("C"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						list(ConsesLow.list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								TWO_INTEGER, THREE_INTEGER, makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("A"), makeString("B"), makeString("C"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
										TWO_INTEGER, THREE_INTEGER),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), NINE_INTEGER,
										EIGHT_INTEGER, SEVEN_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("A"), makeString("B"), makeString("C")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("D"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						ConsesLow.list(ConsesLow.list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								TWO_INTEGER, THREE_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER)))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
										TWO_INTEGER, THREE_INTEGER),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), NINE_INTEGER,
										EIGHT_INTEGER, SEVEN_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("A"), makeString("B")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), THREE_INTEGER,
										makeString("C"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						ConsesLow.list(ConsesLow.list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
								TWO_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), NINE_INTEGER,
										EIGHT_INTEGER, SEVEN_INTEGER),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
										TWO_INTEGER, THREE_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), THREE_INTEGER,
										makeString("C")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("A"), makeString("B"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))), NIL),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), SEVEN_INTEGER,
										EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("B"), makeString("C"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								constant_handles.reader_make_constant_shell(makeString("TheEmptyList"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("B"), makeString("C"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						ConsesLow.list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("b"), makeString("c"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("B"), makeString("C"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))),
						ConsesLow.list(ConsesLow.list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("b"), makeString("c"), makeString("D"))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), ONE_INTEGER,
										TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										makeString("b"), makeString("c"))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), makeString("A"),
								makeString("B"), makeString("C"), makeString("D")),
						makeSymbol("?WHAT"))), NIL),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FOURTEEN_INTEGER))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										NINE_INTEGER))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										NINE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("x"))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FOURTEEN_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("x")))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(
												makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER))),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										ConsesLow.list(
												constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												THREE_INTEGER),
										constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("SimpleFractionFn")), TWO_INTEGER, SEVEN_INTEGER)))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												FIVE_INTEGER, THREE_INTEGER, SEVEN_INTEGER))),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
										constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												THREE_INTEGER, TWO_INTEGER, SEVEN_INTEGER)))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												FIVE_INTEGER, THREE_INTEGER, SEVEN_INTEGER)),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
												THREE_INTEGER, TWO_INTEGER, SEVEN_INTEGER)),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(
												makeString("SimpleFractionFn")), TWO_INTEGER, SEVEN_INTEGER))),
						makeSymbol("?WHAT"))),
						list(list(list(new SubLObject[] { makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(
												makeString("SimpleFractionFn")), THREE_INTEGER, SEVEN_INTEGER)),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										THREE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(
												makeString("SimpleFractionFn")), TWO_INTEGER, SEVEN_INTEGER)),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										list(constant_handles.reader_make_constant_shell(
												makeString("SimpleFractionFn")), TWO_INTEGER, SEVEN_INTEGER)) })))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												TEN_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))))),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												NINE_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("x")))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								ConsesLow.list(
										constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												NINE_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("x"))),
						makeSymbol("?WHAT"))),
						list(list(list(makeSymbol("?WHAT"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										FIVE_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												TEN_INTEGER),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("x"))))))),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
						constant_handles.reader_make_constant_shell(makeString("TheEmptyList")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												FOUR_INTEGER),
										constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("y")))),
						list(constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										THREE_INTEGER),
								list(constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(constant_handles
												.reader_make_constant_shell(makeString("MathExpressionFn")),
												ConsesLow.list(constant_handles.reader_make_constant_shell(
														makeString("MathQuantFn")), FOUR_INTEGER),
												constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathVarFn")), makeString("y"))))),
						makeSymbol("?X"))), NIL),
				list(list(list(
						constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										makeInteger(35))),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												makeInteger(310))),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
												makeInteger(510)))),
						ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("TheList")), list(
								constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("a")),
								constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
								ConsesLow.list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
										makeString("b"))),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("a")),
										constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										ConsesLow.list(
												constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("c"))),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										list(constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("b")),
										constant_handles.reader_make_constant_shell(makeString("ImplicitTimesFn")),
										ConsesLow.list(
												constant_handles.reader_make_constant_shell(makeString("MathVarFn")),
												makeString("c")))),
						list(constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										TWO_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixTimesFn")),
								list(constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(new SubLObject[] {
												constant_handles
														.reader_make_constant_shell(makeString("MathExpressionFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathVarFn")), makeString("a")),
												constant_handles
														.reader_make_constant_shell(makeString("ImplicitTimesFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathVarFn")), makeString("b")),
												constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathVarFn")), makeString("b")),
												constant_handles
														.reader_make_constant_shell(makeString("ImplicitTimesFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathVarFn")), makeString("c")),
												constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathVarFn")), makeString("a")),
												constant_handles
														.reader_make_constant_shell(makeString("ImplicitTimesFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathVarFn")), makeString("c")) }))),
						makeSymbol("?NEW-EXP"))),
						list(list(list(makeSymbol("?NEW-EXP"),
								constant_handles.reader_make_constant_shell(makeString("MathExpressionFn")),
								list(constant_handles.reader_make_constant_shell(makeString("MathQuantFn")),
										TWO_INTEGER),
								constant_handles.reader_make_constant_shell(makeString("InfixTimesFn")),
								ConsesLow.list(
										constant_handles.reader_make_constant_shell(makeString("ParenthesizedMathFn")),
										list(constant_handles
												.reader_make_constant_shell(makeString("MathExpressionFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathQuantFn")), makeInteger(35)),
												constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathQuantFn")), makeInteger(510)),
												constant_handles.reader_make_constant_shell(makeString("InfixPlusFn")),
												list(constant_handles.reader_make_constant_shell(
														makeString("MathQuantFn")), makeInteger(310)))))))) });
	}

	@Override
	public void declareFunctions() {
		declare_removal_modules_subsets_and_sublists_file();
	}

	@Override
	public void initializeVariables() {
		init_removal_modules_subsets_and_sublists_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_removal_modules_subsets_and_sublists_file();
	}

	static {
		me = new removal_modules_subsets_and_sublists();
		$default_list_has_max_sublist_meeting_condition_cost$ = null;
		$const0$listHasMaxSublistMeetingCondition = constant_handles
				.reader_make_constant_shell(makeString("listHasMaxSublistMeetingCondition"));
		$kw$POS = makeKeyword("POS");
		$kw$REMOVAL_LIST_HAS_MAX_SUBLIST_MEETING_CONDITION = makeKeyword(
				"REMOVAL-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION");
		$list3 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("listHasMaxSublistMeetingCondition")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("listHasMaxSublistMeetingCondition")),
						makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
						makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-COST*"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-LIST-HAS-MAX-SUBLIST-MEETING-CONDITION-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$listHasMaxSublistMeetingCondition MAX-SUB-LIST LIST MIN MAX QUERY) means that MAX-SUB-LIST is the maximum-length sublist of LIST that meets the following conditons:\n\n(1) LIST is at least MIN elements long and no more than MAX elements long, \n\n(2) QUERY is a quoted sentence with exactly one open variable, and if MAX-SUB-LIST is substituted for that open variable and QUERY is asked, QUERY returns true."),
				makeKeyword("EXAMPLE"), makeString(
						"(listHasMaxSublistMeetingCondition\n ?MAX-SUBLIST\n 3\n 20\n (TheList\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 210136175693834520)\n   (DayFn 24\n\t  (MonthFn March\n\t\t   (YearFn 2012))) 90)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 618868380208131720)\n   (DayFn 2\n\t  (MonthFn May\n\t\t   (YearFn 2010))) 180)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 645495858520049520)\n   (DayFn 22\n\t  (MonthFn February\n\t\t   (YearFn 2010))) 180)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 388339025870429520)\n   (DayFn 21\n\t  (MonthFn February\n\t\t   (YearFn 2010))) 180)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 210136175693834520)\n   (DayFn 24\n\t  (MonthFn January\n\t\t   (YearFn 2010))) 180)\n  (TheList\n   (SchemaObjectFn CycRxClaimMapping 210136175693834520)\n   (DayFn 24\n\t  (MonthFn January\n\t\t   (YearFn 2009))) 90))\n\n (thereExists ?SUPPLY-SUM\n  (thereExists ?SUPPLY-LIST\n   (thereExists ?DATE-LIST\n    (thereExists ?EARLIEST-DATE\n     (thereExists ?LATEST-DATE\n      (thereExists ?LATEST-SUPPLY\n       (thereExists ?END-OF-SUPPLY-DATE\n        (thereExists ?ELAPSED-TIME\n\t (and\n\t  (greaterThanOrEqualTo ?SUPPLY-SUM 181) \n\t  (evaluate ?SUPPLY-LIST (MapFunctionOverList ThirdInListFn  ?LIST))\n\t  (evaluate ?SUPPLY-SUM (ApplyFunctionRecursivelyFn\n\t\t\t\t (RestOfListFn ?SUPPLY-LIST)\n\t\t\t\t (NthInListFn ?SUPPLY-LIST 1) PlusFn))\n\t  (evaluate ?DATE-LIST (MapFunctionOverList SecondInListFn ?LIST))\n\t  (evaluate ?EARLIEST-DATE (LastInListFn ?DATE-LIST))\n\t  (evaluate ?LATEST-DATE   (FirstInListFn ?DATE-LIST))\n\t  (evaluate ?LATEST-SUPPLY (FirstInListFn ?SUPPLY-LIST))\n\t  (evaluate ?END-OF-SUPPLY-DATE (DateAfterFn ?LATEST-DATE (DaysDuration ?LATEST-SUPPLY)))\n\t  (evaluate ?ELAPSED-TIME (TimeElapsedFn ?EARLIEST-DATE ?END-OF-SUPPLY-DATE))\n\t  (greaterThanOrEqualTo ?ELAPSED-TIME (DaysDuration 181))\n\t  (greaterThanOrEqualTo (DaysDuration ?SUPPLY-SUM) ?ELAPSED-TIME)))))))))))") });
		$kw$EL_LIST_ARG_IS_NOT_AN_EL_LIST = makeKeyword("EL-LIST-ARG-IS-NOT-AN-EL-LIST");
		$kw$MIN_ARG_IS_NOT_A_POSITIVE_INTEGER = makeKeyword("MIN-ARG-IS-NOT-A-POSITIVE-INTEGER");
		$kw$MAX_ARG_IS_NOT_A_POSITIVE_INTEGER = makeKeyword("MAX-ARG-IS-NOT-A-POSITIVE-INTEGER");
		$kw$MAX_ARG_IS_NOT_GREATER_THAN_OR_EQUAL_TO_MIN_ARG = makeKeyword(
				"MAX-ARG-IS-NOT-GREATER-THAN-OR-EQUAL-TO-MIN-ARG");
		$const8$Quote = constant_handles.reader_make_constant_shell(makeString("Quote"));
		$kw$QUOTED_QUERY_ARG_IS_NOT_QUOTED = makeKeyword("QUOTED-QUERY-ARG-IS-NOT-QUOTED");
		$kw$QUERY_ARG_IS_NOT_AN_EL_FORMULA = makeKeyword("QUERY-ARG-IS-NOT-AN-EL-FORMULA");
		$kw$NO_OPEN_QUERY_VAR = makeKeyword("NO-OPEN-QUERY-VAR");
		$kw$TOO_MANY_OPEN_QUERY_VARS = makeKeyword("TOO-MANY-OPEN-QUERY-VARS");
		$kw$OPAQUE = makeKeyword("OPAQUE");
		$const14$resultOfSubstitutingTermsListForT = constant_handles
				.reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula"));
		$kw$REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA = makeKeyword(
				"REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA");
		$list16 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles
						.reader_make_constant_shell(makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
				makeKeyword("REQUIRED-PATTERN"),
				list(makeKeyword("OR"),
						list(constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingTermsListForTermsListInFormula")),
								makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
								makeKeyword("ANYTHING"))),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$resultOfSubstitutingTermsListForTermsListInFormula <anything> <fully-bound-p> <fully-bound-p> <fully-bound-p>)\n(#$resultOfSubstitutingTermsListForTermsListInFormula <fully-bound-p> <anything> <fully-bound-p> <fully-bound-p>)\n(#$resultOfSubstitutingTermsListForTermsListInFormula <fully-bound-p> <fully-bound-p> <anything> <fully-bound-p>)\n(#$resultOfSubstitutingTermsListForTermsListInFormula <fully-bound-p> <fully-bound-p> <fully-bound-p> <anything>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$resultOfSubstitutingTermsListForTermsListInFormula\n       (#$TheList 1 2 3)\n       (#$TheList \"A\" \"B\" \"C\")\n       (#$TheList \"A\" \"B\" \"C\" \"D\")\n       ?WHAT)") });
		$sym17$EQUALS_EL_ = makeSymbol("EQUALS-EL?");
		$sym18$TEST_REMOVAL_RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA_E = makeSymbol(
				"TEST-REMOVAL-RESULTOFSUBSTITUTINGTERMSLISTFORTERMSLISTINFORMULA-EXPAND");
		$kw$TEST = makeKeyword("TEST");
		$kw$OWNER = makeKeyword("OWNER");
		$kw$CLASSES = makeKeyword("CLASSES");
		$kw$KB = makeKeyword("KB");
		$kw$FULL = makeKeyword("FULL");
		$kw$WORKING_ = makeKeyword("WORKING?");
		$list25 = _constant_25_initializer();
		$const26$resultOfSubstitutingListOfTermsLi = constant_handles.reader_make_constant_shell(
				makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula"));
		$kw$REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFO = makeKeyword(
				"REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA");
		$list28 = ConsesLow.list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(
						makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
				makeKeyword("REQUIRED-PATTERN"),
				list(makeKeyword("OR"),
						list(constant_handles.reader_make_constant_shell(
								makeString("resultOfSubstitutingListOfTermsListForListOfTermsListInFormula")),
								makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"),
								makeKeyword("ANYTHING"))),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-MATH-MODULE-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA-EXPAND"),
				makeKeyword("DOCUMENTATION"),
				makeString(
						"(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula <anything> <fully-bound-p> <fully-bound-p> <fully-bound-p>)\n(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula <fully-bound-p> <anything> <fully-bound-p> <fully-bound-p>)\n(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula <fully-bound-p> <fully-bound-p> <anything> <fully-bound-p>)\n(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula <fully-bound-p> <fully-bound-p> <fully-bound-p> <anything>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$resultOfSubstitutingListOfTermsListForListOfTermsListInFormula\n       (#$TheList (#$TheList 1 2 3))\n       (#$TheList (#$TheList \"A\" \"B\" \"C\"))\n       (#$TheList \"A\" \"B\" \"C\" \"D\") ?WHAT)\n       ?WHAT)") });
		$sym29$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
		$sym30$TEST_REMOVAL_RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLIS = makeSymbol(
				"TEST-REMOVAL-RESULTOFSUBSTITUTINGLISTOFTERMSLISTFORLISTOFTERMSLISTINFORMULA-EXPAND");
		$list31 = _constant_31_initializer();
		$const32$maximalCompatibleListsFromList = constant_handles
				.reader_make_constant_shell(makeString("maximalCompatibleListsFromList"));
		$sym33$EL_SET_ITEMS = makeSymbol("EL-SET-ITEMS");
		$sym34$EL_LIST_ITEMS = makeSymbol("EL-LIST-ITEMS");
		$sym35$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");
		$kw$REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_CHECK_POS = makeKeyword(
				"REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-CHECK-POS");
		$list37 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("maximalCompatibleListsFromList")),
				makeKeyword("CHECK"), T, makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("maximalCompatibleListsFromList")),
						cons(constant_handles.reader_make_constant_shell(makeString("TheList")),
								makeKeyword("FULLY-BOUND")),
						cons(constant_handles.reader_make_constant_shell(makeString("TheSet")),
								makeKeyword("FULLY-BOUND")),
						cons(constant_handles.reader_make_constant_shell(makeString("TheList")),
								makeKeyword("FULLY-BOUND"))),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"),
				list(makeKeyword("TEMPLATE"),
						list(constant_handles.reader_make_constant_shell(makeString("maximalCompatibleListsFromList")),
								list(makeKeyword("BIND"), makeSymbol("INPUT-LIST")),
								list(makeKeyword("BIND"), makeSymbol("INCOMPATIBLE-PAIRS")),
								list(makeKeyword("BIND"), makeSymbol("MAXIMAL-LIST"))),
						list(list(makeKeyword("VALUE"), makeSymbol("INPUT-LIST")),
								list(makeKeyword("VALUE"), makeSymbol("INCOMPATIBLE-PAIRS")),
								list(makeKeyword("VALUE"), makeSymbol("MAXIMAL-LIST")))),
				makeKeyword("OUTPUT-CHECK-PATTERN"),
				list(makeKeyword("CALL"), makeSymbol("REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-POS-CHECK"),
						list(makeKeyword("VALUE"), makeSymbol("INPUT-LIST")),
						list(makeKeyword("VALUE"), makeSymbol("INCOMPATIBLE-PAIRS")),
						list(makeKeyword("VALUE"), makeSymbol("MAXIMAL-LIST"))),
				makeKeyword("DOCUMENTATION"),
				makeString("(#$maximalCompatibleListsFromList <fully-bound> <fully-bound> <fully-bound>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$maximalCompatibleListsFromList\n  (#$TheList 0 1 2 3)\n  (#$TheSet\n    (#$TheSet 0 1)(#$TheSet 1 2)(#$TheSet 2 0)\n    (#$TheSet 0 3)(#$TheSet 1 3)(#$TheSet 2 3))\n  (#$TheList 2))") });
		$kw$CODE = makeKeyword("CODE");
		$const39$UniversalVocabularyMt = constant_handles
				.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
		$kw$TRUE_MON = makeKeyword("TRUE-MON");
		$kw$REMOVAL_MAXIMAL_COMPATIBLE_LISTS_FROM_LIST_UNIFY_POS = makeKeyword(
				"REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-UNIFY-POS");
		$list42 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("maximalCompatibleListsFromList")),
				makeKeyword("REQUIRED-PATTERN"),
				list(constant_handles.reader_make_constant_shell(makeString("maximalCompatibleListsFromList")),
						cons(constant_handles.reader_make_constant_shell(makeString("TheList")),
								makeKeyword("FULLY-BOUND")),
						cons(constant_handles.reader_make_constant_shell(makeString("TheSet")),
								makeKeyword("FULLY-BOUND")),
						makeKeyword("NOT-FULLY-BOUND")),
				makeKeyword("COST-EXPRESSION"), makeSymbol("*CHEAP-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-MAXIMAL-COMPATIBLE-LISTS-FROM-LIST-UNIFY-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString("(#$maximalCompatibleListsFromList <fully-bound> <fully-bound> <not-fully-bound>)"),
				makeKeyword("EXAMPLE"), makeString(
						"(#$maximalCompatibleListsFromList\n      (#$TheList 1 2 \"II\" 3 \"three\" 4)\n      (#$TheSet (#$TheSet 2 \"II\") (#$TheSet 3 \"III\") (#$TheSet \"three\" \"III\"))\n      ?MAXIMAL-COMBINATIONS)\n    will bind ?MAXIMAL-COMBINATIONS to\n    (#$TheSet\n      (#$TheList 1 2 3 \"three\" 4)\n      (#$TheList 1 2 \"III\" 4)\n      (#$TheList 1 \"II\" 3 \"three\" 4)\n      (#$TheList 1 \"II\" \"III\" 4))") });
		$const43$nthInList = constant_handles.reader_make_constant_shell(makeString("nthInList"));
		$kw$REMOVAL_NTHINLIST_UNIFY_POS = makeKeyword("REMOVAL-NTHINLIST-UNIFY-POS");
		$list45 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("nthInList")), makeKeyword("REQUIRED-PATTERN"),
				list(makeKeyword("AND"),
						list(constant_handles.reader_make_constant_shell(makeString("nthInList")),
								makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
						listS(constant_handles.reader_make_constant_shell(makeString("nthInList")),
								list(makeKeyword("TEST"), makeSymbol("EL-LIST-P")), makeKeyword("ANYTHING"))),
				makeKeyword("COST"), makeSymbol("REMOVAL-NTHINLIST-UNIFY-POS-COST"), makeKeyword("COMPLETENESS"),
				makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NTHINLIST-UNIFY-POS-EXPAND"),
				makeKeyword("DOCUMENTATION"), makeString("(#$nthInList <fully-bound> <anything> <anything>)"),
				makeKeyword("EXAMPLE"), makeString("(#$nthInList (#$TheList 5 4 3 2 1) ?N ?ITEM)") });
		$const46$numberOfOccurencesOfItemInList = constant_handles
				.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList"));
		$kw$REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_UNIFY_POS = makeKeyword(
				"REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS");
		$list48 = list(new SubLObject[] { makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"),
				constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
				makeKeyword("REQUIRED-PATTERN"),
				list(makeKeyword("AND"),
						list(constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
								makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")),
						listS(constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
								list(makeKeyword("TEST"), makeSymbol("EL-LIST-P")), makeKeyword("ANYTHING"))),
				makeKeyword("COST"), makeSymbol("REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS-COST"),
				makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"),
				makeSymbol("REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-UNIFY-POS-EXPAND"), makeKeyword("DOCUMENTATION"),
				makeString("(#$numberOfOccurencesOfItemInList <fully-bound> <anything> <anything>)"),
				makeKeyword("EXAMPLE"),
				makeString("(#$numberOfOccurencesOfItemInList (#$TheList 5 4 3 2 1) ?ITEM ?N)") });
		$sym49$TEST_REMOVAL_NUMBEROFOCCURENCESOFITEMINLIST_EXPAND = makeSymbol(
				"TEST-REMOVAL-NUMBEROFOCCURENCESOFITEMINLIST-EXPAND");
		$list50 = list(
				list(list(list(
						constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
						list(new SubLObject[] { constant_handles.reader_make_constant_shell(makeString("TheList")),
								ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
								ONE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }),
						ONE_INTEGER, makeSymbol("?N"))), FOUR_INTEGER),
				list(list(list(
						constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
						list(new SubLObject[] { constant_handles.reader_make_constant_shell(makeString("TheList")),
								ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
								ONE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }),
						THREE_INTEGER, makeSymbol("?N"))), TWO_INTEGER),
				list(list(list(
						constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
						list(new SubLObject[] { constant_handles.reader_make_constant_shell(makeString("TheList")),
								ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
								ONE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }),
						NINE_INTEGER, makeSymbol("?N"))), ZERO_INTEGER),
				list(list(list(
						constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
						list(new SubLObject[] { constant_handles.reader_make_constant_shell(makeString("TheList")),
								ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, ONE_INTEGER, FOUR_INTEGER, FIVE_INTEGER,
								ONE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }),
						SIX_INTEGER, makeSymbol("?N"))), ONE_INTEGER),
				list(list(
						list(constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
								list(constant_handles.reader_make_constant_shell(makeString("TheList")),
										constant_handles.reader_make_constant_shell(makeString("Dog")),
										constant_handles.reader_make_constant_shell(makeString("Cat")),
										constant_handles.reader_make_constant_shell(makeString("List")),
										list(constant_handles.reader_make_constant_shell(makeString("JuvenileFn")),
												constant_handles.reader_make_constant_shell(makeString("Dog")))),
								constant_handles.reader_make_constant_shell(makeString("Dog")), makeSymbol("?N"))),
						ONE_INTEGER),
				list(list(list(
						constant_handles.reader_make_constant_shell(makeString("numberOfOccurencesOfItemInList")),
						list(constant_handles.reader_make_constant_shell(makeString("TheList")),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										SEVEN_INTEGER, NINE_INTEGER),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										ONE_INTEGER, TWO_INTEGER),
								list(constant_handles.reader_make_constant_shell(makeString("MixedFractionFn")),
										THREE_INTEGER, FOUR_INTEGER, SEVEN_INTEGER),
								list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")),
										ONE_INTEGER, TWO_INTEGER)),
						list(constant_handles.reader_make_constant_shell(makeString("SimpleFractionFn")), ONE_INTEGER,
								TWO_INTEGER),
						makeSymbol("?N"))), TWO_INTEGER));
	}
}
/*
 *
 * Total time: 412 ms
 *
 */