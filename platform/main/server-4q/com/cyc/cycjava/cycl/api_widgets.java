package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_utilities.cyclist_recent_terms;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.atomic_sentenceP;
import static com.cyc.cycjava.cycl.el_utilities.copy_expression;
import static com.cyc.cycjava.cycl.el_utilities.copy_sentence;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_any_of_operators_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.literalP;
import static com.cyc.cycjava.cycl.el_utilities.literal_variables;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.el_utilities.make_quaternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_unary_formula;
import static com.cyc.cycjava.cycl.el_utilities.optimize_el_formula_variable_names;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.sentence_variables;
import static com.cyc.cycjava.cycl.html_utilities.remove_html_tags;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.constantp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gentemp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.butlast;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.caar;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class api_widgets extends SubLTranslatedFile {
	public static final SubLFile me = new api_widgets();

	public static final String myName = "com.cyc.cycjava.cycl.api_widgets";

	public static final String myFingerPrint = "e880f956455fecea3332fe3c1dbcc37eb54ecb12b378d0c14f7132a19b11921e";

	// defconstant
	public static final SubLSymbol $dtp_foo$ = makeSymbol("*DTP-FOO*");

	// defparameter
	public static final SubLSymbol $a_foo$ = makeSymbol("*A-FOO*");

	// deflexical
	// The lock that gates access to the API widget session resources.
	private static final SubLSymbol $api_widget_session_resource_lock$ = makeSymbol("*API-WIDGET-SESSION-RESOURCE-LOCK*");

	// deflexical
	private static final SubLSymbol $api_widgets_get_collection_instances_arg_cooccurrence$ = makeSymbol("*API-WIDGETS-GET-COLLECTION-INSTANCES-ARG-COOCCURRENCE*");

	// defparameter
	private static final SubLSymbol $ws_instance_dict$ = makeSymbol("*WS-INSTANCE-DICT*");

	// defparameter
	private static final SubLSymbol $ws_spec_dict$ = makeSymbol("*WS-SPEC-DICT*");

	// deflexical
	public static final SubLSymbol $sparql_endpoint_browser_format_string$ = makeSymbol("*SPARQL-ENDPOINT-BROWSER-FORMAT-STRING*");

	// defconstant
	/**
	 * This is the text of the link in a mini fact sheet to the normal fact sheet.
	 */
	public static final SubLSymbol $mini_fact_sheet_to_fact_sheet_link_text$ = makeSymbol("*MINI-FACT-SHEET-TO-FACT-SHEET-LINK-TEXT*");

	// defparameter
	// The mt in which to assert evaluations of facts displayed in the FET.
	public static final SubLSymbol $fet_evaluation_mt$ = makeSymbol("*FET-EVALUATION-MT*");

	// deflexical
	public static final SubLSymbol $future_assertion_message_string$ = makeSymbol("*FUTURE-ASSERTION-MESSAGE-STRING*");

	// deflexical
	private static final SubLSymbol $microtheory_indexical_referent_current_mt$ = makeSymbol("*MICROTHEORY-INDEXICAL-REFERENT-CURRENT-MT*");

	// deflexical
	private static final SubLSymbol $microtheory_mentioning_constructs$ = makeSymbol("*MICROTHEORY-MENTIONING-CONSTRUCTS*");

	// deflexical
	private static final SubLSymbol $api_widgets_strip_nl_tagsP$ = makeSymbol("*API-WIDGETS-STRIP-NL-TAGS?*");

	// defparameter
	/**
	 * Should newly-created InstanceNamedFn-Ternary NATS be returned separately from
	 * the rest of the parsing results?
	 */
	public static final SubLSymbol $api_widget_return_new_cycls_separatelyP$ = makeSymbol("*API-WIDGET-RETURN-NEW-CYCLS-SEPARATELY?*");

	// defparameter
	/**
	 * How much time should be spent querying for extended senses for a name string
	 */
	private static final SubLSymbol $get_extended_cycls_for_string_timeout$ = makeSymbol("*GET-EXTENDED-CYCLS-FOR-STRING-TIMEOUT*");

	// defparameter
	// How much time should be spent querying for each coerced type
	private static final SubLSymbol $get_coerced_cycls_timeout$ = makeSymbol("*GET-COERCED-CYCLS-TIMEOUT*");

	// defparameter
	private static final SubLSymbol $nl_coercion_mt$ = makeSymbol("*NL-COERCION-MT*");

	// deflexical
	/**
	 * the indicator whether diagnostic traces get displayed for the function
	 * get-cycls-for-string-escalating
	 */
	public static final SubLSymbol $trace_get_cycls_for_string_escalatingP$ = makeSymbol("*TRACE-GET-CYCLS-FOR-STRING-ESCALATING?*");

	// deflexical
	private static final SubLSymbol $constrained_cycls_from_generation_cardinality_cutoff$ = makeSymbol("*CONSTRAINED-CYCLS-FROM-GENERATION-CARDINALITY-CUTOFF*");

	// deflexical
	private static final SubLSymbol $constrained_cycls_for_regular_expression_cardinality_cutoff$ = makeSymbol("*CONSTRAINED-CYCLS-FOR-REGULAR-EXPRESSION-CARDINALITY-CUTOFF*");

	// deflexical
	public static final SubLSymbol $template_topic_match_missing_term_variable$ = makeSymbol("*TEMPLATE-TOPIC-MATCH-MISSING-TERM-VARIABLE*");

	// deflexical
	private static final SubLSymbol $use_topic_defining_mt_when_passed_everything_pscP$ = makeSymbol("*USE-TOPIC-DEFINING-MT-WHEN-PASSED-EVERYTHING-PSC?*");

	// defparameter
	private static final SubLSymbol $everything_psc_dwimmed_awayP$ = makeSymbol("*EVERYTHING-PSC-DWIMMED-AWAY?*");

	// deflexical
	private static final SubLSymbol $fet_categorized_source_pred$ = makeSymbol("*FET-CATEGORIZED-SOURCE-PRED*");

	// deflexical
	private static final SubLSymbol $fet_empty_source_dictionary$ = makeSymbol("*FET-EMPTY-SOURCE-DICTIONARY*");

	// deflexical
	private static final SubLSymbol $term_qua_inference_answer_pattern$ = makeSymbol("*TERM-QUA-INFERENCE-ANSWER-PATTERN*");

	// deflexical
	// the list of terms that are can always be included in an OWL-exported rule
	private static final SubLSymbol $owl_exportable_definitional_terms$ = makeSymbol("*OWL-EXPORTABLE-DEFINITIONAL-TERMS*");

	// deflexical
	// A set representation of the owl-exportable list
	private static final SubLSymbol $owl_exportable_definitional_term_set$ = makeSymbol("*OWL-EXPORTABLE-DEFINITIONAL-TERM-SET*");

	// deflexical
	/**
	 * indicates whether to perform the expensive expansion of rules to perhaps
	 * obtain additional OWL exportable rules
	 */
	public static final SubLSymbol $allow_expanded_rules_as_owl_export_candidatesP$ = makeSymbol("*ALLOW-EXPANDED-RULES-AS-OWL-EXPORT-CANDIDATES?*");

	public static final SubLSymbol FOO_P = makeSymbol("FOO-P");

	public static final SubLList $list2 = list(makeSymbol("BAR"));

	public static final SubLList $list3 = list(makeKeyword("BAR"));

	public static final SubLList $list4 = list(makeSymbol("FOO-BAR"));

	public static final SubLList $list5 = list(makeSymbol("_CSETF-FOO-BAR"));

	public static final SubLSymbol FOO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FOO-PRINT-FUNCTION-TRAMPOLINE");

	private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FOO-P"));

	private static final SubLSymbol FOO_BAR = makeSymbol("FOO-BAR");

	private static final SubLSymbol _CSETF_FOO_BAR = makeSymbol("_CSETF-FOO-BAR");

	private static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

	private static final SubLSymbol MAKE_FOO = makeSymbol("MAKE-FOO");

	private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FOO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FOO-METHOD");

	private static final SubLSymbol GET_CYC_ID_FOR_WEB_ID = makeSymbol("GET-CYC-ID-FOR-WEB-ID");

	private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

	private static final SubLObject $$Cyclist = reader_make_constant_shell(makeString("Cyclist"));

	private static final SubLString $str23$__A__is_not_a_known___Cyclist___ = makeString("'~A' is not a known #$Cyclist.~%");

	private static final SubLString $$$Api_Widget_Session_Resource_Lock = makeString("Api Widget Session Resource Lock");

	private static final SubLSymbol $api_widget_session_resource_map$ = makeSymbol("*API-WIDGET-SESSION-RESOURCE-MAP*");

	private static final SubLSymbol REGISTER_API_SESSION_CLEANUP_FORM = makeSymbol("REGISTER-API-SESSION-CLEANUP-FORM");

	private static final SubLString $str29$Clean_up_form__A_for_session__A_e = makeString("Clean-up form ~A for session ~A executed with an error: ~A");

	private static final SubLSymbol DECLARE_SESSION_SYMBOL = makeSymbol("DECLARE-SESSION-SYMBOL");

	private static final SubLSymbol MAKUNBOUND = makeSymbol("MAKUNBOUND");

	private static final SubLSymbol FIND_SYMBOL = makeSymbol("FIND-SYMBOL");

	private static final SubLSymbol UNINTERN = makeSymbol("UNINTERN");

	private static final SubLSymbol GET_COLLECTION_INSTANCES = makeSymbol("GET-COLLECTION-INSTANCES");

	private static final SubLSymbol $get_collection_instances_caching_state$ = makeSymbol("*GET-COLLECTION-INSTANCES-CACHING-STATE*");

	private static final SubLList $list39 = list(NIL, NIL);

	private static final SubLSymbol COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");

	private static final SubLSymbol FIND_FOR_WS = makeSymbol("FIND-FOR-WS");

	private static final SubLString $$$externalId = makeString("externalId");

	private static final SubLString $$$cycl = makeString("cycl");

	private static final SubLString $str44$_ = makeString("(");

	private static final SubLList $list45 = list(makeString("anyNl"), makeString("nl"));

	private static final SubLSymbol GET_INSTANCES_FOR_WS = makeSymbol("GET-INSTANCES-FOR-WS");

	private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

	private static final SubLInteger $int$250 = makeInteger(250);

	private static final SubLSymbol $sym50$_X = makeSymbol("?X");

	private static final SubLObject $$assertedSentence = reader_make_constant_shell(makeString("assertedSentence"));

	private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

	private static final SubLList $list54 = list(makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"));

	private static final SubLSymbol GET_WS_INSTANCE_ITERATOR = makeSymbol("GET-WS-INSTANCE-ITERATOR");

	private static final SubLSymbol $get_ws_instance_iterator_caching_state$ = makeSymbol("*GET-WS-INSTANCE-ITERATOR-CACHING-STATE*");

	private static final SubLSymbol GET_SPECS_FOR_WS = makeSymbol("GET-SPECS-FOR-WS");

	private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

	private static final SubLSymbol GET_WS_SPEC_ITERATOR = makeSymbol("GET-WS-SPEC-ITERATOR");

	private static final SubLSymbol $get_ws_spec_iterator_caching_state$ = makeSymbol("*GET-WS-SPEC-ITERATOR-CACHING-STATE*");

	private static final SubLSymbol GET_ISAS_FOR_WS = makeSymbol("GET-ISAS-FOR-WS");

	private static final SubLSymbol GET_ISAS_FOR_WS_INT = makeSymbol("GET-ISAS-FOR-WS-INT");

	private static final SubLList $list64 = list(makeSymbol("?X"));

	private static final SubLSymbol $get_isas_for_ws_int_caching_state$ = makeSymbol("*GET-ISAS-FOR-WS-INT-CACHING-STATE*");

	private static final SubLSymbol CLEAR_GET_ISAS_FOR_WS_INT = makeSymbol("CLEAR-GET-ISAS-FOR-WS-INT");

	private static final SubLSymbol ALL_GENLS_IN_MT = makeSymbol("ALL-GENLS-IN-MT");

	private static final SubLSymbol GET_GENLS_FOR_WS = makeSymbol("GET-GENLS-FOR-WS");

	private static final SubLSymbol GET_GENLS_FOR_WS_INT = makeSymbol("GET-GENLS-FOR-WS-INT");

	private static final SubLSymbol $get_genls_for_ws_int_caching_state$ = makeSymbol("*GET-GENLS-FOR-WS-INT-CACHING-STATE*");

	private static final SubLSymbol CLEAR_GET_GENLS_FOR_WS_INT = makeSymbol("CLEAR-GET-GENLS-FOR-WS-INT");

	private static final SubLSymbol GET_INSTANCES_IN_NL = makeSymbol("GET-INSTANCES-IN-NL");

	private static final SubLSymbol $sym82$SET_OR_COLLECTION_ = makeSymbol("SET-OR-COLLECTION?");

	private static final SubLSymbol GET_INSTANCES_AS_RENDERINGS_NEW = makeSymbol("GET-INSTANCES-AS-RENDERINGS-NEW");

	private static final SubLSymbol RELEVANT_MT_IS_SPEC_MT = makeSymbol("RELEVANT-MT-IS-SPEC-MT");

	private static final SubLSymbol DEFAULT_NL_PREDS_FOR_TYPE_LIST = makeSymbol("DEFAULT-NL-PREDS-FOR-TYPE-LIST");

	private static final SubLSymbol $default_nl_preds_for_type_list_caching_state$ = makeSymbol("*DEFAULT-NL-PREDS-FOR-TYPE-LIST-CACHING-STATE*");

	private static final SubLSymbol GET_INSTANCES_AS_RENDERINGS = makeSymbol("GET-INSTANCES-AS-RENDERINGS");

	private static final SubLSymbol PPH_LIST_ITEM_COMPARATOR = makeSymbol("PPH-LIST-ITEM-COMPARATOR");

	private static final SubLSymbol $get_instances_as_renderings_caching_state$ = makeSymbol("*GET-INSTANCES-AS-RENDERINGS-CACHING-STATE*");

	private static final SubLSymbol GET_TERM_LIST_AS_RENDERINGS = makeSymbol("GET-TERM-LIST-AS-RENDERINGS");

	private static final SubLObject $$nonPlural_Generic = reader_make_constant_shell(makeString("nonPlural-Generic"));

	private static final SubLSymbol GET_TERM_LIST_AS_RENDERINGS_WITH_FACT_SHEETS = makeSymbol("GET-TERM-LIST-AS-RENDERINGS-WITH-FACT-SHEETS");

	private static final SubLList $list99 = list(makeKeyword("DISPLAY-TITLE?"), NIL, makeKeyword("PRINT-STATS?"), NIL, makeKeyword("SHOW-COPYRIGHT?"), NIL);

	private static final SubLList $list100 = list(makeSymbol("RENDERING"), makeSymbol("TERM"));

	private static final SubLString $str101$http____A__D_browse_uri__A_action = makeString("http://~A:~D/browse?uri=~A&action=resource");

	private static final SubLSymbol GET_EXTERNAL_TERM_BROWSER_URL = makeSymbol("GET-EXTERNAL-TERM-BROWSER-URL");

	private static final SubLSymbol $sym103$_MT = makeSymbol("?MT");

	private static final SubLSymbol $sym104$_SERVER = makeSymbol("?SERVER");

	private static final SubLSymbol $sym105$_PORT = makeSymbol("?PORT");

	private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

	private static final SubLObject $$mappingMt = reader_make_constant_shell(makeString("mappingMt"));

	private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

	private static final SubLObject $$serverOfSKS = reader_make_constant_shell(makeString("serverOfSKS"));

	private static final SubLList $list110 = list(reader_make_constant_shell(makeString("RDFTripleStore-Physical")));

	private static final SubLObject $$portNumberForSKS = reader_make_constant_shell(makeString("portNumberForSKS"));

	private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

	private static final SubLList $list113 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-NUMBER"), ONE_INTEGER);

	private static final SubLList $list114 = list(makeSymbol("HOSTNAME"), makeSymbol("PORT"));

	private static final SubLSymbol GET_TERM_LIST_AS_RENDERINGS_WITH_FACT_SHEETS_STRIPPED = makeSymbol("GET-TERM-LIST-AS-RENDERINGS-WITH-FACT-SHEETS-STRIPPED");

	private static final SubLString $str116$_Fact_Sheet_ = makeString("[Fact Sheet]");

	private static final SubLList $list117 = list(CHAR_newline);

	private static final SubLSymbol CONVERT_TERM_LIST_TO_RENDERINGS_FOR_JAVA = makeSymbol("CONVERT-TERM-LIST-TO-RENDERINGS-FOR-JAVA");

	private static final SubLSymbol CONVERT_TERM_LIST_TO_RENDERINGS_FOR_JAVA_INT = makeSymbol("CONVERT-TERM-LIST-TO-RENDERINGS-FOR-JAVA-INT");

	private static final SubLSymbol SALIENT_INSTANTIATION_EXEMPLARS = makeSymbol("SALIENT-INSTANTIATION-EXEMPLARS");

	private static final SubLSymbol $sym125$_ = makeSymbol(">");

	private static final SubLSymbol GET_EXAMPLE_INSTANCES_AS_RENDERINGS_NEW = makeSymbol("GET-EXAMPLE-INSTANCES-AS-RENDERINGS-NEW");

	private static final SubLSymbol GET_EXAMPLE_INSTANCES_AS_RENDERINGS = makeSymbol("GET-EXAMPLE-INSTANCES-AS-RENDERINGS");

	private static final SubLSymbol $get_example_instances_as_renderings_caching_state$ = makeSymbol("*GET-EXAMPLE-INSTANCES-AS-RENDERINGS-CACHING-STATE*");

	private static final SubLSymbol GET_SALIENT_EXEMPLARS = makeSymbol("GET-SALIENT-EXEMPLARS");

	private static final SubLSymbol $get_salient_exemplars_caching_state$ = makeSymbol("*GET-SALIENT-EXEMPLARS-CACHING-STATE*");

	private static final SubLSymbol GET_COLLECTION_EXTENT_ESTIMATES = makeSymbol("GET-COLLECTION-EXTENT-ESTIMATES");

	private static final SubLInteger $int$500 = makeInteger(500);

	private static final SubLObject $$Set_Mathematical = reader_make_constant_shell(makeString("Set-Mathematical"));

	private static final SubLSymbol GET_COLLECTION_EXTENT_ESTIMATES_NEW = makeSymbol("GET-COLLECTION-EXTENT-ESTIMATES-NEW");

	private static final SubLSymbol CREATE_NEW_INSTANCE_FROM_TEMPLATE = makeSymbol("CREATE-NEW-INSTANCE-FROM-TEMPLATE");

	private static final SubLString $str138$ = makeString("");

	private static final SubLSymbol KILL_CONSTANT = makeSymbol("KILL-CONSTANT");

	private static final SubLSymbol KILL_FORT = makeSymbol("KILL-FORT");

	private static final SubLList $list142 = cons(makeSymbol("COLLECTION"), makeSymbol("MT"));

	private static final SubLSymbol $sym143$_WHAT = makeSymbol("?WHAT");

	private static final SubLList $list144 = list(makeSymbol("BINDINGS"), makeSymbol("ASSERTION-LIST"));

	private static final SubLSymbol GET_REFORMULATION_SPECIFICATION_FROM_KB = makeSymbol("GET-REFORMULATION-SPECIFICATION-FROM-KB");

	private static final SubLSymbol $get_reformulation_specification_from_kb_caching_state$ = makeSymbol("*GET-REFORMULATION-SPECIFICATION-FROM-KB-CACHING-STATE*");

	private static final SubLSymbol REFORMULATE_UNKNOWN_FET_TERM = makeSymbol("REFORMULATE-UNKNOWN-FET-TERM");

	private static final SubLObject $$FET_UnknownTermReformulation = reader_make_constant_shell(makeString("FET-UnknownTermReformulation"));

	private static final SubLObject $$FETReformulatorRulesMt = reader_make_constant_shell(makeString("FETReformulatorRulesMt"));

	private static final SubLObject $$TKBEvaluatedSentencesMt = reader_make_constant_shell(makeString("TKBEvaluatedSentencesMt"));

	private static final SubLSymbol MAKE_FET_EVALUATION_ASSERTION = makeSymbol("MAKE-FET-EVALUATION-ASSERTION");

	private static final SubLSymbol FORT_OR_NAUT_P = makeSymbol("FORT-OR-NAUT-P");

	private static final SubLSymbol $sym154$PREDICATE_ = makeSymbol("PREDICATE?");

	private static final SubLString $$$EvaluationOfAssertionByOnFn = makeString("EvaluationOfAssertionByOnFn");

	private static final SubLString $str156$Couldn_t_find_constant___Evaluati = makeString("Couldn't find constant #$EvaluationOfAssertionByOnFn.");

	private static final SubLObject $$evaluationOutputSentences = reader_make_constant_shell(makeString("evaluationOutputSentences"));

	private static final SubLString $str158$Couldn_t_remove_all_pre_existing_ = makeString("Couldn't remove all pre-existing evaluations because ");

	private static final SubLString $$$Evaluation = makeString("Evaluation");

	private static final SubLList $list160 = list(reader_make_constant_shell(makeString("Evaluating")), reader_make_constant_shell(makeString("SingleDoerAction")));

	private static final SubLString $$$FET = makeString("FET");

	private static final SubLSymbol $sym162$_EVALUATION = makeSymbol("?EVALUATION");

	private static final SubLList $list163 = list(makeSymbol("??TIMESTAMP"));

	private static final SubLList $list164 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));

	private static final SubLList $list165 = list(makeSymbol("??EVALUATOR"), makeSymbol("??TIMESTAMP"));

	private static final SubLSymbol ADD_OR_EDIT_ASSERTION_VERBOSE = makeSymbol("ADD-OR-EDIT-ASSERTION-VERBOSE");

	private static final SubLSymbol ADD_OR_EDIT_ASSERTION = makeSymbol("ADD-OR-EDIT-ASSERTION");

	private static final SubLSymbol CYCL_FORMULA_P = makeSymbol("CYCL-FORMULA-P");

	private static final SubLString $str170$OLD____NEW__nothing_to_be_done_ = makeString("OLD == NEW, nothing to be done.");

	private static final SubLObject $$futureAssertion = reader_make_constant_shell(makeString("futureAssertion"));

	private static final SubLSymbol $sym172$VALID_ASSERTION_ = makeSymbol("VALID-ASSERTION?");

	private static final SubLString $str173$Assertion_deemed_invalid_ = makeString("Assertion deemed invalid.");

	private static final SubLString $str174$No_such_sentence_to_unassert_ = makeString("No such sentence to unassert.");

	private static final SubLString $str175$Couldn_t_kill_narts__ = makeString("Couldn't kill narts: ");

	private static final SubLSymbol $sym176$SKOLEM_NART_ = makeSymbol("SKOLEM-NART?");

	private static final SubLString $str177$Future_assertion_only_possibility = makeString("Future assertion only possibility.");

	private static final SubLSymbol $future_assertion_counter$ = makeSymbol("*FUTURE-ASSERTION-COUNTER*");

	private static final SubLString $$$unknown_reason = makeString("unknown reason");

	private static final SubLString $str180$__D__replace__S_with__S__Reason__ = makeString("#~D: replace ~S with ~S (Reason: ~A)");

	private static final SubLString $str181$__D___S_failed__Reason___A_ = makeString("#~D: ~S failed (Reason: ~A)");

	private static final SubLList $list182 = list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Microtheory")));

	private static final SubLList $list183 = list(reader_make_constant_shell(makeString("ist")), reader_make_constant_shell(makeString("ist-Intermediate")));

	private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

	private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

	private static final SubLSymbol CAE_APPLICABLE_TEMPLATE_TOPICS_FOR_TERM = makeSymbol("CAE-APPLICABLE-TEMPLATE-TOPICS-FOR-TERM");

	private static final SubLString $str187$54e34312_5181_11d7_87a9_0002b3620 = makeString("54e34312-5181-11d7-87a9-0002b3620a69");

	private static final SubLObject $$CAEUsableFETTemplateTopic = reader_make_constant_shell(makeString("CAEUsableFETTemplateTopic"));

	private static final SubLSymbol GET_CAE_TEMPLATE_TOPICS = makeSymbol("GET-CAE-TEMPLATE-TOPICS");

	private static final SubLObject $const190$titleForFormulaTemplateType_Strin = reader_make_constant_shell(makeString("titleForFormulaTemplateType-String"));

	private static final SubLString $str191$_S = makeString("~S");

	private static final SubLSymbol $sym192$STRING_ = makeSymbol("STRING<");

	private static final SubLList $list193 = cons(makeSymbol("TEMPLATE"), makeSymbol("STRING"));

	private static final SubLSymbol GATHER_TEMPORAL_CONCEPTS_FOR_CAE = makeSymbol("GATHER-TEMPORAL-CONCEPTS-FOR-CAE");

	private static final SubLSymbol CHLMT_P = makeSymbol("CHLMT-P");

	private static final SubLList $list196 = cons(makeSymbol("VAR"), makeSymbol("COLS"));

	private static final SubLObject $$TemporallyExtendedThing = reader_make_constant_shell(makeString("TemporallyExtendedThing"));

	private static final SubLSymbol GET_SHARED_COMMENTS = makeSymbol("GET-SHARED-COMMENTS");

	private static final SubLObject $$sharedNotes = reader_make_constant_shell(makeString("sharedNotes"));

	private static final SubLObject $$comment = reader_make_constant_shell(makeString("comment"));

	private static final SubLList $list202 = list(list(makeSymbol("SENTENCE"), makeSymbol("ARG-POS"), makeSymbol("CONSTRAINING-COLLECTION"), makeSymbol("DOMAIN-MT"), makeSymbol("FILTER-FN")), makeSymbol("&BODY"), makeSymbol("BODY"));

	private static final SubLSymbol $parse_sentence_context$ = makeSymbol("*PARSE-SENTENCE-CONTEXT*");

	private static final SubLSymbol $parse_arg_pos$ = makeSymbol("*PARSE-ARG-POS*");

	private static final SubLSymbol $parse_constraining_collection$ = makeSymbol("*PARSE-CONSTRAINING-COLLECTION*");

	private static final SubLSymbol $parse_domain_mt$ = makeSymbol("*PARSE-DOMAIN-MT*");

	private static final SubLSymbol $parse_filter_fn$ = makeSymbol("*PARSE-FILTER-FN*");

	private static final SubLObject $$MtUnionFn = reader_make_constant_shell(makeString("MtUnionFn"));

	private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

	private static final SubLObject $$TKBSourceSpindleCollectorMt = reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"));

	private static final SubLList $list212 = list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"));

	private static final SubLObject $$SpecsFn = reader_make_constant_shell(makeString("SpecsFn"));

	private static final SubLString $str214$__ = makeString(", ");

	private static final SubLSymbol RKF_FILTER_IRRELEVANT_TERMS = makeSymbol("RKF-FILTER-IRRELEVANT-TERMS");

	private static final SubLSymbol $sym216$_API_WIDGET_RETURN_NEW_CYCLS_SEPARATELY__ = makeSymbol("*API-WIDGET-RETURN-NEW-CYCLS-SEPARATELY?*");

	private static final SubLSymbol GET_CONSTRAINED_CYCL_FOR_STRING = makeSymbol("GET-CONSTRAINED-CYCL-FOR-STRING");

	private static final SubLSymbol $sym218$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

	private static final SubLString $str221$Got_invalid_denotation_s__for__S_ = makeString("Got invalid denotation(s) for ~S: ~S");

	private static final SubLSymbol STUB_TERM_WITH_NAME_AND_TYPE_P = makeSymbol("STUB-TERM-WITH-NAME-AND-TYPE-P");

	private static final SubLSymbol $TRANSFORMATION_LIMIT_EXCEEDED = makeKeyword("TRANSFORMATION-LIMIT-EXCEEDED");

	private static final SubLSymbol INDEXICAL_REFERENT_TERM_P = makeSymbol("INDEXICAL-REFERENT-TERM-P");

	private static final SubLSymbol CYC_INDEXICAL_REFERENT = makeSymbol("CYC-INDEXICAL-REFERENT");

	private static final SubLSymbol CONVERT_STRING_CONSTRAINT_TUPLE_TO_DENOTATION = makeSymbol("CONVERT-STRING-CONSTRAINT-TUPLE-TO-DENOTATION");

	private static final SubLObject $$CharacterString = reader_make_constant_shell(makeString("CharacterString"));

	private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

	private static final SubLObject $$PredicateNamedFn = reader_make_constant_shell(makeString("PredicateNamedFn"));

	private static final SubLObject $const230$ProperSubcollectionNamedFn_Ternar = reader_make_constant_shell(makeString("ProperSubcollectionNamedFn-Ternary"));

	private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell(makeString("InstanceNamedFn-Ternary"));

	private static final SubLList $list232 = listS(list(makeKeyword("OR"), reader_make_constant_shell(makeString("PredicateNamedFn")), reader_make_constant_shell(makeString("SubCollectionNamedFn")), reader_make_constant_shell(makeString("InstanceNamedFn"))), makeKeyword("STRING"), makeKeyword("ANYTHING"));

	private static final SubLObject $$EnglishTypeCoercionDataMt = reader_make_constant_shell(makeString("EnglishTypeCoercionDataMt"));

	private static final SubLSymbol GET_CYCLS_FOR_STRING_ESCALATING = makeSymbol("GET-CYCLS-FOR-STRING-ESCALATING");

	private static final SubLString $str239$________regular_expressions__A__ = makeString("        regular expressions ~A~%");

	private static final SubLList $list242 = list(makeKeyword("ACRONYMS"));

	private static final SubLString $str243$_________typed_denots_of_string__ = makeString("         typed-denots-of-string '~A' with type ~A~%");

	private static final SubLList $list245 = list(makeKeyword("ABBREVS"), makeKeyword("ACRONYMS"));

	private static final SubLString $str246$__________typed_denots_of_string_ = makeString("          typed-denots-of-string with abbreviations: '~A'~%");

	private static final SubLString $str247$___________parse_dates_and_number = makeString("           parse-dates-and-numbers: '~A'~%");

	private static final SubLString $str248$____________parse_noun_compound_w = makeString("            parse-noun-compound-with-types: '~A'~%");

	private static final SubLString $str249$_____________parse_noun_compound_ = makeString("            (parse-noun-compound-with-types ~S ~S ~S ~S ~S)~%");

	private static final SubLString $str250$_____________get_constrained_exte = makeString("             get-constrained-extended-cycls-for-string: '~A'~%");

	private static final SubLObject $$EnglishSenseExtensionDataMt = reader_make_constant_shell(makeString("EnglishSenseExtensionDataMt"));

	private static final SubLString $str252$______________get_coerced_cycls_f = makeString("              get-coerced-cycls-for-string: '~A'~%");

	private static final SubLString $str253$_______________get_coerced_cycls_ = makeString("              (get-coerced-cycls-for-string ~S ~S ~S ~S)~%");

	private static final SubLString $str254$_______________get_constrained_cy = makeString("               get-constrained-cycls-for-regular-expression: '~A'~%");

	private static final SubLString $str255$_______________get_constrained_cy = makeString("               get-constrained-cycls-from-generation: '~A'~%");

	private static final SubLSymbol $sym256$PARSING_REWRITE_OF_ = makeSymbol("PARSING-REWRITE-OF?");

	private static final SubLSymbol GET_EXTENDED_CYCLS_FOR_STRING = makeSymbol("GET-EXTENDED-CYCLS-FOR-STRING");

	private static final SubLObject $$senseExtensionForNameString = reader_make_constant_shell(makeString("senseExtensionForNameString"));

	private static final SubLList $list261 = list(makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

	private static final SubLSymbol $get_extended_cycls_for_string_caching_state$ = makeSymbol("*GET-EXTENDED-CYCLS-FOR-STRING-CACHING-STATE*");

	private static final SubLInteger $int$300 = makeInteger(300);

	private static final SubLSymbol GET_COERCED_CYCLS_FOR_TERM = makeSymbol("GET-COERCED-CYCLS-FOR-TERM");

	private static final SubLObject $$typeCoerceableToType = reader_make_constant_shell(makeString("typeCoerceableToType"));

	private static final SubLList $list267 = list(makeKeyword("REF"));

	private static final SubLSymbol $get_coerced_cycls_for_term_caching_state$ = makeSymbol("*GET-COERCED-CYCLS-FOR-TERM-CACHING-STATE*");

	private static final SubLObject $$SententialConstituent = reader_make_constant_shell(makeString("SententialConstituent"));

	private static final SubLObject $$nounStrings = reader_make_constant_shell(makeString("nounStrings"));

	private static final SubLString $str276$_A_is_not_a__A = makeString("~A is not a ~A");

	private static final SubLString $$$continue_anyway = makeString("continue anyway");

	private static final SubLString $str281$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

	private static final SubLString $str282$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

	private static final SubLString $str283$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

	private static final SubLList $list284 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

	private static final SubLString $str285$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

	private static final SubLInteger $int$5000000 = makeInteger(5000000);

	private static final SubLSymbol GET_CONSTRAINED_CYCLS_FOR_REGULAR_EXPRESSION = makeSymbol("GET-CONSTRAINED-CYCLS-FOR-REGULAR-EXPRESSION");

	private static final SubLList $list288 = list(makeKeyword("CASELESS"));

	private static final SubLString $str289$Error__A___A__compiling_regular_e = makeString("Error ~A (~A) compiling regular expression ~S at offset ~A.");

	private static final SubLSymbol $sym290$_NAME = makeSymbol("?NAME");

	private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

	private static final SubLList $list295 = list(makeSymbol("CANDIDATE"), makeSymbol("NAME"));

	private static final SubLObject $$knownSentence = reader_make_constant_shell(makeString("knownSentence"));

	private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

	private static final SubLObject $$regexStringMatch_CaseInsensitive = reader_make_constant_shell(makeString("regexStringMatch-CaseInsensitive"));

	private static final SubLObject $$regexStringMatch = reader_make_constant_shell(makeString("regexStringMatch"));

	private static final SubLSymbol FILTER_PHRASE_TERM_LIST_BY_CONSTRAINT_LIST = makeSymbol("FILTER-PHRASE-TERM-LIST-BY-CONSTRAINT-LIST");

	private static final SubLList $list301 = list(makeSymbol("PHRASE"), makeSymbol("TERM-DENOTED"));

	private static final SubLSymbol FILTER_CYCL_TERM_BY_CONSTRAINT_LIST = makeSymbol("FILTER-CYCL-TERM-BY-CONSTRAINT-LIST");

	private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

	private static final SubLSymbol AUTO_COMPLETE_CONSTRAINED = makeSymbol("AUTO-COMPLETE-CONSTRAINED");

	private static final SubLSymbol AUTO_COMPLETE_TERM_QUICK = makeSymbol("AUTO-COMPLETE-TERM-QUICK");

	private static final SubLObject $$plural = reader_make_constant_shell(makeString("plural"));

	private static final SubLObject $$gerund_Plural = reader_make_constant_shell(makeString("gerund-Plural"));

	private static final SubLSymbol AUTO_COMPLETE_CONSTRAINED_NEW = makeSymbol("AUTO-COMPLETE-CONSTRAINED-NEW");

	private static final SubLObject $$singular = reader_make_constant_shell(makeString("singular"));

	private static final SubLSymbol GET_STRING_FROM_JAVALIST_GROUP = makeSymbol("GET-STRING-FROM-JAVALIST-GROUP");

	private static final SubLSymbol FIND_TEMPLATE_TOPIC_MATCHES_FOR_CONSTRAINT = makeSymbol("FIND-TEMPLATE-TOPIC-MATCHES-FOR-CONSTRAINT");

	private static final SubLList $list315 = list(reader_make_constant_shell(makeString("InstanceNamedFn")), reader_make_constant_shell(makeString("SubCollectionNamedFn")), reader_make_constant_shell(makeString("CollectionNamedFn")));

	private static final SubLSymbol GET_TEMPLATE_TOPIC_ASSERTIONS_FOR_MATCH_IN_XML = makeSymbol("GET-TEMPLATE-TOPIC-ASSERTIONS-FOR-MATCH-IN-XML");

	private static final SubLSymbol $sym317$FORMULA_TEMPLATE_TOPIC_TYPE_ = makeSymbol("FORMULA-TEMPLATE-TOPIC-TYPE?");

	private static final SubLString $$$knownAssertionsForTemplateTopic = makeString("knownAssertionsForTemplateTopic");

	private static final SubLString $str319$http___www_opencyc_org_xml_knownA = makeString("http://www.opencyc.org/xml/knownAssertionsForTemplateTopic.dtd");

	private static final SubLSymbol FORMULA_TEMPLATE_LOAD_TEMPLATE_GRAPH_MEMOIZED = makeSymbol("FORMULA-TEMPLATE-LOAD-TEMPLATE-GRAPH-MEMOIZED");

	private static final SubLSymbol ASSERT_CANDIDATE_REPLACEMENTS_FOR_POSITION = makeSymbol("ASSERT-CANDIDATE-REPLACEMENTS-FOR-POSITION");

	private static final SubLObject $$QueryLibrary_QuerySavingTemplate = reader_make_constant_shell(makeString("QueryLibrary-QuerySavingTemplate"));

	private static final SubLObject $$candidateReplacementForPosition = reader_make_constant_shell(makeString("candidateReplacementForPosition"));

	private static final SubLSymbol CREATE_MINIMAL_FORMULA_TEMPLATE_WITH_QUERY = makeSymbol("CREATE-MINIMAL-FORMULA-TEMPLATE-WITH-QUERY");

	private static final SubLObject $$formulaTemplateGloss = reader_make_constant_shell(makeString("formulaTemplateGloss"));

	private static final SubLObject $const327$microtheoryParameterValueInSpecif = reader_make_constant_shell(makeString("microtheoryParameterValueInSpecification"));

	private static final SubLObject $$folderContainsResource = reader_make_constant_shell(makeString("folderContainsResource"));

	private static final SubLString $str329$All_KB_Operations_completed_succe = makeString("All KB Operations completed successfully.");

	private static final SubLSymbol CREATE_MINIMAL_FORMULA_TEMPLATE_WITH_QUERY_INCLUDE_INFERENCE = makeSymbol("CREATE-MINIMAL-FORMULA-TEMPLATE-WITH-QUERY-INCLUDE-INFERENCE");

	private static final SubLSymbol ASSERT_UPDATED_INFERENCE_PARAMETERS_FOR_QUERY = makeSymbol("ASSERT-UPDATED-INFERENCE-PARAMETERS-FOR-QUERY");

	private static final SubLObject $const332$QueryLibraryQueryCreationTemplate = reader_make_constant_shell(makeString("QueryLibraryQueryCreationTemplateMt"));

	private static final SubLObject $$creationTemplateAllowableRules = reader_make_constant_shell(makeString("creationTemplateAllowableRules"));

	private static final SubLSymbol COMBINE_QUERY_PROPERTIES = makeSymbol("COMBINE-QUERY-PROPERTIES");

	private static final SubLSymbol EDIT_QUERY_GLOSS = makeSymbol("EDIT-QUERY-GLOSS");

	private static final SubLObject $$TimePoint = reader_make_constant_shell(makeString("TimePoint"));

	private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

	private static final SubLObject $$MtTimeWithGranularityDimFn = reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn"));

	private static final SubLObject $$IntervalStartedByFn = reader_make_constant_shell(makeString("IntervalStartedByFn"));

	private static final SubLString $str340$Failed_to_temporally_qualify__S__ = makeString("Failed to temporally qualify ~S~%");

	private static final SubLString $str341$Failed_to_assert_new_gloss__A__A_ = makeString("Failed to assert new gloss ~A:~A~%");

	private static final SubLString $str342$Gloss_edit_completed_successfully = makeString("Gloss edit completed successfully.");

	private static final SubLObject $$IntervalEndedByFn_Inclusive = reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive"));

	private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

	private static final SubLObject $$Now = reader_make_constant_shell(makeString("Now"));

	private static final SubLList $list346 = list(makeSymbol("BINDING"), makeSymbol("SUPPORTS"));

	private static final SubLSymbol CREATE_NEW_FORMULA_TEMPLATE_WITH_QUERY = makeSymbol("CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY");

	private static final SubLString $$$ClonedQuery = makeString("ClonedQuery");

	private static final SubLList $list349 = list(reader_make_constant_shell(makeString("KBContentTest-FullySpecified")));

	private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

	private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

	private static final SubLObject $$TestQueryFn = reader_make_constant_shell(makeString("TestQueryFn"));

	private static final SubLList $list353 = list(reader_make_constant_shell(makeString("TestQueryConstant")));

	private static final SubLObject $$TemplateFromTestQueryFn = reader_make_constant_shell(makeString("TemplateFromTestQueryFn"));

	private static final SubLList $list355 = list(reader_make_constant_shell(makeString("Individual")));

	private static final SubLSymbol MAKE_MULTIPLE_ASSERTIONS_TO_MT = makeSymbol("MAKE-MULTIPLE-ASSERTIONS-TO-MT");

	private static final SubLSymbol API_WIDGETS_ASSERT_WFF_NOW = makeSymbol("API-WIDGETS-ASSERT-WFF-NOW");

	private static final SubLSymbol KE_ASSERT_NOW = makeSymbol("KE-ASSERT-NOW");

	private static final SubLString $str359$Error_asserting_sentence___A__Got = makeString("Error asserting sentence: ~A~%Got error: ~A~%");

	private static final SubLString $str360$Got_bad_CycL_sentence___A__becaus = makeString("Got bad CycL sentence: ~A~%because: ~A~%");

	private static final SubLSymbol $sym363$_EXIT = makeSymbol("%EXIT");

	private static final SubLSymbol MAKE_MULTIPLE_ASSERTIONS_TO_MT_WITH_CREATION_TEMPLATE = makeSymbol("MAKE-MULTIPLE-ASSERTIONS-TO-MT-WITH-CREATION-TEMPLATE");

	private static final SubLSymbol MAIL_TO_USER = makeSymbol("MAIL-TO-USER");

	private static final SubLString $str366$Unable_to_find_address_for__A = makeString("Unable to find address for ~A");

	private static final SubLSymbol MAIL_TO_USER_WITH_CONTENT_TYPE = makeSymbol("MAIL-TO-USER-WITH-CONTENT-TYPE");

	private static final SubLSymbol CYCLIST_DEFINED_INSTANCES_OF_COL = makeSymbol("CYCLIST-DEFINED-INSTANCES-OF-COL");

	private static final SubLInteger $int$75 = makeInteger(75);

	private static final SubLSymbol CYCLIST_DEFINED_SPECS_OF_COL = makeSymbol("CYCLIST-DEFINED-SPECS-OF-COL");

	private static final SubLSymbol GET_TEMPLATE_TOPIC_IN_XML = makeSymbol("GET-TEMPLATE-TOPIC-IN-XML");

	private static final SubLObject $$definingMt = reader_make_constant_shell(makeString("definingMt"));

	private static final SubLString $$$templateTopic = makeString("templateTopic");

	private static final SubLString $str374$http___www_opencyc_org_xml_templa = makeString("http://www.opencyc.org/xml/templateTopic.dtd");

	private static final SubLSymbol GET_FORMULA_TEMPLATE_IN_XML = makeSymbol("GET-FORMULA-TEMPLATE-IN-XML");

	private static final SubLString $$$formulaTemplate = makeString("formulaTemplate");

	private static final SubLObject $const377$softwareParameterValueInSpecifica = reader_make_constant_shell(makeString("softwareParameterValueInSpecification"));

	private static final SubLObject $$KEInteractionResourceTestMt = reader_make_constant_shell(makeString("KEInteractionResourceTestMt"));

	private static final SubLSymbol GET_CYCL_QUERY_IN_XML_FROM_DEFAULT_MT = makeSymbol("GET-CYCL-QUERY-IN-XML-FROM-DEFAULT-MT");

	private static final SubLSymbol GET_CYCL_QUERY_IN_XML = makeSymbol("GET-CYCL-QUERY-IN-XML");

	private static final SubLString $$$cyclQuery = makeString("cyclQuery");

	private static final SubLString $str382$http___www_opencyc_org_xml_cyclQu = makeString("http://www.opencyc.org/xml/cyclQuery.dtd");

	private static final SubLSymbol GET_FORMULA_TEMPLATE_FOR_FACT_OR_QUERY_IN_XML_FROM_DEFAULT_MT = makeSymbol("GET-FORMULA-TEMPLATE-FOR-FACT-OR-QUERY-IN-XML-FROM-DEFAULT-MT");

	private static final SubLSymbol GET_FORMULA_TEMPLATE_FOR_FACT_OR_QUERY_IN_XML = makeSymbol("GET-FORMULA-TEMPLATE-FOR-FACT-OR-QUERY-IN-XML");

	private static final SubLSymbol PROCESS_FEEDBACK = makeSymbol("PROCESS-FEEDBACK");

	private static final SubLObject $$createABugzillaBugReport = reader_make_constant_shell(makeString("createABugzillaBugReport"));

	private static final SubLString $str387$_response_for_query__ = makeString(" response for query: ");

	private static final SubLString $str388$Query__ = makeString("Query: ");

	private static final SubLString $str389$Query_Formula__ = makeString("Query Formula: ");

	private static final SubLString $str390$Bindings__ = makeString("Bindings: ");

	private static final SubLString $str391$User_Comments__ = makeString("User Comments: ");

	private static final SubLString $str392$Java_Log__ = makeString("Java Log: ");

	private static final SubLString $$$___ = makeString("   ");

	private static final SubLString $str394$__ = makeString(": ");

	private static final SubLObject $$bugzillaProductForProject = reader_make_constant_shell(makeString("bugzillaProductForProject"));

	private static final SubLObject $$CycorpInternalBugzillaBugReport = reader_make_constant_shell(makeString("CycorpInternalBugzillaBugReport"));

	private static final SubLSymbol GET_POSSIBLE_RENDERERS_FOR_FOLLOWUP = makeSymbol("GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP");

	private static final SubLSymbol GET_POSSIBLE_RENDERERS_FOR_FOLLOWUP_INT = makeSymbol("GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT");

	private static final SubLList $list400 = list(makeSymbol("SENTENCE1"), makeSymbol("SENTENCE2"));

	private static final SubLSymbol $get_possible_renderers_for_followup_int_caching_state$ = makeSymbol("*GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT-CACHING-STATE*");

	private static final SubLSymbol UNIQUIFY_VARIABLES_ACROSS_TWO_SENTENCES = makeSymbol("UNIQUIFY-VARIABLES-ACROSS-TWO-SENTENCES");

	private static final SubLSymbol CHANGE_VARIABLE_NAMES = makeSymbol("CHANGE-VARIABLE-NAMES");

	private static final SubLSymbol GENERALITY_SORT_LAMBDA = makeSymbol("GENERALITY-SORT-LAMBDA");

	private static final SubLSymbol GET_POSSIBLE_MERGED_QUERIES = makeSymbol("GET-POSSIBLE-MERGED-QUERIES");

	private static final SubLSymbol GET_POSSIBLE_MERGED_QUERIES_WRT_VAR = makeSymbol("GET-POSSIBLE-MERGED-QUERIES-WRT-VAR");

	private static final SubLSymbol GET_SOURCE_CONCEPTUAL_WORKS_FOR_PROJECT = makeSymbol("GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT");

	private static final SubLList $list408 = cons(makeKeyword("PARAPHRASED-CW-TYPE"), makeKeyword("ANYTHING"));

	private static final SubLSymbol $PARAPHRASED_CW_TYPE = makeKeyword("PARAPHRASED-CW-TYPE");

	private static final SubLSymbol PARAPHRASED_SOURCE_SOURCE = makeSymbol("PARAPHRASED-SOURCE-SOURCE");

	private static final SubLString $$$sourceOfTypeForProject = makeString("sourceOfTypeForProject");

	public static final SubLList $list413 = list(makeSymbol("SOURCE"), makeSymbol("SOURCE-TYPE"), makeSymbol("TYPE-TYPE"), makeSymbol("PROJECT"));

	private static final SubLSymbol ADD_SOURCE_OF_TYPE_FOR_PROJECT = makeSymbol("ADD-SOURCE-OF-TYPE-FOR-PROJECT");

	private static final SubLSymbol REMOVE_SOURCE_OF_TYPE_FOR_PROJECT = makeSymbol("REMOVE-SOURCE-OF-TYPE-FOR-PROJECT");

	private static final SubLSymbol $fet_categorized_sources$ = makeSymbol("*FET-CATEGORIZED-SOURCES*");

	private static final SubLString $str419$Initializing_Fact_Entry_Tool_sour = makeString("Initializing Fact Entry Tool sources...");

	private static final SubLObject $$Project = reader_make_constant_shell(makeString("Project"));

	private static final SubLList $list422 = list(makeSymbol("SOURCE"), makeSymbol("SOURCE-TYPE"), makeSymbol("TYPE-TYPE"));

	private static final SubLSymbol $sym423$_CW = makeSymbol("?CW");

	private static final SubLSymbol $sym424$_CW_TYPE = makeSymbol("?CW-TYPE");

	private static final SubLObject $$projectSource_FactEntry = reader_make_constant_shell(makeString("projectSource-FactEntry"));

	public static final SubLList $list426 = list(reader_make_constant_shell(makeString("assertedSentence")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?CW"), makeSymbol("?CW-TYPE")));

	public static final SubLList $list427 = list(makeSymbol("?CW-TYPE"), makeSymbol("?CW"));

	private static final SubLList $list428 = list(makeSymbol("CW-TYPE"), makeSymbol("CW"));

	private static final SubLSymbol GET_LISP_IMPLEMENTATION_TYPE = makeSymbol("GET-LISP-IMPLEMENTATION-TYPE");

	private static final SubLSymbol GET_LISP_IMPLEMENTATION_VERSION = makeSymbol("GET-LISP-IMPLEMENTATION-VERSION");

	private static final SubLSymbol RECONSIDER_TEMPLATE_FORMULA_USING_TMS = makeSymbol("RECONSIDER-TEMPLATE-FORMULA-USING-TMS");

	private static final SubLString $str432$_ASSERTION_SENTENCE_908234 = makeString("?ASSERTION-SENTENCE-908234");

	private static final SubLObject $$assertionSentence = reader_make_constant_shell(makeString("assertionSentence"));

	private static final SubLSymbol RTV_WIZARD_DEFAULT_PREDICATES = makeSymbol("RTV-WIZARD-DEFAULT-PREDICATES");

	private static final SubLSymbol $sym435$_Y = makeSymbol("?Y");

	private static final SubLList $list436 = list(reader_make_constant_shell(makeString("elementOf")), makeSymbol("?Y"), list(new SubLObject[] { reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("affiliatedWith")), reader_make_constant_shell(makeString("relatives")),
			reader_make_constant_shell(makeString("teacherOf")), reader_make_constant_shell(makeString("religiousTeacherOf")), reader_make_constant_shell(makeString("actors")), reader_make_constant_shell(makeString("linked")), reader_make_constant_shell(makeString("stagesEvent")), reader_make_constant_shell(makeString("hasLeaders")) }));

	private static final SubLList $list437 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"));

	private static final SubLSymbol COLLECTION_CREATION_TEMPLATE = makeSymbol("COLLECTION-CREATION-TEMPLATE");

	private static final SubLString $str439$8665a79e_80ca_11db_8000_0020ed7aa = makeString("8665a79e-80ca-11db-8000-0020ed7aa09b");

	private static final SubLSymbol $collection_creation_template_caching_state$ = makeSymbol("*COLLECTION-CREATION-TEMPLATE-CACHING-STATE*");

	private static final SubLSymbol CREATE_COLLECTION_FROM_SET = makeSymbol("CREATE-COLLECTION-FROM-SET");

	public static final SubLList $list442 = list(reader_make_constant_shell(makeString("CAEUserCreatedCollection")));

	private static final SubLObject $$nameString = reader_make_constant_shell(makeString("nameString"));

	private static final SubLSymbol CREATE_COLLECTION_FROM_ENUMERATED_TERMS = makeSymbol("CREATE-COLLECTION-FROM-ENUMERATED-TERMS");

	private static final SubLString $$$UserCreatedCollection = makeString("UserCreatedCollection");

	private static final SubLSymbol $sym447$VALID_TERM_FOR_ENUMERATED_COLLECTION_ = makeSymbol("VALID-TERM-FOR-ENUMERATED-COLLECTION?");

	private static final SubLObject $$completelyAssertedCollection = reader_make_constant_shell(makeString("completelyAssertedCollection"));

	private static final SubLSymbol ADD_TO_COLLECTION_FROM_ENUMERATED_TERMS = makeSymbol("ADD-TO-COLLECTION-FROM-ENUMERATED-TERMS");

	private static final SubLSymbol VALID_TERM_QUA_INFERENCE_BINDING_P = makeSymbol("VALID-TERM-QUA-INFERENCE-BINDING-P");

	private static final SubLSymbol RESOLVE_TERM_QUA_INFERENCE_BINDING = makeSymbol("RESOLVE-TERM-QUA-INFERENCE-BINDING");

	private static final SubLList $list453 = cons(makeSymbol("FIRST-TERM"), makeSymbol("REMAINING-TERMS"));

	public static final SubLList $list454 = list(reader_make_constant_shell(makeString("Thing")));

	private static final SubLSymbol FIND_EXTERNAL_AIS_TERMS_IN_INFERENCE = makeSymbol("FIND-EXTERNAL-AIS-TERMS-IN-INFERENCE");

	public static final SubLList $list458 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

	private static final SubLSymbol FIND_EXTERNAL_AIS_TERMS = makeSymbol("FIND-EXTERNAL-AIS-TERMS");

	private static final SubLObject $$synonymousExternalConcept = reader_make_constant_shell(makeString("synonymousExternalConcept"));

	private static final SubLList $list461 = list(makeSymbol("IGNORE-ME"), makeSymbol("AIS"), makeSymbol("ID"));

	public static final SubLList $list462 = list(makeSymbol("STORE-ID"), makeSymbol("INF-ID"), makeSymbol("ANS-ID"), makeSymbol("VAR"));

	private static final SubLSymbol VARIABLE_ISA_CONSTRAINTS_MEMOIZED = makeSymbol("VARIABLE-ISA-CONSTRAINTS-MEMOIZED");

	private static final SubLSymbol FORMULA_VARIABLE_ARG_CONSTRAINT_TABLE = makeSymbol("FORMULA-VARIABLE-ARG-CONSTRAINT-TABLE");

	private static final SubLList $list465 = list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("BIND"), makeSymbol("VAR")), list(makeKeyword("BIND"), makeSymbol("COL")));

	public static final SubLList $list468 = list(reader_make_constant_shell(makeString("genls")), list(makeKeyword("BIND"), makeSymbol("VAR")), list(makeKeyword("BIND"), makeSymbol("COL")));

	public static final SubLList $list469 = list(makeKeyword("INFERENCE-BINDING"), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeKeyword("TEST"), makeSymbol("CYC-VAR?")));

	private static final SubLSymbol NEW_CYC_QUERIES = makeSymbol("NEW-CYC-QUERIES");

	private static final SubLList $list471 = list(new SubLObject[] { reader_make_constant_shell(makeString("implies")), reader_make_constant_shell(makeString("and")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("equals")), reader_make_constant_shell(makeString("different")),
			reader_make_constant_shell(makeString("arg1Isa")), reader_make_constant_shell(makeString("arg2Isa")), reader_make_constant_shell(makeString("coExtensional")), reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("relationInstanceExists")) });

	private static final SubLSymbol GATHER_FILTERED_EL_RULE_ASSERTIONS_FOR_TERM = makeSymbol("GATHER-FILTERED-EL-RULE-ASSERTIONS-FOR-TERM");

	private static final SubLSymbol GATHER_SET_FILTERED_EL_RULE_ASSERTIONS_FOR_TERM = makeSymbol("GATHER-SET-FILTERED-EL-RULE-ASSERTIONS-FOR-TERM");

	private static final SubLList $list475 = list(reader_make_constant_shell(makeString("pragmaticRequirement")), reader_make_constant_shell(makeString("meetsPragmaticRequirement")), reader_make_constant_shell(makeString("abnormal")));

	private static final SubLObject $$abnormal = reader_make_constant_shell(makeString("abnormal"));

	private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

	private static final SubLString $str479$invalid_rule_antecedant__A = makeString("invalid rule antecedant ~A");

	private static final SubLString $str480$invalid_rule_consequent__A = makeString("invalid rule consequent ~A");

	private static final SubLObject $$relationInstanceExists = reader_make_constant_shell(makeString("relationInstanceExists"));

	private static final SubLSymbol CONSTANTIFY_EXISTENTIALS_AND_OPEN_VARS = makeSymbol("CONSTANTIFY-EXISTENTIALS-AND-OPEN-VARS");

	private static final SubLSymbol EL_EXISTENTIAL_P = makeSymbol("EL-EXISTENTIAL-P");

	private static final SubLString $str486$_spec = makeString("-spec");

	private static final SubLSymbol GUID_STRING_P = makeSymbol("GUID-STRING-P");

	private static final SubLSymbol DUMMIFY_GUID_STRING = makeSymbol("DUMMIFY-GUID-STRING");

	private static final SubLSymbol TEST_TEMPLATE_TOPIC_MATCH_FINDER = makeSymbol("TEST-TEMPLATE-TOPIC-MATCH-FINDER");

	private static final SubLList $list497 = list(
			list(list(list(reader_make_constant_shell(makeString("TKBTemplate-Individual")), reader_make_constant_shell(makeString("TKB-GKE-TestMt")), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))),
					list(list(reader_make_constant_shell(makeString("temporallySubsumes")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("DecadeFn")), makeInteger(199)), makeString("e235fd00-10a4-41d9-8612-85cd130d8ba6")), makeSymbol("?DATE0")),
							list(reader_make_constant_shell(makeString("ist-Intermediate")), list(reader_make_constant_shell(makeString("MtSpace")), list(reader_make_constant_shell(makeString("The")), reader_make_constant_shell(makeString("Microtheory"))), list(reader_make_constant_shell(makeString("MtTimeWithGranularityDimFn")), makeSymbol("?DATE0"), reader_make_constant_shell(makeString("TimePoint")))),
									list(reader_make_constant_shell(makeString("objectFoundInLocation")), makeSymbol("?X"), reader_make_constant_shell(makeString("ContinentOfEurope"))))),
					list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))), list(reader_make_constant_shell(makeString("Terrorist-Fawwaz"))), makeInteger(14564)), T));

	private static final SubLString $str498$Missing_binding__S = makeString("Missing binding ~S");

	private static final SubLString $str499$Regression_on_bug__S = makeString("Regression on bug ~S");

	private static final SubLSymbol TEST_TERM_FILTERING_PASSES_FILTER = makeSymbol("TEST-TERM-FILTERING-PASSES-FILTER");

	private static final SubLList $list501 = list(new SubLObject[] { list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("HumanNameString"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), makeString("bin Laden")), T),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("ProperNameString"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), makeString("bin Laden")), T),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("Person"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("Lenat"))), T),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("TimeInterval"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2002))), T),
			list(list(list(reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("X"), reader_make_constant_shell(makeString("CycLIndexedTerm"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("isa"))), T),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("NonNegativeScalarInterval"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(reader_make_constant_shell(makeString("Meter")), TWO_INTEGER)), T),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("Date"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1997))), T),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("HumanNameString"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("Thing"))), NIL),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("ProperNameString"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), FOUR_INTEGER), NIL),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("Person"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("PlanetEarth"))), NIL),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("Date"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), makeInteger(1997)), NIL),
			list(list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("NonNegativeScalarInterval"))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), makeInteger(-2)), NIL) });

	private static final SubLSymbol TEST_CONSTRAINED_CYCL_FILTER = makeSymbol("TEST-CONSTRAINED-CYCL-FILTER");

	private static final SubLList $list504 = list(new SubLObject[] { list(list(list(NIL, NIL, reader_make_constant_shell(makeString("Penguin")), reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(reader_make_constant_shell(makeString("Aramil")))), NIL),
			list(list(list(NIL, NIL, reader_make_constant_shell(makeString("Penguin")), reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(reader_make_constant_shell(makeString("Pizza")))), NIL),
			list(list(list(NIL, NIL, reader_make_constant_shell(makeString("PersonTypeByOccupation")), reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(reader_make_constant_shell(makeString("PostageStamp")))), NIL),
			list(list(list(NIL, NIL, list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("Person"))), reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(reader_make_constant_shell(makeString("HumanCyclist")))), list(reader_make_constant_shell(makeString("HumanCyclist")))),
			list(list(list(NIL, NIL, list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("Person"))), reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(reader_make_constant_shell(makeString("HumanCyclist")), reader_make_constant_shell(makeString("Pizza")))), list(reader_make_constant_shell(makeString("HumanCyclist")))),
			list(list(list(list(reader_make_constant_shell(makeString("genlMt")), makeSymbol("?X"), reader_make_constant_shell(makeString("BaseKB"))), list(ONE_INTEGER), reader_make_constant_shell(makeString("PersonTypeByOccupation")), reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(reader_make_constant_shell(makeString("Plumber")))), NIL),
			list(list(list(list(reader_make_constant_shell(makeString("genlMt")), makeSymbol("?X"), reader_make_constant_shell(makeString("BaseKB"))), list(ONE_INTEGER), NIL, reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(makeInteger(2000))), NIL),
			list(list(list(list(reader_make_constant_shell(makeString("genlMt")), makeSymbol("?X"), reader_make_constant_shell(makeString("BaseKB"))), list(ONE_INTEGER), NIL, reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(reader_make_constant_shell(makeString("Plumber")))), NIL),
			list(list(list(list(reader_make_constant_shell(makeString("genlMt")), makeSymbol("?X"), reader_make_constant_shell(makeString("BaseKB"))), list(ONE_INTEGER), NIL, reader_make_constant_shell(makeString("CyclistsMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(reader_make_constant_shell(makeString("CyclistsMt")))), list(reader_make_constant_shell(makeString("CyclistsMt")))) });

	private static final SubLList $list505 = list(makeSymbol("SENTENCE"), makeSymbol("ARG-POS"), makeSymbol("CONSTRAINING-COLLECTION"), makeSymbol("DOMAIN-MT"), makeSymbol("FILTER-FN"));

	private static final SubLSymbol CONSTRAINED_CYCL_FILTER = makeSymbol("CONSTRAINED-CYCL-FILTER");

	private static final SubLSymbol TEST_BUG_PARSES = makeSymbol("TEST-BUG-PARSES");

	private static final SubLObject $list508 = _constant_508_initializer();

	private static final SubLSymbol $sym509$CONSTRAINED_PARSE_EQUAL_ = makeSymbol("CONSTRAINED-PARSE-EQUAL?");

	private static final SubLSymbol PARSE_CYCL_FROM_CONSTRAINED_PARSE_RESULT = makeSymbol("PARSE-CYCL-FROM-CONSTRAINED-PARSE-RESULT");

	private static final SubLSymbol BUG_PARSE_COUNT = makeSymbol("BUG-PARSE-COUNT");

	private static final SubLList $list512 = list(
			list(list(list(new SubLObject[] { makeString("around 10:01 eastern time"), reader_make_constant_shell(makeString("TimeInterval")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
					list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("TerrorismParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
					list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))),
					NIL, NIL, list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))), TEN_INTEGER })), ONE_INTEGER),
			list(list(list(new SubLObject[] { makeString("mutual support"), list(makeSymbol("CANONICALIZE-TERM"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("InterAgentSupportQuantity"))))),
					list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
					list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("TerrorismParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
					list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))),
					NIL, NIL, list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))), TEN_INTEGER })), ONE_INTEGER));

	private static final SubLInteger $int$350000 = makeInteger(350000);

	private static final SubLSymbol WS_INSTANCE_SUBSET_TEST = makeSymbol("WS-INSTANCE-SUBSET-TEST");

	private static final SubLList $list515 = list(list(list(reader_make_constant_shell(makeString("Person"))), T), list(list(reader_make_constant_shell(makeString("University"))), T));

	private static final SubLSymbol SIZE_BETWEEN = makeSymbol("SIZE-BETWEEN");

	private static final SubLList $list517 = list(list(list(reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("EverythingPSC")), T, makeInteger(100), ZERO_INTEGER, T), list(makeInteger(100), makeInteger(100))),
			list(list(reader_make_constant_shell(makeString("Zebra")), reader_make_constant_shell(makeString("EverythingPSC")), T, makeInteger(100), ZERO_INTEGER, T), list(FIVE_INTEGER, TWENTY_INTEGER)), list(list(reader_make_constant_shell(makeString("PlainsZebra")), reader_make_constant_shell(makeString("EverythingPSC")), T, makeInteger(100), ZERO_INTEGER, T), list(ZERO_INTEGER, ZERO_INTEGER)));

	private static final SubLList $list518 = list(list(list(reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("EverythingPSC")), NIL, makeInteger(100), ZERO_INTEGER, T), list(ONE_INTEGER, TWENTY_INTEGER)),
			list(list(reader_make_constant_shell(makeString("Zebra")), reader_make_constant_shell(makeString("EverythingPSC")), NIL, makeInteger(250), ZERO_INTEGER, T), list(makeInteger(50), makeInteger(150))), list(list(reader_make_constant_shell(makeString("PlainsZebra")), reader_make_constant_shell(makeString("EverythingPSC")), T, makeInteger(100), ZERO_INTEGER, T), list(ONE_INTEGER, ONE_INTEGER)));

	private static final SubLList $list519 = list(list(list(reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("EverythingPSC")), NIL, makeInteger(100), ZERO_INTEGER, T), list(makeInteger(100), makeInteger(100))),
			list(list(reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("EverythingPSC")), T, makeInteger(100), ZERO_INTEGER, T), list(FOUR_INTEGER, makeInteger(50))));

	static final boolean assertionsDisabledSynth = true;

	public static SubLObject foo_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
		compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
		return NIL;
	}

	public static SubLObject foo_p(final SubLObject v_object) {
		return v_object.getJavaClass() ==$foo_native.class ? T : NIL;
	}

	public static SubLObject foo_bar(final SubLObject v_object) {
		assert NIL != foo_p(v_object) : "api_widgets.foo_p error :" + v_object;
		return v_object.getField2();
	}

	public static SubLObject _csetf_foo_bar(final SubLObject v_object, final SubLObject value) {
		assert NIL != foo_p(v_object) : "api_widgets.foo_p error :" + v_object;
		return v_object.setField2(value);
	}

	public static SubLObject make_foo(SubLObject arglist) {
		if (arglist == UNPROVIDED) {
			arglist = NIL;
		}
		final SubLObject v_new = new $foo_native();
		SubLObject next;
		SubLObject current_arg;
		SubLObject current_value;
		SubLObject pcase_var;
		for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
			current_arg = next.first();
			current_value = cadr(next);
			pcase_var = current_arg;
			if (pcase_var.eql($BAR)) {
				_csetf_foo_bar(v_new, current_value);
			} else {
				Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
			}
		}
		return v_new;
	}

	public static SubLObject visit_defstruct_foo(final SubLObject obj, final SubLObject visitor_fn) {
		funcall(visitor_fn, obj, $BEGIN, MAKE_FOO, ONE_INTEGER);
		funcall(visitor_fn, obj, $SLOT, $BAR, foo_bar(obj));
		funcall(visitor_fn, obj, $END, MAKE_FOO, ONE_INTEGER);
		return obj;
	}

	public static SubLObject visit_defstruct_object_foo_method(final SubLObject obj, final SubLObject visitor_fn) {
		return visit_defstruct_foo(obj, visitor_fn);
	}

	public static SubLObject foo_test(final SubLObject obj) {
		SubLSystemTrampolineFile.enforceType(obj, FOO_P);
		return foo_bar(obj);
	}

	public static SubLObject get_cyc_id_for_web_id(final SubLObject web_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(web_id) : "Types.stringp(web_id) " + "CommonSymbols.NIL != Types.stringp(web_id) " + web_id;
		final SubLObject result = cycl_utilities.find_denotational_term(web_id);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
			mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
			if (NIL == isa.isaP(result, $$Cyclist, UNPROVIDED, UNPROVIDED)) {
				Errors.error($str23$__A__is_not_a_known___Cyclist___, web_id);
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject register_api_session_cleanup_form(final SubLObject cleanup_form, SubLObject client) {
		if (client == UNPROVIDED) {
			client = task_processor.get_current_task_processor_client();
		}
		SubLObject release = NIL;
		try {
			release = seize_lock($api_widget_session_resource_lock$.getGlobalValue());
			dictionary_utilities.dictionary_push($api_widget_session_resource_map$.getGlobalValue(), client, cleanup_form);
		} finally {
			if (NIL != release) {
				release_lock($api_widget_session_resource_lock$.getGlobalValue());
			}
		}
		return client;
	}

	public static SubLObject release_widget_resources_for_client(final SubLObject uuid_string) {
		run_api_session_cleanup_forms(uuid_string);
		return document_search.release_cluster_resources_for_client(uuid_string);
	}

	public static SubLObject reset_api_widget_sessions_resources() {
		SubLObject release = NIL;
		try {
			release = seize_lock($api_widget_session_resource_lock$.getGlobalValue());
			dictionary.clear_dictionary($api_widget_session_resource_map$.getGlobalValue());
		} finally {
			if (NIL != release) {
				release_lock($api_widget_session_resource_lock$.getGlobalValue());
			}
		}
		return $CLEARED;
	}

	public static SubLObject run_api_session_cleanup_forms(final SubLObject uuid_string) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject forms = NIL;
		SubLObject release = NIL;
		try {
			release = seize_lock($api_widget_session_resource_lock$.getGlobalValue());
			forms = dictionary.dictionary_lookup($api_widget_session_resource_map$.getGlobalValue(), uuid_string, UNPROVIDED);
			dictionary.dictionary_remove($api_widget_session_resource_map$.getGlobalValue(), uuid_string);
		} finally {
			if (NIL != release) {
				release_lock($api_widget_session_resource_lock$.getGlobalValue());
			}
		}
		SubLObject cdolist_list_var = nreverse(forms);
		SubLObject form = NIL;
		form = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject error_message = NIL;
			try {
				thread.throwStack.push($catch_error_message_target$.getGlobalValue());
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
					try {
						evaluate_api_cleanup_form(form);
					} catch (final Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
			} finally {
				thread.throwStack.pop();
			}
			if (error_message.isString()) {
				Errors.warn($str29$Clean_up_form__A_for_session__A_e, form, uuid_string, error_message);
			}
			cdolist_list_var = cdolist_list_var.rest();
			form = cdolist_list_var.first();
		}
		return uuid_string;
	}

	public static SubLObject evaluate_api_cleanup_form(final SubLObject form) {
		return eval(form);
	}

	public static SubLObject declare_session_symbol(final SubLObject prefix, SubLObject client) {
		if (client == UNPROVIDED) {
			client = task_processor.get_current_task_processor_client();
		}
		SubLSystemTrampolineFile.enforceType(prefix, STRINGP);
		SubLSystemTrampolineFile.enforceType(client, STRINGP);
		final SubLObject variable = gentemp(prefix);
		register_session_symbol_cleanup_form(variable, client);
		return variable;
	}

	public static SubLObject register_session_symbol_cleanup_form(final SubLObject variable, final SubLObject client) {
		final SubLObject name = symbol_name(variable);
		return register_api_session_cleanup_form(list(PROGN, list(MAKUNBOUND, list(FIND_SYMBOL, name)), list(UNINTERN, list(FIND_SYMBOL, name))), client);
	}

	public static SubLObject clear_get_collection_instances() {
		final SubLObject cs = $get_collection_instances_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_collection_instances(final SubLObject collection, final SubLObject mt, SubLObject mt_exclusiveP) {
		if (mt_exclusiveP == UNPROVIDED) {
			mt_exclusiveP = NIL;
		}
		return memoization_state.caching_state_remove_function_results_with_args($get_collection_instances_caching_state$.getGlobalValue(), list(collection, mt, mt_exclusiveP), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_collection_instances_internal(final SubLObject collection, final SubLObject mt, final SubLObject mt_exclusiveP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		note_collection_mt_cooccurrence(collection, mt);
		SubLObject results = NIL;
		if (NIL != mt_exclusiveP) {
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
				mt_relevance_macros.$mt$.bind(mt, thread);
				results = rkf_ontology_utilities.rkf_all_instantiations(collection, UNPROVIDED);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		} else {
			results = rkf_ontology_utilities.rkf_all_instantiations(collection, mt);
		}
		return results;
	}

	public static SubLObject get_collection_instances(final SubLObject collection, final SubLObject mt, SubLObject mt_exclusiveP) {
		if (mt_exclusiveP == UNPROVIDED) {
			mt_exclusiveP = NIL;
		}
		SubLObject caching_state = $get_collection_instances_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_COLLECTION_INSTANCES, $get_collection_instances_caching_state$, NIL, EQUAL, THREE_INTEGER, $int$256);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(collection, mt, mt_exclusiveP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (collection.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_exclusiveP.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_collection_instances_internal(collection, mt, mt_exclusiveP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt, mt_exclusiveP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject note_collection_mt_cooccurrence(final SubLObject collection, final SubLObject mt) {
		dictionary_utilities.dictionary_pushnew($api_widgets_get_collection_instances_arg_cooccurrence$.getGlobalValue(), collection, mt, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject clear_collection_instances_cache_by_cooccurrence(final SubLObject collection) {
		final SubLObject partner_mts = dictionary.dictionary_lookup($api_widgets_get_collection_instances_arg_cooccurrence$.getGlobalValue(), collection, UNPROVIDED);
		dictionary.dictionary_remove($api_widgets_get_collection_instances_arg_cooccurrence$.getGlobalValue(), collection);
		SubLObject cdolist_list_var = partner_mts;
		SubLObject mt = NIL;
		mt = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			remove_get_collection_instances(collection, mt, UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			mt = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject recheck_collection_instances_cooccurence_cache(final SubLObject changed_collection, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject stales = NIL;
		final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
		final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
		final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
		final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
		try {
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, FIVE_INTEGER), thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
			SubLObject iteration_state;
			for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($api_widgets_get_collection_instances_arg_cooccurrence$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
				thread.resetMultipleValues();
				final SubLObject collection = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
				final SubLObject mts = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != isa.isaP(collection, changed_collection, mt, UNPROVIDED)) {
					stales = cons(collection, stales);
				}
			}
			dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		} finally {
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
		}
		SubLObject cdolist_list_var = stales;
		SubLObject stale_collection = NIL;
		stale_collection = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			clear_collection_instances_cache_by_cooccurrence(stale_collection);
			cdolist_list_var = cdolist_list_var.rest();
			stale_collection = cdolist_list_var.first();
		}
		return changed_collection;
	}

	public static SubLObject reset_collection_instances_caching() {
		dictionary.clear_dictionary($api_widgets_get_collection_instances_arg_cooccurrence$.getGlobalValue());
		clear_get_collection_instances();
		return T;
	}

	public static SubLObject process_taxonimic_function_results(final SubLObject results, final SubLObject max, final SubLObject starting_from, final SubLObject return_external_ids) {
		final SubLObject result_count = length(results);
		SubLObject processed_results = copy_list(results);
		SubLObject has_more_results = NIL;
		if (starting_from.numGE(result_count)) {
			return $list39;
		}
		if (add(starting_from, max, ONE_INTEGER).numE(result_count)) {
			has_more_results = T;
			processed_results = last(processed_results, add(ONE_INTEGER, max));
			final SubLObject temp_cons = last(processed_results, TWO_INTEGER);
			rplacd(temp_cons, NIL);
		} else {
			processed_results = last(processed_results, max);
		}
		if (NIL != return_external_ids) {
			processed_results = Mapping.mapcar(symbol_function(COMPACT_HL_EXTERNAL_ID_STRING), processed_results);
		}
		return list(processed_results, has_more_results);
	}

	public static SubLObject process_taxonimic_function_results_new(SubLObject results, final SubLObject max, final SubLObject starting_from, final SubLObject return_external_ids) {
		final SubLObject result_count = length(results);
		SubLObject has_more_results = NIL;
		if (NIL != list_utilities.lengthE(results, ZERO_INTEGER, UNPROVIDED)) {
			return $list39;
		}
		if (result_count.numG(max)) {
			has_more_results = T;
			results = butlast(results, UNPROVIDED);
		}
		if (NIL != return_external_ids) {
			results = Mapping.mapcar(symbol_function(COMPACT_HL_EXTERNAL_ID_STRING), results);
		}
		return list(results, has_more_results);
	}

	public static SubLObject find_for_ws(final SubLObject search_string, final SubLObject search_type, final SubLObject ignore_caseP) {
		if (search_type.equal($$$externalId)) {
			return list(kb_utilities.find_object_by_compact_hl_external_id_string(search_string));
		}
		if (search_type.equal($$$cycl) && (NIL != string_utilities.starts_with(search_string, $str44$_))) {
			return cb_frames.nat_via_open_paren_spec(search_string);
		}
		if (search_type.equal($$$cycl)) {
			final SubLObject constants = constant_completion_high.constant_complete(unicode_nauts.convert_unicode_nauts_to_utf8_strings(search_string), sublisp_null(ignore_caseP), T, UNPROVIDED, UNPROVIDED);
			if (NIL != list_utilities.singletonP(constants)) {
				return values(constants, NIL);
			}
			return NIL;
		} else {
			if (NIL != subl_promotions.memberP(search_type, $list45, EQUAL, UNPROVIDED)) {
				return lexicon_accessors.denots_of_string(search_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			return NIL;
		}
	}

	public static SubLObject get_instances_for_ws(final SubLObject v_term, SubLObject mt, SubLObject asserted_only, SubLObject max, SubLObject starting_from, SubLObject return_external_ids) {
		if (mt == UNPROVIDED) {
			mt = $$EverythingPSC;
		}
		if (asserted_only == UNPROVIDED) {
			asserted_only = T;
		}
		if (max == UNPROVIDED) {
			max = $int$250;
		}
		if (starting_from == UNPROVIDED) {
			starting_from = ZERO_INTEGER;
		}
		if (return_external_ids == UNPROVIDED) {
			return_external_ids = NIL;
		}
		final SubLObject results = get_instances_for_ws_int(v_term, mt, add(max, ONE_INTEGER), starting_from, asserted_only);
		return process_taxonimic_function_results_new(results, max, starting_from, return_external_ids);
	}

	public static SubLObject get_instances_for_ws_int(final SubLObject v_term, final SubLObject mt, final SubLObject max, final SubLObject starting_from, final SubLObject asserted_only) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject known_values = get_ws_instance_cache(v_term, mt, asserted_only, max, starting_from);
		if (known_values.first() != $INCOMPLETE) {
			return known_values;
		}
		if (NIL != asserted_only) {
			set_ws_instance_cache(ask_utilities.query_variable($sym50$_X, list($$assertedSentence, list($$isa, $sym50$_X, v_term)), mt, listS($MAX_NUMBER, add(starting_from, max, ONE_INTEGER), $list54)), v_term, mt, asserted_only);
		} else {
			final SubLObject current_size = second(known_values);
			final SubLObject iter = get_ws_instance_iterator(v_term, mt, asserted_only);
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				SubLObject cdotimes_end_var;
				SubLObject n;
				SubLObject next_instance;
				for (cdotimes_end_var = subtract(add(max, starting_from), current_size), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
					if (NIL == iteration.iteration_done(iter)) {
						next_instance = iteration.iteration_next(iter);
						if (NIL != next_instance) {
							add_to_ws_instance_cache(next_instance, v_term, mt, asserted_only);
						}
					}
				}
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return get_ws_instance_cache(v_term, mt, asserted_only, max, starting_from);
	}

	public static SubLObject get_ws_instance_cache(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject max, final SubLObject starting_from) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject known_instances = dictionary.dictionary_lookup($ws_instance_dict$.getDynamicValue(thread), list(v_term, mt, asserted_only), UNPROVIDED);
		if (((NIL != list_utilities.lengthGE(known_instances, add(max, starting_from), UNPROVIDED)) || (NIL != ws_instance_iterator_doneP(v_term, mt, asserted_only))) || ((NIL != list_utilities.lengthG(known_instances, ZERO_INTEGER, UNPROVIDED)) && (NIL != asserted_only))) {
			final SubLObject end = min(add(max, starting_from), length(known_instances));
			return copy_list(subseq(known_instances, starting_from, end));
		}
		return list($INCOMPLETE, length(known_instances));
	}

	public static SubLObject add_to_ws_instance_cache(final SubLObject new_instance, final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject known_instances = dictionary.dictionary_lookup($ws_instance_dict$.getDynamicValue(thread), list(v_term, mt, asserted_only), UNPROVIDED);
		dictionary.dictionary_enter($ws_instance_dict$.getDynamicValue(thread), list(v_term, mt, asserted_only), list_utilities.snoc(new_instance, known_instances));
		return NIL;
	}

	public static SubLObject set_ws_instance_cache(final SubLObject value, final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		dictionary.dictionary_enter($ws_instance_dict$.getDynamicValue(thread), list(v_term, mt, asserted_only), value);
		return NIL;
	}

	public static SubLObject ws_instance_iterator_doneP(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			result = iteration.iteration_done(get_ws_instance_iterator(v_term, mt, asserted_only));
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject clear_get_ws_instance_iterator() {
		final SubLObject cs = $get_ws_instance_iterator_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_ws_instance_iterator(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only) {
		return memoization_state.caching_state_remove_function_results_with_args($get_ws_instance_iterator_caching_state$.getGlobalValue(), list(v_term, mt, asserted_only), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_ws_instance_iterator_internal(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject iter = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			iter = kb_iterators.new_instances_iterator(v_term);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return iter;
	}

	public static SubLObject get_ws_instance_iterator(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only) {
		SubLObject caching_state = $get_ws_instance_iterator_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_WS_INSTANCE_ITERATOR, $get_ws_instance_iterator_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, mt, asserted_only);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_term.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && asserted_only.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_ws_instance_iterator_internal(v_term, mt, asserted_only)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt, asserted_only));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject get_specs_for_ws(final SubLObject v_term, SubLObject mt, SubLObject asserted_only, SubLObject max, SubLObject starting_from, SubLObject return_external_ids, SubLObject minimize) {
		if (mt == UNPROVIDED) {
			mt = $$EverythingPSC;
		}
		if (asserted_only == UNPROVIDED) {
			asserted_only = T;
		}
		if (max == UNPROVIDED) {
			max = $int$250;
		}
		if (starting_from == UNPROVIDED) {
			starting_from = ZERO_INTEGER;
		}
		if (return_external_ids == UNPROVIDED) {
			return_external_ids = NIL;
		}
		if (minimize == UNPROVIDED) {
			minimize = NIL;
		}
		final SubLObject results = get_specs_for_ws_int(v_term, mt, add(max, ONE_INTEGER), starting_from, asserted_only, minimize);
		return process_taxonimic_function_results_new(results, max, starting_from, return_external_ids);
	}

	public static SubLObject get_specs_for_ws_int(final SubLObject v_term, final SubLObject mt, final SubLObject max, final SubLObject starting_from, final SubLObject asserted_only, final SubLObject minimize) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject known_values = get_ws_spec_cache(v_term, mt, asserted_only, max, starting_from, minimize);
		if (known_values.first() != $INCOMPLETE) {
			return known_values;
		}
		if ((NIL != asserted_only) || (NIL != minimize)) {
			SubLObject base_results = ask_utilities.query_variable($sym50$_X, list($$assertedSentence, list($$genls, $sym50$_X, v_term)), mt, listS($MAX_NUMBER, add(starting_from, max, ONE_INTEGER), $list54));
			if (NIL != minimize) {
				base_results = genls.max_cols(base_results, mt, UNPROVIDED);
			}
			set_ws_spec_cache(base_results, v_term, mt, asserted_only, minimize);
		} else {
			final SubLObject current_size = second(known_values);
			final SubLObject iter = get_ws_spec_iterator(v_term, mt);
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				SubLObject cdotimes_end_var;
				SubLObject n;
				SubLObject next_spec;
				for (cdotimes_end_var = subtract(add(max, starting_from), current_size), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
					if (NIL == iteration.iteration_done(iter)) {
						next_spec = iteration.iteration_next(iter);
						if (NIL != next_spec) {
							add_to_ws_spec_cache(next_spec, v_term, mt, asserted_only, minimize);
						}
					}
				}
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return get_ws_spec_cache(v_term, mt, asserted_only, max, starting_from, minimize);
	}

	public static SubLObject get_ws_spec_cache(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject max, final SubLObject starting_from, final SubLObject minimize) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject known_specs = dictionary.dictionary_lookup($ws_spec_dict$.getDynamicValue(thread), list(v_term, mt, asserted_only, minimize), $EMPTY_RESULT);
		if (known_specs.isList() && (((((NIL != list_utilities.lengthG(known_specs, ZERO_INTEGER, UNPROVIDED)) && (NIL != asserted_only)) || (NIL != list_utilities.lengthGE(known_specs, add(max, starting_from), UNPROVIDED))) || (NIL != ws_spec_iterator_doneP(v_term, mt))) || (NIL == known_specs))) {
			final SubLObject end = min(add(max, starting_from), length(known_specs));
			return copy_list(subseq(known_specs, starting_from, end));
		}
		return list($INCOMPLETE, known_specs == $EMPTY_RESULT ? ZERO_INTEGER : length(known_specs));
	}

	public static SubLObject add_to_ws_spec_cache(final SubLObject new_spec, final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject minimize) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject known_specs = dictionary.dictionary_lookup($ws_spec_dict$.getDynamicValue(thread), list(v_term, mt, asserted_only, minimize), UNPROVIDED);
		dictionary.dictionary_enter($ws_spec_dict$.getDynamicValue(thread), list(v_term, mt, asserted_only, minimize), list_utilities.snoc(new_spec, known_specs));
		return NIL;
	}

	public static SubLObject set_ws_spec_cache(final SubLObject value, final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject minimize) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		dictionary.dictionary_enter($ws_spec_dict$.getDynamicValue(thread), list(v_term, mt, asserted_only, minimize), value);
		return NIL;
	}

	public static SubLObject ws_spec_iterator_doneP(final SubLObject v_term, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			result = iteration.iteration_done(get_ws_spec_iterator(v_term, mt));
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject clear_get_ws_spec_iterator() {
		final SubLObject cs = $get_ws_spec_iterator_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_ws_spec_iterator(final SubLObject v_term, final SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args($get_ws_spec_iterator_caching_state$.getGlobalValue(), list(v_term, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_ws_spec_iterator_internal(final SubLObject v_term, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject iter = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			iter = kb_iterators.new_specs_iterator(v_term);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return iter;
	}

	public static SubLObject get_ws_spec_iterator(final SubLObject v_term, final SubLObject mt) {
		SubLObject caching_state = $get_ws_spec_iterator_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_WS_SPEC_ITERATOR, $get_ws_spec_iterator_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(v_term, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_term.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_ws_spec_iterator_internal(v_term, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject get_isas_for_ws(final SubLObject v_term, SubLObject mt, SubLObject asserted_only, SubLObject max, SubLObject starting_from, SubLObject return_external_ids, SubLObject minimize) {
		if (mt == UNPROVIDED) {
			mt = $$EverythingPSC;
		}
		if (asserted_only == UNPROVIDED) {
			asserted_only = T;
		}
		if (max == UNPROVIDED) {
			max = $int$250;
		}
		if (starting_from == UNPROVIDED) {
			starting_from = ZERO_INTEGER;
		}
		if (return_external_ids == UNPROVIDED) {
			return_external_ids = NIL;
		}
		if (minimize == UNPROVIDED) {
			minimize = NIL;
		}
		final SubLObject results = get_isas_for_ws_int(v_term, mt, asserted_only, minimize);
		return process_taxonimic_function_results(results, max, starting_from, return_external_ids);
	}

	public static SubLObject clear_get_isas_for_ws_int() {
		final SubLObject cs = $get_isas_for_ws_int_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_isas_for_ws_int(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject minimize) {
		return memoization_state.caching_state_remove_function_results_with_args($get_isas_for_ws_int_caching_state$.getGlobalValue(), list(v_term, mt, asserted_only, minimize), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_isas_for_ws_int_internal(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject minimize) {
		SubLObject results = NIL;
		if (v_term.isNumber()) {
			results = all_genls_of_any(at_defns.collections_admitting_term_via_defns(v_term), T, mt);
		} else if (NIL != asserted_only) {
			results = ask_utilities.query_template($sym50$_X, list($$assertedSentence, listS($$isa, v_term, $list64)), mt, $list54);
		} else {
			results = ask_utilities.query_template($sym50$_X, listS($$isa, v_term, $list64), mt, $list54);
		}

		if (NIL != minimize) {
			results = genls.min_cols(results, mt, UNPROVIDED);
		}
		return results;
	}

	public static SubLObject get_isas_for_ws_int(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject minimize) {
		SubLObject caching_state = $get_isas_for_ws_int_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_ISAS_FOR_WS_INT, $get_isas_for_ws_int_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_ISAS_FOR_WS_INT);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, mt, asserted_only, minimize);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_term.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (asserted_only.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && minimize.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_isas_for_ws_int_internal(v_term, mt, asserted_only, minimize)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt, asserted_only, minimize));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject all_genls_of_any(final SubLObject specs, SubLObject delete_duplicatesP, SubLObject mt) {
		if (delete_duplicatesP == UNPROVIDED) {
			delete_duplicatesP = T;
		}
		if (mt == UNPROVIDED) {
			mt = mt_relevance_macros.$mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != listp(specs) : "Types.listp(specs) " + "CommonSymbols.NIL != Types.listp(specs) " + specs;
		SubLObject result = NIL;
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			result = apply(symbol_function(APPEND), Mapping.mapcar(symbol_function(ALL_GENLS_IN_MT), specs));
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return NIL != delete_duplicatesP ? list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : result;
	}

	public static SubLObject get_genls_for_ws(final SubLObject v_term, SubLObject mt, SubLObject asserted_only, SubLObject max, SubLObject starting_from, SubLObject return_external_ids, SubLObject minimize) {
		if (mt == UNPROVIDED) {
			mt = $$EverythingPSC;
		}
		if (asserted_only == UNPROVIDED) {
			asserted_only = T;
		}
		if (max == UNPROVIDED) {
			max = $int$250;
		}
		if (starting_from == UNPROVIDED) {
			starting_from = ZERO_INTEGER;
		}
		if (return_external_ids == UNPROVIDED) {
			return_external_ids = NIL;
		}
		if (minimize == UNPROVIDED) {
			minimize = NIL;
		}
		final SubLObject results = get_genls_for_ws_int(v_term, mt, asserted_only, minimize);
		return process_taxonimic_function_results(results, max, starting_from, return_external_ids);
	}

	public static SubLObject clear_get_genls_for_ws_int() {
		final SubLObject cs = $get_genls_for_ws_int_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_genls_for_ws_int(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject minimize) {
		return memoization_state.caching_state_remove_function_results_with_args($get_genls_for_ws_int_caching_state$.getGlobalValue(), list(v_term, mt, asserted_only, minimize), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_genls_for_ws_int_internal(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject minimize) {
		SubLObject results = NIL;
		if ((NIL != asserted_only) || (NIL != minimize)) {
			results = ask_utilities.query_template($sym50$_X, list($$assertedSentence, listS($$genls, v_term, $list64)), mt, $list54);
		} else {
			results = ask_utilities.query_template($sym50$_X, listS($$genls, v_term, $list64), mt, $list54);
		}
		if (NIL != minimize) {
			results = genls.min_cols(results, mt, UNPROVIDED);
		}
		return results;
	}

	public static SubLObject get_genls_for_ws_int(final SubLObject v_term, final SubLObject mt, final SubLObject asserted_only, final SubLObject minimize) {
		SubLObject caching_state = $get_genls_for_ws_int_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_GENLS_FOR_WS_INT, $get_genls_for_ws_int_caching_state$, NIL, EQUAL, FOUR_INTEGER, ZERO_INTEGER);
			memoization_state.register_hl_store_cache_clear_callback(CLEAR_GET_GENLS_FOR_WS_INT);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, mt, asserted_only, minimize);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_term.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (asserted_only.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (((NIL != cached_args) && (NIL == cached_args.rest())) && minimize.equal(cached_args.first())) {
								return memoization_state.caching_results(results2);
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_genls_for_ws_int_internal(v_term, mt, asserted_only, minimize)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt, asserted_only, minimize));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject get_instances_in_nl(final SubLObject collection, SubLObject mt, SubLObject generation_mt) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != fort_types_interface.collection_p(collection) : "fort_types_interface.collection_p(collection) " + "CommonSymbols.NIL != fort_types_interface.collection_p(collection) " + collection;
		assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
		assert NIL != hlmt.possibly_mt_p(generation_mt) : "hlmt.possibly_mt_p(generation_mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(generation_mt) " + generation_mt;
		mt = hlmt_czer.coerce_to_hlmt(mt);
		generation_mt = hlmt_czer.coerce_to_hlmt(generation_mt);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = get_collection_instances(collection, mt, UNPROVIDED);
		SubLObject instance = NIL;
		instance = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
			try {
				pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
				thread.resetMultipleValues();
				final SubLObject _prev_bind_0_$1 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
				try {
					pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
					final SubLObject reuseP = thread.secondMultipleValue();
					thread.resetMultipleValues();
					try {
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$2 = pph_macros.$pph_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
							final SubLObject new_or_reused = thread.secondMultipleValue();
							thread.resetMultipleValues();
							final SubLObject _prev_bind_0_$3 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
							try {
								pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
								final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
								final SubLObject _prev_bind_0_$4 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
									try {
										final SubLObject phrase = rkf_concept_communicator.rkf_term_phrase(instance, generation_mt, mt, UNPROVIDED, UNPROVIDED);
										if (phrase.isString()) {
											result = cons(list(phrase, instance), result);
										}
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
									memoization_state.$memoization_state$.rebind(_prev_bind_0_$4, thread);
								}
							} finally {
								pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$3, thread);
							}
							if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
								memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
							}
						} finally {
							pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$2, thread);
						}
					} finally {
						final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values2 = getValuesAsVector();
							if (NIL == reuseP) {
								pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
							}
							restoreValuesFromVector(_values2);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
						}
					}
				} finally {
					pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$1, thread);
				}
			} finally {
				pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
			}
			cdolist_list_var = cdolist_list_var.rest();
			instance = cdolist_list_var.first();
		}
		return Sort.sort(result, symbol_function(STRING_LESSP), symbol_function(FIRST));
	}

	public static SubLObject pph_list_item_comparator(final SubLObject item_a, final SubLObject item_b) {
		return funcall(symbol_function(STRING_LESSP), item_a.first().first(), item_b.first().first());
	}

	public static SubLObject get_instances_as_renderings_int(final SubLObject collection, SubLObject should_sort, SubLObject instantiation_type, SubLObject force, SubLObject domain_mt, SubLObject generation_mt, SubLObject nl_preds) {
		if (should_sort == UNPROVIDED) {
			should_sort = T;
		}
		if (instantiation_type == UNPROVIDED) {
			instantiation_type = $ALL_INSTANTIATIONS;
		}
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = default_nl_preds_for_type_list(collection, generation_mt);
		}
		assert NIL != kb_accessors.set_or_collectionP(collection) : "kb_accessors.set_or_collectionP(collection) " + "CommonSymbols.NIL != kb_accessors.set_or_collectionP(collection) " + collection;
		final SubLObject v_instances = (instantiation_type == $ALL_INSTANTIATIONS) ? rkf_ontology_utilities.rkf_all_instantiations(collection, UNPROVIDED) : rkf_ontology_utilities.rkf_instantiations(collection, UNPROVIDED);
		final SubLObject result = convert_term_list_to_renderings_for_java(v_instances, domain_mt, force, nl_preds, generation_mt, should_sort, UNPROVIDED, UNPROVIDED);
		return result;
	}

	public static SubLObject get_instances_as_renderings_new(final SubLObject collection, SubLObject mt, SubLObject instantiation_type, SubLObject mt_direction_type, SubLObject should_sortP, SubLObject force, SubLObject generation_mt, SubLObject nl_preds) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		if (instantiation_type == UNPROVIDED) {
			instantiation_type = $ALL_INSTANTIATIONS;
		}
		if (mt_direction_type == UNPROVIDED) {
			mt_direction_type = $ANY_MT;
		}
		if (should_sortP == UNPROVIDED) {
			should_sortP = T;
		}
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = $DEFAULT;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == kb_accessors.set_or_collectionP(collection)) {
			return list(NIL, MINUS_ONE_INTEGER);
		}
		if (NIL != mt) {
			mt = hlmt_czer.coerce_to_hlmt(mt);
		}
		if ($DEFAULT == nl_preds) {
			nl_preds = default_nl_preds_for_type_list(collection, generation_mt);
		}
		SubLObject result = list(NIL, MINUS_ONE_INTEGER);
		final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_language_mt$.bind(NIL != generation_mt ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
			pph_vars.$pph_domain_mt$.bind(NIL != mt ? pph_utilities.pph_canonicalize_hlmt(mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
			if (mt_direction_type == $ANY_MT) {
				final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
					mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
					result = get_instances_as_renderings_int(collection, should_sortP, instantiation_type, force, mt, generation_mt, nl_preds);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1_$8, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$7, thread);
				}
			} else if (mt_direction_type == $LOCAL_CHANGE) {
				final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_1_$9 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
					mt_relevance_macros.$mt$.bind(mt, thread);
					result = get_instances_as_renderings_int(collection, should_sortP, instantiation_type, force, mt, generation_mt, nl_preds);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1_$9, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$8, thread);
				}
			} else if (mt_direction_type == $UPWARD_CLOSURE) {
				final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
				final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$mt$.currentBinding(thread);
				final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
				try {
					mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
					mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
					mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
					result = get_instances_as_renderings_int(collection, should_sortP, instantiation_type, force, mt, generation_mt, nl_preds);
				} finally {
					mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$10, thread);
					mt_relevance_macros.$mt$.rebind(_prev_bind_0_$9, thread);
				}
			} else if (mt_direction_type == $DOWNWARD_CLOSURE) {
				final SubLObject _prev_bind_0_$10 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_1_$11 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
					mt_relevance_macros.$mt$.bind(mt, thread);
					result = get_instances_as_renderings_int(collection, should_sortP, instantiation_type, force, mt, generation_mt, nl_preds);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1_$11, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$10, thread);
				}
			}

		} finally {
			pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
			pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject clear_default_nl_preds_for_type_list() {
		final SubLObject cs = $default_nl_preds_for_type_list_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_default_nl_preds_for_type_list(final SubLObject collection, SubLObject language_mt) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		return memoization_state.caching_state_remove_function_results_with_args($default_nl_preds_for_type_list_caching_state$.getGlobalValue(), list(collection, language_mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject default_nl_preds_for_type_list_internal(final SubLObject collection, final SubLObject language_mt) {
		return pph_utilities.pph_default_nl_preds_for_type_list(collection, language_mt);
	}

	public static SubLObject default_nl_preds_for_type_list(final SubLObject collection, SubLObject language_mt) {
		if (language_mt == UNPROVIDED) {
			language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		SubLObject caching_state = $default_nl_preds_for_type_list_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(DEFAULT_NL_PREDS_FOR_TYPE_LIST, $default_nl_preds_for_type_list_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, language_mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (collection.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && language_mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(default_nl_preds_for_type_list_internal(collection, language_mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, language_mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject clear_get_instances_as_renderings() {
		final SubLObject cs = $get_instances_as_renderings_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_instances_as_renderings(final SubLObject collection, final SubLObject mt, final SubLObject force, SubLObject generation_mt, SubLObject nl_preds, SubLObject mt_exclusiveP) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = default_nl_preds_for_type_list(collection, generation_mt);
		}
		if (mt_exclusiveP == UNPROVIDED) {
			mt_exclusiveP = NIL;
		}
		return memoization_state.caching_state_remove_function_results_with_args($get_instances_as_renderings_caching_state$.getGlobalValue(), list(collection, mt, force, generation_mt, nl_preds, mt_exclusiveP), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_instances_as_renderings_internal(final SubLObject collection, SubLObject mt, final SubLObject force, final SubLObject generation_mt, final SubLObject nl_preds, final SubLObject mt_exclusiveP) {
		mt = hlmt_czer.coerce_to_hlmt(mt);
		assert NIL != kb_accessors.set_or_collectionP(collection) : "kb_accessors.set_or_collectionP(collection) " + "CommonSymbols.NIL != kb_accessors.set_or_collectionP(collection) " + collection;
		final SubLObject result = convert_term_list_to_renderings_for_java(get_collection_instances(collection, mt, mt_exclusiveP), mt, force, nl_preds, generation_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return Sort.sort(result, symbol_function(PPH_LIST_ITEM_COMPARATOR), UNPROVIDED);
	}

	public static SubLObject get_instances_as_renderings(final SubLObject collection, final SubLObject mt, final SubLObject force, SubLObject generation_mt, SubLObject nl_preds, SubLObject mt_exclusiveP) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = default_nl_preds_for_type_list(collection, generation_mt);
		}
		if (mt_exclusiveP == UNPROVIDED) {
			mt_exclusiveP = NIL;
		}
		SubLObject caching_state = $get_instances_as_renderings_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_INSTANCES_AS_RENDERINGS, $get_instances_as_renderings_caching_state$, NIL, EQUAL, SIX_INTEGER, $int$256);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_6(collection, mt, force, generation_mt, nl_preds, mt_exclusiveP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (collection.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (force.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (generation_mt.equal(cached_args.first())) {
								cached_args = cached_args.rest();
								if (nl_preds.equal(cached_args.first())) {
									cached_args = cached_args.rest();
									if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_exclusiveP.equal(cached_args.first())) {
										return memoization_state.caching_results(results2);
									}
								}
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_instances_as_renderings_internal(collection, mt, force, generation_mt, nl_preds, mt_exclusiveP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt, force, generation_mt, nl_preds, mt_exclusiveP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject get_term_list_as_renderings(SubLObject cycl_term_list, SubLObject mt, final SubLObject force, SubLObject generation_mt, SubLObject should_sortP, SubLObject nl_preds, SubLObject filter_irrelevant_termsP, SubLObject disambiguateP) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (should_sortP == UNPROVIDED) {
			should_sortP = T;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = list($$nonPlural_Generic);
		}
		if (filter_irrelevant_termsP == UNPROVIDED) {
			filter_irrelevant_termsP = NIL;
		}
		if (disambiguateP == UNPROVIDED) {
			disambiguateP = T;
		}
		mt = hlmt_czer.coerce_to_hlmt(mt);
		generation_mt = hlmt_czer.coerce_to_hlmt(generation_mt);
		if (NIL != filter_irrelevant_termsP) {
			cycl_term_list = rkf_relevance_utilities.rkf_filter_irrelevant_terms(cycl_term_list, mt);
		}
		final SubLObject result = convert_term_list_to_renderings_for_java(cycl_term_list, mt, force, nl_preds, generation_mt, should_sortP, disambiguateP, UNPROVIDED);
		return result;
	}

	public static SubLObject get_term_list_as_renderings_with_fact_sheets(SubLObject cycl_term_list, SubLObject mt, final SubLObject force, SubLObject generation_mt, SubLObject should_sortP, SubLObject nl_preds, SubLObject filter_irrelevant_termsP) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (should_sortP == UNPROVIDED) {
			should_sortP = T;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = list($$nonPlural_Generic);
		}
		if (filter_irrelevant_termsP == UNPROVIDED) {
			filter_irrelevant_termsP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		mt = hlmt_czer.coerce_to_hlmt(mt);
		generation_mt = hlmt_czer.coerce_to_hlmt(generation_mt);
		if (NIL != filter_irrelevant_termsP) {
			cycl_term_list = rkf_relevance_utilities.rkf_filter_irrelevant_terms(cycl_term_list, mt);
		}
		final SubLObject fact_sheet_table = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$15 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$16 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$17 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$18 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$19 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(NIL != generation_mt ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
										pph_vars.$pph_domain_mt$.bind(NIL != mt ? pph_utilities.pph_canonicalize_hlmt(mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
										SubLObject cdolist_list_var = cycl_term_list;
										SubLObject v_term = NIL;
										v_term = cdolist_list_var.first();
										while (NIL != cdolist_list_var) {
											final SubLObject _prev_bind_0_$20 = thcl.$thcl_forts_by_fiat$.currentBinding(thread);
											try {
												thcl.$thcl_forts_by_fiat$.bind(cons(v_term, thcl.$thcl_forts_by_fiat$.getDynamicValue(thread)), thread);
												sethash(v_term, fact_sheet_table, fact_sheets.get_fact_sheet_for_term_in_html(v_term, $MINI, mt, generation_mt, $list99).first());
											} finally {
												thcl.$thcl_forts_by_fiat$.rebind(_prev_bind_0_$20, thread);
											}
											cdolist_list_var = cdolist_list_var.rest();
											v_term = cdolist_list_var.first();
										}
									} finally {
										pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$19, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$18, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$17, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$16, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$15, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		final SubLObject renderings_lists = convert_term_list_to_renderings_for_java(cycl_term_list, mt, force, nl_preds, generation_mt, should_sortP, UNPROVIDED, UNPROVIDED);
		SubLObject result = NIL;
		SubLObject cdolist_list_var2 = renderings_lists;
		SubLObject renderings_list = NIL;
		renderings_list = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
			SubLObject current;
			final SubLObject datum = current = renderings_list;
			SubLObject rendering = NIL;
			SubLObject v_term2 = NIL;
			destructuring_bind_must_consp(current, datum, $list100);
			rendering = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list100);
			v_term2 = current.first();
			current = current.rest();
			if (NIL == current) {
				result = cons(list(rendering, v_term2, gethash(v_term2, fact_sheet_table, UNPROVIDED)), result);
			} else {
				cdestructuring_bind_error(datum, $list100);
			}
			cdolist_list_var2 = cdolist_list_var2.rest();
			renderings_list = cdolist_list_var2.first();
		}
		result = nreverse(result);
		return result;
	}

	public static SubLObject get_external_term_browser_url(final SubLObject knowledge_source, final SubLObject term_identifier) {
		final SubLObject mt_var = $sym103$_MT;
		final SubLObject server_var = $sym104$_SERVER;
		final SubLObject port_var = $sym105$_PORT;
		final SubLObject sentence = list($$and, list($$mappingMt, knowledge_source, mt_var), list($$ist, mt_var, list($$serverOfSKS, knowledge_source, server_var)), list($$ist, mt_var, listS($$isa, knowledge_source, $list110)), list($$ist, mt_var, list($$portNumberForSKS, knowledge_source, port_var)));
		final SubLObject results = ask_utilities.query_template(list(server_var, port_var), sentence, $$BaseKB, $list113);
		if (NIL != results) {
			SubLObject current;
			final SubLObject datum = current = results.first();
			SubLObject hostname = NIL;
			SubLObject port = NIL;
			destructuring_bind_must_consp(current, datum, $list114);
			hostname = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list114);
			port = current.first();
			current = current.rest();
			if (NIL == current) {
				return format(NIL, $sparql_endpoint_browser_format_string$.getGlobalValue(), new SubLObject[] { hostname, port, web_utilities.html_url_encode(term_identifier, UNPROVIDED) });
			}
			cdestructuring_bind_error(datum, $list114);
		}
		return NIL;
	}

	public static SubLObject get_term_list_as_renderings_with_fact_sheets_stripped(SubLObject cycl_term_list, SubLObject mt, final SubLObject force, SubLObject generation_mt, SubLObject should_sortP, SubLObject nl_preds, SubLObject filter_irrelevant_termsP) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (should_sortP == UNPROVIDED) {
			should_sortP = T;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = list($$nonPlural_Generic);
		}
		if (filter_irrelevant_termsP == UNPROVIDED) {
			filter_irrelevant_termsP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		mt = hlmt_czer.coerce_to_hlmt(mt);
		generation_mt = hlmt_czer.coerce_to_hlmt(generation_mt);
		if (NIL != filter_irrelevant_termsP) {
			cycl_term_list = rkf_relevance_utilities.rkf_filter_irrelevant_terms(cycl_term_list, mt);
		}
		final SubLObject fact_sheet_table = make_hash_table(TEN_INTEGER, UNPROVIDED, UNPROVIDED);
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$23 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$24 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$25 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$26 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$27 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(NIL != generation_mt ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
										pph_vars.$pph_domain_mt$.bind(NIL != mt ? pph_utilities.pph_canonicalize_hlmt(mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
										SubLObject cdolist_list_var = cycl_term_list;
										SubLObject v_term = NIL;
										v_term = cdolist_list_var.first();
										while (NIL != cdolist_list_var) {
											sethash(v_term, fact_sheet_table, convert_mini_html_to_text(fact_sheets.get_fact_sheet_for_term_in_html(v_term, $MINI, mt, generation_mt, $list99).first()));
											cdolist_list_var = cdolist_list_var.rest();
											v_term = cdolist_list_var.first();
										}
									} finally {
										pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$27, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$26, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$25, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$24, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$23, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		final SubLObject renderings_lists = convert_term_list_to_renderings_for_java(cycl_term_list, mt, force, nl_preds, generation_mt, should_sortP, UNPROVIDED, UNPROVIDED);
		SubLObject result = NIL;
		SubLObject cdolist_list_var2 = renderings_lists;
		SubLObject renderings_list = NIL;
		renderings_list = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
			SubLObject current;
			final SubLObject datum = current = renderings_list;
			SubLObject rendering = NIL;
			SubLObject v_term2 = NIL;
			destructuring_bind_must_consp(current, datum, $list100);
			rendering = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list100);
			v_term2 = current.first();
			current = current.rest();
			if (NIL == current) {
				result = cons(list(rendering, v_term2, gethash(v_term2, fact_sheet_table, UNPROVIDED)), result);
			} else {
				cdestructuring_bind_error(datum, $list100);
			}
			cdolist_list_var2 = cdolist_list_var2.rest();
			renderings_list = cdolist_list_var2.first();
		}
		result = nreverse(result);
		return result;
	}

	public static SubLObject convert_mini_html_to_text(final SubLObject mini_html_string) {
		SubLObject lines = NIL;
		SubLObject cdolist_list_var = string_utilities.string_tokenize(remove_html_tags(mini_html_string, UNPROVIDED), $list117, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject l = NIL;
		l = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject trimmed_line = string_utilities.trim_whitespace(l);
			if ((NIL != string_utilities.non_empty_string_p(trimmed_line)) && (!trimmed_line.equal($mini_fact_sheet_to_fact_sheet_link_text$.getGlobalValue()))) {
				lines = cons(trimmed_line, lines);
			}
			cdolist_list_var = cdolist_list_var.rest();
			l = cdolist_list_var.first();
		}
		return string_utilities.bunge(nreverse(lines), CHAR_semicolon);
	}

	public static SubLObject convert_term_list_to_renderings_for_java(final SubLObject term_list, SubLObject domain_mt, SubLObject force, SubLObject nl_preds, SubLObject generation_mt, SubLObject should_sortP, SubLObject disambiguateP, SubLObject fastP) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = pph_vars.$pph_domain_mt$.getDynamicValue();
		}
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = list($$nonPlural_Generic);
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (should_sortP == UNPROVIDED) {
			should_sortP = T;
		}
		if (disambiguateP == UNPROVIDED) {
			disambiguateP = T;
		}
		if (fastP == UNPROVIDED) {
			fastP = T;
		}
		return convert_term_list_to_renderings_for_java_int(term_list, domain_mt, force, nl_preds, generation_mt, should_sortP, disambiguateP, fastP);
	}

	public static SubLObject convert_term_list_to_renderings_for_java_int_internal(SubLObject term_list, final SubLObject domain_mt, final SubLObject force, final SubLObject nl_preds, final SubLObject generation_mt, final SubLObject should_sortP, SubLObject disambiguateP, SubLObject fastP) {
		if (disambiguateP == UNPROVIDED) {
			disambiguateP = T;
		}
		if (fastP == UNPROVIDED) {
			fastP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		term_list = delete_if(symbol_function(NULL), copy_list(term_list), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject result_nl = NIL;
		SubLObject result = NIL;
		final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
		try {
			pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$30 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
			try {
				pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
				final SubLObject reuseP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					thread.resetMultipleValues();
					final SubLObject _prev_bind_0_$31 = pph_macros.$pph_memoization_state$.currentBinding(thread);
					try {
						pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
						final SubLObject new_or_reused = thread.secondMultipleValue();
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$32 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
							final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
							final SubLObject _prev_bind_0_$33 = memoization_state.$memoization_state$.currentBinding(thread);
							try {
								memoization_state.$memoization_state$.bind(local_state, thread);
								final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
								try {
									final SubLObject _prev_bind_0_$34 = pph_vars.$pph_language_mt$.currentBinding(thread);
									final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
									final SubLObject _prev_bind_3 = pph_vars.$pph_track_discourse_referentsP$.currentBinding(thread);
									try {
										pph_vars.$pph_language_mt$.bind(NIL != generation_mt ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
										pph_vars.$pph_domain_mt$.bind(NIL != domain_mt ? pph_utilities.pph_canonicalize_hlmt(domain_mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
										pph_vars.$pph_track_discourse_referentsP$.bind(NIL, thread);
										if (NIL != disambiguateP) {
											result_nl = pph_main.generate_disambiguation_phrases_for_java(term_list, force, nl_preds, generation_mt, domain_mt, NIL, NIL != fastP ? $REQUIRED : $PREFERRED);
										} else {
											SubLObject cdolist_list_var = reverse(term_list);
											SubLObject v_term = NIL;
											v_term = cdolist_list_var.first();
											while (NIL != cdolist_list_var) {
												result_nl = cons(pph_main.generate_phrase_for_java(v_term, nl_preds, force, generation_mt, domain_mt, $HTML), result_nl);
												cdolist_list_var = cdolist_list_var.rest();
												v_term = cdolist_list_var.first();
											}
										}
									} finally {
										pph_vars.$pph_track_discourse_referentsP$.rebind(_prev_bind_3, thread);
										pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
										pph_vars.$pph_language_mt$.rebind(_prev_bind_0_$34, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
									}
								}
							} finally {
								memoization_state.$memoization_state$.rebind(_prev_bind_0_$33, thread);
							}
						} finally {
							pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$32, thread);
						}
						if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
							memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
						}
					} finally {
						pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$31, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						if (NIL == reuseP) {
							pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
						}
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
					}
				}
			} finally {
				pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$30, thread);
			}
		} finally {
			pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
		}
		if (NIL != should_sortP) {
			thread.resetMultipleValues();
			final SubLObject sorted_nl = pph_main.alphabetize_pph_javalists(result_nl, term_list, NIL);
			final SubLObject sorted_terms = thread.secondMultipleValue();
			thread.resetMultipleValues();
			result_nl = sorted_nl;
			term_list = sorted_terms;
		}
		SubLObject v_term2 = NIL;
		SubLObject v_term_$37 = NIL;
		SubLObject pph_javalist = NIL;
		SubLObject pph_javalist_$38 = NIL;
		v_term2 = term_list;
		v_term_$37 = v_term2.first();
		pph_javalist = result_nl;
		pph_javalist_$38 = pph_javalist.first();
		while ((NIL != pph_javalist) || (NIL != v_term2)) {
			if (NIL != pph_javalist_$38) {
				final SubLObject use_javalistsP = T;
				final SubLObject nl = (NIL != use_javalistsP) ? pph_javalist_$38 : pph_utilities.pph_javalist_string(pph_javalist_$38);
				result = cons(list(nl, v_term_$37), result);
			}
			v_term2 = v_term2.rest();
			v_term_$37 = v_term2.first();
			pph_javalist = pph_javalist.rest();
			pph_javalist_$38 = pph_javalist.first();
		}
		return nreverse(result);
	}

	public static SubLObject convert_term_list_to_renderings_for_java_int(final SubLObject term_list, final SubLObject domain_mt, final SubLObject force, final SubLObject nl_preds, final SubLObject generation_mt, final SubLObject should_sortP, SubLObject disambiguateP, SubLObject fastP) {
		if (disambiguateP == UNPROVIDED) {
			disambiguateP = T;
		}
		if (fastP == UNPROVIDED) {
			fastP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return convert_term_list_to_renderings_for_java_int_internal(term_list, domain_mt, force, nl_preds, generation_mt, should_sortP, disambiguateP, fastP);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CONVERT_TERM_LIST_TO_RENDERINGS_FOR_JAVA_INT, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CONVERT_TERM_LIST_TO_RENDERINGS_FOR_JAVA_INT, EIGHT_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, CONVERT_TERM_LIST_TO_RENDERINGS_FOR_JAVA_INT, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_8(term_list, domain_mt, force, nl_preds, generation_mt, should_sortP, disambiguateP, fastP);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (term_list.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (domain_mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (force.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (nl_preds.equal(cached_args.first())) {
								cached_args = cached_args.rest();
								if (generation_mt.equal(cached_args.first())) {
									cached_args = cached_args.rest();
									if (should_sortP.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (disambiguateP.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && fastP.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(convert_term_list_to_renderings_for_java_int_internal(term_list, domain_mt, force, nl_preds, generation_mt, should_sortP, disambiguateP, fastP)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(term_list, domain_mt, force, nl_preds, generation_mt, should_sortP, disambiguateP, fastP));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject salient_instantiation_exemplars(final SubLObject collection, final SubLObject max_count, SubLObject instantiation_type) {
		if (instantiation_type == UNPROVIDED) {
			instantiation_type = $ALL_INSTANTIATIONS;
		}
		final SubLObject v_instances = (instantiation_type == $ALL_INSTANTIATIONS) ? rkf_ontology_utilities.rkf_all_instantiations(collection, NIL) : rkf_ontology_utilities.rkf_instantiations(collection, NIL);
		final SubLObject attack_order = Sort.sort(v_instances, symbol_function($sym125$_), symbol_function(NUM_INDEX));
		return list_utilities.first_n(max_count, attack_order);
	}

	public static SubLObject get_example_instances_as_renderings_int(final SubLObject collection, final SubLObject max_count, final SubLObject should_sortP, final SubLObject instantiation_type, final SubLObject force, final SubLObject domain_mt, final SubLObject generation_mt, final SubLObject nl_preds) {
		assert NIL != kb_accessors.set_or_collectionP(collection) : "kb_accessors.set_or_collectionP(collection) " + "CommonSymbols.NIL != kb_accessors.set_or_collectionP(collection) " + collection;
		final SubLObject v_instances = salient_instantiation_exemplars(collection, max_count, instantiation_type);
		final SubLObject result = convert_term_list_to_renderings_for_java(v_instances, domain_mt, force, nl_preds, generation_mt, should_sortP, UNPROVIDED, UNPROVIDED);
		return result;
	}

	public static SubLObject get_example_instances_as_renderings_new(final SubLObject collection, final SubLObject count, SubLObject mt, SubLObject instantiation_type, SubLObject mt_direction_type, SubLObject should_sortP, SubLObject force, SubLObject generation_mt, SubLObject nl_preds) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		if (instantiation_type == UNPROVIDED) {
			instantiation_type = $ALL_INSTANTIATIONS;
		}
		if (mt_direction_type == UNPROVIDED) {
			mt_direction_type = $ANY_MT;
		}
		if (should_sortP == UNPROVIDED) {
			should_sortP = T;
		}
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = default_nl_preds_for_type_list(collection, generation_mt);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == kb_accessors.set_or_collectionP(collection)) {
			return list(NIL, MINUS_ONE_INTEGER);
		}
		if (NIL != mt) {
			mt = hlmt_czer.coerce_to_hlmt(mt);
		}
		if (NIL != generation_mt) {
			generation_mt = hlmt_czer.coerce_to_hlmt(generation_mt);
		}
		SubLObject result = list(NIL, MINUS_ONE_INTEGER);
		final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = pph_vars.$pph_domain_mt$.currentBinding(thread);
		try {
			pph_vars.$pph_language_mt$.bind(NIL != generation_mt ? pph_utilities.pph_canonicalize_hlmt(generation_mt) : pph_vars.$pph_language_mt$.getDynamicValue(thread), thread);
			pph_vars.$pph_domain_mt$.bind(NIL != mt ? pph_utilities.pph_canonicalize_hlmt(mt) : pph_vars.$pph_domain_mt$.getDynamicValue(thread), thread);
			if (mt_direction_type == $ANY_MT) {
				final SubLObject _prev_bind_0_$39 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_1_$40 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
					mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
					result = get_example_instances_as_renderings_int(collection, count, should_sortP, instantiation_type, force, mt, generation_mt, nl_preds);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1_$40, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$39, thread);
				}
			} else if (mt_direction_type == $LOCAL_CHANGE) {
				final SubLObject _prev_bind_0_$40 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_1_$41 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
					mt_relevance_macros.$mt$.bind(mt, thread);
					result = get_example_instances_as_renderings_int(collection, count, should_sortP, instantiation_type, force, mt, generation_mt, nl_preds);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1_$41, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$40, thread);
				}
			} else if (mt_direction_type == $UPWARD_CLOSURE) {
				final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
				final SubLObject _prev_bind_0_$41 = mt_relevance_macros.$mt$.currentBinding(thread);
				final SubLObject _prev_bind_1_$42 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
				try {
					mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
					mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
					mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
					result = get_example_instances_as_renderings_int(collection, count, should_sortP, instantiation_type, force, mt, generation_mt, nl_preds);
				} finally {
					mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$42, thread);
					mt_relevance_macros.$mt$.rebind(_prev_bind_0_$41, thread);
				}
			} else if (mt_direction_type == $DOWNWARD_CLOSURE) {
				final SubLObject _prev_bind_0_$42 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_1_$43 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
					mt_relevance_macros.$mt$.bind(mt, thread);
					result = get_example_instances_as_renderings_int(collection, count, should_sortP, instantiation_type, force, mt, generation_mt, nl_preds);
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1_$43, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$42, thread);
				}
			}

		} finally {
			pph_vars.$pph_domain_mt$.rebind(_prev_bind_2, thread);
			pph_vars.$pph_language_mt$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject clear_get_example_instances_as_renderings() {
		final SubLObject cs = $get_example_instances_as_renderings_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_example_instances_as_renderings(final SubLObject collection, final SubLObject mt, final SubLObject force, final SubLObject count, SubLObject generation_mt, SubLObject nl_preds) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = default_nl_preds_for_type_list(collection, generation_mt);
		}
		return memoization_state.caching_state_remove_function_results_with_args($get_example_instances_as_renderings_caching_state$.getGlobalValue(), list(collection, mt, force, count, generation_mt, nl_preds), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_example_instances_as_renderings_internal(final SubLObject collection, SubLObject mt, final SubLObject force, final SubLObject count, SubLObject generation_mt, final SubLObject nl_preds) {
		assert NIL != kb_accessors.set_or_collectionP(collection) : "kb_accessors.set_or_collectionP(collection) " + "CommonSymbols.NIL != kb_accessors.set_or_collectionP(collection) " + collection;
		mt = hlmt_czer.coerce_to_hlmt(mt);
		generation_mt = hlmt_czer.coerce_to_hlmt(generation_mt);
		final SubLObject result = convert_term_list_to_renderings_for_java(get_salient_exemplars(collection, mt, count), mt, force, nl_preds, generation_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return Sort.sort(result, symbol_function(PPH_LIST_ITEM_COMPARATOR), UNPROVIDED);
	}

	public static SubLObject get_example_instances_as_renderings(final SubLObject collection, final SubLObject mt, final SubLObject force, final SubLObject count, SubLObject generation_mt, SubLObject nl_preds) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = default_nl_preds_for_type_list(collection, generation_mt);
		}
		SubLObject caching_state = $get_example_instances_as_renderings_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_EXAMPLE_INSTANCES_AS_RENDERINGS, $get_example_instances_as_renderings_caching_state$, NIL, EQUAL, SIX_INTEGER, $int$256);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_6(collection, mt, force, count, generation_mt, nl_preds);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (collection.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (force.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (count.equal(cached_args.first())) {
								cached_args = cached_args.rest();
								if (generation_mt.equal(cached_args.first())) {
									cached_args = cached_args.rest();
									if (((NIL != cached_args) && (NIL == cached_args.rest())) && nl_preds.equal(cached_args.first())) {
										return memoization_state.caching_results(results2);
									}
								}
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_example_instances_as_renderings_internal(collection, mt, force, count, generation_mt, nl_preds)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt, force, count, generation_mt, nl_preds));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject clear_get_salient_exemplars() {
		final SubLObject cs = $get_salient_exemplars_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_salient_exemplars(final SubLObject collection, final SubLObject mt, final SubLObject count) {
		return memoization_state.caching_state_remove_function_results_with_args($get_salient_exemplars_caching_state$.getGlobalValue(), list(collection, mt, count), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_salient_exemplars_internal(final SubLObject collection, final SubLObject mt, final SubLObject count) {
		return rkf_ontology_utilities.rkf_salient_instantiation_exemplars(collection, mt, count, UNPROVIDED);
	}

	public static SubLObject get_salient_exemplars(final SubLObject collection, final SubLObject mt, final SubLObject count) {
		SubLObject caching_state = $get_salient_exemplars_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_SALIENT_EXEMPLARS, $get_salient_exemplars_caching_state$, NIL, EQUAL, THREE_INTEGER, $int$256);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(collection, mt, count);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (collection.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && count.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_salient_exemplars_internal(collection, mt, count)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt, count));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject get_collection_extent_estimates(final SubLObject collection, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == forts.fort_p(collection)) {
			return list(NIL, ZERO_INTEGER);
		}
		final SubLObject completely_knownP = kb_accessors.completely_enumerable_collectionP(collection, mt);
		final SubLObject estimate = cardinality_estimates.instance_cardinality(collection);
		SubLObject result = NIL;
		if ((NIL != completely_knownP) || estimate.isZero()) {
			result = list(T, length(get_collection_instances(collection, mt, UNPROVIDED)));
		} else {
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
				mt_relevance_macros.$mt$.bind(mt, thread);
				result = list(NIL, estimate);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		}
		return result;
	}

	public static SubLObject naut_isas_completely_enumerable(final SubLObject naut, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject any_not_enumerable = NIL;
		SubLObject isas = NIL;
		final SubLObject mt_var = mt;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			SubLObject cdolist_list_var;
			isas = cdolist_list_var = isa.naut_isa(naut, UNPROVIDED);
			SubLObject cur_isa = NIL;
			cur_isa = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL == kb_accessors.completely_enumerable_collectionP(cur_isa, UNPROVIDED)) {
					any_not_enumerable = T;
				}
				cdolist_list_var = cdolist_list_var.rest();
				cur_isa = cdolist_list_var.first();
			}
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return makeBoolean(NIL == any_not_enumerable);
	}

	public static SubLObject naut_isas_estimated_instances(final SubLObject naut, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject count = ZERO_INTEGER;
		SubLObject isas = NIL;
		final SubLObject mt_var = mt;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			SubLObject cdolist_list_var;
			isas = cdolist_list_var = isa.naut_isa(naut, UNPROVIDED);
			SubLObject cur_isa = NIL;
			cur_isa = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				count = add(count, cardinality_estimates.instance_cardinality(cur_isa));
				cdolist_list_var = cdolist_list_var.rest();
				cur_isa = cdolist_list_var.first();
			}
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return count;
	}

	public static SubLObject get_detailed_instance_estimates(final SubLObject collection, final SubLObject instantiation_type, final SubLObject count, SubLObject max_to_get_precisely) {
		if (max_to_get_precisely == UNPROVIDED) {
			max_to_get_precisely = $int$500;
		}
		if (count.numG(max_to_get_precisely)) {
			return count;
		}
		return length(instantiation_type == $ALL_INSTANTIATIONS ? rkf_ontology_utilities.rkf_all_instantiations(collection, UNPROVIDED) : rkf_ontology_utilities.rkf_instantiations(collection, UNPROVIDED));
	}

	public static SubLObject get_collection_extent_estimates_int(final SubLObject collection, final SubLObject instantiation_type, SubLObject max_to_get_precisely) {
		if (max_to_get_precisely == UNPROVIDED) {
			max_to_get_precisely = $int$500;
		}
		if (NIL != isa.isaP(collection, $$Set_Mathematical, UNPROVIDED, UNPROVIDED)) {
			final SubLObject completely_knownP = NIL;
			final SubLObject estimate = length(instantiation_type == $ALL_INSTANTIATIONS ? rkf_ontology_utilities.rkf_all_instantiations(collection, UNPROVIDED) : rkf_ontology_utilities.rkf_instantiations(collection, UNPROVIDED));
			return list(completely_knownP, estimate);
		}
		if (NIL != possibly_naut_p(collection)) {
			final SubLObject completely_knownP = naut_isas_completely_enumerable(collection, UNPROVIDED);
			SubLObject estimate = naut_isas_estimated_instances(collection, UNPROVIDED);
			estimate = get_detailed_instance_estimates(collection, instantiation_type, estimate, max_to_get_precisely);
			return list(completely_knownP, estimate);
		}
		final SubLObject completely_knownP = kb_accessors.completely_enumerable_collectionP(collection, UNPROVIDED);
		SubLObject estimate = cardinality_estimates.instance_cardinality(collection);
		SubLObject result = NIL;
		estimate = get_detailed_instance_estimates(collection, instantiation_type, estimate, max_to_get_precisely);
		result = list(completely_knownP, estimate);
		return result;
	}

	public static SubLObject get_collection_extent_estimates_new(final SubLObject collection, SubLObject mt, final SubLObject instantiation_type, final SubLObject mt_direction_type) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == kb_accessors.set_or_collectionP(collection)) {
			return list(NIL, MINUS_ONE_INTEGER);
		}
		if (NIL != mt) {
			mt = hlmt_czer.coerce_to_hlmt(mt);
		}
		SubLObject result = list(NIL, MINUS_ONE_INTEGER);
		if (mt_direction_type == $ANY_MT) {
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
				mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
				result = get_collection_extent_estimates_int(collection, instantiation_type, UNPROVIDED);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		} else if (mt_direction_type == $LOCAL_CHANGE) {
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
				mt_relevance_macros.$mt$.bind(mt, thread);
				result = get_collection_extent_estimates_int(collection, instantiation_type, UNPROVIDED);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		} else if (mt_direction_type == $UPWARD_CLOSURE) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				result = get_collection_extent_estimates_int(collection, instantiation_type, UNPROVIDED);
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_5, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
			}
		} else if (mt_direction_type == $DOWNWARD_CLOSURE) {
			final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
			try {
				mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_SPEC_MT, thread);
				mt_relevance_macros.$mt$.bind(mt, thread);
				result = get_collection_extent_estimates_int(collection, instantiation_type, UNPROVIDED);
			} finally {
				mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
			}
		}

		return result;
	}

	public static SubLObject create_new_instance_from_template(final SubLObject name, final SubLObject assert_elmt, final SubLObject template_id, SubLObject template_elmt, SubLObject prefix, SubLObject html_state) {
		if (template_elmt == UNPROVIDED) {
			template_elmt = $$InferencePSC;
		}
		if (prefix == UNPROVIDED) {
			prefix = $str138$;
		}
		if (html_state == UNPROVIDED) {
			html_state = NIL;
		}
		assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
		assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
		assert NIL != hlmt.possibly_mt_p(assert_elmt) : "hlmt.possibly_mt_p(assert_elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(assert_elmt) " + assert_elmt;
		assert NIL != hlmt.possibly_mt_p(template_elmt) : "hlmt.possibly_mt_p(template_elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(template_elmt) " + template_elmt;
		final SubLObject isas = formula_template_utilities.template_type_for_focal_term_types(template_id, template_elmt);
		final SubLObject v_genls = formula_template_utilities.template_topic_genls(template_id, template_elmt);
		return rkf_term_utilities.create_new_constant(name, isas, v_genls, assert_elmt, prefix, html_state, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject kill_constant(final SubLObject constant) {
		return kill_fort(constant);
	}

	public static SubLObject kill_fort(final SubLObject fort) {
		assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
		SubLObject col_mt_combos = NIL;
		SubLObject cdolist_list_var;
		final SubLObject isa_assertions = cdolist_list_var = get_all_isa_assertions_for_fort(fort);
		SubLObject isa_assertion = NIL;
		isa_assertion = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject formula = uncanonicalizer.assertion_el_formula(isa_assertion);
			final SubLObject predicate = cycl_utilities.formula_arg0(formula);
			final SubLObject collection = cycl_utilities.formula_arg2(formula, UNPROVIDED);
			final SubLObject mt = assertions_high.assertion_mt(isa_assertion);
			if (predicate.eql($$isa)) {
				col_mt_combos = cons(cons(collection, mt), col_mt_combos);
			}
			cdolist_list_var = cdolist_list_var.rest();
			isa_assertion = cdolist_list_var.first();
		}
		rkf_term_utilities.rkf_kill(fort);
		SubLObject cdolist_list_var2 = col_mt_combos;
		SubLObject col_mt_combo = NIL;
		col_mt_combo = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
			SubLObject current;
			final SubLObject datum = current = col_mt_combo;
			SubLObject collection2 = NIL;
			SubLObject mt2 = NIL;
			destructuring_bind_must_consp(current, datum, $list142);
			collection2 = current.first();
			current = mt2 = current.rest();
			recheck_collection_instances_cooccurence_cache(collection2, mt2);
			cdolist_list_var2 = cdolist_list_var2.rest();
			col_mt_combo = cdolist_list_var2.first();
		}
		return T;
	}

	public static SubLObject get_all_isa_assertions_for_fort(final SubLObject fort) {
		final SubLObject variable = $sym143$_WHAT;
		final SubLObject binding_sets = rkf_query_utilities.rkf_query(list($$assertedSentence, list($$isa, fort, variable)), $$InferencePSC, ZERO_INTEGER, NIL, UNPROVIDED, UNPROVIDED);
		SubLObject assertions = NIL;
		SubLObject cdolist_list_var = binding_sets;
		SubLObject binding_set = NIL;
		binding_set = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = binding_set;
			SubLObject v_bindings = NIL;
			SubLObject assertion_list = NIL;
			destructuring_bind_must_consp(current, datum, $list144);
			v_bindings = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list144);
			assertion_list = current.first();
			current = current.rest();
			if (NIL == current) {
				SubLObject cdolist_list_var_$47 = assertion_list;
				SubLObject assertion = NIL;
				assertion = cdolist_list_var_$47.first();
				while (NIL != cdolist_list_var_$47) {
					assertions = cons(assertion, assertions);
					cdolist_list_var_$47 = cdolist_list_var_$47.rest();
					assertion = cdolist_list_var_$47.first();
				}
			} else {
				cdestructuring_bind_error(datum, $list144);
			}
			cdolist_list_var = cdolist_list_var.rest();
			binding_set = cdolist_list_var.first();
		}
		return assertions;
	}

	public static SubLObject clear_get_reformulation_specification_from_kb() {
		final SubLObject cs = $get_reformulation_specification_from_kb_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_reformulation_specification_from_kb(final SubLObject refspec_id, final SubLObject mt) {
		return memoization_state.caching_state_remove_function_results_with_args($get_reformulation_specification_from_kb_caching_state$.getGlobalValue(), list(refspec_id, mt), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_reformulation_specification_from_kb_internal(final SubLObject refspec_id, final SubLObject mt) {
		return reformulation_specification.load_reformulation_specification_from_kb(refspec_id, mt);
	}

	public static SubLObject get_reformulation_specification_from_kb(final SubLObject refspec_id, final SubLObject mt) {
		SubLObject caching_state = $get_reformulation_specification_from_kb_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_REFORMULATION_SPECIFICATION_FROM_KB, $get_reformulation_specification_from_kb_caching_state$, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(refspec_id, mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (refspec_id.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_reformulation_specification_from_kb_internal(refspec_id, mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(refspec_id, mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject reformulate_unknown_fet_term(final SubLObject v_term, final SubLObject domain_mt, SubLObject refspec_id, SubLObject refspec_mt) {
		if (refspec_id == UNPROVIDED) {
			refspec_id = $$FET_UnknownTermReformulation;
		}
		if (refspec_mt == UNPROVIDED) {
			refspec_mt = $$FETReformulatorRulesMt;
		}
		final SubLObject settings = get_reformulation_specification_from_kb(refspec_id, refspec_mt);
		return reformulator_hub.reformulate_cycl(v_term, domain_mt, settings);
	}

	public static SubLObject make_fet_evaluation_assertion(SubLObject assertion_sentence, SubLObject assertion_elmt, SubLObject primary_term, final SubLObject new_evaluation_pred, SubLObject refspec_id, SubLObject refspec_mt, SubLObject evaluation_mt) {
		if (refspec_id == UNPROVIDED) {
			refspec_id = NIL;
		}
		if (refspec_mt == UNPROVIDED) {
			refspec_mt = NIL;
		}
		if (evaluation_mt == UNPROVIDED) {
			evaluation_mt = $fet_evaluation_mt$.getDynamicValue();
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_grammar.cycl_sentence_p(assertion_sentence) : "cycl_grammar.cycl_sentence_p(assertion_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(assertion_sentence) " + assertion_sentence;
		assert NIL != hlmt.possibly_mt_p(assertion_elmt) : "hlmt.possibly_mt_p(assertion_elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(assertion_elmt) " + assertion_elmt;
		assert NIL != cycl_utilities.fort_or_naut_p(primary_term) : "cycl_utilities.fort_or_naut_p(primary_term) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(primary_term) " + primary_term;
		if (((NIL != new_evaluation_pred) && (!assertionsDisabledSynth)) && (NIL == fort_types_interface.predicateP(new_evaluation_pred))) {
			throw new AssertionError(new_evaluation_pred);
		}
		if (NIL == constants_high.find_constant($$$EvaluationOfAssertionByOnFn)) {
			return values(NIL, $str156$Couldn_t_find_constant___Evaluati);
		}
		primary_term = czer_main.coerce_to_fort(primary_term);
		assertion_elmt = cycl_utilities.hl_to_el(assertion_elmt);
		if (NIL != contains_mt_indexical_referencesP(assertion_sentence)) {
			assertion_sentence = resolve_mt_indexical_references(assertion_sentence, assertion_elmt);
		}
		thread.resetMultipleValues();
		final SubLObject query_sentence = formula_templates.get_assertion_finding_query_sentence(assertion_sentence, NIL);
		final SubLObject original_query = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != query_sentence) {
			final SubLObject max_number = ONE_INTEGER;
			final SubLObject reassemble_polycanonicalized_assertionsP = NIL;
			final SubLObject assertion_hlmt = hlmt_czer.coerce_to_hlmt(assertion_elmt);
			final SubLObject check_reformulationsP = list_utilities.sublisp_boolean(refspec_id);
			final SubLObject assertion = formula_templates.get_assertions_for_fet_sentence(query_sentence, primary_term, assertion_hlmt, max_number, original_query, NIL, reassemble_polycanonicalized_assertionsP, check_reformulationsP).first();
			if (NIL != assertion) {
				assertion_sentence = uncanonicalizer.assertion_el_formula(assertion);
				assertion_elmt = uncanonicalizer.assertion_elmt(assertion);
			}
		}
		final SubLObject evaluation_target;
		final SubLObject ist_form = evaluation_target = make_ist_sentence(assertion_elmt, assertion_sentence);
		final SubLObject evaluator = operation_communication.the_cyclist();
		final SubLObject pre_existing_evaluations = existing_fet_evaluations_of_by(evaluation_target, evaluator);
		final SubLObject evaluation = (NIL != new_evaluation_pred) ? make_fet_evaluation_of_by(evaluation_target, evaluator, evaluation_mt) : NIL;
		final SubLObject sentence_to_assert = (NIL != evaluation) ? make_binary_formula($$evaluationOutputSentences, evaluation, make_unary_formula(new_evaluation_pred, assertion_sentence)) : NIL;
		SubLObject successP = NIL;
		SubLObject error_message = NIL;
		if (NIL != sentence_to_assert) {
			thread.resetMultipleValues();
			final SubLObject successP_$48 = add_or_edit_assertion_internal(sentence_to_assert, primary_term, evaluation_mt, NIL, refspec_id, refspec_mt, NIL);
			final SubLObject error_message_$49 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			successP = successP_$48;
			error_message = error_message_$49;
		} else {
			successP = T;
		}
		if (NIL != successP) {
			if (NIL == error_message) {
				SubLObject csome_list_var = pre_existing_evaluations;
				SubLObject pre_existing = NIL;
				pre_existing = csome_list_var.first();
				while ((NIL == error_message) && (NIL != csome_list_var)) {
					try {
						thread.throwStack.push($catch_error_message_target$.getGlobalValue());
						final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
						try {
							Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
							try {
								rkf_term_utilities.rkf_kill(pre_existing);
							} catch (final Throwable catch_var) {
								Errors.handleThrowable(catch_var, NIL);
							}
						} finally {
							Errors.$error_handler$.rebind(_prev_bind_0, thread);
						}
					} catch (final Throwable ccatch_env_var) {
						error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
					} finally {
						thread.throwStack.pop();
					}
					csome_list_var = csome_list_var.rest();
					pre_existing = csome_list_var.first();
				}
			}
			if ((NIL != error_message) && (NIL != pre_existing_evaluations)) {
				error_message = cconcatenate($str158$Couldn_t_remove_all_pre_existing_, error_message);
				successP = NIL;
			}
		}
		return values(successP, error_message);
	}

	public static SubLObject make_fet_evaluation_of_by(final SubLObject evaluation_target, final SubLObject evaluator, SubLObject evaluation_mt) {
		if (evaluation_mt == UNPROVIDED) {
			evaluation_mt = $fet_evaluation_mt$.getDynamicValue();
		}
		final SubLObject timestamp = date_utilities.indexical_seconds_since_1970();
		final SubLObject pred = formula_templates.quaternary_fet_evaluation_pred();
		final SubLObject evaluation = rkf_term_utilities.create_new_constant($$$Evaluation, $list160, NIL, evaluation_mt, $$$FET, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != pred) {
			rkf_assertion_utilities.rkf_assert_now(make_quaternary_formula(pred, evaluation, evaluation_target, evaluator, timestamp), evaluation_mt);
		}
		return evaluation;
	}

	public static SubLObject existing_fet_evaluations_of_by(final SubLObject evaluation_target, final SubLObject evaluator) {
		final SubLObject pred = formula_templates.quaternary_fet_evaluation_pred();
		return NIL != pred ? ask_utilities.query_variable($sym162$_EVALUATION, listS(pred, $sym162$_EVALUATION, evaluation_target, evaluator, $list163), $$InferencePSC, $list164) : NIL;
	}

	public static SubLObject existing_fet_evaluations_of(final SubLObject evaluation_target) {
		final SubLObject pred = formula_templates.quaternary_fet_evaluation_pred();
		return NIL != pred ? ask_utilities.query_variable($sym162$_EVALUATION, listS(pred, $sym162$_EVALUATION, evaluation_target, $list165), $$InferencePSC, $list164) : NIL;
	}

	public static SubLObject add_or_edit_assertion_verbose(final SubLObject new_sentence, final SubLObject primary_term, final SubLObject elmt, final SubLObject old_sentence, SubLObject refspec_id, SubLObject refspec_mt) {
		if (refspec_id == UNPROVIDED) {
			refspec_id = NIL;
		}
		if (refspec_mt == UNPROVIDED) {
			refspec_mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_utilities.fort_or_naut_p(primary_term) : "cycl_utilities.fort_or_naut_p(primary_term) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(primary_term) " + primary_term;
		assert NIL != hlmt.possibly_mt_p(elmt) : "hlmt.possibly_mt_p(elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(elmt) " + elmt;
		thread.resetMultipleValues();
		final SubLObject successP = add_or_edit_assertion_internal(new_sentence, primary_term, elmt, old_sentence, refspec_id, refspec_mt, T);
		final SubLObject reason = thread.secondMultipleValue();
		thread.resetMultipleValues();
		return list(successP, reason);
	}

	public static SubLObject add_or_edit_assertion(final SubLObject new_sentence, final SubLObject primary_term, final SubLObject elmt, final SubLObject old_sentence, SubLObject refspec_id, SubLObject refspec_mt) {
		if (refspec_id == UNPROVIDED) {
			refspec_id = NIL;
		}
		if (refspec_mt == UNPROVIDED) {
			refspec_mt = NIL;
		}
		assert NIL != cycl_utilities.fort_or_naut_p(primary_term) : "cycl_utilities.fort_or_naut_p(primary_term) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(primary_term) " + primary_term;
		assert NIL != hlmt.possibly_mt_p(elmt) : "hlmt.possibly_mt_p(elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(elmt) " + elmt;
		return add_or_edit_assertion_internal(new_sentence, primary_term, elmt, old_sentence, refspec_id, refspec_mt, T);
	}

	public static SubLObject add_or_edit_assertion_internal(SubLObject new_sentence, SubLObject primary_term, SubLObject elmt, SubLObject old_sentence, SubLObject refspec_id, SubLObject refspec_mt, final SubLObject elify_sentencesP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		primary_term = czer_main.coerce_to_fort(primary_term);
		elmt = hlmt_czer.coerce_to_hlmt(elmt);
		if ((NIL != new_sentence) && (NIL != elify_sentencesP)) {
			new_sentence = cycl_utilities.hl_to_el(new_sentence);
			if (NIL != elify_sentencesP) {
				assert NIL != el_formula_p(new_sentence) : "el_utilities.el_formula_p(new_sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(new_sentence) " + new_sentence;
			} else {
				assert NIL != cycl_grammar.cycl_formula_p(new_sentence) : "cycl_grammar.cycl_formula_p(new_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_formula_p(new_sentence) " + new_sentence;
			}
		}
		if ((NIL != old_sentence) && (NIL != elify_sentencesP)) {
			old_sentence = cycl_utilities.hl_to_el(old_sentence);
			if (NIL != elify_sentencesP) {
				assert NIL != el_formula_p(old_sentence) : "el_utilities.el_formula_p(old_sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(old_sentence) " + old_sentence;
			} else {
				assert NIL != cycl_grammar.cycl_formula_p(old_sentence) : "cycl_grammar.cycl_formula_p(old_sentence) " + "CommonSymbols.NIL != cycl_grammar.cycl_formula_p(old_sentence) " + old_sentence;
			}
		}
		if (NIL != refspec_id) {
			refspec_id = czer_main.coerce_to_fort(refspec_id);
		}
		if (NIL != refspec_mt) {
			refspec_mt = hlmt_czer.coerce_to_hlmt(refspec_mt);
		} else {
			refspec_mt = elmt;
		}
		if (new_sentence.equal(old_sentence)) {
			return values(T, $str170$OLD____NEW__nothing_to_be_done_);
		}
		final SubLObject original_new_sentence = copy_expression(new_sentence);
		final SubLObject original_old_sentence = copy_expression(old_sentence);
		final SubLObject original_elmt = elmt;
		SubLObject reformulation_happenedP = NIL;
		SubLObject result = NIL;
		SubLObject problems = NIL;
		thread.resetMultipleValues();
		final SubLObject old_sentence_$50 = reformulate_edit_sentences(old_sentence, new_sentence, elmt, refspec_id, refspec_mt);
		final SubLObject new_sentence_$51 = thread.secondMultipleValue();
		final SubLObject reformulation_happenedP_$52 = thread.thirdMultipleValue();
		thread.resetMultipleValues();
		old_sentence = old_sentence_$50;
		new_sentence = new_sentence_$51;
		reformulation_happenedP = reformulation_happenedP_$52;
		if (NIL != original_old_sentence) {
			final SubLObject check_reformulationsP = list_utilities.sublisp_boolean(refspec_id);
			thread.resetMultipleValues();
			final SubLObject result_$53 = unassert_fet_sentence(original_old_sentence, primary_term, elmt, check_reformulationsP);
			final SubLObject problems_$54 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			result = result_$53;
			problems = problems_$54;
		}
		if (NIL != new_sentence) {
			if (NIL != el_formula_with_operator_p(new_sentence, $$ist)) {
				final SubLObject datum_evaluated_var = cycl_utilities.formula_args(new_sentence, UNPROVIDED);
				elmt = datum_evaluated_var.first();
				new_sentence = cadr(datum_evaluated_var);
			}
			thread.resetMultipleValues();
			final SubLObject successP = rkf_assertion_utilities.rkf_assert_with_implicature(new_sentence, elmt, UNPROVIDED);
			final SubLObject reason = thread.secondMultipleValue();
			thread.resetMultipleValues();
			result = makeBoolean((NIL != successP) && ((NIL == original_old_sentence) || (NIL != result)));
			problems = (reason.isString()) ? problems.isString() ? cconcatenate(problems, new SubLObject[] { CHAR_newline, reason }) : reason : problems;
		}
		if ((NIL != new_sentence) && (NIL == result)) {
			final SubLObject old_sentence_givenP = list_utilities.sublisp_boolean(original_old_sentence);
			final SubLObject string_form = build_string_form_for_future_assertion(new_sentence, old_sentence, old_sentence_givenP, problems);
			final SubLObject formula = (NIL != old_sentence_givenP) ? new_sentence : problems;
			result = rkf_assertion_utilities.rkf_assert(list($$futureAssertion, primary_term, string_form, formula), elmt, UNPROVIDED, UNPROVIDED);
			problems = $future_assertion_message_string$.getGlobalValue();
		} else if (NIL != reformulation_happenedP) {
			note_reformulation_happened(list($$ist, elmt, new_sentence), primary_term, original_new_sentence, refspec_id, original_elmt);
		}

		return values(result, problems);
	}

	public static SubLObject unassert_fet_sentence(final SubLObject original_old_sentence, final SubLObject primary_term, final SubLObject elmt, final SubLObject check_reformulationsP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result = NIL;
		SubLObject problems = NIL;
		thread.resetMultipleValues();
		final SubLObject query_sentence = formula_templates.get_assertion_finding_query_sentence(original_old_sentence, NIL);
		final SubLObject original_query = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != query_sentence) {
			final SubLObject max_number = NIL;
			final SubLObject reassemble_polycanonicalized_assertionsP = NIL;
			final SubLObject assertions = formula_templates.get_assertions_for_fet_sentence(query_sentence, primary_term, elmt, max_number, original_query, NIL, reassemble_polycanonicalized_assertionsP, check_reformulationsP);
			final SubLObject skolem_narts = skolem_narts_from_assertions(assertions);
			if (NIL != list_utilities.find_if_not($sym172$VALID_ASSERTION_, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
				result = NIL;
				problems = $str173$Assertion_deemed_invalid_;
			} else if (NIL == assertions) {
				result = NIL;
				problems = $str174$No_such_sentence_to_unassert_;
			} else if (NIL != skolem_narts) {
				SubLObject cdolist_list_var = assertions;
				SubLObject assertion = NIL;
				assertion = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject cdolist_list_var_$55 = existing_fet_evaluations_of(assertion);
					SubLObject evaluation = NIL;
					evaluation = cdolist_list_var_$55.first();
					while (NIL != cdolist_list_var_$55) {
						if (NIL != forts.fort_p(evaluation)) {
							rkf_term_utilities.rkf_kill(evaluation);
						}
						cdolist_list_var_$55 = cdolist_list_var_$55.rest();
						evaluation = cdolist_list_var_$55.first();
					}
					cdolist_list_var = cdolist_list_var.rest();
					assertion = cdolist_list_var.first();
				}
				SubLObject killed_em_all_so_farP = T;
				final SubLObject narts_that_wont_die = NIL;
				SubLObject cdolist_list_var2 = skolem_narts;
				SubLObject skolem_nart = NIL;
				skolem_nart = cdolist_list_var2.first();
				while (NIL != cdolist_list_var2) {
					if (NIL != nart_handles.valid_nartP(skolem_nart, UNPROVIDED)) {
						final SubLObject killed_this_oneP = rkf_term_utilities.rkf_kill_now(skolem_nart);
						if (NIL == killed_this_oneP) {
							killed_em_all_so_farP = NIL;
							skolem_nart = narts_that_wont_die;
						}
					}
					cdolist_list_var2 = cdolist_list_var2.rest();
					skolem_nart = cdolist_list_var2.first();
				}
				result = killed_em_all_so_farP;
				problems = (NIL != narts_that_wont_die) ? cconcatenate($str175$Couldn_t_kill_narts__, format_nil.format_nil_s_no_copy(narts_that_wont_die)) : NIL;
			} else {
				SubLObject cdolist_list_var = assertions;
				SubLObject assertion = NIL;
				assertion = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (NIL != hlmt.equal_mt_monads_p(elmt, assertions_high.assertion_mt(assertion))) {
						SubLObject cdolist_list_var_$56 = existing_fet_evaluations_of(assertion);
						SubLObject evaluation = NIL;
						evaluation = cdolist_list_var_$56.first();
						while (NIL != cdolist_list_var_$56) {
							if (NIL != forts.fort_p(evaluation)) {
								rkf_term_utilities.rkf_kill(evaluation);
							}
							cdolist_list_var_$56 = cdolist_list_var_$56.rest();
							evaluation = cdolist_list_var_$56.first();
						}
						rkf_assertion_utilities.rkf_unassert(assertion, UNPROVIDED);
						result = T;
					}
					cdolist_list_var = cdolist_list_var.rest();
					assertion = cdolist_list_var.first();
				}
			}

		}
		return values(result, problems);
	}

	public static SubLObject skolem_narts_from_assertions(final SubLObject assertions) {
		SubLObject ans = NIL;
		SubLObject cdolist_list_var = assertions;
		SubLObject assertion = NIL;
		assertion = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != assertion_handles.valid_assertionP(assertion, T)) {
				SubLObject cdolist_list_var_$57 = cycl_utilities.expression_gather(assertion, $sym176$SKOLEM_NART_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject skolem_nart = NIL;
				skolem_nart = cdolist_list_var_$57.first();
				while (NIL != cdolist_list_var_$57) {
					final SubLObject item_var = skolem_nart;
					if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
						ans = cons(item_var, ans);
					}
					cdolist_list_var_$57 = cdolist_list_var_$57.rest();
					skolem_nart = cdolist_list_var_$57.first();
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			assertion = cdolist_list_var.first();
		}
		return ans;
	}

	public static SubLObject reformulate_edit_sentences(SubLObject old_sentence, SubLObject new_sentence, final SubLObject elmt, final SubLObject refspec_id, final SubLObject refspec_mt) {
		SubLObject reformulation_happenedP = NIL;
		if ((NIL != contains_mt_indexical_referencesP(new_sentence)) || (NIL != contains_mt_indexical_referencesP(old_sentence))) {
			new_sentence = resolve_mt_indexical_references(new_sentence, elmt);
			old_sentence = resolve_mt_indexical_references(old_sentence, elmt);
		}
		if (NIL != refspec_id) {
			final SubLObject settings = get_reformulation_specification_from_kb(refspec_id, refspec_mt);
			if (NIL != new_sentence) {
				final SubLObject reformulated_new_sentence = reformulator_hub.reformulate_cycl(new_sentence, elmt, settings);
				if (!reformulated_new_sentence.equal(new_sentence)) {
					reformulation_happenedP = T;
					new_sentence = reformulated_new_sentence;
				}
			}
			if (NIL != old_sentence) {
				final SubLObject reformulated_old_sentence = reformulator_hub.reformulate_cycl(old_sentence, elmt, settings);
				if (!reformulated_old_sentence.equal(old_sentence)) {
					old_sentence = reformulated_old_sentence;
				}
			}
		}
		return values(old_sentence, new_sentence, reformulation_happenedP);
	}

	public static SubLObject build_string_form_for_future_assertion(final SubLObject sentence, final SubLObject old_sentence, final SubLObject editP, SubLObject reason) {
		if (reason == UNPROVIDED) {
			reason = $$$unknown_reason;
		}
		final SubLObject next_id = integer_sequence_generator.integer_sequence_generator_next($future_assertion_counter$.getGlobalValue());
		if (NIL != editP) {
			return format(NIL, $str180$__D__replace__S_with__S__Reason__, new SubLObject[] { next_id, old_sentence, sentence, reason });
		}
		return format(NIL, $str181$__D___S_failed__Reason___A_, new SubLObject[] { next_id, sentence, reason });
	}

	public static SubLObject note_reformulation_happened(final SubLObject formula, final SubLObject v_term, final SubLObject original, final SubLObject refspec_id, final SubLObject elmt) {
		return rkf_assertion_utilities.rkf_assert_now(constrained_term_finder.generate_note_reformulation_formula(formula, v_term, original, refspec_id), elmt);
	}

	public static SubLObject remove_note_of_reformulation_happened(final SubLObject formula, final SubLObject v_term, final SubLObject original, final SubLObject refspec_id, final SubLObject elmt) {
		return rkf_assertion_utilities.rkf_unassert(constrained_term_finder.generate_note_reformulation_formula(formula, v_term, original, refspec_id), elmt);
	}

	public static SubLObject contains_mt_indexical_referencesP(final SubLObject formula) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject predicate = cycl_utilities.formula_arg0(formula);
		SubLObject result = NIL;
		if (NIL != subl_promotions.memberP(predicate, $microtheory_mentioning_constructs$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
			SubLObject ignore_errors_tag = NIL;
			try {
				thread.throwStack.push($IGNORE_ERRORS_TARGET);
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
					try {
						result = list_utilities.sublisp_boolean(cycl_utilities.expression_find($microtheory_indexical_referent_current_mt$.getGlobalValue(), cycl_utilities.formula_arg1(formula, UNPROVIDED), T, symbol_function(EQUAL), UNPROVIDED));
					} catch (final Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			} finally {
				thread.throwStack.pop();
			}
		}
		return result;
	}

	public static SubLObject resolve_mt_indexical_references(final SubLObject formula, final SubLObject mt) {
		return list_utilities.tree_substitute(formula, $microtheory_indexical_referent_current_mt$.getGlobalValue(), mt);
	}

	public static SubLObject cae_applicable_template_topics_for_term(final SubLObject v_term, SubLObject mt, SubLObject filter_mt) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		if (filter_mt == UNPROVIDED) {
			filter_mt = constants_high.find_constant_by_guid_string($str187$54e34312_5181_11d7_87a9_0002b3620);
		}
		final SubLObject unfiltered_results = formula_template_utilities.applicable_template_topics_for_term(v_term, mt);
		SubLObject results = NIL;
		SubLObject cdolist_list_var = unfiltered_results;
		SubLObject result = NIL;
		result = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != isa.isaP(result.first(), $$CAEUsableFETTemplateTopic, filter_mt, UNPROVIDED)) {
				results = cons(result, results);
			}
			cdolist_list_var = cdolist_list_var.rest();
			result = cdolist_list_var.first();
		}
		return results;
	}

	public static SubLObject get_cae_template_topics(SubLObject template_mt, SubLObject title_mt) {
		if (template_mt == UNPROVIDED) {
			template_mt = constants_high.find_constant_by_guid_string($str187$54e34312_5181_11d7_87a9_0002b3620);
		}
		if (title_mt == UNPROVIDED) {
			title_mt = $$InferencePSC;
		}
		SubLObject results = NIL;
		SubLObject cdolist_list_var;
		final SubLObject templates = cdolist_list_var = query_library_utils.cae_fact_editor_focal_types(UNPROVIDED);
		SubLObject template = NIL;
		template = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject query = listS($const190$titleForFormulaTemplateType_Strin, template, $list64);
			final SubLObject strings = ask_utilities.query_variable($sym50$_X, query, title_mt, UNPROVIDED);
			final SubLObject string = (NIL != strings) ? strings.first() : format(NIL, $str191$_S, template);
			final SubLObject result = cons(template, string);
			results = cons(result, results);
			cdolist_list_var = cdolist_list_var.rest();
			template = cdolist_list_var.first();
		}
		results = cdolist_list_var = list_utilities.sort_alist_by_values(results, symbol_function($sym192$STRING_));
		SubLObject cons = NIL;
		cons = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = cons;
			SubLObject template2 = NIL;
			SubLObject string2 = NIL;
			destructuring_bind_must_consp(current, datum, $list193);
			template2 = current.first();
			current = string2 = current.rest();
			list_utilities.alist_enter(results, template2, list(string2), UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			cons = cdolist_list_var.first();
		}
		return results;
	}

	public static SubLObject gather_temporal_concepts_for_cae(final SubLObject query, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_grammar.cycl_sentence_p(query) : "cycl_grammar.cycl_sentence_p(query) " + "CommonSymbols.NIL != cycl_grammar.cycl_sentence_p(query) " + query;
		assert NIL != hlmt.chlmt_p(mt) : "hlmt.chlmt_p(mt) " + "CommonSymbols.NIL != hlmt.chlmt_p(mt) " + mt;
		SubLObject result = NIL;
		final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
		final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
		final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
		final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
		try {
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
			result = gather_temporal_concept_variables_for_cae(query, mt);
		} finally {
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
		}
		return result;
	}

	public static SubLObject gather_temporal_concept_variables_for_cae(final SubLObject query, final SubLObject mt) {
		SubLObject result = NIL;
		final SubLObject stack = stacks.create_stack();
		SubLObject lit = NIL;
		stacks.stack_push(query, stack);
		while (NIL == stacks.stack_empty_p(stack)) {
			final SubLObject entry = stacks.stack_pop(stack);
			if (NIL != literalP(entry)) {
				for (lit = entry; NIL != variable_unification.el_negation_or_unknown_sentence_p(lit); lit = cycl_utilities.formula_arg1(lit, UNPROVIDED)) {
				}
				SubLObject cdolist_list_var;
				final SubLObject isa_constraint_alist = cdolist_list_var = at_utilities.formula_variable_isa_constraint_alist(lit, mt);
				SubLObject cons = NIL;
				cons = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					SubLObject current;
					final SubLObject datum = current = cons;
					SubLObject var = NIL;
					SubLObject cols = NIL;
					destructuring_bind_must_consp(current, datum, $list196);
					var = current.first();
					current = current.rest();
					SubLObject cdolist_list_var_$58;
					cols = cdolist_list_var_$58 = current;
					SubLObject col = NIL;
					col = cdolist_list_var_$58.first();
					while (NIL != cdolist_list_var_$58) {
						if (NIL != cae_temporal_concept_collectionP(col, mt)) {
							final SubLObject item_var = var;
							if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
								result = cons(item_var, result);
							}
						}
						cdolist_list_var_$58 = cdolist_list_var_$58.rest();
						col = cdolist_list_var_$58.first();
					}
					cdolist_list_var = cdolist_list_var.rest();
					cons = cdolist_list_var.first();
				}
			}
			SubLObject cdolist_list_var2 = cycl_utilities.formula_args(entry, UNPROVIDED);
			SubLObject arg = NIL;
			arg = cdolist_list_var2.first();
			while (NIL != cdolist_list_var2) {
				stacks.stack_push(arg, stack);
				cdolist_list_var2 = cdolist_list_var2.rest();
				arg = cdolist_list_var2.first();
			}
		}
		return nreverse(result);
	}

	public static SubLObject cae_temporal_concept_collectionP(final SubLObject col, final SubLObject mt) {
		return genls.genlsP(col, $$TemporallyExtendedThing, mt, UNPROVIDED);
	}

	public static SubLObject get_shared_comments(final SubLObject v_term) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject documentation_assertions = NIL;
		SubLObject result = NIL;
		if (NIL == forts.fort_p(v_term)) {
			return NIL;
		}
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			documentation_assertions = kb_mapping.gather_gaf_arg_index(v_term, ONE_INTEGER, $$sharedNotes, UNPROVIDED, UNPROVIDED);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		if (NIL != documentation_assertions) {
			final SubLObject cdolist_list_var = documentation_assertions;
			SubLObject documentation_assertion = NIL;
			documentation_assertion = cdolist_list_var.first();
			if (NIL != cdolist_list_var) {
				final SubLObject note_fort = assertions_high.gaf_arg2(documentation_assertion);
				SubLObject shared_comments = NIL;
				SubLObject cdolist_list_var_$59;
				shared_comments = cdolist_list_var_$59 = kb_mapping.gather_gaf_arg_index(note_fort, ONE_INTEGER, $$comment, UNPROVIDED, UNPROVIDED);
				SubLObject shared_comment = NIL;
				shared_comment = cdolist_list_var_$59.first();
				while (NIL != cdolist_list_var_$59) {
					result = cons(list(note_fort, assertions_high.gaf_arg2(shared_comment)), result);
					cdolist_list_var_$59 = cdolist_list_var_$59.rest();
					shared_comment = cdolist_list_var_$59.first();
				}
				return result;
			}
		}
		return NIL;
	}

	public static SubLObject with_parsing_constraints(final SubLObject macroform, final SubLObject environment) {
		SubLObject current;
		final SubLObject datum = current = macroform.rest();
		destructuring_bind_must_consp(current, datum, $list202);
		final SubLObject temp = current.rest();
		current = current.first();
		SubLObject sentence = NIL;
		SubLObject arg_pos = NIL;
		SubLObject constraining_collection = NIL;
		SubLObject domain_mt = NIL;
		SubLObject filter_fn = NIL;
		destructuring_bind_must_consp(current, datum, $list202);
		sentence = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list202);
		arg_pos = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list202);
		constraining_collection = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list202);
		domain_mt = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list202);
		filter_fn = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject body;
			current = body = temp;
			return listS(CLET, list(list($parse_sentence_context$, sentence), list($parse_arg_pos$, arg_pos), list($parse_constraining_collection$, constraining_collection), list($parse_domain_mt$, domain_mt), list($parse_filter_fn$, filter_fn)), append(body, NIL));
		}
		cdestructuring_bind_error(datum, $list202);
		return NIL;
	}

	public static SubLObject get_constrained_cycl_terms(final SubLObject string, final SubLObject constraint, SubLObject domain_mt, SubLObject generation_mt, SubLObject parsing_mt, SubLObject quietly_create_unknown_instances, SubLObject force_creation_of_unknown_instances, SubLObject possibly_strip_extraneous_punctuationP, SubLObject force, SubLObject nl_preds, SubLObject sentence, SubLObject arg_pos,
			SubLObject string_match_options, SubLObject instance_limit) {
		if (domain_mt == UNPROVIDED) {
			domain_mt = list($$MtUnionFn, $$EnglishMt, $$TKBSourceSpindleCollectorMt);
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = $$EnglishMt;
		}
		if (quietly_create_unknown_instances == UNPROVIDED) {
			quietly_create_unknown_instances = NIL;
		}
		if (force_creation_of_unknown_instances == UNPROVIDED) {
			force_creation_of_unknown_instances = NIL;
		}
		if (possibly_strip_extraneous_punctuationP == UNPROVIDED) {
			possibly_strip_extraneous_punctuationP = T;
		}
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = list($$nonPlural_Generic);
		}
		if (sentence == UNPROVIDED) {
			sentence = NIL;
		}
		if (arg_pos == UNPROVIDED) {
			arg_pos = NIL;
		}
		if (string_match_options == UNPROVIDED) {
			string_match_options = $list212;
		}
		if (instance_limit == UNPROVIDED) {
			instance_limit = TEN_INTEGER;
		}
		SubLObject result_list = NIL;
		SubLObject cdolist_list_var = get_constrained_cycl_for_string_int(string, list($$SpecsFn, constraint), domain_mt, generation_mt, parsing_mt, quietly_create_unknown_instances, force_creation_of_unknown_instances, possibly_strip_extraneous_punctuationP, force, nl_preds, sentence, arg_pos, string_match_options, instance_limit);
		SubLObject result = NIL;
		result = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			result_list = cons(last(result, UNPROVIDED).first(), result_list);
			cdolist_list_var = cdolist_list_var.rest();
			result = cdolist_list_var.first();
		}
		return result_list;
	}

	public static SubLObject smart_convert_string_constraint_tuple_to_denotation(final SubLObject string, final SubLObject constraining_collection, final SubLObject sentence, final SubLObject arg_pos, final SubLObject domain_mt, SubLObject allow_trivial_constraint_matchingP) {
		if (allow_trivial_constraint_matchingP == UNPROVIDED) {
			allow_trivial_constraint_matchingP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject denotation_list = NIL;
		if (string.isString()) {
			final SubLObject head_string = (string_utilities.number_of_commas(string).isPositive()) ? Strings.string_right_trim($str214$__, string_utilities.post_remove(string, string_utilities.comma_sub_string(string), UNPROVIDED)) : string;
			final SubLObject head_word = string_utilities_lexical.find_head_noun_of_string(head_string);
			final SubLObject head_word_sense_list = (head_word.isString()) ? get_constrained_cycl_terms(head_word, constraining_collection, domain_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
			if (NIL != head_word_sense_list) {
				SubLObject cdolist_list_var = head_word_sense_list;
				SubLObject sense = NIL;
				sense = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if ((NIL != fort_types_interface.isa_collectionP(sense, UNPROVIDED)) && ((NIL != allow_trivial_constraint_matchingP) || (!sense.equal(constraining_collection)))) {
						denotation_list = cons(convert_string_constraint_tuple_to_denotation(string, sense), denotation_list);
					}
					cdolist_list_var = cdolist_list_var.rest();
					sense = cdolist_list_var.first();
				}
			}
			denotation_list = cons(convert_string_constraint_tuple_to_denotation(string, constraining_collection), denotation_list);
		}
		final SubLObject _prev_bind_0 = $parse_filter_fn$.currentBinding(thread);
		try {
			$parse_filter_fn$.bind(RKF_FILTER_IRRELEVANT_TERMS, thread);
			denotation_list = constrained_cycl_filter(denotation_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
			$parse_filter_fn$.rebind(_prev_bind_0, thread);
		}
		return denotation_list;
	}

	public static SubLObject get_constrained_cycl_for_string(final SubLObject str, final SubLObject constraining_collection, final SubLObject domain_mt, SubLObject generation_mt, SubLObject parsing_mt, SubLObject quietly_create_unknown_instances, SubLObject force_creation_of_unknown_instances, SubLObject possibly_strip_extraneous_punctuationP, SubLObject force, SubLObject nl_preds, SubLObject sentence,
			SubLObject arg_pos, SubLObject string_match_options, SubLObject instance_limit) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = $$EnglishMt;
		}
		if (quietly_create_unknown_instances == UNPROVIDED) {
			quietly_create_unknown_instances = T;
		}
		if (force_creation_of_unknown_instances == UNPROVIDED) {
			force_creation_of_unknown_instances = NIL;
		}
		if (possibly_strip_extraneous_punctuationP == UNPROVIDED) {
			possibly_strip_extraneous_punctuationP = T;
		}
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = list($$nonPlural_Generic);
		}
		if (sentence == UNPROVIDED) {
			sentence = NIL;
		}
		if (arg_pos == UNPROVIDED) {
			arg_pos = NIL;
		}
		if (string_match_options == UNPROVIDED) {
			string_match_options = $list212;
		}
		if (instance_limit == UNPROVIDED) {
			instance_limit = TEN_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject existing = get_constrained_cycl_for_string_int(str, constraining_collection, domain_mt, generation_mt, parsing_mt, quietly_create_unknown_instances, force_creation_of_unknown_instances, possibly_strip_extraneous_punctuationP, force, nl_preds, sentence, arg_pos, string_match_options, instance_limit);
		SubLObject v_new = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL != $api_widget_return_new_cycls_separatelyP$.getDynamicValue(thread)) {
			existing = list(existing, v_new);
			v_new = NIL;
		} else {
			existing = cconcatenate(existing, v_new);
			v_new = NIL;
		}
		return existing;
	}

	public static SubLObject get_constrained_cycl_for_string_single_answer(final SubLObject str, final SubLObject constraining_collection, final SubLObject domain_mt, SubLObject generation_mt, SubLObject parsing_mt, SubLObject quietly_create_unknown_instances, SubLObject force_creation_of_unknown_instances, SubLObject possibly_strip_extraneous_punctuationP, SubLObject force, SubLObject nl_preds, SubLObject sentence,
			SubLObject arg_pos, SubLObject string_match_options, SubLObject instance_limit) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = $$EnglishMt;
		}
		if (quietly_create_unknown_instances == UNPROVIDED) {
			quietly_create_unknown_instances = T;
		}
		if (force_creation_of_unknown_instances == UNPROVIDED) {
			force_creation_of_unknown_instances = NIL;
		}
		if (possibly_strip_extraneous_punctuationP == UNPROVIDED) {
			possibly_strip_extraneous_punctuationP = T;
		}
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = list($$nonPlural_Generic);
		}
		if (sentence == UNPROVIDED) {
			sentence = NIL;
		}
		if (arg_pos == UNPROVIDED) {
			arg_pos = NIL;
		}
		if (string_match_options == UNPROVIDED) {
			string_match_options = $list212;
		}
		if (instance_limit == UNPROVIDED) {
			instance_limit = TEN_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		SubLObject existing = get_constrained_cycl_for_string_int(str, constraining_collection, domain_mt, generation_mt, parsing_mt, quietly_create_unknown_instances, force_creation_of_unknown_instances, possibly_strip_extraneous_punctuationP, force, nl_preds, sentence, arg_pos, string_match_options, instance_limit);
		final SubLObject v_new = thread.secondMultipleValue();
		thread.resetMultipleValues();
		existing = cconcatenate(existing, v_new);
		return existing;
	}

	public static SubLObject get_constrained_cycl_for_string_int(final SubLObject str, SubLObject constraining_collection, SubLObject domain_mt, SubLObject generation_mt, SubLObject parsing_mt, SubLObject quietly_create_unknown_instances, SubLObject force_creation_of_unknown_instances, SubLObject possibly_strip_extraneous_punctuationP, SubLObject force, SubLObject nl_preds, SubLObject sentence, SubLObject arg_pos,
			SubLObject string_match_options, SubLObject instance_limit) {
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = $$EnglishMt;
		}
		if (quietly_create_unknown_instances == UNPROVIDED) {
			quietly_create_unknown_instances = T;
		}
		if (force_creation_of_unknown_instances == UNPROVIDED) {
			force_creation_of_unknown_instances = NIL;
		}
		if (possibly_strip_extraneous_punctuationP == UNPROVIDED) {
			possibly_strip_extraneous_punctuationP = T;
		}
		if (force == UNPROVIDED) {
			force = $NONE;
		}
		if (nl_preds == UNPROVIDED) {
			nl_preds = list($$nonPlural_Generic);
		}
		if (sentence == UNPROVIDED) {
			sentence = NIL;
		}
		if (arg_pos == UNPROVIDED) {
			arg_pos = NIL;
		}
		if (string_match_options == UNPROVIDED) {
			string_match_options = $list212;
		}
		if (instance_limit == UNPROVIDED) {
			instance_limit = TEN_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		constraining_collection = czer_main.canonicalize_term(constraining_collection, UNPROVIDED);
		assert NIL != fort_types_interface.isa_collectionP(constraining_collection, UNPROVIDED) : "fort_types_interface.isa_collectionP(constraining_collection, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(constraining_collection, CommonSymbols.UNPROVIDED) " + constraining_collection;
		domain_mt = hlmt_czer.coerce_to_hlmt(domain_mt);
		SubLObject new_terms = NIL;
		final SubLObject string_as_cycl = read_cycl_from_string(string_utilities.cyclify_string(str));
		SubLObject result = (NIL != string_as_cycl) ? list(string_as_cycl) : NIL;
		final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
		final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
		final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
		final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
		try {
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
			final SubLObject local_state;
			final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
			final SubLObject _prev_bind_0_$60 = memoization_state.$memoization_state$.currentBinding(thread);
			try {
				memoization_state.$memoization_state$.bind(local_state, thread);
				final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
				try {
					final SubLObject _prev_bind_0_$61 = $parse_sentence_context$.currentBinding(thread);
					final SubLObject _prev_bind_1_$62 = $parse_arg_pos$.currentBinding(thread);
					final SubLObject _prev_bind_2_$63 = $parse_constraining_collection$.currentBinding(thread);
					final SubLObject _prev_bind_4 = $parse_domain_mt$.currentBinding(thread);
					final SubLObject _prev_bind_5 = $parse_filter_fn$.currentBinding(thread);
					final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
					final SubLObject _prev_bind_7 = mt_relevance_macros.$mt$.currentBinding(thread);
					try {
						$parse_sentence_context$.bind(sentence, thread);
						$parse_arg_pos$.bind(arg_pos, thread);
						$parse_constraining_collection$.bind(constraining_collection, thread);
						$parse_domain_mt$.bind(domain_mt, thread);
						$parse_filter_fn$.bind(FILTER_CONSTRAINED_CYCLS, thread);
						mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
						mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
						result = constrained_cycl_filter(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						if (NIL != string_specP(constraining_collection)) {
							result = list(str);
						} else if ((NIL == string_utilities.string_contains_constant_reader_prefix_p(str)) || (NIL == result)) {
							result = cconcatenate(result, get_cycls_for_string_escalating(str, constraining_collection, NIL, domain_mt, parsing_mt, string_match_options, FILTER_CONSTRAINED_CYCLS, instance_limit));
							if (((((NIL != possibly_strip_extraneous_punctuationP) && (NIL == result)) && (NIL != str)) && (!str.equal(string_utilities.$empty_string$.getGlobalValue()))) && (NIL != string_utilities.ends_with_punctuation_p(str))) {
								result = get_cycls_for_string_escalating(string_utilities.string_butlast(str), constraining_collection, NIL, domain_mt, parsing_mt, string_match_options, FILTER_CONSTRAINED_CYCLS, instance_limit);
							}
							final SubLObject _prev_bind_0_$62 = parsing_vars.$evaluate_nl_reformulator_resultsP$.currentBinding(thread);
							try {
								parsing_vars.$evaluate_nl_reformulator_resultsP$.bind(NIL, thread);
								result = nl_reformulator.nl_reformulate_cycls(result);
							} finally {
								parsing_vars.$evaluate_nl_reformulator_resultsP$.rebind(_prev_bind_0_$62, thread);
							}
							result = parsing_utilities.possibly_strip_nl_tags_from_list(result, $api_widgets_strip_nl_tagsP$.getGlobalValue());
							if (NIL == result) {
								result = partial_matches_for_string(str, constraining_collection, domain_mt, parsing_mt, UNPROVIDED, UNPROVIDED);
							}
							if ((NIL != force_creation_of_unknown_instances) || ((NIL != quietly_create_unknown_instances) && result.equal(NIL))) {
								new_terms = smart_convert_string_constraint_tuple_to_denotation(str, constraining_collection, sentence, arg_pos, domain_mt, UNPROVIDED);
							}
						}

					} finally {
						mt_relevance_macros.$mt$.rebind(_prev_bind_7, thread);
						mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_6, thread);
						$parse_filter_fn$.rebind(_prev_bind_5, thread);
						$parse_domain_mt$.rebind(_prev_bind_4, thread);
						$parse_constraining_collection$.rebind(_prev_bind_2_$63, thread);
						$parse_arg_pos$.rebind(_prev_bind_1_$62, thread);
						$parse_sentence_context$.rebind(_prev_bind_0_$61, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$63 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$63, thread);
					}
				}
			} finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0_$60, thread);
			}
		} finally {
			sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
			sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
		}
		result = remove_duplicates(dereference_indexicals_in_constrained_cycls(result), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
		thread.resetMultipleValues();
		final SubLObject valid_results = list_utilities.partition_list(result, symbol_function(CYCL_EXPRESSION_P));
		final SubLObject invalid_results = thread.secondMultipleValue();
		thread.resetMultipleValues();
		if (NIL == list_utilities.empty_list_p(invalid_results)) {
			Errors.warn($str221$Got_invalid_denotation_s__for__S_, str, invalid_results);
			result = valid_results;
		}
		result = convert_term_list_to_renderings_for_java(result, domain_mt, force, nl_preds, generation_mt, T, T, NIL);
		new_terms = convert_term_list_to_renderings_for_java(new_terms, domain_mt, force, nl_preds, generation_mt, T, T, NIL);
		result = Sort.sort(result, symbol_function(PPH_LIST_ITEM_COMPARATOR), UNPROVIDED);
		return values(result, new_terms);
	}

	public static SubLObject constrained_cycl_filter(SubLObject result, SubLObject sentence, SubLObject arg_pos, SubLObject constraining_collection, SubLObject domain_mt, SubLObject filter_fn) {
		if (sentence == UNPROVIDED) {
			sentence = $parse_sentence_context$.getDynamicValue();
		}
		if (arg_pos == UNPROVIDED) {
			arg_pos = $parse_arg_pos$.getDynamicValue();
		}
		if (constraining_collection == UNPROVIDED) {
			constraining_collection = $parse_constraining_collection$.getDynamicValue();
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = $parse_domain_mt$.getDynamicValue();
		}
		if (filter_fn == UNPROVIDED) {
			filter_fn = $parse_filter_fn$.getDynamicValue();
		}
		if ((NIL != filter_fn) && (NIL != domain_mt)) {
			result = apply_constrained_cycls_filter_fn(filter_fn, result, domain_mt);
		}
		return constrained_cycl_filter_int(result, sentence, arg_pos, constraining_collection, domain_mt);
	}

	public static SubLObject constrained_cycl_filter_int(SubLObject result, final SubLObject sentence, final SubLObject arg_pos, final SubLObject constraining_collection, final SubLObject domain_mt) {
		if ((NIL != constraining_collection) && (NIL != domain_mt)) {
			result = constraint_filters.filter_terms_by_constraining_collection(constraining_collection, domain_mt, result);
		}
		if (((NIL != sentence) && (NIL != arg_pos)) && (NIL != domain_mt)) {
			result = constraint_filters.filter_terms_for_arg_constraints_at_argpos(arg_pos, sentence, domain_mt, result, NIL);
		}
		return result;
	}

	public static SubLObject read_cycl_from_string(final SubLObject str) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject cycl = NIL;
		if (NIL != string_utilities.string_contains_constant_reader_prefix_p(str)) {
			thread.resetMultipleValues();
			final SubLObject result = read_from_string_ignoring_errors(str, NIL, NIL, UNPROVIDED, UNPROVIDED);
			final SubLObject maybe_end_pos = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (maybe_end_pos.isInteger() && (NIL != list_utilities.lengthE(str, maybe_end_pos, UNPROVIDED))) {
				final SubLObject _prev_bind_0 = cycl_grammar.$grammar_permits_symbol_as_terminalP$.currentBinding(thread);
				try {
					cycl_grammar.$grammar_permits_symbol_as_terminalP$.bind(NIL, thread);
					if (NIL != cycl_grammar.cycl_term_p(result)) {
						cycl = result;
					}
				} finally {
					cycl_grammar.$grammar_permits_symbol_as_terminalP$.rebind(_prev_bind_0, thread);
				}
			}
		}
		return cycl;
	}

	public static SubLObject filter_constrained_cycls(SubLObject ans, final SubLObject domain_mt) {
		ans = remove_if(STUB_TERM_WITH_NAME_AND_TYPE_P, ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		ans = rkf_relevance_utilities.rkf_filter_irrelevant_terms(ans, domain_mt);
		return ans;
	}

	public static SubLObject dereference_indexicals_in_constrained_cycls(final SubLObject cycls) {
		SubLObject ans = NIL;
		SubLObject cdolist_list_var = cycls;
		SubLObject cycl = NIL;
		cycl = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			ans = cons(dereference_indexicals_in_constrained_cycl(cycl), ans);
			cdolist_list_var = cdolist_list_var.rest();
			cycl = cdolist_list_var.first();
		}
		return nreverse(ans);
	}

	public static SubLObject dereference_indexicals_in_constrained_cycl(final SubLObject cycl) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		SubLObject error = NIL;
		try {
			thread.throwStack.push($TRANSFORMATION_LIMIT_EXCEEDED);
			ans = cycl_utilities.expression_transform(cycl, INDEXICAL_REFERENT_TERM_P, CYC_INDEXICAL_REFERENT, UNPROVIDED, UNPROVIDED);
		} catch (final Throwable ccatch_env_var) {
			error = Errors.handleThrowable(ccatch_env_var, $TRANSFORMATION_LIMIT_EXCEEDED);
		} finally {
			thread.throwStack.pop();
		}
		if (NIL != error) {
			ans = cycl;
		}
		return ans;
	}

	public static SubLObject partial_matches_for_string(final SubLObject string, final SubLObject constraining_collection, final SubLObject domain_mt, final SubLObject parsing_mt, SubLObject permissiveP, SubLObject test) {
		if (permissiveP == UNPROVIDED) {
			permissiveP = T;
		}
		if (test == UNPROVIDED) {
			test = EQUALP;
		}
		final SubLObject initial_matches = lexicon_accessors.denots_of_partial_string(string, parsing_mt, permissiveP, test);
		final SubLObject relevant_matches = rkf_relevance_utilities.rkf_filter_irrelevant_terms(initial_matches, domain_mt);
		return constraint_filters.filter_terms_by_constraining_collection(constraining_collection, domain_mt, relevant_matches);
	}

	public static SubLObject convert_string_constraint_tuple_to_denotation(final SubLObject string, final SubLObject constraining_collection) {
		if (NIL != genls.genl_in_any_mtP(constraining_collection, $$CharacterString)) {
			return string;
		}
		if (NIL != genls.genl_in_any_mtP(constraining_collection, $$Predicate)) {
			return list($$PredicateNamedFn, string, constraining_collection);
		}
		if (NIL != cycl_utilities.naut_with_functor_p(constraining_collection, $$SpecsFn)) {
			return list($const230$ProperSubcollectionNamedFn_Ternar, string, cycl_utilities.formula_arg1(constraining_collection, UNPROVIDED), Guids.guid_to_string(Guids.new_guid()));
		}
		return list($$InstanceNamedFn_Ternary, string, constraining_collection, Guids.guid_to_string(Guids.new_guid()));
	}

	public static SubLObject stub_term_with_name_and_type_p(final SubLObject v_object) {
		return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != formula_pattern_match.formula_matches_pattern(v_object, $list232)));
	}

	public static SubLObject string_specP(final SubLObject obj) {
		return makeBoolean((NIL != indexed_term_p(obj)) && (NIL != genls.genl_in_any_mtP(obj, $$CharacterString)));
	}

	public static SubLObject get_cycls_for_string_escalating(final SubLObject string, final SubLObject good_col, SubLObject bad_col, SubLObject domain_mt, SubLObject parsing_mt, SubLObject string_match_options, SubLObject filter_fn, SubLObject instance_limit) {
		if (bad_col == UNPROVIDED) {
			bad_col = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = NIL;
		}
		if (string_match_options == UNPROVIDED) {
			string_match_options = $list212;
		}
		if (filter_fn == UNPROVIDED) {
			filter_fn = FILTER_CONSTRAINED_CYCLS;
		}
		if (instance_limit == UNPROVIDED) {
			instance_limit = TEN_INTEGER;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject case_insensitiveP = eq($TRUE, getf(string_match_options, $CASE_INSENSITIVE, $FALSE));
		final SubLObject regular_expressionsP = makeBoolean(($TRUE == getf(string_match_options, $REGULAR_EXPRESSIONS, $FALSE)) && (NIL != regular_expressions.is_regular_expressions_support_availableP()));
		final SubLObject regular_expression_stringP = regular_expression_utilities.regular_expression_string_p(string);
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
		try {
			parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
			if ((NIL != regular_expressionsP) && (NIL != regular_expression_stringP)) {
				if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
					format(T, $str239$________regular_expressions__A__, string);
					force_output(T);
				}
				ans = remove_duplicates(Mapping.mapcar(symbol_function(FIRST), get_constrained_cycls_for_regular_expression(string, good_col, bad_col, domain_mt, parsing_mt, case_insensitiveP)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
				ans = constrained_cycl_filter(ans, $parse_sentence_context$.getDynamicValue(thread), $parse_arg_pos$.getDynamicValue(thread), $parse_constraining_collection$.getDynamicValue(thread), domain_mt, filter_fn);
			}
			if (NIL == ans) {
				final SubLObject _prev_bind_0_$66 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
				try {
					lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(NIL == case_insensitiveP ? $ON : $OFF, thread);
					SubLObject abbrev_types = $list242;
					if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
						format(T, $str243$_________typed_denots_of_string__, string, good_col);
						force_output(T);
					}
					ans = lexicon_accessors.typed_denots_of_string(string, good_col, abbrev_types, $DENOT, T, NIL, parsing_mt, domain_mt, UNPROVIDED, UNPROVIDED);
					ans = constrained_cycl_filter(ans, $parse_sentence_context$.getDynamicValue(thread), $parse_arg_pos$.getDynamicValue(thread), $parse_constraining_collection$.getDynamicValue(thread), domain_mt, filter_fn);
					if (NIL == ans) {
						abbrev_types = $list245;
						if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
							format(T, $str246$__________typed_denots_of_string_, string);
							force_output(T);
						}
						ans = lexicon_accessors.typed_denots_of_string(string, good_col, abbrev_types, $DENOT, T, NIL, parsing_mt, domain_mt, UNPROVIDED, UNPROVIDED);
						ans = constrained_cycl_filter(ans, $parse_sentence_context$.getDynamicValue(thread), $parse_arg_pos$.getDynamicValue(thread), $parse_constraining_collection$.getDynamicValue(thread), domain_mt, filter_fn);
					}
					final SubLObject good_cols = (NIL != good_col) ? list(good_col) : NIL;
					final SubLObject bad_cols = (NIL != bad_col) ? list(bad_col) : NIL;
					if (NIL == ans) {
						if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
							format(T, $str247$___________parse_dates_and_number, string);
							force_output(T);
						}
						ans = parsing_utilities.parse_dates_and_numbers(string, good_cols, bad_cols, domain_mt, parsing_mt);
						ans = constrained_cycl_filter(ans, $parse_sentence_context$.getDynamicValue(thread), $parse_arg_pos$.getDynamicValue(thread), $parse_constraining_collection$.getDynamicValue(thread), domain_mt, filter_fn);
					}
					if (NIL == ans) {
						final SubLObject _prev_bind_0_$67 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
						try {
							parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
							if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
								format(T, $str248$____________parse_noun_compound_w, string);
								format(T, $str249$_____________parse_noun_compound_, new SubLObject[] { string, good_cols, bad_cols, NIL, instance_limit });
								force_output(T);
							}
							ans = remove_duplicates(parsing_utilities.parse_noun_compound_with_types(string, good_cols, bad_cols, NIL, instance_limit, UNPROVIDED), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
						} finally {
							parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0_$67, thread);
						}
					}
					if (NIL == ans) {
						if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
							format(T, $str250$_____________get_constrained_exte, string);
							force_output(T);
						}
						ans = get_constrained_extended_cycls_for_string(string, good_col, $$EnglishSenseExtensionDataMt, $get_extended_cycls_for_string_timeout$.getDynamicValue(thread), UNPROVIDED);
						ans = constrained_cycl_filter(ans, $parse_sentence_context$.getDynamicValue(thread), $parse_arg_pos$.getDynamicValue(thread), $parse_constraining_collection$.getDynamicValue(thread), domain_mt, filter_fn);
					}
					if ((NIL == ans) && (NIL == kb_accessors.kb_first_order_collection_p(good_col))) {
						if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
							format(T, $str252$______________get_coerced_cycls_f, string);
							format(T, $str253$_______________get_coerced_cycls_, new SubLObject[] { string, good_col, $nl_coercion_mt$.getDynamicValue(thread), $get_coerced_cycls_timeout$.getDynamicValue(thread) });
							force_output(T);
						}
						ans = get_coerced_cycls_for_string(string, good_col, $nl_coercion_mt$.getDynamicValue(thread), $get_coerced_cycls_timeout$.getDynamicValue(thread), UNPROVIDED);
					}
				} finally {
					lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0_$66, thread);
				}
				if (NIL == ans) {
					if (NIL == regular_expression_stringP) {
						if (NIL != regular_expressionsP) {
							if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
								format(T, $str254$_______________get_constrained_cy, string);
								force_output(T);
							}
							ans = remove_duplicates(Mapping.mapcar(symbol_function(FIRST), get_constrained_cycls_for_regular_expression(string, good_col, bad_col, domain_mt, parsing_mt, case_insensitiveP)), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
							constrained_cycl_filter(ans, $parse_sentence_context$.getDynamicValue(thread), $parse_arg_pos$.getDynamicValue(thread), $parse_constraining_collection$.getDynamicValue(thread), domain_mt, filter_fn);
						} else {
							if (NIL != $trace_get_cycls_for_string_escalatingP$.getGlobalValue()) {
								format(T, $str255$_______________get_constrained_cy, string);
								force_output(T);
							}
							ans = remove_duplicates(get_constrained_cycls_from_generation(string, good_col, bad_col, domain_mt, parsing_mt, case_insensitiveP), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
							constrained_cycl_filter(ans, $parse_sentence_context$.getDynamicValue(thread), $parse_arg_pos$.getDynamicValue(thread), $parse_constraining_collection$.getDynamicValue(thread), domain_mt, filter_fn);
						}
					}
				}
			}
		} finally {
			parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0, thread);
		}
		return list_utilities.remove_subsumed_items(ans, $sym256$PARSING_REWRITE_OF_, UNPROVIDED);
	}

	public static SubLObject clear_get_extended_cycls_for_string() {
		final SubLObject cs = $get_extended_cycls_for_string_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_extended_cycls_for_string(final SubLObject string, SubLObject mt, SubLObject time) {
		if (mt == UNPROVIDED) {
			mt = $$EnglishSenseExtensionDataMt;
		}
		if (time == UNPROVIDED) {
			time = $get_extended_cycls_for_string_timeout$.getDynamicValue();
		}
		return memoization_state.caching_state_remove_function_results_with_args($get_extended_cycls_for_string_caching_state$.getGlobalValue(), list(string, mt, time), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_extended_cycls_for_string_internal(final SubLObject string, final SubLObject mt, final SubLObject time) {
		return ask_utilities.query_variable($REF, list($$senseExtensionForNameString, $REF, string), mt, listS($MAX_TIME, time, $list261));
	}

	public static SubLObject get_extended_cycls_for_string(final SubLObject string, SubLObject mt, SubLObject time) {
		if (mt == UNPROVIDED) {
			mt = $$EnglishSenseExtensionDataMt;
		}
		if (time == UNPROVIDED) {
			time = $get_extended_cycls_for_string_timeout$.getDynamicValue();
		}
		SubLObject caching_state = $get_extended_cycls_for_string_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_EXTENDED_CYCLS_FOR_STRING, $get_extended_cycls_for_string_caching_state$, $int$300, EQUAL, THREE_INTEGER, $int$100);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(string, mt, time);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (string.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && time.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_extended_cycls_for_string_internal(string, mt, time)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, mt, time));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject clear_get_coerced_cycls_for_term() {
		final SubLObject cs = $get_coerced_cycls_for_term_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_coerced_cycls_for_term(final SubLObject v_term, SubLObject mt, SubLObject time) {
		if (mt == UNPROVIDED) {
			mt = $nl_coercion_mt$.getDynamicValue();
		}
		if (time == UNPROVIDED) {
			time = $get_coerced_cycls_timeout$.getDynamicValue();
		}
		return memoization_state.caching_state_remove_function_results_with_args($get_coerced_cycls_for_term_caching_state$.getGlobalValue(), list(v_term, mt, time), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_coerced_cycls_for_term_internal(final SubLObject v_term, final SubLObject mt, final SubLObject time) {
		return ask_utilities.query_variable($REF, listS($$typeCoerceableToType, v_term, $list267), mt, listS($MAX_TIME, time, $list261));
	}

	public static SubLObject get_coerced_cycls_for_term(final SubLObject v_term, SubLObject mt, SubLObject time) {
		if (mt == UNPROVIDED) {
			mt = $nl_coercion_mt$.getDynamicValue();
		}
		if (time == UNPROVIDED) {
			time = $get_coerced_cycls_timeout$.getDynamicValue();
		}
		SubLObject caching_state = $get_coerced_cycls_for_term_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_COERCED_CYCLS_FOR_TERM, $get_coerced_cycls_for_term_caching_state$, $int$300, EQUAL, THREE_INTEGER, $int$100);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, mt, time);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (v_term.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && time.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_coerced_cycls_for_term_internal(v_term, mt, time)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt, time));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject get_constrained_extended_cycls_for_string(final SubLObject string, final SubLObject constraint, SubLObject mt, SubLObject time, SubLObject semantic_mt) {
		if (mt == UNPROVIDED) {
			mt = $$EnglishSenseExtensionDataMt;
		}
		if (time == UNPROVIDED) {
			time = $get_extended_cycls_for_string_timeout$.getDynamicValue();
		}
		if (semantic_mt == UNPROVIDED) {
			semantic_mt = $$InferencePSC;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject result_list = NIL;
		SubLObject cdolist_list_var;
		final SubLObject denot_list = cdolist_list_var = get_extended_cycls_for_string(string, mt, time);
		SubLObject denot = NIL;
		denot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(semantic_mt);
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				if (NIL != lexicon_accessors.denot_has_typeP(denot, constraint, UNPROVIDED)) {
					result_list = cons(denot, result_list);
				}
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
			cdolist_list_var = cdolist_list_var.rest();
			denot = cdolist_list_var.first();
		}
		return result_list;
	}

	public static SubLObject get_coerced_cycls_for_string(final SubLObject string, final SubLObject constraint, SubLObject mt, SubLObject time, SubLObject semantic_mt) {
		if (mt == UNPROVIDED) {
			mt = $nl_coercion_mt$.getDynamicValue();
		}
		if (time == UNPROVIDED) {
			time = $get_coerced_cycls_timeout$.getDynamicValue();
		}
		if (semantic_mt == UNPROVIDED) {
			semantic_mt = $$InferencePSC;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject denot_list = NIL;
		SubLObject result_list = NIL;
		final SubLObject _prev_bind_0 = parsing_vars.$npp_use_nl_tagsP$.currentBinding(thread);
		try {
			parsing_vars.$npp_use_nl_tagsP$.bind(NIL, thread);
			denot_list = psp_main.ps_get_cycls_for_phrase(string, $$SententialConstituent, $$nounStrings, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		} finally {
			parsing_vars.$npp_use_nl_tagsP$.rebind(_prev_bind_0, thread);
		}
		SubLObject cdolist_list_var = denot_list;
		SubLObject denot = NIL;
		denot = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject coerced_list = get_coerced_cycls_for_term(denot, mt, time);
			result_list = append(constraint_filters.filter_terms_by_constraining_collection(constraint, mt_relevance_macros.$mt$.getDynamicValue(thread), coerced_list), result_list);
			cdolist_list_var = cdolist_list_var.rest();
			denot = cdolist_list_var.first();
		}
		return nreverse(result_list);
	}

	public static SubLObject apply_constrained_cycls_filter_fn(final SubLObject filter_fn, final SubLObject ans, final SubLObject domain_mt) {
		return funcall(filter_fn, ans, domain_mt);
	}

	public static SubLObject get_constrained_cycls_from_generation(final SubLObject string, final SubLObject good_col, SubLObject bad_col, SubLObject domain_mt, SubLObject parsing_mt, SubLObject case_insensitiveP) {
		if (bad_col == UNPROVIDED) {
			bad_col = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
		}
		if (case_insensitiveP == UNPROVIDED) {
			case_insensitiveP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject cardinality_cutoff = $constrained_cycls_from_generation_cardinality_cutoff$.getGlobalValue();
		if ((NIL != forts.fort_p(good_col)) && cardinality_estimates.instance_cardinality(good_col).numLE(cardinality_cutoff)) {
			if (NIL == cycl_grammar.cycl_denotational_term_p(bad_col)) {
				bad_col = NIL;
			}
			final SubLObject mt_var = domain_mt;
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			final SubLObject _prev_bind_4 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
				pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
				thread.resetMultipleValues();
				final SubLObject _prev_bind_0_$68 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
				try {
					pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
					final SubLObject reuseP = thread.secondMultipleValue();
					thread.resetMultipleValues();
					try {
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$69 = pph_macros.$pph_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
							final SubLObject new_or_reused = thread.secondMultipleValue();
							thread.resetMultipleValues();
							final SubLObject _prev_bind_0_$70 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
							try {
								pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
								final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
								final SubLObject _prev_bind_0_$71 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
									try {
										final SubLObject _prev_bind_0_$72 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
										final SubLObject _prev_bind_1_$73 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
										try {
											sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
											sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
											try {
												SubLObject node_var_$74 = good_col;
												final SubLObject deck_type = $STACK;
												final SubLObject recur_deck = deck.create_deck(deck_type);
												final SubLObject _prev_bind_0_$73 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
												try {
													sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
													try {
														final SubLObject tv_var = NIL;
														final SubLObject _prev_bind_0_$74 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
														final SubLObject _prev_bind_1_$74 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
														try {
															sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
															sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
															if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
																final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
																if (pcase_var.eql($ERROR)) {
																	sbhl_paranoia.sbhl_error(ONE_INTEGER, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																} else if (pcase_var.eql($CERROR)) {
																	sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																} else if (pcase_var.eql($WARN)) {
																	Errors.warn($str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
																} else {
																	Errors.warn($str281$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
																	Errors.cerror($$$continue_anyway, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
																}

															}
															final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
															final SubLObject _prev_bind_1_$75 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
															final SubLObject _prev_bind_2_$80 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
															final SubLObject _prev_bind_3_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
															final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
															try {
																sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
																sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
																sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
																if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(good_col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
																	final SubLObject _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
																	final SubLObject _prev_bind_1_$76 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
																	final SubLObject _prev_bind_2_$81 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																	try {
																		sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
																		sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																		sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
																		sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$74, UNPROVIDED);
																		while (NIL != node_var_$74) {
																			final SubLObject tt_node_var = node_var_$74;
																			SubLObject cdolist_list_var;
																			final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
																			SubLObject module_var = NIL;
																			module_var = cdolist_list_var.first();
																			while (NIL != cdolist_list_var) {
																				final SubLObject _prev_bind_0_$77 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
																				final SubLObject _prev_bind_1_$77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																				try {
																					sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
																					sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																					final SubLObject node = function_terms.naut_to_nart(tt_node_var);
																					if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
																						final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																						if (NIL != d_link) {
																							final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																							if (NIL != mt_links) {
																								SubLObject iteration_state;
																								for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
																									thread.resetMultipleValues();
																									final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
																									final SubLObject tv_links = thread.secondMultipleValue();
																									thread.resetMultipleValues();
																									if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																										final SubLObject _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																										try {
																											sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																											SubLObject iteration_state_$88;
																											for (iteration_state_$88 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$88); iteration_state_$88 = dictionary_contents.do_dictionary_contents_next(iteration_state_$88)) {
																												thread.resetMultipleValues();
																												final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$88);
																												final SubLObject link_nodes = thread.secondMultipleValue();
																												thread.resetMultipleValues();
																												if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																													final SubLObject _prev_bind_0_$79 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																													try {
																														sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																														final SubLObject sol = link_nodes;
																														if (NIL != set.set_p(sol)) {
																															final SubLObject set_contents_var = set.do_set_internal(sol);
																															SubLObject basis_object;
																															SubLObject state;
																															SubLObject instance;
																															SubLObject _prev_bind_0_$80;
																															SubLObject match;
																															SubLObject csome_list_var;
																															SubLObject phrase;
																															for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents
																																	.do_set_contents_update_state(state)) {
																																instance = set_contents.do_set_contents_next(basis_object, state);
																																if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																																	sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																	if ((NIL != forts.fort_p(instance)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance, bad_col, UNPROVIDED)))) {
																																		_prev_bind_0_$80 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																																		try {
																																			lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																																			match = NIL;
																																			if (NIL == match) {
																																				csome_list_var = pph_methods_lexicon.all_phrases_for_term(instance, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																				phrase = NIL;
																																				phrase = csome_list_var.first();
																																				while ((NIL == match) && (NIL != csome_list_var)) {
																																					if (NIL != (NIL != case_insensitiveP ? equalp(phrase, string) : equal(phrase, string))) {
																																						match = instance;
																																						if (NIL != match) {
																																							ans = cons(match, ans);
																																						}
																																					}
																																					csome_list_var = csome_list_var.rest();
																																					phrase = csome_list_var.first();
																																				}
																																			}
																																		} finally {
																																			lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$80, thread);
																																		}
																																	}
																																}
																															}
																														} else if (sol.isList()) {
																															SubLObject csome_list_var2 = sol;
																															SubLObject instance2 = NIL;
																															instance2 = csome_list_var2.first();
																															while (NIL != csome_list_var2) {
																																if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																																	sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																	if ((NIL != forts.fort_p(instance2)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance2, bad_col, UNPROVIDED)))) {
																																		final SubLObject _prev_bind_0_$81 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																																		try {
																																			lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																																			SubLObject match2 = NIL;
																																			if (NIL == match2) {
																																				SubLObject csome_list_var_$92 = pph_methods_lexicon.all_phrases_for_term(instance2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																				SubLObject phrase2 = NIL;
																																				phrase2 = csome_list_var_$92.first();
																																				while ((NIL == match2) && (NIL != csome_list_var_$92)) {
																																					if (NIL != (NIL != case_insensitiveP ? equalp(phrase2, string) : equal(phrase2, string))) {
																																						match2 = instance2;
																																						if (NIL != match2) {
																																							ans = cons(match2, ans);
																																						}
																																					}
																																					csome_list_var_$92 = csome_list_var_$92.rest();
																																					phrase2 = csome_list_var_$92.first();
																																				}
																																			}
																																		} finally {
																																			lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$81, thread);
																																		}
																																	}
																																}
																																csome_list_var2 = csome_list_var2.rest();
																																instance2 = csome_list_var2.first();
																															}
																														} else {
																															Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol);
																														}

																													} finally {
																														sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$79, thread);
																													}
																												}
																											}
																											dictionary_contents.do_dictionary_contents_finalize(iteration_state_$88);
																										} finally {
																											sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$78, thread);
																										}
																									}
																								}
																								dictionary_contents.do_dictionary_contents_finalize(iteration_state);
																							}
																						} else {
																							sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str283$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																						}
																						if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
																							SubLObject csome_list_var3 = sbhl_link_methods.non_fort_instance_table_lookup(node);
																							SubLObject instance_tuple = NIL;
																							instance_tuple = csome_list_var3.first();
																							while (NIL != csome_list_var3) {
																								SubLObject current;
																								final SubLObject datum = current = instance_tuple;
																								SubLObject link_node = NIL;
																								SubLObject mt2 = NIL;
																								SubLObject tv2 = NIL;
																								destructuring_bind_must_consp(current, datum, $list284);
																								link_node = current.first();
																								current = current.rest();
																								destructuring_bind_must_consp(current, datum, $list284);
																								mt2 = current.first();
																								current = current.rest();
																								destructuring_bind_must_consp(current, datum, $list284);
																								tv2 = current.first();
																								current = current.rest();
																								if (NIL == current) {
																									if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
																										final SubLObject _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																										try {
																											sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
																											if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																												final SubLObject _prev_bind_0_$83 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																												try {
																													sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																													final SubLObject sol;
																													final SubLObject link_nodes2 = sol = list(link_node);
																													if (NIL != set.set_p(sol)) {
																														final SubLObject set_contents_var = set.do_set_internal(sol);
																														SubLObject basis_object;
																														SubLObject state;
																														SubLObject instance;
																														SubLObject match;
																														SubLObject phrase;
																														SubLObject _prev_bind_0_$84;
																														SubLObject csome_list_var_$93;
																														for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents
																																.do_set_contents_update_state(state)) {
																															instance = set_contents.do_set_contents_next(basis_object, state);
																															if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																																sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																if ((NIL != forts.fort_p(instance)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance, bad_col, UNPROVIDED)))) {
																																	_prev_bind_0_$84 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																																	try {
																																		lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																																		match = NIL;
																																		if (NIL == match) {
																																			csome_list_var_$93 = pph_methods_lexicon.all_phrases_for_term(instance, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																			phrase = NIL;
																																			phrase = csome_list_var_$93.first();
																																			while ((NIL == match) && (NIL != csome_list_var_$93)) {
																																				if (NIL != (NIL != case_insensitiveP ? equalp(phrase, string) : equal(phrase, string))) {
																																					match = instance;
																																					if (NIL != match) {
																																						ans = cons(match, ans);
																																					}
																																				}
																																				csome_list_var_$93 = csome_list_var_$93.rest();
																																				phrase = csome_list_var_$93.first();
																																			}
																																		}
																																	} finally {
																																		lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$84, thread);
																																	}
																																}
																															}
																														}
																													} else if (sol.isList()) {
																														SubLObject csome_list_var_$94 = sol;
																														SubLObject instance2 = NIL;
																														instance2 = csome_list_var_$94.first();
																														while (NIL != csome_list_var_$94) {
																															if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																																sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																if ((NIL != forts.fort_p(instance2)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance2, bad_col, UNPROVIDED)))) {
																																	final SubLObject _prev_bind_0_$85 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																																	try {
																																		lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																																		SubLObject match2 = NIL;
																																		if (NIL == match2) {
																																			SubLObject csome_list_var_$95 = pph_methods_lexicon.all_phrases_for_term(instance2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																			SubLObject phrase2 = NIL;
																																			phrase2 = csome_list_var_$95.first();
																																			while ((NIL == match2) && (NIL != csome_list_var_$95)) {
																																				if (NIL != (NIL != case_insensitiveP ? equalp(phrase2, string) : equal(phrase2, string))) {
																																					match2 = instance2;
																																					if (NIL != match2) {
																																						ans = cons(match2, ans);
																																					}
																																				}
																																				csome_list_var_$95 = csome_list_var_$95.rest();
																																				phrase2 = csome_list_var_$95.first();
																																			}
																																		}
																																	} finally {
																																		lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$85, thread);
																																	}
																																}
																															}
																															csome_list_var_$94 = csome_list_var_$94.rest();
																															instance2 = csome_list_var_$94.first();
																														}
																													} else {
																														Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol);
																													}

																												} finally {
																													sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$83, thread);
																												}
																											}
																										} finally {
																											sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$82, thread);
																										}
																									}
																								} else {
																									cdestructuring_bind_error(datum, $list284);
																								}
																								csome_list_var3 = csome_list_var3.rest();
																								instance_tuple = csome_list_var3.first();
																							}
																						}
																					} else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
																						SubLObject cdolist_list_var_$100;
																						final SubLObject new_list = cdolist_list_var_$100 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																								? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																								: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																						SubLObject generating_fn = NIL;
																						generating_fn = cdolist_list_var_$100.first();
																						while (NIL != cdolist_list_var_$100) {
																							final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																							try {
																								sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
																								final SubLObject sol2;
																								final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
																								if (NIL != set.set_p(sol2)) {
																									final SubLObject set_contents_var2 = set.do_set_internal(sol2);
																									SubLObject basis_object2;
																									SubLObject state2;
																									SubLObject instance3;
																									SubLObject _prev_bind_0_$87;
																									SubLObject match3;
																									SubLObject csome_list_var4;
																									SubLObject phrase3;
																									for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
																										instance3 = set_contents.do_set_contents_next(basis_object2, state2);
																										if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																											sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																											if ((NIL != forts.fort_p(instance3)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance3, bad_col, UNPROVIDED)))) {
																												_prev_bind_0_$87 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																												try {
																													lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																													match3 = NIL;
																													if (NIL == match3) {
																														csome_list_var4 = pph_methods_lexicon.all_phrases_for_term(instance3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																														phrase3 = NIL;
																														phrase3 = csome_list_var4.first();
																														while ((NIL == match3) && (NIL != csome_list_var4)) {
																															if (NIL != (NIL != case_insensitiveP ? equalp(phrase3, string) : equal(phrase3, string))) {
																																match3 = instance3;
																																if (NIL != match3) {
																																	ans = cons(match3, ans);
																																}
																															}
																															csome_list_var4 = csome_list_var4.rest();
																															phrase3 = csome_list_var4.first();
																														}
																													}
																												} finally {
																													lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$87, thread);
																												}
																											}
																										}
																									}
																								} else if (sol2.isList()) {
																									SubLObject csome_list_var5 = sol2;
																									SubLObject instance4 = NIL;
																									instance4 = csome_list_var5.first();
																									while (NIL != csome_list_var5) {
																										if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																											sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																											if ((NIL != forts.fort_p(instance4)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance4, bad_col, UNPROVIDED)))) {
																												final SubLObject _prev_bind_0_$88 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																												try {
																													lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																													SubLObject match4 = NIL;
																													if (NIL == match4) {
																														SubLObject csome_list_var_$96 = pph_methods_lexicon.all_phrases_for_term(instance4, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																														SubLObject phrase4 = NIL;
																														phrase4 = csome_list_var_$96.first();
																														while ((NIL == match4) && (NIL != csome_list_var_$96)) {
																															if (NIL != (NIL != case_insensitiveP ? equalp(phrase4, string) : equal(phrase4, string))) {
																																match4 = instance4;
																																if (NIL != match4) {
																																	ans = cons(match4, ans);
																																}
																															}
																															csome_list_var_$96 = csome_list_var_$96.rest();
																															phrase4 = csome_list_var_$96.first();
																														}
																													}
																												} finally {
																													lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$88, thread);
																												}
																											}
																										}
																										csome_list_var5 = csome_list_var5.rest();
																										instance4 = csome_list_var5.first();
																									}
																								} else {
																									Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol2);
																								}

																							} finally {
																								sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$86, thread);
																							}
																							cdolist_list_var_$100 = cdolist_list_var_$100.rest();
																							generating_fn = cdolist_list_var_$100.first();
																						}
																					}

																				} finally {
																					sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$77, thread);
																					sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$77, thread);
																				}
																				cdolist_list_var = cdolist_list_var.rest();
																				module_var = cdolist_list_var.first();
																			}
																			SubLObject cdolist_list_var2;
																			final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
																			SubLObject module_var2 = NIL;
																			module_var2 = cdolist_list_var2.first();
																			while (NIL != cdolist_list_var2) {
																				final SubLObject _prev_bind_0_$89 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
																				final SubLObject _prev_bind_1_$78 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																				try {
																					sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
																					sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																					final SubLObject node2 = function_terms.naut_to_nart(node_var_$74);
																					if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
																						final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																						if (NIL != d_link2) {
																							final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																							if (NIL != mt_links2) {
																								SubLObject iteration_state2;
																								for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
																									thread.resetMultipleValues();
																									final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
																									final SubLObject tv_links2 = thread.secondMultipleValue();
																									thread.resetMultipleValues();
																									if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
																										final SubLObject _prev_bind_0_$90 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																										try {
																											sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
																											SubLObject iteration_state_$89;
																											for (iteration_state_$89 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$89); iteration_state_$89 = dictionary_contents.do_dictionary_contents_next(iteration_state_$89)) {
																												thread.resetMultipleValues();
																												final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$89);
																												final SubLObject link_nodes4 = thread.secondMultipleValue();
																												thread.resetMultipleValues();
																												if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																													final SubLObject _prev_bind_0_$91 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																													try {
																														sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																														final SubLObject sol3 = link_nodes4;
																														if (NIL != set.set_p(sol3)) {
																															final SubLObject set_contents_var3 = set.do_set_internal(sol3);
																															SubLObject basis_object3;
																															SubLObject state3;
																															SubLObject node_vars_link_node;
																															for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents
																																	.do_set_contents_update_state(state3)) {
																																node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
																																if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
																																	sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
																																	deck.deck_push(node_vars_link_node, recur_deck);
																																}
																															}
																														} else if (sol3.isList()) {
																															SubLObject csome_list_var6 = sol3;
																															SubLObject node_vars_link_node2 = NIL;
																															node_vars_link_node2 = csome_list_var6.first();
																															while (NIL != csome_list_var6) {
																																if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
																																	sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
																																	deck.deck_push(node_vars_link_node2, recur_deck);
																																}
																																csome_list_var6 = csome_list_var6.rest();
																																node_vars_link_node2 = csome_list_var6.first();
																															}
																														} else {
																															Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol3);
																														}

																													} finally {
																														sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$91, thread);
																													}
																												}
																											}
																											dictionary_contents.do_dictionary_contents_finalize(iteration_state_$89);
																										} finally {
																											sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$90, thread);
																										}
																									}
																								}
																								dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
																							}
																						} else {
																							sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str283$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																						}
																					} else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
																						SubLObject cdolist_list_var_$101;
																						final SubLObject new_list2 = cdolist_list_var_$101 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																								? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																								: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																						SubLObject generating_fn2 = NIL;
																						generating_fn2 = cdolist_list_var_$101.first();
																						while (NIL != cdolist_list_var_$101) {
																							final SubLObject _prev_bind_0_$92 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																							try {
																								sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
																								final SubLObject sol4;
																								final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
																								if (NIL != set.set_p(sol4)) {
																									final SubLObject set_contents_var4 = set.do_set_internal(sol4);
																									SubLObject basis_object4;
																									SubLObject state4;
																									SubLObject node_vars_link_node3;
																									for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
																										node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
																										if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
																											sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
																											deck.deck_push(node_vars_link_node3, recur_deck);
																										}
																									}
																								} else if (sol4.isList()) {
																									SubLObject csome_list_var7 = sol4;
																									SubLObject node_vars_link_node4 = NIL;
																									node_vars_link_node4 = csome_list_var7.first();
																									while (NIL != csome_list_var7) {
																										if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
																											sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
																											deck.deck_push(node_vars_link_node4, recur_deck);
																										}
																										csome_list_var7 = csome_list_var7.rest();
																										node_vars_link_node4 = csome_list_var7.first();
																									}
																								} else {
																									Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol4);
																								}

																							} finally {
																								sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$92, thread);
																							}
																							cdolist_list_var_$101 = cdolist_list_var_$101.rest();
																							generating_fn2 = cdolist_list_var_$101.first();
																						}
																					}

																				} finally {
																					sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$78, thread);
																					sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$89, thread);
																				}
																				cdolist_list_var2 = cdolist_list_var2.rest();
																				module_var2 = cdolist_list_var2.first();
																			}
																			node_var_$74 = deck.deck_pop(recur_deck);
																		}
																	} finally {
																		sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$81, thread);
																		sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$76, thread);
																		sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$76, thread);
																	}
																} else {
																	sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str285$Node__a_does_not_pass_sbhl_type_t, good_col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
																}
															} finally {
																sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
																sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$81, thread);
																sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$80, thread);
																sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$75, thread);
																sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$75, thread);
															}
														} finally {
															sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$74, thread);
															sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$74, thread);
														}
													} finally {
														final SubLObject _prev_bind_0_$93 = $is_thread_performing_cleanupP$.currentBinding(thread);
														try {
															$is_thread_performing_cleanupP$.bind(T, thread);
															final SubLObject _values = getValuesAsVector();
															sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
															restoreValuesFromVector(_values);
														} finally {
															$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$93, thread);
														}
													}
												} finally {
													sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$73, thread);
												}
											} finally {
												final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
												try {
													$is_thread_performing_cleanupP$.bind(T, thread);
													final SubLObject _values2 = getValuesAsVector();
													sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
													restoreValuesFromVector(_values2);
												} finally {
													$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
												}
											}
										} finally {
											sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$73, thread);
											sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$72, thread);
										}
									} finally {
										final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											final SubLObject _values3 = getValuesAsVector();
											memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
											restoreValuesFromVector(_values3);
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
										}
									}
								} finally {
									memoization_state.$memoization_state$.rebind(_prev_bind_0_$71, thread);
								}
							} finally {
								pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$70, thread);
							}
							if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
								memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
							}
						} finally {
							pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$69, thread);
						}
					} finally {
						final SubLObject _prev_bind_0_$96 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values4 = getValuesAsVector();
							if (NIL == reuseP) {
								pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
							}
							restoreValuesFromVector(_values4);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$96, thread);
						}
					}
				} finally {
					pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$68, thread);
				}
			} finally {
				pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_4, thread);
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return ans;
	}

	public static SubLObject get_constrained_cycls_for_regular_expression(final SubLObject regular_expression, final SubLObject good_col, SubLObject bad_col, SubLObject domain_mt, SubLObject parsing_mt, SubLObject case_insensitiveP) {
		if (bad_col == UNPROVIDED) {
			bad_col = NIL;
		}
		if (domain_mt == UNPROVIDED) {
			domain_mt = NIL;
		}
		if (parsing_mt == UNPROVIDED) {
			parsing_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
		}
		if (case_insensitiveP == UNPROVIDED) {
			case_insensitiveP = T;
		}
		SubLObject ans = NIL;
		if (NIL != regular_expressions.is_regular_expressions_support_availableP()) {
			ans = get_constrained_cycls_for_regular_expression_low(regular_expression, good_col, bad_col, domain_mt, parsing_mt, case_insensitiveP);
		}
		return ans;
	}

	public static SubLObject get_constrained_cycls_for_regular_expression_low(final SubLObject regular_expression, final SubLObject good_col, SubLObject bad_col, final SubLObject domain_mt, final SubLObject parsing_mt, final SubLObject case_insensitiveP) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject cardinality_cutoff = $constrained_cycls_for_regular_expression_cardinality_cutoff$.getGlobalValue();
		if ((NIL != forts.fort_p(good_col)) && cardinality_estimates.instance_cardinality(good_col).numLE(cardinality_cutoff)) {
			if (NIL == cycl_grammar.cycl_denotational_term_p(bad_col)) {
				bad_col = NIL;
			}
			final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
			final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
			final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
			try {
				mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(domain_mt), thread);
				mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(domain_mt), thread);
				mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(domain_mt), thread);
				final SubLObject compile_options = (NIL != case_insensitiveP) ? $list288 : NIL;
				thread.resetMultipleValues();
				final SubLObject pattern = regular_expressions.compile_regular_expression(regular_expression, compile_options);
				final SubLObject error_code = thread.secondMultipleValue();
				final SubLObject error_offset = thread.thirdMultipleValue();
				final SubLObject error_msg = thread.fourthMultipleValue();
				thread.resetMultipleValues();
				try {
					if (NIL == regular_expressions.regex_pattern_p(pattern)) {
						Errors.error($str289$Error__A___A__compiling_regular_e, new SubLObject[] { error_code, error_msg, regular_expression, error_offset });
					}
					final SubLObject _prev_bind_0_$116 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
					try {
						pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$117 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
						try {
							pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
							final SubLObject reuseP = thread.secondMultipleValue();
							thread.resetMultipleValues();
							try {
								thread.resetMultipleValues();
								final SubLObject _prev_bind_0_$118 = pph_macros.$pph_memoization_state$.currentBinding(thread);
								try {
									pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
									final SubLObject new_or_reused = thread.secondMultipleValue();
									thread.resetMultipleValues();
									final SubLObject _prev_bind_0_$119 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
									try {
										pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
										final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
										final SubLObject _prev_bind_0_$120 = memoization_state.$memoization_state$.currentBinding(thread);
										try {
											memoization_state.$memoization_state$.bind(local_state, thread);
											final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
											try {
												final SubLObject _prev_bind_0_$121 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
												final SubLObject _prev_bind_1_$122 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
												try {
													sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
													sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
													try {
														SubLObject node_var_$123 = good_col;
														final SubLObject deck_type = $STACK;
														final SubLObject recur_deck = deck.create_deck(deck_type);
														final SubLObject _prev_bind_0_$122 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
														try {
															sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
															try {
																final SubLObject tv_var = NIL;
																final SubLObject _prev_bind_0_$123 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
																final SubLObject _prev_bind_1_$123 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
																try {
																	sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
																	sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
																	if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
																		final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
																		if (pcase_var.eql($ERROR)) {
																			sbhl_paranoia.sbhl_error(ONE_INTEGER, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																		} else if (pcase_var.eql($CERROR)) {
																			sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																		} else if (pcase_var.eql($WARN)) {
																			Errors.warn($str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
																		} else {
																			Errors.warn($str281$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
																			Errors.cerror($$$continue_anyway, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
																		}

																	}
																	final SubLObject _prev_bind_0_$124 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
																	final SubLObject _prev_bind_1_$124 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
																	final SubLObject _prev_bind_2_$129 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
																	final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																	final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
																	try {
																		sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
																		sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																		sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																		sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
																		sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
																		if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(good_col, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
																			final SubLObject _prev_bind_0_$125 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
																			final SubLObject _prev_bind_1_$125 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
																			final SubLObject _prev_bind_2_$130 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																			try {
																				sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
																				sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
																				sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
																				sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$123, UNPROVIDED);
																				while (NIL != node_var_$123) {
																					final SubLObject tt_node_var = node_var_$123;
																					SubLObject cdolist_list_var;
																					final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
																					SubLObject module_var = NIL;
																					module_var = cdolist_list_var.first();
																					while (NIL != cdolist_list_var) {
																						final SubLObject _prev_bind_0_$126 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
																						final SubLObject _prev_bind_1_$126 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																						try {
																							sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
																							sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																							final SubLObject node = function_terms.naut_to_nart(tt_node_var);
																							if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
																								final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																								if (NIL != d_link) {
																									final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																									if (NIL != mt_links) {
																										SubLObject iteration_state;
																										for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
																											thread.resetMultipleValues();
																											final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
																											final SubLObject tv_links = thread.secondMultipleValue();
																											thread.resetMultipleValues();
																											if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																												final SubLObject _prev_bind_0_$127 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																												try {
																													sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																													SubLObject iteration_state_$136;
																													for (iteration_state_$136 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$136); iteration_state_$136 = dictionary_contents.do_dictionary_contents_next(iteration_state_$136)) {
																														thread.resetMultipleValues();
																														final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$136);
																														final SubLObject link_nodes = thread.secondMultipleValue();
																														thread.resetMultipleValues();
																														if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																															final SubLObject _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																															try {
																																sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																																final SubLObject sol = link_nodes;
																																if (NIL != set.set_p(sol)) {
																																	final SubLObject set_contents_var = set.do_set_internal(sol);
																																	SubLObject basis_object;
																																	SubLObject state;
																																	SubLObject instance;
																																	SubLObject _prev_bind_0_$129;
																																	SubLObject match;
																																	SubLObject csome_list_var;
																																	SubLObject phrase;
																																	for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents
																																			.do_set_contents_update_state(state)) {
																																		instance = set_contents.do_set_contents_next(basis_object, state);
																																		if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																																			sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																			if ((NIL != forts.fort_p(instance)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance, bad_col, UNPROVIDED)))) {
																																				_prev_bind_0_$129 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																																				try {
																																					lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																																					match = NIL;
																																					if (NIL == match) {
																																						csome_list_var = pph_methods_lexicon.all_phrases_for_term(instance, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																						phrase = NIL;
																																						phrase = csome_list_var.first();
																																						while ((NIL == match) && (NIL != csome_list_var)) {
																																							if (NIL != regular_expression_utilities.find_all_matches_for_pattern(pattern, phrase, UNPROVIDED)) {
																																								match = list(instance, phrase);
																																							}
																																							csome_list_var = csome_list_var.rest();
																																							phrase = csome_list_var.first();
																																						}
																																					}
																																					if (NIL != match) {
																																						ans = cons(match, ans);
																																					}
																																				} finally {
																																					lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$129, thread);
																																				}
																																			}
																																		}
																																	}
																																} else if (sol.isList()) {
																																	SubLObject csome_list_var2 = sol;
																																	SubLObject instance2 = NIL;
																																	instance2 = csome_list_var2.first();
																																	while (NIL != csome_list_var2) {
																																		if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																																			sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																			if ((NIL != forts.fort_p(instance2)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance2, bad_col, UNPROVIDED)))) {
																																				final SubLObject _prev_bind_0_$130 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																																				try {
																																					lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																																					SubLObject match2 = NIL;
																																					if (NIL == match2) {
																																						SubLObject csome_list_var_$140 = pph_methods_lexicon.all_phrases_for_term(instance2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																						SubLObject phrase2 = NIL;
																																						phrase2 = csome_list_var_$140.first();
																																						while ((NIL == match2) && (NIL != csome_list_var_$140)) {
																																							if (NIL != regular_expression_utilities.find_all_matches_for_pattern(pattern, phrase2, UNPROVIDED)) {
																																								match2 = list(instance2, phrase2);
																																							}
																																							csome_list_var_$140 = csome_list_var_$140.rest();
																																							phrase2 = csome_list_var_$140.first();
																																						}
																																					}
																																					if (NIL != match2) {
																																						ans = cons(match2, ans);
																																					}
																																				} finally {
																																					lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$130, thread);
																																				}
																																			}
																																		}
																																		csome_list_var2 = csome_list_var2.rest();
																																		instance2 = csome_list_var2.first();
																																	}
																																} else {
																																	Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol);
																																}

																															} finally {
																																sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$128, thread);
																															}
																														}
																													}
																													dictionary_contents.do_dictionary_contents_finalize(iteration_state_$136);
																												} finally {
																													sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$127, thread);
																												}
																											}
																										}
																										dictionary_contents.do_dictionary_contents_finalize(iteration_state);
																									}
																								} else {
																									sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str283$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																								}
																								if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
																									SubLObject csome_list_var3 = sbhl_link_methods.non_fort_instance_table_lookup(node);
																									SubLObject instance_tuple = NIL;
																									instance_tuple = csome_list_var3.first();
																									while (NIL != csome_list_var3) {
																										SubLObject current;
																										final SubLObject datum = current = instance_tuple;
																										SubLObject link_node = NIL;
																										SubLObject mt2 = NIL;
																										SubLObject tv2 = NIL;
																										destructuring_bind_must_consp(current, datum, $list284);
																										link_node = current.first();
																										current = current.rest();
																										destructuring_bind_must_consp(current, datum, $list284);
																										mt2 = current.first();
																										current = current.rest();
																										destructuring_bind_must_consp(current, datum, $list284);
																										tv2 = current.first();
																										current = current.rest();
																										if (NIL == current) {
																											if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
																												final SubLObject _prev_bind_0_$131 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																												try {
																													sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
																													if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																														final SubLObject _prev_bind_0_$132 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																														try {
																															sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																															final SubLObject sol;
																															final SubLObject link_nodes2 = sol = list(link_node);
																															if (NIL != set.set_p(sol)) {
																																final SubLObject set_contents_var = set.do_set_internal(sol);
																																SubLObject basis_object;
																																SubLObject state;
																																SubLObject instance;
																																SubLObject match;
																																SubLObject phrase;
																																SubLObject _prev_bind_0_$133;
																																SubLObject csome_list_var_$141;
																																for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents
																																		.do_set_contents_update_state(state)) {
																																	instance = set_contents.do_set_contents_next(basis_object, state);
																																	if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																																		sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																		if ((NIL != forts.fort_p(instance)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance, bad_col, UNPROVIDED)))) {
																																			_prev_bind_0_$133 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																																			try {
																																				lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																																				match = NIL;
																																				if (NIL == match) {
																																					csome_list_var_$141 = pph_methods_lexicon.all_phrases_for_term(instance, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																					phrase = NIL;
																																					phrase = csome_list_var_$141.first();
																																					while ((NIL == match) && (NIL != csome_list_var_$141)) {
																																						if (NIL != regular_expression_utilities.find_all_matches_for_pattern(pattern, phrase, UNPROVIDED)) {
																																							match = list(instance, phrase);
																																						}
																																						csome_list_var_$141 = csome_list_var_$141.rest();
																																						phrase = csome_list_var_$141.first();
																																					}
																																				}
																																				if (NIL != match) {
																																					ans = cons(match, ans);
																																				}
																																			} finally {
																																				lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$133, thread);
																																			}
																																		}
																																	}
																																}
																															} else if (sol.isList()) {
																																SubLObject csome_list_var_$142 = sol;
																																SubLObject instance2 = NIL;
																																instance2 = csome_list_var_$142.first();
																																while (NIL != csome_list_var_$142) {
																																	if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																																		sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																																		if ((NIL != forts.fort_p(instance2)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance2, bad_col, UNPROVIDED)))) {
																																			final SubLObject _prev_bind_0_$134 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																																			try {
																																				lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																																				SubLObject match2 = NIL;
																																				if (NIL == match2) {
																																					SubLObject csome_list_var_$143 = pph_methods_lexicon.all_phrases_for_term(instance2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																					SubLObject phrase2 = NIL;
																																					phrase2 = csome_list_var_$143.first();
																																					while ((NIL == match2) && (NIL != csome_list_var_$143)) {
																																						if (NIL != regular_expression_utilities.find_all_matches_for_pattern(pattern, phrase2, UNPROVIDED)) {
																																							match2 = list(instance2, phrase2);
																																						}
																																						csome_list_var_$143 = csome_list_var_$143.rest();
																																						phrase2 = csome_list_var_$143.first();
																																					}
																																				}
																																				if (NIL != match2) {
																																					ans = cons(match2, ans);
																																				}
																																			} finally {
																																				lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$134, thread);
																																			}
																																		}
																																	}
																																	csome_list_var_$142 = csome_list_var_$142.rest();
																																	instance2 = csome_list_var_$142.first();
																																}
																															} else {
																																Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol);
																															}

																														} finally {
																															sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$132, thread);
																														}
																													}
																												} finally {
																													sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$131, thread);
																												}
																											}
																										} else {
																											cdestructuring_bind_error(datum, $list284);
																										}
																										csome_list_var3 = csome_list_var3.rest();
																										instance_tuple = csome_list_var3.first();
																									}
																								}
																							} else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
																								SubLObject cdolist_list_var_$148;
																								final SubLObject new_list = cdolist_list_var_$148 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																										? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																										: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																								SubLObject generating_fn = NIL;
																								generating_fn = cdolist_list_var_$148.first();
																								while (NIL != cdolist_list_var_$148) {
																									final SubLObject _prev_bind_0_$135 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																									try {
																										sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
																										final SubLObject sol2;
																										final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
																										if (NIL != set.set_p(sol2)) {
																											final SubLObject set_contents_var2 = set.do_set_internal(sol2);
																											SubLObject basis_object2;
																											SubLObject state2;
																											SubLObject instance3;
																											SubLObject _prev_bind_0_$136;
																											SubLObject match3;
																											SubLObject csome_list_var4;
																											SubLObject phrase3;
																											for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
																												instance3 = set_contents.do_set_contents_next(basis_object2, state2);
																												if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																													sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																													if ((NIL != forts.fort_p(instance3)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance3, bad_col, UNPROVIDED)))) {
																														_prev_bind_0_$136 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																														try {
																															lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																															match3 = NIL;
																															if (NIL == match3) {
																																csome_list_var4 = pph_methods_lexicon.all_phrases_for_term(instance3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																phrase3 = NIL;
																																phrase3 = csome_list_var4.first();
																																while ((NIL == match3) && (NIL != csome_list_var4)) {
																																	if (NIL != regular_expression_utilities.find_all_matches_for_pattern(pattern, phrase3, UNPROVIDED)) {
																																		match3 = list(instance3, phrase3);
																																	}
																																	csome_list_var4 = csome_list_var4.rest();
																																	phrase3 = csome_list_var4.first();
																																}
																															}
																															if (NIL != match3) {
																																ans = cons(match3, ans);
																															}
																														} finally {
																															lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$136, thread);
																														}
																													}
																												}
																											}
																										} else if (sol2.isList()) {
																											SubLObject csome_list_var5 = sol2;
																											SubLObject instance4 = NIL;
																											instance4 = csome_list_var5.first();
																											while (NIL != csome_list_var5) {
																												if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																													sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																													if ((NIL != forts.fort_p(instance4)) && ((NIL == bad_col) || (NIL == lexicon_accessors.denot_has_typeP(instance4, bad_col, UNPROVIDED)))) {
																														final SubLObject _prev_bind_0_$137 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
																														try {
																															lexicon_vars.$lexicon_lookup_mt$.bind(parsing_mt, thread);
																															SubLObject match4 = NIL;
																															if (NIL == match4) {
																																SubLObject csome_list_var_$144 = pph_methods_lexicon.all_phrases_for_term(instance4, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																																SubLObject phrase4 = NIL;
																																phrase4 = csome_list_var_$144.first();
																																while ((NIL == match4) && (NIL != csome_list_var_$144)) {
																																	if (NIL != regular_expression_utilities.find_all_matches_for_pattern(pattern, phrase4, UNPROVIDED)) {
																																		match4 = list(instance4, phrase4);
																																	}
																																	csome_list_var_$144 = csome_list_var_$144.rest();
																																	phrase4 = csome_list_var_$144.first();
																																}
																															}
																															if (NIL != match4) {
																																ans = cons(match4, ans);
																															}
																														} finally {
																															lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0_$137, thread);
																														}
																													}
																												}
																												csome_list_var5 = csome_list_var5.rest();
																												instance4 = csome_list_var5.first();
																											}
																										} else {
																											Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol2);
																										}

																									} finally {
																										sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$135, thread);
																									}
																									cdolist_list_var_$148 = cdolist_list_var_$148.rest();
																									generating_fn = cdolist_list_var_$148.first();
																								}
																							}

																						} finally {
																							sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$126, thread);
																							sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$126, thread);
																						}
																						cdolist_list_var = cdolist_list_var.rest();
																						module_var = cdolist_list_var.first();
																					}
																					SubLObject cdolist_list_var2;
																					final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
																					SubLObject module_var2 = NIL;
																					module_var2 = cdolist_list_var2.first();
																					while (NIL != cdolist_list_var2) {
																						final SubLObject _prev_bind_0_$138 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
																						final SubLObject _prev_bind_1_$127 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
																						try {
																							sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
																							sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																							final SubLObject node2 = function_terms.naut_to_nart(node_var_$123);
																							if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
																								final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																								if (NIL != d_link2) {
																									final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																									if (NIL != mt_links2) {
																										SubLObject iteration_state2;
																										for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
																											thread.resetMultipleValues();
																											final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
																											final SubLObject tv_links2 = thread.secondMultipleValue();
																											thread.resetMultipleValues();
																											if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
																												final SubLObject _prev_bind_0_$139 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																												try {
																													sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
																													SubLObject iteration_state_$137;
																													for (iteration_state_$137 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$137); iteration_state_$137 = dictionary_contents.do_dictionary_contents_next(iteration_state_$137)) {
																														thread.resetMultipleValues();
																														final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$137);
																														final SubLObject link_nodes4 = thread.secondMultipleValue();
																														thread.resetMultipleValues();
																														if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																															final SubLObject _prev_bind_0_$140 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																															try {
																																sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																																final SubLObject sol3 = link_nodes4;
																																if (NIL != set.set_p(sol3)) {
																																	final SubLObject set_contents_var3 = set.do_set_internal(sol3);
																																	SubLObject basis_object3;
																																	SubLObject state3;
																																	SubLObject node_vars_link_node;
																																	for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents
																																			.do_set_contents_update_state(state3)) {
																																		node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
																																		if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
																																			sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
																																			deck.deck_push(node_vars_link_node, recur_deck);
																																		}
																																	}
																																} else if (sol3.isList()) {
																																	SubLObject csome_list_var6 = sol3;
																																	SubLObject node_vars_link_node2 = NIL;
																																	node_vars_link_node2 = csome_list_var6.first();
																																	while (NIL != csome_list_var6) {
																																		if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
																																			sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
																																			deck.deck_push(node_vars_link_node2, recur_deck);
																																		}
																																		csome_list_var6 = csome_list_var6.rest();
																																		node_vars_link_node2 = csome_list_var6.first();
																																	}
																																} else {
																																	Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol3);
																																}

																															} finally {
																																sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$140, thread);
																															}
																														}
																													}
																													dictionary_contents.do_dictionary_contents_finalize(iteration_state_$137);
																												} finally {
																													sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$139, thread);
																												}
																											}
																										}
																										dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
																									}
																								} else {
																									sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str283$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																								}
																							} else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
																								SubLObject cdolist_list_var_$149;
																								final SubLObject new_list2 = cdolist_list_var_$149 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																										? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																										: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																								SubLObject generating_fn2 = NIL;
																								generating_fn2 = cdolist_list_var_$149.first();
																								while (NIL != cdolist_list_var_$149) {
																									final SubLObject _prev_bind_0_$141 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																									try {
																										sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
																										final SubLObject sol4;
																										final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
																										if (NIL != set.set_p(sol4)) {
																											final SubLObject set_contents_var4 = set.do_set_internal(sol4);
																											SubLObject basis_object4;
																											SubLObject state4;
																											SubLObject node_vars_link_node3;
																											for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
																												node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
																												if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
																													sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
																													deck.deck_push(node_vars_link_node3, recur_deck);
																												}
																											}
																										} else if (sol4.isList()) {
																											SubLObject csome_list_var7 = sol4;
																											SubLObject node_vars_link_node4 = NIL;
																											node_vars_link_node4 = csome_list_var7.first();
																											while (NIL != csome_list_var7) {
																												if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
																													sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
																													deck.deck_push(node_vars_link_node4, recur_deck);
																												}
																												csome_list_var7 = csome_list_var7.rest();
																												node_vars_link_node4 = csome_list_var7.first();
																											}
																										} else {
																											Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol4);
																										}

																									} finally {
																										sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$141, thread);
																									}
																									cdolist_list_var_$149 = cdolist_list_var_$149.rest();
																									generating_fn2 = cdolist_list_var_$149.first();
																								}
																							}

																						} finally {
																							sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$127, thread);
																							sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$138, thread);
																						}
																						cdolist_list_var2 = cdolist_list_var2.rest();
																						module_var2 = cdolist_list_var2.first();
																					}
																					node_var_$123 = deck.deck_pop(recur_deck);
																				}
																			} finally {
																				sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$130, thread);
																				sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$125, thread);
																				sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$125, thread);
																			}
																		} else {
																			sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str285$Node__a_does_not_pass_sbhl_type_t, good_col, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
																		}
																	} finally {
																		sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
																		sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
																		sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$129, thread);
																		sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$124, thread);
																		sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$124, thread);
																	}
																} finally {
																	sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$123, thread);
																	sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$123, thread);
																}
															} finally {
																final SubLObject _prev_bind_0_$142 = $is_thread_performing_cleanupP$.currentBinding(thread);
																try {
																	$is_thread_performing_cleanupP$.bind(T, thread);
																	final SubLObject _values = getValuesAsVector();
																	sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
																	restoreValuesFromVector(_values);
																} finally {
																	$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
																}
															}
														} finally {
															sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$122, thread);
														}
													} finally {
														final SubLObject _prev_bind_0_$143 = $is_thread_performing_cleanupP$.currentBinding(thread);
														try {
															$is_thread_performing_cleanupP$.bind(T, thread);
															final SubLObject _values2 = getValuesAsVector();
															sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
															restoreValuesFromVector(_values2);
														} finally {
															$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
														}
													}
												} finally {
													sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$122, thread);
													sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$121, thread);
												}
											} finally {
												final SubLObject _prev_bind_0_$144 = $is_thread_performing_cleanupP$.currentBinding(thread);
												try {
													$is_thread_performing_cleanupP$.bind(T, thread);
													final SubLObject _values3 = getValuesAsVector();
													memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
													restoreValuesFromVector(_values3);
												} finally {
													$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$144, thread);
												}
											}
										} finally {
											memoization_state.$memoization_state$.rebind(_prev_bind_0_$120, thread);
										}
									} finally {
										pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$119, thread);
									}
									if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
										memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
									}
								} finally {
									pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$118, thread);
								}
							} finally {
								final SubLObject _prev_bind_0_$145 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									final SubLObject _values4 = getValuesAsVector();
									if (NIL == reuseP) {
										pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
									}
									restoreValuesFromVector(_values4);
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
								}
							}
						} finally {
							pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$117, thread);
						}
					} finally {
						pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0_$116, thread);
					}
				} finally {
					final SubLObject _prev_bind_0_$146 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values5 = getValuesAsVector();
						if (NIL != regular_expressions.regex_pattern_p(pattern)) {
							regular_expressions.discard_regular_expression_pattern(pattern);
						}
						restoreValuesFromVector(_values5);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
					}
				}
			} finally {
				mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
				mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
				mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
			}
		}
		return ans;
	}

	public static SubLObject get_constrained_cycls_for_regular_expression_via_inference(final SubLObject regular_expression, final SubLObject good_col, final SubLObject bad_col, final SubLObject domain_mt, final SubLObject parsing_mt, SubLObject case_insensitiveP) {
		if (case_insensitiveP == UNPROVIDED) {
			case_insensitiveP = T;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject var = $sym50$_X;
		final SubLObject name_var = $sym290$_NAME;
		final SubLObject semantic_constraints = get_cycls_for_regex_semantic_constraints(var, good_col, bad_col);
		final SubLObject regex_constraint = get_cycls_for_regex_regex_constraint(name_var, regular_expression, case_insensitiveP);
		final SubLObject lexical_constraint = list($$termStrings, var, name_var);
		SubLObject ans = NIL;
		SubLObject problem_store = NIL;
		try {
			problem_store = inference_datastructures_problem_store.new_problem_store(NIL);
			final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
			try {
				pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
				thread.resetMultipleValues();
				final SubLObject _prev_bind_0_$165 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
				try {
					pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
					final SubLObject reuseP = thread.secondMultipleValue();
					thread.resetMultipleValues();
					try {
						thread.resetMultipleValues();
						final SubLObject _prev_bind_0_$166 = pph_macros.$pph_memoization_state$.currentBinding(thread);
						try {
							pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
							final SubLObject new_or_reused = thread.secondMultipleValue();
							thread.resetMultipleValues();
							final SubLObject _prev_bind_0_$167 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
							try {
								pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
								final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
								final SubLObject _prev_bind_0_$168 = memoization_state.$memoization_state$.currentBinding(thread);
								try {
									memoization_state.$memoization_state$.bind(local_state, thread);
									final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
									try {
										final SubLObject initial_query_sentence = listS($$and, lexical_constraint, regex_constraint, semantic_constraints);
										SubLObject cdolist_list_var;
										final SubLObject candidates_and_names = cdolist_list_var = ask_utilities.query_template(list(var, name_var), initial_query_sentence, $$InferencePSC, list($PROBLEM_STORE, problem_store, $ANSWER_LANGUAGE, $HL));
										SubLObject pair = NIL;
										pair = cdolist_list_var.first();
										while (NIL != cdolist_list_var) {
											SubLObject current;
											final SubLObject datum = current = pair;
											SubLObject candidate = NIL;
											SubLObject name = NIL;
											destructuring_bind_must_consp(current, datum, $list295);
											candidate = current.first();
											current = current.rest();
											destructuring_bind_must_consp(current, datum, $list295);
											name = current.first();
											current = current.rest();
											if (NIL == current) {
												final SubLObject filtering_query_sentence = cycl_utilities.expression_subst(candidate, var, cycl_utilities.expression_subst(name, name_var, listS($$and, list($$ist, parsing_mt, lexical_constraint), semantic_constraints), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
												if (NIL != cyc_kernel.closed_query_success_result_p(inference_kernel.new_cyc_query(filtering_query_sentence, domain_mt, list($PROBLEM_STORE, problem_store)))) {
													final SubLObject item_var = pair;
													if (NIL == member(item_var, ans, symbol_function(EQL), symbol_function(IDENTITY))) {
														ans = cons(item_var, ans);
													}
												}
											} else {
												cdestructuring_bind_error(datum, $list295);
											}
											cdolist_list_var = cdolist_list_var.rest();
											pair = cdolist_list_var.first();
										}
									} finally {
										final SubLObject _prev_bind_0_$169 = $is_thread_performing_cleanupP$.currentBinding(thread);
										try {
											$is_thread_performing_cleanupP$.bind(T, thread);
											final SubLObject _values = getValuesAsVector();
											memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
											restoreValuesFromVector(_values);
										} finally {
											$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$169, thread);
										}
									}
								} finally {
									memoization_state.$memoization_state$.rebind(_prev_bind_0_$168, thread);
								}
							} finally {
								pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$167, thread);
							}
							if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
								memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
							}
						} finally {
							pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$166, thread);
						}
					} finally {
						final SubLObject _prev_bind_0_$170 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values2 = getValuesAsVector();
							if (NIL == reuseP) {
								pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
							}
							restoreValuesFromVector(_values2);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$170, thread);
						}
					}
				} finally {
					pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$165, thread);
				}
			} finally {
				pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
			}
		} finally {
			final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values3 = getValuesAsVector();
				inference_datastructures_problem_store.destroy_problem_store(problem_store);
				restoreValuesFromVector(_values3);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		return ans;
	}

	public static SubLObject get_cycls_for_regex_semantic_constraints(final SubLObject var, final SubLObject good_col, final SubLObject bad_col) {
		SubLObject semantic_constraints = NIL;
		if (NIL != cycl_grammar.cycl_denotational_term_p(good_col)) {
			semantic_constraints = cons(list($$knownSentence, list($$isa, var, good_col)), semantic_constraints);
		}
		if (NIL != cycl_grammar.cycl_denotational_term_p(bad_col)) {
			semantic_constraints = cons(list($$unknownSentence, list($$isa, var, bad_col)), semantic_constraints);
		}
		return semantic_constraints;
	}

	public static SubLObject get_cycls_for_regex_regex_constraint(final SubLObject name_var, final SubLObject regular_expression, final SubLObject case_insensitiveP) {
		final SubLObject regex_pred = (NIL != case_insensitiveP) ? $$regexStringMatch_CaseInsensitive : $$regexStringMatch;
		return list(regex_pred, regular_expression, name_var);
	}

	public static SubLObject filter_phrase_term_list_by_constraint_list(final SubLObject phrase_term_list, final SubLObject constraints, SubLObject domain_mt) {
		domain_mt = hlmt_czer.coerce_to_hlmt(domain_mt);
		SubLObject result = NIL;
		SubLObject cdolist_list_var = phrase_term_list;
		SubLObject phrase_term_pair = NIL;
		phrase_term_pair = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = phrase_term_pair;
			SubLObject phrase = NIL;
			SubLObject term_denoted = NIL;
			destructuring_bind_must_consp(current, datum, $list301);
			phrase = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list301);
			term_denoted = current.first();
			current = current.rest();
			if (NIL == current) {
				term_denoted = czer_main.coerce_to_fort(term_denoted);
				if (NIL != filter_cycl_term_by_constraint_list(term_denoted, constraints, domain_mt)) {
					result = cons(phrase_term_pair, result);
				}
			} else {
				cdestructuring_bind_error(datum, $list301);
			}
			cdolist_list_var = cdolist_list_var.rest();
			phrase_term_pair = cdolist_list_var.first();
		}
		return result;
	}

	public static SubLObject filter_cycl_term_by_constraint_list(SubLObject v_term, final SubLObject constraints, SubLObject domain_mt) {
		v_term = czer_main.coerce_to_fort(v_term);
		domain_mt = hlmt_czer.coerce_to_hlmt(domain_mt);
		SubLObject query_formula = NIL;
		SubLObject cdolist_list_var = constraints;
		SubLObject constraint = NIL;
		constraint = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != cycl_utilities.naut_with_functor_p(constraint, $$TheSet)) {
				final SubLObject variable = cycl_utilities.formula_arg1(constraint, UNPROVIDED);
				final SubLObject set_description = cycl_utilities.formula_arg2(constraint, UNPROVIDED);
				query_formula = cons(subst(v_term, variable, set_description, UNPROVIDED, UNPROVIDED), query_formula);
			}
			cdolist_list_var = cdolist_list_var.rest();
			constraint = cdolist_list_var.first();
		}
		return rkf_query_utilities.rkf_known(cons($$and, query_formula), domain_mt, UNPROVIDED);
	}

	public static SubLObject auto_complete_constrained(final SubLObject prefix, final SubLObject constraining_collection, final SubLObject domain_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
		assert NIL != fort_types_interface.isa_collectionP(constraining_collection, UNPROVIDED) : "fort_types_interface.isa_collectionP(constraining_collection, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(constraining_collection, CommonSymbols.UNPROVIDED) " + constraining_collection;
		SubLObject list_of_javalists = NIL;
		SubLObject cdolist_list_var = nl_trie_completion.nl_trie_completions(prefix, UNPROVIDED);
		SubLObject string = NIL;
		string = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject javalists = NIL;
			SubLObject cdolist_list_var_$171 = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
			SubLObject nl_trie_entry = NIL;
			nl_trie_entry = cdolist_list_var_$171.first();
			while (NIL != cdolist_list_var_$171) {
				thread.resetMultipleValues();
				final SubLObject temp_javalists = nl_trie.nl_trie_entry_to_javalists(nl_trie_entry);
				final SubLObject denotations = thread.secondMultipleValue();
				thread.resetMultipleValues();
				SubLObject javalist = NIL;
				SubLObject javalist_$172 = NIL;
				SubLObject denot = NIL;
				SubLObject denot_$173 = NIL;
				javalist = temp_javalists;
				javalist_$172 = javalist.first();
				denot = denotations;
				denot_$173 = denot.first();
				while ((NIL != denot) || (NIL != javalist)) {
					if (NIL != isa.isaP(denot_$173, constraining_collection, domain_mt, UNPROVIDED)) {
						final SubLObject item_var = javalist_$172;
						if (NIL == member(item_var, javalists, symbol_function(EQUAL), symbol_function(IDENTITY))) {
							javalists = cons(item_var, javalists);
						}
					}
					javalist = javalist.rest();
					javalist_$172 = javalist.first();
					denot = denot.rest();
					denot_$173 = denot.first();
				}
				cdolist_list_var_$171 = cdolist_list_var_$171.rest();
				nl_trie_entry = cdolist_list_var_$171.first();
			}
			if (NIL == list_utilities.empty_list_p(javalists)) {
				final SubLObject item_var2 = javalists;
				if (NIL == member(item_var2, list_of_javalists, symbol_function(EQUAL), symbol_function(IDENTITY))) {
					list_of_javalists = cons(item_var2, list_of_javalists);
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			string = cdolist_list_var.first();
		}
		return list_of_javalists;
	}

	public static SubLObject auto_complete_term_quick(final SubLObject prefix, final SubLObject max_num) {
		assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
		assert NIL != integerp(max_num) : "Types.integerp(max_num) " + "CommonSymbols.NIL != Types.integerp(max_num) " + max_num;
		SubLObject result_nl_trie_entries = NIL;
		final SubLObject result_map = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
		SubLObject doneP = NIL;
		SubLObject max_limitP = NIL;
		SubLObject entry_to_push = NIL;
		SubLObject rest;
		SubLObject string;
		SubLObject rest_$174;
		SubLObject nl_trie_entry;
		SubLObject pref_denots;
		SubLObject item_var;
		SubLObject cdolist_list_var;
		SubLObject denot;
		for (rest = NIL, rest = Sort.sort(nl_trie_completion.nl_trie_completions(prefix, UNPROVIDED), symbol_function(STRING_LESSP), UNPROVIDED); (NIL == max_limitP) && (NIL != rest); rest = rest.rest()) {
			string = rest.first();
			for (doneP = NIL, rest_$174 = NIL, rest_$174 = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED); (NIL == doneP) && (NIL != rest_$174); rest_$174 = rest_$174.rest()) {
				nl_trie_entry = rest_$174.first();
				pref_denots = nl_trie.nl_trie_entry_preferred_denots(nl_trie_entry);
				if (NIL != list_utilities.non_empty_list_p(pref_denots)) {
					entry_to_push = nl_trie_entry;
					doneP = T;
				} else if (NIL != list_utilities.non_empty_list_p(nl_trie.nl_trie_entry_denots(nl_trie_entry))) {
					entry_to_push = nl_trie_entry;
				}

			}
			item_var = entry_to_push;
			if (NIL == member(item_var, result_nl_trie_entries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
				result_nl_trie_entries = cons(item_var, result_nl_trie_entries);
			}
			cdolist_list_var = nl_trie.nl_trie_entry_denots(entry_to_push);
			denot = NIL;
			denot = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != dictionary_utilities.dictionary_has_keyP(result_map, denot)) {
					if (NIL != doneP) {
						dictionary_utilities.dictionary_pop(result_map, denot);
						dictionary_utilities.dictionary_push(result_map, denot, nl_trie.nl_trie_entry_string(entry_to_push));
					}
				} else {
					dictionary_utilities.dictionary_push(result_map, denot, nl_trie.nl_trie_entry_string(entry_to_push));
				}
				cdolist_list_var = cdolist_list_var.rest();
				denot = cdolist_list_var.first();
			}
			if (dictionary.dictionary_length(result_map).numG(max_num)) {
				max_limitP = T;
			}
		}
		SubLObject cdolist_list_var2 = result_nl_trie_entries;
		SubLObject each_nl_trie_entry = NIL;
		each_nl_trie_entry = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
			final SubLObject entry_pos_preds = nl_trie.nl_trie_entry_pos_preds(each_nl_trie_entry);
			final SubLObject entry_denots = nl_trie.nl_trie_entry_denots(each_nl_trie_entry);
			final SubLObject maybe_remove = nl_trie.nl_trie_entry_string(each_nl_trie_entry);
			final SubLObject curr_denot = entry_denots.first();
			if (((NIL != subl_promotions.memberP($$plural, entry_pos_preds, UNPROVIDED, UNPROVIDED)) || (NIL != subl_promotions.memberP($$gerund_Plural, entry_pos_preds, UNPROVIDED, UNPROVIDED))) || (NIL != rkf_relevance_utilities.rkf_irrelevant_term(curr_denot, $$BaseKB))) {
				final SubLObject rem_string = dictionary.dictionary_lookup_without_values(result_map, curr_denot, UNPROVIDED);
				if (rem_string.first().isString() && rem_string.first().equal(maybe_remove)) {
					dictionary_utilities.dictionary_pop(result_map, curr_denot);
				}
			}
			cdolist_list_var2 = cdolist_list_var2.rest();
			each_nl_trie_entry = cdolist_list_var2.first();
		}
		return Sort.sort(Mapping.mapcar(symbol_function(FIRST), dictionary.dictionary_values(result_map)), symbol_function(STRING_LESSP), UNPROVIDED);
	}

	public static SubLObject auto_complete_constrained_new(final SubLObject prefix, final SubLObject constraining_collection, final SubLObject domain_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
		assert NIL != fort_types_interface.isa_collectionP(constraining_collection, UNPROVIDED) : "fort_types_interface.isa_collectionP(constraining_collection, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(constraining_collection, CommonSymbols.UNPROVIDED) " + constraining_collection;
		final SubLObject denot_strings_map = dictionary.new_dictionary(EQUAL, ZERO_INTEGER);
		final SubLObject word_unit_pos_map = dictionary.new_dictionary(EQUAL, ZERO_INTEGER);
		SubLObject cdolist_list_var = nl_trie_completion.nl_trie_completions(prefix, UNPROVIDED);
		SubLObject string = NIL;
		string = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$175 = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
			SubLObject nl_trie_entry = NIL;
			nl_trie_entry = cdolist_list_var_$175.first();
			while (NIL != cdolist_list_var_$175) {
				SubLObject cdolist_list_var_$176 = nl_trie.nl_trie_entry_denots(nl_trie_entry);
				SubLObject denot = NIL;
				denot = cdolist_list_var_$176.first();
				while (NIL != cdolist_list_var_$176) {
					if (NIL != isa.isaP(denot, constraining_collection, domain_mt, UNPROVIDED)) {
						dictionary_utilities.dictionary_push(denot_strings_map, denot, nl_trie_entry);
						if (NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) {
							final SubLObject curr_word_unit = nl_trie.nl_trie_word_word_unit(nl_trie_entry, UNPROVIDED);
							dictionary_utilities.dictionary_append(word_unit_pos_map, curr_word_unit, nl_trie.nl_trie_word_pos_preds(nl_trie_entry));
						}
					}
					cdolist_list_var_$176 = cdolist_list_var_$176.rest();
					denot = cdolist_list_var_$176.first();
				}
				cdolist_list_var_$175 = cdolist_list_var_$175.rest();
				nl_trie_entry = cdolist_list_var_$175.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			string = cdolist_list_var.first();
		}
		SubLObject list_of_javalists = NIL;
		SubLObject discarded_list_of_javalists = NIL;
		SubLObject useful_entries = NIL;
		SubLObject discarded_nl_trie_entries = NIL;
		SubLObject iteration_state;
		for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(denot_strings_map)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
			thread.resetMultipleValues();
			final SubLObject key_denot = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			final SubLObject value_nl_trie_entries = thread.secondMultipleValue();
			thread.resetMultipleValues();
			SubLObject doneP;
			SubLObject rest;
			SubLObject single_nl_trie_entry;
			SubLObject preferred_denots;
			SubLObject item_var;
			for (doneP = NIL, rest = NIL, rest = value_nl_trie_entries; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
				single_nl_trie_entry = rest.first();
				preferred_denots = nl_trie.nl_trie_entry_preferred_denots(single_nl_trie_entry);
				if (NIL != subl_promotions.memberP(key_denot, preferred_denots, symbol_function(EQUAL), UNPROVIDED)) {
					item_var = single_nl_trie_entry;
					if (NIL == member(item_var, useful_entries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
						useful_entries = cons(item_var, useful_entries);
					}
					doneP = T;
				}
			}
			if (NIL == doneP) {
				if (NIL != list_utilities.singletonP(value_nl_trie_entries)) {
					final SubLObject item_var2 = value_nl_trie_entries.first();
					if (NIL == member(item_var2, useful_entries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
						useful_entries = cons(item_var2, useful_entries);
					}
				} else {
					SubLObject stored_nl_tries = NIL;
					SubLObject cdolist_list_var2 = value_nl_trie_entries;
					SubLObject sec_pass_nl_trie_entry = NIL;
					sec_pass_nl_trie_entry = cdolist_list_var2.first();
					while (NIL != cdolist_list_var2) {
						if (NIL != nl_trie.nl_trie_word_p(sec_pass_nl_trie_entry, UNPROVIDED)) {
							final SubLObject curr_entry_pos_preds = nl_trie.nl_trie_word_pos_preds(sec_pass_nl_trie_entry);
							final SubLObject curr_entry_word_unit = nl_trie.nl_trie_word_word_unit(sec_pass_nl_trie_entry, UNPROVIDED);
							final SubLObject pos_of_this_word_unit = dictionary.dictionary_lookup_without_values(word_unit_pos_map, curr_entry_word_unit, UNPROVIDED);
							if ((NIL != subl_promotions.memberP($$singular, pos_of_this_word_unit, symbol_function(EQUAL), UNPROVIDED)) && (NIL != subl_promotions.memberP($$plural, pos_of_this_word_unit, symbol_function(EQUAL), UNPROVIDED))) {
								if (NIL != subl_promotions.memberP($$singular, curr_entry_pos_preds, symbol_function(EQUAL), UNPROVIDED)) {
									if (NIL != list_utilities.empty_list_p(stored_nl_tries)) {
										SubLObject item_var3 = sec_pass_nl_trie_entry;
										if (NIL == member(item_var3, useful_entries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
											useful_entries = cons(item_var3, useful_entries);
										}
										item_var3 = sec_pass_nl_trie_entry;
										if (NIL == member(item_var3, stored_nl_tries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
											stored_nl_tries = cons(item_var3, stored_nl_tries);
										}
									}
									if (NIL == list_utilities.empty_list_p(stored_nl_tries)) {
										SubLObject item_var3 = sec_pass_nl_trie_entry;
										if (NIL == member(item_var3, discarded_nl_trie_entries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
											discarded_nl_trie_entries = cons(item_var3, discarded_nl_trie_entries);
										}
										item_var3 = sec_pass_nl_trie_entry;
										if (NIL == member(item_var3, stored_nl_tries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
											stored_nl_tries = cons(item_var3, stored_nl_tries);
										}
									}
								}
								if ((NIL == subl_promotions.memberP($$plural, curr_entry_pos_preds, symbol_function(EQUAL), UNPROVIDED)) && (NIL != list_utilities.empty_list_p(stored_nl_tries))) {
									SubLObject item_var3 = sec_pass_nl_trie_entry;
									if (NIL == member(item_var3, useful_entries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
										useful_entries = cons(item_var3, useful_entries);
									}
									item_var3 = sec_pass_nl_trie_entry;
									if (NIL == member(item_var3, stored_nl_tries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
										stored_nl_tries = cons(item_var3, stored_nl_tries);
									}
								}
							} else {
								if (NIL != list_utilities.empty_list_p(stored_nl_tries)) {
									final SubLObject item_var3 = sec_pass_nl_trie_entry;
									if (NIL == member(item_var3, useful_entries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
										useful_entries = cons(item_var3, useful_entries);
									}
								}
								if (NIL == list_utilities.empty_list_p(stored_nl_tries)) {
									final SubLObject item_var3 = sec_pass_nl_trie_entry;
									if (NIL == member(item_var3, discarded_nl_trie_entries, symbol_function(EQUAL), symbol_function(IDENTITY))) {
										discarded_nl_trie_entries = cons(item_var3, discarded_nl_trie_entries);
									}
								}
							}
						}
						cdolist_list_var2 = cdolist_list_var2.rest();
						sec_pass_nl_trie_entry = cdolist_list_var2.first();
					}
				}
			}
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		final SubLObject string_nl_trie_entrymap = dictionary.new_dictionary(EQUAL, ZERO_INTEGER);
		final SubLObject discarded_string_nl_trie_map = dictionary.new_dictionary(EQUAL, ZERO_INTEGER);
		SubLObject cdolist_list_var3 = useful_entries;
		SubLObject each_entry = NIL;
		each_entry = cdolist_list_var3.first();
		while (NIL != cdolist_list_var3) {
			final SubLObject string_key = nl_trie.nl_trie_entry_string(each_entry);
			dictionary_utilities.dictionary_push(string_nl_trie_entrymap, string_key, each_entry);
			cdolist_list_var3 = cdolist_list_var3.rest();
			each_entry = cdolist_list_var3.first();
		}
		cdolist_list_var3 = discarded_nl_trie_entries;
		SubLObject each_discarded_entry = NIL;
		each_discarded_entry = cdolist_list_var3.first();
		while (NIL != cdolist_list_var3) {
			final SubLObject discarded_string_key = nl_trie.nl_trie_entry_string(each_discarded_entry);
			dictionary_utilities.dictionary_push(discarded_string_nl_trie_map, discarded_string_key, each_discarded_entry);
			cdolist_list_var3 = cdolist_list_var3.rest();
			each_discarded_entry = cdolist_list_var3.first();
		}
		SubLObject iteration_state2;
		for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string_nl_trie_entrymap)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
			thread.resetMultipleValues();
			final SubLObject curr_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
			final SubLObject nl_trie_entry_list = thread.secondMultipleValue();
			thread.resetMultipleValues();
			SubLObject javalists = NIL;
			SubLObject cdolist_list_var2 = nl_trie_entry_list;
			SubLObject curr_str_nl_trie_entry = NIL;
			curr_str_nl_trie_entry = cdolist_list_var2.first();
			while (NIL != cdolist_list_var2) {
				thread.resetMultipleValues();
				final SubLObject temp_javalist = nl_trie.nl_trie_entry_to_javalists(curr_str_nl_trie_entry);
				final SubLObject denotations = thread.secondMultipleValue();
				thread.resetMultipleValues();
				SubLObject cdolist_list_var_$177 = temp_javalist;
				SubLObject curr_javalist_item = NIL;
				curr_javalist_item = cdolist_list_var_$177.first();
				while (NIL != cdolist_list_var_$177) {
					javalists = cons(curr_javalist_item, javalists);
					cdolist_list_var_$177 = cdolist_list_var_$177.rest();
					curr_javalist_item = cdolist_list_var_$177.first();
				}
				cdolist_list_var2 = cdolist_list_var2.rest();
				curr_str_nl_trie_entry = cdolist_list_var2.first();
			}
			final SubLObject item_var4 = javalists;
			if (NIL == member(item_var4, list_of_javalists, EQUAL, symbol_function(IDENTITY))) {
				list_of_javalists = cons(item_var4, list_of_javalists);
			}
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
		for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(discarded_string_nl_trie_map)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
			thread.resetMultipleValues();
			final SubLObject curr_discarded_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
			final SubLObject discarded_nl_trie_entry_list = thread.secondMultipleValue();
			thread.resetMultipleValues();
			SubLObject discarded_javalists = NIL;
			SubLObject cdolist_list_var2 = discarded_nl_trie_entry_list;
			SubLObject curr_discarded_str_nl_trie_entry = NIL;
			curr_discarded_str_nl_trie_entry = cdolist_list_var2.first();
			while (NIL != cdolist_list_var2) {
				thread.resetMultipleValues();
				final SubLObject temp_discarded_javalist = nl_trie.nl_trie_entry_to_javalists(curr_discarded_str_nl_trie_entry);
				final SubLObject denotations = thread.secondMultipleValue();
				thread.resetMultipleValues();
				SubLObject cdolist_list_var_$178 = temp_discarded_javalist;
				SubLObject temp_discarded_javalist_item = NIL;
				temp_discarded_javalist_item = cdolist_list_var_$178.first();
				while (NIL != cdolist_list_var_$178) {
					discarded_javalists = cons(temp_discarded_javalist_item, discarded_javalists);
					cdolist_list_var_$178 = cdolist_list_var_$178.rest();
					temp_discarded_javalist_item = cdolist_list_var_$178.first();
				}
				cdolist_list_var2 = cdolist_list_var2.rest();
				curr_discarded_str_nl_trie_entry = cdolist_list_var2.first();
			}
			final SubLObject item_var4 = discarded_javalists;
			if (NIL == member(item_var4, discarded_list_of_javalists, EQUAL, symbol_function(IDENTITY))) {
				discarded_list_of_javalists = cons(item_var4, discarded_list_of_javalists);
			}
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
		final SubLObject sorted_list_of_javalists = Sort.sort(list_of_javalists, symbol_function(STRING_LESSP), symbol_function(GET_STRING_FROM_JAVALIST_GROUP));
		final SubLObject sorted_discarded_list_of_javalists = Sort.sort(discarded_list_of_javalists, symbol_function(STRING_LESSP), symbol_function(GET_STRING_FROM_JAVALIST_GROUP));
		final SubLObject final_list = list(sorted_list_of_javalists, sorted_discarded_list_of_javalists);
		return final_list;
	}

	public static SubLObject get_string_from_javalist_group(final SubLObject list_of_javalists) {
		final SubLObject javalist = caar(list_of_javalists);
		final SubLObject string = nl_trie.javalist_string(javalist);
		return string;
	}

	public static SubLObject find_template_topic_matches_for_constraint(SubLObject topic, SubLObject template_elmt, SubLObject assertions_elmt, final SubLObject constraints, SubLObject string_match_options) {
		if (string_match_options == UNPROVIDED) {
			string_match_options = $list212;
		}
		assert NIL != hlmt.possibly_hlmt_p(template_elmt) : "hlmt.possibly_hlmt_p(template_elmt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(template_elmt) " + template_elmt;
		assert NIL != hlmt.possibly_hlmt_p(assertions_elmt) : "hlmt.possibly_hlmt_p(assertions_elmt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(assertions_elmt) " + assertions_elmt;
		assert NIL != cycl_utilities.fort_or_naut_p(topic) : "cycl_utilities.fort_or_naut_p(topic) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(topic) " + topic;
		assert NIL != listp(constraints) : "Types.listp(constraints) " + "CommonSymbols.NIL != Types.listp(constraints) " + constraints;
		assert NIL != list_utilities.property_list_p(string_match_options) : "list_utilities.property_list_p(string_match_options) " + "CommonSymbols.NIL != list_utilities.property_list_p(string_match_options) " + string_match_options;
		template_elmt = hlmt_czer.coerce_to_hlmt(template_elmt);
		assertions_elmt = hlmt_czer.coerce_to_hlmt(assertions_elmt);
		topic = czer_main.coerce_to_fort(topic);
		SubLObject non_reformulatable_constraints = NIL;
		SubLObject cdolist_list_var = formula_template_utilities.template_type_for_focal_term_types(topic, template_elmt);
		SubLObject instance = NIL;
		instance = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			non_reformulatable_constraints = cons(make_binary_formula($$isa, $template_topic_match_missing_term_variable$.getGlobalValue(), instance), non_reformulatable_constraints);
			cdolist_list_var = cdolist_list_var.rest();
			instance = cdolist_list_var.first();
		}
		cdolist_list_var = formula_template_utilities.template_topic_genls(topic, template_elmt);
		SubLObject col = NIL;
		col = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			non_reformulatable_constraints = cons(make_binary_formula($$genls, $template_topic_match_missing_term_variable$.getGlobalValue(), col), non_reformulatable_constraints);
			cdolist_list_var = cdolist_list_var.rest();
			col = cdolist_list_var.first();
		}
		final SubLObject query_mt = assertions_elmt;
		SubLObject results = NIL;
		SubLObject cdolist_list_var2;
		final SubLObject candidates = cdolist_list_var2 = constrained_term_finder.find_terms_matching_constraints($template_topic_match_missing_term_variable$.getGlobalValue(), constraints, query_mt, string_match_options, non_reformulatable_constraints);
		SubLObject instance2 = NIL;
		instance2 = cdolist_list_var2.first();
		while (NIL != cdolist_list_var2) {
			if (NIL == rkf_relevance_utilities.rkf_irrelevant_term(instance2, assertions_elmt)) {
				final SubLObject item_var = instance2;
				if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
					results = cons(item_var, results);
				}
			}
			cdolist_list_var2 = cdolist_list_var2.rest();
			instance2 = cdolist_list_var2.first();
		}
		return results;
	}

	public static SubLObject unparsable_instance_expression_p(final SubLObject v_object) {
		return cycl_utilities.naut_with_any_of_functors_p(v_object, $list315);
	}

	public static SubLObject use_topic_defining_mt_when_passed_everything_pscP() {
		return $use_topic_defining_mt_when_passed_everything_pscP$.getGlobalValue();
	}

	public static SubLObject everything_psc_dwimmed_awayP() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		return $everything_psc_dwimmed_awayP$.getDynamicValue(thread);
	}

	public static SubLObject get_template_topic_assertions_for_match_in_xml(SubLObject topic, SubLObject template_elmt, SubLObject assertions_elmt, SubLObject match, SubLObject html_state) {
		if (html_state == UNPROVIDED) {
			html_state = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_utilities.fort_or_naut_p(topic) : "cycl_utilities.fort_or_naut_p(topic) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(topic) " + topic;
		assert NIL != hlmt.possibly_mt_p(template_elmt) : "hlmt.possibly_mt_p(template_elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(template_elmt) " + template_elmt;
		assert NIL != hlmt.possibly_mt_p(assertions_elmt) : "hlmt.possibly_mt_p(assertions_elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(assertions_elmt) " + assertions_elmt;
		assert NIL != cycl_utilities.fort_or_naut_p(match) : "cycl_utilities.fort_or_naut_p(match) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(match) " + match;
		topic = czer_main.coerce_to_fort(topic);
		assert NIL != formula_template_utilities.formula_template_topic_typeP(topic) : "formula_template_utilities.formula_template_topic_typeP(topic) " + "CommonSymbols.NIL != formula_template_utilities.formula_template_topic_typeP(topic) " + topic;
		match = czer_main.coerce_to_fort(match);
		SubLObject everything_psc_dwimmed_awayP = NIL;
		SubLObject template_topic = NIL;
		SubLObject result_set = NIL;
		SubLObject xml_string = NIL;
		SubLObject non_editables = NIL;
		if (((NIL != use_topic_defining_mt_when_passed_everything_pscP()) && (NIL != forts.fort_p(topic))) && $$EverythingPSC.eql(template_elmt)) {
			final SubLObject topic_defining_mt = kb_accessors.defining_mt(topic);
			if (NIL != topic_defining_mt) {
				template_elmt = topic_defining_mt;
				everything_psc_dwimmed_awayP = T;
			}
		}
		template_elmt = hlmt_czer.coerce_to_hlmt(template_elmt);
		assertions_elmt = hlmt_czer.coerce_to_hlmt(assertions_elmt);
		final SubLObject _prev_bind_0 = $everything_psc_dwimmed_awayP$.currentBinding(thread);
		try {
			$everything_psc_dwimmed_awayP$.bind(everything_psc_dwimmed_awayP, thread);
			thread.resetMultipleValues();
			final SubLObject _prev_bind_0_$179 = formula_template_vars.$template_topic_problem_store$.currentBinding(thread);
			try {
				formula_template_vars.$template_topic_problem_store$.bind(formula_template_vars.find_or_create_template_topic_problem_store(), thread);
				final SubLObject reusedP = thread.secondMultipleValue();
				thread.resetMultipleValues();
				try {
					final SubLObject _prev_bind_0_$180 = formula_template_vars.$default_assertion_template_elmt$.currentBinding(thread);
					try {
						formula_template_vars.$default_assertion_template_elmt$.bind(assertions_elmt, thread);
						final SubLObject local_state = formula_template_vars.get_template_topic_memoization_state();
						final SubLObject _prev_bind_0_$181 = memoization_state.$memoization_state$.currentBinding(thread);
						try {
							memoization_state.$memoization_state$.bind(local_state, thread);
							final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
							try {
								template_topic = formula_template_load_template_graph_memoized(topic, template_elmt);
							} finally {
								final SubLObject _prev_bind_0_$182 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									final SubLObject _values = getValuesAsVector();
									memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
									restoreValuesFromVector(_values);
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$182, thread);
								}
							}
						} finally {
							memoization_state.$memoization_state$.rebind(_prev_bind_0_$181, thread);
						}
						thread.resetMultipleValues();
						final SubLObject result_set_$183 = formula_templates.get_editable_and_non_editable_assertions_for_template_topic_instance(match, template_topic, template_elmt);
						final SubLObject non_editables_$184 = thread.secondMultipleValue();
						thread.resetMultipleValues();
						result_set = result_set_$183;
						non_editables = non_editables_$184;
					} finally {
						formula_template_vars.$default_assertion_template_elmt$.rebind(_prev_bind_0_$180, thread);
					}
					SubLObject stream = NIL;
					try {
						stream = make_private_string_output_stream();
						final SubLObject _prev_bind_0_$183 = xml_vars.$xml_stream$.currentBinding(thread);
						try {
							xml_vars.$xml_stream$.bind(stream, thread);
							xml_utilities.generate_valid_xml_header(stream);
							xml_utilities.generate_xml_header_entry_for_dtd($$$knownAssertionsForTemplateTopic, $str319$http___www_opencyc_org_xml_knownA, stream);
							xml_utilities.xml_terpri();
							final SubLObject _prev_bind_0_$184 = formula_templates.$non_editable_assertions_for_template_topic_instance$.currentBinding(thread);
							try {
								formula_templates.$non_editable_assertions_for_template_topic_instance$.bind(non_editables, thread);
								assert NIL != set.set_p(non_editables) : "set.set_p(non_editables) " + "CommonSymbols.NIL != set.set_p(non_editables) " + non_editables;
								formula_templates.xml_serialize_assertions_for_template_topic_instance(match, template_topic, template_elmt, assertions_elmt, result_set, UNPROVIDED);
							} finally {
								formula_templates.$non_editable_assertions_for_template_topic_instance$.rebind(_prev_bind_0_$184, thread);
							}
						} finally {
							xml_vars.$xml_stream$.rebind(_prev_bind_0_$183, thread);
						}
						xml_string = get_output_stream_string(stream);
					} finally {
						final SubLObject _prev_bind_0_$185 = $is_thread_performing_cleanupP$.currentBinding(thread);
						try {
							$is_thread_performing_cleanupP$.bind(T, thread);
							final SubLObject _values2 = getValuesAsVector();
							close(stream, UNPROVIDED);
							restoreValuesFromVector(_values2);
						} finally {
							$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$185, thread);
						}
					}
				} finally {
					final SubLObject _prev_bind_0_$186 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values3 = getValuesAsVector();
						if ((NIL == reusedP) && (NIL == formula_template_vars.template_topic_problem_store_has_browsable_inferenceP())) {
							formula_template_vars.destroy_template_topic_problem_store(UNPROVIDED);
						}
						restoreValuesFromVector(_values3);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$186, thread);
					}
				}
			} finally {
				formula_template_vars.$template_topic_problem_store$.rebind(_prev_bind_0_$179, thread);
			}
		} finally {
			$everything_psc_dwimmed_awayP$.rebind(_prev_bind_0, thread);
		}
		if (NIL != html_state) {
			final SubLObject state_var = html_kernel.html_machine_state(html_state);
			final SubLObject lock_var = html_kernel.html_machine_state_lock(state_var);
			SubLObject v_variables = NIL;
			SubLObject values = NIL;
			SubLObject release = NIL;
			try {
				release = seize_lock(lock_var);
				v_variables = html_kernel.html_machine_state_variables(state_var);
				values = html_kernel.html_machine_state_values(state_var);
			} finally {
				if (NIL != release) {
					release_lock(lock_var);
				}
			}
			final SubLObject cprogv_var = v_variables;
			final ArrayList old_values = extract_dynamic_values(cprogv_var);
			try {
				bind_dynamic_vars(cprogv_var, values);
				if (NIL != constantp(match, UNPROVIDED)) {
					cb_tools.cb_add_to_constant_history(match);
				} else {
					cb_tools.cb_add_to_nat_history(match);
				}
				html_kernel.snapshot_html_state(state_var);
			} finally {
				rebind_dynamic_vars(cprogv_var, old_values);
			}
		}
		return xml_string;
	}

	public static SubLObject formula_template_load_template_graph_memoized_internal(final SubLObject topic, final SubLObject elmt) {
		return formula_templates.formula_template_load_template_graph(topic, elmt);
	}

	public static SubLObject formula_template_load_template_graph_memoized(final SubLObject topic, final SubLObject elmt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return formula_template_load_template_graph_memoized_internal(topic, elmt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FORMULA_TEMPLATE_LOAD_TEMPLATE_GRAPH_MEMOIZED, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FORMULA_TEMPLATE_LOAD_TEMPLATE_GRAPH_MEMOIZED, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, FORMULA_TEMPLATE_LOAD_TEMPLATE_GRAPH_MEMOIZED, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_2(topic, elmt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (topic.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (((NIL != cached_args) && (NIL == cached_args.rest())) && elmt.equal(cached_args.first())) {
						return memoization_state.caching_results(results2);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(formula_template_load_template_graph_memoized_internal(topic, elmt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(topic, elmt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject assert_candidate_replacements_for_position(final SubLObject ftemplate_id, final SubLObject formula_arg_pos, final SubLObject set_or_collection, final SubLObject assert_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject successP = NIL;
		SubLObject message = NIL;
		final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules($$QueryLibrary_QuerySavingTemplate), thread);
			thread.resetMultipleValues();
			final SubLObject succP = rkf_assertion_utilities.rkf_assert(list($$candidateReplacementForPosition, ftemplate_id, formula_arg_pos, set_or_collection), assert_mt, UNPROVIDED, UNPROVIDED);
			final SubLObject mess = thread.secondMultipleValue();
			thread.resetMultipleValues();
			successP = succP;
			message = mess;
		} finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		}
		return values(successP, message);
	}

	public static SubLObject create_minimal_formula_template_with_query(final SubLObject ftemplate_id, final SubLObject cycl_query_id, final SubLObject ql_id, final SubLObject sentence, SubLObject assert_mt, SubLObject inference_mt, final SubLObject gloss) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_utilities.fort_or_naut_p(ftemplate_id) : "cycl_utilities.fort_or_naut_p(ftemplate_id) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(ftemplate_id) " + ftemplate_id;
		assert NIL != cycl_utilities.fort_or_naut_p(cycl_query_id) : "cycl_utilities.fort_or_naut_p(cycl_query_id) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(cycl_query_id) " + cycl_query_id;
		if (((NIL != ql_id) && (!assertionsDisabledSynth)) && (NIL == cycl_utilities.fort_or_naut_p(ql_id))) {
			throw new AssertionError(ql_id);
		}
		assert NIL != el_formula_p(sentence) : "el_utilities.el_formula_p(sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(sentence) " + sentence;
		assert NIL != hlmt.possibly_hlmt_p(assert_mt) : "hlmt.possibly_hlmt_p(assert_mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(assert_mt) " + assert_mt;
		assert NIL != hlmt.possibly_hlmt_p(inference_mt) : "hlmt.possibly_hlmt_p(inference_mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(inference_mt) " + inference_mt;
		assert NIL != stringp(gloss) : "Types.stringp(gloss) " + "CommonSymbols.NIL != Types.stringp(gloss) " + gloss;
		assert_mt = hlmt_czer.coerce_to_hlmt(assert_mt);
		inference_mt = hlmt_czer.coerce_to_hlmt(inference_mt);
		SubLObject conjuncts = list(list($$formulaTemplateGloss, ftemplate_id, gloss), kb_query.kbq_assertible_query_spec_sentence(sentence, cycl_query_id), list($const327$microtheoryParameterValueInSpecif, inference_mt, cycl_query_id), list($$comment, cycl_query_id, gloss));
		SubLObject successP = NIL;
		SubLObject message = NIL;
		if (NIL != ql_id) {
			conjuncts = cons(list($$folderContainsResource, ql_id, ftemplate_id), conjuncts);
		}
		conjuncts = cons(list($const327$microtheoryParameterValueInSpecif, inference_mt, cycl_query_id), conjuncts);
		final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules($$QueryLibrary_QuerySavingTemplate), thread);
			thread.resetMultipleValues();
			final SubLObject successP_$189 = rkf_assertion_utilities.rkf_assert_now(simplifier.conjoin(conjuncts, UNPROVIDED), assert_mt);
			final SubLObject message_$190 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			successP = successP_$189;
			message = message_$190;
		} finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		}
		return values(successP, NIL != successP ? $str329$All_KB_Operations_completed_succe : message);
	}

	public static SubLObject create_minimal_formula_template_with_query_include_inference(final SubLObject ftemplate_id, final SubLObject cycl_query_id, final SubLObject ql_id, final SubLObject sentence, final SubLObject assert_mt, final SubLObject inference_mt, final SubLObject gloss, final SubLObject v_inference_parameters) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject successP = NIL;
		SubLObject message = NIL;
		SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules($$QueryLibrary_QuerySavingTemplate), thread);
			thread.resetMultipleValues();
			final SubLObject successP_$191 = create_minimal_formula_template_with_query(ftemplate_id, cycl_query_id, ql_id, sentence, assert_mt, inference_mt, gloss);
			final SubLObject message_$192 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			successP = successP_$191;
			message = message_$192;
		} finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		}
		if (NIL != successP) {
			_prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
			try {
				kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules($$QueryLibrary_QuerySavingTemplate), thread);
				kb_query.kbq_assert_query_spec_inference_parameters(cycl_query_id, v_inference_parameters, assert_mt);
			} finally {
				kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
			}
		}
		return values(successP, message);
	}

	public static SubLObject assert_updated_inference_parameters_for_query(final SubLObject cycl_query_id, final SubLObject v_inference_parameters, final SubLObject inference_mt) {
		kb_query.kbq_assert_query_spec_inference_parameters(cycl_query_id, v_inference_parameters, inference_mt);
		return NIL;
	}

	public static SubLObject get_forward_rules_for_query(final SubLObject query) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject assertions = NIL;
		SubLObject term_list = NIL;
		SubLObject v_term = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			if (query.isList()) {
				SubLObject cdolist_list_var = query;
				SubLObject each_part = NIL;
				each_part = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					if (each_part.isList() && (NIL != narts_high.find_nart(each_part))) {
						final SubLObject item_var = each_part;
						if (NIL == member(item_var, term_list, symbol_function(EQL), symbol_function(IDENTITY))) {
							term_list = cons(item_var, term_list);
						}
					}
					cdolist_list_var = cdolist_list_var.rest();
					each_part = cdolist_list_var.first();
				}
				if (NIL == member(query, term_list, symbol_function(EQL), symbol_function(IDENTITY))) {
					term_list = cons(query, term_list);
				}
			}
			if (!query.isList()) {
				term_list = cons(query, term_list);
			}
			SubLObject cdolist_list_var = term_list;
			SubLObject each_nart = NIL;
			each_nart = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (each_nart.isList()) {
					v_term = narts_high.find_nart(each_nart);
				} else {
					v_term = each_nart;
				}
				if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
					final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
					SubLObject done_var = NIL;
					final SubLObject token_var = NIL;
					while (NIL == done_var) {
						final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
						final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
						if (NIL != valid) {
							SubLObject final_index_iterator = NIL;
							try {
								final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
								SubLObject done_var_$193 = NIL;
								final SubLObject token_var_$194 = NIL;
								while (NIL == done_var_$193) {
									final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$194);
									final SubLObject valid_$195 = makeBoolean(!token_var_$194.eql(ass));
									if (((NIL != valid_$195) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) && (NIL != assertions_high.deduced_assertionP(ass))) {
										SubLObject cdolist_list_var_$196 = assertions_high.assertion_arguments(ass);
										SubLObject argument = NIL;
										argument = cdolist_list_var_$196.first();
										while (NIL != cdolist_list_var_$196) {
											if (NIL != deduction_handles.deduction_p(argument)) {
												SubLObject cdolist_list_var_$197 = deductions_high.deduction_supports(argument);
												SubLObject support = NIL;
												support = cdolist_list_var_$197.first();
												while (NIL != cdolist_list_var_$197) {
													if ((NIL != assertion_handles.assertion_p(support)) && (NIL == assertions_low.assertion_gaf_p(support))) {
														final SubLObject item_var2 = support;
														if (NIL == member(item_var2, assertions, symbol_function(EQL), symbol_function(IDENTITY))) {
															assertions = cons(item_var2, assertions);
														}
													}
													cdolist_list_var_$197 = cdolist_list_var_$197.rest();
													support = cdolist_list_var_$197.first();
												}
											}
											cdolist_list_var_$196 = cdolist_list_var_$196.rest();
											argument = cdolist_list_var_$196.first();
										}
									}
									done_var_$193 = makeBoolean(NIL == valid_$195);
								}
							} finally {
								final SubLObject _prev_bind_0_$198 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									final SubLObject _values = getValuesAsVector();
									if (NIL != final_index_iterator) {
										kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
									}
									restoreValuesFromVector(_values);
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$198, thread);
								}
							}
						}
						done_var = makeBoolean(NIL == valid);
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				each_nart = cdolist_list_var.first();
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return assertions;
	}

	public static SubLObject do_query_template_allowed_rules(final SubLObject query) {
		final SubLObject rules = get_forward_rules_for_query(query);
		assert_creation_template_allowable_rules_for_query(rules, $$QueryLibrary_QuerySavingTemplate, $const332$QueryLibraryQueryCreationTemplate);
		return NIL;
	}

	public static SubLObject assert_creation_template_allowable_rules_for_query(final SubLObject allowed_rules, final SubLObject creation_template, final SubLObject mt) {
		assert NIL != listp(allowed_rules) : "Types.listp(allowed_rules) " + "CommonSymbols.NIL != Types.listp(allowed_rules) " + allowed_rules;
		SubLObject creation_template_allowed_rules_list = NIL;
		SubLObject cdolist_list_var = allowed_rules;
		SubLObject rule = NIL;
		rule = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject rule_mt = assertions_high.assertion_mt(rule);
			final SubLObject rule_sentence = assertions_high.assertion_formula(rule);
			creation_template_allowed_rules_list = cons(list($$creationTemplateAllowableRules, creation_template, list($$ist, rule_mt, rule_sentence)), creation_template_allowed_rules_list);
			cdolist_list_var = cdolist_list_var.rest();
			rule = cdolist_list_var.first();
		}
		make_multiple_assertions_to_mt(creation_template_allowed_rules_list, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject combine_query_properties(final SubLObject first_query_properties, final SubLObject second_query_properties) {
		final SubLObject combined_query_properties = inference_parameters.inference_merge_query_properties(first_query_properties, second_query_properties);
		return combined_query_properties;
	}

	public static SubLObject edit_query_gloss(final SubLObject ftemplate_id, final SubLObject old_gloss, final SubLObject new_gloss, SubLObject mt) {
		assert NIL != cycl_utilities.fort_or_naut_p(ftemplate_id) : "cycl_utilities.fort_or_naut_p(ftemplate_id) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(ftemplate_id) " + ftemplate_id;
		assert NIL != stringp(old_gloss) : "Types.stringp(old_gloss) " + "CommonSymbols.NIL != Types.stringp(old_gloss) " + old_gloss;
		assert NIL != stringp(new_gloss) : "Types.stringp(new_gloss) " + "CommonSymbols.NIL != Types.stringp(new_gloss) " + new_gloss;
		assert NIL != hlmt.possibly_hlmt_p(mt) : "hlmt.possibly_hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_hlmt_p(mt) " + mt;
		mt = hlmt_czer.coerce_to_hlmt(mt);
		final SubLObject old_gloss_cycl = list($$formulaTemplateGloss, ftemplate_id, old_gloss);
		final SubLObject new_gloss_cycl = list($$formulaTemplateGloss, ftemplate_id, new_gloss);
		final SubLObject monadic_mt = hlmt.hlmt_monad_mt(mt);
		final SubLObject time_parameter = $$TimePoint;
		final SubLObject old_gloss_assertions = current_assertions_with_cycl(old_gloss_cycl, monadic_mt, time_parameter);
		final SubLObject new_gloss_starting_time;
		final SubLObject now = new_gloss_starting_time = date_utilities.indexical_now();
		final SubLObject new_gloss_mt = list($$MtSpace, monadic_mt, list($$MtTimeWithGranularityDimFn, list($$IntervalStartedByFn, new_gloss_starting_time), time_parameter));
		SubLObject complete_successP = T;
		SubLObject messages = NIL;
		SubLObject cdolist_list_var = old_gloss_assertions;
		SubLObject old_gloss_assertion = NIL;
		old_gloss_assertion = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject this_result = temporally_qualify_assertion_to_end_now(old_gloss_assertion, time_parameter);
			if (NIL == this_result) {
				complete_successP = NIL;
				messages = cons(format(NIL, $str340$Failed_to_temporally_qualify__S__, old_gloss_assertion), messages);
			}
			cdolist_list_var = cdolist_list_var.rest();
			old_gloss_assertion = cdolist_list_var.first();
		}
		if ((NIL == backward.removal_ask(new_gloss_cycl, new_gloss_mt, UNPROVIDED, UNPROVIDED)) && (NIL == assert_new_query_gloss(new_gloss_cycl, new_gloss_mt))) {
			complete_successP = NIL;
			messages = cons(format(NIL, $str341$Failed_to_assert_new_gloss__A__A_, new_gloss_cycl, new_gloss_mt), messages);
		}
		final SubLObject subLObject = complete_successP;
		return values(subLObject, NIL != subLObject ? $str342$Gloss_edit_completed_successfully : messages);
	}

	public static SubLObject assert_new_query_gloss(final SubLObject new_gloss_cycl, final SubLObject new_gloss_mt) {
		final SubLObject result = ke.ke_assert_now(new_gloss_cycl, new_gloss_mt, UNPROVIDED, UNPROVIDED);
		mail_about_gloss_edit(new_gloss_cycl, new_gloss_mt, result);
		return result;
	}

	public static SubLObject mail_about_gloss_edit(final SubLObject new_gloss_cycl, final SubLObject new_gloss_mt, final SubLObject successP) {
		return T;
	}

	public static SubLObject temporally_qualify_assertion_to_end_now(final SubLObject assertion, SubLObject time_param) {
		if (time_param == UNPROVIDED) {
			time_param = $$TimePoint;
		}
		final SubLObject now = date_utilities.indexical_now();
		final SubLObject cycl = assertions_high.assertion_formula(assertion);
		final SubLObject mt = assertions_high.assertion_mt(assertion);
		final SubLObject monad_mt = hlmt.hlmt_monad_mt(mt);
		final SubLObject starting_time = assertion_starting_time(assertion);
		final SubLObject ending_time = now;
		final SubLObject new_mt = (NIL != date_utilities.beginning_of_timeP(starting_time)) ? list($$MtSpace, monad_mt, list($$MtTimeWithGranularityDimFn, list($$IntervalEndedByFn_Inclusive, ending_time), time_param)) : list($$MtSpace, monad_mt, list($$MtTimeWithGranularityDimFn, list($$TimeIntervalInclusiveFn, starting_time, ending_time), time_param));
		return ke.ke_edit_assertion(assertion, cycl, new_mt, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject current_assertions_with_cycl(final SubLObject cycl, final SubLObject monad_mt, SubLObject time_parameter) {
		if (time_parameter == UNPROVIDED) {
			time_parameter = $$TimePoint;
		}
		final SubLObject answers = ask_utilities.query_justified(cycl, list($$MtSpace, monad_mt, list($$MtTimeWithGranularityDimFn, $$Now, time_parameter)), UNPROVIDED);
		SubLObject qualifying_assertions = NIL;
		SubLObject cdolist_list_var = answers;
		SubLObject v_answer = NIL;
		v_answer = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = v_answer;
			SubLObject binding = NIL;
			SubLObject supports = NIL;
			destructuring_bind_must_consp(current, datum, $list346);
			binding = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list346);
			supports = current.first();
			current = current.rest();
			if (NIL == current) {
				SubLObject cdolist_list_var_$199 = supports;
				SubLObject support = NIL;
				support = cdolist_list_var_$199.first();
				while (NIL != cdolist_list_var_$199) {
					if (NIL != assertion_handles.assertion_p(support)) {
						qualifying_assertions = cons(support, qualifying_assertions);
					}
					cdolist_list_var_$199 = cdolist_list_var_$199.rest();
					support = cdolist_list_var_$199.first();
				}
			} else {
				cdestructuring_bind_error(datum, $list346);
			}
			cdolist_list_var = cdolist_list_var.rest();
			v_answer = cdolist_list_var.first();
		}
		return qualifying_assertions;
	}

	public static SubLObject assertion_starting_time(final SubLObject v_assert) {
		final SubLObject mt = assertions_high.assertion_mt(v_assert);
		final SubLObject mt_start = mt_starting_time(mt, UNPROVIDED);
		if (NIL != mt_start) {
			return mt_start;
		}
		final SubLObject assertion_time = assertion_utilities.assertion_universal_time(v_assert);
		if (NIL != numeric_date_utilities.universal_time_p(assertion_time)) {
			return date_utilities.universal_time_to_cycl_date(assertion_time);
		}
		return date_utilities.indexical_now();
	}

	public static SubLObject mt_starting_time(final SubLObject mt, SubLObject v_default) {
		if (v_default == UNPROVIDED) {
			v_default = NIL;
		}
		final SubLObject mt_time = hlmt.extract_hlmt_temporal_index(mt);
		final SubLObject initial_second = time_interval_utilities.cycl_interval_initial_second(mt_time);
		return NIL != initial_second ? initial_second : time_interval_utilities.cycl_interval_initial_second(v_default);
	}

	public static SubLObject create_new_formula_template_with_query() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject successP = NIL;
		SubLObject message = NIL;
		SubLObject new_query = NIL;
		SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules($$QueryLibrary_QuerySavingTemplate), thread);
			final SubLObject temp_new_query = new_query = rkf_term_utilities.rkf_create(glf_api_widgets.generic_suggest_new_name_for_component($$$ClonedQuery), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			thread.resetMultipleValues();
			final SubLObject succP = rkf_assertion_utilities.rkf_assert_now(listS($$isa, new_query, $list349), $$UniversalVocabularyMt);
			final SubLObject mess = thread.secondMultipleValue();
			thread.resetMultipleValues();
			successP = succP;
			message = mess;
		} finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		}
		if (NIL == successP) {
			return values(NIL, message);
		}
		_prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules($$QueryLibrary_QuerySavingTemplate), thread);
			thread.resetMultipleValues();
			final SubLObject succP2 = rkf_assertion_utilities.rkf_assert_now(listS($$quotedIsa, list($$TestQueryFn, new_query), $list353), $$UniversalVocabularyMt);
			final SubLObject mess2 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			successP = succP2;
			message = mess2;
		} finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		}
		if (NIL == successP) {
			return values(NIL, message);
		}
		_prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules($$QueryLibrary_QuerySavingTemplate), thread);
			thread.resetMultipleValues();
			final SubLObject succP2 = rkf_assertion_utilities.rkf_assert_now(listS($$isa, list($$TemplateFromTestQueryFn, list($$TestQueryFn, new_query)), $list355), $$UniversalVocabularyMt);
			final SubLObject mess2 = thread.secondMultipleValue();
			thread.resetMultipleValues();
			successP = succP2;
			message = mess2;
		} finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		}
		if (NIL == successP) {
			return values(NIL, message);
		}
		return values(list($$TemplateFromTestQueryFn, list($$TestQueryFn, new_query)), $str329$All_KB_Operations_completed_succe);
	}

	public static SubLObject make_multiple_assertions_to_mt(final SubLObject sentences, SubLObject mt, SubLObject should_block, SubLObject strength, SubLObject direction, SubLObject assume_wffP) {
		if (should_block == UNPROVIDED) {
			should_block = NIL;
		}
		if (strength == UNPROVIDED) {
			strength = $DEFAULT;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		if (assume_wffP == UNPROVIDED) {
			assume_wffP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != listp(sentences) : "Types.listp(sentences) " + "CommonSymbols.NIL != Types.listp(sentences) " + sentences;
		mt = hlmt_czer.coerce_to_hlmt(mt);
		SubLObject cdolist_list_var = sentences;
		SubLObject sentence = NIL;
		sentence = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (NIL != should_block) {
				if ((NIL != assume_wffP) || (NIL != wff.el_wff_assertibleP(sentence, mt, UNPROVIDED))) {
					final SubLObject fn = (NIL != assume_wffP) ? API_WIDGETS_ASSERT_WFF_NOW : KE_ASSERT_NOW;
					thread.resetMultipleValues();
					final SubLObject assertion_result = funcall(fn, sentence, mt, strength, direction);
					final SubLObject assertion_error = thread.secondMultipleValue();
					thread.resetMultipleValues();
					if (NIL != assertion_error) {
						Errors.error($str359$Error_asserting_sentence___A__Got, sentence, assertion_error);
					}
				} else {
					Errors.error($str360$Got_bad_CycL_sentence___A__becaus, sentence, wff.explanation_of_why_not_wff_assert(sentence, mt, UNPROVIDED));
				}
			} else if (NIL != assume_wffP) {
				final SubLObject _prev_bind_0 = forward.$assume_forward_deduction_is_wfP$.currentBinding(thread);
				try {
					forward.$assume_forward_deduction_is_wfP$.bind(T, thread);
					cyc_kernel.cyc_assert_wff(sentence, mt, list($STRENGTH, strength, $DIRECTION, direction));
				} finally {
					forward.$assume_forward_deduction_is_wfP$.rebind(_prev_bind_0, thread);
				}
			} else {
				ke.ke_assert(sentence, mt, strength, direction);
			}

			cdolist_list_var = cdolist_list_var.rest();
			sentence = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject api_widgets_assert_wff_now(final SubLObject sentence, final SubLObject mt, final SubLObject strength, final SubLObject direction) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = forward.$assume_forward_deduction_is_wfP$.currentBinding(thread);
		try {
			forward.$assume_forward_deduction_is_wfP$.bind(T, thread);
			return ke.ke_assert_wff_now(sentence, mt, strength, direction);
		} finally {
			forward.$assume_forward_deduction_is_wfP$.rebind(_prev_bind_0, thread);
		}
	}

	public static SubLObject make_multiple_assertions_to_mt_with_creation_template(final SubLObject sentences, final SubLObject mt, final SubLObject template, SubLObject should_blockP, SubLObject strength, SubLObject direction, SubLObject assume_wffP) {
		if (should_blockP == UNPROVIDED) {
			should_blockP = NIL;
		}
		if (strength == UNPROVIDED) {
			strength = $DEFAULT;
		}
		if (direction == UNPROVIDED) {
			direction = NIL;
		}
		if (assume_wffP == UNPROVIDED) {
			assume_wffP = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules(template), thread);
			make_multiple_assertions_to_mt(sentences, mt, should_blockP, strength, direction, assume_wffP);
		} finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		}
		return NIL;
	}

	public static SubLObject mail_to_user(final SubLObject user_fort, final SubLObject content, final SubLObject subject) {
		return format(NIL, $str366$Unable_to_find_address_for__A, user_fort);
	}

	public static SubLObject mail_to_user_with_content_type(final SubLObject user_fort, final SubLObject content, final SubLObject subject, final SubLObject content_type) {
		return format(NIL, $str366$Unable_to_find_address_for__A, user_fort);
	}

	public static SubLObject cyclist_defined_instances_of_col(final SubLObject col, final SubLObject cyclist, SubLObject mt, SubLObject seed_coltype, SubLObject cutoff) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (seed_coltype == UNPROVIDED) {
			seed_coltype = NIL;
		}
		if (cutoff == UNPROVIDED) {
			cutoff = $int$75;
		}
		assert NIL != integerp(cutoff) : "Types.integerp(cutoff) " + "CommonSymbols.NIL != Types.integerp(cutoff) " + cutoff;
		SubLObject result = isa.all_instances_among(col, cyclist_recent_terms(cyclist), mt, UNPROVIDED);
		result = nreverse(result);
		if (!length(result).numG(cutoff)) {
			result = cconcatenate(result, set_difference(isa.all_instances_among(col, isa.all_fort_instances(seed_coltype, mt, UNPROVIDED), mt, UNPROVIDED), result, UNPROVIDED, UNPROVIDED));
		}
		if (!length(result).numG(cutoff)) {
			result = cconcatenate(result, set_difference(isa.all_fort_instances(col, mt, UNPROVIDED), result, UNPROVIDED, UNPROVIDED));
		}
		if (length(result).numG(cutoff)) {
			result = list_utilities.first_n(cutoff, result);
		}
		return result;
	}

	public static SubLObject cyclist_defined_specs_of_col(final SubLObject col, final SubLObject cyclist, SubLObject mt, SubLObject seed_coltype, SubLObject cutoff) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		if (seed_coltype == UNPROVIDED) {
			seed_coltype = NIL;
		}
		if (cutoff == UNPROVIDED) {
			cutoff = $int$75;
		}
		assert NIL != integerp(cutoff) : "Types.integerp(cutoff) " + "CommonSymbols.NIL != Types.integerp(cutoff) " + cutoff;
		SubLObject result = genls.all_specs_among(col, cyclist_recent_terms(cyclist), mt, UNPROVIDED);
		result = nreverse(result);
		if (!length(result).numG(cutoff)) {
			result = cconcatenate(result, set_difference(genls.all_specs_among(col, isa.all_fort_instances(seed_coltype, mt, UNPROVIDED), mt, UNPROVIDED), result, UNPROVIDED, UNPROVIDED));
		}
		if (!length(result).numG(cutoff)) {
			result = cconcatenate(result, set_difference(genls.all_specs(col, mt, UNPROVIDED), result, UNPROVIDED, UNPROVIDED));
		}
		if (length(result).numG(cutoff)) {
			result = list_utilities.first_n(cutoff, result);
		}
		return result;
	}

	public static SubLObject get_template_topic_in_xml(SubLObject topic, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_utilities.fort_or_naut_p(topic) : "cycl_utilities.fort_or_naut_p(topic) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(topic) " + topic;
		assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
		topic = czer_main.coerce_to_fort(topic);
		mt = hlmt_czer.coerce_to_hlmt(mt);
		if (mt.eql($$InferencePSC)) {
			final SubLObject defining_mt = kb_mapping_utilities.fpred_value_in_any_mt(topic, $$definingMt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			if (NIL != defining_mt) {
				mt = hlmt_czer.coerce_to_hlmt(defining_mt);
			}
		}
		SubLObject template_topic = NIL;
		SubLObject xml_string = NIL;
		final SubLObject _prev_bind_0 = formula_template_vars.$default_assertion_template_elmt$.currentBinding(thread);
		try {
			formula_template_vars.$default_assertion_template_elmt$.bind(mt, thread);
			final SubLObject local_state = formula_template_vars.get_template_topic_memoization_state();
			final SubLObject _prev_bind_0_$200 = memoization_state.$memoization_state$.currentBinding(thread);
			try {
				memoization_state.$memoization_state$.bind(local_state, thread);
				final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
				try {
					template_topic = formula_template_load_template_graph_memoized(topic, mt);
				} finally {
					final SubLObject _prev_bind_0_$201 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values = getValuesAsVector();
						memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
						restoreValuesFromVector(_values);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
					}
				}
			} finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0_$200, thread);
			}
		} finally {
			formula_template_vars.$default_assertion_template_elmt$.rebind(_prev_bind_0, thread);
		}
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
			try {
				xml_vars.$xml_stream$.bind(stream, thread);
				xml_utilities.generate_valid_xml_header(stream);
				xml_utilities.generate_xml_header_entry_for_dtd($$$templateTopic, $str374$http___www_opencyc_org_xml_templa, stream);
				xml_utilities.xml_terpri();
				formula_templates.xml_serialize_template_topic(template_topic, stream);
			} finally {
				xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
			}
			xml_string = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values2 = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values2);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
			}
		}
		return xml_string;
	}

	public static SubLObject get_formula_template_in_xml(SubLObject formula_template_id, SubLObject mt, SubLObject topic_id) {
		if (topic_id == UNPROVIDED) {
			topic_id = NIL;
		}
		assert NIL != cycl_utilities.fort_or_naut_p(formula_template_id) : "cycl_utilities.fort_or_naut_p(formula_template_id) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(formula_template_id) " + formula_template_id;
		assert NIL != hlmt.possibly_mt_p(mt) : "hlmt.possibly_mt_p(mt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(mt) " + mt;
		formula_template_id = czer_main.coerce_to_fort(formula_template_id);
		mt = hlmt_czer.coerce_to_hlmt(mt);
		assert NIL != forts.fort_p(formula_template_id) : "forts.fort_p(formula_template_id) " + "CommonSymbols.NIL != forts.fort_p(formula_template_id) " + formula_template_id;
		final SubLObject formula_template = get_formula_template_from_id(formula_template_id, mt, topic_id);
		SubLObject xml_string = NIL;
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			write_formula_template_in_xml(formula_template, stream);
			xml_string = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
				bind($is_thread_performing_cleanupP$, T);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		}
		return xml_string;
	}

	public static SubLObject get_formula_template_from_id(final SubLObject formula_template_id, final SubLObject mt, SubLObject topic_id) {
		if (topic_id == UNPROVIDED) {
			topic_id = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject formula_template = formula_templates.new_formula_template(formula_template_id, UNPROVIDED);
		final SubLObject _prev_bind_0 = formula_template_vars.$default_assertion_template_elmt$.currentBinding(thread);
		try {
			formula_template_vars.$default_assertion_template_elmt$.bind(mt, thread);
			formula_templates.formula_template_load_topic_template_details(topic_id, formula_template, mt);
		} finally {
			formula_template_vars.$default_assertion_template_elmt$.rebind(_prev_bind_0, thread);
		}
		return formula_template;
	}

	public static SubLObject write_formula_template_in_xml(final SubLObject formula_template, final SubLObject stream) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
		try {
			xml_vars.$xml_stream$.bind(stream, thread);
			xml_utilities.generate_valid_xml_header(stream);
			xml_utilities.generate_xml_header_entry_for_dtd($$$formulaTemplate, formula_templates.formula_template_dtd_uri(), stream);
			xml_utilities.xml_terpri();
			formula_templates.xml_serialize_formula_template(formula_template, stream);
		} finally {
			xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
		}
		return stream;
	}

	public static SubLObject suggest_loading_mt_for_cycl_query(final SubLObject cycl_query_id) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject assertions = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			assertions = kb_mapping.gather_gaf_arg_index(cycl_query_id, THREE_INTEGER, $const377$softwareParameterValueInSpecifica, UNPROVIDED, UNPROVIDED);
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		if (NIL != assertions) {
			return assertions_high.assertion_mt(assertions.first());
		}
		return $$KEInteractionResourceTestMt;
	}

	public static SubLObject get_cycl_query_in_xml_from_default_mt(final SubLObject cycl_query_id) {
		assert NIL != cycl_utilities.fort_or_naut_p(cycl_query_id) : "cycl_utilities.fort_or_naut_p(cycl_query_id) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(cycl_query_id) " + cycl_query_id;
		return get_cycl_query_in_xml(cycl_query_id, UNPROVIDED);
	}

	public static SubLObject get_cycl_query_in_xml(SubLObject cycl_query_id, SubLObject mt) {
		if (mt == UNPROVIDED) {
			mt = NIL;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_utilities.fort_or_naut_p(cycl_query_id) : "cycl_utilities.fort_or_naut_p(cycl_query_id) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(cycl_query_id) " + cycl_query_id;
		cycl_query_id = czer_main.coerce_to_fort(cycl_query_id);
		SubLObject cycl_query = NIL;
		SubLObject xml_string = NIL;
		final SubLObject _prev_bind_0 = formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.currentBinding(thread);
		try {
			formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.bind(formula_template_vars.$use_formula_template_candidate_replacements_auto_expand$.getGlobalValue(), thread);
			cycl_query = new_cycl_query_specification.load_new_cycl_query_specification_from_kb(cycl_query_id, UNPROVIDED);
		} finally {
			formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.rebind(_prev_bind_0, thread);
		}
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			final SubLObject _prev_bind_2 = xml_vars.$xml_stream$.currentBinding(thread);
			try {
				xml_vars.$xml_stream$.bind(stream, thread);
				xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
				if (NIL == misc_utilities.initialized_p(xml_vars.cycl_query_namespace())) {
					xml_utilities.generate_xml_header_entry_for_dtd($$$cyclQuery, $str382$http___www_opencyc_org_xml_cyclQu, UNPROVIDED);
					xml_utilities.xml_terpri();
				}
				new_cycl_query_specification.xml_serialize_new_cycl_query_specification(cycl_query, UNPROVIDED);
			} finally {
				xml_vars.$xml_stream$.rebind(_prev_bind_2, thread);
			}
			xml_string = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
			}
		}
		return xml_string;
	}

	public static SubLObject get_formula_template_for_fact_or_query_in_xml_from_default_mt(final SubLObject template_id) {
		assert NIL != cycl_utilities.fort_or_naut_p(template_id) : "cycl_utilities.fort_or_naut_p(template_id) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(template_id) " + template_id;
		final SubLObject mt = $$KEInteractionResourceTestMt;
		return get_formula_template_for_fact_or_query_in_xml(template_id, mt);
	}

	public static SubLObject get_formula_template_for_fact_or_query_in_xml(SubLObject template_id, SubLObject elmt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != cycl_utilities.fort_or_naut_p(template_id) : "cycl_utilities.fort_or_naut_p(template_id) " + "CommonSymbols.NIL != cycl_utilities.fort_or_naut_p(template_id) " + template_id;
		assert NIL != hlmt.possibly_mt_p(elmt) : "hlmt.possibly_mt_p(elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(elmt) " + elmt;
		template_id = czer_main.coerce_to_fort(template_id);
		elmt = hlmt_czer.coerce_to_hlmt(elmt);
		SubLObject formula_template = NIL;
		SubLObject xml_string = NIL;
		final SubLObject _prev_bind_0 = formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.currentBinding(thread);
		try {
			formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.bind(formula_template_vars.$use_formula_template_candidate_replacements_auto_expand$.getGlobalValue(), thread);
			formula_template = formula_templates.load_formula_template_details_from_kb(template_id, elmt);
		} finally {
			formula_template_vars.$formula_template_autoexpand_candidate_replacementsP$.rebind(_prev_bind_0, thread);
		}
		SubLObject stream = NIL;
		try {
			stream = make_private_string_output_stream();
			write_formula_template_in_xml(formula_template, stream);
			xml_string = get_output_stream_string(stream);
		} finally {
			final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values = getValuesAsVector();
				close(stream, UNPROVIDED);
				restoreValuesFromVector(_values);
			} finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
			}
		}
		return xml_string;
	}

	public static SubLObject process_feedback(final SubLObject mt, final SubLObject severity, final SubLObject comment, final SubLObject reason, final SubLObject logblock, final SubLObject component, final SubLObject query, final SubLObject query_formula, final SubLObject query_string, final SubLObject binding_list) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (((((((((((NIL == fort_types_interface.mtP(mt)) || (NIL == fi.ke_purpose())) || (NIL == cycl_grammar.cycl_constant_p(severity))) || (!comment.isString())) || (!reason.isString())) || (NIL == cycl_grammar.cycl_constant_p(component))) || (!logblock.isString())) || (NIL == collection_defns.cycl_formulaP(query_formula))) || (NIL == collection_defns.cycl_formulaP(query))) || (!query_string.isString()))
				|| (!binding_list.isList())) {
			return NIL;
		}
		final SubLObject pred = $$createABugzillaBugReport;
		final SubLObject reporter = api_control_vars.$the_cyclist$.getDynamicValue(thread);
		final SubLObject bugz_password = $str138$;
		final SubLObject product = get_bugzilla_product_from_project(fi.ke_purpose(), mt);
		final SubLObject system_num = system_info.cyc_revision_string();
		final SubLObject kb_num = operation_communication.kb_version_string();
		final SubLObject summary = cconcatenate(reason, new SubLObject[] { $str387$_response_for_query__, query_string });
		final SubLObject description = cconcatenate($str388$Query__, new SubLObject[] { string_utilities.to_string(query), string_utilities.$new_line_string$.getGlobalValue(), $str389$Query_Formula__, string_utilities.to_string(query_formula), string_utilities.$new_line_string$.getGlobalValue(), $str390$Bindings__, string_utilities.$new_line_string$.getGlobalValue(), bindinglist_to_string(binding_list),
				$str391$User_Comments__, comment, string_utilities.$new_line_string$.getGlobalValue(), $str392$Java_Log__, string_utilities.$new_line_string$.getGlobalValue(), logblock });
		fi.fi_assert(list(new SubLObject[] { pred, reporter, bugz_password, product, component, summary, system_num, kb_num, description, severity }), mt, UNPROVIDED, UNPROVIDED);
		return T;
	}

	public static SubLObject bindinglist_to_string(final SubLObject v_bindings) {
		SubLObject retstring = $str138$;
		SubLObject cdolist_list_var = v_bindings;
		SubLObject binding = NIL;
		binding = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			retstring = cconcatenate(retstring, new SubLObject[] { $$$___, binding.first(), $str394$__, second(binding), string_utilities.$new_line_string$.getGlobalValue() });
			cdolist_list_var = cdolist_list_var.rest();
			binding = cdolist_list_var.first();
		}
		return retstring;
	}

	public static SubLObject get_bugzilla_product_from_project(final SubLObject project, final SubLObject mt) {
		final SubLObject ans = kb_mapping_utilities.fpred_value_in_relevant_mts(project, $$bugzillaProductForProject, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
		if (NIL != ans) {
			return ans;
		}
		return $$CycorpInternalBugzillaBugReport;
	}

	public static SubLObject get_possible_renderers_for_followup(final SubLObject orig_sentence, final SubLObject orig_mt, final SubLObject orig_arg_pos, final SubLObject followup_sentence, final SubLObject followup_mt, SubLObject force, SubLObject generation_mt, SubLObject connective) {
		if (force == UNPROVIDED) {
			force = $INTERROGATIVE;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (connective == UNPROVIDED) {
			connective = $$and;
		}
		return get_possible_renderers_for_followup_int(orig_sentence, orig_mt, orig_arg_pos, followup_sentence, followup_mt, force, generation_mt, connective);
	}

	public static SubLObject clear_get_possible_renderers_for_followup_int() {
		final SubLObject cs = $get_possible_renderers_for_followup_int_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_get_possible_renderers_for_followup_int(final SubLObject orig_sentence, final SubLObject orig_mt, final SubLObject orig_arg_pos, final SubLObject followup_sentence, final SubLObject followup_mt, SubLObject force, SubLObject generation_mt, SubLObject connective) {
		if (force == UNPROVIDED) {
			force = $INTERROGATIVE;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (connective == UNPROVIDED) {
			connective = $$and;
		}
		return memoization_state.caching_state_remove_function_results_with_args($get_possible_renderers_for_followup_int_caching_state$.getGlobalValue(), list(orig_sentence, orig_mt, orig_arg_pos, followup_sentence, followup_mt, force, generation_mt, connective), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_possible_renderers_for_followup_int_internal(final SubLObject orig_sentence, SubLObject orig_mt, final SubLObject orig_arg_pos, final SubLObject followup_sentence, SubLObject followup_mt, final SubLObject force, final SubLObject generation_mt, final SubLObject connective) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject sentence1 = uniquify_variables_across_two_sentences(orig_sentence, followup_sentence);
		final SubLObject sentence2 = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject var;
		final SubLObject v_term = var = cycl_utilities.formula_arg_position(sentence1, orig_arg_pos, UNPROVIDED);
		SubLObject temp_followup_sentence = NIL;
		SubLObject temp_orig_sentence = NIL;
		SubLObject possible_followup = NIL;
		SubLObject sentences = NIL;
		SubLObject v_bindings = NIL;
		orig_mt = hlmt_czer.coerce_to_hlmt(orig_mt);
		followup_mt = hlmt_czer.coerce_to_hlmt(followup_mt);
		sentences = cons(optimize_el_formula_variable_names(list(connective, sentence1, sentence2), UNPROVIDED, UNPROVIDED, UNPROVIDED), sentences);
		if (NIL == variables.variable_p(v_term)) {
			var = czer_utilities.unique_el_var_wrt_expression(bq_cons(connective, $list400), UNPROVIDED);
			temp_orig_sentence = cycl_utilities.formula_subst(var, v_term, sentence1, UNPROVIDED, UNPROVIDED);
		}
		SubLObject cdolist_list_var;
		v_bindings = cdolist_list_var = query_utilities.get_possible_sentence_combinations_wrt_var(temp_orig_sentence, orig_mt, sentence2, followup_mt, var);
		SubLObject binding = NIL;
		binding = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			temp_followup_sentence = cycl_utilities.formula_subst(v_term, binding, sentence2, UNPROVIDED, UNPROVIDED);
			possible_followup = list(connective, sentence1, temp_followup_sentence);
			sentences = cons(optimize_el_formula_variable_names(possible_followup, UNPROVIDED, UNPROVIDED, UNPROVIDED), sentences);
			cdolist_list_var = cdolist_list_var.rest();
			binding = cdolist_list_var.first();
		}
		return get_term_list_as_renderings(sentences, orig_mt, force, generation_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_possible_renderers_for_followup_int(final SubLObject orig_sentence, final SubLObject orig_mt, final SubLObject orig_arg_pos, final SubLObject followup_sentence, final SubLObject followup_mt, SubLObject force, SubLObject generation_mt, SubLObject connective) {
		if (force == UNPROVIDED) {
			force = $INTERROGATIVE;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (connective == UNPROVIDED) {
			connective = $$and;
		}
		SubLObject caching_state = $get_possible_renderers_for_followup_int_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(GET_POSSIBLE_RENDERERS_FOR_FOLLOWUP_INT, $get_possible_renderers_for_followup_int_caching_state$, NIL, EQUAL, EIGHT_INTEGER, $int$256);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_8(orig_sentence, orig_mt, orig_arg_pos, followup_sentence, followup_mt, force, generation_mt, connective);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (orig_sentence.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (orig_mt.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (orig_arg_pos.equal(cached_args.first())) {
							cached_args = cached_args.rest();
							if (followup_sentence.equal(cached_args.first())) {
								cached_args = cached_args.rest();
								if (followup_mt.equal(cached_args.first())) {
									cached_args = cached_args.rest();
									if (force.equal(cached_args.first())) {
										cached_args = cached_args.rest();
										if (generation_mt.equal(cached_args.first())) {
											cached_args = cached_args.rest();
											if (((NIL != cached_args) && (NIL == cached_args.rest())) && connective.equal(cached_args.first())) {
												return memoization_state.caching_results(results2);
											}
										}
									}
								}
							}
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_possible_renderers_for_followup_int_internal(orig_sentence, orig_mt, orig_arg_pos, followup_sentence, followup_mt, force, generation_mt, connective)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(orig_sentence, orig_mt, orig_arg_pos, followup_sentence, followup_mt, force, generation_mt, connective));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject uniquify_variables_across_two_sentences(final SubLObject query_one, final SubLObject query_two) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject new_query_one = uniquify_variables_across_two_sentences_int(query_one, query_two);
		final SubLObject new_query_two = thread.secondMultipleValue();
		final SubLObject query_one_subst = thread.thirdMultipleValue();
		final SubLObject query_two_subst = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		return values(new_query_one, new_query_two);
	}

	public static SubLObject uniquify_variables_across_two_sentences_int(final SubLObject query_one, final SubLObject query_two) {
		SubLObject new_query = list($$and, query_one, query_two);
		final SubLObject query_one_variables = sentence_variables(query_one, UNPROVIDED, UNPROVIDED);
		final SubLObject query_two_variables = sentence_variables(query_two, UNPROVIDED, UNPROVIDED);
		final SubLObject variables_intersect = intersection(query_one_variables, query_two_variables, UNPROVIDED, UNPROVIDED);
		SubLObject new_query_one = query_one;
		SubLObject new_query_two = query_two;
		final SubLObject query_one_subst = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
		final SubLObject query_two_subst = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
		SubLObject unique_var = NIL;
		SubLObject cdolist_list_var = variables_intersect;
		SubLObject variable = NIL;
		variable = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			unique_var = czer_utilities.unique_el_var_wrt_expression(new_query, variable);
			new_query_one = cycl_utilities.expression_subst(unique_var, variable, new_query_one, UNPROVIDED, UNPROVIDED);
			new_query = list($$and, new_query_one, new_query_two);
			dictionary.dictionary_enter(query_one_subst, variable, unique_var);
			cdolist_list_var = cdolist_list_var.rest();
			variable = cdolist_list_var.first();
		}
		cdolist_list_var = variables_intersect;
		variable = NIL;
		variable = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			unique_var = czer_utilities.unique_el_var_wrt_expression(new_query, variable);
			new_query_two = cycl_utilities.expression_subst(unique_var, variable, new_query_two, UNPROVIDED, UNPROVIDED);
			new_query = list($$and, new_query_one, new_query_two);
			dictionary.dictionary_enter(query_two_subst, variable, unique_var);
			cdolist_list_var = cdolist_list_var.rest();
			variable = cdolist_list_var.first();
		}
		return values(new_query_one, new_query_two, query_one_subst, query_two_subst);
	}

	public static SubLObject change_variable_names(final SubLObject sentence, final SubLObject variable_mappings) {
		if (variable_mappings == NIL) {
			return sentence;
		}
		SubLObject new_sentence = sentence;
		SubLObject cdolist_list_var = variable_mappings;
		SubLObject mapping = NIL;
		mapping = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			new_sentence = cycl_utilities.expression_subst(second(mapping), mapping.first(), new_sentence, UNPROVIDED, UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			mapping = cdolist_list_var.first();
		}
		return new_sentence;
	}

	public static SubLObject generality_sort_lambda(final SubLObject v_object) {
		if (v_object.isList()) {
			return cardinality_estimates.generality_estimate(v_object.first());
		}
		return cardinality_estimates.generality_estimate(v_object);
	}

	public static SubLObject get_possible_merged_queries(final SubLObject query_one, final SubLObject query_two, final SubLObject el_mt_one, final SubLObject el_mt_two, SubLObject logical_connective) {
		if (logical_connective == UNPROVIDED) {
			logical_connective = $$and;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject unique_query_one = uniquify_variables_across_two_sentences(query_one, query_two);
		final SubLObject unique_query_two = thread.secondMultipleValue();
		thread.resetMultipleValues();
		final SubLObject mt_one = hlmt_czer.canonicalize_hlmt(el_mt_one);
		final SubLObject mt_two = hlmt_czer.canonicalize_hlmt(el_mt_two);
		final SubLObject new_mt = hlmt.combine_hlmts(hlmt_czer.canonicalize_hlmt(mt_one), hlmt_czer.canonicalize_hlmt(mt_two));
		final SubLObject variable_mappings = at_utilities.possible_followup_variable_binding_sets(unique_query_one, unique_query_two, new_mt);
		SubLObject result = list(new_mt);
		SubLObject new_query_one = NIL;
		SubLObject new_query_two = NIL;
		SubLObject new_query = NIL;
		SubLObject cdolist_list_var = variable_mappings;
		SubLObject mapping_set = NIL;
		mapping_set = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			new_query_one = copy_sentence(unique_query_one);
			new_query_two = copy_sentence(unique_query_two);
			mapping_set = second(mapping_set);
			new_query_one = change_variable_names(new_query_one, mapping_set);
			new_query_two = change_variable_names(new_query_two, mapping_set);
			new_query = optimize_el_formula_variable_names(list(logical_connective, new_query_one, new_query_two), UNPROVIDED, UNPROVIDED, UNPROVIDED);
			result = cons(new_query, result);
			cdolist_list_var = cdolist_list_var.rest();
			mapping_set = cdolist_list_var.first();
		}
		return nreverse(result);
	}

	public static SubLObject get_possible_merged_queries_wrt_var(final SubLObject query_one, final SubLObject query_two, final SubLObject el_mt_one, final SubLObject el_mt_two, final SubLObject variable, SubLObject logical_connective) {
		if (logical_connective == UNPROVIDED) {
			logical_connective = $$and;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		thread.resetMultipleValues();
		final SubLObject unique_query_one = uniquify_variables_across_two_sentences_int(query_one, query_two);
		final SubLObject unique_query_two = thread.secondMultipleValue();
		final SubLObject query_one_subst = thread.thirdMultipleValue();
		final SubLObject query_two_subst = thread.fourthMultipleValue();
		thread.resetMultipleValues();
		final SubLObject possible_susbt_var = dictionary.dictionary_lookup(query_one_subst, variable, variable);
		final SubLObject mt_one = hlmt_czer.canonicalize_hlmt(el_mt_one);
		final SubLObject mt_two = hlmt_czer.canonicalize_hlmt(el_mt_two);
		final SubLObject new_mt = hlmt.combine_hlmts(mt_one, mt_two);
		final SubLObject replacements = query_utilities.get_possible_sentence_combinations_wrt_var(unique_query_one, mt_one, unique_query_two, mt_two, possible_susbt_var);
		SubLObject result = list(new_mt);
		SubLObject cdolist_list_var = replacements;
		SubLObject replacement = NIL;
		replacement = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject raw_new_query = list(logical_connective, unique_query_one, cycl_utilities.expression_subst(possible_susbt_var, replacement, unique_query_two, UNPROVIDED, UNPROVIDED));
			final SubLObject simplified_query = simplifier.simplify_cycl_sentence_syntax(raw_new_query, UNPROVIDED);
			final SubLObject final_new_query = optimize_el_formula_variable_names(simplified_query, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			result = cons(final_new_query, result);
			cdolist_list_var = cdolist_list_var.rest();
			replacement = cdolist_list_var.first();
		}
		return delete_duplicates(nreverse(result), EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject get_source_conceptual_works_for_project(final SubLObject project, final SubLObject valid_source_types_collection, SubLObject mt, SubLObject generation_mt, SubLObject sort_function) {
		if (mt == UNPROVIDED) {
			mt = $$InferencePSC;
		}
		if (generation_mt == UNPROVIDED) {
			generation_mt = pph_vars.$pph_language_mt$.getDynamicValue();
		}
		if (sort_function == UNPROVIDED) {
			sort_function = symbol_function(PPH_LIST_ITEM_COMPARATOR);
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject results_dictionary = get_categorized_source_cws_for_project(project, valid_source_types_collection, mt);
		SubLObject result = NIL;
		SubLObject iteration_state;
		for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(results_dictionary)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
			thread.resetMultipleValues();
			final SubLObject cw_type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
			SubLObject cw_list = thread.secondMultipleValue();
			thread.resetMultipleValues();
			SubLObject cw_type_rendering = NIL;
			SubLObject cw_list_renderings = NIL;
			if (NIL != paraphrased_source_list_for_generation_mtP(cw_list, generation_mt)) {
				cw_type_rendering = third(cw_list.first());
				cw_list_renderings = cw_list.rest();
			} else {
				final SubLObject paraphrased_in_different_mtP = paraphrased_source_listP(cw_list);
				final SubLObject store_paraphrasesP = makeBoolean(NIL == paraphrased_in_different_mtP);
				if (NIL != paraphrased_in_different_mtP) {
					cw_list = paraphrased_source_list_sources(cw_list);
				}
				final SubLObject _prev_bind_0 = pph_vars.$use_parenthetical_disambiguationsP$.currentBinding(thread);
				try {
					pph_vars.$use_parenthetical_disambiguationsP$.bind(NIL, thread);
					cw_type_rendering = list(pph_main.generate_phrase_for_java(cw_type, $DEFAULT, $NONE, generation_mt, mt, UNPROVIDED), cw_type);
					cw_list_renderings = get_term_list_as_renderings(remove_duplicates(cw_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt, $NONE, generation_mt, sort_function, $DEFAULT, NIL, NIL);
				} finally {
					pph_vars.$use_parenthetical_disambiguationsP$.rebind(_prev_bind_0, thread);
				}
				if (NIL != store_paraphrasesP) {
					store_conceptual_work_paraphrases(cw_type, cw_type_rendering, generation_mt, cw_list_renderings, results_dictionary);
				}
			}
			result = cons(list(cw_type_rendering, cw_list_renderings), result);
		}
		dictionary_contents.do_dictionary_contents_finalize(iteration_state);
		return result;
	}

	public static SubLObject paraphrased_source_listP(final SubLObject cw_list) {
		return pattern_match.tree_matches_pattern(cw_list.first(), $list408);
	}

	public static SubLObject paraphrased_source_list_for_generation_mtP(final SubLObject cw_list, final SubLObject generation_mt) {
		return pattern_match.tree_matches_pattern(cw_list.first(), listS($PARAPHRASED_CW_TYPE, generation_mt, $ANYTHING));
	}

	public static SubLObject paraphrased_source_list_sources(final SubLObject cw_list) {
		return Mapping.mapcar(PARAPHRASED_SOURCE_SOURCE, cw_list.rest());
	}

	public static SubLObject paraphrased_source_source(final SubLObject paraphrased_source) {
		return second(paraphrased_source);
	}

	public static SubLObject store_conceptual_work_paraphrases(final SubLObject cw_type, final SubLObject cw_type_rendering, final SubLObject generation_mt, final SubLObject cw_list_renderings, final SubLObject results_dictionary) {
		return dictionary.dictionary_enter(results_dictionary, cw_type, cons(list($PARAPHRASED_CW_TYPE, generation_mt, cw_type_rendering), cw_list_renderings));
	}

	public static SubLObject fet_categorized_source_pred() {
		SubLObject stored = $fet_categorized_source_pred$.getGlobalValue();
		if (NIL == stored) {
			final SubLObject looked_up = constants_high.find_constant($$$sourceOfTypeForProject);
			if (NIL != valid_constantP(looked_up, UNPROVIDED)) {
				$fet_categorized_source_pred$.setGlobalValue(looked_up);
				stored = $fet_categorized_source_pred$.getGlobalValue();
			}
		}
		return stored;
	}

	public static SubLObject add_source_of_type_for_project(final SubLObject argument, final SubLObject assertion) {
		SubLObject current;
		final SubLObject datum = current = assertions_high.gaf_args(assertion);
		SubLObject source = NIL;
		SubLObject source_type = NIL;
		SubLObject type_type = NIL;
		SubLObject project = NIL;
		destructuring_bind_must_consp(current, datum, $list413);
		source = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list413);
		source_type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list413);
		type_type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list413);
		project = current.first();
		current = current.rest();
		if (NIL == current) {
			return add_categorized_fet_source(source, source_type, type_type, project);
		}
		cdestructuring_bind_error(datum, $list413);
		return NIL;
	}

	public static SubLObject remove_source_of_type_for_project(final SubLObject argument, final SubLObject assertion) {
		SubLObject current;
		final SubLObject datum = current = assertions_high.gaf_args(assertion);
		SubLObject source = NIL;
		SubLObject source_type = NIL;
		SubLObject type_type = NIL;
		SubLObject project = NIL;
		destructuring_bind_must_consp(current, datum, $list413);
		source = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list413);
		source_type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list413);
		type_type = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list413);
		project = current.first();
		current = current.rest();
		if (NIL == current) {
			return remove_categorized_fet_source(source, source_type, type_type, project);
		}
		cdestructuring_bind_error(datum, $list413);
		return NIL;
	}

	public static SubLObject fet_empty_source_dictionary() {
		if (NIL == $fet_empty_source_dictionary$.getGlobalValue()) {
			$fet_empty_source_dictionary$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
		}
		return $fet_empty_source_dictionary$.getGlobalValue();
	}

	public static SubLObject clear_source_conceptual_works_for_project() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL != dictionary.dictionary_p($fet_categorized_sources$.getGlobalValue())) {
			SubLObject iteration_state;
			for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($fet_categorized_sources$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
				thread.resetMultipleValues();
				final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
				final SubLObject type_type_dict = thread.secondMultipleValue();
				thread.resetMultipleValues();
				if (NIL != dictionary.dictionary_p(type_type_dict)) {
					SubLObject iteration_state_$202;
					for (iteration_state_$202 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_type_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$202); iteration_state_$202 = dictionary_contents.do_dictionary_contents_next(iteration_state_$202)) {
						thread.resetMultipleValues();
						final SubLObject key_$203 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$202);
						final SubLObject source_type_dict = thread.secondMultipleValue();
						thread.resetMultipleValues();
						if (NIL != dictionary.dictionary_p(source_type_dict)) {
							dictionary.clear_dictionary(source_type_dict);
						}
					}
					dictionary_contents.do_dictionary_contents_finalize(iteration_state_$202);
					dictionary.clear_dictionary(type_type_dict);
				}
			}
			dictionary_contents.do_dictionary_contents_finalize(iteration_state);
			dictionary.clear_dictionary($fet_categorized_sources$.getGlobalValue());
		}
		$fet_categorized_sources$.setGlobalValue($UNINITIALIZED);
		return $fet_categorized_sources$.getGlobalValue();
	}

	public static SubLObject add_categorized_fet_source(SubLObject source, final SubLObject source_type, final SubLObject type_type, final SubLObject project) {
		if (NIL == dictionary.dictionary_p($fet_categorized_sources$.getGlobalValue())) {
			$fet_categorized_sources$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
		}
		final SubLObject type_type_dict = type_type_dict_for_project(project, T);
		final SubLObject source_type_dict = source_type_dict_for_type_type(type_type, type_type_dict, T);
		final SubLObject source_list = dictionary.dictionary_lookup(source_type_dict, source_type, NIL);
		if (NIL == paraphrased_source_listP(source_list)) {
			return dictionary_utilities.dictionary_pushnew(source_type_dict, source_type, source, UNPROVIDED, UNPROVIDED);
		}
		if (NIL != member(source, source_list, symbol_function(EQL), PARAPHRASED_SOURCE_SOURCE)) {
			return source;
		}
		return dictionary.dictionary_enter(source_type_dict, source_type, cons(source, paraphrased_source_list_sources(source_list)));
	}

	public static SubLObject remove_categorized_fet_source(SubLObject source, final SubLObject source_type, final SubLObject type_type, final SubLObject project) {
		if (NIL == dictionary.dictionary_p($fet_categorized_sources$.getGlobalValue())) {
			return $NOT_FOUND;
		}
		final SubLObject type_type_dict = type_type_dict_for_project(project, NIL);
		final SubLObject source_type_dict = source_type_dict_for_type_type(type_type, type_type_dict, NIL);
		if (NIL == source_type_dict) {
			return $NOT_FOUND;
		}
		final SubLObject source_list = dictionary.dictionary_lookup(source_type_dict, source_type, NIL);
		final SubLObject paraphrasedP = paraphrased_source_listP(source_list);
		final SubLObject accessor = (NIL != paraphrasedP) ? PARAPHRASED_SOURCE_SOURCE : symbol_function(IDENTITY);
		return dictionary_utilities.dictionary_remove_from_value(source_type_dict, source_type, source, symbol_function(EQL), accessor);
	}

	public static SubLObject initialize_fet_sources() {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject pred = fet_categorized_source_pred();
		if (NIL != pred) {
			clear_source_conceptual_works_for_project();
			$fet_categorized_sources$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
			final SubLObject str = $str419$Initializing_Fact_Entry_Tool_sour;
			final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
			final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
			final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
			final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
			final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
			final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
			final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
			final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
			try {
				$progress_start_time$.bind(get_universal_time(), thread);
				$progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
				$progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
				$progress_notification_count$.bind(ZERO_INTEGER, thread);
				$progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
				$progress_count$.bind(ZERO_INTEGER, thread);
				$is_noting_progressP$.bind(T, thread);
				$silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
				noting_progress_preamble(str);
				final SubLObject _prev_bind_0_$204 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
				final SubLObject _prev_bind_1_$205 = mt_relevance_macros.$mt$.currentBinding(thread);
				try {
					mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
					mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
					final SubLObject node_var = $$Project;
					final SubLObject _prev_bind_0_$205 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
					final SubLObject _prev_bind_1_$206 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
					try {
						sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
						sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
						try {
							SubLObject node_var_$208 = node_var;
							final SubLObject deck_type = $STACK;
							final SubLObject recur_deck = deck.create_deck(deck_type);
							final SubLObject _prev_bind_0_$206 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
							try {
								sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
								try {
									final SubLObject tv_var = NIL;
									final SubLObject _prev_bind_0_$207 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
									final SubLObject _prev_bind_1_$207 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
									try {
										sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
										sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
										if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
											final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
											if (pcase_var.eql($ERROR)) {
												sbhl_paranoia.sbhl_error(ONE_INTEGER, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											} else if (pcase_var.eql($CERROR)) {
												sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											} else if (pcase_var.eql($WARN)) {
												Errors.warn($str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
											} else {
												Errors.warn($str281$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
												Errors.cerror($$$continue_anyway, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
											}

										}
										final SubLObject _prev_bind_0_$208 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
										final SubLObject _prev_bind_1_$208 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
										final SubLObject _prev_bind_2_$214 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
										final SubLObject _prev_bind_3_$215 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
										final SubLObject _prev_bind_4_$216 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
										try {
											sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
											sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
											sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
											sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
											sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
											if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
												final SubLObject _prev_bind_0_$209 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
												final SubLObject _prev_bind_1_$209 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
												final SubLObject _prev_bind_2_$215 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
												try {
													sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
													sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
													sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
													sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$208, UNPROVIDED);
													while (NIL != node_var_$208) {
														final SubLObject tt_node_var = node_var_$208;
														SubLObject cdolist_list_var;
														final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
														SubLObject module_var = NIL;
														module_var = cdolist_list_var.first();
														while (NIL != cdolist_list_var) {
															final SubLObject _prev_bind_0_$210 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
															final SubLObject _prev_bind_1_$210 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
															try {
																sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
																sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																final SubLObject node = function_terms.naut_to_nart(tt_node_var);
																if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
																	final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																	if (NIL != d_link) {
																		final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																		if (NIL != mt_links) {
																			SubLObject iteration_state;
																			for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
																				thread.resetMultipleValues();
																				final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
																				final SubLObject tv_links = thread.secondMultipleValue();
																				thread.resetMultipleValues();
																				if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																					final SubLObject _prev_bind_0_$211 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																					try {
																						sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																						SubLObject iteration_state_$223;
																						for (iteration_state_$223 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$223); iteration_state_$223 = dictionary_contents.do_dictionary_contents_next(iteration_state_$223)) {
																							thread.resetMultipleValues();
																							final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$223);
																							final SubLObject link_nodes = thread.secondMultipleValue();
																							thread.resetMultipleValues();
																							if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																								final SubLObject _prev_bind_0_$212 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																								try {
																									sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																									final SubLObject sol = link_nodes;
																									if (NIL != set.set_p(sol)) {
																										final SubLObject set_contents_var = set.do_set_internal(sol);
																										SubLObject basis_object;
																										SubLObject state;
																										SubLObject project;
																										SubLObject pred_var;
																										SubLObject iterator_var;
																										SubLObject done_var;
																										SubLObject token_var;
																										SubLObject final_index_spec;
																										SubLObject valid;
																										SubLObject final_index_iterator;
																										SubLObject done_var_$225;
																										SubLObject token_var_$226;
																										SubLObject gaf;
																										SubLObject valid_$227;
																										SubLObject current;
																										SubLObject datum;
																										SubLObject source;
																										SubLObject source_type;
																										SubLObject type_type;
																										SubLObject _prev_bind_0_$213;
																										SubLObject _values;
																										for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
																											project = set_contents.do_set_contents_next(basis_object, state);
																											if ((NIL != set_contents.do_set_contents_element_validP(state, project)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(project, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																												sbhl_marking_utilities.sbhl_mark_node_marked(project, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																												if (NIL != forts.fort_p(project)) {
																													pred_var = pred;
																													if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(project, FOUR_INTEGER, pred_var)) {
																														iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(project, FOUR_INTEGER, pred_var);
																														done_var = NIL;
																														token_var = NIL;
																														while (NIL == done_var) {
																															final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
																															valid = makeBoolean(!token_var.eql(final_index_spec));
																															if (NIL != valid) {
																																final_index_iterator = NIL;
																																try {
																																	final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
																																	done_var_$225 = NIL;
																																	token_var_$226 = NIL;
																																	while (NIL == done_var_$225) {
																																		gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$226);
																																		valid_$227 = makeBoolean(!token_var_$226.eql(gaf));
																																		if (NIL != valid_$227) {
																																			datum = current = list_utilities.first_n(THREE_INTEGER, assertions_high.gaf_args(gaf));
																																			source = NIL;
																																			source_type = NIL;
																																			type_type = NIL;
																																			destructuring_bind_must_consp(current, datum, $list422);
																																			source = current.first();
																																			current = current.rest();
																																			destructuring_bind_must_consp(current, datum, $list422);
																																			source_type = current.first();
																																			current = current.rest();
																																			destructuring_bind_must_consp(current, datum, $list422);
																																			type_type = current.first();
																																			current = current.rest();
																																			if (NIL == current) {
																																				add_categorized_fet_source(source, source_type, type_type, project);
																																			} else {
																																				cdestructuring_bind_error(datum, $list422);
																																			}
																																		}
																																		done_var_$225 = makeBoolean(NIL == valid_$227);
																																	}
																																} finally {
																																	_prev_bind_0_$213 = $is_thread_performing_cleanupP$.currentBinding(thread);
																																	try {
																																		$is_thread_performing_cleanupP$.bind(T, thread);
																																		_values = getValuesAsVector();
																																		if (NIL != final_index_iterator) {
																																			kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
																																		}
																																		restoreValuesFromVector(_values);
																																	} finally {
																																		$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
																																	}
																																}
																															}
																															done_var = makeBoolean(NIL == valid);
																														}
																													}
																												}
																											}
																										}
																									} else if (sol.isList()) {
																										SubLObject csome_list_var = sol;
																										SubLObject project2 = NIL;
																										project2 = csome_list_var.first();
																										while (NIL != csome_list_var) {
																											if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(project2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																												sbhl_marking_utilities.sbhl_mark_node_marked(project2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																												if (NIL != forts.fort_p(project2)) {
																													final SubLObject pred_var2 = pred;
																													if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(project2, FOUR_INTEGER, pred_var2)) {
																														final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(project2, FOUR_INTEGER, pred_var2);
																														SubLObject done_var2 = NIL;
																														final SubLObject token_var2 = NIL;
																														while (NIL == done_var2) {
																															final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
																															final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
																															if (NIL != valid2) {
																																SubLObject final_index_iterator2 = NIL;
																																try {
																																	final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
																																	SubLObject done_var_$226 = NIL;
																																	final SubLObject token_var_$227 = NIL;
																																	while (NIL == done_var_$226) {
																																		final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$227);
																																		final SubLObject valid_$228 = makeBoolean(!token_var_$227.eql(gaf2));
																																		if (NIL != valid_$228) {
																																			SubLObject current2;
																																			final SubLObject datum2 = current2 = list_utilities.first_n(THREE_INTEGER, assertions_high.gaf_args(gaf2));
																																			SubLObject source2 = NIL;
																																			SubLObject source_type2 = NIL;
																																			SubLObject type_type2 = NIL;
																																			destructuring_bind_must_consp(current2, datum2, $list422);
																																			source2 = current2.first();
																																			current2 = current2.rest();
																																			destructuring_bind_must_consp(current2, datum2, $list422);
																																			source_type2 = current2.first();
																																			current2 = current2.rest();
																																			destructuring_bind_must_consp(current2, datum2, $list422);
																																			type_type2 = current2.first();
																																			current2 = current2.rest();
																																			if (NIL == current2) {
																																				add_categorized_fet_source(source2, source_type2, type_type2, project2);
																																			} else {
																																				cdestructuring_bind_error(datum2, $list422);
																																			}
																																		}
																																		done_var_$226 = makeBoolean(NIL == valid_$228);
																																	}
																																} finally {
																																	final SubLObject _prev_bind_0_$214 = $is_thread_performing_cleanupP$.currentBinding(thread);
																																	try {
																																		$is_thread_performing_cleanupP$.bind(T, thread);
																																		final SubLObject _values2 = getValuesAsVector();
																																		if (NIL != final_index_iterator2) {
																																			kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
																																		}
																																		restoreValuesFromVector(_values2);
																																	} finally {
																																		$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$214, thread);
																																	}
																																}
																															}
																															done_var2 = makeBoolean(NIL == valid2);
																														}
																													}
																												}
																											}
																											csome_list_var = csome_list_var.rest();
																											project2 = csome_list_var.first();
																										}
																									} else {
																										Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol);
																									}

																								} finally {
																									sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$212, thread);
																								}
																							}
																						}
																						dictionary_contents.do_dictionary_contents_finalize(iteration_state_$223);
																					} finally {
																						sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$211, thread);
																					}
																				}
																			}
																			dictionary_contents.do_dictionary_contents_finalize(iteration_state);
																		}
																	} else {
																		sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str283$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																	}
																	if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
																		SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
																		SubLObject instance_tuple = NIL;
																		instance_tuple = csome_list_var2.first();
																		while (NIL != csome_list_var2) {
																			SubLObject current3;
																			final SubLObject datum3 = current3 = instance_tuple;
																			SubLObject link_node = NIL;
																			SubLObject mt2 = NIL;
																			SubLObject tv2 = NIL;
																			destructuring_bind_must_consp(current3, datum3, $list284);
																			link_node = current3.first();
																			current3 = current3.rest();
																			destructuring_bind_must_consp(current3, datum3, $list284);
																			mt2 = current3.first();
																			current3 = current3.rest();
																			destructuring_bind_must_consp(current3, datum3, $list284);
																			tv2 = current3.first();
																			current3 = current3.rest();
																			if (NIL == current3) {
																				if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
																					final SubLObject _prev_bind_0_$215 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																					try {
																						sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
																						if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																							final SubLObject _prev_bind_0_$216 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																							try {
																								sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																								final SubLObject sol;
																								final SubLObject link_nodes2 = sol = list(link_node);
																								if (NIL != set.set_p(sol)) {
																									final SubLObject set_contents_var = set.do_set_internal(sol);
																									SubLObject basis_object;
																									SubLObject state;
																									SubLObject project;
																									SubLObject pred_var;
																									SubLObject iterator_var;
																									SubLObject done_var;
																									SubLObject token_var;
																									SubLObject final_index_spec;
																									SubLObject valid;
																									SubLObject final_index_iterator;
																									SubLObject gaf;
																									SubLObject source;
																									SubLObject source_type;
																									SubLObject type_type;
																									SubLObject done_var_$227;
																									SubLObject token_var_$228;
																									SubLObject valid_$229;
																									SubLObject current_$239;
																									SubLObject datum_$238;
																									SubLObject _prev_bind_0_$217;
																									SubLObject _values3;
																									for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
																										project = set_contents.do_set_contents_next(basis_object, state);
																										if ((NIL != set_contents.do_set_contents_element_validP(state, project)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(project, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																											sbhl_marking_utilities.sbhl_mark_node_marked(project, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																											if (NIL != forts.fort_p(project)) {
																												pred_var = pred;
																												if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(project, FOUR_INTEGER, pred_var)) {
																													iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(project, FOUR_INTEGER, pred_var);
																													done_var = NIL;
																													token_var = NIL;
																													while (NIL == done_var) {
																														final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
																														valid = makeBoolean(!token_var.eql(final_index_spec));
																														if (NIL != valid) {
																															final_index_iterator = NIL;
																															try {
																																final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
																																done_var_$227 = NIL;
																																token_var_$228 = NIL;
																																while (NIL == done_var_$227) {
																																	gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$228);
																																	valid_$229 = makeBoolean(!token_var_$228.eql(gaf));
																																	if (NIL != valid_$229) {
																																		datum_$238 = current_$239 = list_utilities.first_n(THREE_INTEGER, assertions_high.gaf_args(gaf));
																																		source = NIL;
																																		source_type = NIL;
																																		type_type = NIL;
																																		destructuring_bind_must_consp(current_$239, datum_$238, $list422);
																																		source = current_$239.first();
																																		current_$239 = current_$239.rest();
																																		destructuring_bind_must_consp(current_$239, datum_$238, $list422);
																																		source_type = current_$239.first();
																																		current_$239 = current_$239.rest();
																																		destructuring_bind_must_consp(current_$239, datum_$238, $list422);
																																		type_type = current_$239.first();
																																		current_$239 = current_$239.rest();
																																		if (NIL == current_$239) {
																																			add_categorized_fet_source(source, source_type, type_type, project);
																																		} else {
																																			cdestructuring_bind_error(datum_$238, $list422);
																																		}
																																	}
																																	done_var_$227 = makeBoolean(NIL == valid_$229);
																																}
																															} finally {
																																_prev_bind_0_$217 = $is_thread_performing_cleanupP$.currentBinding(thread);
																																try {
																																	$is_thread_performing_cleanupP$.bind(T, thread);
																																	_values3 = getValuesAsVector();
																																	if (NIL != final_index_iterator) {
																																		kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
																																	}
																																	restoreValuesFromVector(_values3);
																																} finally {
																																	$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$217, thread);
																																}
																															}
																														}
																														done_var = makeBoolean(NIL == valid);
																													}
																												}
																											}
																										}
																									}
																								} else if (sol.isList()) {
																									SubLObject csome_list_var_$241 = sol;
																									SubLObject project2 = NIL;
																									project2 = csome_list_var_$241.first();
																									while (NIL != csome_list_var_$241) {
																										if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(project2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																											sbhl_marking_utilities.sbhl_mark_node_marked(project2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																											if (NIL != forts.fort_p(project2)) {
																												final SubLObject pred_var2 = pred;
																												if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(project2, FOUR_INTEGER, pred_var2)) {
																													final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(project2, FOUR_INTEGER, pred_var2);
																													SubLObject done_var2 = NIL;
																													final SubLObject token_var2 = NIL;
																													while (NIL == done_var2) {
																														final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
																														final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
																														if (NIL != valid2) {
																															SubLObject final_index_iterator2 = NIL;
																															try {
																																final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
																																SubLObject done_var_$228 = NIL;
																																final SubLObject token_var_$229 = NIL;
																																while (NIL == done_var_$228) {
																																	final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$229);
																																	final SubLObject valid_$230 = makeBoolean(!token_var_$229.eql(gaf2));
																																	if (NIL != valid_$230) {
																																		SubLObject current_$240;
																																		final SubLObject datum_$239 = current_$240 = list_utilities.first_n(THREE_INTEGER, assertions_high.gaf_args(gaf2));
																																		SubLObject source2 = NIL;
																																		SubLObject source_type2 = NIL;
																																		SubLObject type_type2 = NIL;
																																		destructuring_bind_must_consp(current_$240, datum_$239, $list422);
																																		source2 = current_$240.first();
																																		current_$240 = current_$240.rest();
																																		destructuring_bind_must_consp(current_$240, datum_$239, $list422);
																																		source_type2 = current_$240.first();
																																		current_$240 = current_$240.rest();
																																		destructuring_bind_must_consp(current_$240, datum_$239, $list422);
																																		type_type2 = current_$240.first();
																																		current_$240 = current_$240.rest();
																																		if (NIL == current_$240) {
																																			add_categorized_fet_source(source2, source_type2, type_type2, project2);
																																		} else {
																																			cdestructuring_bind_error(datum_$239, $list422);
																																		}
																																	}
																																	done_var_$228 = makeBoolean(NIL == valid_$230);
																																}
																															} finally {
																																final SubLObject _prev_bind_0_$218 = $is_thread_performing_cleanupP$.currentBinding(thread);
																																try {
																																	$is_thread_performing_cleanupP$.bind(T, thread);
																																	final SubLObject _values4 = getValuesAsVector();
																																	if (NIL != final_index_iterator2) {
																																		kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
																																	}
																																	restoreValuesFromVector(_values4);
																																} finally {
																																	$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$218, thread);
																																}
																															}
																														}
																														done_var2 = makeBoolean(NIL == valid2);
																													}
																												}
																											}
																										}
																										csome_list_var_$241 = csome_list_var_$241.rest();
																										project2 = csome_list_var_$241.first();
																									}
																								} else {
																									Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol);
																								}

																							} finally {
																								sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$216, thread);
																							}
																						}
																					} finally {
																						sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$215, thread);
																					}
																				}
																			} else {
																				cdestructuring_bind_error(datum3, $list284);
																			}
																			csome_list_var2 = csome_list_var2.rest();
																			instance_tuple = csome_list_var2.first();
																		}
																	}
																} else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
																	SubLObject cdolist_list_var_$248;
																	final SubLObject new_list = cdolist_list_var_$248 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p())
																			? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																			: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																	SubLObject generating_fn = NIL;
																	generating_fn = cdolist_list_var_$248.first();
																	while (NIL != cdolist_list_var_$248) {
																		final SubLObject _prev_bind_0_$219 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																		try {
																			sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
																			final SubLObject sol2;
																			final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
																			if (NIL != set.set_p(sol2)) {
																				final SubLObject set_contents_var2 = set.do_set_internal(sol2);
																				SubLObject basis_object2;
																				SubLObject state2;
																				SubLObject project3;
																				SubLObject pred_var3;
																				SubLObject iterator_var3;
																				SubLObject done_var3;
																				SubLObject token_var3;
																				SubLObject final_index_spec3;
																				SubLObject valid3;
																				SubLObject final_index_iterator3;
																				SubLObject done_var_$229;
																				SubLObject token_var_$230;
																				SubLObject gaf3;
																				SubLObject valid_$231;
																				SubLObject current4;
																				SubLObject datum4;
																				SubLObject source3;
																				SubLObject source_type3;
																				SubLObject type_type3;
																				SubLObject _prev_bind_0_$220;
																				SubLObject _values5;
																				for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
																					project3 = set_contents.do_set_contents_next(basis_object2, state2);
																					if ((NIL != set_contents.do_set_contents_element_validP(state2, project3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(project3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
																						sbhl_marking_utilities.sbhl_mark_node_marked(project3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																						if (NIL != forts.fort_p(project3)) {
																							pred_var3 = pred;
																							if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(project3, FOUR_INTEGER, pred_var3)) {
																								iterator_var3 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(project3, FOUR_INTEGER, pred_var3);
																								done_var3 = NIL;
																								token_var3 = NIL;
																								while (NIL == done_var3) {
																									final_index_spec3 = iteration.iteration_next_without_values_macro_helper(iterator_var3, token_var3);
																									valid3 = makeBoolean(!token_var3.eql(final_index_spec3));
																									if (NIL != valid3) {
																										final_index_iterator3 = NIL;
																										try {
																											final_index_iterator3 = kb_mapping_macros.new_final_index_iterator(final_index_spec3, $GAF, NIL, NIL);
																											done_var_$229 = NIL;
																											token_var_$230 = NIL;
																											while (NIL == done_var_$229) {
																												gaf3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator3, token_var_$230);
																												valid_$231 = makeBoolean(!token_var_$230.eql(gaf3));
																												if (NIL != valid_$231) {
																													datum4 = current4 = list_utilities.first_n(THREE_INTEGER, assertions_high.gaf_args(gaf3));
																													source3 = NIL;
																													source_type3 = NIL;
																													type_type3 = NIL;
																													destructuring_bind_must_consp(current4, datum4, $list422);
																													source3 = current4.first();
																													current4 = current4.rest();
																													destructuring_bind_must_consp(current4, datum4, $list422);
																													source_type3 = current4.first();
																													current4 = current4.rest();
																													destructuring_bind_must_consp(current4, datum4, $list422);
																													type_type3 = current4.first();
																													current4 = current4.rest();
																													if (NIL == current4) {
																														add_categorized_fet_source(source3, source_type3, type_type3, project3);
																													} else {
																														cdestructuring_bind_error(datum4, $list422);
																													}
																												}
																												done_var_$229 = makeBoolean(NIL == valid_$231);
																											}
																										} finally {
																											_prev_bind_0_$220 = $is_thread_performing_cleanupP$.currentBinding(thread);
																											try {
																												$is_thread_performing_cleanupP$.bind(T, thread);
																												_values5 = getValuesAsVector();
																												if (NIL != final_index_iterator3) {
																													kb_mapping_macros.destroy_final_index_iterator(final_index_iterator3);
																												}
																												restoreValuesFromVector(_values5);
																											} finally {
																												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$220, thread);
																											}
																										}
																									}
																									done_var3 = makeBoolean(NIL == valid3);
																								}
																							}
																						}
																					}
																				}
																			} else if (sol2.isList()) {
																				SubLObject csome_list_var3 = sol2;
																				SubLObject project4 = NIL;
																				project4 = csome_list_var3.first();
																				while (NIL != csome_list_var3) {
																					if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(project4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
																						sbhl_marking_utilities.sbhl_mark_node_marked(project4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
																						if (NIL != forts.fort_p(project4)) {
																							final SubLObject pred_var4 = pred;
																							if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(project4, FOUR_INTEGER, pred_var4)) {
																								final SubLObject iterator_var4 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(project4, FOUR_INTEGER, pred_var4);
																								SubLObject done_var4 = NIL;
																								final SubLObject token_var4 = NIL;
																								while (NIL == done_var4) {
																									final SubLObject final_index_spec4 = iteration.iteration_next_without_values_macro_helper(iterator_var4, token_var4);
																									final SubLObject valid4 = makeBoolean(!token_var4.eql(final_index_spec4));
																									if (NIL != valid4) {
																										SubLObject final_index_iterator4 = NIL;
																										try {
																											final_index_iterator4 = kb_mapping_macros.new_final_index_iterator(final_index_spec4, $GAF, NIL, NIL);
																											SubLObject done_var_$230 = NIL;
																											final SubLObject token_var_$231 = NIL;
																											while (NIL == done_var_$230) {
																												final SubLObject gaf4 = iteration.iteration_next_without_values_macro_helper(final_index_iterator4, token_var_$231);
																												final SubLObject valid_$232 = makeBoolean(!token_var_$231.eql(gaf4));
																												if (NIL != valid_$232) {
																													SubLObject current5;
																													final SubLObject datum5 = current5 = list_utilities.first_n(THREE_INTEGER, assertions_high.gaf_args(gaf4));
																													SubLObject source4 = NIL;
																													SubLObject source_type4 = NIL;
																													SubLObject type_type4 = NIL;
																													destructuring_bind_must_consp(current5, datum5, $list422);
																													source4 = current5.first();
																													current5 = current5.rest();
																													destructuring_bind_must_consp(current5, datum5, $list422);
																													source_type4 = current5.first();
																													current5 = current5.rest();
																													destructuring_bind_must_consp(current5, datum5, $list422);
																													type_type4 = current5.first();
																													current5 = current5.rest();
																													if (NIL == current5) {
																														add_categorized_fet_source(source4, source_type4, type_type4, project4);
																													} else {
																														cdestructuring_bind_error(datum5, $list422);
																													}
																												}
																												done_var_$230 = makeBoolean(NIL == valid_$232);
																											}
																										} finally {
																											final SubLObject _prev_bind_0_$221 = $is_thread_performing_cleanupP$.currentBinding(thread);
																											try {
																												$is_thread_performing_cleanupP$.bind(T, thread);
																												final SubLObject _values6 = getValuesAsVector();
																												if (NIL != final_index_iterator4) {
																													kb_mapping_macros.destroy_final_index_iterator(final_index_iterator4);
																												}
																												restoreValuesFromVector(_values6);
																											} finally {
																												$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$221, thread);
																											}
																										}
																									}
																									done_var4 = makeBoolean(NIL == valid4);
																								}
																							}
																						}
																					}
																					csome_list_var3 = csome_list_var3.rest();
																					project4 = csome_list_var3.first();
																				}
																			} else {
																				Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol2);
																			}

																		} finally {
																			sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$219, thread);
																		}
																		cdolist_list_var_$248 = cdolist_list_var_$248.rest();
																		generating_fn = cdolist_list_var_$248.first();
																	}
																}

															} finally {
																sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$210, thread);
																sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$210, thread);
															}
															cdolist_list_var = cdolist_list_var.rest();
															module_var = cdolist_list_var.first();
														}
														SubLObject cdolist_list_var2;
														final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
														SubLObject module_var2 = NIL;
														module_var2 = cdolist_list_var2.first();
														while (NIL != cdolist_list_var2) {
															final SubLObject _prev_bind_0_$222 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
															final SubLObject _prev_bind_1_$211 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
															try {
																sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
																sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																final SubLObject node2 = function_terms.naut_to_nart(node_var_$208);
																if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
																	final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																	if (NIL != d_link2) {
																		final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																		if (NIL != mt_links2) {
																			SubLObject iteration_state2;
																			for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
																				thread.resetMultipleValues();
																				final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
																				final SubLObject tv_links2 = thread.secondMultipleValue();
																				thread.resetMultipleValues();
																				if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
																					final SubLObject _prev_bind_0_$223 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																					try {
																						sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
																						SubLObject iteration_state_$224;
																						for (iteration_state_$224 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$224); iteration_state_$224 = dictionary_contents.do_dictionary_contents_next(iteration_state_$224)) {
																							thread.resetMultipleValues();
																							final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$224);
																							final SubLObject link_nodes4 = thread.secondMultipleValue();
																							thread.resetMultipleValues();
																							if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
																								final SubLObject _prev_bind_0_$224 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																								try {
																									sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
																									final SubLObject sol3 = link_nodes4;
																									if (NIL != set.set_p(sol3)) {
																										final SubLObject set_contents_var3 = set.do_set_internal(sol3);
																										SubLObject basis_object3;
																										SubLObject state3;
																										SubLObject node_vars_link_node;
																										for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
																											node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
																											if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
																												sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
																												deck.deck_push(node_vars_link_node, recur_deck);
																											}
																										}
																									} else if (sol3.isList()) {
																										SubLObject csome_list_var4 = sol3;
																										SubLObject node_vars_link_node2 = NIL;
																										node_vars_link_node2 = csome_list_var4.first();
																										while (NIL != csome_list_var4) {
																											if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
																												sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
																												deck.deck_push(node_vars_link_node2, recur_deck);
																											}
																											csome_list_var4 = csome_list_var4.rest();
																											node_vars_link_node2 = csome_list_var4.first();
																										}
																									} else {
																										Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol3);
																									}

																								} finally {
																									sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$224, thread);
																								}
																							}
																						}
																						dictionary_contents.do_dictionary_contents_finalize(iteration_state_$224);
																					} finally {
																						sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$223, thread);
																					}
																				}
																			}
																			dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
																		}
																	} else {
																		sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str283$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																	}
																} else if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
																	SubLObject cdolist_list_var_$249;
																	final SubLObject new_list2 = cdolist_list_var_$249 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																			: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																	SubLObject generating_fn2 = NIL;
																	generating_fn2 = cdolist_list_var_$249.first();
																	while (NIL != cdolist_list_var_$249) {
																		final SubLObject _prev_bind_0_$225 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																		try {
																			sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
																			final SubLObject sol4;
																			final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
																			if (NIL != set.set_p(sol4)) {
																				final SubLObject set_contents_var4 = set.do_set_internal(sol4);
																				SubLObject basis_object4;
																				SubLObject state4;
																				SubLObject node_vars_link_node3;
																				for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
																					node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
																					if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
																						sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
																						deck.deck_push(node_vars_link_node3, recur_deck);
																					}
																				}
																			} else if (sol4.isList()) {
																				SubLObject csome_list_var5 = sol4;
																				SubLObject node_vars_link_node4 = NIL;
																				node_vars_link_node4 = csome_list_var5.first();
																				while (NIL != csome_list_var5) {
																					if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
																						sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
																						deck.deck_push(node_vars_link_node4, recur_deck);
																					}
																					csome_list_var5 = csome_list_var5.rest();
																					node_vars_link_node4 = csome_list_var5.first();
																				}
																			} else {
																				Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol4);
																			}

																		} finally {
																			sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$225, thread);
																		}
																		cdolist_list_var_$249 = cdolist_list_var_$249.rest();
																		generating_fn2 = cdolist_list_var_$249.first();
																	}
																}

															} finally {
																sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$211, thread);
																sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$222, thread);
															}
															cdolist_list_var2 = cdolist_list_var2.rest();
															module_var2 = cdolist_list_var2.first();
														}
														node_var_$208 = deck.deck_pop(recur_deck);
													}
												} finally {
													sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$215, thread);
													sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$209, thread);
													sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$209, thread);
												}
											} else {
												sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str285$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
											}
										} finally {
											sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$216, thread);
											sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$215, thread);
											sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$214, thread);
											sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$208, thread);
											sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$208, thread);
										}
									} finally {
										sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$207, thread);
										sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$207, thread);
									}
								} finally {
									final SubLObject _prev_bind_0_$226 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values7 = getValuesAsVector();
										sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
										restoreValuesFromVector(_values7);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$226, thread);
									}
								}
							} finally {
								sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$206, thread);
							}
						} finally {
							final SubLObject _prev_bind_0_$227 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
								$is_thread_performing_cleanupP$.bind(T, thread);
								final SubLObject _values8 = getValuesAsVector();
								sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
								restoreValuesFromVector(_values8);
							} finally {
								$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$227, thread);
							}
						}
					} finally {
						sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$206, thread);
						sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$205, thread);
					}
				} finally {
					mt_relevance_macros.$mt$.rebind(_prev_bind_1_$205, thread);
					mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$204, thread);
				}
				noting_progress_postamble();
			} finally {
				$silent_progressP$.rebind(_prev_bind_8, thread);
				$is_noting_progressP$.rebind(_prev_bind_7, thread);
				$progress_count$.rebind(_prev_bind_6, thread);
				$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
				$progress_notification_count$.rebind(_prev_bind_4, thread);
				$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
				$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
				$progress_start_time$.rebind(_prev_bind_0, thread);
			}
		}
		return $fet_categorized_sources$.getGlobalValue();
	}

	public static SubLObject maybe_initialize_fet_sources() {
		if (NIL == dictionary.dictionary_p($fet_categorized_sources$.getGlobalValue())) {
			initialize_fet_sources();
		}
		return $fet_categorized_sources$.getGlobalValue();
	}

	public static SubLObject type_type_dict_for_project(final SubLObject project, SubLObject create_if_noneP) {
		if (create_if_noneP == UNPROVIDED) {
			create_if_noneP = NIL;
		}
		maybe_initialize_fet_sources();
		SubLObject type_type_dict = dictionary.dictionary_lookup($fet_categorized_sources$.getGlobalValue(), project, NIL);
		if ((NIL == type_type_dict) && (NIL != create_if_noneP)) {
			type_type_dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
			dictionary.dictionary_enter($fet_categorized_sources$.getGlobalValue(), project, type_type_dict);
		}
		return type_type_dict;
	}

	public static SubLObject source_type_dict_for_type_type(final SubLObject type_type, final SubLObject type_type_dict, SubLObject create_if_noneP) {
		if (create_if_noneP == UNPROVIDED) {
			create_if_noneP = NIL;
		}
		if (NIL == type_type_dict) {
			return NIL;
		}
		SubLObject source_type_dict = dictionary.dictionary_lookup(type_type_dict, type_type, NIL);
		if ((NIL == source_type_dict) && (NIL != create_if_noneP)) {
			source_type_dict = new_fet_source_type_dictionary(type_type);
			dictionary.dictionary_enter(type_type_dict, type_type, source_type_dict);
		}
		return source_type_dict;
	}

	public static SubLObject new_fet_source_type_dictionary(final SubLObject type_type) {
		return dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
	}

	public static SubLObject get_categorized_source_cws_for_project(final SubLObject project, final SubLObject valid_source_types_collection, final SubLObject mt) {
		if ((NIL != fet_categorized_source_pred()) && mt.eql($$InferencePSC)) {
			final SubLObject type_type_dict = type_type_dict_for_project(project, NIL);
			final SubLObject source_type_dict = (NIL != type_type_dict) ? dictionary.dictionary_lookup(type_type_dict, valid_source_types_collection, UNPROVIDED) : fet_empty_source_dictionary();
			return NIL != source_type_dict ? source_type_dict : fet_empty_source_dictionary();
		}
		return get_categorized_source_cws_for_project_old(project, valid_source_types_collection, mt);
	}

	public static SubLObject get_categorized_source_cws_for_project_old(final SubLObject project, final SubLObject valid_source_types_collection, final SubLObject mt) {
		final SubLObject stored_pred = fet_categorized_source_pred();
		final SubLObject query_sentence = (NIL != stored_pred) ? list(stored_pred, $sym423$_CW, $sym424$_CW_TYPE, valid_source_types_collection, project) : list($$and, list($$projectSource_FactEntry, $sym423$_CW, project), $list426, list($$assertedSentence, list($$isa, $sym424$_CW_TYPE, valid_source_types_collection)));
		final SubLObject template = $list427;
		final SubLObject v_properties = $list164;
		final SubLObject ask_result = ask_utilities.query_template(template, query_sentence, mt, v_properties);
		final SubLObject results_dictionary = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
		SubLObject cdolist_list_var = ask_result;
		SubLObject binding = NIL;
		binding = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject current;
			final SubLObject datum = current = binding;
			SubLObject cw_type = NIL;
			SubLObject cw = NIL;
			destructuring_bind_must_consp(current, datum, $list428);
			cw_type = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list428);
			cw = current.first();
			current = current.rest();
			if (NIL == current) {
				dictionary_utilities.dictionary_push(results_dictionary, cw_type, cw);
			} else {
				cdestructuring_bind_error(datum, $list428);
			}
			cdolist_list_var = cdolist_list_var.rest();
			binding = cdolist_list_var.first();
		}
		return results_dictionary;
	}

	public static SubLObject get_lisp_implementation_type() {
		return Environment.lisp_implementation_type();
	}

	public static SubLObject get_lisp_implementation_version() {
		return Environment.lisp_implementation_version();
	}

	public static SubLObject reconsider_template_formula_using_tms(final SubLObject the_formula, SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != el_formula_p(the_formula) : "el_utilities.el_formula_p(the_formula) " + "CommonSymbols.NIL != el_utilities.el_formula_p(the_formula) " + the_formula;
		mt = hlmt_czer.coerce_to_hlmt(mt);
		final SubLObject assertion_var = cycl_variables.make_el_var($str432$_ASSERTION_SENTENCE_908234);
		final SubLObject formula = list($$assertionSentence, assertion_var, the_formula);
		final SubLObject results = ask_utilities.query_template(assertion_var, formula, mt, $list164);
		SubLObject error_message = NIL;
		SubLObject cdolist_list_var = results;
		SubLObject assertion = NIL;
		assertion = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			try {
				thread.throwStack.push($catch_error_message_target$.getGlobalValue());
				final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
				try {
					Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
					try {
						tms.tms_reconsider_assertion(assertion);
					} catch (final Throwable catch_var) {
						Errors.handleThrowable(catch_var, NIL);
					}
				} finally {
					Errors.$error_handler$.rebind(_prev_bind_0, thread);
				}
			} catch (final Throwable ccatch_env_var) {
				error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
			} finally {
				thread.throwStack.pop();
			}
			cdolist_list_var = cdolist_list_var.rest();
			assertion = cdolist_list_var.first();
		}
		return sublisp_null(error_message);
	}

	public static SubLObject clear_all_api_widgets_caches() {
		fact_sheets.clear_all_fact_sheet_caches();
		clear_get_instances_as_renderings();
		clear_get_example_instances_as_renderings();
		clear_get_salient_exemplars();
		clear_source_conceptual_works_for_project();
		clear_get_reformulation_specification_from_kb();
		clear_default_nl_preds_for_type_list();
		reset_collection_instances_caching();
		query_library_utils.clear_cae_fact_editor_focal_types();
		query_library_utils.clear_cae_kb_parameters();
		query_library_api.clear_query_library_caches(UNPROVIDED, UNPROVIDED);
		return NIL;
	}

	public static SubLObject rtv_wizard_default_predicates(final SubLObject domain_mt) {
		final SubLObject terms = ask_utilities.query_variable($sym435$_Y, $list436, domain_mt, $list437);
		final SubLObject renderers = get_term_list_as_renderings(terms, domain_mt, $NONE, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		return renderers;
	}

	public static SubLObject valid_term_for_enumerated_collectionP(final SubLObject v_term) {
		if (NIL != term_qua_inference_binding_p(v_term)) {
			return valid_term_qua_inference_binding_p(v_term);
		}
		return makeBoolean((NIL == term.skolem_nartP(v_term)) && (NIL == term.skolem_termP(v_term)));
	}

	public static SubLObject clear_collection_creation_template() {
		final SubLObject cs = $collection_creation_template_caching_state$.getGlobalValue();
		if (NIL != cs) {
			memoization_state.caching_state_clear(cs);
		}
		return NIL;
	}

	public static SubLObject remove_collection_creation_template() {
		return memoization_state.caching_state_remove_function_results_with_args($collection_creation_template_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject collection_creation_template_internal() {
		return constants_high.find_constant_by_guid_string($str439$8665a79e_80ca_11db_8000_0020ed7aa);
	}

	public static SubLObject collection_creation_template() {
		SubLObject caching_state = $collection_creation_template_caching_state$.getGlobalValue();
		if (NIL == caching_state) {
			caching_state = memoization_state.create_global_caching_state_for_name(COLLECTION_CREATION_TEMPLATE, $collection_creation_template_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
		}
		SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
		if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			results = arg2(resetMultipleValues(), multiple_value_list(collection_creation_template_internal()));
			memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
		}
		return memoization_state.caching_results(results);
	}

	public static SubLObject create_collection_from_set(final SubLObject set_formula, final SubLObject domain_mt, SubLObject name_string, SubLObject language_mt, SubLObject mt) {
		if (name_string == UNPROVIDED) {
			name_string = NIL;
		}
		if (language_mt == UNPROVIDED) {
			language_mt = NIL;
		}
		if (mt == UNPROVIDED) {
			mt = $$UniversalVocabularyMt;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject collection = kb_utilities.set_to_collection(set_formula, domain_mt);
		final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
		try {
			kb_control_vars.$forward_inference_allowed_rules$.bind(forward.creation_template_allowable_rules(collection_creation_template()), thread);
			rkf_assertion_utilities.rkf_assert(listS($$isa, collection, $list442), mt, UNPROVIDED, UNPROVIDED);
			if (NIL != name_string) {
				rkf_assertion_utilities.rkf_assert_now(list($$nameString, collection, name_string), language_mt);
			}
		} finally {
			kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
		}
		return collection;
	}

	public static SubLObject create_collection_from_enumerated_terms(final SubLObject terms, final SubLObject domain_mt, SubLObject name_string, SubLObject language_mt, SubLObject basename, SubLObject mt, SubLObject v_genls) {
		if (name_string == UNPROVIDED) {
			name_string = NIL;
		}
		if (language_mt == UNPROVIDED) {
			language_mt = NIL;
		}
		if (basename == UNPROVIDED) {
			basename = $$$UserCreatedCollection;
		}
		if (mt == UNPROVIDED) {
			mt = $$UniversalVocabularyMt;
		}
		if (v_genls == UNPROVIDED) {
			v_genls = $COMPUTE;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject valid_terms = list_utilities.remove_if_not(symbol_function($sym447$VALID_TERM_FOR_ENUMERATED_COLLECTION_), terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != valid_terms) {
			SubLObject new_term = NIL;
			final SubLObject rules = forward.creation_template_allowable_rules(collection_creation_template());
			final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
			try {
				kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
				final SubLObject isas = $list442;
				final SubLObject new_constant = rkf_term_utilities.create_new_constant(basename, isas, NIL, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				add_to_collection_from_enumerated_terms(new_constant, valid_terms, domain_mt, v_genls);
				rkf_assertion_utilities.rkf_assert(list($$completelyAssertedCollection, new_constant), domain_mt, UNPROVIDED, UNPROVIDED);
				if (NIL != name_string) {
					rkf_assertion_utilities.rkf_assert_now(list($$nameString, new_constant, name_string), language_mt);
				}
				new_term = new_constant;
			} finally {
				kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
			}
			return new_term;
		}
		return NIL;
	}

	public static SubLObject add_to_collection_from_enumerated_terms(final SubLObject collection, final SubLObject new_instances, final SubLObject domain_mt, SubLObject v_genls) {
		if (v_genls == UNPROVIDED) {
			v_genls = $COMPUTE;
		}
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject valid_new_instances = list_utilities.remove_if_not(symbol_function($sym447$VALID_TERM_FOR_ENUMERATED_COLLECTION_), new_instances, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		if (NIL != valid_new_instances) {
			final SubLObject resolved_new_instances = transform_list_utilities.transform(valid_new_instances, VALID_TERM_QUA_INFERENCE_BINDING_P, RESOLVE_TERM_QUA_INFERENCE_BINDING, UNPROVIDED);
			final SubLObject rules = forward.creation_template_allowable_rules(collection_creation_template());
			final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_allowed_rules$.currentBinding(thread);
			try {
				kb_control_vars.$forward_inference_allowed_rules$.bind(rules, thread);
				if (NIL == list_utilities.proper_list_p(v_genls)) {
					v_genls = genls_for_collection_from_enumerated_terms(valid_new_instances, domain_mt);
				}
				SubLObject cdolist_list_var = v_genls;
				SubLObject genl = NIL;
				genl = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					rkf_assertion_utilities.rkf_assert_with_implicature(list($$genls, collection, genl), domain_mt, T);
					cdolist_list_var = cdolist_list_var.rest();
					genl = cdolist_list_var.first();
				}
				cdolist_list_var = resolved_new_instances;
				SubLObject v_term = NIL;
				v_term = cdolist_list_var.first();
				while (NIL != cdolist_list_var) {
					rkf_assertion_utilities.rkf_assert(list($$isa, v_term, collection), domain_mt, UNPROVIDED, UNPROVIDED);
					cdolist_list_var = cdolist_list_var.rest();
					v_term = cdolist_list_var.first();
				}
			} finally {
				kb_control_vars.$forward_inference_allowed_rules$.rebind(_prev_bind_0, thread);
			}
			return collection;
		}
		return NIL;
	}

	public static SubLObject genls_for_collection_from_enumerated_terms(final SubLObject terms, final SubLObject domain_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (NIL == list_utilities.find_if_not(INDEXED_TERM_P, terms, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
			return isa.min_ceiling_isa(terms, NIL, domain_mt, UNPROVIDED);
		}
		SubLObject first_term = NIL;
		SubLObject remaining_terms = NIL;
		destructuring_bind_must_consp(terms, terms, $list453);
		first_term = terms.first();
		SubLObject current;
		SubLObject isas;
		SubLObject next_term;
		for (current = remaining_terms = terms.rest(), isas = all_isa_for_collection_from_enumerated_terms(first_term, domain_mt); (NIL != isas) && (NIL != remaining_terms); remaining_terms = remaining_terms.rest(), isas = intersection(isas, all_isa_for_collection_from_enumerated_terms(next_term, domain_mt), UNPROVIDED, UNPROVIDED)) {
			next_term = remaining_terms.first();
		}
		final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(domain_mt);
		final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
		try {
			mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
			mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
			mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
			isas = genls.min_cols(isas, UNPROVIDED, UNPROVIDED);
		} finally {
			mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
		}
		return NIL != isas ? isas : $list454;
	}

	public static SubLObject all_isa_for_collection_from_enumerated_terms(final SubLObject v_term, final SubLObject domain_mt) {
		if (NIL != valid_term_qua_inference_binding_p(v_term)) {
			return term_qua_inference_binding_all_isa(v_term, domain_mt);
		}
		return isa.all_isa(v_term, domain_mt, UNPROVIDED);
	}

	public static SubLObject find_external_ais_terms_in_inference(final SubLObject problem_store_id, final SubLObject inference_id) {
		assert NIL != subl_promotions.non_negative_integer_p(problem_store_id) : "subl_promotions.non_negative_integer_p(problem_store_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(problem_store_id) " + problem_store_id;
		assert NIL != subl_promotions.non_negative_integer_p(inference_id) : "subl_promotions.non_negative_integer_p(inference_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(inference_id) " + inference_id;
		final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(problem_store_id, inference_id);
		SubLObject terms = NIL;
		if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
			final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
			if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
				final SubLObject idx_$267 = idx;
				if (NIL == id_index_dense_objects_empty_p(idx_$267, $SKIP)) {
					final SubLObject vector_var = id_index_dense_objects(idx_$267);
					final SubLObject backwardP_var = NIL;
					SubLObject length;
					SubLObject v_iteration;
					SubLObject id;
					SubLObject v_answer;
					SubLObject cdolist_list_var;
					SubLObject binding;
					SubLObject current;
					SubLObject datum;
					SubLObject variable;
					SubLObject value;
					SubLObject item_var;
					for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
						id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
						v_answer = aref(vector_var, id);
						if ((NIL == id_index_tombstone_p(v_answer)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
							if (NIL != id_index_tombstone_p(v_answer)) {
								v_answer = $SKIP;
							}
							cdolist_list_var = inference_datastructures_inference.inference_answer_bindings(v_answer);
							binding = NIL;
							binding = cdolist_list_var.first();
							while (NIL != cdolist_list_var) {
								datum = current = binding;
								variable = NIL;
								value = NIL;
								destructuring_bind_must_consp(current, datum, $list458);
								variable = current.first();
								current = current.rest();
								value = item_var = current;
								if (NIL == member(item_var, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
									terms = cons(item_var, terms);
								}
								cdolist_list_var = cdolist_list_var.rest();
								binding = cdolist_list_var.first();
							}
						}
					}
				}
				final SubLObject idx_$268 = idx;
				if (NIL == id_index_sparse_objects_empty_p(idx_$268)) {
					final SubLObject cdohash_table = id_index_sparse_objects(idx_$268);
					SubLObject id2 = NIL;
					SubLObject v_answer2 = NIL;
					final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
					try {
						while (iteratorHasNext(cdohash_iterator)) {
							final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
							id2 = getEntryKey(cdohash_entry);
							v_answer2 = getEntryValue(cdohash_entry);
							SubLObject cdolist_list_var2 = inference_datastructures_inference.inference_answer_bindings(v_answer2);
							SubLObject binding2 = NIL;
							binding2 = cdolist_list_var2.first();
							while (NIL != cdolist_list_var2) {
								SubLObject current2;
								final SubLObject datum2 = current2 = binding2;
								SubLObject variable2 = NIL;
								SubLObject value2 = NIL;
								destructuring_bind_must_consp(current2, datum2, $list458);
								variable2 = current2.first();
								current2 = current2.rest();
								final SubLObject item_var2;
								value2 = item_var2 = current2;
								if (NIL == member(item_var2, terms, symbol_function(EQUAL), symbol_function(IDENTITY))) {
									terms = cons(item_var2, terms);
								}
								cdolist_list_var2 = cdolist_list_var2.rest();
								binding2 = cdolist_list_var2.first();
							}
						}
					} finally {
						releaseEntrySetIterator(cdohash_iterator);
					}
				}
			}
		}
		return find_external_ais_terms(terms);
	}

	public static SubLObject find_external_ais_terms(final SubLObject terms) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
		final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
		try {
			mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
			mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
			SubLObject cdolist_list_var = terms;
			SubLObject v_term = NIL;
			v_term = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				if (NIL != indexed_term_p(v_term)) {
					final SubLObject pred_var = $$synonymousExternalConcept;
					if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, ONE_INTEGER, pred_var)) {
						final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, ONE_INTEGER, pred_var);
						SubLObject done_var = NIL;
						final SubLObject token_var = NIL;
						while (NIL == done_var) {
							final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
							final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
							if (NIL != valid) {
								SubLObject final_index_iterator = NIL;
								try {
									final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
									SubLObject done_var_$269 = NIL;
									final SubLObject token_var_$270 = NIL;
									while (NIL == done_var_$269) {
										final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$270);
										final SubLObject valid_$271 = makeBoolean(!token_var_$270.eql(gaf));
										if (NIL != valid_$271) {
											SubLObject current;
											final SubLObject datum = current = assertions_high.gaf_args(gaf);
											SubLObject ignore_me = NIL;
											SubLObject ais = NIL;
											SubLObject id = NIL;
											destructuring_bind_must_consp(current, datum, $list461);
											ignore_me = current.first();
											current = current.rest();
											destructuring_bind_must_consp(current, datum, $list461);
											ais = current.first();
											current = current.rest();
											destructuring_bind_must_consp(current, datum, $list461);
											id = current.first();
											current = current.rest();
											if (NIL == current) {
												final SubLObject item_var = list(v_term, ais, id);
												if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
													ans = cons(item_var, ans);
												}
											} else {
												cdestructuring_bind_error(datum, $list461);
											}
										}
										done_var_$269 = makeBoolean(NIL == valid_$271);
									}
								} finally {
									final SubLObject _prev_bind_0_$272 = $is_thread_performing_cleanupP$.currentBinding(thread);
									try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										final SubLObject _values = getValuesAsVector();
										if (NIL != final_index_iterator) {
											kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
										}
										restoreValuesFromVector(_values);
									} finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$272, thread);
									}
								}
							}
							done_var = makeBoolean(NIL == valid);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				v_term = cdolist_list_var.first();
			}
		} finally {
			mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
			mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
		}
		return ans;
	}

	public static SubLObject valid_term_qua_inference_binding_p(final SubLObject v_object) {
		SubLObject ans = NIL;
		if (NIL != term_qua_inference_binding_p(v_object)) {
			SubLObject current;
			final SubLObject datum = current = v_object.rest();
			SubLObject store_id = NIL;
			SubLObject inf_id = NIL;
			SubLObject ans_id = NIL;
			SubLObject var = NIL;
			destructuring_bind_must_consp(current, datum, $list462);
			store_id = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list462);
			inf_id = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list462);
			ans_id = current.first();
			current = current.rest();
			destructuring_bind_must_consp(current, datum, $list462);
			var = current.first();
			current = current.rest();
			if (NIL == current) {
				final SubLObject inference_answer = inference_datastructures_inference.find_inference_answer_by_ids(store_id, inf_id, ans_id);
				if ((NIL != inference_datastructures_inference.valid_inference_answer_p(inference_answer)) && (NIL != member(var, bindings.bindings_variables(inference_datastructures_inference.inference_answer_bindings(inference_answer)), UNPROVIDED, UNPROVIDED))) {
					ans = T;
				}
			} else {
				cdestructuring_bind_error(datum, $list462);
			}
		}
		return ans;
	}

	public static SubLObject term_qua_inference_binding_all_isa(final SubLObject v_term, final SubLObject domain_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != valid_term_qua_inference_binding_p(v_term) : "api_widgets.valid_term_qua_inference_binding_p(v_term) " + "CommonSymbols.NIL != api_widgets.valid_term_qua_inference_binding_p(v_term) " + v_term;
		final SubLObject resolved_term = resolve_term_qua_inference_binding(v_term);
		SubLObject types = (NIL != indexed_term_p(resolved_term)) ? isa.all_isa(resolved_term, domain_mt, UNPROVIDED) : NIL;
		if (NIL != indexed_term_p(resolved_term)) {
			types = isa.all_isa(resolved_term, domain_mt, UNPROVIDED);
		}
		final SubLObject inference_answer = term_qua_inference_binding_get_inference_answer(v_term);
		final SubLObject var = $sym50$_X;
		final SubLObject proven_sentence = inference_datastructures_inference.inference_answer_el_sentence(inference_answer);
		final SubLObject subbed_proven_sentence = cycl_utilities.expression_subst(var, resolved_term, proven_sentence, symbol_function(EQUAL), UNPROVIDED);
		SubLObject sentences = list(subbed_proven_sentence);
		SubLObject cdolist_list_var = inference_datastructures_inference.inference_answer_justifications(inference_answer);
		SubLObject just = NIL;
		just = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject cdolist_list_var_$273 = inference_datastructures_inference.inference_answer_justification_supports(just);
			SubLObject support = NIL;
			support = cdolist_list_var_$273.first();
			while (NIL != cdolist_list_var_$273) {
				if (NIL != cycl_utilities.expression_find(resolved_term, arguments.support_sentence(support), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED)) {
					final SubLObject item_var = cycl_utilities.expression_subst(var, resolved_term, arguments.support_sentence(support), symbol_function(EQUAL), UNPROVIDED);
					if (NIL == member(item_var, sentences, symbol_function(EQUAL), symbol_function(IDENTITY))) {
						sentences = cons(item_var, sentences);
					}
				}
				cdolist_list_var_$273 = cdolist_list_var_$273.rest();
				support = cdolist_list_var_$273.first();
			}
			cdolist_list_var = cdolist_list_var.rest();
			just = cdolist_list_var.first();
		}
		cdolist_list_var = sentences;
		SubLObject sentence = NIL;
		sentence = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(term_qua_inference_binding_get_problem_store(v_term));
			final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
			try {
				memoization_state.$memoization_state$.bind(local_state, thread);
				final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
				try {
					SubLObject cdolist_list_var_$274 = variable_isa_constraints_memoized(var, sentence, domain_mt);
					SubLObject type = NIL;
					type = cdolist_list_var_$274.first();
					while (NIL != cdolist_list_var_$274) {
						SubLObject node_var = type;
						final SubLObject deck_type = $STACK;
						final SubLObject recur_deck = deck.create_deck(deck_type);
						final SubLObject _prev_bind_0_$275 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
						try {
							sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
							try {
								final SubLObject _prev_bind_0_$276 = mt_relevance_macros.$mt$.currentBinding(thread);
								final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
								final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
								try {
									mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(domain_mt), thread);
									mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(domain_mt), thread);
									mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(domain_mt), thread);
									final SubLObject tv_var = NIL;
									final SubLObject _prev_bind_0_$277 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
									final SubLObject _prev_bind_1_$278 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
									try {
										sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
										sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
										if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
											final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
											if (pcase_var.eql($ERROR)) {
												sbhl_paranoia.sbhl_error(ONE_INTEGER, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											} else if (pcase_var.eql($CERROR)) {
												sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
											} else if (pcase_var.eql($WARN)) {
												Errors.warn($str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
											} else {
												Errors.warn($str281$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
												Errors.cerror($$$continue_anyway, $str276$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
											}

										}
										final SubLObject _prev_bind_0_$278 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
										final SubLObject _prev_bind_1_$279 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
										final SubLObject _prev_bind_2_$281 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
										final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
										final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
										try {
											sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
											sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
											sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
											sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
											sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
											if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(type, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
												final SubLObject _prev_bind_0_$279 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
												final SubLObject _prev_bind_1_$280 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
												final SubLObject _prev_bind_2_$282 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
												try {
													sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
													sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
													sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
													sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
													while (NIL != node_var) {
														final SubLObject item_var2;
														final SubLObject genl_type = item_var2 = node_var;
														if (NIL == member(item_var2, types, symbol_function(EQUAL), symbol_function(IDENTITY))) {
															types = cons(item_var2, types);
														}
														SubLObject cdolist_list_var_$275;
														final SubLObject accessible_modules = cdolist_list_var_$275 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
														SubLObject module_var = NIL;
														module_var = cdolist_list_var_$275.first();
														while (NIL != cdolist_list_var_$275) {
															final SubLObject _prev_bind_0_$280 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
															final SubLObject _prev_bind_1_$281 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
															try {
																sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
																sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
																final SubLObject node = function_terms.naut_to_nart(node_var);
																if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
																	final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																	if (NIL != d_link) {
																		final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																		if (NIL != mt_links) {
																			SubLObject iteration_state;
																			for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
																				thread.resetMultipleValues();
																				final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
																				final SubLObject tv_links = thread.secondMultipleValue();
																				thread.resetMultipleValues();
																				if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
																					final SubLObject _prev_bind_0_$281 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
																					try {
																						sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
																						SubLObject iteration_state_$289;
																						for (iteration_state_$289 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$289); iteration_state_$289 = dictionary_contents.do_dictionary_contents_next(iteration_state_$289)) {
																							thread.resetMultipleValues();
																							final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$289);
																							final SubLObject link_nodes = thread.secondMultipleValue();
																							thread.resetMultipleValues();
																							if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
																								final SubLObject _prev_bind_0_$282 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
																								try {
																									sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
																									final SubLObject sol = link_nodes;
																									if (NIL != set.set_p(sol)) {
																										final SubLObject set_contents_var = set.do_set_internal(sol);
																										SubLObject basis_object;
																										SubLObject state;
																										SubLObject node_vars_link_node;
																										for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
																											node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
																											if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
																												sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
																												deck.deck_push(node_vars_link_node, recur_deck);
																											}
																										}
																									} else if (sol.isList()) {
																										SubLObject csome_list_var = sol;
																										SubLObject node_vars_link_node2 = NIL;
																										node_vars_link_node2 = csome_list_var.first();
																										while (NIL != csome_list_var) {
																											if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
																												sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
																												deck.deck_push(node_vars_link_node2, recur_deck);
																											}
																											csome_list_var = csome_list_var.rest();
																											node_vars_link_node2 = csome_list_var.first();
																										}
																									} else {
																										Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol);
																									}

																								} finally {
																									sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$282, thread);
																								}
																							}
																						}
																						dictionary_contents.do_dictionary_contents_finalize(iteration_state_$289);
																					} finally {
																						sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$281, thread);
																					}
																				}
																			}
																			dictionary_contents.do_dictionary_contents_finalize(iteration_state);
																		}
																	} else {
																		sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str283$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
																	}
																} else if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
																	SubLObject cdolist_list_var_$276;
																	final SubLObject new_list = cdolist_list_var_$276 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
																			: sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
																	SubLObject generating_fn = NIL;
																	generating_fn = cdolist_list_var_$276.first();
																	while (NIL != cdolist_list_var_$276) {
																		final SubLObject _prev_bind_0_$283 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
																		try {
																			sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
																			final SubLObject sol2;
																			final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
																			if (NIL != set.set_p(sol2)) {
																				final SubLObject set_contents_var2 = set.do_set_internal(sol2);
																				SubLObject basis_object2;
																				SubLObject state2;
																				SubLObject node_vars_link_node3;
																				for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
																					node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
																					if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
																						sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
																						deck.deck_push(node_vars_link_node3, recur_deck);
																					}
																				}
																			} else if (sol2.isList()) {
																				SubLObject csome_list_var2 = sol2;
																				SubLObject node_vars_link_node4 = NIL;
																				node_vars_link_node4 = csome_list_var2.first();
																				while (NIL != csome_list_var2) {
																					if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
																						sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
																						deck.deck_push(node_vars_link_node4, recur_deck);
																					}
																					csome_list_var2 = csome_list_var2.rest();
																					node_vars_link_node4 = csome_list_var2.first();
																				}
																			} else {
																				Errors.error($str282$_A_is_neither_SET_P_nor_LISTP_, sol2);
																			}

																		} finally {
																			sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$283, thread);
																		}
																		cdolist_list_var_$276 = cdolist_list_var_$276.rest();
																		generating_fn = cdolist_list_var_$276.first();
																	}
																}

															} finally {
																sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$281, thread);
																sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$280, thread);
															}
															cdolist_list_var_$275 = cdolist_list_var_$275.rest();
															module_var = cdolist_list_var_$275.first();
														}
														node_var = deck.deck_pop(recur_deck);
													}
												} finally {
													sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$282, thread);
													sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$280, thread);
													sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$279, thread);
												}
											} else {
												sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str285$Node__a_does_not_pass_sbhl_type_t, type, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
											}
										} finally {
											sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
											sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
											sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$281, thread);
											sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$279, thread);
											sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$278, thread);
										}
									} finally {
										sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$278, thread);
										sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$277, thread);
									}
								} finally {
									mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
									mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
									mt_relevance_macros.$mt$.rebind(_prev_bind_0_$276, thread);
								}
							} finally {
								final SubLObject _prev_bind_0_$284 = $is_thread_performing_cleanupP$.currentBinding(thread);
								try {
									$is_thread_performing_cleanupP$.bind(T, thread);
									final SubLObject _values = getValuesAsVector();
									sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
									restoreValuesFromVector(_values);
								} finally {
									$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$284, thread);
								}
							}
						} finally {
							sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$275, thread);
						}
						cdolist_list_var_$274 = cdolist_list_var_$274.rest();
						type = cdolist_list_var_$274.first();
					}
				} finally {
					final SubLObject _prev_bind_0_$285 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
						$is_thread_performing_cleanupP$.bind(T, thread);
						final SubLObject _values2 = getValuesAsVector();
						memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
						restoreValuesFromVector(_values2);
					} finally {
						$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$285, thread);
					}
				}
			} finally {
				memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
			}
			cdolist_list_var = cdolist_list_var.rest();
			sentence = cdolist_list_var.first();
		}
		return types;
	}

	public static SubLObject variable_isa_constraints_memoized_internal(final SubLObject var, final SubLObject sentence, final SubLObject domain_mt) {
		return at_var_types.formula_variable_isa_constraints(var, sentence, domain_mt, UNPROVIDED);
	}

	public static SubLObject variable_isa_constraints_memoized(final SubLObject var, final SubLObject sentence, final SubLObject domain_mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
			return variable_isa_constraints_memoized_internal(var, sentence, domain_mt);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, VARIABLE_ISA_CONSTRAINTS_MEMOIZED, UNPROVIDED);
		if (NIL == caching_state) {
			caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), VARIABLE_ISA_CONSTRAINTS_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
			memoization_state.memoization_state_put(v_memoization_state, VARIABLE_ISA_CONSTRAINTS_MEMOIZED, caching_state);
		}
		final SubLObject sxhash = memoization_state.sxhash_calc_3(var, sentence, domain_mt);
		final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
		if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
			SubLObject cdolist_list_var = collisions;
			SubLObject collision = NIL;
			collision = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
				SubLObject cached_args = collision.first();
				final SubLObject results2 = second(collision);
				if (var.equal(cached_args.first())) {
					cached_args = cached_args.rest();
					if (sentence.equal(cached_args.first())) {
						cached_args = cached_args.rest();
						if (((NIL != cached_args) && (NIL == cached_args.rest())) && domain_mt.equal(cached_args.first())) {
							return memoization_state.caching_results(results2);
						}
					}
				}
				cdolist_list_var = cdolist_list_var.rest();
				collision = cdolist_list_var.first();
			}
		}
		final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(variable_isa_constraints_memoized_internal(var, sentence, domain_mt)));
		memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(var, sentence, domain_mt));
		return memoization_state.caching_results(results3);
	}

	public static SubLObject formula_variable_arg_constraint_table(final SubLObject formula, final SubLObject mt) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject ans = NIL;
		final SubLObject isa_dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
		final SubLObject genl_dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
		SubLObject all_vars = NIL;
		final SubLObject constraint_sentence = at_var_types.inter_formula_variables_arg_constraints(formula, mt, UNPROVIDED);
		SubLObject cdolist_list_var;
		final SubLObject constraints = cdolist_list_var = (NIL != atomic_sentenceP(constraint_sentence)) ? list(constraint_sentence) : NIL != el_conjunction_p(constraint_sentence) ? cycl_utilities.formula_args(constraint_sentence, UNPROVIDED) : NIL;
		SubLObject constraint = NIL;
		constraint = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			thread.resetMultipleValues();
			SubLObject success = formula_pattern_match.formula_matches_pattern(constraint, $list465);
			SubLObject v_bindings = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL != success) {
				final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
				final SubLObject item_var;
				final SubLObject var = item_var = list_utilities.alist_lookup_without_values(v_bindings, VAR, UNPROVIDED, UNPROVIDED);
				if (NIL == member(item_var, all_vars, symbol_function(EQL), symbol_function(IDENTITY))) {
					all_vars = cons(item_var, all_vars);
				}
				dictionary_utilities.dictionary_pushnew(isa_dict, var, col, symbol_function(EQUAL), UNPROVIDED);
			}
			thread.resetMultipleValues();
			success = formula_pattern_match.formula_matches_pattern(constraint, $list468);
			v_bindings = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL != success) {
				final SubLObject col = list_utilities.alist_lookup_without_values(v_bindings, COL, UNPROVIDED, UNPROVIDED);
				final SubLObject item_var;
				final SubLObject var = item_var = list_utilities.alist_lookup_without_values(v_bindings, VAR, UNPROVIDED, UNPROVIDED);
				if (NIL == member(item_var, all_vars, symbol_function(EQL), symbol_function(IDENTITY))) {
					all_vars = cons(item_var, all_vars);
				}
				dictionary_utilities.dictionary_pushnew(genl_dict, var, col, symbol_function(EQUAL), UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			constraint = cdolist_list_var.first();
		}
		cdolist_list_var = all_vars;
		SubLObject var2 = NIL;
		var2 = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			ans = list_utilities.alist_enter(ans, var2, list(dictionary.dictionary_lookup_without_values(isa_dict, var2, NIL), dictionary.dictionary_lookup_without_values(genl_dict, var2, NIL)), UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			var2 = cdolist_list_var.first();
		}
		return ans;
	}

	public static SubLObject resolve_term_qua_inference_binding(final SubLObject v_term) {
		assert NIL != valid_term_qua_inference_binding_p(v_term) : "api_widgets.valid_term_qua_inference_binding_p(v_term) " + "CommonSymbols.NIL != api_widgets.valid_term_qua_inference_binding_p(v_term) " + v_term;
		return bindings.variable_lookup(term_qua_inference_binding_get_variable(v_term), inference_datastructures_inference.inference_answer_bindings(term_qua_inference_binding_get_inference_answer(v_term)));
	}

	public static SubLObject term_qua_inference_binding_get_problem_store(final SubLObject v_term) {
		assert NIL != valid_term_qua_inference_binding_p(v_term) : "api_widgets.valid_term_qua_inference_binding_p(v_term) " + "CommonSymbols.NIL != api_widgets.valid_term_qua_inference_binding_p(v_term) " + v_term;
		SubLObject current;
		final SubLObject datum = current = v_term.rest();
		SubLObject store_id = NIL;
		SubLObject inf_id = NIL;
		SubLObject ans_id = NIL;
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list462);
		store_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		inf_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		ans_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		var = current.first();
		current = current.rest();
		if (NIL == current) {
			return inference_datastructures_problem_store.find_problem_store_by_id(store_id);
		}
		cdestructuring_bind_error(datum, $list462);
		return NIL;
	}

	public static SubLObject term_qua_inference_binding_get_inference(final SubLObject v_term) {
		assert NIL != valid_term_qua_inference_binding_p(v_term) : "api_widgets.valid_term_qua_inference_binding_p(v_term) " + "CommonSymbols.NIL != api_widgets.valid_term_qua_inference_binding_p(v_term) " + v_term;
		SubLObject current;
		final SubLObject datum = current = v_term.rest();
		SubLObject store_id = NIL;
		SubLObject inf_id = NIL;
		SubLObject ans_id = NIL;
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list462);
		store_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		inf_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		ans_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		var = current.first();
		current = current.rest();
		if (NIL == current) {
			return inference_datastructures_problem_store.find_inference_by_ids(store_id, inf_id);
		}
		cdestructuring_bind_error(datum, $list462);
		return NIL;
	}

	public static SubLObject term_qua_inference_binding_get_inference_answer(final SubLObject v_term) {
		assert NIL != valid_term_qua_inference_binding_p(v_term) : "api_widgets.valid_term_qua_inference_binding_p(v_term) " + "CommonSymbols.NIL != api_widgets.valid_term_qua_inference_binding_p(v_term) " + v_term;
		SubLObject current;
		final SubLObject datum = current = v_term.rest();
		SubLObject store_id = NIL;
		SubLObject inf_id = NIL;
		SubLObject ans_id = NIL;
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list462);
		store_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		inf_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		ans_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		var = current.first();
		current = current.rest();
		if (NIL == current) {
			return inference_datastructures_inference.find_inference_answer_by_ids(store_id, inf_id, ans_id);
		}
		cdestructuring_bind_error(datum, $list462);
		return NIL;
	}

	public static SubLObject term_qua_inference_binding_get_variable(final SubLObject v_term) {
		assert NIL != valid_term_qua_inference_binding_p(v_term) : "api_widgets.valid_term_qua_inference_binding_p(v_term) " + "CommonSymbols.NIL != api_widgets.valid_term_qua_inference_binding_p(v_term) " + v_term;
		SubLObject current;
		final SubLObject datum = current = v_term.rest();
		SubLObject store_id = NIL;
		SubLObject inf_id = NIL;
		SubLObject ans_id = NIL;
		SubLObject var = NIL;
		destructuring_bind_must_consp(current, datum, $list462);
		store_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		inf_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		ans_id = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, datum, $list462);
		var = current.first();
		current = current.rest();
		if (NIL == current) {
			return var;
		}
		cdestructuring_bind_error(datum, $list462);
		return NIL;
	}

	public static SubLObject term_qua_inference_binding_p(final SubLObject v_object) {
		return pattern_match.tree_matches_pattern(v_object, $term_qua_inference_answer_pattern$.getGlobalValue());
	}

	public static SubLObject new_cyc_queries(final SubLObject queries, final SubLObject mt, final SubLObject query_properties) {
		SubLObject results = NIL;
		SubLObject cdolist_list_var = queries;
		SubLObject query = NIL;
		query = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject result = inference_kernel.new_cyc_query(query, mt, query_properties);
			results = cons(result, results);
			cdolist_list_var = cdolist_list_var.rest();
			query = cdolist_list_var.first();
		}
		return nreverse(results);
	}

	public static SubLObject gather_filtered_el_rule_assertions_for_term(final SubLObject v_term, final SubLObject selected_terms) {
		assert NIL != consp(selected_terms) : "Types.consp(selected_terms) " + "CommonSymbols.NIL != Types.consp(selected_terms) " + selected_terms;
		return gather_set_filtered_el_rule_assertions_for_term(v_term, set_utilities.construct_set_from_list(selected_terms, UNPROVIDED, UNPROVIDED));
	}

	public static SubLObject gather_set_filtered_el_rule_assertions_for_term(final SubLObject v_term, final SubLObject selected_term_set) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != set.set_p(selected_term_set) : "set.set_p(selected_term_set) " + "CommonSymbols.NIL != set.set_p(selected_term_set) " + selected_term_set;
		if (NIL == forts.fort_p(v_term)) {
			return NIL;
		}
		SubLObject filtered_assertions_1 = NIL;
		SubLObject filtered_assertions_2 = NIL;
		SubLObject cdolist_list_var = kb_indexing.gather_all_rule_assertions_for_term(v_term);
		SubLObject gathered_assertion = NIL;
		gathered_assertion = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject gathered_el_assertion = uncanonicalizer.assertion_el_formula(gathered_assertion);
			if ((!gathered_el_assertion.isCons()) || ((NIL == el_formula_with_any_of_operators_p(gathered_el_assertion, $list475)) && (NIL == assertion_has_non_owl_exportable_meta_assertionP(gathered_assertion)))) {
				SubLObject ignore_errors_tag = NIL;
				try {
					thread.throwStack.push($IGNORE_ERRORS_TARGET);
					final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
					try {
						Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
						try {
							if (NIL != owl_exportable_rule_assertionP(gathered_el_assertion)) {
								filtered_assertions_1 = cons(gathered_el_assertion, filtered_assertions_1);
							} else if (NIL != $allow_expanded_rules_as_owl_export_candidatesP$.getGlobalValue()) {
								gathered_el_assertion = czer_utilities.canonicalize_el_sentence(verbosifier.el_expand_all(gathered_el_assertion, $$EverythingPSC), $$EverythingPSC, UNPROVIDED);
								if (NIL != owl_exportable_rule_assertionP(gathered_el_assertion)) {
									filtered_assertions_1 = cons(gathered_el_assertion, filtered_assertions_1);
								}
							}

						} catch (final Throwable catch_var) {
							Errors.handleThrowable(catch_var, NIL);
						}
					} finally {
						Errors.$error_handler$.rebind(_prev_bind_0, thread);
					}
				} catch (final Throwable ccatch_env_var) {
					ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
				} finally {
					thread.throwStack.pop();
				}
			}
			cdolist_list_var = cdolist_list_var.rest();
			gathered_assertion = cdolist_list_var.first();
		}
		cdolist_list_var = filtered_assertions_1;
		SubLObject filtered_assertion_1 = NIL;
		filtered_assertion_1 = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			SubLObject rejectedP = NIL;
			if (NIL == rejectedP) {
				SubLObject csome_list_var = remove_duplicates(list_utilities.flatten(narts_high.nart_substitute(filtered_assertion_1)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				SubLObject assertion_term = NIL;
				assertion_term = csome_list_var.first();
				while ((NIL == rejectedP) && (NIL != csome_list_var)) {
					if (((NIL != forts.fort_p(assertion_term)) && (NIL == set.set_memberP(assertion_term, $owl_exportable_definitional_term_set$.getGlobalValue()))) && (NIL == set.set_memberP(assertion_term, selected_term_set))) {
						rejectedP = T;
					}
					csome_list_var = csome_list_var.rest();
					assertion_term = csome_list_var.first();
				}
			}
			if (NIL == rejectedP) {
				filtered_assertions_2 = cons(filtered_assertion_1, filtered_assertions_2);
			}
			cdolist_list_var = cdolist_list_var.rest();
			filtered_assertion_1 = cdolist_list_var.first();
		}
		return filtered_assertions_2;
	}

	public static SubLObject assertion_has_non_owl_exportable_meta_assertionP(final SubLObject assertion) {
		assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
		if (NIL == assertion_utilities.assertion_has_meta_assertionsP(assertion)) {
			return NIL;
		}
		if (kb_indexing.num_pragma_rule_index(assertion, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER)) {
			return T;
		}
		SubLObject cdolist_list_var;
		final SubLObject predicates = cdolist_list_var = kb_indexing.key_gaf_arg_index(assertion, TWO_INTEGER, NIL);
		SubLObject predicate = NIL;
		predicate = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (predicate.eql($$abnormal)) {
				return T;
			}
			cdolist_list_var = cdolist_list_var.rest();
			predicate = cdolist_list_var.first();
		}
		return NIL;
	}

	public static SubLObject owl_exportable_rule_assertionP(final SubLObject el_assertion) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		if (!el_assertion.isCons()) {
			return NIL;
		}
		if (NIL == el_formula_with_operator_p(el_assertion, $$implies)) {
			return NIL;
		}
		final SubLObject antecedant = second(el_assertion);
		final SubLObject consequent_literal = third(el_assertion);
		SubLObject antecedant_literals = NIL;
		SubLObject antecedant_variables = NIL;
		SubLObject consequent_variables = NIL;
		SubLObject rejectedP = NIL;
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!antecedant.isCons())) {
			Errors.error($str479$invalid_rule_antecedant__A, el_assertion);
		}
		if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!consequent_literal.isCons())) {
			Errors.error($str480$invalid_rule_consequent__A, el_assertion);
		}
		if (antecedant.first().eql($$and)) {
			antecedant_literals = antecedant.rest();
		} else {
			antecedant_literals = list(antecedant);
		}
		if (NIL == rejectedP) {
			SubLObject csome_list_var = antecedant_literals;
			SubLObject antecedant_literal = NIL;
			antecedant_literal = csome_list_var.first();
			while ((NIL == rejectedP) && (NIL != csome_list_var)) {
				if (NIL != owl_exportable_rule_literalP(antecedant_literal)) {
					SubLObject cdolist_list_var;
					final SubLObject v_variables = cdolist_list_var = literal_variables(antecedant_literal, UNPROVIDED, UNPROVIDED);
					SubLObject variable = NIL;
					variable = cdolist_list_var.first();
					while (NIL != cdolist_list_var) {
						final SubLObject item_var = variable;
						if (NIL == member(item_var, antecedant_variables, symbol_function(EQL), symbol_function(IDENTITY))) {
							antecedant_variables = cons(item_var, antecedant_variables);
						}
						cdolist_list_var = cdolist_list_var.rest();
						variable = cdolist_list_var.first();
					}
				} else {
					rejectedP = T;
				}
				csome_list_var = csome_list_var.rest();
				antecedant_literal = csome_list_var.first();
			}
		}
		if (NIL != rejectedP) {
			return NIL;
		}
		if (NIL == owl_exportable_rule_literalP(consequent_literal)) {
			return NIL;
		}
		consequent_variables = literal_variables(consequent_literal, UNPROVIDED, UNPROVIDED);
		if (NIL == rejectedP) {
			SubLObject csome_list_var = consequent_variables;
			SubLObject consequent_variable = NIL;
			consequent_variable = csome_list_var.first();
			while ((NIL == rejectedP) && (NIL != csome_list_var)) {
				if (NIL == subl_promotions.memberP(consequent_variable, antecedant_variables, UNPROVIDED, UNPROVIDED)) {
					rejectedP = T;
				}
				csome_list_var = csome_list_var.rest();
				consequent_variable = csome_list_var.first();
			}
		}
		if (NIL != rejectedP) {
			return NIL;
		}
		return T;
	}

	public static SubLObject owl_exportable_rule_literalP(final SubLObject literal) {
		if (NIL == atomic_sentenceP(literal)) {
			return NIL;
		}
		final SubLObject literal_with_narts = narts_high.nart_substitute(literal);
		final SubLObject predicate = cycl_utilities.formula_arg0(literal_with_narts);
		if ((!length(literal_with_narts).eql(THREE_INTEGER)) && ((((!predicate.eql($$relationInstanceExists)) || (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(literal, UNPROVIDED)))) || (NIL == cycl_variables.el_varP(cycl_utilities.formula_arg2(literal, UNPROVIDED)))) || (NIL != cycl_variables.el_varP(cycl_utilities.formula_arg3(literal, UNPROVIDED))))) {
			return NIL;
		}
		if (NIL == forts.fort_p(predicate)) {
			return NIL;
		}
		SubLObject cdolist_list_var = literal_with_narts;
		SubLObject v_term = NIL;
		v_term = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			if (v_term.isCons()) {
				return NIL;
			}
			cdolist_list_var = cdolist_list_var.rest();
			v_term = cdolist_list_var.first();
		}
		if (!predicate.eql($$isa)) {
			return T;
		}
		if ((NIL != cycl_variables.el_varP(cycl_utilities.formula_arg1(literal, UNPROVIDED))) && (NIL != forts.fort_p(cycl_utilities.formula_arg2(literal_with_narts, UNPROVIDED)))) {
			return T;
		}
		return NIL;
	}

	public static SubLObject constantify_existentials_and_open_vars(SubLObject sentence) {
		sentence = cycl_utilities.expression_transform(sentence, EL_EXISTENTIAL_P, FORMULA_ARG2, UNPROVIDED, UNPROVIDED);
		SubLObject cdolist_list_var = obsolete.formula_free_variables(sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		SubLObject var = NIL;
		var = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
			final SubLObject constant = ke.ke_create_now(suggest_constant_name_from_types(var, sentence), UNPROVIDED);
			sentence = cycl_utilities.formula_subst(constant, var, sentence, UNPROVIDED, UNPROVIDED);
			cdolist_list_var = cdolist_list_var.rest();
			var = cdolist_list_var.first();
		}
		return sentence;
	}

	public static SubLObject suggest_constant_name_from_types(final SubLObject var, final SubLObject formula) {
		final SubLObject v_genls = cardinality_estimates.sort_by_generality_estimate(at_var_types.formula_variable_genl_constraints(var, formula, $$InferencePSC, UNPROVIDED), $ASCENDING);
		if (NIL != v_genls) {
			return constants_high.suggest_constant_name(cconcatenate(pph_main.generate_phrase(v_genls.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $str486$_spec), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
		}
		final SubLObject isas = cardinality_estimates.sort_by_generality_estimate(at_var_types.formula_variable_isa_constraints(var, formula, $$InferencePSC, UNPROVIDED), $ASCENDING);
		return constants_high.suggest_constant_name(pph_main.generate_phrase(isas.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject parse_cycl_from_constrained_parse_result(final SubLObject result) {
		return second(result);
	}

	public static SubLObject constrained_parse_equalP(final SubLObject parse1, final SubLObject parse2) {
		return equal(cycl_utilities.hl_to_el(cycl_utilities.expression_transform(parse1, GUID_STRING_P, DUMMIFY_GUID_STRING, UNPROVIDED, UNPROVIDED)), cycl_utilities.hl_to_el(cycl_utilities.expression_transform(parse2, GUID_STRING_P, DUMMIFY_GUID_STRING, UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject dummify_guid_string(final SubLObject guid_string) {
		return $GUID_STRING;
	}

	public static SubLObject test_template_topic_match_finder(final SubLObject args, final SubLObject desired_terms, final SubLObject bug_number) {
		final SubLObject results = apply(FIND_TEMPLATE_TOPIC_MATCHES_FOR_CONSTRAINT, narts_high.nart_substitute(args));
		SubLObject missingP = NIL;
		if (NIL == missingP) {
			SubLObject csome_list_var = desired_terms;
			SubLObject desired_term = NIL;
			desired_term = csome_list_var.first();
			while ((NIL == missingP) && (NIL != csome_list_var)) {
				if (NIL == subl_promotions.memberP(desired_term, results, UNPROVIDED, UNPROVIDED)) {
					missingP = T;
					Errors.warn($str498$Missing_binding__S, desired_term);
				}
				csome_list_var = csome_list_var.rest();
				desired_term = csome_list_var.first();
			}
		}
		if ((NIL != missingP) && (NIL != subl_promotions.positive_integer_p(bug_number))) {
			Errors.warn($str499$Regression_on_bug__S, bug_number);
		}
		return makeBoolean(NIL == missingP);
	}

	public static SubLObject test_term_filtering_passes_filter(final SubLObject query, final SubLObject mt, final SubLObject v_term) {
		return subl_promotions.memberP(v_term, constraint_filters.filter_terms_for_arg_constraints($X, query, mt, list(v_term)), UNPROVIDED, UNPROVIDED);
	}

	public static SubLObject test_constrained_cycl_filter(final SubLObject constraints, final SubLObject terms) {
		final SubLThread thread = SubLProcess.currentSubLThread();
		SubLObject final_result = NIL;
		SubLObject sentence = NIL;
		SubLObject arg_pos = NIL;
		SubLObject constraining_collection = NIL;
		SubLObject domain_mt = NIL;
		SubLObject filter_fn = NIL;
		destructuring_bind_must_consp(constraints, constraints, $list505);
		sentence = constraints.first();
		SubLObject current = constraints.rest();
		destructuring_bind_must_consp(current, constraints, $list505);
		arg_pos = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, constraints, $list505);
		constraining_collection = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, constraints, $list505);
		domain_mt = current.first();
		current = current.rest();
		destructuring_bind_must_consp(current, constraints, $list505);
		filter_fn = current.first();
		current = current.rest();
		if (NIL == current) {
			final SubLObject _prev_bind_0 = $parse_sentence_context$.currentBinding(thread);
			final SubLObject _prev_bind_2 = $parse_arg_pos$.currentBinding(thread);
			final SubLObject _prev_bind_3 = $parse_constraining_collection$.currentBinding(thread);
			final SubLObject _prev_bind_4 = $parse_domain_mt$.currentBinding(thread);
			final SubLObject _prev_bind_5 = $parse_filter_fn$.currentBinding(thread);
			try {
				$parse_sentence_context$.bind(sentence, thread);
				$parse_arg_pos$.bind(arg_pos, thread);
				$parse_constraining_collection$.bind(constraining_collection, thread);
				$parse_domain_mt$.bind(domain_mt, thread);
				$parse_filter_fn$.bind(filter_fn, thread);
				final_result = funcall(CONSTRAINED_CYCL_FILTER, terms);
			} finally {
				$parse_filter_fn$.rebind(_prev_bind_5, thread);
				$parse_domain_mt$.rebind(_prev_bind_4, thread);
				$parse_constraining_collection$.rebind(_prev_bind_3, thread);
				$parse_arg_pos$.rebind(_prev_bind_2, thread);
				$parse_sentence_context$.rebind(_prev_bind_0, thread);
			}
		} else {
			cdestructuring_bind_error(constraints, $list505);
		}
		return final_result;
	}

	public static SubLObject test_bug_parses(final SubLObject quoted_args, final SubLObject desired_result, SubLObject bug_num) {
		if (bug_num == UNPROVIDED) {
			bug_num = NIL;
		}
		final SubLObject parse_result = eval(cons(GET_CONSTRAINED_CYCL_FOR_STRING, quoted_args));
		return subl_promotions.memberP(desired_result, parse_result, $sym509$CONSTRAINED_PARSE_EQUAL_, PARSE_CYCL_FROM_CONSTRAINED_PARSE_RESULT);
	}

	public static SubLObject bug_parse_count(final SubLObject quoted_args) {
		return length(eval(cons(GET_CONSTRAINED_CYCL_FOR_STRING, quoted_args)));
	}

	public static SubLObject ws_instance_subset_test(final SubLObject v_term) {
		final SubLObject results_via_ws = get_instances_for_ws(v_term, $$EverythingPSC, NIL, $int$350000, ZERO_INTEGER, UNPROVIDED).first();
		final SubLObject results_via_all_instances = isa.all_instances_in_all_mts(v_term);
		return makeBoolean((NIL == set_difference(results_via_ws, results_via_all_instances, UNPROVIDED, UNPROVIDED)) && (NIL == set_difference(results_via_all_instances, results_via_ws, UNPROVIDED, UNPROVIDED)));
	}

	public static SubLObject size_between(final SubLObject result, final SubLObject between_values) {
		final SubLObject useful_result = result.first();
		final SubLObject low_value = between_values.first();
		final SubLObject high_value = second(between_values);
		return makeBoolean((NIL != list_utilities.lengthGE(useful_result, low_value, UNPROVIDED)) && (NIL != list_utilities.lengthLE(useful_result, high_value, UNPROVIDED)));
	}

	public static SubLObject declare_api_widgets_file() {
		declareFunction(me, "foo_print_function_trampoline", "FOO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
		declareFunction(me, "foo_p", "FOO-P", 1, 0, false);
		new api_widgets.$foo_p$UnaryFunction();
		declareFunction(me, "foo_bar", "FOO-BAR", 1, 0, false);
		declareFunction(me, "_csetf_foo_bar", "_CSETF-FOO-BAR", 2, 0, false);
		declareFunction(me, "make_foo", "MAKE-FOO", 0, 1, false);
		declareFunction(me, "visit_defstruct_foo", "VISIT-DEFSTRUCT-FOO", 2, 0, false);
		declareFunction(me, "visit_defstruct_object_foo_method", "VISIT-DEFSTRUCT-OBJECT-FOO-METHOD", 2, 0, false);
		declareFunction(me, "foo_test", "FOO-TEST", 1, 0, false);
		declareFunction(me, "get_cyc_id_for_web_id", "GET-CYC-ID-FOR-WEB-ID", 1, 0, false);
		declareFunction(me, "register_api_session_cleanup_form", "REGISTER-API-SESSION-CLEANUP-FORM", 1, 1, false);
		declareFunction(me, "release_widget_resources_for_client", "RELEASE-WIDGET-RESOURCES-FOR-CLIENT", 1, 0, false);
		declareFunction(me, "reset_api_widget_sessions_resources", "RESET-API-WIDGET-SESSIONS-RESOURCES", 0, 0, false);
		declareFunction(me, "run_api_session_cleanup_forms", "RUN-API-SESSION-CLEANUP-FORMS", 1, 0, false);
		declareFunction(me, "evaluate_api_cleanup_form", "EVALUATE-API-CLEANUP-FORM", 1, 0, false);
		declareFunction(me, "declare_session_symbol", "DECLARE-SESSION-SYMBOL", 1, 1, false);
		declareFunction(me, "register_session_symbol_cleanup_form", "REGISTER-SESSION-SYMBOL-CLEANUP-FORM", 2, 0, false);
		declareFunction(me, "clear_get_collection_instances", "CLEAR-GET-COLLECTION-INSTANCES", 0, 0, false);
		declareFunction(me, "remove_get_collection_instances", "REMOVE-GET-COLLECTION-INSTANCES", 2, 1, false);
		declareFunction(me, "get_collection_instances_internal", "GET-COLLECTION-INSTANCES-INTERNAL", 3, 0, false);
		declareFunction(me, "get_collection_instances", "GET-COLLECTION-INSTANCES", 2, 1, false);
		declareFunction(me, "note_collection_mt_cooccurrence", "NOTE-COLLECTION-MT-COOCCURRENCE", 2, 0, false);
		declareFunction(me, "clear_collection_instances_cache_by_cooccurrence", "CLEAR-COLLECTION-INSTANCES-CACHE-BY-COOCCURRENCE", 1, 0, false);
		declareFunction(me, "recheck_collection_instances_cooccurence_cache", "RECHECK-COLLECTION-INSTANCES-COOCCURENCE-CACHE", 2, 0, false);
		declareFunction(me, "reset_collection_instances_caching", "RESET-COLLECTION-INSTANCES-CACHING", 0, 0, false);
		declareFunction(me, "process_taxonimic_function_results", "PROCESS-TAXONIMIC-FUNCTION-RESULTS", 4, 0, false);
		declareFunction(me, "process_taxonimic_function_results_new", "PROCESS-TAXONIMIC-FUNCTION-RESULTS-NEW", 4, 0, false);
		declareFunction(me, "find_for_ws", "FIND-FOR-WS", 3, 0, false);
		declareFunction(me, "get_instances_for_ws", "GET-INSTANCES-FOR-WS", 1, 5, false);
		declareFunction(me, "get_instances_for_ws_int", "GET-INSTANCES-FOR-WS-INT", 5, 0, false);
		declareFunction(me, "get_ws_instance_cache", "GET-WS-INSTANCE-CACHE", 5, 0, false);
		declareFunction(me, "add_to_ws_instance_cache", "ADD-TO-WS-INSTANCE-CACHE", 4, 0, false);
		declareFunction(me, "set_ws_instance_cache", "SET-WS-INSTANCE-CACHE", 4, 0, false);
		declareFunction(me, "ws_instance_iterator_doneP", "WS-INSTANCE-ITERATOR-DONE?", 3, 0, false);
		declareFunction(me, "clear_get_ws_instance_iterator", "CLEAR-GET-WS-INSTANCE-ITERATOR", 0, 0, false);
		declareFunction(me, "remove_get_ws_instance_iterator", "REMOVE-GET-WS-INSTANCE-ITERATOR", 3, 0, false);
		declareFunction(me, "get_ws_instance_iterator_internal", "GET-WS-INSTANCE-ITERATOR-INTERNAL", 3, 0, false);
		declareFunction(me, "get_ws_instance_iterator", "GET-WS-INSTANCE-ITERATOR", 3, 0, false);
		declareFunction(me, "get_specs_for_ws", "GET-SPECS-FOR-WS", 1, 6, false);
		declareFunction(me, "get_specs_for_ws_int", "GET-SPECS-FOR-WS-INT", 6, 0, false);
		declareFunction(me, "get_ws_spec_cache", "GET-WS-SPEC-CACHE", 6, 0, false);
		declareFunction(me, "add_to_ws_spec_cache", "ADD-TO-WS-SPEC-CACHE", 5, 0, false);
		declareFunction(me, "set_ws_spec_cache", "SET-WS-SPEC-CACHE", 5, 0, false);
		declareFunction(me, "ws_spec_iterator_doneP", "WS-SPEC-ITERATOR-DONE?", 2, 0, false);
		declareFunction(me, "clear_get_ws_spec_iterator", "CLEAR-GET-WS-SPEC-ITERATOR", 0, 0, false);
		declareFunction(me, "remove_get_ws_spec_iterator", "REMOVE-GET-WS-SPEC-ITERATOR", 2, 0, false);
		declareFunction(me, "get_ws_spec_iterator_internal", "GET-WS-SPEC-ITERATOR-INTERNAL", 2, 0, false);
		declareFunction(me, "get_ws_spec_iterator", "GET-WS-SPEC-ITERATOR", 2, 0, false);
		declareFunction(me, "get_isas_for_ws", "GET-ISAS-FOR-WS", 1, 6, false);
		declareFunction(me, "clear_get_isas_for_ws_int", "CLEAR-GET-ISAS-FOR-WS-INT", 0, 0, false);
		declareFunction(me, "remove_get_isas_for_ws_int", "REMOVE-GET-ISAS-FOR-WS-INT", 4, 0, false);
		declareFunction(me, "get_isas_for_ws_int_internal", "GET-ISAS-FOR-WS-INT-INTERNAL", 4, 0, false);
		declareFunction(me, "get_isas_for_ws_int", "GET-ISAS-FOR-WS-INT", 4, 0, false);
		declareFunction(me, "all_genls_of_any", "ALL-GENLS-OF-ANY", 1, 2, false);
		declareFunction(me, "get_genls_for_ws", "GET-GENLS-FOR-WS", 1, 6, false);
		declareFunction(me, "clear_get_genls_for_ws_int", "CLEAR-GET-GENLS-FOR-WS-INT", 0, 0, false);
		declareFunction(me, "remove_get_genls_for_ws_int", "REMOVE-GET-GENLS-FOR-WS-INT", 4, 0, false);
		declareFunction(me, "get_genls_for_ws_int_internal", "GET-GENLS-FOR-WS-INT-INTERNAL", 4, 0, false);
		declareFunction(me, "get_genls_for_ws_int", "GET-GENLS-FOR-WS-INT", 4, 0, false);
		declareFunction(me, "get_instances_in_nl", "GET-INSTANCES-IN-NL", 2, 1, false);
		declareFunction(me, "pph_list_item_comparator", "PPH-LIST-ITEM-COMPARATOR", 2, 0, false);
		declareFunction(me, "get_instances_as_renderings_int", "GET-INSTANCES-AS-RENDERINGS-INT", 1, 6, false);
		declareFunction(me, "get_instances_as_renderings_new", "GET-INSTANCES-AS-RENDERINGS-NEW", 1, 7, false);
		declareFunction(me, "clear_default_nl_preds_for_type_list", "CLEAR-DEFAULT-NL-PREDS-FOR-TYPE-LIST", 0, 0, false);
		declareFunction(me, "remove_default_nl_preds_for_type_list", "REMOVE-DEFAULT-NL-PREDS-FOR-TYPE-LIST", 1, 1, false);
		declareFunction(me, "default_nl_preds_for_type_list_internal", "DEFAULT-NL-PREDS-FOR-TYPE-LIST-INTERNAL", 2, 0, false);
		declareFunction(me, "default_nl_preds_for_type_list", "DEFAULT-NL-PREDS-FOR-TYPE-LIST", 1, 1, false);
		declareFunction(me, "clear_get_instances_as_renderings", "CLEAR-GET-INSTANCES-AS-RENDERINGS", 0, 0, false);
		declareFunction(me, "remove_get_instances_as_renderings", "REMOVE-GET-INSTANCES-AS-RENDERINGS", 3, 3, false);
		declareFunction(me, "get_instances_as_renderings_internal", "GET-INSTANCES-AS-RENDERINGS-INTERNAL", 6, 0, false);
		declareFunction(me, "get_instances_as_renderings", "GET-INSTANCES-AS-RENDERINGS", 3, 3, false);
		declareFunction(me, "get_term_list_as_renderings", "GET-TERM-LIST-AS-RENDERINGS", 3, 5, false);
		declareFunction(me, "get_term_list_as_renderings_with_fact_sheets", "GET-TERM-LIST-AS-RENDERINGS-WITH-FACT-SHEETS", 3, 4, false);
		declareFunction(me, "get_external_term_browser_url", "GET-EXTERNAL-TERM-BROWSER-URL", 2, 0, false);
		declareFunction(me, "get_term_list_as_renderings_with_fact_sheets_stripped", "GET-TERM-LIST-AS-RENDERINGS-WITH-FACT-SHEETS-STRIPPED", 3, 4, false);
		declareFunction(me, "convert_mini_html_to_text", "CONVERT-MINI-HTML-TO-TEXT", 1, 0, false);
		declareFunction(me, "convert_term_list_to_renderings_for_java", "CONVERT-TERM-LIST-TO-RENDERINGS-FOR-JAVA", 1, 7, false);
		declareFunction(me, "convert_term_list_to_renderings_for_java_int_internal", "CONVERT-TERM-LIST-TO-RENDERINGS-FOR-JAVA-INT-INTERNAL", 6, 2, false);
		declareFunction(me, "convert_term_list_to_renderings_for_java_int", "CONVERT-TERM-LIST-TO-RENDERINGS-FOR-JAVA-INT", 6, 2, false);
		declareFunction(me, "salient_instantiation_exemplars", "SALIENT-INSTANTIATION-EXEMPLARS", 2, 1, false);
		declareFunction(me, "get_example_instances_as_renderings_int", "GET-EXAMPLE-INSTANCES-AS-RENDERINGS-INT", 8, 0, false);
		declareFunction(me, "get_example_instances_as_renderings_new", "GET-EXAMPLE-INSTANCES-AS-RENDERINGS-NEW", 2, 7, false);
		declareFunction(me, "clear_get_example_instances_as_renderings", "CLEAR-GET-EXAMPLE-INSTANCES-AS-RENDERINGS", 0, 0, false);
		declareFunction(me, "remove_get_example_instances_as_renderings", "REMOVE-GET-EXAMPLE-INSTANCES-AS-RENDERINGS", 4, 2, false);
		declareFunction(me, "get_example_instances_as_renderings_internal", "GET-EXAMPLE-INSTANCES-AS-RENDERINGS-INTERNAL", 6, 0, false);
		declareFunction(me, "get_example_instances_as_renderings", "GET-EXAMPLE-INSTANCES-AS-RENDERINGS", 4, 2, false);
		declareFunction(me, "clear_get_salient_exemplars", "CLEAR-GET-SALIENT-EXEMPLARS", 0, 0, false);
		declareFunction(me, "remove_get_salient_exemplars", "REMOVE-GET-SALIENT-EXEMPLARS", 3, 0, false);
		declareFunction(me, "get_salient_exemplars_internal", "GET-SALIENT-EXEMPLARS-INTERNAL", 3, 0, false);
		declareFunction(me, "get_salient_exemplars", "GET-SALIENT-EXEMPLARS", 3, 0, false);
		declareFunction(me, "get_collection_extent_estimates", "GET-COLLECTION-EXTENT-ESTIMATES", 2, 0, false);
		declareFunction(me, "naut_isas_completely_enumerable", "NAUT-ISAS-COMPLETELY-ENUMERABLE", 1, 1, false);
		declareFunction(me, "naut_isas_estimated_instances", "NAUT-ISAS-ESTIMATED-INSTANCES", 1, 1, false);
		declareFunction(me, "get_detailed_instance_estimates", "GET-DETAILED-INSTANCE-ESTIMATES", 3, 1, false);
		declareFunction(me, "get_collection_extent_estimates_int", "GET-COLLECTION-EXTENT-ESTIMATES-INT", 2, 1, false);
		declareFunction(me, "get_collection_extent_estimates_new", "GET-COLLECTION-EXTENT-ESTIMATES-NEW", 4, 0, false);
		declareFunction(me, "create_new_instance_from_template", "CREATE-NEW-INSTANCE-FROM-TEMPLATE", 3, 3, false);
		declareFunction(me, "kill_constant", "KILL-CONSTANT", 1, 0, false);
		declareFunction(me, "kill_fort", "KILL-FORT", 1, 0, false);
		declareFunction(me, "get_all_isa_assertions_for_fort", "GET-ALL-ISA-ASSERTIONS-FOR-FORT", 1, 0, false);
		declareFunction(me, "clear_get_reformulation_specification_from_kb", "CLEAR-GET-REFORMULATION-SPECIFICATION-FROM-KB", 0, 0, false);
		declareFunction(me, "remove_get_reformulation_specification_from_kb", "REMOVE-GET-REFORMULATION-SPECIFICATION-FROM-KB", 2, 0, false);
		declareFunction(me, "get_reformulation_specification_from_kb_internal", "GET-REFORMULATION-SPECIFICATION-FROM-KB-INTERNAL", 2, 0, false);
		declareFunction(me, "get_reformulation_specification_from_kb", "GET-REFORMULATION-SPECIFICATION-FROM-KB", 2, 0, false);
		declareFunction(me, "reformulate_unknown_fet_term", "REFORMULATE-UNKNOWN-FET-TERM", 2, 2, false);
		declareFunction(me, "make_fet_evaluation_assertion", "MAKE-FET-EVALUATION-ASSERTION", 4, 3, false);
		declareFunction(me, "make_fet_evaluation_of_by", "MAKE-FET-EVALUATION-OF-BY", 2, 1, false);
		declareFunction(me, "existing_fet_evaluations_of_by", "EXISTING-FET-EVALUATIONS-OF-BY", 2, 0, false);
		declareFunction(me, "existing_fet_evaluations_of", "EXISTING-FET-EVALUATIONS-OF", 1, 0, false);
		declareFunction(me, "add_or_edit_assertion_verbose", "ADD-OR-EDIT-ASSERTION-VERBOSE", 4, 2, false);
		declareFunction(me, "add_or_edit_assertion", "ADD-OR-EDIT-ASSERTION", 4, 2, false);
		declareFunction(me, "add_or_edit_assertion_internal", "ADD-OR-EDIT-ASSERTION-INTERNAL", 7, 0, false);
		declareFunction(me, "unassert_fet_sentence", "UNASSERT-FET-SENTENCE", 4, 0, false);
		declareFunction(me, "skolem_narts_from_assertions", "SKOLEM-NARTS-FROM-ASSERTIONS", 1, 0, false);
		declareFunction(me, "reformulate_edit_sentences", "REFORMULATE-EDIT-SENTENCES", 5, 0, false);
		declareFunction(me, "build_string_form_for_future_assertion", "BUILD-STRING-FORM-FOR-FUTURE-ASSERTION", 3, 1, false);
		declareFunction(me, "note_reformulation_happened", "NOTE-REFORMULATION-HAPPENED", 5, 0, false);
		declareFunction(me, "remove_note_of_reformulation_happened", "REMOVE-NOTE-OF-REFORMULATION-HAPPENED", 5, 0, false);
		declareFunction(me, "contains_mt_indexical_referencesP", "CONTAINS-MT-INDEXICAL-REFERENCES?", 1, 0, false);
		declareFunction(me, "resolve_mt_indexical_references", "RESOLVE-MT-INDEXICAL-REFERENCES", 2, 0, false);
		declareFunction(me, "cae_applicable_template_topics_for_term", "CAE-APPLICABLE-TEMPLATE-TOPICS-FOR-TERM", 1, 2, false);
		declareFunction(me, "get_cae_template_topics", "GET-CAE-TEMPLATE-TOPICS", 0, 2, false);
		declareFunction(me, "gather_temporal_concepts_for_cae", "GATHER-TEMPORAL-CONCEPTS-FOR-CAE", 2, 0, false);
		declareFunction(me, "gather_temporal_concept_variables_for_cae", "GATHER-TEMPORAL-CONCEPT-VARIABLES-FOR-CAE", 2, 0, false);
		declareFunction(me, "cae_temporal_concept_collectionP", "CAE-TEMPORAL-CONCEPT-COLLECTION?", 2, 0, false);
		declareFunction(me, "get_shared_comments", "GET-SHARED-COMMENTS", 1, 0, false);
		declareMacro(me, "with_parsing_constraints", "WITH-PARSING-CONSTRAINTS");
		declareFunction(me, "get_constrained_cycl_terms", "GET-CONSTRAINED-CYCL-TERMS", 2, 12, false);
		declareFunction(me, "smart_convert_string_constraint_tuple_to_denotation", "SMART-CONVERT-STRING-CONSTRAINT-TUPLE-TO-DENOTATION", 5, 1, false);
		declareFunction(me, "get_constrained_cycl_for_string", "GET-CONSTRAINED-CYCL-FOR-STRING", 3, 11, false);
		declareFunction(me, "get_constrained_cycl_for_string_single_answer", "GET-CONSTRAINED-CYCL-FOR-STRING-SINGLE-ANSWER", 3, 11, false);
		declareFunction(me, "get_constrained_cycl_for_string_int", "GET-CONSTRAINED-CYCL-FOR-STRING-INT", 3, 11, false);
		declareFunction(me, "constrained_cycl_filter", "CONSTRAINED-CYCL-FILTER", 1, 5, false);
		declareFunction(me, "constrained_cycl_filter_int", "CONSTRAINED-CYCL-FILTER-INT", 5, 0, false);
		declareFunction(me, "read_cycl_from_string", "READ-CYCL-FROM-STRING", 1, 0, false);
		declareFunction(me, "filter_constrained_cycls", "FILTER-CONSTRAINED-CYCLS", 2, 0, false);
		declareFunction(me, "dereference_indexicals_in_constrained_cycls", "DEREFERENCE-INDEXICALS-IN-CONSTRAINED-CYCLS", 1, 0, false);
		declareFunction(me, "dereference_indexicals_in_constrained_cycl", "DEREFERENCE-INDEXICALS-IN-CONSTRAINED-CYCL", 1, 0, false);
		declareFunction(me, "partial_matches_for_string", "PARTIAL-MATCHES-FOR-STRING", 4, 2, false);
		declareFunction(me, "convert_string_constraint_tuple_to_denotation", "CONVERT-STRING-CONSTRAINT-TUPLE-TO-DENOTATION", 2, 0, false);
		declareFunction(me, "stub_term_with_name_and_type_p", "STUB-TERM-WITH-NAME-AND-TYPE-P", 1, 0, false);
		declareFunction(me, "string_specP", "STRING-SPEC?", 1, 0, false);
		declareFunction(me, "get_cycls_for_string_escalating", "GET-CYCLS-FOR-STRING-ESCALATING", 2, 6, false);
		declareFunction(me, "clear_get_extended_cycls_for_string", "CLEAR-GET-EXTENDED-CYCLS-FOR-STRING", 0, 0, false);
		declareFunction(me, "remove_get_extended_cycls_for_string", "REMOVE-GET-EXTENDED-CYCLS-FOR-STRING", 1, 2, false);
		declareFunction(me, "get_extended_cycls_for_string_internal", "GET-EXTENDED-CYCLS-FOR-STRING-INTERNAL", 3, 0, false);
		declareFunction(me, "get_extended_cycls_for_string", "GET-EXTENDED-CYCLS-FOR-STRING", 1, 2, false);
		declareFunction(me, "clear_get_coerced_cycls_for_term", "CLEAR-GET-COERCED-CYCLS-FOR-TERM", 0, 0, false);
		declareFunction(me, "remove_get_coerced_cycls_for_term", "REMOVE-GET-COERCED-CYCLS-FOR-TERM", 1, 2, false);
		declareFunction(me, "get_coerced_cycls_for_term_internal", "GET-COERCED-CYCLS-FOR-TERM-INTERNAL", 3, 0, false);
		declareFunction(me, "get_coerced_cycls_for_term", "GET-COERCED-CYCLS-FOR-TERM", 1, 2, false);
		declareFunction(me, "get_constrained_extended_cycls_for_string", "GET-CONSTRAINED-EXTENDED-CYCLS-FOR-STRING", 2, 3, false);
		declareFunction(me, "get_coerced_cycls_for_string", "GET-COERCED-CYCLS-FOR-STRING", 2, 3, false);
		declareFunction(me, "apply_constrained_cycls_filter_fn", "APPLY-CONSTRAINED-CYCLS-FILTER-FN", 3, 0, false);
		declareFunction(me, "get_constrained_cycls_from_generation", "GET-CONSTRAINED-CYCLS-FROM-GENERATION", 2, 4, false);
		declareFunction(me, "get_constrained_cycls_for_regular_expression", "GET-CONSTRAINED-CYCLS-FOR-REGULAR-EXPRESSION", 2, 4, false);
		declareFunction(me, "get_constrained_cycls_for_regular_expression_low", "GET-CONSTRAINED-CYCLS-FOR-REGULAR-EXPRESSION-LOW", 6, 0, false);
		declareFunction(me, "get_constrained_cycls_for_regular_expression_via_inference", "GET-CONSTRAINED-CYCLS-FOR-REGULAR-EXPRESSION-VIA-INFERENCE", 5, 1, false);
		declareFunction(me, "get_cycls_for_regex_semantic_constraints", "GET-CYCLS-FOR-REGEX-SEMANTIC-CONSTRAINTS", 3, 0, false);
		declareFunction(me, "get_cycls_for_regex_regex_constraint", "GET-CYCLS-FOR-REGEX-REGEX-CONSTRAINT", 3, 0, false);
		declareFunction(me, "filter_phrase_term_list_by_constraint_list", "FILTER-PHRASE-TERM-LIST-BY-CONSTRAINT-LIST", 3, 0, false);
		declareFunction(me, "filter_cycl_term_by_constraint_list", "FILTER-CYCL-TERM-BY-CONSTRAINT-LIST", 3, 0, false);
		declareFunction(me, "auto_complete_constrained", "AUTO-COMPLETE-CONSTRAINED", 3, 0, false);
		declareFunction(me, "auto_complete_term_quick", "AUTO-COMPLETE-TERM-QUICK", 2, 0, false);
		declareFunction(me, "auto_complete_constrained_new", "AUTO-COMPLETE-CONSTRAINED-NEW", 3, 0, false);
		declareFunction(me, "get_string_from_javalist_group", "GET-STRING-FROM-JAVALIST-GROUP", 1, 0, false);
		declareFunction(me, "find_template_topic_matches_for_constraint", "FIND-TEMPLATE-TOPIC-MATCHES-FOR-CONSTRAINT", 4, 1, false);
		declareFunction(me, "unparsable_instance_expression_p", "UNPARSABLE-INSTANCE-EXPRESSION-P", 1, 0, false);
		declareFunction(me, "use_topic_defining_mt_when_passed_everything_pscP", "USE-TOPIC-DEFINING-MT-WHEN-PASSED-EVERYTHING-PSC?", 0, 0, false);
		declareFunction(me, "everything_psc_dwimmed_awayP", "EVERYTHING-PSC-DWIMMED-AWAY?", 0, 0, false);
		declareFunction(me, "get_template_topic_assertions_for_match_in_xml", "GET-TEMPLATE-TOPIC-ASSERTIONS-FOR-MATCH-IN-XML", 4, 1, false);
		declareFunction(me, "formula_template_load_template_graph_memoized_internal", "FORMULA-TEMPLATE-LOAD-TEMPLATE-GRAPH-MEMOIZED-INTERNAL", 2, 0, false);
		declareFunction(me, "formula_template_load_template_graph_memoized", "FORMULA-TEMPLATE-LOAD-TEMPLATE-GRAPH-MEMOIZED", 2, 0, false);
		declareFunction(me, "assert_candidate_replacements_for_position", "ASSERT-CANDIDATE-REPLACEMENTS-FOR-POSITION", 4, 0, false);
		declareFunction(me, "create_minimal_formula_template_with_query", "CREATE-MINIMAL-FORMULA-TEMPLATE-WITH-QUERY", 7, 0, false);
		declareFunction(me, "create_minimal_formula_template_with_query_include_inference", "CREATE-MINIMAL-FORMULA-TEMPLATE-WITH-QUERY-INCLUDE-INFERENCE", 8, 0, false);
		declareFunction(me, "assert_updated_inference_parameters_for_query", "ASSERT-UPDATED-INFERENCE-PARAMETERS-FOR-QUERY", 3, 0, false);
		declareFunction(me, "get_forward_rules_for_query", "GET-FORWARD-RULES-FOR-QUERY", 1, 0, false);
		declareFunction(me, "do_query_template_allowed_rules", "DO-QUERY-TEMPLATE-ALLOWED-RULES", 1, 0, false);
		declareFunction(me, "assert_creation_template_allowable_rules_for_query", "ASSERT-CREATION-TEMPLATE-ALLOWABLE-RULES-FOR-QUERY", 3, 0, false);
		declareFunction(me, "combine_query_properties", "COMBINE-QUERY-PROPERTIES", 2, 0, false);
		declareFunction(me, "edit_query_gloss", "EDIT-QUERY-GLOSS", 4, 0, false);
		declareFunction(me, "assert_new_query_gloss", "ASSERT-NEW-QUERY-GLOSS", 2, 0, false);
		declareFunction(me, "mail_about_gloss_edit", "MAIL-ABOUT-GLOSS-EDIT", 3, 0, false);
		declareFunction(me, "temporally_qualify_assertion_to_end_now", "TEMPORALLY-QUALIFY-ASSERTION-TO-END-NOW", 1, 1, false);
		declareFunction(me, "current_assertions_with_cycl", "CURRENT-ASSERTIONS-WITH-CYCL", 2, 1, false);
		declareFunction(me, "assertion_starting_time", "ASSERTION-STARTING-TIME", 1, 0, false);
		declareFunction(me, "mt_starting_time", "MT-STARTING-TIME", 1, 1, false);
		declareFunction(me, "create_new_formula_template_with_query", "CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY", 0, 0, false);
		declareFunction(me, "make_multiple_assertions_to_mt", "MAKE-MULTIPLE-ASSERTIONS-TO-MT", 2, 4, false);
		declareFunction(me, "api_widgets_assert_wff_now", "API-WIDGETS-ASSERT-WFF-NOW", 4, 0, false);
		declareFunction(me, "make_multiple_assertions_to_mt_with_creation_template", "MAKE-MULTIPLE-ASSERTIONS-TO-MT-WITH-CREATION-TEMPLATE", 3, 4, false);
		declareFunction(me, "mail_to_user", "MAIL-TO-USER", 3, 0, false);
		declareFunction(me, "mail_to_user_with_content_type", "MAIL-TO-USER-WITH-CONTENT-TYPE", 4, 0, false);
		declareFunction(me, "cyclist_defined_instances_of_col", "CYCLIST-DEFINED-INSTANCES-OF-COL", 2, 3, false);
		declareFunction(me, "cyclist_defined_specs_of_col", "CYCLIST-DEFINED-SPECS-OF-COL", 2, 3, false);
		declareFunction(me, "get_template_topic_in_xml", "GET-TEMPLATE-TOPIC-IN-XML", 1, 1, false);
		declareFunction(me, "get_formula_template_in_xml", "GET-FORMULA-TEMPLATE-IN-XML", 2, 1, false);
		declareFunction(me, "get_formula_template_from_id", "GET-FORMULA-TEMPLATE-FROM-ID", 2, 1, false);
		declareFunction(me, "write_formula_template_in_xml", "WRITE-FORMULA-TEMPLATE-IN-XML", 2, 0, false);
		declareFunction(me, "suggest_loading_mt_for_cycl_query", "SUGGEST-LOADING-MT-FOR-CYCL-QUERY", 1, 0, false);
		declareFunction(me, "get_cycl_query_in_xml_from_default_mt", "GET-CYCL-QUERY-IN-XML-FROM-DEFAULT-MT", 1, 0, false);
		declareFunction(me, "get_cycl_query_in_xml", "GET-CYCL-QUERY-IN-XML", 1, 1, false);
		declareFunction(me, "get_formula_template_for_fact_or_query_in_xml_from_default_mt", "GET-FORMULA-TEMPLATE-FOR-FACT-OR-QUERY-IN-XML-FROM-DEFAULT-MT", 1, 0, false);
		declareFunction(me, "get_formula_template_for_fact_or_query_in_xml", "GET-FORMULA-TEMPLATE-FOR-FACT-OR-QUERY-IN-XML", 2, 0, false);
		declareFunction(me, "process_feedback", "PROCESS-FEEDBACK", 10, 0, false);
		declareFunction(me, "bindinglist_to_string", "BINDINGLIST-TO-STRING", 1, 0, false);
		declareFunction(me, "get_bugzilla_product_from_project", "GET-BUGZILLA-PRODUCT-FROM-PROJECT", 2, 0, false);
		declareFunction(me, "get_possible_renderers_for_followup", "GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP", 5, 3, false);
		declareFunction(me, "clear_get_possible_renderers_for_followup_int", "CLEAR-GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT", 0, 0, false);
		declareFunction(me, "remove_get_possible_renderers_for_followup_int", "REMOVE-GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT", 5, 3, false);
		declareFunction(me, "get_possible_renderers_for_followup_int_internal", "GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT-INTERNAL", 8, 0, false);
		declareFunction(me, "get_possible_renderers_for_followup_int", "GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT", 5, 3, false);
		declareFunction(me, "uniquify_variables_across_two_sentences", "UNIQUIFY-VARIABLES-ACROSS-TWO-SENTENCES", 2, 0, false);
		declareFunction(me, "uniquify_variables_across_two_sentences_int", "UNIQUIFY-VARIABLES-ACROSS-TWO-SENTENCES-INT", 2, 0, false);
		declareFunction(me, "change_variable_names", "CHANGE-VARIABLE-NAMES", 2, 0, false);
		declareFunction(me, "generality_sort_lambda", "GENERALITY-SORT-LAMBDA", 1, 0, false);
		declareFunction(me, "get_possible_merged_queries", "GET-POSSIBLE-MERGED-QUERIES", 4, 1, false);
		declareFunction(me, "get_possible_merged_queries_wrt_var", "GET-POSSIBLE-MERGED-QUERIES-WRT-VAR", 5, 1, false);
		declareFunction(me, "get_source_conceptual_works_for_project", "GET-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT", 2, 3, false);
		declareFunction(me, "paraphrased_source_listP", "PARAPHRASED-SOURCE-LIST?", 1, 0, false);
		declareFunction(me, "paraphrased_source_list_for_generation_mtP", "PARAPHRASED-SOURCE-LIST-FOR-GENERATION-MT?", 2, 0, false);
		declareFunction(me, "paraphrased_source_list_sources", "PARAPHRASED-SOURCE-LIST-SOURCES", 1, 0, false);
		declareFunction(me, "paraphrased_source_source", "PARAPHRASED-SOURCE-SOURCE", 1, 0, false);
		declareFunction(me, "store_conceptual_work_paraphrases", "STORE-CONCEPTUAL-WORK-PARAPHRASES", 5, 0, false);
		declareFunction(me, "fet_categorized_source_pred", "FET-CATEGORIZED-SOURCE-PRED", 0, 0, false);
		declareFunction(me, "add_source_of_type_for_project", "ADD-SOURCE-OF-TYPE-FOR-PROJECT", 2, 0, false);
		declareFunction(me, "remove_source_of_type_for_project", "REMOVE-SOURCE-OF-TYPE-FOR-PROJECT", 2, 0, false);
		declareFunction(me, "fet_empty_source_dictionary", "FET-EMPTY-SOURCE-DICTIONARY", 0, 0, false);
		declareFunction(me, "clear_source_conceptual_works_for_project", "CLEAR-SOURCE-CONCEPTUAL-WORKS-FOR-PROJECT", 0, 0, false);
		declareFunction(me, "add_categorized_fet_source", "ADD-CATEGORIZED-FET-SOURCE", 4, 0, false);
		declareFunction(me, "remove_categorized_fet_source", "REMOVE-CATEGORIZED-FET-SOURCE", 4, 0, false);
		declareFunction(me, "initialize_fet_sources", "INITIALIZE-FET-SOURCES", 0, 0, false);
		declareFunction(me, "maybe_initialize_fet_sources", "MAYBE-INITIALIZE-FET-SOURCES", 0, 0, false);
		declareFunction(me, "type_type_dict_for_project", "TYPE-TYPE-DICT-FOR-PROJECT", 1, 1, false);
		declareFunction(me, "source_type_dict_for_type_type", "SOURCE-TYPE-DICT-FOR-TYPE-TYPE", 2, 1, false);
		declareFunction(me, "new_fet_source_type_dictionary", "NEW-FET-SOURCE-TYPE-DICTIONARY", 1, 0, false);
		declareFunction(me, "get_categorized_source_cws_for_project", "GET-CATEGORIZED-SOURCE-CWS-FOR-PROJECT", 3, 0, false);
		declareFunction(me, "get_categorized_source_cws_for_project_old", "GET-CATEGORIZED-SOURCE-CWS-FOR-PROJECT-OLD", 3, 0, false);
		declareFunction(me, "get_lisp_implementation_type", "GET-LISP-IMPLEMENTATION-TYPE", 0, 0, false);
		declareFunction(me, "get_lisp_implementation_version", "GET-LISP-IMPLEMENTATION-VERSION", 0, 0, false);
		declareFunction(me, "reconsider_template_formula_using_tms", "RECONSIDER-TEMPLATE-FORMULA-USING-TMS", 2, 0, false);
		declareFunction(me, "clear_all_api_widgets_caches", "CLEAR-ALL-API-WIDGETS-CACHES", 0, 0, false);
		declareFunction(me, "rtv_wizard_default_predicates", "RTV-WIZARD-DEFAULT-PREDICATES", 1, 0, false);
		declareFunction(me, "valid_term_for_enumerated_collectionP", "VALID-TERM-FOR-ENUMERATED-COLLECTION?", 1, 0, false);
		declareFunction(me, "clear_collection_creation_template", "CLEAR-COLLECTION-CREATION-TEMPLATE", 0, 0, false);
		declareFunction(me, "remove_collection_creation_template", "REMOVE-COLLECTION-CREATION-TEMPLATE", 0, 0, false);
		declareFunction(me, "collection_creation_template_internal", "COLLECTION-CREATION-TEMPLATE-INTERNAL", 0, 0, false);
		declareFunction(me, "collection_creation_template", "COLLECTION-CREATION-TEMPLATE", 0, 0, false);
		declareFunction(me, "create_collection_from_set", "CREATE-COLLECTION-FROM-SET", 2, 3, false);
		declareFunction(me, "create_collection_from_enumerated_terms", "CREATE-COLLECTION-FROM-ENUMERATED-TERMS", 2, 5, false);
		declareFunction(me, "add_to_collection_from_enumerated_terms", "ADD-TO-COLLECTION-FROM-ENUMERATED-TERMS", 3, 1, false);
		declareFunction(me, "genls_for_collection_from_enumerated_terms", "GENLS-FOR-COLLECTION-FROM-ENUMERATED-TERMS", 2, 0, false);
		declareFunction(me, "all_isa_for_collection_from_enumerated_terms", "ALL-ISA-FOR-COLLECTION-FROM-ENUMERATED-TERMS", 2, 0, false);
		declareFunction(me, "find_external_ais_terms_in_inference", "FIND-EXTERNAL-AIS-TERMS-IN-INFERENCE", 2, 0, false);
		declareFunction(me, "find_external_ais_terms", "FIND-EXTERNAL-AIS-TERMS", 1, 0, false);
		declareFunction(me, "valid_term_qua_inference_binding_p", "VALID-TERM-QUA-INFERENCE-BINDING-P", 1, 0, false);
		declareFunction(me, "term_qua_inference_binding_all_isa", "TERM-QUA-INFERENCE-BINDING-ALL-ISA", 2, 0, false);
		declareFunction(me, "variable_isa_constraints_memoized_internal", "VARIABLE-ISA-CONSTRAINTS-MEMOIZED-INTERNAL", 3, 0, false);
		declareFunction(me, "variable_isa_constraints_memoized", "VARIABLE-ISA-CONSTRAINTS-MEMOIZED", 3, 0, false);
		declareFunction(me, "formula_variable_arg_constraint_table", "FORMULA-VARIABLE-ARG-CONSTRAINT-TABLE", 2, 0, false);
		declareFunction(me, "resolve_term_qua_inference_binding", "RESOLVE-TERM-QUA-INFERENCE-BINDING", 1, 0, false);
		declareFunction(me, "term_qua_inference_binding_get_problem_store", "TERM-QUA-INFERENCE-BINDING-GET-PROBLEM-STORE", 1, 0, false);
		declareFunction(me, "term_qua_inference_binding_get_inference", "TERM-QUA-INFERENCE-BINDING-GET-INFERENCE", 1, 0, false);
		declareFunction(me, "term_qua_inference_binding_get_inference_answer", "TERM-QUA-INFERENCE-BINDING-GET-INFERENCE-ANSWER", 1, 0, false);
		declareFunction(me, "term_qua_inference_binding_get_variable", "TERM-QUA-INFERENCE-BINDING-GET-VARIABLE", 1, 0, false);
		declareFunction(me, "term_qua_inference_binding_p", "TERM-QUA-INFERENCE-BINDING-P", 1, 0, false);
		declareFunction(me, "new_cyc_queries", "NEW-CYC-QUERIES", 3, 0, false);
		declareFunction(me, "gather_filtered_el_rule_assertions_for_term", "GATHER-FILTERED-EL-RULE-ASSERTIONS-FOR-TERM", 2, 0, false);
		declareFunction(me, "gather_set_filtered_el_rule_assertions_for_term", "GATHER-SET-FILTERED-EL-RULE-ASSERTIONS-FOR-TERM", 2, 0, false);
		declareFunction(me, "assertion_has_non_owl_exportable_meta_assertionP", "ASSERTION-HAS-NON-OWL-EXPORTABLE-META-ASSERTION?", 1, 0, false);
		declareFunction(me, "owl_exportable_rule_assertionP", "OWL-EXPORTABLE-RULE-ASSERTION?", 1, 0, false);
		declareFunction(me, "owl_exportable_rule_literalP", "OWL-EXPORTABLE-RULE-LITERAL?", 1, 0, false);
		declareFunction(me, "constantify_existentials_and_open_vars", "CONSTANTIFY-EXISTENTIALS-AND-OPEN-VARS", 1, 0, false);
		declareFunction(me, "suggest_constant_name_from_types", "SUGGEST-CONSTANT-NAME-FROM-TYPES", 2, 0, false);
		declareFunction(me, "parse_cycl_from_constrained_parse_result", "PARSE-CYCL-FROM-CONSTRAINED-PARSE-RESULT", 1, 0, false);
		declareFunction(me, "constrained_parse_equalP", "CONSTRAINED-PARSE-EQUAL?", 2, 0, false);
		declareFunction(me, "dummify_guid_string", "DUMMIFY-GUID-STRING", 1, 0, false);
		declareFunction(me, "test_template_topic_match_finder", "TEST-TEMPLATE-TOPIC-MATCH-FINDER", 3, 0, false);
		declareFunction(me, "test_term_filtering_passes_filter", "TEST-TERM-FILTERING-PASSES-FILTER", 3, 0, false);
		declareFunction(me, "test_constrained_cycl_filter", "TEST-CONSTRAINED-CYCL-FILTER", 2, 0, false);
		declareFunction(me, "test_bug_parses", "TEST-BUG-PARSES", 2, 1, false);
		declareFunction(me, "bug_parse_count", "BUG-PARSE-COUNT", 1, 0, false);
		declareFunction(me, "ws_instance_subset_test", "WS-INSTANCE-SUBSET-TEST", 1, 0, false);
		declareFunction(me, "size_between", "SIZE-BETWEEN", 2, 0, false);
		return NIL;
	}

	public static SubLObject init_api_widgets_file() {
		defconstant("*DTP-FOO*", FOO);
		defparameter("*A-FOO*", make_foo(UNPROVIDED));
		deflexical("*API-WIDGET-SESSION-RESOURCE-LOCK*", make_lock($$$Api_Widget_Session_Resource_Lock));
		deflexical("*API-WIDGET-SESSION-RESOURCE-MAP*", SubLSystemTrampolineFile.maybeDefault($api_widget_session_resource_map$, $api_widget_session_resource_map$, () -> dictionary.new_dictionary(EQUAL, UNPROVIDED)));
		deflexical("*API-WIDGETS-GET-COLLECTION-INSTANCES-ARG-COOCCURRENCE*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
		deflexical("*GET-COLLECTION-INSTANCES-CACHING-STATE*", NIL);
		defparameter("*WS-INSTANCE-DICT*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
		deflexical("*GET-WS-INSTANCE-ITERATOR-CACHING-STATE*", NIL);
		defparameter("*WS-SPEC-DICT*", dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
		deflexical("*GET-WS-SPEC-ITERATOR-CACHING-STATE*", NIL);
		deflexical("*GET-ISAS-FOR-WS-INT-CACHING-STATE*", NIL);
		deflexical("*GET-GENLS-FOR-WS-INT-CACHING-STATE*", NIL);
		deflexical("*DEFAULT-NL-PREDS-FOR-TYPE-LIST-CACHING-STATE*", NIL);
		deflexical("*GET-INSTANCES-AS-RENDERINGS-CACHING-STATE*", NIL);
		deflexical("*SPARQL-ENDPOINT-BROWSER-FORMAT-STRING*", $str101$http____A__D_browse_uri__A_action);
		defconstant("*MINI-FACT-SHEET-TO-FACT-SHEET-LINK-TEXT*", $str116$_Fact_Sheet_);
		deflexical("*GET-EXAMPLE-INSTANCES-AS-RENDERINGS-CACHING-STATE*", NIL);
		deflexical("*GET-SALIENT-EXEMPLARS-CACHING-STATE*", NIL);
		deflexical("*GET-REFORMULATION-SPECIFICATION-FROM-KB-CACHING-STATE*", NIL);
		defparameter("*FET-EVALUATION-MT*", $$TKBEvaluatedSentencesMt);
		deflexical("*FUTURE-ASSERTION-MESSAGE-STRING*", $str177$Future_assertion_only_possibility);
		deflexical("*FUTURE-ASSERTION-COUNTER*", SubLSystemTrampolineFile.maybeDefault($future_assertion_counter$, $future_assertion_counter$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
		deflexical("*MICROTHEORY-INDEXICAL-REFERENT-CURRENT-MT*", $list182);
		deflexical("*MICROTHEORY-MENTIONING-CONSTRUCTS*", $list183);
		defparameter("*PARSE-SENTENCE-CONTEXT*", NIL);
		defparameter("*PARSE-ARG-POS*", NIL);
		defparameter("*PARSE-CONSTRAINING-COLLECTION*", NIL);
		defparameter("*PARSE-DOMAIN-MT*", NIL);
		defparameter("*PARSE-FILTER-FN*", NIL);
		deflexical("*API-WIDGETS-STRIP-NL-TAGS?*", T);
		defparameter("*API-WIDGET-RETURN-NEW-CYCLS-SEPARATELY?*", NIL);
		defparameter("*GET-EXTENDED-CYCLS-FOR-STRING-TIMEOUT*", FIVE_INTEGER);
		defparameter("*GET-COERCED-CYCLS-TIMEOUT*", FIVE_INTEGER);
		defparameter("*NL-COERCION-MT*", $$EnglishTypeCoercionDataMt);
		deflexical("*TRACE-GET-CYCLS-FOR-STRING-ESCALATING?*", NIL);
		deflexical("*GET-EXTENDED-CYCLS-FOR-STRING-CACHING-STATE*", NIL);
		deflexical("*GET-COERCED-CYCLS-FOR-TERM-CACHING-STATE*", NIL);
		deflexical("*CONSTRAINED-CYCLS-FROM-GENERATION-CARDINALITY-CUTOFF*", $int$500);
		deflexical("*CONSTRAINED-CYCLS-FOR-REGULAR-EXPRESSION-CARDINALITY-CUTOFF*", $int$5000000);
		deflexical("*TEMPLATE-TOPIC-MATCH-MISSING-TERM-VARIABLE*", $sym50$_X);
		deflexical("*USE-TOPIC-DEFINING-MT-WHEN-PASSED-EVERYTHING-PSC?*", T);
		defparameter("*EVERYTHING-PSC-DWIMMED-AWAY?*", NIL);
		deflexical("*GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT-CACHING-STATE*", NIL);
		deflexical("*FET-CATEGORIZED-SOURCE-PRED*", NIL);
		deflexical("*FET-CATEGORIZED-SOURCES*", SubLSystemTrampolineFile.maybeDefault($fet_categorized_sources$, $fet_categorized_sources$, $UNINITIALIZED));
		deflexical("*FET-EMPTY-SOURCE-DICTIONARY*", NIL);
		deflexical("*COLLECTION-CREATION-TEMPLATE-CACHING-STATE*", NIL);
		deflexical("*TERM-QUA-INFERENCE-ANSWER-PATTERN*", $list469);
		deflexical("*OWL-EXPORTABLE-DEFINITIONAL-TERMS*", $list471);
		deflexical("*OWL-EXPORTABLE-DEFINITIONAL-TERM-SET*", set_utilities.construct_set_from_list($owl_exportable_definitional_terms$.getGlobalValue(), UNPROVIDED, UNPROVIDED));
		deflexical("*ALLOW-EXPANDED-RULES-AS-OWL-EXPORT-CANDIDATES?*", NIL);
		return NIL;
	}

	public static SubLObject setup_api_widgets_file() {
		register_method($print_object_method_table$.getGlobalValue(), $dtp_foo$.getGlobalValue(), symbol_function(FOO_PRINT_FUNCTION_TRAMPOLINE));
		SubLSpecialOperatorDeclarations.proclaim($list8);
		def_csetf(FOO_BAR, _CSETF_FOO_BAR);
		identity(FOO);
		register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_foo$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_FOO_METHOD));
		register_external_symbol(GET_CYC_ID_FOR_WEB_ID);
		declare_defglobal($api_widget_session_resource_map$);
		register_external_symbol(REGISTER_API_SESSION_CLEANUP_FORM);
		register_external_symbol(DECLARE_SESSION_SYMBOL);
		memoization_state.note_globally_cached_function(GET_COLLECTION_INSTANCES);
		register_external_symbol(FIND_FOR_WS);
		register_external_symbol(GET_INSTANCES_FOR_WS);
		memoization_state.note_globally_cached_function(GET_WS_INSTANCE_ITERATOR);
		register_external_symbol(GET_SPECS_FOR_WS);
		memoization_state.note_globally_cached_function(GET_WS_SPEC_ITERATOR);
		register_external_symbol(GET_ISAS_FOR_WS);
		memoization_state.note_globally_cached_function(GET_ISAS_FOR_WS_INT);
		register_external_symbol(GET_GENLS_FOR_WS);
		memoization_state.note_globally_cached_function(GET_GENLS_FOR_WS_INT);
		register_external_symbol(GET_INSTANCES_IN_NL);
		register_external_symbol(GET_INSTANCES_AS_RENDERINGS_NEW);
		memoization_state.note_globally_cached_function(DEFAULT_NL_PREDS_FOR_TYPE_LIST);
		memoization_state.note_globally_cached_function(GET_INSTANCES_AS_RENDERINGS);
		register_external_symbol(GET_TERM_LIST_AS_RENDERINGS);
		register_external_symbol(GET_TERM_LIST_AS_RENDERINGS_WITH_FACT_SHEETS);
		register_external_symbol(GET_EXTERNAL_TERM_BROWSER_URL);
		register_external_symbol(GET_TERM_LIST_AS_RENDERINGS_WITH_FACT_SHEETS_STRIPPED);
		register_external_symbol(CONVERT_TERM_LIST_TO_RENDERINGS_FOR_JAVA);
		memoization_state.note_memoized_function(CONVERT_TERM_LIST_TO_RENDERINGS_FOR_JAVA_INT);
		register_external_symbol(SALIENT_INSTANTIATION_EXEMPLARS);
		register_external_symbol(GET_EXAMPLE_INSTANCES_AS_RENDERINGS_NEW);
		memoization_state.note_globally_cached_function(GET_EXAMPLE_INSTANCES_AS_RENDERINGS);
		memoization_state.note_globally_cached_function(GET_SALIENT_EXEMPLARS);
		register_external_symbol(GET_COLLECTION_EXTENT_ESTIMATES);
		register_external_symbol(GET_COLLECTION_EXTENT_ESTIMATES_NEW);
		register_external_symbol(CREATE_NEW_INSTANCE_FROM_TEMPLATE);
		register_external_symbol(KILL_CONSTANT);
		register_external_symbol(KILL_FORT);
		memoization_state.note_globally_cached_function(GET_REFORMULATION_SPECIFICATION_FROM_KB);
		register_external_symbol(REFORMULATE_UNKNOWN_FET_TERM);
		register_external_symbol(MAKE_FET_EVALUATION_ASSERTION);
		register_external_symbol(ADD_OR_EDIT_ASSERTION_VERBOSE);
		register_external_symbol(ADD_OR_EDIT_ASSERTION);
		declare_defglobal($future_assertion_counter$);
		register_external_symbol(CAE_APPLICABLE_TEMPLATE_TOPICS_FOR_TERM);
		register_external_symbol(GET_CAE_TEMPLATE_TOPICS);
		register_external_symbol(GATHER_TEMPORAL_CONCEPTS_FOR_CAE);
		register_external_symbol(GET_SHARED_COMMENTS);
		register_external_symbol($sym216$_API_WIDGET_RETURN_NEW_CYCLS_SEPARATELY__);
		register_external_symbol(GET_CONSTRAINED_CYCL_FOR_STRING);
		register_external_symbol(CONVERT_STRING_CONSTRAINT_TUPLE_TO_DENOTATION);
		register_external_symbol(GET_CYCLS_FOR_STRING_ESCALATING);
		memoization_state.note_globally_cached_function(GET_EXTENDED_CYCLS_FOR_STRING);
		memoization_state.note_globally_cached_function(GET_COERCED_CYCLS_FOR_TERM);
		register_external_symbol(GET_CONSTRAINED_CYCLS_FOR_REGULAR_EXPRESSION);
		register_external_symbol(FILTER_PHRASE_TERM_LIST_BY_CONSTRAINT_LIST);
		register_external_symbol(FILTER_CYCL_TERM_BY_CONSTRAINT_LIST);
		register_external_symbol(AUTO_COMPLETE_CONSTRAINED);
		register_external_symbol(AUTO_COMPLETE_TERM_QUICK);
		register_external_symbol(AUTO_COMPLETE_CONSTRAINED_NEW);
		register_external_symbol(FIND_TEMPLATE_TOPIC_MATCHES_FOR_CONSTRAINT);
		register_external_symbol(GET_TEMPLATE_TOPIC_ASSERTIONS_FOR_MATCH_IN_XML);
		memoization_state.note_memoized_function(FORMULA_TEMPLATE_LOAD_TEMPLATE_GRAPH_MEMOIZED);
		register_external_symbol(ASSERT_CANDIDATE_REPLACEMENTS_FOR_POSITION);
		register_external_symbol(CREATE_MINIMAL_FORMULA_TEMPLATE_WITH_QUERY);
		register_external_symbol(CREATE_MINIMAL_FORMULA_TEMPLATE_WITH_QUERY_INCLUDE_INFERENCE);
		register_external_symbol(ASSERT_UPDATED_INFERENCE_PARAMETERS_FOR_QUERY);
		register_external_symbol(COMBINE_QUERY_PROPERTIES);
		register_external_symbol(EDIT_QUERY_GLOSS);
		register_external_symbol(CREATE_NEW_FORMULA_TEMPLATE_WITH_QUERY);
		register_external_symbol(MAKE_MULTIPLE_ASSERTIONS_TO_MT);
		register_external_symbol(MAKE_MULTIPLE_ASSERTIONS_TO_MT_WITH_CREATION_TEMPLATE);
		register_external_symbol(MAIL_TO_USER);
		register_external_symbol(MAIL_TO_USER_WITH_CONTENT_TYPE);
		register_external_symbol(CYCLIST_DEFINED_INSTANCES_OF_COL);
		register_external_symbol(CYCLIST_DEFINED_SPECS_OF_COL);
		register_external_symbol(GET_TEMPLATE_TOPIC_IN_XML);
		register_external_symbol(GET_FORMULA_TEMPLATE_IN_XML);
		register_external_symbol(GET_CYCL_QUERY_IN_XML_FROM_DEFAULT_MT);
		register_external_symbol(GET_CYCL_QUERY_IN_XML);
		register_external_symbol(GET_FORMULA_TEMPLATE_FOR_FACT_OR_QUERY_IN_XML_FROM_DEFAULT_MT);
		register_external_symbol(GET_FORMULA_TEMPLATE_FOR_FACT_OR_QUERY_IN_XML);
		register_external_symbol(PROCESS_FEEDBACK);
		register_external_symbol(GET_POSSIBLE_RENDERERS_FOR_FOLLOWUP);
		memoization_state.note_globally_cached_function(GET_POSSIBLE_RENDERERS_FOR_FOLLOWUP_INT);
		register_external_symbol(UNIQUIFY_VARIABLES_ACROSS_TWO_SENTENCES);
		register_external_symbol(CHANGE_VARIABLE_NAMES);
		register_external_symbol(GENERALITY_SORT_LAMBDA);
		register_external_symbol(GET_POSSIBLE_MERGED_QUERIES);
		register_external_symbol(GET_POSSIBLE_MERGED_QUERIES_WRT_VAR);
		register_external_symbol(GET_SOURCE_CONCEPTUAL_WORKS_FOR_PROJECT);
		register_kb_function(ADD_SOURCE_OF_TYPE_FOR_PROJECT);
		register_kb_function(REMOVE_SOURCE_OF_TYPE_FOR_PROJECT);
		declare_defglobal($fet_categorized_sources$);
		register_external_symbol(GET_LISP_IMPLEMENTATION_TYPE);
		register_external_symbol(GET_LISP_IMPLEMENTATION_VERSION);
		register_external_symbol(RECONSIDER_TEMPLATE_FORMULA_USING_TMS);
		register_external_symbol(RTV_WIZARD_DEFAULT_PREDICATES);
		memoization_state.note_globally_cached_function(COLLECTION_CREATION_TEMPLATE);
		register_external_symbol(CREATE_COLLECTION_FROM_SET);
		register_external_symbol(CREATE_COLLECTION_FROM_ENUMERATED_TERMS);
		register_external_symbol(ADD_TO_COLLECTION_FROM_ENUMERATED_TERMS);
		register_external_symbol(FIND_EXTERNAL_AIS_TERMS_IN_INFERENCE);
		register_external_symbol(FIND_EXTERNAL_AIS_TERMS);
		memoization_state.note_memoized_function(VARIABLE_ISA_CONSTRAINTS_MEMOIZED);
		register_external_symbol(FORMULA_VARIABLE_ARG_CONSTRAINT_TABLE);
		register_external_symbol(NEW_CYC_QUERIES);
		register_external_symbol(GATHER_FILTERED_EL_RULE_ASSERTIONS_FOR_TERM);
		register_external_symbol(GATHER_SET_FILTERED_EL_RULE_ASSERTIONS_FOR_TERM);
		register_external_symbol(CONSTANTIFY_EXISTENTIALS_AND_OPEN_VARS);
		define_test_case_table_int(TEST_TEMPLATE_TOPIC_MATCH_FINDER, list(new SubLObject[] { $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list497);
		define_test_case_table_int(TEST_TERM_FILTERING_PASSES_FILTER, list(new SubLObject[] { $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list501);
		define_test_case_table_int(TEST_CONSTRAINED_CYCL_FILTER, list(new SubLObject[] { $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list504);
		define_test_case_table_int(TEST_BUG_PARSES, list(new SubLObject[] { $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list508);
		define_test_case_table_int(BUG_PARSE_COUNT, list(new SubLObject[] { $TEST, EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list512);
		define_test_case_table_int(WS_INSTANCE_SUBSET_TEST, list(new SubLObject[] { $TEST, EQ, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list515);
		define_test_case_table_int(GET_SPECS_FOR_WS, list(new SubLObject[] { $TEST, SIZE_BETWEEN, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list517);
		define_test_case_table_int(GET_GENLS_FOR_WS, list(new SubLObject[] { $TEST, SIZE_BETWEEN, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list518);
		define_test_case_table_int(GET_INSTANCES_FOR_WS, list(new SubLObject[] { $TEST, SIZE_BETWEEN, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list519);
		return NIL;
	}

	private static SubLObject _constant_508_initializer() {
		return list(new SubLObject[] {
				list(list(list(makeString("Ordizia, Spain"), reader_make_constant_shell(makeString("GeographicalRegion")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), list(reader_make_constant_shell(makeString("CityNamedFn")), makeString("Ordizia"), reader_make_constant_shell(makeString("Spain"))), makeInteger(13870)), T),
				list(list(list(new SubLObject[] { makeString("Hezbollah"), reader_make_constant_shell(makeString("TerroristGroup")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), reader_make_constant_shell(makeString("LebaneseHizballah")), makeKeyword("NOT-A-BUG")), T),
				list(list(list(makeString("#$BananaTree"), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("InferencePSC"))), reader_make_constant_shell(makeString("BananaTree")), makeKeyword("NOT-A-BUG")), T),
				list(list(list(makeString("Israeli army"), reader_make_constant_shell(makeString("Agent-PartiallyTangible")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), list(reader_make_constant_shell(makeString("ArmyFn")), reader_make_constant_shell(makeString("Israel"))), makeInteger(13667)), T),
				list(list(
						list(new SubLObject[] { makeString("tomatoes"), list(makeSymbol("CANONICALIZE-TERM"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("HighExplosive"))))),
								list(makeSymbol("LIST"), reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))),
								list(makeSymbol("LIST"), reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("TerrorismParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))),
								list(makeSymbol("LIST"), reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("nonPlural-Generic"))),
								NIL, NIL, list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }),
						list(reader_make_constant_shell(makeString("ProperSubcollectionNamedFn-Ternary")), makeString("tomatoes"), reader_make_constant_shell(makeString("HighExplosive")), makeString("53c4c132-f1e1-11da-88f0-0002b3a85b0b")), makeInteger(19137)), T),
				list(list(list(new SubLObject[] { makeString("3"), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("TerrorismParaphraseMt")),
						list(makeSymbol("LIST"), reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt"))), T, T, T, makeKeyword("NONE"), makeKeyword("DEFAULT"),
						list(makeSymbol("LIST"), reader_make_constant_shell(makeString("thereExists")), list(makeSymbol("QUOTE"), makeSymbol("?NUM")),
								list(makeSymbol("LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("greaterThan")), list(makeSymbol("QUOTE"), makeSymbol("?NUM")), ZERO_INTEGER),
										list(makeSymbol("LIST"), reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("intendedAttackTargets")), list(makeSymbol("QUOTE"), makeSymbol("?ATTACK")), reader_make_constant_shell(makeString("RestaurantSpace"))),
										list(makeSymbol("LIST"), reader_make_constant_shell(makeString("dateOfEvent")), list(makeSymbol("QUOTE"), makeSymbol("?ATTACK")), list(makeSymbol("CANONICALIZE-TERM"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("DecadeFn")), makeInteger(199))))),
										list(makeSymbol("LIST"), reader_make_constant_shell(makeString("relationInstanceExistsCount")), reader_make_constant_shell(makeString("animalWoundedIn")), list(makeSymbol("QUOTE"), makeSymbol("?ATTACK")), reader_make_constant_shell(makeString("Person")), list(makeSymbol("QUOTE"), makeSymbol("?NUM"))))),
						list(makeSymbol("LIST"), TWO_INTEGER, ONE_INTEGER, TWO_INTEGER), list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), THREE_INTEGER, makeInteger(17698)), T),
				list(list(list(makeString("Austin, TX"), reader_make_constant_shell(makeString("Place")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), reader_make_constant_shell(makeString("CityOfAustinTX")), makeInteger(11675)), T),
				list(list(list(makeString("the mid 1980s"), reader_make_constant_shell(makeString("TemporalThing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("EnglishMt")), T),
						list(reader_make_constant_shell(makeString("MiddlePartFn")), list(reader_make_constant_shell(makeString("DecadeFn")), makeInteger(198))), makeInteger(11969)), T),
				list(list(list(makeString("and"), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("EnglishMt")), T), reader_make_constant_shell(makeString("and")), makeInteger(17645)), T),
				list(list(list(makeString("#$and"), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("EnglishMt")), T), reader_make_constant_shell(makeString("and")), makeInteger(17645)), T),
				list(list(list(makeString("late October 1980"), reader_make_constant_shell(makeString("TemporalThing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("EnglishMt")), T),
						list(reader_make_constant_shell(makeString("LatePartFn")), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("October")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1980)))), makeInteger(11969)), T),
				list(list(list(makeString("2001"), reader_make_constant_shell(makeString("TemporalThing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("EnglishMt")), T), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2001)), makeInteger(11972)), T),
				list(list(
						list(makeString("between 1973 and 1988"), reader_make_constant_shell(makeString("TemporalThing")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
								list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
								list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T),
						list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1973)), makeKeyword("GUID-STRING")),
								list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1988)), makeKeyword("GUID-STRING"))),
						makeInteger(12047)), T),
				list(list(list(makeString("$2"), reader_make_constant_shell(makeString("MonetaryValue")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), list(reader_make_constant_shell(makeString("Dollar-UnitedStates")), TWO_INTEGER), makeInteger(15954)), T),
				list(list(list(makeString("between 7 and 10"), reader_make_constant_shell(makeString("NonNegativeIntegerRange")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), list(reader_make_constant_shell(makeString("IntervalRangeFn")), SEVEN_INTEGER, TEN_INTEGER), makeInteger(12348)), T),
				list(list(list(makeString("Western Europe"), reader_make_constant_shell(makeString("GeographicalRegion")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), reader_make_constant_shell(makeString("WesternEurope")), makeInteger(12367)), T),
				list(list(list(makeString("Western Congo-Kinshasa"), reader_make_constant_shell(makeString("GeographicalRegion")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), list(reader_make_constant_shell(makeString("WesternRegionFn")), reader_make_constant_shell(makeString("DemocraticRepublicOfTheCongo"))), makeInteger(14356)), T),
				list(list(list(makeString("Israel"), reader_make_constant_shell(makeString("IndependentCountry")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), reader_make_constant_shell(makeString("Israel")), makeInteger(12377)), T),
				list(list(
						list(new SubLObject[] { makeString("from early 1997 to the end of January 2004"), reader_make_constant_shell(makeString("TimeInterval")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
								list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
								list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL, NIL,
								list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("TRUE"))) }),
						list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("EarlyPartFn")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(1997))), makeString("506fa613-a8de-11d8-8d30-0002b3a84f94")),
								list(reader_make_constant_shell(makeString("SomeTimeInIntervalFn")), list(reader_make_constant_shell(makeString("EndingIntervalFn")), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2004)))), makeString("506fa614-a8de-11d8-8d30-0002b3a84f94"))),
						makeInteger(12404)), T),
				list(list(list(makeString("separatist organization"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("PoliticalOrganization")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), reader_make_constant_shell(makeString("SeparatistOrganization")), makeInteger(12425)), T),
				list(list(list(makeString("CA"), reader_make_constant_shell(makeString("Place")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), reader_make_constant_shell(makeString("California-State")), makeInteger(12438)), T),
				list(list(list(makeString("arson"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("SpecsFn")), reader_make_constant_shell(makeString("ActionOnObject")))), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), reader_make_constant_shell(makeString("Arson")), makeInteger(12479)), T),
				list(list(list(makeString("10 kilos"), reader_make_constant_shell(makeString("MassOrSpatialQuantity")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), list(reader_make_constant_shell(makeString("Kilogram")), TEN_INTEGER), makeInteger(12488)), T),
				list(list(list(makeString("10 pounds"), reader_make_constant_shell(makeString("MassOrSpatialQuantity")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T), list(reader_make_constant_shell(makeString("Pound-UnitOfMass")), TEN_INTEGER), makeInteger(12503)), T),
				list(list(list(new SubLObject[] { makeString("approx 1000"), reader_make_constant_shell(makeString("NonNegativeIntegerRange")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), list(reader_make_constant_shell(makeString("ApproximatelyFn")), makeInteger(1000)), makeInteger(12588)), T),
				list(list(list(new SubLObject[] { makeString("Greater than 9"), reader_make_constant_shell(makeString("NonNegativeIntegerRange")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), list(reader_make_constant_shell(makeString("IntervalOfTypeMinFn")), reader_make_constant_shell(makeString("NonNegativeInteger")), TEN_INTEGER), makeInteger(12713)), T),
				list(list(list(new SubLObject[] { makeString("over 9"), reader_make_constant_shell(makeString("NonNegativeIntegerRange")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), list(reader_make_constant_shell(makeString("IntervalOfTypeMinFn")), reader_make_constant_shell(makeString("NonNegativeInteger")), TEN_INTEGER), makeInteger(12713)), T),
				list(list(list(new SubLObject[] { makeString("fewer than 9"), reader_make_constant_shell(makeString("NonNegativeIntegerRange")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), list(reader_make_constant_shell(makeString("IntervalOfTypeMaxFn")), reader_make_constant_shell(makeString("NonNegativeInteger")), EIGHT_INTEGER), makeInteger(12713)), T),
				list(list(list(new SubLObject[] { makeString("under 9"), reader_make_constant_shell(makeString("NonNegativeIntegerRange")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")))), T, NIL, T, makeKeyword("NONE"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("nonPlural-Generic")))), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), list(reader_make_constant_shell(makeString("IntervalOfTypeMaxFn")), reader_make_constant_shell(makeString("NonNegativeInteger")), EIGHT_INTEGER), makeInteger(12713)), T),
				list(list(list(new SubLObject[] { makeString("sudan's government"), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("TerrorismParaphraseMt")),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")))), T, NIL, T, makeKeyword("NONE"), makeKeyword("DEFAULT"), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), list(reader_make_constant_shell(makeString("GovernmentFn")), reader_make_constant_shell(makeString("Sudan"))), makeInteger(21749)), T),
				list(list(list(new SubLObject[] { makeString("government of Sudan"), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("TerrorismParaphraseMt")),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")))), T, NIL, T, makeKeyword("NONE"), makeKeyword("DEFAULT"), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), list(reader_make_constant_shell(makeString("GovernmentFn")), reader_make_constant_shell(makeString("Sudan"))), makeInteger(21749)), T),
				list(list(list(new SubLObject[] { makeString("the government of Sudan"), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), reader_make_constant_shell(makeString("TerrorismParaphraseMt")),
						list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("MtUnionFn")), reader_make_constant_shell(makeString("EnglishMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")))), T, NIL, T, makeKeyword("NONE"), makeKeyword("DEFAULT"), NIL, NIL,
						list(makeSymbol("QUOTE"), list(makeKeyword("CASE-INSENSITIVE"), makeKeyword("TRUE"), makeKeyword("REGULAR-EXPRESSIONS"), makeKeyword("FALSE"))) }), list(reader_make_constant_shell(makeString("GovernmentFn")), reader_make_constant_shell(makeString("Sudan"))), makeInteger(21749)), T) });
	}

	@Override
	public void declareFunctions() {
		declare_api_widgets_file();
	}

	@Override
	public void initializeVariables() {
		init_api_widgets_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_api_widgets_file();
	}

	

	public static final class $foo_native extends SubLStructNative {
		public SubLObject $bar;

		private static final SubLStructDeclNative structDecl;

		private $foo_native() {
			this.$bar = Lisp.NIL;
		}

		@Override
		public SubLStructDecl getStructDecl() {
			return structDecl;
		}

		@Override
		public SubLObject getField2() {
			return this.$bar;
		}

		@Override
		public SubLObject setField2(final SubLObject value) {
			return this.$bar = value;
		}

		static {
			structDecl = makeStructDeclNative($foo_native.class, FOO, FOO_P, $list2, $list3, new String[] { "$bar" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
		}
	}

	public static final class $foo_p$UnaryFunction extends UnaryFunction {
		public $foo_p$UnaryFunction() {
			super(extractFunctionNamed("FOO-P"));
		}

		@Override
		public SubLObject processItem(final SubLObject arg1) {
			return foo_p(arg1);
		}
	}
}

/**
 * Total time: 13542 ms synthetic
 */
