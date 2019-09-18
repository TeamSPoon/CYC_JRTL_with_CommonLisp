package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_negative_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.log;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fifth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
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
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_strategic_heuristics extends SubLTranslatedFile {
	public static final SubLFile me = new inference_strategic_heuristics();

	public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics";

	public static final String myFingerPrint = "c0387fa31e81b3a4dd1dc6567799db9cc03916f4357d4eb5344acdf1f8898c4c";

	// deflexical
	private static final SubLSymbol $heuristic_domains$ = makeSymbol("*HEURISTIC-DOMAINS*");

	// defvar
	/**
	 * property-list-p; a plist of overriding scaling factors for heuristics. If any
	 * of these are specified, they override the declared scaling factors. The
	 * indicators are the heuristics, e.g. :occams-razor, and the values are
	 * integers.
	 */
	private static final SubLSymbol $overriding_strategic_heuristic_scaling_factors$ = makeSymbol("*OVERRIDING-STRATEGIC-HEURISTIC-SCALING-FACTORS*");

	// deflexical
	private static final SubLSymbol $strategic_heuristic_occams_razor_table$ = makeSymbol("*STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TABLE*");

	// deflexical
	private static final SubLSymbol $strategic_heuristic_occams_razor_table_default$ = makeSymbol("*STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TABLE-DEFAULT*");

	// defvar
	// Temporary control parameter
	private static final SubLSymbol $backtracking_considered_harmfulP$ = makeSymbol("*BACKTRACKING-CONSIDERED-HARMFUL?*");

	// deflexical
	private static final SubLSymbol $strategic_heuristic_backtracking_table$ = makeSymbol("*STRATEGIC-HEURISTIC-BACKTRACKING-TABLE*");

	// deflexical
	private static final SubLSymbol $strategic_heuristic_backtracking_table_default$ = makeSymbol("*STRATEGIC-HEURISTIC-BACKTRACKING-TABLE-DEFAULT*");

	// defvar
	private static final SubLSymbol $early_removal_productivity_threshold$ = makeSymbol("*EARLY-REMOVAL-PRODUCTIVITY-THRESHOLD*");

	// defparameter
	/**
	 * A set of problems that are currently being evaluated for relevance, to avoid
	 * infinite recursion.
	 */
	private static final SubLSymbol $heuristic_rule_a_priori_utility_problem_recursion_stack$ = makeSymbol("*HEURISTIC-RULE-A-PRIORI-UTILITY-PROBLEM-RECURSION-STACK*");

	// defvar
	/**
	 * When t, the Heuristic tactician will prefer problems which mention
	 * highlyRelevantTerms.
	 */
	public static final SubLSymbol $highly_relevant_term_enabledP$ = makeSymbol("*HIGHLY-RELEVANT-TERM-ENABLED?*");

	// defparameter
	private static final SubLSymbol $relevant_term_set$ = makeSymbol("*RELEVANT-TERM-SET*");

	// defparameter
	private static final SubLSymbol $irrelevant_term_set$ = makeSymbol("*IRRELEVANT-TERM-SET*");

	// defvar
	/**
	 * When non-nil, the Heuristic tactician will use rule historical utility as one
	 * of its heuristics.
	 */
	private static final SubLSymbol $strategic_heuristic_rule_historical_utility_enabledP$ = makeSymbol("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?*");

	// defparameter
	/**
	 * A set of problems that are currently being evaluated for
	 * rule-historical-utility, to avoid infinite recursion.
	 */
	private static final SubLSymbol $heuristic_rule_historical_utility_problem_recursion_stack$ = makeSymbol("*HEURISTIC-RULE-HISTORICAL-UTILITY-PROBLEM-RECURSION-STACK*");

	// defparameter
	private static final SubLSymbol $strategic_heuristic_rule_historical_connectedness_enabledP$ = makeSymbol("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS-ENABLED?*");

	// deflexical
	private static final SubLSymbol $strategic_heuristic_literal_count_lookup_table$ = makeSymbol("*STRATEGIC-HEURISTIC-LITERAL-COUNT-LOOKUP-TABLE*");

	// deflexical
	private static final SubLSymbol $strategic_heuristic_skolem_count_lookup_table$ = makeSymbol("*STRATEGIC-HEURISTIC-SKOLEM-COUNT-LOOKUP-TABLE*");

	// Internal Constants
	public static final SubLSymbol $strategic_heuristic_index$ = makeSymbol("*STRATEGIC-HEURISTIC-INDEX*");

	public static final SubLSymbol STRATEGIC_HEURISTIC_INDEX = makeSymbol("STRATEGIC-HEURISTIC-INDEX");

	public static final SubLSymbol DO_STRATEGIC_HEURISTICS = makeSymbol("DO-STRATEGIC-HEURISTICS");

	public static final SubLList $list3 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("&KEY"), makeSymbol("OBJECT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

	public static final SubLList $list4 = list(makeKeyword("OBJECT"), makeKeyword("DONE"));

	private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

	private static final SubLSymbol $sym8$DOMAIN = makeUninternedSymbol("DOMAIN");

	public static final SubLSymbol DO_DICTIONARY_KEYS = makeSymbol("DO-DICTIONARY-KEYS");

	public static final SubLList $list10 = list(makeSymbol("STRATEGIC-HEURISTIC-INDEX"));

	public static final SubLSymbol STRATEGIC_HEURISTIC_FUNCTION = makeSymbol("STRATEGIC-HEURISTIC-FUNCTION");

	public static final SubLSymbol STRATEGIC_HEURISTIC_SCALING_FACTOR = makeSymbol("STRATEGIC-HEURISTIC-SCALING-FACTOR");

	private static final SubLSymbol STRATEGIC_HEURISTIC_DOMAIN = makeSymbol("STRATEGIC-HEURISTIC-DOMAIN");

	public static final SubLSymbol DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P = makeSymbol("DO-STRATEGIC-HEURISTICS-TACTIC-MATCH-P");

	private static final SubLList $list17 = list(makeKeyword("PROBLEM"), makeKeyword("TACTIC"), makeKeyword("CONTENT-TACTIC"), makeKeyword("STRUCTURAL-TACTIC"), makeKeyword("CONNECTED-CONJUNCTION-TACTIC"), makeKeyword("GENERALIZED-REMOVAL-TACTIC"), makeKeyword("TRANSFORMATION-TACTIC"));

	private static final SubLSymbol $CONNECTED_CONJUNCTION_TACTIC = makeKeyword("CONNECTED-CONJUNCTION-TACTIC");

	private static final SubLSymbol $GENERALIZED_REMOVAL_TACTIC = makeKeyword("GENERALIZED-REMOVAL-TACTIC");

	private static final SubLString $str25$Unknown_heuristic_domain__s = makeString("Unknown heuristic domain ~s");

	private static final SubLList $list27 = list(makeSymbol("&KEY"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("PRETTY-NAME"), makeSymbol("COMMENT"), makeSymbol("DOMAIN"));

	private static final SubLList $list28 = list(makeKeyword("FUNCTION"), makeKeyword("SCALING-FACTOR"), makeKeyword("PRETTY-NAME"), makeKeyword("COMMENT"), makeKeyword("DOMAIN"));

	private static final SubLSymbol $SHALLOW_AND_CHEAP = makeKeyword("SHALLOW-AND-CHEAP");

	private static final SubLList $list35 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP"), makeKeyword("SCALING-FACTOR"), ONE_INTEGER, makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Shallow And Cheap"), makeKeyword("COMMENT"),
			makeString("Prefer problems which are shallower,\ni.e. have a lower min-proof-depth, and which are cheap,\ni.e. have a lower total productivity.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_SHALLOW_AND_CHEAP = makeSymbol("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP");

	private static final SubLSymbol STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED = makeSymbol("STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED");

	private static final SubLSymbol $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$ = makeSymbol("*STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-CACHING-STATE*");

	private static final SubLList $list41 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-COMPLETENESS"), makeKeyword("SCALING-FACTOR"), ONE_INTEGER, makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Completeness"), makeKeyword("COMMENT"), makeString("Prefer tactics which are complete.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_COMPLETENESS = makeSymbol("STRATEGIC-HEURISTIC-COMPLETENESS");

	private static final SubLList $list45 = list(
			new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR"), makeKeyword("SCALING-FACTOR"), makeInteger(250), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Occam's Razor"), makeKeyword("COMMENT"), makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth.") });

	private static final SubLList $list46 = list(new SubLObject[] { cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, makeInteger(-10)), cons(TWO_INTEGER, makeInteger(-20)), cons(THREE_INTEGER, makeInteger(-30)), cons(FOUR_INTEGER, makeInteger(-40)), cons(FIVE_INTEGER, makeInteger(-50)), cons(SIX_INTEGER, makeInteger(-60)), cons(SEVEN_INTEGER, makeInteger(-70)), cons(EIGHT_INTEGER, makeInteger(-75)),
			cons(NINE_INTEGER, makeInteger(-80)), cons(TEN_INTEGER, makeInteger(-85)), cons(FIFTEEN_INTEGER, makeInteger(-90)), cons(TWENTY_INTEGER, makeInteger(-95)), cons(makeInteger(30), makeInteger(-99)), cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100)) });

	private static final SubLInteger $int$_100 = makeInteger(-100);

	private static final SubLSymbol STRATEGIC_HEURISTIC_OCCAMS_RAZOR = makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR");

	private static final SubLSymbol $OCCAMS_RAZOR_TACTIC = makeKeyword("OCCAMS-RAZOR-TACTIC");

	private static final SubLList $list50 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TACTIC"), makeKeyword("SCALING-FACTOR"), makeInteger(250), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Occam's Razor (Tactic-Based)"), makeKeyword("COMMENT"),
			makeString("The simplest explanation is best.  Our measure\nof simplicity is the shallowest transformation depth.\nThis heuristic takes the tactic into account, not just the problem.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_OCCAMS_RAZOR_TACTIC = makeSymbol("STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TACTIC");

	private static final SubLList $list53 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-MAGIC-WAND"), makeKeyword("SCALING-FACTOR"), makeInteger(1000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Magic Wand"), makeKeyword("COMMENT"),
			makeString("Disprefer \'magic wand\' tactics, which are\nincomplete (conjunctive) removal tactics which are expected\nto yield no answers, i.e. they have a productivity of 0.\nSince they are incomplete, they can\'t even yield the benefit\nof pruning, so unless the estimate of 0 is wrong, it\'s\na waste of time to execute them.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_MAGIC_WAND = makeSymbol("STRATEGIC-HEURISTIC-MAGIC-WAND");

	private static final SubLSymbol $BACKTRACKING_CONSIDERED_HARMFUL = makeKeyword("BACKTRACKING-CONSIDERED-HARMFUL");

	private static final SubLList $list57 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-BACKTRACKING"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Backtracking Considered Harmful"), makeKeyword("COMMENT"),
			makeString("If we\'ve already executed some non-trivial\nconnected conjunction tactics on this problem, then disprefer\nexecuting any more connected conjunction tactics on it.\nA connected conjunction tactic is deemed trivial if\nit\'s expected to generate 4 or fewer subproblems.") });

	public static final SubLList $list58 = list(cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, makeInteger(-20)), cons(TWO_INTEGER, makeInteger(-40)), cons(THREE_INTEGER, makeInteger(-60)), cons(FOUR_INTEGER, makeInteger(-80)));

	private static final SubLSymbol STRATEGIC_HEURISTIC_BACKTRACKING = makeSymbol("STRATEGIC-HEURISTIC-BACKTRACKING");

	private static final SubLInteger $int$400 = makeInteger(400);

	public static final SubLList $list64 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("backchainRequired"), makeKeyword("COMMENT"), makeString("Prefer transformation tactics on backchainRequired predicates.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_BACKCHAIN_REQUIRED = makeSymbol("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED");

	private static final SubLSymbol $RULE_A_PRIORI_UTILITY = makeKeyword("RULE-A-PRIORI-UTILITY");

	private static final SubLList $list68 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantAssertion"), makeKeyword("COMMENT"),
			makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_RULE_A_PRIORI_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY");

	private static final SubLSymbol COUNT_A_PRIORI_UTILITY_RECURSIVE_INT = makeSymbol("COUNT-A-PRIORI-UTILITY-RECURSIVE-INT");

	private static final SubLSymbol TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS = makeSymbol("TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS");

	private static final SubLSymbol $PROBLEM_RULE_A_PRIORI_UTILITY = makeKeyword("PROBLEM-RULE-A-PRIORI-UTILITY");

	private static final SubLList $list74 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-PROBLEM-RULE-A-PRIORI-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantAssertion (Problem-Based)"), makeKeyword("COMMENT"),
			makeString("Prefer proof paths using higher proportions of\nhighlyRelevantAssertions.  Assume that proof paths using no rules\nare 100% relevant.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_PROBLEM_RULE_A_PRIORI_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-PROBLEM-RULE-A-PRIORI-UTILITY");

	public static final SubLList $list77 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RELEVANT-TERM"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("highlyRelevantTerm"), makeKeyword("COMMENT"), makeString("Prefer working on problems that contain more\nhighlyRelevantTerms.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_RELEVANT_TERM = makeSymbol("STRATEGIC-HEURISTIC-RELEVANT-TERM");

	private static final SubLSymbol PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT = makeSymbol("PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT-INT");

	private static final SubLList $list81 = list(makeSymbol("MT"), makeSymbol("ASENT"));

	private static final SubLSymbol ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM = makeSymbol("ACCUMULATE-RELEVANT-OR-IRRELEVANT-TERM");

	private static final SubLSymbol $RULE_HISTORICAL_UTILITY = makeKeyword("RULE-HISTORICAL-UTILITY");

	private static final SubLList $list85 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Historical Utility"), makeKeyword("COMMENT"),
			makeString("Prefer proof paths using rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider proof paths using no rules to be at 100%.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");

	private static final SubLSymbol COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT = makeSymbol("COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE-INT");

	private static final SubLSymbol TRANSFORMATION_RULE_UTILITY = makeSymbol("TRANSFORMATION-RULE-UTILITY");

	private static final SubLSymbol $sym89$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

	private static final SubLSymbol $PROBLEM_RULE_HISTORICAL_UTILITY = makeKeyword("PROBLEM-RULE-HISTORICAL-UTILITY");

	private static final SubLList $list91 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-PROBLEM-RULE-HISTORICAL-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("Problem Rule Historical Utility"), makeKeyword("COMMENT"),
			makeString("Prefer new roots obtained via rules that have worked well in the past,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider new roots obtained using no rules to be at 100%.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_PROBLEM_RULE_HISTORICAL_UTILITY = makeSymbol("STRATEGIC-HEURISTIC-PROBLEM-RULE-HISTORICAL-UTILITY");

	private static final SubLSymbol $RULE_HISTORICAL_CONNECTEDNESS = makeKeyword("RULE-HISTORICAL-CONNECTEDNESS");

	private static final SubLList $list94 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS"), makeKeyword("SCALING-FACTOR"), makeInteger(20000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("Rule Connectedness"), makeKeyword("COMMENT"),
			makeString("Prefer proof paths using sets of rules that have a larger fraction that have pairwise worked together in the past.\nConsider proof paths using fewer than 2 rules to be at 100%.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_RULE_HISTORICAL_CONNECTEDNESS = makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS");

	private static final SubLSymbol CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE = makeSymbol("CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE");

	private static final SubLSymbol PROBLEM_LINK_PATH_RULE_SET = makeSymbol("PROBLEM-LINK-PATH-RULE-SET");

	private static final SubLList $list102 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-LITERAL-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(12000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("# of Literals"), makeKeyword("COMMENT"), makeString("Prefer working on problems with a smaller number of literals.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_LITERAL_COUNT = makeSymbol("STRATEGIC-HEURISTIC-LITERAL-COUNT");

	private static final SubLSymbol $RULE_LITERAL_COUNT = makeKeyword("RULE-LITERAL-COUNT");

	private static final SubLList $list105 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(1000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("# of Rule Literals"), makeKeyword("COMMENT"), makeString("Prefer using rules with a smaller number of literals.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_RULE_LITERAL_COUNT = makeSymbol("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT");

	private static final SubLList $list107 = list(new SubLObject[] { cons(ONE_INTEGER, ZERO_INTEGER), cons(TWO_INTEGER, makeInteger(-15)), cons(THREE_INTEGER, makeInteger(-25)), cons(FOUR_INTEGER, makeInteger(-30)), cons(FIVE_INTEGER, makeInteger(-35)), cons(SIX_INTEGER, makeInteger(-40)), cons(SEVEN_INTEGER, makeInteger(-45)), cons(EIGHT_INTEGER, makeInteger(-50)), cons(NINE_INTEGER, makeInteger(-55)),
			cons(TEN_INTEGER, makeInteger(-60)), cons(THIRTEEN_INTEGER, makeInteger(-70)), cons(SEVENTEEN_INTEGER, makeInteger(-80)), cons(makeInteger(23), makeInteger(-85)), cons(makeInteger(30), makeInteger(-90)), cons(makeInteger(50), makeInteger(-95)), cons(makeInteger(70), makeInteger(-97)), cons(makeInteger(100), makeInteger(-99)), cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100)) });

	private static final SubLList $list108 = cons(makeSymbol("INPUT"), makeSymbol("OUTPUT"));

	private static final SubLList $list110 = list(new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-SKOLEM-COUNT"), makeKeyword("SCALING-FACTOR"), makeInteger(300000), makeKeyword("DOMAIN"), makeKeyword("PROBLEM"), makeKeyword("PRETTY-NAME"), makeString("# of Skolems"), makeKeyword("COMMENT"), makeString("Prefer working on problems with a smaller number of skolem functions.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_SKOLEM_COUNT = makeSymbol("STRATEGIC-HEURISTIC-SKOLEM-COUNT");

	private static final SubLSymbol SKOLEM_FUNCTION_P = makeSymbol("SKOLEM-FUNCTION-P");

	private static final SubLList $list113 = list(new SubLObject[] { cons(ZERO_INTEGER, ZERO_INTEGER), cons(ONE_INTEGER, MINUS_ONE_INTEGER), cons(TWO_INTEGER, makeInteger(-2)), cons(THREE_INTEGER, makeInteger(-4)), cons(FOUR_INTEGER, makeInteger(-8)), cons(FIVE_INTEGER, makeInteger(-16)), cons(SIX_INTEGER, makeInteger(-32)), cons(SEVEN_INTEGER, makeInteger(-64)), cons(EIGHT_INTEGER, makeInteger(-99)),
			cons(makeKeyword("POSITIVE-INFINITY"), makeInteger(-100)) });

	private static final SubLSymbol $sym114$HAPPINESS__ = makeSymbol("HAPPINESS->");

	private static final SubLSymbol $T_FLOWS_LIKE_WINE = makeKeyword("T-FLOWS-LIKE-WINE");

	private static final SubLList $list118 = list(
			new SubLObject[] { makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-T-FLOWS-LIKE-WINE"), makeKeyword("SCALING-FACTOR"), makeInteger(1000000), makeKeyword("DOMAIN"), makeKeyword("TACTIC"), makeKeyword("PRETTY-NAME"), makeString("T flows like wine"), makeKeyword("COMMENT"), makeString("Let T (transformation motivation) flow freely through structural tactics.") });

	private static final SubLSymbol STRATEGIC_HEURISTIC_T_FLOWS_LIKE_WINE = makeSymbol("STRATEGIC-HEURISTIC-T-FLOWS-LIKE-WINE");

	public static SubLObject strategic_heuristic_index() {
		return $strategic_heuristic_index$.getGlobalValue();
	}

	public static SubLObject do_strategic_heuristics(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list3);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject heuristic = NIL;
		SubLObject function = NIL;
		SubLObject scaling_factor = NIL;
		destructuring_bind_must_consp(current, datum, $list3);
		heuristic = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list3);
		function = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list3);
		scaling_factor = current.first();
		current = current.rest();
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = current;
		SubLObject bad = NIL;
		SubLObject current_$1 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, datum, $list3);
			current_$1 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, datum, $list3);
			if (NIL == member(current_$1, $list4, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$1 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(datum, $list3);
		}
		final SubLObject object_tail = property_list_member($OBJECT, current);
		final SubLObject v_object = (NIL != object_tail) ? cadr(object_tail) : NIL;
		final SubLObject done_tail = property_list_member($DONE, current);
		final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
		final SubLObject body;
		current = body = temp;
		final SubLObject domain = $sym8$DOMAIN;
		return list(DO_DICTIONARY_KEYS, list(heuristic, $list10, $DONE, done), list(CLET, list(list(function, list(STRATEGIC_HEURISTIC_FUNCTION, heuristic)), list(scaling_factor, list(STRATEGIC_HEURISTIC_SCALING_FACTOR, heuristic)), list(domain, list(STRATEGIC_HEURISTIC_DOMAIN, heuristic))), listS(PWHEN, list(DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P, v_object, domain), append(body, NIL))));
	}

	public static SubLObject do_strategic_heuristics_tactic_match_p(final SubLObject v_object, final SubLObject domain) {
		return makeBoolean((NIL == v_object) || (NIL != object_in_heuristic_domainP(v_object, domain)));
	}

	public static SubLObject heuristic_domain_p(final SubLObject v_object) {
		return list_utilities.member_eqP(v_object, $heuristic_domains$.getGlobalValue());
	}

	public static SubLObject object_in_heuristic_domainP(final SubLObject v_object, final SubLObject domain) {
		if (domain.eql($PROBLEM)) {
			return inference_datastructures_problem.problem_p(v_object);
		}
		if (domain.eql($TACTIC)) {
			return inference_datastructures_tactic.tactic_p(v_object);
		}
		if (domain.eql($CONTENT_TACTIC)) {
			return inference_worker.content_tactic_p(v_object);
		}
		if (domain.eql($STRUCTURAL_TACTIC)) {
			return inference_worker.structural_tactic_p(v_object);
		}
		if (domain.eql($CONNECTED_CONJUNCTION_TACTIC)) {
			return inference_worker.connected_conjunction_tactic_p(v_object);
		}
		if (domain.eql($GENERALIZED_REMOVAL_TACTIC)) {
			return inference_worker_removal.generalized_removal_tactic_p(v_object);
		}
		if (domain.eql($TRANSFORMATION_TACTIC)) {
			return inference_worker_transformation.transformation_tactic_p(v_object);
		}
		Errors.error($str25$Unknown_heuristic_domain__s, domain);
		return NIL;
	}

	public static SubLObject new_strategic_heuristic_data(final SubLObject function, final SubLObject scaling_factor, final SubLObject pretty_name, final SubLObject comment, final SubLObject domain) {
		return list(function, scaling_factor, pretty_name, comment, domain);
	}

	public static SubLObject declare_strategic_heuristic(final SubLObject heuristic, final SubLObject plist) {
		assert NIL != keywordp(heuristic) : "Types.keywordp(heuristic) " + "CommonSymbols.NIL != Types.keywordp(heuristic) " + heuristic;
		SubLObject allow_other_keys_p = NIL;
		SubLObject rest = plist;
		SubLObject bad = NIL;
		SubLObject current_$2 = NIL;
		while (NIL != rest) {
			destructuring_bind_must_consp(rest, plist, $list27);
			current_$2 = rest.first();
			rest = rest.rest();
			destructuring_bind_must_consp(rest, plist, $list27);
			if (NIL == member(current_$2, $list28, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			}
			if (current_$2 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			}
			rest = rest.rest();
		}
		if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			cdestructuring_bind_error(plist, $list27);
		}
		final SubLObject function_tail = property_list_member($FUNCTION, plist);
		final SubLObject function = (NIL != function_tail) ? cadr(function_tail) : NIL;
		final SubLObject scaling_factor_tail = property_list_member($SCALING_FACTOR, plist);
		final SubLObject scaling_factor = (NIL != scaling_factor_tail) ? cadr(scaling_factor_tail) : NIL;
		final SubLObject pretty_name_tail = property_list_member($PRETTY_NAME, plist);
		final SubLObject pretty_name = (NIL != pretty_name_tail) ? cadr(pretty_name_tail) : NIL;
		final SubLObject comment_tail = property_list_member($COMMENT, plist);
		final SubLObject comment = (NIL != comment_tail) ? cadr(comment_tail) : NIL;
		final SubLObject domain_tail = property_list_member($DOMAIN, plist);
		final SubLObject domain = (NIL != domain_tail) ? cadr(domain_tail) : NIL;
		final SubLObject data = new_strategic_heuristic_data(function, scaling_factor, pretty_name, comment, domain);
		dictionary.dictionary_enter($strategic_heuristic_index$.getGlobalValue(), heuristic, data);
		return heuristic;
	}

	public static SubLObject undeclare_strategic_heuristic(final SubLObject heuristic) {
		dictionary.dictionary_remove($strategic_heuristic_index$.getGlobalValue(), heuristic);
		return heuristic;
	}

	public static SubLObject strategic_heuristic_function(final SubLObject heuristic) {
		final SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
		if (NIL != data) {
			return data.first();
		}
		return NIL;
	}

	public static SubLObject strategic_heuristic_scaling_factor(final SubLObject heuristic) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject overriding_scaling_factor = getf($overriding_strategic_heuristic_scaling_factors$.getDynamicValue(thread), heuristic, NIL);
		if (NIL != overriding_scaling_factor) {
			return overriding_scaling_factor;
		}
		final SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
		if (NIL != data) {
			return second(data);
		}
		return NIL;
	}

	public static SubLObject strategic_heuristic_name(final SubLObject heuristic) {
		final SubLObject pretty_name = strategic_heuristic_pretty_name(heuristic);
		return NIL != pretty_name ? pretty_name : symbol_name(heuristic);
	}

	public static SubLObject strategic_heuristic_pretty_name(final SubLObject heuristic) {
		final SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
		if (NIL != data) {
			return third(data);
		}
		return NIL;
	}

	public static SubLObject strategic_heuristic_comment(final SubLObject heuristic) {
		final SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
		if (NIL != data) {
			return fourth(data);
		}
		return NIL;
	}

	public static SubLObject strategic_heuristic_domain(final SubLObject heuristic) {
		final SubLObject data = dictionary.dictionary_lookup_without_values($strategic_heuristic_index$.getGlobalValue(), heuristic, UNPROVIDED);
		if (NIL != data) {
			return fifth(data);
		}
		return NIL;
	}

	public static SubLObject strategic_heuristic_shallow_and_cheap(final SubLObject strategy, final SubLObject problem) {
		final SubLObject productivity = productivity_for_shallow_and_cheap_problem_heuristic(problem, strategy);
		final SubLObject uselessness = problem_strategic_uselessness_based_on_proof_depth(problem, strategy);
		final SubLObject unhappiness = (ZERO_INTEGER.eql(productivity) && (NIL != number_utilities.positive_infinity_p(uselessness))) ? number_utilities.positive_infinity() : inference_datastructures_enumerated_types.productivity_times_number(productivity, uselessness);
		final SubLObject happiness = inference_datastructures_enumerated_types.productivity_times_number(unhappiness, MINUS_ONE_INTEGER);
		return happiness;
	}

	public static SubLObject productivity_for_shallow_and_cheap_problem_heuristic(final SubLObject problem, final SubLObject strategy) {
		if ((NIL == new_root_tactician.new_root_strategy_p(strategy)) && (NIL == transformation_tactician_datastructures.transformation_strategy_p(strategy))) {
			return ZERO_INTEGER;
		}
		final SubLObject r_strat = striping_tactician.sibling_removal_strategy(strategy, problem);
		if (NIL != r_strat) {
			return inference_worker.estimated_global_productivity_of_problem_possible_tactics(problem, r_strat);
		}
		return inference_datastructures_tactic.total_productivity_of_problem_possible_tactics(problem);
	}

	public static SubLObject problem_strategic_uselessness_based_on_proof_depth(final SubLObject problem, final SubLObject strategy) {
		final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
		final SubLObject min_proof_depth = inference_datastructures_problem.problem_min_proof_depth(problem, inference);
		if ($UNDETERMINED == min_proof_depth) {
			return number_utilities.positive_infinity();
		}
		return strategic_uselessness_based_on_proof_depth_math_memoized(min_proof_depth);
	}

	public static SubLObject clear_strategic_uselessness_based_on_proof_depth_math_memoized() {
		final SubLObject cs = $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_strategic_uselessness_based_on_proof_depth_math_memoized(final SubLObject min_proof_depth) {
		return memoization_state.caching_state_remove_function_results_with_args($strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$.getGlobalValue(), list(min_proof_depth), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject strategic_uselessness_based_on_proof_depth_math_memoized_internal(final SubLObject min_proof_depth) {
		return max(ONE_INTEGER, round(log(number_utilities.f_1X(min_proof_depth), TWO_INTEGER), UNPROVIDED));
	}

	public static SubLObject strategic_uselessness_based_on_proof_depth_math_memoized(final SubLObject min_proof_depth) {
		SubLObject caching_state = $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED, $strategic_uselessness_based_on_proof_depth_math_memoized_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, min_proof_depth, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(strategic_uselessness_based_on_proof_depth_math_memoized_internal(min_proof_depth)));
			memoization_state.caching_state_put(caching_state, min_proof_depth, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject strategic_heuristic_completeness(final SubLObject strategy, final SubLObject content_tactic) {
		if ((NIL != inference_worker.content_tactic_p(content_tactic)) && ($COMPLETE == inference_datastructures_strategy.tactic_strategic_completeness(content_tactic, strategy))) {
			return ONE_INTEGER;
		}
		return ZERO_INTEGER;
	}

	public static SubLObject strategic_heuristic_occams_razor(final SubLObject strategy, final SubLObject problem) {
		return strategic_heuristic_occams_razor_int(strategy, problem, NIL);
	}

	public static SubLObject strategic_heuristic_occams_razor_int(final SubLObject strategy, final SubLObject problem, final SubLObject increment_depth_by_oneP) {
		final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
		SubLObject happiness = ZERO_INTEGER;
		if (NIL != inference_strategist.inference_permits_transformationP(inference)) {
			SubLObject min_depth = inference_datastructures_problem.problem_intuitive_min_transformation_depth(problem, inference);
			if (($UNDETERMINED == min_depth) || (NIL == min_depth)) {
				happiness = $strategic_heuristic_occams_razor_table_default$.getGlobalValue();
			} else {
				if (NIL != increment_depth_by_oneP) {
					min_depth = add(min_depth, ONE_INTEGER);
				}
				happiness = numeric_table_lookup(min_depth, $strategic_heuristic_occams_razor_table$.getGlobalValue(), UNPROVIDED);
			}
		}
		return happiness;
	}

	public static SubLObject strategic_heuristic_occams_razor_tactic(final SubLObject strategy, final SubLObject content_tactic) {
		final SubLObject half_ply_lookaheadP = inference_worker_transformation.transformation_tactic_p(content_tactic);
		return strategic_heuristic_occams_razor_int(strategy, inference_datastructures_tactic.tactic_problem(content_tactic), half_ply_lookaheadP);
	}

	public static SubLObject strategic_heuristic_magic_wand(final SubLObject strategy, final SubLObject generalized_removal_tactic) {
		if (((NIL != inference_worker_removal.generalized_removal_tactic_p(generalized_removal_tactic)) && ($INCOMPLETE == inference_datastructures_strategy.tactic_strategic_completeness(generalized_removal_tactic, strategy))) && (NIL != inference_datastructures_enumerated_types.productivity_E(ZERO_INTEGER, inference_datastructures_strategy.tactic_strategic_productivity(generalized_removal_tactic, strategy)))) {
			return $int$_100;
		}
		return ZERO_INTEGER;
	}

	public static SubLObject strategic_heuristic_backtracking(final SubLObject strategy, final SubLObject connected_conjunction_tactic) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == $backtracking_considered_harmfulP$.getDynamicValue(thread)) {
			return ZERO_INTEGER;
		}
		final SubLObject problem = inference_datastructures_tactic.tactic_problem(connected_conjunction_tactic);
		final SubLObject executed_connected_conjunction_tactic_count = executed_connected_conjunction_tactics_that_matter_count(problem, strategy);
		final SubLObject table = $strategic_heuristic_backtracking_table$.getGlobalValue();
		final SubLObject happiness = list_utilities.alist_lookup(table, executed_connected_conjunction_tactic_count, symbol_function(EQL), $strategic_heuristic_backtracking_table_default$.getGlobalValue());
		return happiness;
	}

	public static SubLObject executed_connected_conjunction_tactics_that_matter_count(final SubLObject problem, final SubLObject strategy) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
		SubLObject tactic = NIL;
		tactic = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if ((NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $CONNECTED_CONJUNCTION)) && (NIL != inference_datastructures_problem.do_problem_tactics_status_match(tactic, $EXECUTED))) {
				final SubLObject productivity = inference_datastructures_strategy.tactic_strategic_productivity(tactic, strategy);
				if (NIL != inference_datastructures_enumerated_types.productivity_G(productivity, $early_removal_productivity_threshold$.getDynamicValue(thread))) {
					count = add(count, ONE_INTEGER);
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			tactic = cdolist_list_var.first();
		}
		return count;
	}

	public static SubLObject strategic_heuristic_backchain_required(final SubLObject strategy, final SubLObject transformation_tactic) {
		final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
		if (NIL != inference_strategist.inference_permits_transformationP(inference)) {
			final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
			if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
				final SubLObject asent = inference_datastructures_problem.single_literal_problem_atomic_sentence(problem);
				final SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(problem);
				if (NIL != inference_trampolines.inference_backchain_required_asentP(asent, mt)) {
					return $int$100;
				}
			}
		}
		return ZERO_INTEGER;
	}

	public static SubLObject strategic_heuristic_rule_a_priori_utility(final SubLObject strategy, final SubLObject content_tactic) {
		return strategic_heuristic_rule_a_priori_utility_int(strategy, inference_datastructures_tactic.tactic_problem(content_tactic), content_tactic);
	}

	public static SubLObject strategic_heuristic_rule_a_priori_utility_int(final SubLObject strategy, final SubLObject problem, final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject happiness = $int$100;
		final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
		if ((NIL != inference_strategist.inference_permits_transformationP(inference)) && ((NIL != inference_worker.problem_has_been_transformedP(problem, inference)) || (NIL != inference_worker_transformation.transformation_tactic_p(v_object)))) {
			final SubLObject _prev_bind_0 = $heuristic_rule_a_priori_utility_problem_recursion_stack$.currentBinding(thread);
			try {
				$heuristic_rule_a_priori_utility_problem_recursion_stack$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
				thread.resetMultipleValues();
				SubLObject relevance_count = count_a_priori_utility_recursive(problem, inference);
				SubLObject total_count = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if ($LOOP != total_count) {
					if (NIL != inference_worker.content_tactic_p(v_object)) {
						thread.resetMultipleValues();
						final SubLObject relevance_count_delta = determine_tactic_heuristic_relevance_delta(v_object);
						final SubLObject total_count_delta = thread.secondMultipleValue();
						thread.resetMultipleValues();
						relevance_count = add(relevance_count, relevance_count_delta);
						total_count = add(total_count, total_count_delta);
					}
					if (!total_count.isZero()) {
						happiness = truncate(multiply($int$100, relevance_count), total_count);
					}
				}
			} finally {
				$heuristic_rule_a_priori_utility_problem_recursion_stack$.rebind(_prev_bind_0, thread);
			}
		}
		return happiness;
	}

	public static SubLObject push_problem_onto_heuristic_rule_a_priori_utility_stack(final SubLObject problem) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return set.set_add(problem, $heuristic_rule_a_priori_utility_problem_recursion_stack$.getDynamicValue(thread));
	}

	public static SubLObject problem_on_heuristic_rule_a_priori_utility_stackP(final SubLObject problem) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return set.set_memberP(problem, $heuristic_rule_a_priori_utility_problem_recursion_stack$.getDynamicValue(thread));
	}

	public static SubLObject count_a_priori_utility_recursive(final SubLObject problem, final SubLObject inference) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject best_relevance_count = NIL;
		SubLObject best_total_count = NIL;
		final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				thread.resetMultipleValues();
				final SubLObject best_relevance_count_$3 = count_a_priori_utility_recursive_int(problem, inference);
				final SubLObject best_total_count_$4 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				best_relevance_count = best_relevance_count_$3;
				best_total_count = best_total_count_$4;
			} finally {
				final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return values(best_relevance_count, best_total_count);
	}

	public static SubLObject count_a_priori_utility_recursive_int_internal(final SubLObject problem, final SubLObject inference) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject best_relevance_count = ZERO_INTEGER;
		SubLObject best_total_count = ZERO_INTEGER;
		SubLObject best_ratio = $most_negative_fixnum$.getGlobalValue();
		SubLObject found_a_loopP = NIL;
		SubLObject found_a_non_loopP = NIL;
		if (NIL != problem_on_heuristic_rule_a_priori_utility_stackP(problem)) {
			return values($LOOP, $LOOP);
		}
		push_problem_onto_heuristic_rule_a_priori_utility_stack(problem);
		final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
		SubLObject basis_object;
		SubLObject state;
		SubLObject dependent_link;
		SubLObject supported_problem;
		SubLObject relevance_count;
		SubLObject total_count;
		SubLObject loopP;
		SubLObject t_link;
		SubLObject best_sub_relevance_count;
		SubLObject best_sub_total_count;
		SubLObject ratio;
		for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
			dependent_link = set_contents.do_set_contents_next(basis_object, state);
			if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
				supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
				relevance_count = ZERO_INTEGER;
				total_count = ZERO_INTEGER;
				loopP = NIL;
				if (NIL != inference_worker_transformation.generalized_transformation_link_p(dependent_link)) {
					total_count = add(total_count, ONE_INTEGER);
					if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
						t_link = (NIL != inference_worker_transformation.transformation_link_p(dependent_link)) ? dependent_link : inference_worker_residual_transformation.residual_transformation_link_motivating_transformation_link(dependent_link);
						if (NIL != generalized_transformation_link_relevantP(t_link)) {
							relevance_count = add(relevance_count, ONE_INTEGER);
						} else if (NIL != generalized_transformation_link_irrelevantP(t_link)) {
							relevance_count = subtract(relevance_count, ONE_INTEGER);
						} else if (NIL != generalized_transformation_link_has_rule_utilityP(t_link)) {
							relevance_count = add(relevance_count, generalized_transformation_link_rule_utility(t_link));
						}

					}
				}
				if (NIL == inference_worker_answer.answer_link_p(dependent_link)) {
					thread.resetMultipleValues();
					best_sub_relevance_count = count_a_priori_utility_recursive(supported_problem, inference);
					best_sub_total_count = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if ($LOOP == best_sub_total_count) {
						loopP = T;
						found_a_loopP = T;
					} else {
						found_a_non_loopP = T;
						relevance_count = add(relevance_count, best_sub_relevance_count);
						total_count = add(total_count, best_sub_total_count);
					}
				}
				if (NIL == loopP) {
					ratio = (total_count.isZero()) ? ZERO_INTEGER : divide(relevance_count, total_count);
					if (ratio.numG(best_ratio) || (ratio.numE(best_ratio) && total_count.numL(best_total_count))) {
						best_relevance_count = relevance_count;
						best_total_count = total_count;
						best_ratio = ratio;
					}
				}
			}
		}
		if ((NIL != found_a_loopP) && (NIL == found_a_non_loopP)) {
			return values($LOOP, $LOOP);
		}
		return values(best_relevance_count, best_total_count);
	}

	public static SubLObject count_a_priori_utility_recursive_int(final SubLObject problem, final SubLObject inference) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return count_a_priori_utility_recursive_int_internal(problem, inference);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COUNT_A_PRIORI_UTILITY_RECURSIVE_INT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COUNT_A_PRIORI_UTILITY_RECURSIVE_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, COUNT_A_PRIORI_UTILITY_RECURSIVE_INT, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, inference);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (problem.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference.eql(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(count_a_priori_utility_recursive_int_internal(problem, inference)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, inference));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject determine_tactic_heuristic_relevance_delta(final SubLObject tactic) {
		SubLObject relevance_count = ZERO_INTEGER;
		SubLObject total_count = ZERO_INTEGER;
		if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
			if (NIL != transformation_tactic_relevantP(tactic)) {
				relevance_count = add(relevance_count, ONE_INTEGER);
				total_count = add(total_count, ONE_INTEGER);
			} else if (NIL != transformation_tactic_irrelevantP(tactic)) {
				relevance_count = subtract(relevance_count, ONE_INTEGER);
				total_count = add(total_count, ONE_INTEGER);
			} else if (NIL != transformation_tactic_has_utilityP(tactic)) {
				relevance_count = add(relevance_count, transformation_tactic_utility(tactic));
				total_count = add(total_count, ONE_INTEGER);
			} else if (NIL != inference_worker_transformation.transformation_tactic_lookahead_rule(tactic)) {
				total_count = add(total_count, ONE_INTEGER);
			}

		}
		return values(relevance_count, total_count);
	}

	public static SubLObject generalized_transformation_link_relevantP(final SubLObject generalized_transformation_link) {
		final SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(generalized_transformation_link);
		final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(generalized_transformation_link);
		return rule_relevant_to_problemP(rule, problem);
	}

	public static SubLObject generalized_transformation_link_irrelevantP(final SubLObject generalized_transformation_link) {
		final SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(generalized_transformation_link);
		final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(generalized_transformation_link);
		return rule_irrelevant_to_problemP(rule, problem);
	}

	public static SubLObject generalized_transformation_link_has_rule_utilityP(final SubLObject generalized_transformation_link) {
		final SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(generalized_transformation_link);
		final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(generalized_transformation_link);
		return rule_has_utility_wrt_problemP(rule, problem);
	}

	public static SubLObject generalized_transformation_link_rule_utility(final SubLObject generalized_transformation_link) {
		final SubLObject rule = inference_worker_transformation.generalized_transformation_link_rule_assertion(generalized_transformation_link);
		final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(generalized_transformation_link);
		final SubLObject problem_mt = inference_datastructures_problem.single_literal_problem_mt(problem);
		return inference_trampolines.inference_rule_utility(rule, problem_mt);
	}

	public static SubLObject transformation_tactic_relevantP(final SubLObject transformation_tactic) {
		final SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
		if (NIL != rule) {
			final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
			return rule_relevant_to_problemP(rule, problem);
		}
		return NIL;
	}

	public static SubLObject transformation_tactic_irrelevantP(final SubLObject transformation_tactic) {
		final SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
		if (NIL != rule) {
			final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
			return rule_irrelevant_to_problemP(rule, problem);
		}
		return NIL;
	}

	public static SubLObject transformation_tactic_has_utilityP(final SubLObject transformation_tactic) {
		final SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
		if (NIL != rule) {
			final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
			return rule_has_utility_wrt_problemP(rule, problem);
		}
		return NIL;
	}

	public static SubLObject transformation_tactic_utility(final SubLObject transformation_tactic) {
		final SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
		if (NIL != rule) {
			final SubLObject problem = inference_datastructures_tactic.tactic_problem(transformation_tactic);
			final SubLObject problem_mt = inference_datastructures_problem.single_literal_problem_mt(problem);
			return inference_trampolines.inference_rule_utility(rule, problem_mt);
		}
		return NIL;
	}

	public static SubLObject rule_relevant_to_problemP(final SubLObject rule, final SubLObject problem) {
		final SubLObject problem_mt = inference_datastructures_problem.problem_mt(problem);
		final SubLObject rule_mt = assertions_high.assertion_mt(rule);
		if (NIL != inference_trampolines.inference_relevant_mtP(rule_mt, problem_mt)) {
			return T;
		}
		if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
			return NIL;
		}
		if (NIL != inference_trampolines.inference_relevant_assertionP(rule, problem_mt)) {
			return T;
		}
		final SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
		return inference_trampolines.inference_relevant_predicate_assertionP(predicate, rule, problem_mt);
	}

	public static SubLObject rule_irrelevant_to_problemP(final SubLObject rule, final SubLObject problem) {
		final SubLObject problem_mt = inference_datastructures_problem.problem_mt(problem);
		final SubLObject rule_mt = assertions_high.assertion_mt(rule);
		if (NIL != inference_trampolines.inference_irrelevant_mtP(rule_mt, problem_mt)) {
			return T;
		}
		if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
			return NIL;
		}
		if (NIL != inference_trampolines.inference_irrelevant_assertionP(rule, problem_mt)) {
			return T;
		}
		final SubLObject predicate = inference_datastructures_problem.single_literal_problem_predicate(problem);
		return inference_trampolines.inference_irrelevant_predicate_assertionP(predicate, rule, problem_mt);
	}

	public static SubLObject rule_has_utility_wrt_problemP(final SubLObject rule, final SubLObject problem) {
		final SubLObject problem_mt = inference_datastructures_problem.problem_mt(problem);
		if (NIL == assertion_utilities.assertion_has_meta_assertionsP(rule)) {
			return NIL;
		}
		if (NIL != inference_trampolines.inference_rule_has_utilityP(rule, problem_mt)) {
			return T;
		}
		return NIL;
	}

	public static SubLObject transformation_rule_a_priori_utility(final SubLObject rule) {
		if (NIL != inference_trampolines.inference_relevant_assertionP(rule, UNPROVIDED)) {
			return ONE_INTEGER;
		}
		if (NIL != inference_trampolines.inference_irrelevant_assertionP(rule, UNPROVIDED)) {
			return MINUS_ONE_INTEGER;
		}
		if (NIL != inference_trampolines.inference_rule_has_utilityP(rule, UNPROVIDED)) {
			return inference_trampolines.inference_rule_utility(rule, UNPROVIDED);
		}
		return ZERO_INTEGER;
	}

	public static SubLObject transformation_rule_a_priori_utility_happiness_internal(final SubLObject rule) {
		final SubLObject happiness = truncate(multiply($int$100, transformation_rule_a_priori_utility(rule)), UNPROVIDED);
		return happiness;
	}

	public static SubLObject transformation_rule_a_priori_utility_happiness(final SubLObject rule) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return transformation_rule_a_priori_utility_happiness_internal(rule);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS, ONE_INTEGER, NIL, EQL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(transformation_rule_a_priori_utility_happiness_internal(rule)));
			memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject strategic_heuristic_problem_rule_a_priori_utility(final SubLObject strategy, final SubLObject problem) {
		return strategic_heuristic_rule_a_priori_utility_int(strategy, problem, problem);
	}

	public static SubLObject strategic_heuristic_relevant_term(final SubLObject strategy, final SubLObject problem) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == $highly_relevant_term_enabledP$.getDynamicValue(thread)) {
			return ZERO_INTEGER;
		}
		final SubLObject relevance_count = problem_relevant_or_irrelevant_term_count(problem);
		SubLObject heuristic = multiply(relevance_count, TWENTY_INTEGER);
		heuristic = min(heuristic, $int$100);
		heuristic = max(heuristic, $int$_100);
		return heuristic;
	}

	public static SubLObject problem_relevant_or_irrelevant_term_count(final SubLObject problem) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject relevance = NIL;
		final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				relevance = problem_relevant_or_irrelevant_term_count_int(problem);
			} finally {
				final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return relevance;
	}

	public static SubLObject problem_relevant_or_irrelevant_term_count_int_internal(final SubLObject problem) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject relevance = NIL;
		final SubLObject _prev_bind_0 = $relevant_term_set$.currentBinding(thread);
		final SubLObject _prev_bind_2 = $irrelevant_term_set$.currentBinding(thread);
		try {
			$relevant_term_set$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
			$irrelevant_term_set$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
			SubLObject cdolist_list_var = inference_datastructures_problem.problem_query(problem);
			SubLObject contextualized_clause = NIL;
			contextualized_clause = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject sense = $NEG;
				SubLObject index_var = ZERO_INTEGER;
				SubLObject cdolist_list_var_$7 = clauses.neg_lits(contextualized_clause);
				SubLObject contextualized_asent = NIL;
				contextualized_asent = cdolist_list_var_$7.first();
				while (NIL != cdolist_list_var_$7) {
					SubLObject current;
					final SubLObject datum = current = contextualized_asent;
					SubLObject mt = NIL;
					SubLObject asent = NIL;
					destructuring_bind_must_consp(current, datum, $list81);
					mt = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list81);
					asent = current.first();
					current = current.rest();
					if (NIL == current) {
						final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
						final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
						final SubLObject _prev_bind_1_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
						final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
						try {
							mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
							mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
							mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
							note_expression_relevant_or_irrelevant_terms(asent);
						} finally {
							mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
							mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$9, thread);
							mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
						}
					} else {
						cdestructuring_bind_error(datum, $list81);
					}
					index_var = add(index_var, ONE_INTEGER);
					cdolist_list_var_$7 = cdolist_list_var_$7.rest();
					contextualized_asent = cdolist_list_var_$7.first();
				}
				sense = $POS;
				index_var = ZERO_INTEGER;
				SubLObject cdolist_list_var_$8 = clauses.pos_lits(contextualized_clause);
				contextualized_asent = NIL;
				contextualized_asent = cdolist_list_var_$8.first();
				while (NIL != cdolist_list_var_$8) {
					SubLObject current;
					final SubLObject datum = current = contextualized_asent;
					SubLObject mt = NIL;
					SubLObject asent = NIL;
					destructuring_bind_must_consp(current, datum, $list81);
					mt = current.first();
					current = current.rest();
					destructuring_bind_must_consp(current, datum, $list81);
					asent = current.first();
					current = current.rest();
					if (NIL == current) {
						final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
						final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$mt$.currentBinding(thread);
						final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
						final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
						try {
							mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
							mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
							mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
							note_expression_relevant_or_irrelevant_terms(asent);
						} finally {
							mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
							mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
							mt_relevance_macros.$mt$.rebind(_prev_bind_0_$9, thread);
						}
					} else {
						cdestructuring_bind_error(datum, $list81);
					}
					index_var = add(index_var, ONE_INTEGER);
					cdolist_list_var_$8 = cdolist_list_var_$8.rest();
					contextualized_asent = cdolist_list_var_$8.first();
				}
				cdolist_list_var = cdolist_list_var.rest();
				contextualized_clause = cdolist_list_var.first();
			}
			relevance = subtract(set.set_size($relevant_term_set$.getDynamicValue(thread)), set.set_size($irrelevant_term_set$.getDynamicValue(thread)));
		} finally {
			$irrelevant_term_set$.rebind(_prev_bind_2, thread);
			$relevant_term_set$.rebind(_prev_bind_0, thread);
		}
		return relevance;
	}

	public static SubLObject problem_relevant_or_irrelevant_term_count_int(final SubLObject problem) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return problem_relevant_or_irrelevant_term_count_int_internal(problem);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, problem, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(problem_relevant_or_irrelevant_term_count_int_internal(problem)));
			memoization_state.caching_state_put(caching_state, problem, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject note_expression_relevant_or_irrelevant_terms(final SubLObject expression) {
		return cycl_utilities.expression_map(ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM, expression, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject accumulate_relevant_or_irrelevant_term(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != forts.fort_p(v_term)) {
			if (NIL != inference_trampolines.inference_relevant_termP(v_term, UNPROVIDED)) {
				set.set_add(v_term, $relevant_term_set$.getDynamicValue(thread));
			}
			if (NIL != inference_trampolines.inference_irrelevant_termP(v_term, UNPROVIDED)) {
				set.set_add(v_term, $irrelevant_term_set$.getDynamicValue(thread));
			}
		}
		return NIL;
	}

	public static SubLObject strategic_heuristic_rule_historical_utility_enabledP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $strategic_heuristic_rule_historical_utility_enabledP$.getDynamicValue(thread);
	}

	public static SubLObject enable_strategic_heuristic_rule_historical_utility() {
		$strategic_heuristic_rule_historical_utility_enabledP$.setDynamicValue(T);
		return T;
	}

	public static SubLObject disable_strategic_heuristic_rule_historical_utility() {
		$strategic_heuristic_rule_historical_utility_enabledP$.setDynamicValue(NIL);
		return NIL;
	}

	public static SubLObject strategic_heuristic_rule_historical_utility(final SubLObject strategy, final SubLObject content_tactic) {
		return strategic_heuristic_rule_historical_utility_int(strategy, inference_datastructures_tactic.tactic_problem(content_tactic), content_tactic);
	}

	public static SubLObject strategic_heuristic_rule_historical_utility_int(final SubLObject strategy, final SubLObject problem, final SubLObject v_object) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == $strategic_heuristic_rule_historical_utility_enabledP$.getDynamicValue(thread)) {
			return ZERO_INTEGER;
		}
		SubLObject happiness = $int$100;
		final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
		if ((NIL != inference_strategist.inference_permits_transformationP(inference)) && ((NIL != inference_worker.problem_has_been_transformedP(problem, inference)) || (NIL != inference_worker_transformation.transformation_tactic_p(v_object)))) {
			final SubLObject _prev_bind_0 = $heuristic_rule_historical_utility_problem_recursion_stack$.currentBinding(thread);
			try {
				$heuristic_rule_historical_utility_problem_recursion_stack$.bind(set.new_set(symbol_function(EQL), UNPROVIDED), thread);
				thread.resetMultipleValues();
				SubLObject total_utility = compute_problem_rule_historical_utility_recursive(problem, inference);
				SubLObject total_count = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if ($LOOP != total_count) {
					if (NIL != inference_worker.content_tactic_p(v_object)) {
						thread.resetMultipleValues();
						final SubLObject delta_utility = compute_tactic_rule_historical_utility(v_object);
						final SubLObject delta_count = thread.secondMultipleValue();
						thread.resetMultipleValues();
						total_utility = add(total_utility, delta_utility);
						total_count = add(total_count, delta_count);
					}
					if (!total_count.isZero()) {
						happiness = integerDivide(total_utility, total_count);
					}
				}
			} finally {
				$heuristic_rule_historical_utility_problem_recursion_stack$.rebind(_prev_bind_0, thread);
			}
		}
		return happiness;
	}

	public static SubLObject push_problem_onto_rule_historical_utility_stack(final SubLObject problem) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return set.set_add(problem, $heuristic_rule_historical_utility_problem_recursion_stack$.getDynamicValue(thread));
	}

	public static SubLObject problem_on_rule_historical_utility_stackP(final SubLObject problem) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return set.set_memberP(problem, $heuristic_rule_historical_utility_problem_recursion_stack$.getDynamicValue(thread));
	}

	public static SubLObject compute_problem_rule_historical_utility_recursive(final SubLObject problem, final SubLObject inference) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject best_utility = NIL;
		SubLObject best_total_count = NIL;
		final SubLObject local_state = inference_datastructures_problem.problem_memoization_state(problem);
		final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
		try {
			memoization_state.$memoization_state$.bind(local_state, thread);
			final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
			try {
				thread.resetMultipleValues();
				final SubLObject best_utility_$13 = compute_problem_rule_historical_utility_recursive_int(problem, inference);
				final SubLObject best_total_count_$14 = thread.secondMultipleValue();
				thread.resetMultipleValues();
				best_utility = best_utility_$13;
				best_total_count = best_total_count_$14;
			} finally {
				final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
				try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values = getValuesAsVector();
					memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
					restoreValuesFromVector(_values);
				} finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
				}
			}
		} finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		}
		return values(best_utility, best_total_count);
	}

	public static SubLObject compute_problem_rule_historical_utility_recursive_int_internal(final SubLObject problem, final SubLObject inference) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject best_utility = ZERO_INTEGER;
		SubLObject best_total_count = ZERO_INTEGER;
		SubLObject best_ratio = $most_negative_fixnum$.getGlobalValue();
		SubLObject found_a_loopP = NIL;
		SubLObject found_a_non_loopP = NIL;
		if (NIL != problem_on_rule_historical_utility_stackP(problem)) {
			return values($LOOP, $LOOP);
		}
		push_problem_onto_rule_historical_utility_stack(problem);
		final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
		SubLObject basis_object;
		SubLObject state;
		SubLObject dependent_link;
		SubLObject supported_problem;
		SubLObject utility;
		SubLObject total_count;
		SubLObject loopP;
		SubLObject rule_assertion;
		SubLObject local_utility;
		SubLObject best_sub_utility;
		SubLObject best_sub_total_count;
		SubLObject ratio;
		for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
			dependent_link = set_contents.do_set_contents_next(basis_object, state);
			if (NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) {
				supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
				utility = ZERO_INTEGER;
				total_count = ZERO_INTEGER;
				loopP = NIL;
				if (NIL != inference_worker_transformation.generalized_transformation_link_p(dependent_link)) {
					total_count = add(total_count, ONE_INTEGER);
					if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
						rule_assertion = inference_worker_transformation.generalized_transformation_link_rule_assertion(dependent_link);
						local_utility = inference_analysis.transformation_rule_historical_utility(rule_assertion);
						utility = add(utility, local_utility);
					}
				}
				if (NIL == inference_worker_answer.answer_link_p(dependent_link)) {
					thread.resetMultipleValues();
					best_sub_utility = compute_problem_rule_historical_utility_recursive(supported_problem, inference);
					best_sub_total_count = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if ($LOOP == best_sub_total_count) {
						loopP = T;
						found_a_loopP = T;
					} else {
						found_a_non_loopP = T;
						utility = add(utility, best_sub_utility);
						total_count = add(total_count, best_sub_total_count);
					}
				}
				if (NIL == loopP) {
					ratio = (total_count.isZero()) ? ZERO_INTEGER : divide(utility, total_count);
					if (ratio.numG(best_ratio) || (ratio.numE(best_ratio) && total_count.numL(best_total_count))) {
						best_utility = utility;
						best_total_count = total_count;
						best_ratio = ratio;
					}
				}
			}
		}
		if ((NIL != found_a_loopP) && (NIL == found_a_non_loopP)) {
			return values($LOOP, $LOOP);
		}
		return values(best_utility, best_total_count);
	}

	public static SubLObject compute_problem_rule_historical_utility_recursive_int(final SubLObject problem, final SubLObject inference) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return compute_problem_rule_historical_utility_recursive_int_internal(problem, inference);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, inference);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (problem.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference.eql(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(compute_problem_rule_historical_utility_recursive_int_internal(problem, inference)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, inference));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject compute_tactic_rule_historical_utility(final SubLObject tactic) {
		SubLObject delta_utility = ZERO_INTEGER;
		SubLObject delta_count = ZERO_INTEGER;
		if (NIL != inference_worker_transformation.transformation_tactic_p(tactic)) {
			final SubLObject rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
			if (NIL != rule) {
				delta_utility = add(delta_utility, inference_analysis.transformation_rule_historical_utility(rule));
				delta_count = add(delta_count, ONE_INTEGER);
			}
		}
		return values(delta_utility, delta_count);
	}

	public static SubLObject inference_rule_preference_G(final SubLObject inference, final SubLObject rule1, final SubLObject rule2) {
		final SubLObject rule1_allowedP = inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule1);
		final SubLObject rule2_allowedP = inference_datastructures_inference.inference_allows_use_of_ruleP(inference, rule2);
		if (NIL != rule1_allowedP) {
			if (NIL != rule2_allowedP) {
				return transformation_rule_utility_G_with_tiebreaker(rule1, rule2);
			}
			return T;
		} else {
			if (NIL != rule2_allowedP) {
				return NIL;
			}
			return transformation_rule_utility_G_with_tiebreaker(rule1, rule2);
		}
	}

	public static SubLObject transformation_rule_utility_G(final SubLObject rule1, final SubLObject rule2) {
		return numG(transformation_rule_utility(rule1), transformation_rule_utility(rule2));
	}

	public static SubLObject transformation_rule_utility_G_with_tiebreaker(final SubLObject rule1, final SubLObject rule2) {
		if (NIL != transformation_rule_utility_G(rule1, rule2)) {
			return T;
		}
		if (NIL != transformation_rule_utility_G(rule2, rule1)) {
			return NIL;
		}
		return numL(assertion_utilities.rule_literal_count(rule1), assertion_utilities.rule_literal_count(rule2));
	}

	public static SubLObject transformation_rule_utility_internal(final SubLObject rule) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
		final SubLObject historical_utility = (NIL != $strategic_heuristic_rule_historical_utility_enabledP$.getDynamicValue(thread)) ? inference_analysis.transformation_rule_historical_utility(rule) : ZERO_INTEGER;
		final SubLObject a_priori_utility = transformation_rule_a_priori_utility_happiness(rule);
		return add(historical_utility, a_priori_utility);
	}

	public static SubLObject transformation_rule_utility(final SubLObject rule) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return transformation_rule_utility_internal(rule);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TRANSFORMATION_RULE_UTILITY, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TRANSFORMATION_RULE_UTILITY, ONE_INTEGER, NIL, EQL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, TRANSFORMATION_RULE_UTILITY, caching_state);
		}
		SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(transformation_rule_utility_internal(rule)));
			memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject strategic_heuristic_problem_rule_historical_utility(final SubLObject strategy, final SubLObject problem) {
		return strategic_heuristic_rule_historical_utility_int(strategy, problem, problem);
	}

	public static SubLObject enable_rule_historical_connectedness() {
		transformation_tactician.enable_transformation_tactician_tactic_heuristic($RULE_HISTORICAL_CONNECTEDNESS);
		$strategic_heuristic_rule_historical_connectedness_enabledP$.setDynamicValue(T);
		return NIL;
	}

	public static SubLObject disable_rule_historical_connectedness() {
		transformation_tactician.disable_transformation_tactician_tactic_heuristic($RULE_HISTORICAL_CONNECTEDNESS);
		$strategic_heuristic_rule_historical_connectedness_enabledP$.setDynamicValue(NIL);
		return NIL;
	}

	public static SubLObject strategic_heuristic_rule_historical_connectedness(final SubLObject strategy, final SubLObject content_tactic) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == $strategic_heuristic_rule_historical_connectedness_enabledP$.getDynamicValue(thread)) {
			return ZERO_INTEGER;
		}
		SubLObject happiness = $int$100;
		final SubLObject inference = inference_datastructures_strategy.strategy_inference(strategy);
		if (NIL != inference_strategist.inference_permits_transformationP(inference)) {
			final SubLObject problem = inference_datastructures_tactic.tactic_problem(content_tactic);
			if ((NIL != inference_worker.problem_has_been_transformedP(problem, inference)) || (NIL != inference_worker_transformation.transformation_tactic_p(content_tactic))) {
				final SubLObject rule_sets = tactic_lookahead_rule_sets_relevant_to_inference(content_tactic, inference);
				SubLObject best_percent = ZERO_INTEGER;
				SubLObject some_rule_set_usedP = NIL;
				SubLObject cdolist_list_var = rule_sets;
				SubLObject rule_set = NIL;
				rule_set = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL != list_utilities.lengthGE(rule_set, TWO_INTEGER, UNPROVIDED)) {
						final SubLObject percent = inference_analysis.rule_historical_connectedness_percentage(rule_set);
						some_rule_set_usedP = T;
						best_percent = max(best_percent, percent);
					}
					cdolist_list_var = cdolist_list_var.rest();
					rule_set = cdolist_list_var.first();
				}
				if (NIL != some_rule_set_usedP) {
					happiness = best_percent;
				}
			}
		}
		return happiness;
	}

	public static SubLObject problem_link_paths_relevant_to_inference(final SubLObject problem, final SubLObject inference) {
		if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(problem, inference)) {
			return nreverse(problem_link_paths_relevant_to_inference_recursive(problem, inference, NIL));
		}
		return NIL;
	}

	public static SubLObject cached_problem_link_paths_relevant_to_inference_internal(final SubLObject problem, final SubLObject inference) {
		return problem_link_paths_relevant_to_inference(problem, inference);
	}

	public static SubLObject cached_problem_link_paths_relevant_to_inference(final SubLObject problem, final SubLObject inference) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return cached_problem_link_paths_relevant_to_inference_internal(problem, inference);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE, TWO_INTEGER, NIL, EQ, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(problem, inference);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (problem.eql(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && inference.eql(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cached_problem_link_paths_relevant_to_inference_internal(problem, inference)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(problem, inference));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject problem_link_paths_relevant_to_inference_recursive(final SubLObject problem, final SubLObject inference, final SubLObject visitedP) {
		final SubLObject new_visitedP = cons(problem, visitedP);
		SubLObject paths = NIL;
		final SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
		SubLObject basis_object;
		SubLObject state;
		SubLObject dependent_link;
		SubLObject supported_problem;
		SubLObject cdolist_list_var;
		SubLObject sub_paths;
		SubLObject sub_path;
		for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
			dependent_link = set_contents.do_set_contents_next(basis_object, state);
			if ((NIL != set_contents.do_set_contents_element_validP(state, dependent_link)) && (NIL != inference_datastructures_problem_link.problem_link_openP(dependent_link))) {
				if (inference.eql(inference_datastructures_problem_link.problem_link_supported_inference(dependent_link))) {
					paths = cons(list(dependent_link), paths);
				} else {
					supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(dependent_link);
					if ((NIL == list_utilities.member_eqP(supported_problem, new_visitedP)) && (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(supported_problem, inference))) {
						sub_paths = cdolist_list_var = problem_link_paths_relevant_to_inference_recursive(supported_problem, inference, new_visitedP);
						sub_path = NIL;
						sub_path = cdolist_list_var.first();
						while (NIL != cdolist_list_var) {
							paths = cons(cons(dependent_link, sub_path), paths);
							cdolist_list_var = cdolist_list_var.rest();
							sub_path = cdolist_list_var.first();
						}
					}
				}
			}
		}
		return paths;
	}

	public static SubLObject problem_rule_sets_relevant_to_inference(final SubLObject problem, final SubLObject inference) {
		assert NIL != inference_datastructures_problem.problem_p(problem) : "inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) " + problem;
		assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
		final SubLObject link_paths = problem_link_paths_relevant_to_inference(problem, inference);
		final SubLObject rule_sets = Mapping.mapcar(symbol_function(PROBLEM_LINK_PATH_RULE_SET), link_paths);
		return delete_duplicates(rule_sets, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject tactic_lookahead_rule_sets_relevant_to_inference(final SubLObject tactic, final SubLObject inference) {
		assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) " + tactic;
		assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
		final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
		final SubLObject rule_sets_to_problem = problem_rule_sets_relevant_to_inference(problem, inference);
		if (NIL == inference_worker_transformation.transformation_tactic_p(tactic)) {
			return rule_sets_to_problem;
		}
		final SubLObject lookahead_rule = inference_worker_transformation.transformation_tactic_lookahead_rule(tactic);
		if (NIL == lookahead_rule) {
			return rule_sets_to_problem;
		}
		SubLObject lookahead_rule_sets = NIL;
		SubLObject cdolist_list_var = rule_sets_to_problem;
		SubLObject rule_set_to_problem = NIL;
		rule_set_to_problem = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject lookahead_rule_set = adjoin(lookahead_rule, rule_set_to_problem, symbol_function(EQL), UNPROVIDED);
			final SubLObject item_var;
			lookahead_rule_set = item_var = assertion_utilities.sort_assertions(lookahead_rule_set);
			if (NIL == member(item_var, lookahead_rule_sets, symbol_function(EQUAL), symbol_function(IDENTITY))) {
				lookahead_rule_sets = cons(item_var, lookahead_rule_sets);
			}
			cdolist_list_var = cdolist_list_var.rest();
			rule_set_to_problem = cdolist_list_var.first();
		}
		return nreverse(lookahead_rule_sets);
	}

	public static SubLObject problem_link_path_rule_set(final SubLObject link_path) {
		SubLObject rules = NIL;
		SubLObject cdolist_list_var = link_path;
		SubLObject link = NIL;
		link = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != inference_worker_transformation.generalized_transformation_link_p(link)) {
				final SubLObject item_var;
				final SubLObject rule = item_var = inference_worker_transformation.generalized_transformation_link_rule_assertion(link);
				if (NIL == member(item_var, rules, symbol_function(EQL), symbol_function(IDENTITY))) {
					rules = cons(item_var, rules);
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			link = cdolist_list_var.first();
		}
		rules = assertion_utilities.sort_assertions(rules);
		return rules;
	}

	public static SubLObject strategic_heuristic_literal_count(final SubLObject strategy, final SubLObject problem) {
		final SubLObject literal_count = inference_datastructures_problem.problem_literal_count(problem, UNPROVIDED);
		final SubLObject happiness = strategic_heuristic_happiness_due_to_literal_count(literal_count);
		return happiness;
	}

	public static SubLObject strategic_heuristic_rule_literal_count(final SubLObject strategy, final SubLObject transformation_tactic) {
		if (NIL == inference_worker_transformation.transformation_tactic_p(transformation_tactic)) {
			return ZERO_INTEGER;
		}
		final SubLObject rule_assertion = inference_worker_transformation.transformation_tactic_lookahead_rule(transformation_tactic);
		if (NIL != rule_assertion) {
			final SubLObject literal_count = assertion_utilities.rule_literal_count(rule_assertion);
			final SubLObject happiness = strategic_heuristic_happiness_due_to_literal_count(literal_count);
			return happiness;
		}
		return ZERO_INTEGER;
	}

	public static SubLObject strategic_heuristic_happiness_due_to_literal_count(final SubLObject literal_count) {
		return numeric_table_lookup(literal_count, $strategic_heuristic_literal_count_lookup_table$.getGlobalValue(), UNPROVIDED);
	}

	public static SubLObject numeric_table_lookup(final SubLObject n, final SubLObject lookup_table, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		SubLObject cdolist_list_var = lookup_table;
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject input = NIL;
			SubLObject output = NIL;
			destructuring_bind_must_consp(current, datum, $list108);
			input = current.first();
			current = output = current.rest();
			if (NIL != number_utilities.potentially_infinite_number_LE(n, input)) {
				return output;
			}
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return v_default;
	}

	public static SubLObject strategic_heuristic_skolem_count(final SubLObject strategy, final SubLObject problem) {
		final SubLObject skolem_count = problem_skolem_count(problem);
		final SubLObject happiness = strategic_heuristic_happiness_due_to_skolem_count(skolem_count);
		return happiness;
	}

	public static SubLObject problem_skolem_count(final SubLObject problem) {
		final SubLObject query = inference_datastructures_problem.problem_query(problem);
		return list_utilities.tree_count_if(SKOLEM_FUNCTION_P, query, UNPROVIDED);
	}

	public static SubLObject strategic_heuristic_happiness_due_to_skolem_count(final SubLObject skolem_count) {
		return numeric_table_lookup(skolem_count, $strategic_heuristic_skolem_count_lookup_table$.getGlobalValue(), UNPROVIDED);
	}

	public static SubLObject strategic_heuristic_happiness_table(final SubLObject strategy, final SubLObject strategem, final SubLObject heuristics) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject happiness_table = NIL;
		SubLObject aggregate_happiness = ZERO_INTEGER;
		SubLObject iteration_state;
		for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(strategic_heuristic_index())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
			thread.resetMultipleValues();
			final SubLObject heuristic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			final SubLObject value = thread.secondMultipleValue();
			thread.resetMultipleValues();
			final SubLObject function = strategic_heuristic_function(heuristic);
			final SubLObject scaling_factor = strategic_heuristic_scaling_factor(heuristic);
			final SubLObject domain = strategic_heuristic_domain(heuristic);
			if ((NIL != do_strategic_heuristics_tactic_match_p(strategem, domain)) && (NIL != set.set_memberP(heuristic, heuristics))) {
				final SubLObject raw_happiness = funcall(function, strategy, strategem);
				if (!ZERO_INTEGER.eql(raw_happiness)) {
					final SubLObject scaled_happiness = number_utilities.potentially_infinite_integer_times(raw_happiness, scaling_factor);
					aggregate_happiness = number_utilities.potentially_infinite_integer_plus(aggregate_happiness, scaled_happiness);
					happiness_table = cons(list(heuristic, scaling_factor, raw_happiness, scaled_happiness), happiness_table);
				}
			}
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		happiness_table = Sort.sort(happiness_table, symbol_function($sym114$HAPPINESS__), symbol_function(THIRD));
		happiness_table = Sort.stable_sort(happiness_table, symbol_function($sym114$HAPPINESS__), symbol_function(FOURTH));
		return values(happiness_table, aggregate_happiness);
	}

	public static SubLObject strategic_heuristic_t_flows_like_wine(final SubLObject strategy, final SubLObject tactic) {
		if (NIL != inference_worker.structural_tactic_p(tactic)) {
			return ONE_INTEGER;
		}
		return ZERO_INTEGER;
	}

	public static SubLObject declare_inference_strategic_heuristics_file() {
		declareFunction(me, "strategic_heuristic_index", "STRATEGIC-HEURISTIC-INDEX", 0, 0, false);
		declareMacro(me, "do_strategic_heuristics", "DO-STRATEGIC-HEURISTICS");
		declareFunction(me, "do_strategic_heuristics_tactic_match_p", "DO-STRATEGIC-HEURISTICS-TACTIC-MATCH-P", 2, 0, false);
		declareFunction(me, "heuristic_domain_p", "HEURISTIC-DOMAIN-P", 1, 0, false);
		declareFunction(me, "object_in_heuristic_domainP", "OBJECT-IN-HEURISTIC-DOMAIN?", 2, 0, false);
		declareFunction(me, "new_strategic_heuristic_data", "NEW-STRATEGIC-HEURISTIC-DATA", 5, 0, false);
		declareFunction(me, "declare_strategic_heuristic", "DECLARE-STRATEGIC-HEURISTIC", 2, 0, false);
		declareFunction(me, "undeclare_strategic_heuristic", "UNDECLARE-STRATEGIC-HEURISTIC", 1, 0, false);
		declareFunction(me, "strategic_heuristic_function", "STRATEGIC-HEURISTIC-FUNCTION", 1, 0, false);
		declareFunction(me, "strategic_heuristic_scaling_factor", "STRATEGIC-HEURISTIC-SCALING-FACTOR", 1, 0, false);
		declareFunction(me, "strategic_heuristic_name", "STRATEGIC-HEURISTIC-NAME", 1, 0, false);
		declareFunction(me, "strategic_heuristic_pretty_name", "STRATEGIC-HEURISTIC-PRETTY-NAME", 1, 0, false);
		declareFunction(me, "strategic_heuristic_comment", "STRATEGIC-HEURISTIC-COMMENT", 1, 0, false);
		declareFunction(me, "strategic_heuristic_domain", "STRATEGIC-HEURISTIC-DOMAIN", 1, 0, false);
		declareFunction(me, "strategic_heuristic_shallow_and_cheap", "STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_shallow_and_cheap$BinaryFunction();
		declareFunction(me, "productivity_for_shallow_and_cheap_problem_heuristic", "PRODUCTIVITY-FOR-SHALLOW-AND-CHEAP-PROBLEM-HEURISTIC", 2, 0, false);
		declareFunction(me, "problem_strategic_uselessness_based_on_proof_depth", "PROBLEM-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH", 2, 0, false);
		declareFunction(me, "clear_strategic_uselessness_based_on_proof_depth_math_memoized", "CLEAR-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 0, 0, false);
		declareFunction(me, "remove_strategic_uselessness_based_on_proof_depth_math_memoized", "REMOVE-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 1, 0, false);
		declareFunction(me, "strategic_uselessness_based_on_proof_depth_math_memoized_internal", "STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-INTERNAL", 1, 0, false);
		declareFunction(me, "strategic_uselessness_based_on_proof_depth_math_memoized", "STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED", 1, 0, false);
		declareFunction(me, "strategic_heuristic_completeness", "STRATEGIC-HEURISTIC-COMPLETENESS", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_completeness$BinaryFunction();
		declareFunction(me, "strategic_heuristic_occams_razor", "STRATEGIC-HEURISTIC-OCCAMS-RAZOR", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_occams_razor$BinaryFunction();
		declareFunction(me, "strategic_heuristic_occams_razor_int", "STRATEGIC-HEURISTIC-OCCAMS-RAZOR-INT", 3, 0, false);
		declareFunction(me, "strategic_heuristic_occams_razor_tactic", "STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TACTIC", 2, 0, false);
		declareFunction(me, "strategic_heuristic_magic_wand", "STRATEGIC-HEURISTIC-MAGIC-WAND", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_magic_wand$BinaryFunction();
		declareFunction(me, "strategic_heuristic_backtracking", "STRATEGIC-HEURISTIC-BACKTRACKING", 2, 0, false);
		declareFunction(me, "executed_connected_conjunction_tactics_that_matter_count", "EXECUTED-CONNECTED-CONJUNCTION-TACTICS-THAT-MATTER-COUNT", 2, 0, false);
		declareFunction(me, "strategic_heuristic_backchain_required", "STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_backchain_required$BinaryFunction();
		declareFunction(me, "strategic_heuristic_rule_a_priori_utility", "STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_rule_a_priori_utility$BinaryFunction();
		declareFunction(me, "strategic_heuristic_rule_a_priori_utility_int", "STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY-INT", 3, 0, false);
		declareFunction(me, "push_problem_onto_heuristic_rule_a_priori_utility_stack", "PUSH-PROBLEM-ONTO-HEURISTIC-RULE-A-PRIORI-UTILITY-STACK", 1, 0, false);
		declareFunction(me, "problem_on_heuristic_rule_a_priori_utility_stackP", "PROBLEM-ON-HEURISTIC-RULE-A-PRIORI-UTILITY-STACK?", 1, 0, false);
		declareFunction(me, "count_a_priori_utility_recursive", "COUNT-A-PRIORI-UTILITY-RECURSIVE", 2, 0, false);
		declareFunction(me, "count_a_priori_utility_recursive_int_internal", "COUNT-A-PRIORI-UTILITY-RECURSIVE-INT-INTERNAL", 2, 0, false);
		declareFunction(me, "count_a_priori_utility_recursive_int", "COUNT-A-PRIORI-UTILITY-RECURSIVE-INT", 2, 0, false);
		declareFunction(me, "determine_tactic_heuristic_relevance_delta", "DETERMINE-TACTIC-HEURISTIC-RELEVANCE-DELTA", 1, 0, false);
		declareFunction(me, "generalized_transformation_link_relevantP", "GENERALIZED-TRANSFORMATION-LINK-RELEVANT?", 1, 0, false);
		declareFunction(me, "generalized_transformation_link_irrelevantP", "GENERALIZED-TRANSFORMATION-LINK-IRRELEVANT?", 1, 0, false);
		declareFunction(me, "generalized_transformation_link_has_rule_utilityP", "GENERALIZED-TRANSFORMATION-LINK-HAS-RULE-UTILITY?", 1, 0, false);
		declareFunction(me, "generalized_transformation_link_rule_utility", "GENERALIZED-TRANSFORMATION-LINK-RULE-UTILITY", 1, 0, false);
		declareFunction(me, "transformation_tactic_relevantP", "TRANSFORMATION-TACTIC-RELEVANT?", 1, 0, false);
		declareFunction(me, "transformation_tactic_irrelevantP", "TRANSFORMATION-TACTIC-IRRELEVANT?", 1, 0, false);
		declareFunction(me, "transformation_tactic_has_utilityP", "TRANSFORMATION-TACTIC-HAS-UTILITY?", 1, 0, false);
		declareFunction(me, "transformation_tactic_utility", "TRANSFORMATION-TACTIC-UTILITY", 1, 0, false);
		declareFunction(me, "rule_relevant_to_problemP", "RULE-RELEVANT-TO-PROBLEM?", 2, 0, false);
		declareFunction(me, "rule_irrelevant_to_problemP", "RULE-IRRELEVANT-TO-PROBLEM?", 2, 0, false);
		declareFunction(me, "rule_has_utility_wrt_problemP", "RULE-HAS-UTILITY-WRT-PROBLEM?", 2, 0, false);
		declareFunction(me, "transformation_rule_a_priori_utility", "TRANSFORMATION-RULE-A-PRIORI-UTILITY", 1, 0, false);
		declareFunction(me, "transformation_rule_a_priori_utility_happiness_internal", "TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS-INTERNAL", 1, 0, false);
		declareFunction(me, "transformation_rule_a_priori_utility_happiness", "TRANSFORMATION-RULE-A-PRIORI-UTILITY-HAPPINESS", 1, 0, false);
		declareFunction(me, "strategic_heuristic_problem_rule_a_priori_utility", "STRATEGIC-HEURISTIC-PROBLEM-RULE-A-PRIORI-UTILITY", 2, 0, false);
		declareFunction(me, "strategic_heuristic_relevant_term", "STRATEGIC-HEURISTIC-RELEVANT-TERM", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_relevant_term$BinaryFunction();
		declareFunction(me, "problem_relevant_or_irrelevant_term_count", "PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT", 1, 0, false);
		declareFunction(me, "problem_relevant_or_irrelevant_term_count_int_internal", "PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT-INT-INTERNAL", 1, 0, false);
		declareFunction(me, "problem_relevant_or_irrelevant_term_count_int", "PROBLEM-RELEVANT-OR-IRRELEVANT-TERM-COUNT-INT", 1, 0, false);
		declareFunction(me, "note_expression_relevant_or_irrelevant_terms", "NOTE-EXPRESSION-RELEVANT-OR-IRRELEVANT-TERMS", 1, 0, false);
		declareFunction(me, "accumulate_relevant_or_irrelevant_term", "ACCUMULATE-RELEVANT-OR-IRRELEVANT-TERM", 1, 0, false);
		declareFunction(me, "strategic_heuristic_rule_historical_utility_enabledP", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?", 0, 0, false);
		declareFunction(me, "enable_strategic_heuristic_rule_historical_utility", "ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 0, false);
		declareFunction(me, "disable_strategic_heuristic_rule_historical_utility", "DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 0, false);
		declareFunction(me, "strategic_heuristic_rule_historical_utility", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_rule_historical_utility$BinaryFunction();
		declareFunction(me, "strategic_heuristic_rule_historical_utility_int", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-INT", 3, 0, false);
		declareFunction(me, "push_problem_onto_rule_historical_utility_stack", "PUSH-PROBLEM-ONTO-RULE-HISTORICAL-UTILITY-STACK", 1, 0, false);
		declareFunction(me, "problem_on_rule_historical_utility_stackP", "PROBLEM-ON-RULE-HISTORICAL-UTILITY-STACK?", 1, 0, false);
		declareFunction(me, "compute_problem_rule_historical_utility_recursive", "COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE", 2, 0, false);
		declareFunction(me, "compute_problem_rule_historical_utility_recursive_int_internal", "COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE-INT-INTERNAL", 2, 0, false);
		declareFunction(me, "compute_problem_rule_historical_utility_recursive_int", "COMPUTE-PROBLEM-RULE-HISTORICAL-UTILITY-RECURSIVE-INT", 2, 0, false);
		declareFunction(me, "compute_tactic_rule_historical_utility", "COMPUTE-TACTIC-RULE-HISTORICAL-UTILITY", 1, 0, false);
		declareFunction(me, "inference_rule_preference_G", "INFERENCE-RULE-PREFERENCE->", 3, 0, false);
		declareFunction(me, "transformation_rule_utility_G", "TRANSFORMATION-RULE-UTILITY->", 2, 0, false);
		declareFunction(me, "transformation_rule_utility_G_with_tiebreaker", "TRANSFORMATION-RULE-UTILITY->-WITH-TIEBREAKER", 2, 0, false);
		declareFunction(me, "transformation_rule_utility_internal", "TRANSFORMATION-RULE-UTILITY-INTERNAL", 1, 0, false);
		declareFunction(me, "transformation_rule_utility", "TRANSFORMATION-RULE-UTILITY", 1, 0, false);
		declareFunction(me, "strategic_heuristic_problem_rule_historical_utility", "STRATEGIC-HEURISTIC-PROBLEM-RULE-HISTORICAL-UTILITY", 2, 0, false);
		declareFunction(me, "enable_rule_historical_connectedness", "ENABLE-RULE-HISTORICAL-CONNECTEDNESS", 0, 0, false);
		declareFunction(me, "disable_rule_historical_connectedness", "DISABLE-RULE-HISTORICAL-CONNECTEDNESS", 0, 0, false);
		declareFunction(me, "strategic_heuristic_rule_historical_connectedness", "STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS", 2, 0, false);
		declareFunction(me, "problem_link_paths_relevant_to_inference", "PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE", 2, 0, false);
		declareFunction(me, "cached_problem_link_paths_relevant_to_inference_internal", "CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE-INTERNAL", 2, 0, false);
		declareFunction(me, "cached_problem_link_paths_relevant_to_inference", "CACHED-PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE", 2, 0, false);
		declareFunction(me, "problem_link_paths_relevant_to_inference_recursive", "PROBLEM-LINK-PATHS-RELEVANT-TO-INFERENCE-RECURSIVE", 3, 0, false);
		declareFunction(me, "problem_rule_sets_relevant_to_inference", "PROBLEM-RULE-SETS-RELEVANT-TO-INFERENCE", 2, 0, false);
		declareFunction(me, "tactic_lookahead_rule_sets_relevant_to_inference", "TACTIC-LOOKAHEAD-RULE-SETS-RELEVANT-TO-INFERENCE", 2, 0, false);
		declareFunction(me, "problem_link_path_rule_set", "PROBLEM-LINK-PATH-RULE-SET", 1, 0, false);
		declareFunction(me, "strategic_heuristic_literal_count", "STRATEGIC-HEURISTIC-LITERAL-COUNT", 2, 0, false);
		declareFunction(me, "strategic_heuristic_rule_literal_count", "STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT", 2, 0, false);
		new inference_strategic_heuristics.$strategic_heuristic_rule_literal_count$BinaryFunction();
		declareFunction(me, "strategic_heuristic_happiness_due_to_literal_count", "STRATEGIC-HEURISTIC-HAPPINESS-DUE-TO-LITERAL-COUNT", 1, 0, false);
		declareFunction(me, "numeric_table_lookup", "NUMERIC-TABLE-LOOKUP", 2, 1, false);
		declareFunction(me, "strategic_heuristic_skolem_count", "STRATEGIC-HEURISTIC-SKOLEM-COUNT", 2, 0, false);
		declareFunction(me, "problem_skolem_count", "PROBLEM-SKOLEM-COUNT", 1, 0, false);
		declareFunction(me, "strategic_heuristic_happiness_due_to_skolem_count", "STRATEGIC-HEURISTIC-HAPPINESS-DUE-TO-SKOLEM-COUNT", 1, 0, false);
		declareFunction(me, "strategic_heuristic_happiness_table", "STRATEGIC-HEURISTIC-HAPPINESS-TABLE", 3, 0, false);
		declareFunction(me, "strategic_heuristic_t_flows_like_wine", "STRATEGIC-HEURISTIC-T-FLOWS-LIKE-WINE", 2, 0, false);
		return NIL;
	}

	public static SubLObject init_inference_strategic_heuristics_file() {
		deflexical("*STRATEGIC-HEURISTIC-INDEX*", SubLSystemTrampolineFile.maybeDefault($strategic_heuristic_index$, $strategic_heuristic_index$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
		deflexical("*HEURISTIC-DOMAINS*", $list17);
		defvar("*OVERRIDING-STRATEGIC-HEURISTIC-SCALING-FACTORS*", NIL);
		deflexical("*STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED-CACHING-STATE*", NIL);
		deflexical("*STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TABLE*", $list46);
		deflexical("*STRATEGIC-HEURISTIC-OCCAMS-RAZOR-TABLE-DEFAULT*", $int$_100);
		defvar("*BACKTRACKING-CONSIDERED-HARMFUL?*", T);
		deflexical("*STRATEGIC-HEURISTIC-BACKTRACKING-TABLE*", $list58);
		deflexical("*STRATEGIC-HEURISTIC-BACKTRACKING-TABLE-DEFAULT*", $int$_100);
		defvar("*EARLY-REMOVAL-PRODUCTIVITY-THRESHOLD*", $int$400);
		defparameter("*HEURISTIC-RULE-A-PRIORI-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
		defvar("*HIGHLY-RELEVANT-TERM-ENABLED?*", T);
		defparameter("*RELEVANT-TERM-SET*", NIL);
		defparameter("*IRRELEVANT-TERM-SET*", NIL);
		defvar("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?*", T);
		defparameter("*HEURISTIC-RULE-HISTORICAL-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
		defparameter("*STRATEGIC-HEURISTIC-RULE-HISTORICAL-CONNECTEDNESS-ENABLED?*", NIL);
		deflexical("*STRATEGIC-HEURISTIC-LITERAL-COUNT-LOOKUP-TABLE*", $list107);
		deflexical("*STRATEGIC-HEURISTIC-SKOLEM-COUNT-LOOKUP-TABLE*", $list113);
		return NIL;
	}

	public static SubLObject setup_inference_strategic_heuristics_file() {
		declare_defglobal($strategic_heuristic_index$);
		register_macro_helper(STRATEGIC_HEURISTIC_INDEX, DO_STRATEGIC_HEURISTICS);
		register_macro_helper(DO_STRATEGIC_HEURISTICS_TACTIC_MATCH_P, DO_STRATEGIC_HEURISTICS);
		declare_strategic_heuristic($SHALLOW_AND_CHEAP, $list35);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_SHALLOW_AND_CHEAP);
		memoization_state.note_globally_cached_function(STRATEGIC_USELESSNESS_BASED_ON_PROOF_DEPTH_MATH_MEMOIZED);
		declare_strategic_heuristic($COMPLETENESS, $list41);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_COMPLETENESS);
		declare_strategic_heuristic($OCCAMS_RAZOR, $list45);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_OCCAMS_RAZOR);
		declare_strategic_heuristic($OCCAMS_RAZOR_TACTIC, $list50);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_OCCAMS_RAZOR_TACTIC);
		declare_strategic_heuristic($MAGIC_WAND, $list53);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_MAGIC_WAND);
		declare_strategic_heuristic($BACKTRACKING_CONSIDERED_HARMFUL, $list57);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_BACKTRACKING);
		declare_strategic_heuristic($BACKCHAIN_REQUIRED, $list64);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_BACKCHAIN_REQUIRED);
		declare_strategic_heuristic($RULE_A_PRIORI_UTILITY, $list68);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_RULE_A_PRIORI_UTILITY);
		memoization_state.note_memoized_function(COUNT_A_PRIORI_UTILITY_RECURSIVE_INT);
		memoization_state.note_memoized_function(TRANSFORMATION_RULE_A_PRIORI_UTILITY_HAPPINESS);
		declare_strategic_heuristic($PROBLEM_RULE_A_PRIORI_UTILITY, $list74);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_PROBLEM_RULE_A_PRIORI_UTILITY);
		declare_strategic_heuristic($RELEVANT_TERM, $list77);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_RELEVANT_TERM);
		memoization_state.note_memoized_function(PROBLEM_RELEVANT_OR_IRRELEVANT_TERM_COUNT_INT);
		note_funcall_helper_function(ACCUMULATE_RELEVANT_OR_IRRELEVANT_TERM);
		declare_strategic_heuristic($RULE_HISTORICAL_UTILITY, $list85);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY);
		memoization_state.note_memoized_function(COMPUTE_PROBLEM_RULE_HISTORICAL_UTILITY_RECURSIVE_INT);
		memoization_state.note_memoized_function(TRANSFORMATION_RULE_UTILITY);
		declare_strategic_heuristic($PROBLEM_RULE_HISTORICAL_UTILITY, $list91);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_PROBLEM_RULE_HISTORICAL_UTILITY);
		declare_strategic_heuristic($RULE_HISTORICAL_CONNECTEDNESS, $list94);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_RULE_HISTORICAL_CONNECTEDNESS);
		memoization_state.note_memoized_function(CACHED_PROBLEM_LINK_PATHS_RELEVANT_TO_INFERENCE);
		declare_strategic_heuristic($LITERAL_COUNT, $list102);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_LITERAL_COUNT);
		declare_strategic_heuristic($RULE_LITERAL_COUNT, $list105);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_RULE_LITERAL_COUNT);
		declare_strategic_heuristic($SKOLEM_COUNT, $list110);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_SKOLEM_COUNT);
		declare_strategic_heuristic($T_FLOWS_LIKE_WINE, $list118);
		note_funcall_helper_function(STRATEGIC_HEURISTIC_T_FLOWS_LIKE_WINE);
		return NIL;
	}

	@Override
	public void declareFunctions() {
		declare_inference_strategic_heuristics_file();
	}

	@Override
	public void initializeVariables() {
		init_inference_strategic_heuristics_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_inference_strategic_heuristics_file();
	}

	

	public static final class $strategic_heuristic_shallow_and_cheap$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_shallow_and_cheap$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-SHALLOW-AND-CHEAP"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_shallow_and_cheap(arg1, arg2);
		}
	}

	public static final class $strategic_heuristic_completeness$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_completeness$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-COMPLETENESS"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_completeness(arg1, arg2);
		}
	}

	public static final class $strategic_heuristic_occams_razor$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_occams_razor$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-OCCAMS-RAZOR"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_occams_razor(arg1, arg2);
		}
	}

	public static final class $strategic_heuristic_magic_wand$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_magic_wand$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-MAGIC-WAND"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_magic_wand(arg1, arg2);
		}
	}

	public static final class $strategic_heuristic_backchain_required$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_backchain_required$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-BACKCHAIN-REQUIRED"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_backchain_required(arg1, arg2);
		}
	}

	public static final class $strategic_heuristic_rule_a_priori_utility$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_rule_a_priori_utility$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-A-PRIORI-UTILITY"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_rule_a_priori_utility(arg1, arg2);
		}
	}

	public static final class $strategic_heuristic_relevant_term$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_relevant_term$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-RELEVANT-TERM"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_relevant_term(arg1, arg2);
		}
	}

	public static final class $strategic_heuristic_rule_historical_utility$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_rule_historical_utility$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_rule_historical_utility(arg1, arg2);
		}
	}

	public static final class $strategic_heuristic_rule_literal_count$BinaryFunction extends BinaryFunction {
		public $strategic_heuristic_rule_literal_count$BinaryFunction() {
			super(extractFunctionNamed("STRATEGIC-HEURISTIC-RULE-LITERAL-COUNT"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
			return strategic_heuristic_rule_literal_count(arg1, arg2);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param heuristic
	 * @return
	 */
	public static SubLObject strategic_heuristic_tactic_type(SubLObject heuristic) {
		// TODO Auto-generated method stub
		if (true)
			Errors.unimplementedMethod(myName);
		return null;
	}
}

/**
 * Total time: 510 ms
 */
