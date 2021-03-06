package com.cyc.cycjava.cycl.inference.browser;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_destroy_all_inferences_but_last_n$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_include_inference_helpP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_perform_argumentation_for_closed_queryP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_followP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_permit_robots_to_indexP$;
import static com.cyc.cycjava.cycl.cb_parameters.$cb_separate_doc_frame$;
import static com.cyc.cycjava.cycl.cb_parameters.cb_head_shortcut_icon;
import static com.cyc.cycjava.cycl.cb_parameters.cyc_cgi_url_int;
import static com.cyc.cycjava.cycl.cb_utilities.cb_back_button;
import static com.cyc.cycjava.cycl.cb_utilities.cb_error;
import static com.cyc.cycjava.cycl.cb_utilities.cb_form;
import static com.cyc.cycjava.cycl.cb_utilities.cb_frame_name;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_help_preamble;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link;
import static com.cyc.cycjava.cycl.cb_utilities.cb_link_assertion;
import static com.cyc.cycjava.cycl.cb_utilities.cb_message_page_with_history;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_assertion_readably;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_boolean;
import static com.cyc.cycjava.cycl.cb_utilities.cb_show_term;
import static com.cyc.cycjava.cycl.cb_utilities.cb_simple_message_page;
import static com.cyc.cycjava.cycl.cb_utilities.cb_term_identifier;
import static com.cyc.cycjava.cycl.cb_utilities.declare_cb_tool;
import static com.cyc.cycjava.cycl.cb_utilities.setup_cb_link_method;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$cb_literal_query_results_one_per_lineP$;
import static com.cyc.cycjava.cycl.control_vars.$forward_inference_removal_cost_cutoff$;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.make_ist_sentence;
import static com.cyc.cycjava.cycl.html_utilities.extract_encoded_form_field_value;
import static com.cyc.cycjava.cycl.html_utilities.get_encoded_form_field_name;
import static com.cyc.cycjava.cycl.html_utilities.html_align;
import static com.cyc.cycjava.cycl.html_utilities.html_char;
import static com.cyc.cycjava.cycl.html_utilities.html_checkbox_input;
import static com.cyc.cycjava.cycl.html_utilities.html_color;
import static com.cyc.cycjava.cycl.html_utilities.html_control_parameter_entry_name;
import static com.cyc.cycjava.cycl.html_utilities.html_control_parameter_radio_name;
import static com.cyc.cycjava.cycl.html_utilities.html_copyright_notice;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_boolean;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_input;
import static com.cyc.cycjava.cycl.html_utilities.html_extract_string;
import static com.cyc.cycjava.cycl.html_utilities.html_filename_input;
import static com.cyc.cycjava.cycl.html_utilities.html_glyph;
import static com.cyc.cycjava.cycl.html_utilities.html_hidden_input;
import static com.cyc.cycjava.cycl.html_utilities.html_hr;
import static com.cyc.cycjava.cycl.html_utilities.html_indent;
import static com.cyc.cycjava.cycl.html_utilities.html_markup;
import static com.cyc.cycjava.cycl.html_utilities.html_meta_robot_instructions;
import static com.cyc.cycjava.cycl.html_utilities.html_newline;
import static com.cyc.cycjava.cycl.html_utilities.html_percent_progress_bar;
import static com.cyc.cycjava.cycl.html_utilities.html_prin1;
import static com.cyc.cycjava.cycl.html_utilities.html_princ;
import static com.cyc.cycjava.cycl.html_utilities.html_princ_strong;
import static com.cyc.cycjava.cycl.html_utilities.html_radio_input;
import static com.cyc.cycjava.cycl.html_utilities.html_refresh;
import static com.cyc.cycjava.cycl.html_utilities.html_reset_input;
import static com.cyc.cycjava.cycl.html_utilities.html_simple_attribute;
import static com.cyc.cycjava.cycl.html_utilities.html_source_readability_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_style_background_color;
import static com.cyc.cycjava.cycl.html_utilities.html_submit_input;
import static com.cyc.cycjava.cycl.html_utilities.html_target_definition;
import static com.cyc.cycjava.cycl.html_utilities.html_terpri;
import static com.cyc.cycjava.cycl.html_utilities.html_text_input;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$html_state_variables$;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.round;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nthcdr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.parse_integer;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.get_output_stream_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.make_private_string_output_stream;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.ArrayList;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.blue_grapher_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.cb_assertion_editor;
import com.cyc.cycjava.cycl.cb_blue_grapher;
import com.cyc.cycjava.cycl.cb_events;
import com.cyc.cycjava.cycl.cb_form_widgets;
import com.cyc.cycjava.cycl.cb_system_tools;
import com.cyc.cycjava.cycl.cb_tools;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cyc_file_dependencies;
import com.cyc.cycjava.cycl.cyc_navigator_internals;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dhtml_macros;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.html_arghash;
import com.cyc.cycjava.cycl.html_complete;
import com.cyc.cycjava.cycl.html_macros;
import com.cyc.cycjava.cycl.html_script_utilities;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_hl_supports_high;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.plot_generation;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.special_variable_state;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.cb_kct_test;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_strategic_heuristics;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_query extends SubLTranslatedFile {
    public static final SubLFile me = new cb_query();

    public static final String myName = "com.cyc.cycjava.cycl.inference.browser.cb_query";

    public static final String myFingerPrint = "701c234a31945b3c241ec25730e8dfc9d1c27a4c9cc30f96108597fe916ded7f";

    // deflexical
    // Definitions
    /**
     * When non-nil, a separate auto-refreshing frame is used to display inference
     * progress for running inferences.
     */
    private static final SubLSymbol $cb_inference_progress_frame_enabledP$ = makeSymbol("*CB-INFERENCE-PROGRESS-FRAME-ENABLED?*");

    // deflexical
    /**
     * Currently all the inference help is in one file. Eventually this should be
     * split up and this variable should go away.
     */
    private static final SubLSymbol $cb_inference_help_filename$ = makeSymbol("*CB-INFERENCE-HELP-FILENAME*");



    // deflexical
    private static final SubLSymbol $inference_mode_custom_value_number$ = makeSymbol("*INFERENCE-MODE-CUSTOM-VALUE-NUMBER*");



    // defvar
    private static final SubLSymbol $cb_cyc_editor_enabledP$ = makeSymbol("*CB-CYC-EDITOR-ENABLED?*");





    // deflexical
    // Mts to always give as suggestions the monad mt.
    private static final SubLSymbol $cb_query_default_mt_monad_choices$ = makeSymbol("*CB-QUERY-DEFAULT-MT-MONAD-CHOICES*");



    // deflexical
    private static final SubLSymbol $cb_basic_inference_resource_constraints$ = makeSymbol("*CB-BASIC-INFERENCE-RESOURCE-CONSTRAINTS*");

    // deflexical
    // Properties determined by the inference mode, if other than Debug.
    private static final SubLSymbol $cb_inference_mode_properties$ = makeSymbol("*CB-INFERENCE-MODE-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cb_advanced_inference_dynamic_properties$ = makeSymbol("*CB-ADVANCED-INFERENCE-DYNAMIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cb_advanced_inference_static_properties$ = makeSymbol("*CB-ADVANCED-INFERENCE-STATIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cb_advanced_strategy_dynamic_properties$ = makeSymbol("*CB-ADVANCED-STRATEGY-DYNAMIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cb_advanced_strategy_static_properties$ = makeSymbol("*CB-ADVANCED-STRATEGY-STATIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cb_advanced_problem_store_dynamic_properties$ = makeSymbol("*CB-ADVANCED-PROBLEM-STORE-DYNAMIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cb_advanced_problem_store_static_properties$ = makeSymbol("*CB-ADVANCED-PROBLEM-STORE-STATIC-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cb_all_inference_properties$ = makeSymbol("*CB-ALL-INFERENCE-PROPERTIES*");

    // deflexical
    private static final SubLSymbol $cb_all_inference_parameters$ = makeSymbol("*CB-ALL-INFERENCE-PARAMETERS*");

    // deflexical
    private static final SubLSymbol $html_js_on_click_preamble$ = makeSymbol("*HTML-JS-ON-CLICK-PREAMBLE*");

    // deflexical
    private static final SubLSymbol $html_js_on_click_postamble$ = makeSymbol("*HTML-JS-ON-CLICK-POSTAMBLE*");

    // deflexical
    private static final SubLSymbol $cb_set_all_radio_buttons_body$ = makeSymbol("*CB-SET-ALL-RADIO-BUTTONS-BODY*");

    // deflexical
    private static final SubLSymbol $cb_set_field_value_body$ = makeSymbol("*CB-SET-FIELD-VALUE-BODY*");

    // deflexical
    private static final SubLSymbol $cb_focus_and_set_all_radio_buttons_script$ = makeSymbol("*CB-FOCUS-AND-SET-ALL-RADIO-BUTTONS-SCRIPT*");

    // deflexical
    /**
     * The default mt to use when performing queries in which the mt was not
     * specified.
     */
    private static final SubLSymbol $cb_default_unspecified_query_mt$ = makeSymbol("*CB-DEFAULT-UNSPECIFIED-QUERY-MT*");

    // deflexical
    private static final SubLSymbol $cb_literal_query_variables$ = makeSymbol("*CB-LITERAL-QUERY-VARIABLES*");

    // deflexical
    private static final SubLSymbol $cb_literal_query_time_cutoff$ = makeSymbol("*CB-LITERAL-QUERY-TIME-CUTOFF*");

    // defparameter
    private static final SubLSymbol $sort_literal_query_terms_by_generality_estimateP$ = makeSymbol("*SORT-LITERAL-QUERY-TERMS-BY-GENERALITY-ESTIMATE?*");

    // deflexical
    private static final SubLSymbol $cb_query_auto_refresh_rate$ = makeSymbol("*CB-QUERY-AUTO-REFRESH-RATE*");

    // deflexical
    private static final SubLSymbol $cb_open_inference_progress_frame_height$ = makeSymbol("*CB-OPEN-INFERENCE-PROGRESS-FRAME-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_closed_inference_progress_frame_height$ = makeSymbol("*CB-CLOSED-INFERENCE-PROGRESS-FRAME-HEIGHT*");

    // deflexical
    private static final SubLSymbol $cb_inference_answer_section_limit$ = makeSymbol("*CB-INFERENCE-ANSWER-SECTION-LIMIT*");

    // defparameter
    private static final SubLSymbol $cb_show_forward_inference_metrics_verbosity$ = makeSymbol("*CB-SHOW-FORWARD-INFERENCE-METRICS-VERBOSITY*");



    public static final SubLString $str1$_ = makeString("-");

    public static final SubLList $list2 = list(CHAR_hyphen);

    public static final SubLList $list3 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"));

    public static final SubLString $str4$nd___ = makeString("nd();");

    public static final SubLString $$$__ = makeString("  ");

    public static final SubLString $str6$ = makeString("");

    public static final SubLList $list7 = list(makeSymbol("URL-BODY"), makeSymbol("LINK-BODY"), makeSymbol("&OPTIONAL"), list(makeSymbol("TARGET"), makeKeyword("MAIN")), makeSymbol("EXPLANATION"), makeSymbol("CAPTION"), makeSymbol("WIDTH"), makeSymbol("STICKY"));



    public static final SubLSymbol FRAME_LINK_HOVEROVER = makeSymbol("FRAME-LINK-HOVEROVER");







    public static final SubLSymbol CB_LINK_INFERENCE_DOC = makeSymbol("CB-LINK-INFERENCE-DOC");

    public static final SubLString $$$None = makeString("None");

    public static final SubLString $str15$_D_total = makeString("~D total");

    public static final SubLString $str16$__ = makeString(", ");

    public static final SubLString $str17$_D_new = makeString("~D new");

    public static final SubLString $str18$_D_new_justification_P = makeString("~D new justification~P");





    private static final SubLSymbol $SUSPENDED_INITIAL_JUSTIFICATION = makeKeyword("SUSPENDED-INITIAL-JUSTIFICATION");

    public static final SubLString $str22$_Explain_ = makeString("[Explain]");



    public static final SubLString $str24$More___ = makeString("More...");

    public static final SubLString $str25$help_inference_ = makeString("help/inference/");

    public static final SubLString $str26$inference_overview = makeString("inference-overview");

    public static final SubLString $str27$_html_ = makeString(".html#");

    public static final SubLSymbol $inference_parameter_table$ = makeSymbol("*INFERENCE-PARAMETER-TABLE*");









    private static final SubLSymbol $kw33$ROUND_ON_INPUT_ = makeKeyword("ROUND-ON-INPUT?");

    public static final SubLList $list34 = list(makeSymbol("PARAMETER"), makeSymbol("&KEY"), makeSymbol("FANCY-NAME"), makeSymbol("DESCRIPTION"), makeSymbol("SETTINGS"), makeSymbol("SCALING-FACTOR"), makeSymbol("ROUND-ON-INPUT?"));

    public static final SubLList $list35 = list(makeKeyword("FANCY-NAME"), makeKeyword("DESCRIPTION"), makeKeyword("SETTINGS"), makeKeyword("SCALING-FACTOR"), makeKeyword("ROUND-ON-INPUT?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol DECLARE_INFERENCE_PARAMETER_INTERNAL = makeSymbol("DECLARE-INFERENCE-PARAMETER-INTERNAL");



    public static final SubLSymbol DECLARE_INFERENCE_PARAMETER = makeSymbol("DECLARE-INFERENCE-PARAMETER");

    public static final SubLList $list40 = list(makeSymbol("PARAMETER"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list42 = list(list(makeKeyword("ENTRY"), makeSymbol("TRUE"), makeString("")));

    public static final SubLList $list43 = list(makeSymbol("METHOD"), makeSymbol("DATA"), makeSymbol("EXPLANATION"));







    public static final SubLString $$$Number_cutoff = makeString("Number cutoff");

    public static final SubLString $str48$This_controls_how_many_answers_we = makeString("This controls how many answers we want to find before suspending.");

    public static final SubLList $list49 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("answers")), list(makeKeyword("VALUE"), NIL, makeString("Get everything")));



    public static final SubLString $$$Time_cutoff = makeString("Time cutoff");

    public static final SubLString $str52$This_controls_how_long_we_allow_a = makeString("This controls how long we allow an inference to run before suspending.");

    public static final SubLList $list53 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("seconds")), list(makeKeyword("VALUE"), NIL, makeString("Run forever")));



    public static final SubLString $$$Step_cutoff = makeString("Step cutoff");

    public static final SubLString $str56$This_controls_how_many_inference_ = makeString("This controls how many inference steps we allow before suspending.");

    public static final SubLList $list57 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("steps")), list(makeKeyword("VALUE"), NIL, makeString("No limit")));



    public static final SubLString $$$Inference_engine_mode = makeString("Inference engine mode");

    public static final SubLString $str60$This_controls_what_mode_the_infer = makeString("This controls what mode the inference engine will operate under; roughly, how deep it will search for an answer before giving up.  This is a meta-property that controls many other low-level inference settings.");

    public static final SubLList $list61 = list(list(makeKeyword("VALUE"), makeKeyword("MINIMAL"), makeString("Minimal")), list(makeKeyword("VALUE"), makeKeyword("SHALLOW"), makeString("Shallow")), list(makeKeyword("VALUE"), makeKeyword("EXTENDED"), makeString("Extended")), list(makeKeyword("VALUE"), makeKeyword("MAXIMAL"), makeString("Maximal")), list(makeKeyword("VALUE"), makeKeyword("CUSTOM"), makeString("Debug")));

    private static final SubLSymbol $FORWARD_MAX_TIME = makeKeyword("FORWARD-MAX-TIME");

    public static final SubLString $$$Forward_time_cutoff = makeString("Forward time cutoff");

    public static final SubLString $str64$This_controls_how_long_we_allow_f = makeString("This controls how long we allow forward inference in the mt of an inference to run before starting the backward inference.  This is usually only used for hypothetical queries.");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");

    public static final SubLString $$$Transformation_cutoff = makeString("Transformation cutoff");

    public static final SubLString $str67$This_specifies_the_maximum_allowa = makeString("This specifies the maximum allowable number of transformation steps in answers.");

    public static final SubLList $list68 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("transformation steps (at most)")), list(makeKeyword("VALUE"), NIL, makeString("Unlimited transformation")));

    private static final SubLSymbol $MIN_RULE_UTILITY = makeKeyword("MIN-RULE-UTILITY");

    private static final SubLString $$$Rule_utility_threshold = makeString("Rule utility threshold");

    private static final SubLString $str71$This_specifies_the_minimum_allowa = makeString("This specifies the minimum allowable utility of a rule used in transformation, from -100 to +100.");

    public static final SubLList $list72 = list(list(makeKeyword("ENTRY"), makeSymbol("RULE-UTILITY-P"), makeString("minimum rule utility")));

    private static final SubLSymbol $MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");

    private static final SubLString $$$Proof_complexity_cutoff = makeString("Proof complexity cutoff");

    private static final SubLString $str75$This_specifies_the_maximum_allowa = makeString("This specifies the maximum allowable number of steps in proofs for answers.");

    public static final SubLList $list76 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("proof steps (at most)")), list(makeKeyword("VALUE"), NIL, makeString("No limit")));

    private static final SubLSymbol $PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");

    private static final SubLString $$$Probably_Done_cutoff = makeString("Probably Done cutoff");

    private static final SubLString $str79$Probably_Approximately_Done__This = makeString("Probably Approximately Done: This controls how sure the Strategist must be that an inference will yield no more results before terminating it.  The Strategist uses past experience to make this determination.");

    private static final SubLList $list80 = list(list(makeKeyword("ENTRY"), makeSymbol("PERCENTAGE-P"), makeString("%")), list(makeKeyword("VALUE"), makeInteger(100), makeString("100 %")));

    private static final SubLFloat $float$0_01 = makeDouble(0.01);



    private static final SubLString $$$Step_by_step = makeString("Step by step");

    private static final SubLString $str84$This_controls_whether_the_inferen = makeString("This controls whether the inference will be run one step at a time, waiting for the user to click between each step.\nYou\'ll probably want to turn the time cutoff to \'run forever\' if you want to go step by step.");

    private static final SubLList $list85 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes")));

    private static final SubLSymbol $kw86$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");

    private static final SubLString $$$Cache_backward_query_results = makeString("Cache backward query results");

    private static final SubLString $str88$This_controls_whether_or_not_the_ = makeString("This controls whether or not the proofs for successful inference answers are cached\nas deductions for assertions in the KB.");



    private static final SubLString $$$Answer_language = makeString("Answer language");

    private static final SubLString $str91$This_controls_the_CycL_language_u = makeString("This controls the CycL language used to express answers.");

    public static final SubLList $list92 = list(list(makeKeyword("VALUE"), makeKeyword("HL"), makeString("HL")), list(makeKeyword("VALUE"), makeKeyword("EL"), makeString("EL")));



    private static final SubLString $$$Continuable = makeString("Continuable");

    private static final SubLString $str95$This_controls_whether_the_inferen = makeString("This controls whether the inference is continuable or not.");

    public static final SubLList $list96 = list(list(makeKeyword("VALUE"), NIL, makeString("No (allows strengthening)")), list(makeKeyword("VALUE"), T, makeString("Yes")));



    private static final SubLString $$$Metrics = makeString("Metrics");

    private static final SubLString $str99$This_controls_which_metrics_are_g = makeString("This controls which metrics are gathered while the inference is running.");

    private static final SubLList $list100 = list(list(makeKeyword("VALUE"), NIL, makeString("None")), list(makeKeyword("ENTRY"), makeSymbol("NON-EMPTY-LIST-P"), makeString("")));

    private static final SubLSymbol $kw101$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");

    private static final SubLString $$$Allow_HL_predicate_transformation = makeString("Allow HL predicate transformation");

    private static final SubLString $str103$Whether_transformation_is_allowed = makeString("Whether transformation is allowed on literals with HL predicates (e.g. #$isa, #$genls, #$equals, etc.)");

    private static final SubLList $list104 = list(list(makeKeyword("VALUE"), NIL, makeString("No")), list(makeKeyword("VALUE"), T, makeString("Yes (expensive)")));

    private static final SubLSymbol $kw105$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");

    private static final SubLString $str106$Allow_unbound_predicate_rule_back = makeString("Allow unbound predicate rule backchaining");

    private static final SubLString $str107$Whether_it_is_permissible_to_use_ = makeString("Whether it is permissible to use rules that conclude to literals with variable predicates.");

    private static final SubLSymbol $kw108$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");

    private static final SubLString $str109$Allow_evaluatable_predicate_trans = makeString("Allow evaluatable predicate transformation");

    private static final SubLString $str110$Whether_transformation_is_allowed = makeString("Whether transformation is allowed on literals with evaluatable predicates (e.g. #$different, #$greaterThan, #$substring, etc.)");

    private static final SubLSymbol $kw111$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");

    private static final SubLString $str112$Allow_result_bindings_to_indeterm = makeString("Allow result bindings to indeterminates");

    private static final SubLString $str113$Whether_it_is_permissible_to_use_ = makeString("Whether it is permissible to use quoted instances of #$IndeterminateTerm for result bindings.\n   Note that quoted instances of #$IndeterminateTerm will always be used for explicitly scoped variables \n   (e.g. scoped by #$thereExists, etc.).");

    private static final SubLSymbol $kw114$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");

    private static final SubLString $str115$Allow_abnormality_checking_ = makeString("Allow abnormality checking?");

    private static final SubLString $str116$Whether_to_check_for_exceptions_t = makeString("Whether to check for exceptions to top-level proofs, e.g. exceptions to rules in transformation proofs.");

    private static final SubLSymbol $TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");

    private static final SubLString $$$Transitive_closure_mode = makeString("Transitive closure mode");

    private static final SubLString $str119$The_degree_to_which_modules__such = makeString("The degree to which modules (such as transitiveViaArg) should generate transitive closures. ");

    public static final SubLList $list120 = list(list(makeKeyword("VALUE"), makeKeyword("NONE"), makeString("No closures")), list(makeKeyword("VALUE"), makeKeyword("FOCUSED"), makeString("Focused closures (expensive)")), list(makeKeyword("VALUE"), makeKeyword("ALL"), makeString("Full closures (very expensive)")));



    private static final SubLString $$$Result_uniqueness_is_based_on = makeString("Result uniqueness is based on");

    private static final SubLString $str123$If_result_uniqueness_is_based_on_ = makeString("If result uniqueness is based on different bindings, it won't bother to prove the same thing using different methods.");

    public static final SubLList $list124 = list(list(makeKeyword("VALUE"), makeKeyword("BINDINGS"), makeString("different bindings")), list(makeKeyword("VALUE"), makeKeyword("PROOF"), makeString("different proofs")));

    private static final SubLSymbol $DISJUNCTION_FREE_EL_VARS_POLICY = makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY");

    private static final SubLString $str126$If_disjuncts_have_different_free_ = makeString("If disjuncts have different free EL variables, ");

    private static final SubLString $str127$What_to_do_if_different_top_level = makeString("What to do if different top-level disjuncts in the query have different sets of free EL variables,\ne.g. (or (isa ?X Dog) (isa ?Y Cat)).");

    public static final SubLList $list128 = list(list(makeKeyword("VALUE"), makeKeyword("REQUIRE-EQUAL"), makeString("deem the query ill-formed")), list(makeKeyword("VALUE"), makeKeyword("COMPUTE-INTERSECTION"), makeString("use their intersection")), list(makeKeyword("VALUE"), makeKeyword("COMPUTE-UNION"), makeString("use their union")));



    private static final SubLString $$$Allowed_HL_Modules = makeString("Allowed HL Modules");

    private static final SubLString $str131$An_HL_module_specification_which_ = makeString("An HL module specification which limits the Strategist's ability to use certain HL modules.");

    private static final SubLList $list132 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-UNIVERSAL-ALLOWED-MODULES-SPEC-P"), makeString("")), list(makeKeyword("VALUE"), makeKeyword("ALL"), makeString("All HL Modules")));



    private static final SubLString $$$Productivity_limit = makeString("Productivity limit");

    private static final SubLString $str135$If_a_tactic_is_estimated_to_have_ = makeString("If a tactic is estimated to have more than this productivity, it will be ignored instead of executed.\nProductivity is (roughly) the expected number of answers generated.");

    private static final SubLList $list136 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-NEGATIVE-NUMBER-P"), makeString("(at most)")), list(makeKeyword("VALUE"), makeKeyword("POSITIVE-INFINITY"), makeString("No limit")));



    private static final SubLSymbol $REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");

    private static final SubLString $str139$Removal_backtracking_productivity = makeString("Removal backtracking productivity limit");

    private static final SubLString $str140$If_a_tactic_is_estimated_to_have_ = makeString("If a tactic is estimated to have more than this productivity, it will not be considered for Removal Backtracking\nProductivity is (roughly) 100 * the expected number of answers generated.  Note that in the Inference Browser,\ndisplayed productivities are divided by 100.");

    public static final SubLList $list141 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("(at most)")), list(makeKeyword("VALUE"), makeKeyword("POSITIVE-INFINITY"), makeString("No limit")));

    private static final SubLSymbol $EQUALITY_REASONING_METHOD = makeKeyword("EQUALITY-REASONING-METHOD");

    private static final SubLString $$$Canonicalize_problems = makeString("Canonicalize problems");

    private static final SubLString $str144$Whether_to_canonicalize_problem_q = makeString("Whether to canonicalize problem queries wrt literal order and HL variable order.\nWARNING: results may be unpredictable if canonicalization is disabled.");

    public static final SubLList $list145 = list(list(makeKeyword("VALUE"), makeKeyword("CZER-EQUAL"), makeString("Yes")), list(makeKeyword("VALUE"), makeKeyword("EQUAL"), makeString("No")));

    private static final SubLSymbol $EQUALITY_REASONING_DOMAIN = makeKeyword("EQUALITY-REASONING-DOMAIN");

    private static final SubLString $$$Allow_problem_reuse_for = makeString("Allow problem reuse for");

    private static final SubLString $str148$Which_problems_are_permitted_to_b = makeString("Which problems are permitted to be reused by the Worker.\nWARNING: results may be unpredictable if this is set to anything other than \'all problems\'.");

    public static final SubLList $list149 = list(list(makeKeyword("VALUE"), makeKeyword("ALL"), makeString("all problems")), list(makeKeyword("VALUE"), makeKeyword("SINGLE-LITERAL"), makeString("only single-literal problems")));

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");

    private static final SubLString $$$Intermediate_proof_validation = makeString("Intermediate proof validation");

    private static final SubLString $str152$How_carefully_to_check_the_interm = makeString("How carefully to check the intermediate proofs that are used in inference\nfor semantic well-formedness.");

    public static final SubLList $list153 = list(list(makeKeyword("VALUE"), makeKeyword("ALL"), makeString("full (most expensive)")), list(makeKeyword("VALUE"), makeKeyword("ARG-TYPE"), makeString("only arg-type")), list(makeKeyword("VALUE"), makeKeyword("MINIMAL"), makeString("only HL validations")), list(makeKeyword("VALUE"), makeKeyword("NONE"), makeString("none (least expensive)")));

    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");

    private static final SubLString $$$Space_cutoff = makeString("Space cutoff");

    private static final SubLString $str156$The_maximum_number_of_subproblems = makeString("The maximum number of subproblems the Worker can create before being forced to suspend.\nIf this limit is exceeded, it will try to prune dead-end and unnecessary problems before suspending.\nSetting this to a higher number (or unlimited) is dangerous; it allows a single inference to use more memory,\nwhich may result in a crash if the machine\'s memory capacity is exceeded.");

    public static final SubLList $list157 = list(list(makeKeyword("ENTRY"), makeSymbol("NON-NEGATIVE-INTEGER-P"), makeString("problems (at most)")), list(makeKeyword("VALUE"), makeKeyword("POSITIVE-INFINITY"), makeString("Unlimited number of problems")));

    private static final SubLSymbol $kw158$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLString $$$Allow_transformation_at_all = makeString("Allow transformation at all");

    private static final SubLString $str160$Even_stronger_than_setting_the_in = makeString("Even stronger than setting the inference resource constraints to allow transformation,\nthis precludes any followup inference from ever allowing transformation.");

    private static final SubLList $list161 = list(list(makeKeyword("VALUE"), T, makeString("Yes")), list(makeKeyword("VALUE"), NIL, makeString("No (faster)")));

    private static final SubLSymbol $kw162$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLString $str163$Add_restriction_layer_of_indirect = makeString("Add restriction layer of indirection");

    private static final SubLString $str164$When_solving_an_open_problem__the = makeString("When solving an open problem, the Worker can either add a removal link straight from the open problem\nto goal, or it can add the restricted form of that problem (which will be closed), and then add the\nremoval link from the restricted problem to goal.  This maximizes problem reuse but increases the\noverhead of the Worker.");

    private static final SubLSymbol $kw165$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLString $$$Enable_negation_by_failure = makeString("Enable negation by failure");

    private static final SubLString $str167$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the inability to prove a proposition to be an\nargument for that proposition not being true.");

    private static final SubLSymbol $kw168$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");

    private static final SubLString $str169$Enable_use_of_completeness_meta_k = makeString("Enable use of completeness meta-knowledge");

    public static final SubLString $str170$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the use of completeness meta-knowledge\nto provide arguments for negated propositions.");



    private static final SubLString $$$Inference_Direction = makeString("Inference Direction");

    private static final SubLString $str173$This_controls_whether_inferences_ = makeString("This controls whether inferences in this problem store are treated as backward inferences (the default) or forward inferences.");

    private static final SubLList $list174 = list(list(makeKeyword("VALUE"), makeKeyword("BACKWARD"), makeString("Backward")), list(makeKeyword("VALUE"), makeKeyword("FORWARD"), makeString("Forward")));

    private static final SubLSymbol $kw175$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");

    private static final SubLString $str176$Enable_evaluation_of_SubL_perform = makeString("Enable evaluation of SubL performatives");

    private static final SubLString $str177$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the SubL performatives (which may cause side effects) to be evaluated during inference.  #$performSubL and #$EvaluateSubLFn are the entry points into SubL from CycL");

    private static final SubLSymbol $kw178$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");

    private static final SubLString $$$Enable_sidechaining = makeString("Enable sidechaining");

    private static final SubLString $str180$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the use of sidechaining to rewrite problems into other problems.  Sidechaining is designed to be more focused than backchaining, will not increase the complexity of the current problem, and does not require a transformation step (i.e. a backchain).");

    private static final SubLSymbol $kw181$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");

    private static final SubLString $$$Enable_abduction = makeString("Enable abduction");

    private static final SubLString $str183$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow abductive solutions for problems in this problem store.");

    private static final SubLSymbol $kw184$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLString $$$Introduce_new_terms = makeString("Introduce new terms");

    private static final SubLString $str186$This_controls_whether_or_not_we_a = makeString("This controls whether or not we allow the introduction of new terms during inference.  If this is set to no, we assume that the set of reified and unrepresented terms comprises the entire universe of discourse.");

    private static final SubLSymbol $kw187$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    private static final SubLString $$$Compute_Answer_Justifications = makeString("Compute Answer Justifications");

    private static final SubLString $str189$This_controls_whether_or_not_we_c = makeString("This controls whether or not we compute and remember the justifications for answers during inference.  If this is set to no, we only compute and remember bindings for free variables.");



    private static final SubLSymbol $NON_EXPLANATORY_SENTENCE = makeKeyword("NON-EXPLANATORY-SENTENCE");

    private static final SubLSymbol $kw192$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    private static final SubLString $$$CB_QUERY = makeString("CB QUERY");

    private static final SubLString $$$CB_Query = makeString("CB Query");

    private static final SubLSymbol CB_QUERY_CONTINUE_THREAD = makeSymbol("CB-QUERY-CONTINUE-THREAD");

    private static final SubLString $$$CYC = makeString("CYC");

    private static final SubLSymbol SPECIAL_VARIABLE_STATE_P = makeSymbol("SPECIAL-VARIABLE-STATE-P");

    private static final SubLSymbol CONTINUE_INFERENCE = makeSymbol("CONTINUE-INFERENCE");

    public static final SubLSymbol $cb_inferences$ = makeSymbol("*CB-INFERENCES*");

    public static final SubLList $list200 = list(list(makeSymbol("INFERENCE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list202 = list(list(makeSymbol("CB-INFERENCES")));



    private static final SubLList $list204 = list(list(makeSymbol("FOCAL-INFERENCE"), makeSymbol("OTHER-INFERENCES")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $sym206$_OPTIONAL = makeSymbol("&OPTIONAL");

    private static final SubLSymbol $sym207$_REST = makeSymbol("&REST");

    private static final SubLList $list208 = list(makeSymbol("CB-INFERENCES"));

    private static final SubLList $list209 = list(makeSymbol("&OPTIONAL"), makeSymbol("FOCAL-INFERENCE"), makeSymbol("&REST"), makeSymbol("OTHER-INFERENCES"));

    private static final SubLSymbol VALID_INFERENCE_P = makeSymbol("VALID-INFERENCE-P");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLSymbol CB_QUERY = makeSymbol("CB-QUERY");





    private static final SubLString $str217$query_tool_gif = makeString("query-tool.gif");

    private static final SubLString $$$Query = makeString("Query");

    private static final SubLString $str219$cb_query = makeString("cb-query");

    private static final SubLSymbol CB_LINK_QUERY = makeSymbol("CB-LINK-QUERY");

    private static final SubLString $$$Ask_a_Query = makeString("Ask a Query");



    private static final SubLString $$$Query_Tool = makeString("Query Tool");















    private static final SubLString $str231$__DOCTYPE_html_PUBLIC_____W3C__DT = makeString("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">");

    private static final SubLString $str232$_meta_http_equiv__X_UA_Compatible = makeString("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=Edge\" >");





    private static final SubLString $str235$yui_skin_sam = makeString("yui-skin-sam");

    private static final SubLString $$$post = makeString("post");

    private static final SubLString $str237$cb_handle_query = makeString("cb-handle-query");

    private static final SubLString $str238$non_explanatory = makeString("non-explanatory");









    private static final SubLString $str243$cb_query_html = makeString("cb-query.html");

    private static final SubLString $str244$_Refresh_ = makeString("[Refresh]");

    private static final SubLString $str245$Go_to_section__ = makeString("Go to section :");

    private static final SubLString $str246$Shortcut_links_to_sections_that_a = makeString("Shortcut links to sections that appear further down on this page.");

    private static final SubLString $str247$focal_inference_section = makeString("focal-inference-section");

    private static final SubLString $str248$_Focal_Inference_ = makeString("[Focal Inference]");

    private static final SubLString $str249$The_inference_you_are_currently_e = makeString("The inference you are currently examining.  Usually the most recent query asked.");

    private static final SubLString $str250$new_inference_section = makeString("new-inference-section");

    private static final SubLString $str251$_New_Inference_ = makeString("[New Inference]");

    private static final SubLString $str252$Start_a_new_inference_ = makeString("Start a new inference.");

    private static final SubLString $str253$parameters_section = makeString("parameters-section");

    private static final SubLString $str254$_Inference_Parameters_ = makeString("[Inference Parameters]");

    private static final SubLString $str255$Adjust_the_inference_parameters_a = makeString("Adjust the inference parameters and resource constraints that will be used for starting a new inference or continuing the focal inference.");

    private static final SubLString $str256$proof_checker_section = makeString("proof-checker-section");

    private static final SubLString $str257$_Proof_Checker_Setup_ = makeString("[Proof Checker Setup]");

    private static final SubLString $str258$Specify_an_exact_set_of_rules__an = makeString("Specify an exact set of rules, and constrain the inference engine to only use those rules.");

    private static final SubLString $str259$other_inferences = makeString("other-inferences");

    private static final SubLString $$$Show = makeString("Show");

    private static final SubLString $$$Hide = makeString("Hide");

    private static final SubLString $$$Other_Inferences = makeString("Other Inferences");

    private static final SubLString $str263$Examine__continue__or_destroy_pas = makeString("Examine, continue, or destroy past inferences you have asked.");

    private static final SubLString $str264$__A_total_ = makeString("(~A total)");





    private static final SubLString $$$Actions = makeString("Actions");

    private static final SubLSymbol $DESTROY_ALL_OTHER_INFERENCES = makeKeyword("DESTROY-ALL-OTHER-INFERENCES");

    private static final SubLString $str269$_Destroy_All_ = makeString("[Destroy All]");



    private static final SubLString $str271$_Debug_ = makeString("[Debug]");



    private static final SubLString $str273$_Examine_ = makeString("[Examine]");



    private static final SubLString $str275$_Focus_ = makeString("[Focus]");



    private static final SubLString $str277$_Destroy_ = makeString("[Destroy]");

    private static final SubLString $$$Status = makeString("Status");

    private static final SubLString $$$Answers = makeString("Answers");

    private static final SubLString $str280$focal_problem_store = makeString("focal-problem-store");

    private static final SubLString $str281$focal_inference = makeString("focal-inference");

    private static final SubLString $$$Focal_Inference = makeString("Focal Inference");

    private static final SubLString $str283$Actions__ = makeString("Actions :");





    private static final SubLString $str286$_Reinforce_ = makeString("[Reinforce]");



    private static final SubLString $str288$_Defocus_ = makeString("[Defocus]");

    private static final SubLSymbol $TEMPLATE_OE_INFERENCE = makeKeyword("TEMPLATE-OE-INFERENCE");

    private static final SubLString $str290$_Template_OE_ = makeString("[Template OE]");

    private static final SubLSymbol $CB_OWL_EXPORT_INFERENCE_ANSWERS = makeKeyword("CB-OWL-EXPORT-INFERENCE-ANSWERS");

    private static final SubLString $str292$_OWL_Export_ = makeString("[OWL Export]");



    private static final SubLString $str294$_Save_As_Query_ = makeString("[Save As Query]");



    private static final SubLString $str296$_Save_As_Test_ = makeString("[Save As Test]");

    private static final SubLSymbol $INFERENCE_TO_SUBL_QUERY = makeKeyword("INFERENCE-TO-SUBL-QUERY");

    private static final SubLString $str298$_SubL_Query_ = makeString("[SubL Query]");



    private static final SubLString $str300$_Query_Graph_ = makeString("[Query Graph]");

    private static final SubLString $str301$Asking_query__ = makeString("Asking query: ");

    private static final SubLObject $const302$UnrunnableQuery_SubstitutionOfInd = reader_make_constant_shell(makeString("UnrunnableQuery-SubstitutionOfIndexicalsRequired"));



    private static final SubLString $str304$WARNING__This_query_is_not_intend = makeString("WARNING: This query is not intended to be run without the appropriate substitution of indexical terms.");

    private static final SubLString $str305$new_inference = makeString("new-inference");

    private static final SubLString $$$New_Inference = makeString("New Inference");



    private static final SubLString $$$Reset_All_Fields = makeString("Reset All Fields");

    private static final SubLString $$$Start_as_a_Followup_to_Focal = makeString("Start as a Followup to Focal");

    private static final SubLString $str310$Starts_a_new_inference_as_a_follo = makeString("Starts a new inference as a followup query to the focal inference.\nThis means that this inference will reuse the problem store used by the focal inference,\nso it will not have to reprove problems already proven by the focal inference.");

    private static final SubLString $str311$sharing_a_problem_store = makeString("sharing_a_problem_store");

    private static final SubLString $$$followup = makeString("followup");

    private static final SubLString $$$Start_as_New = makeString("Start as New");

    private static final SubLString $str314$Starts_a_new_inference_with_a_fre = makeString("Starts a new inference with a fresh problem store (the default).");

    private static final SubLString $$$new = makeString("new");

    private static final SubLString $$$Start_Inference = makeString("Start Inference");

    private static final SubLString $str317$query_spec = makeString("query-spec");

    private static final SubLString $str318$test_spec = makeString("test-spec");

    private static final SubLObject $const319$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric"));

    public static final SubLSymbol $default_new_inference_monad_mt$ = makeSymbol("*DEFAULT-NEW-INFERENCE-MONAD-MT*");

    private static final SubLObject $$MtSpace = reader_make_constant_shell(makeString("MtSpace"));

    private static final SubLList $list322 = list(list(reader_make_constant_shell(makeString("MtTimeDimFn")), reader_make_constant_shell(makeString("Now"))));

    public static final SubLSymbol $default_new_inference_mt$ = makeSymbol("*DEFAULT-NEW-INFERENCE-MT*");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLList $list325 = list(reader_make_constant_shell(makeString("UniversalVocabularyMt")), reader_make_constant_shell(makeString("BaseKB")), reader_make_constant_shell(makeString("CurrentWorldDataCollectorMt-NonHomocentric")), reader_make_constant_shell(makeString("InferencePSC")), reader_make_constant_shell(makeString("EverythingPSC")));

    private static final SubLString $str326$mt_section = makeString("mt-section");

    private static final SubLString $str327$cb_query_inference_mt = makeString("cb-query-inference-mt");

    private static final SubLString $$$Query_Context = makeString("Query Context");



    private static final SubLString $str330$sentence_section = makeString("sentence-section");

    private static final SubLInteger $int$80 = makeInteger(80);



    private static final SubLString $$$sentence = makeString("sentence");







    private static final SubLString $$$Complete = makeString("Complete");



    private static final SubLString $$$Cyclify = makeString("Cyclify");



    private static final SubLString $$$Clear_Sentence = makeString("Clear Sentence");



    private static final SubLString $str343$editor_ = makeString("editor_");

    private static final SubLString $$$CycEditor = makeString("CycEditor");

    private static final SubLList $list345 = cons(makeUninternedSymbol("ATTRIBUTE"), makeUninternedSymbol("VALUE"));

    private static final SubLList $list346 = cons(makeString(" name="), makeString("sentence"));

    private static final SubLString $str347$_cols_ = makeString(" cols=");

    private static final SubLString $str348$_rows_ = makeString(" rows=");

    private static final SubLString $$$Pragmatics = makeString("Pragmatics");

    private static final SubLString $str350$An_optional_sentence_that_will_fu = makeString("An optional sentence that will further constrain the query for pragmatic reasons.  Justifications for answers will not include this sentence.");

    private static final SubLString $str351$non_exp_sentence = makeString("non_exp_sentence");

    public static final SubLSymbol $cb_default_query_parameters$ = makeSymbol("*CB-DEFAULT-QUERY-PARAMETERS*");

    private static final SubLString $str353$inference_parameters = makeString("inference-parameters");

    private static final SubLString $$$Inference_Parameters = makeString("Inference Parameters");

    private static final SubLString $str355$The_inference_parameters_and_reso = makeString("The inference parameters and resource constraints that will be used when starting a new inference or continuing the focal inference.");

    private static final SubLString $$$Continue_the_Focal_Inference = makeString("Continue the Focal Inference");

    private static final SubLString $str357$Continues_running_the_focal_infer = makeString("Continues running the focal inference for a while longer, with more resources if the inference parameters have changed since the last time it was run.");

    private static final SubLString $$$continue = makeString("continue");

    private static final SubLString $$$Save_Parameters = makeString("Save Parameters");

    private static final SubLString $str360$Saves_the_current_inference_param = makeString("Saves the current inference parameters as default for the user");

    private static final SubLString $str361$save_parameters = makeString("save-parameters");

    private static final SubLString $$$Load_Parameters = makeString("Load Parameters");

    private static final SubLString $str363$Loads_user_saved_default_inferenc = makeString("Loads user saved default inference parameters");

    private static final SubLString $str364$load_parameters = makeString("load-parameters");

    private static final SubLString $$$Reset_Parameters = makeString("Reset Parameters");

    private static final SubLString $str366$Resets_all_the_inference_paramete = makeString("Resets all the inference parameters to tool default.  If focal inference is available then inference parameters are set to that of focal inference.");

    private static final SubLString $str367$reset_parameters = makeString("reset-parameters");

    private static final SubLString $$$Strengthen_Parameters = makeString("Strengthen Parameters");

    private static final SubLString $str369$Sets_the_inference_parameters_to_ = makeString("Sets the inference parameters to the strongest values that should still admit all the current answers of the focal inference.");

    private static final SubLString $str370$strengthen_parameters = makeString("strengthen-parameters");

    private static final SubLList $list371 = list(list(makeKeyword("MAX-NUMBER"), NIL, list(makeKeyword("TEXT"), THREE_INTEGER)), list(makeKeyword("MAX-TIME"), makeInteger(30), list(makeKeyword("TEXT"), FOUR_INTEGER)), list(makeKeyword("MAX-STEP"), NIL, list(makeKeyword("TEXT"), FOUR_INTEGER)), list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW")));

    private static final SubLString $$$Inference_Resource_Constraints = makeString("Inference Resource Constraints");

    private static final SubLString $str373$Properties_that_can_change_while_ = makeString("Properties that can change while an inference is suspended, and be respected when that same inference is continued.");

    private static final SubLString $str374$advanced_parameters = makeString("advanced-parameters");

    private static final SubLString $$$Inference_Debugging_Parameters = makeString("Inference Debugging Parameters");

    private static final SubLString $str376$The_advanced_inference_parameters = makeString("The advanced inference parameters that can be manipulated for debugging inference.  These are used when starting a new inference or continuing the focal inference.");

    private static final SubLList $list377 = list(new SubLObject[]{ makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("MIN-RULE-UTILITY") });

    private static final SubLSymbol CB_INFERENCE_MODE_PROPERTY_DATUM_P = makeSymbol("CB-INFERENCE-MODE-PROPERTY-DATUM-P");



    private static final SubLString $$$Inference_Engine_Mode_Properties = makeString("Inference Engine Mode Properties");

    private static final SubLString $str381$Properties_determined_by_the_choi = makeString("Properties determined by the choice of inference engine mode, unless Debug is chosen.");

    private static final SubLList $list382 = list(new SubLObject[]{ list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, list(makeKeyword("TEXT"), TWO_INTEGER)), list(makeKeyword("MIN-RULE-UTILITY"), makeInteger(-20), list(makeKeyword("TEXT"), THREE_INTEGER)), list(makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeInteger(100), list(makeKeyword("TEXT"), THREE_INTEGER)), list(makeKeyword("FORWARD-MAX-TIME"), ZERO_INTEGER, list(makeKeyword("TEXT"), FOUR_INTEGER)), list(makeKeyword("BLOCK?"), NIL), list(makeKeyword("MAX-PROOF-DEPTH"), NIL, list(makeKeyword("TEXT"), TWO_INTEGER)), list(makeKeyword("CACHE-INFERENCE-RESULTS?"), NIL), list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL")), list(makeKeyword("CONTINUABLE?"), T), list(makeKeyword("METRICS"), NIL) });

    private static final SubLString $$$Inference_Dynamic_Properties = makeString("Inference Dynamic Properties");

    private static final SubLList $list384 = list(new SubLObject[]{ list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL), list(makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), T), list(makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS")), list(makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), makeKeyword("COMPUTE-INTERSECTION")), list(makeKeyword("ALLOWED-MODULES"), makeKeyword("ALL"), list(makeKeyword("TEXT"), TWENTY_INTEGER)), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE")) });

    private static final SubLString $$$Inference_Static_Properties = makeString("Inference Static Properties");

    private static final SubLString $str386$Properties_that_can_vary_between_ = makeString("Properties that can vary between different inferences (which may be sharing the same problem store),\nbut which must remain consistent throughout the life of a given inference.");

    private static final SubLList $list387 = list(list(makeKeyword("TEXT"), SEVEN_INTEGER));

    private static final SubLList $list388 = list(new SubLObject[]{ list(makeKeyword("NEGATION-BY-FAILURE?"), NIL), list(makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), T), list(makeKeyword("DIRECTION"), makeKeyword("BACKWARD")), list(makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("CZER-EQUAL")), list(makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("ALL")), list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE")), list(makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), list(makeKeyword("TEXT"), SIX_INTEGER)), list(makeKeyword("TRANSFORMATION-ALLOWED?"), T), list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T), list(makeKeyword("EVALUATE-SUBL-ALLOWED?"), T), list(makeKeyword("REWRITE-ALLOWED?"), NIL), list(makeKeyword("ABDUCTION-ALLOWED?"), NIL), list(makeKeyword("NEW-TERMS-ALLOWED?"), T), list(makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), T) });

    private static final SubLString $$$Problem_Store_Static_Properties = makeString("Problem Store Static Properties");

    private static final SubLString $str390$Properties_of_a_problem_store_tha = makeString("Properties of a problem store that cannot change.  These properties affect all inferences using that problem store.");

    private static final SubLList $list391 = list(list(makeSymbol("PROPERTY"), makeSymbol("CB-DEFAULT"), makeSymbol("&OPTIONAL"), makeSymbol("ENTRY-SPEC")), makeSymbol("&REST"), makeSymbol("REMAINING-CB-PROPERTIES"));

    private static final SubLList $list392 = list(makeSymbol("PROPERTY"), makeSymbol("CB-DEFAULT"), makeSymbol("&OPTIONAL"), makeSymbol("ENTRY-SPEC"));

    private static final SubLSymbol $NO_MODE_VALUE_SPECIFIED = makeKeyword("NO-MODE-VALUE-SPECIFIED");



    private static final SubLString $str395$_ = makeString("*");

    private static final SubLString $str396$This_parameter_has_been_modified_ = makeString("This parameter has been modified.");

    private static final SubLList $list397 = list(makeKeyword("TEXT"), NIL);

    private static final SubLList $list398 = list(makeSymbol("TYPE"), makeSymbol("SIZE"));



    private static final SubLString $str400$onClick__ = makeString("onClick=\"");

    private static final SubLString $str401$_ = makeString("\"");

    private static final SubLString $str402$set_all_radio_buttons_document_fo = makeString("set_all_radio_buttons(document.forms[0], '~a', ~a);");

    private static final SubLString $str403$with__this_form_elements___A____v = makeString("with (this.form.elements['~A']){value = '~A';};");

    private static final SubLList $list404 = cons(makeSymbol("RADIO-FIELD-NAME"), makeSymbol("VALUE"));

    private static final SubLList $list405 = list(makeSymbol("RADIO-VALUE"), makeSymbol("ENTRY-FIELD-NAME"), makeSymbol("ENTRY-VALUE"));

    private static final SubLString $str406$No_setting_for__s_matched_the_val = makeString("No setting for ~s matched the value ~s");



    private static final SubLString $str408$Unexpected_inference_parameter_se = makeString("Unexpected inference parameter setting type ~s");

    private static final SubLString $str409$_ = makeString("|");

    private static final SubLString $str410$_ = makeString(".");

    private static final SubLString $str411$_ = makeString("?");

    private static final SubLString $str412$onClick__with__this_form_elements = makeString("onClick=\"with (this.form.elements[\'~A\']){focus();}; set_all_radio_buttons(document.forms[0], \'~a\', ~a); \"");









    private static final SubLString $str417$proof_checker = makeString("proof-checker");

    private static final SubLString $$$Proof_Checker_Setup = makeString("Proof Checker Setup");

    private static final SubLString $str419$Specify_an_exact_set_of_rules_all = makeString("Specify an exact set of rules allowed to be used in inference.");



    private static final SubLString $str421$_FFDFDF = makeString("#FFDFDF");

    private static final SubLString $$$Forbidden = makeString("Forbidden");

    private static final SubLString $str423$Forbid_the_use_of_this_rule_in_in = makeString("Forbid the use of this rule in inference");

    private static final SubLString $str424$_Forbid_All_ = makeString("[Forbid All]");

    private static final SubLString $str425$this_document_forms_0_ = makeString("this.document.forms[0]");

    private static final SubLString $str426$_rule___ = makeString("^rule_.*");

    private static final SubLString $$$forbidden = makeString("forbidden");

    private static final SubLString $str428$_FFFFDF = makeString("#FFFFDF");

    private static final SubLString $$$Unused = makeString("Unused");

    private static final SubLString $str430$Neither_forbid_nor_allow__treat_l = makeString("Neither forbid nor allow; treat like any other rule in the KB.");

    private static final SubLString $str431$_Unuse_All_ = makeString("[Unuse All]");

    private static final SubLString $$$unused = makeString("unused");

    private static final SubLSymbol $QUERY_PROOF_CHECKER_DROP_ALL = makeKeyword("QUERY-PROOF-CHECKER-DROP-ALL");

    private static final SubLString $str434$_Drop_All_ = makeString("[Drop All]");

    private static final SubLString $str435$_DFFFDF = makeString("#DFFFDF");

    private static final SubLString $$$Allowed = makeString("Allowed");

    private static final SubLString $str437$Allow_the_use_of_this_rule_in_inf = makeString("Allow the use of this rule in inference, but forbid the use of all \n                  other rules except those which are explicitly allowed.");

    private static final SubLString $str438$_Allow_All_ = makeString("[Allow All]");

    private static final SubLString $$$allowed = makeString("allowed");

    private static final SubLString $str440$_FFFFFF = makeString("#FFFFFF");

    private static final SubLString $$$Proof_Checker_Rules = makeString("Proof Checker Rules");





    private static final SubLSymbol $QUERY_PROOF_CHECKER_DROP = makeKeyword("QUERY-PROOF-CHECKER-DROP");

    private static final SubLString $str445$_Drop_ = makeString("[Drop]");



    private static final SubLString $str447$rule_ = makeString("rule_");

    private static final SubLString $str448$Properties_which_must_remain_cons = makeString("Properties which must remain consistent throughout the life of a given problem store.");

    private static final SubLString $$$Other_Problem_Store_Properties = makeString("Other Problem Store Properties");

    private static final SubLString $str450$Destruction_Imminent__ = makeString("Destruction Imminent? ");

    private static final SubLString $str451$Memoization_state___ = makeString("Memoization state : ");

    private static final SubLSymbol $PROBLEM_STORE_MEMOIZATION_STATE = makeKeyword("PROBLEM-STORE-MEMOIZATION-STATE");

    private static final SubLString $str453$Janitor___ = makeString("Janitor : ");

    private static final SubLSymbol $PROBLEM_STORE_JANITOR = makeKeyword("PROBLEM-STORE-JANITOR");





    private static final SubLString $str457$_a_does_not_specify_an_assertion = makeString("~a does not specify an assertion");

    private static final SubLString $str458$Assertion_specified_was_not_a_rul = makeString("Assertion specified was not a rule");

    private static final SubLSymbol CB_QUERY_PROOF_CHECKER_DROP = makeSymbol("CB-QUERY-PROOF-CHECKER-DROP");





    private static final SubLString $str462$No_longer_consider_this_rule_as_b = makeString("No longer consider this rule as being either forbidden or allowed.");

    private static final SubLString $str463$cb_query_proof_checker_drop__A = makeString("cb-query-proof-checker-drop&~A");

    private static final SubLSymbol CB_LINK_QUERY_PROOF_CHECKER_DROP = makeSymbol("CB-LINK-QUERY-PROOF-CHECKER-DROP");

    private static final SubLSymbol CB_QUERY_PROOF_CHECKER_DROP_ALL = makeSymbol("CB-QUERY-PROOF-CHECKER-DROP-ALL");

    private static final SubLString $str466$No_longer_consider_any_of_these_r = makeString("No longer consider any of these rules as being either forbidden or allowed.");

    private static final SubLString $str467$cb_query_proof_checker_drop_all = makeString("cb-query-proof-checker-drop-all");

    private static final SubLSymbol CB_LINK_QUERY_PROOF_CHECKER_DROP_ALL = makeSymbol("CB-LINK-QUERY-PROOF-CHECKER-DROP-ALL");















    private static final SubLString $str476$Unknown_inference_method__how_did = makeString("Unknown inference method (how did this happen?)");

    private static final SubLString $str477$_A = makeString("~A");

    private static final SubLString $str478$That_inference_is_no_longer_conti = makeString("That inference is no longer continuable.");

    private static final SubLList $list479 = list(makeKeyword("PROPERTIES"), NIL);

    private static final SubLList $list480 = list(makeKeyword("INPUT-NAME"), makeString("sentence"));

    private static final SubLList $list481 = list(makeKeyword("LOCATION"), makeString("New Inference"));

    private static final SubLList $list482 = list(makeKeyword("INPUT-NAME"), makeString("non_exp_sentence"), makeKeyword("REQUIRED?"), NIL);

    private static final SubLList $list483 = list(makeKeyword("LOCATION"), makeString("Pragmatics"));

    private static final SubLSymbol CB_HANDLE_QUERY = makeSymbol("CB-HANDLE-QUERY");

    private static final SubLSymbol $sym485$_TRUTH = makeSymbol("?TRUTH");

    private static final SubLObject $$sentenceTruth = reader_make_constant_shell(makeString("sentenceTruth"));



    private static final SubLString $str488$_is_not_an_inference_parameter_ = makeString(" is not an inference parameter.");

    private static final SubLList $list489 = list(makeSymbol("METHOD"), makeSymbol("DATUM"), makeSymbol("&OPTIONAL"), makeSymbol("EXPLANATION"));

    private static final SubLString $str490$No_value_was_entered_for__ = makeString("No value was entered for '");

    private static final SubLString $str491$__ = makeString("'.");

    private static final SubLString $str492$The_value_entered_for__ = makeString("The value entered for '");

    private static final SubLString $str493$__was_not_valid_ = makeString("' was not valid.");

    private static final SubLString $str494$No_choice_was_made_for__ = makeString("No choice was made for '");

    private static final SubLString $str495$The_ID__ = makeString("The ID, ");

    private static final SubLString $str496$__does_not_denote_a_CycLQuerySpec = makeString(", does not denote a CycLQuerySpecification.");

    private static final SubLString $str497$The_query_spec_ID__ = makeString("The query spec ID, ");

    private static final SubLString $str498$__does_not_denote_a_FORT_ = makeString(", does not denote a FORT.");

    private static final SubLString $str499$__does_not_denote_a_KBContentTest = makeString(", does not denote a KBContentTest-FullySpecified.");

    private static final SubLString $str500$The_test_spec_ID__ = makeString("The test spec ID, ");



    private static final SubLString $$$Socratic_Query = makeString("Socratic Query");

    private static final SubLString $$$Similar_Query = makeString("Similar Query");

    private static final SubLString $str504$_Query_Similar_ = makeString("[Query Similar]");

    private static final SubLString $str505$cb_assertion_similar_query__A = makeString("cb-assertion-similar-query&~A");

    private static final SubLSymbol $ASSERTION_SIMILAR_QUERY = makeKeyword("ASSERTION-SIMILAR-QUERY");

    private static final SubLSymbol CB_LINK_ASSERTION_SIMILAR_QUERY = makeSymbol("CB-LINK-ASSERTION-SIMILAR-QUERY");

    private static final SubLString $str508$The_assertion_is_not_available_ = makeString("The assertion is not available.");

    private static final SubLSymbol CB_ASSERTION_SIMILAR_QUERY = makeSymbol("CB-ASSERTION-SIMILAR-QUERY");







    private static final SubLString $$$Antecedent_Query = makeString("Antecedent Query");

    private static final SubLString $str514$_Antecedent_Query_ = makeString("[Antecedent Query]");

    private static final SubLString $str515$cb_assertion_antecedent_query__A = makeString("cb-assertion-antecedent-query&~A");



    private static final SubLSymbol CB_LINK_ANTECEDENT_QUERY = makeSymbol("CB-LINK-ANTECEDENT-QUERY");

    private static final SubLSymbol CB_ASSERTION_ANTECEDENT_QUERY = makeSymbol("CB-ASSERTION-ANTECEDENT-QUERY");

    private static final SubLString $$$Known_Extent_Query = makeString("Known Extent Query");

    private static final SubLString $str520$_Known_Extent_Query_ = makeString("[Known Extent Query]");

    private static final SubLSymbol $sym521$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLString $str522$cb_rule_known_extent_query__A = makeString("cb-rule-known-extent-query&~A");

    private static final SubLSymbol $RULE_KNOWN_EXTENT_QUERY = makeKeyword("RULE-KNOWN-EXTENT-QUERY");

    private static final SubLSymbol CB_LINK_RULE_KNOWN_EXTENT_QUERY = makeSymbol("CB-LINK-RULE-KNOWN-EXTENT-QUERY");

    private static final SubLString $str525$The_rule_is_not_available_ = makeString("The rule is not available.");

    private static final SubLSymbol CB_RULE_KNOWN_EXTENT_QUERY = makeSymbol("CB-RULE-KNOWN-EXTENT-QUERY");

    private static final SubLString $$$Unknown_Extent_Query = makeString("Unknown Extent Query");

    private static final SubLString $str528$_Unknown_Extent_Query_ = makeString("[Unknown Extent Query]");

    private static final SubLString $str529$cb_rule_unknown_extent_query__A = makeString("cb-rule-unknown-extent-query&~A");

    private static final SubLSymbol $RULE_UNKNOWN_EXTENT_QUERY = makeKeyword("RULE-UNKNOWN-EXTENT-QUERY");

    private static final SubLSymbol CB_LINK_RULE_UNKNOWN_EXTENT_QUERY = makeSymbol("CB-LINK-RULE-UNKNOWN-EXTENT-QUERY");

    private static final SubLSymbol CB_RULE_UNKNOWN_EXTENT_QUERY = makeSymbol("CB-RULE-UNKNOWN-EXTENT-QUERY");

    private static final SubLString $$$KB_Query = makeString("KB Query");

    private static final SubLString $$$Parameter_Strengthened_Query = makeString("Parameter Strengthened Query");

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLList $list536 = list(makeSymbol("FORT-SPEC"), makeSymbol("ARG-STRING"), makeSymbol("PRED-SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT-SPEC"));

    private static final SubLString $str537$Could_not_determine_a_term_from__ = makeString("Could not determine a term from ~a");

    private static final SubLString $str538$Could_not_determine_an_arg_from__ = makeString("Could not determine an arg from ~a");

    private static final SubLSymbol CB_LITERAL_QUERY = makeSymbol("CB-LITERAL-QUERY");

    private static final SubLSymbol CB_LQ = makeSymbol("CB-LQ");

    private static final SubLList $list541 = list(makeSymbol("?ARG0"), makeSymbol("?ARG1"), makeSymbol("?ARG2"), makeSymbol("?ARG3"), makeSymbol("?ARG4"), makeSymbol("?ARG5"));

    private static final SubLSymbol $CB_LITERAL_QUERY = makeKeyword("CB-LITERAL-QUERY");

    private static final SubLString $str543$cb_literal_query_html = makeString("cb-literal-query.html");

    private static final SubLString $$$Literal_Query = makeString("Literal Query");

    private static final SubLSymbol $SAM_AUTOCOMPLETE_CSS = makeKeyword("SAM-AUTOCOMPLETE-CSS");



    private static final SubLString $$$reloadFrameButton = makeString("reloadFrameButton");

    private static final SubLString $$$button = makeString("button");

    private static final SubLString $$$reload = makeString("reload");

    private static final SubLString $$$Refresh_Frames = makeString("Refresh Frames");

    private static final SubLSymbol $SENTENCE_QUERY_SIMILAR = makeKeyword("SENTENCE-QUERY-SIMILAR");

    private static final SubLString $str552$_Query_Tool_ = makeString("[Query Tool]");

    private static final SubLString $$$Last_query = makeString("Last query");





    private static final SubLString $str556$Query_halted_because___ = makeString("Query halted because : ");

    private static final SubLString $$$No_answers_were_proven = makeString("No answers were proven");

    private static final SubLString $$$One_answer = makeString("One answer");

    private static final SubLString $str559$_S_answers = makeString("~S answers");

    private static final SubLString $str560$_for__S__ = makeString(" for ~S :");

    private static final SubLString $str561$Substituted_Results__ = makeString("Substituted Results :");

    private static final SubLString $str562$Could_not_determine_the_arity_of_ = makeString("Could not determine the arity of ~A in ~A");









    private static final SubLFloat $float$1_0 = makeDouble(1.0);



    private static final SubLSymbol $sym569$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE>");

    private static final SubLString $str570$Simulated_query_over_all_mts__ = makeString("Simulated query over all mts :");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list572 = list(makeSymbol("?ARG2"));

    private static final SubLString $$$Answers_in_ = makeString("Answers in ");

    private static final SubLString $str574$_ = makeString(":");

    private static final SubLString $str575$__inherits_from = makeString(" (inherits from");

    public static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str577$_ = makeString(")");

    private static final SubLString $str578$__ = makeString("( ");

    private static final SubLSymbol $sym579$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");



    private static final SubLList $list581 = list(ONE_INTEGER, TWO_INTEGER);













    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $$$Current_query = makeString("Current query");

    private static final SubLString $$$_in_ = makeString(" in ");

    private static final SubLString $str591$__ = makeString(" :");

    private static final SubLInteger $int$800 = makeInteger(800);

    private static final SubLString $str593$cb_inference_progress_page__A__A = makeString("cb-inference-progress-page&~A&~A");

    private static final SubLString $str594$inference_progress = makeString("inference_progress");

    private static final SubLString $str595$100_ = makeString("100%");





    private static final SubLString $str598$Inference__A_in_problem_store__A_ = makeString("Inference ~A in problem store ~A is no longer available.");

    private static final SubLString $str599$Inference__A__A_Progress = makeString("Inference ~A.~A Progress");



    private static final SubLSymbol CB_INFERENCE_PROGRESS_PAGE = makeSymbol("CB-INFERENCE-PROGRESS-PAGE");

    private static final SubLString $str602$_Refresh_Page_ = makeString("[Refresh Page]");

    private static final SubLString $str603$Status__ = makeString("Status :");

    private static final SubLString $str604$_Halt_Auto_Refresh_ = makeString("[Halt Auto Refresh]");

    private static final SubLSymbol $AUTO_REFRESH_QUERY = makeKeyword("AUTO-REFRESH-QUERY");

    private static final SubLString $str606$_Auto_Refresh_ = makeString("[Auto Refresh]");



    private static final SubLString $str608$_Interrupt_ = makeString("[Interrupt]");



    private static final SubLString $str610$_Abort_ = makeString("[Abort]");

    private static final SubLString $str611$Max_time_remaining__ = makeString("Max time remaining: ");

    private static final SubLString $str612$Time_over_budget__ = makeString("Time over budget: ");

    private static final SubLString $str613$inference_answers = makeString("inference-answers");

    private static final SubLString $str614$_ = makeString("(");

    private static final SubLSymbol $ALL_INFERENCE_ANSWERS = makeKeyword("ALL-INFERENCE-ANSWERS");

    private static final SubLString $str616$_All_Answers_ = makeString("[All Answers]");

    private static final SubLSymbol $SAVE_INFERENCE_ANSWERS = makeKeyword("SAVE-INFERENCE-ANSWERS");

    private static final SubLSymbol $GRAPH_INFERENCE_ANSWERS = makeKeyword("GRAPH-INFERENCE-ANSWERS");

    private static final SubLSymbol $SAVE_INFERENCE_ANSWERS_AS_QUERIES = makeKeyword("SAVE-INFERENCE-ANSWERS-AS-QUERIES");

    private static final SubLString $str620$_Save_Answers_as_Queries_ = makeString("[Save Answers as Queries]");

    private static final SubLSymbol $INFERENCE_ANSWER_TIMELINE = makeKeyword("INFERENCE-ANSWER-TIMELINE");

    private static final SubLString $str622$_Timeline_ = makeString("[Timeline]");

    private static final SubLSymbol CB_AUTO_REFRESH_QUERY = makeSymbol("CB-AUTO-REFRESH-QUERY");

    private static final SubLString $str624$Starts_up_an_auto_refresh_loop_th = makeString("Starts up an auto-refresh loop that will automatically refresh\nthis page every few seconds, showing new inference answers (if any).");

    private static final SubLString $str625$cb_auto_refresh_query__A__A = makeString("cb-auto-refresh-query&~A&~A");

    private static final SubLSymbol CB_LINK_AUTO_REFRESH_QUERY = makeSymbol("CB-LINK-AUTO-REFRESH-QUERY");

    private static final SubLString $str627$_More_____ = makeString("[More ...]");

    private static final SubLString $str628$cb_all_inference_answers__A__A = makeString("cb-all-inference-answers&~A&~A");

    private static final SubLSymbol CB_LINK_ALL_INFERENCE_ANSWERS = makeSymbol("CB-LINK-ALL-INFERENCE-ANSWERS");

    private static final SubLString $str630$Inference__A__A = makeString("Inference ~A.~A");

    private static final SubLSymbol CB_ALL_INFERENCE_ANSWERS = makeSymbol("CB-ALL-INFERENCE-ANSWERS");

    private static final SubLString $$$Inference_Answers = makeString("Inference Answers");

    private static final SubLString $str633$_Examine_Inference_ = makeString("[Examine Inference]");

    private static final SubLSymbol CB_FOCUS_INFERENCE = makeSymbol("CB-FOCUS-INFERENCE");

    private static final SubLString $str635$Make_this_inference_the_focal_inf = makeString("Make this inference the focal inference,\nso that it can be examined in more detail.");

    private static final SubLString $str636$cb_focus_inference__A__A = makeString("cb-focus-inference&~A&~A");

    private static final SubLSymbol CB_LINK_FOCUS_INFERENCE = makeSymbol("CB-LINK-FOCUS-INFERENCE");

    private static final SubLSymbol CB_DEFOCUS_INFERENCE = makeSymbol("CB-DEFOCUS-INFERENCE");

    private static final SubLString $str639$Make_this_inference_no_longer_the = makeString("Make this inference no longer the focal inference,\nand demote it into the \'Other Inferences\' section.");

    private static final SubLString $str640$cb_defocus_inference__A__A = makeString("cb-defocus-inference&~A&~A");

    private static final SubLSymbol CB_LINK_DEFOCUS_INFERENCE = makeSymbol("CB-LINK-DEFOCUS-INFERENCE");

    private static final SubLSymbol CB_INTERRUPT_INFERENCE = makeSymbol("CB-INTERRUPT-INFERENCE");

    private static final SubLString $str643$cb_interrupt_inference__A__A = makeString("cb-interrupt-inference&~A&~A");

    private static final SubLSymbol CB_LINK_INTERRUPT_INFERENCE = makeSymbol("CB-LINK-INTERRUPT-INFERENCE");

    private static final SubLSymbol CB_ABORT_INFERENCE = makeSymbol("CB-ABORT-INFERENCE");

    private static final SubLString $str646$cb_abort_inference__A__A = makeString("cb-abort-inference&~A&~A");

    private static final SubLSymbol CB_LINK_ABORT_INFERENCE = makeSymbol("CB-LINK-ABORT-INFERENCE");

    private static final SubLSymbol CB_FORGET_INFERENCE = makeSymbol("CB-FORGET-INFERENCE");

    private static final SubLString $str649$_Forget_ = makeString("[Forget]");

    private static final SubLString $str650$cb_forget_inference__A__A = makeString("cb-forget-inference&~A&~A");



    private static final SubLSymbol CB_LINK_FORGET_INFERENCE = makeSymbol("CB-LINK-FORGET-INFERENCE");

    private static final SubLSymbol CB_FORGET_ALL_INFERENCES = makeSymbol("CB-FORGET-ALL-INFERENCES");

    private static final SubLString $str654$_Forget_All_ = makeString("[Forget All]");

    private static final SubLString $str655$cb_forget_all_inferences = makeString("cb-forget-all-inferences");

    private static final SubLSymbol $FORGET_ALL_INFERENCES = makeKeyword("FORGET-ALL-INFERENCES");

    private static final SubLSymbol CB_LINK_FORGET_ALL_INFERENCES = makeSymbol("CB-LINK-FORGET-ALL-INFERENCES");

    private static final SubLSymbol CB_FORGET_ALL_OTHER_INFERENCES = makeSymbol("CB-FORGET-ALL-OTHER-INFERENCES");

    private static final SubLString $str659$cb_forget_all_other_inferences = makeString("cb-forget-all-other-inferences");

    private static final SubLSymbol $FORGET_ALL_OTHER_INFERENCES = makeKeyword("FORGET-ALL-OTHER-INFERENCES");

    private static final SubLSymbol CB_LINK_FORGET_ALL_OTHER_INFERENCES = makeSymbol("CB-LINK-FORGET-ALL-OTHER-INFERENCES");

    private static final SubLString $str662$Inference_heuristics_are_being_re = makeString("Inference heuristics are being reinforced.");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLSymbol CB_REINFORCE_INFERENCE = makeSymbol("CB-REINFORCE-INFERENCE");

    private static final SubLString $str665$Reinforce_the_inference_heuristic = makeString("Reinforce the inference heuristics based on this inference,\nso as to help answer similar inferences in the future.");

    private static final SubLString $str666$cb_reinforce_inference__A__A = makeString("cb-reinforce-inference&~A&~A");

    private static final SubLSymbol CB_LINK_REINFORCE_INFERENCE = makeSymbol("CB-LINK-REINFORCE-INFERENCE");

    private static final SubLSymbol CB_DESTROY_INFERENCE = makeSymbol("CB-DESTROY-INFERENCE");

    private static final SubLString $str669$Destroy_this_inference__reclaimin = makeString("Destroy this inference, reclaiming the memory used to store it.\nOnce an inference is destroyed, it can no longer be examined or continued.");

    private static final SubLString $str670$cb_destroy_inference__A__A = makeString("cb-destroy-inference&~A&~A");

    private static final SubLSymbol CB_LINK_DESTROY_INFERENCE = makeSymbol("CB-LINK-DESTROY-INFERENCE");

    private static final SubLSymbol CB_DESTROY_ALL_INFERENCES = makeSymbol("CB-DESTROY-ALL-INFERENCES");

    private static final SubLString $str673$Destroy_all_inferences__including = makeString("Destroy all inferences (including the focal inference),\nreclaiming the memory used to store them.");

    private static final SubLString $str674$cb_destroy_all_inferences = makeString("cb-destroy-all-inferences");

    private static final SubLSymbol $DESTROY_ALL_INFERENCES = makeKeyword("DESTROY-ALL-INFERENCES");

    private static final SubLSymbol CB_LINK_DESTROY_ALL_INFERENCES = makeSymbol("CB-LINK-DESTROY-ALL-INFERENCES");

    private static final SubLList $list677 = list(makeSymbol("&OPTIONAL"), makeSymbol("FOCAL-INFERENCES"), makeSymbol("&REST"), makeSymbol("OTHER-INFERENCES"));

    private static final SubLSymbol CB_DESTROY_ALL_OTHER_INFERENCES = makeSymbol("CB-DESTROY-ALL-OTHER-INFERENCES");

    private static final SubLString $str679$Destroy_all_inferences_other_than = makeString("Destroy all inferences other than the focal inference,\nreclaiming the memory used to store them.");

    private static final SubLString $str680$cb_destroy_all_other_inferences = makeString("cb-destroy-all-other-inferences");

    private static final SubLSymbol CB_LINK_DESTROY_ALL_OTHER_INFERENCES = makeSymbol("CB-LINK-DESTROY-ALL-OTHER-INFERENCES");

    private static final SubLString $str682$Convert_this_inference_to_an_equi = makeString("Convert this inference to an equivalent SubL query (using new-cyc-query). Leads to SubL Interactor.");

    private static final SubLString $str683$cb_inference_to_subl_query__A__A = makeString("cb-inference-to-subl-query&~A&~A");

    private static final SubLSymbol CB_LINK_INFERENCE_TO_SUBL_QUERY = makeSymbol("CB-LINK-INFERENCE-TO-SUBL-QUERY");

    private static final SubLString $str685$input_string = makeString("input-string");

    private static final SubLSymbol CB_INFERENCE_TO_SUBL_QUERY = makeSymbol("CB-INFERENCE-TO-SUBL-QUERY");

    private static final SubLString $str687$_Graph_Answers_ = makeString("[Graph Answers]");

    private static final SubLString $str688$cb_graph_inference_answers__A__A = makeString("cb-graph-inference-answers&~A&~A");

    private static final SubLString $str689$window_open__ = makeString("window.open('");

    private static final SubLString $str690$__ = makeString("',");

    private static final SubLString $str691$__A_ = makeString("'~A'");

    private static final SubLString $$$null = makeString("null");

    private static final SubLString $str693$___A____ = makeString(",'~A'); ");

    private static final SubLString $str694$return_false_ = makeString("return false;");

    private static final SubLSymbol CB_LINK_GRAPH_INFERENCE_ANSWERS = makeSymbol("CB-LINK-GRAPH-INFERENCE-ANSWERS");

    private static final SubLSymbol CB_GRAPH_INFERENCE_ANSWERS = makeSymbol("CB-GRAPH-INFERENCE-ANSWERS");



    private static final SubLSymbol $INFERENCE_STORE_ID = makeKeyword("INFERENCE-STORE-ID");



    private static final SubLString $str700$cb_graph_inference_answers_window = makeString("cb-graph-inference-answers-window");

    private static final SubLSymbol CB_GRAPH_INFERENCE_ANSWERS_WINDOW = makeSymbol("CB-GRAPH-INFERENCE-ANSWERS-WINDOW");

    private static final SubLSymbol $BBF_INFERENCE_ANSWERS = makeKeyword("BBF-INFERENCE-ANSWERS");





    private static final SubLString $str705$store_id = makeString("store-id");

    private static final SubLString $str706$inference_id = makeString("inference-id");

    private static final SubLString $str707$_ans_format = makeString(":ans-format");

    private static final SubLString $str708$_destination = makeString(":destination");

    private static final SubLString $str709$_filename = makeString(":filename");

    private static final SubLString $str710$cycl_prefix = makeString("cycl-prefix");



    private static final SubLString $str712$Please_enter_a_filename_to_save_t = makeString("Please enter a filename to save the results to.");









    private static final SubLString $str717$Attempt_to_save_answers_failed___ = makeString("Attempt to save answers failed:~%~%~A");



    private static final SubLString $str719$_spec = makeString(":spec");

    private static final SubLString $str720$Error__Operation_failed = makeString("Error: Operation failed");

    private static final SubLString $str721$The_query_results_were_not_transf = makeString("The query results were not transformed into XML. \n                          Please check the input XML specifications.");

    private static final SubLString $$$Back = makeString("Back");

    private static final SubLString $str723$Error__Invalid_input = makeString("Error: Invalid input");

    private static final SubLString $str724$Please_select_one_of_the_output_f = makeString("Please select one of the output formats for saving the \n                      query results.");

    private static final SubLSymbol CB_SAVE_INFERENCE_ANSWERS_INT = makeSymbol("CB-SAVE-INFERENCE-ANSWERS-INT");





    private static final SubLString $$$Answers_were_saved_to_ = makeString("Answers were saved to ");

    private static final SubLSymbol $CB_SAVE_INFERENCE_ANSWERS = makeKeyword("CB-SAVE-INFERENCE-ANSWERS");

    private static final SubLString $str730$cb_save_inference_answers_html = makeString("cb-save-inference-answers.html");

    private static final SubLString $str731$Save_Query_Results_as_Text_XML = makeString("Save Query Results as Text/XML");

    private static final SubLString $str732$cb_save_inference_answers_int = makeString("cb-save-inference-answers-int");

    private static final SubLString $str733$Save_query_results_as_ = makeString("Save query results as:");

    private static final SubLString $str734$_tab_delimited = makeString(":tab-delimited");

    private static final SubLString $$$Text = makeString("Text");

    private static final SubLString $str736$_xml = makeString(":xml");

    private static final SubLString $$$Default_XML = makeString("Default XML");

    private static final SubLString $str738$_custom_xml = makeString(":custom-xml");

    private static final SubLString $str739$User_defined_XML = makeString("User-defined XML");

    private static final SubLString $str740$_alchemy = makeString(":alchemy");

    private static final SubLString $str741$Alchemy_text__bindings_must_be_se = makeString("Alchemy text (bindings must be sentences)");

    private static final SubLString $str742$Destination_ = makeString("Destination:");

    private static final SubLString $str743$_html_stream = makeString(":html-stream");

    private static final SubLString $$$Show_results_in_this_browser = makeString("Show results in this browser");

    private static final SubLString $str745$_file = makeString(":file");

    private static final SubLString $str746$Save_results_in_file_ = makeString("Save results in file:");



    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLString $$$Clear = makeString("Clear");

    private static final SubLString $str750$Optional_Parameters_ = makeString("Optional Parameters:");

    private static final SubLString $str751$cycl_prefix_enabled = makeString("cycl-prefix-enabled");

    private static final SubLString $str752$Include______prefix_on_CycL_terms = makeString("Include '#$' prefix on CycL terms");

    private static final SubLString $str753$Please_enter_XML_specifications_i = makeString("Please enter XML specifications if you selected ");

    private static final SubLString $$$Submit = makeString("Submit");

    private static final SubLSymbol CB_SAVE_INFERENCE_ANSWERS = makeSymbol("CB-SAVE-INFERENCE-ANSWERS");

    private static final SubLString $str756$_Save_Answers_ = makeString("[Save Answers]");

    private static final SubLString $str757$cb_save_inference_answers__A__A = makeString("cb-save-inference-answers&~A&~A");

    private static final SubLSymbol CB_LINK_SAVE_INFERENCE_ANSWERS = makeSymbol("CB-LINK-SAVE-INFERENCE-ANSWERS");



    private static final SubLSymbol CB_SAVE_INFERENCE_ANSWERS_AS_QUERIES = makeSymbol("CB-SAVE-INFERENCE-ANSWERS-AS-QUERIES");

    private static final SubLString $$$Save_Inference_Answers_as_Queries = makeString("Save Inference Answers as Queries");





    private static final SubLString $str764$Please_select_one_or_more_EL_vari = makeString("Please select one or more EL variables");



    private static final SubLString $$$Please_select_one_or_more_answers = makeString("Please select one or more answers");

    private static final SubLSymbol $sym767$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str768$cb_save_inference_answers_as_quer = makeString("cb-save-inference-answers-as-queries");

    private static final SubLString $str769$Inference__A_in_problem_store__A_ = makeString("Inference ~A in problem store ~A has no answers.");

    private static final SubLString $str770$Inference__A_in_problem_store__A_ = makeString("Inference ~A in problem store ~A hos no free variables.");

    private static final SubLString $str771$Which_variables_should_be_filled_ = makeString("Which variables should be filled in with bindings in the saved queries?");

    private static final SubLString $str772$Which_answers_should_be_used_to_g = makeString("Which answers should be used to generate queries?");

    private static final SubLString $$$Answer = makeString("Answer");

    private static final SubLSymbol MAKE_EL_VAR = makeSymbol("MAKE-EL-VAR");

    private static final SubLString $str775$Reifying_query_for__ = makeString("Reifying query for: ");

    private static final SubLString $$$query_about = makeString("query about");

    private static final SubLString $str777$New_Constant__ = makeString("New Constant: ");

    private static final SubLString $str778$cb_save_inference_answers_as_quer = makeString("cb-save-inference-answers-as-queries&~A&~A");

    private static final SubLSymbol CB_LINK_SAVE_INFERENCE_ANSWERS_AS_QUERIES = makeSymbol("CB-LINK-SAVE-INFERENCE-ANSWERS-AS-QUERIES");

    private static final SubLString $str780$Inference__A__A_Answer_Timeline = makeString("Inference ~A.~A Answer Timeline");

    private static final SubLString $$$Inference_Answer_Timeline = makeString("Inference Answer Timeline");

    private static final SubLString $$$_for_ = makeString(" for ");

    private static final SubLList $list783 = list(makeKeyword("IMAGE-WIDTH"), makeInteger(600), makeKeyword("IMAGE-HEIGHT"), makeInteger(450), makeKeyword("PLOT-COLOR"), makeString("#0000ff"));

    private static final SubLSymbol CB_INFERENCE_ANSWER_TIMELINE = makeSymbol("CB-INFERENCE-ANSWER-TIMELINE");

    private static final SubLString $str785$_Answer_Timeline_ = makeString("[Answer Timeline]");

    private static final SubLString $str786$cb_inference_answer_timeline__A__ = makeString("cb-inference-answer-timeline&~A&~A");

    private static final SubLSymbol CB_LINK_INFERENCE_ANSWER_TIMELINE = makeSymbol("CB-LINK-INFERENCE-ANSWER-TIMELINE");



    private static final SubLString $str789$http___chart_apis_google_com_char = makeString("http://chart.apis.google.com/chart?");

    private static final SubLString $str790$cht_s = makeString("cht=s");

    private static final SubLString $str791$_chs_600x450 = makeString("&chs=600x450");

    private static final SubLString $$$Inference_ = makeString("Inference ");

    private static final SubLString $$$_Answer_Timeline = makeString(" Answer Timeline");

    private static final SubLString $str794$_chtt__A = makeString("&chtt=~A");

    private static final SubLString $str795$_chds__S__S__S__S = makeString("&chds=~S,~S,~S,~S");

    private static final SubLString $str796$_chxt_x_y_x_y = makeString("&chxt=x,y,x,y");

    private static final SubLString $str797$_chxr_0__S__S_1__S__S = makeString("&chxr=0,~S,~S|1,~S,~S");

    private static final SubLString $$$milliseconds = makeString("milliseconds");

    private static final SubLString $$$seconds = makeString("seconds");

    private static final SubLString $str800$Time__ = makeString("Time (");

    private static final SubLString $str801$Answer__ = makeString("Answer #");

    private static final SubLString $str802$_chxl_2___A_3___A = makeString("&chxl=2:|~A|3:|~A");

    private static final SubLString $str803$_chxp_2__S_3__S = makeString("&chxp=2,~S|3,~S");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLString $str805$_chd_t_ = makeString("&chd=t:");

    private static final SubLString $str806$_ = makeString(",");

    private static final SubLInteger $int$450 = makeInteger(450);

    private static final SubLInteger $int$600 = makeInteger(600);

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLSymbol $sym810$_ = makeSymbol("<");



    private static final SubLList $list812 = list(makeSymbol("STORE-ID-STRING"), makeSymbol("INFERENCE-ID-STRING"), makeSymbol("MODE-STRING"));



    private static final SubLString $str814$Unexpected_mode__A = makeString("Unexpected mode ~A");

    private static final SubLSymbol CB_INFERENCE_STRENGTHEN_PROPERTIES = makeSymbol("CB-INFERENCE-STRENGTHEN-PROPERTIES");

    private static final SubLString $str816$_Strengthen_Parameters_ = makeString("[Strengthen Parameters]");

    private static final SubLList $list817 = list(makeKeyword("ALL"), makeKeyword("SOME"));

    private static final SubLString $str818$_S_was_an_invalid_mode = makeString("~S was an invalid mode");

    private static final SubLString $str819$cb_inference_strengthen_propertie = makeString("cb-inference-strengthen-properties&~A&~A&~S");

    private static final SubLSymbol $INFERENCE_STRENGTHEN_PROPERTIES = makeKeyword("INFERENCE-STRENGTHEN-PROPERTIES");

    private static final SubLSymbol CB_LINK_INFERENCE_STRENGTHEN_PROPERTIES = makeSymbol("CB-LINK-INFERENCE-STRENGTHEN-PROPERTIES");



    private static final SubLList $list823 = list(makeSymbol("&OPTIONAL"), makeSymbol("VERBOSITY-STRING"));



    private static final SubLSymbol CB_TRANSFORMATION_RULE_STATISTICS = makeSymbol("CB-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLString $$$Experience_Control_Panel = makeString("Experience Control Panel");

    private static final SubLString $str827$cb_handle_transformation_rule_sta = makeString("cb-handle-transformation-rule-statistics");

    private static final SubLSymbol $TRANSFORMATION_RULE_STATISTICS = makeKeyword("TRANSFORMATION-RULE-STATISTICS");

    private static final SubLSymbol $CLEAR_ALL_TRANSFORMATION_RULE_STATISTICS = makeKeyword("CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLString $str830$_Clear_All_Experience_ = makeString("[Clear All Experience]");

    private static final SubLString $str831$Load_experience_from_file___ = makeString("Load experience from file : ");

    private static final SubLString $str832$load_filename = makeString("load_filename");

    private static final SubLString $$$Load_Experience = makeString("Load Experience");

    private static final SubLString $$$load = makeString("load");

    private static final SubLString $str835$Save_experience_to_file___ = makeString("Save experience to file : ");

    private static final SubLString $str836$save_filename = makeString("save_filename");

    private static final SubLString $$$Save_Experience = makeString("Save Experience");

    private static final SubLString $$$save = makeString("save");

    private static final SubLString $$$Transformation_Rule_Statistics = makeString("Transformation Rule Statistics");

    private static final SubLString $str840$cb_transformation_rule_statistics = makeString("cb-transformation-rule-statistics&~S");

    private static final SubLSymbol CB_LINK_TRANSFORMATION_RULE_STATISTICS = makeSymbol("CB-LINK-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLList $list842 = list(makeKeyword("INFERENCE"));

    private static final SubLString $str843$cb_transformation_rule_statistics = makeString("cb-transformation-rule-statistics");



    private static final SubLString $str845$Gather_during_inference___ = makeString("Gather during inference : ");

    private static final SubLSymbol $DISABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE = makeKeyword("DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");

    private static final SubLSymbol $ENABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE = makeKeyword("ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");

    private static final SubLString $str848$_Disable_ = makeString("[Disable]");

    private static final SubLString $str849$_Enable_ = makeString("[Enable]");

    private static final SubLString $str850$Use_for_sorting_during_inference_ = makeString("Use for sorting during inference : ");

    private static final SubLSymbol $DISABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeKeyword("DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");

    private static final SubLSymbol $ENABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeKeyword("ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");

    private static final SubLString $str853$Prune_never_before_successful_rul = makeString("Prune never-before-successful rules during inference : ");

    private static final SubLSymbol $DISABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING = makeKeyword("DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");

    private static final SubLSymbol $ENABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING = makeKeyword("ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");

    private static final SubLString $$$No_rules = makeString("No rules");

    private static final SubLString $str857$Experience_files_that_have_been_l = makeString("Experience files that have been loaded into this image:");

    private static final SubLString $str858$No_experience_files_have_been_loa = makeString("No experience files have been loaded into this image.");

    private static final SubLString $str859$Experience_files_that_have_been_r = makeString("Experience files that have been received by this image:");

    private static final SubLString $str860$No_experience_files_have_been_rec = makeString("No experience files have been received by this image.");

    private static final SubLString $str861$Total_experience_ = makeString("Total experience:");

    private static final SubLString $str862$_S_rule_considerations = makeString("~S rule considerations");

    private static final SubLString $str863$_S_rule_successes = makeString("~S rule successes");

    private static final SubLString $str864$_S_rules = makeString("~S rules");

    private static final SubLString $str865$_see_below_ = makeString("(see below)");

    private static final SubLString $str866$_Show_Rule_Details_ = makeString("[Show Rule Details]");

    private static final SubLString $str867$Experience_acquired_by_this_image = makeString("Experience acquired by this image's inferences:");



    private static final SubLString $str869$Experience_received_from_other_im = makeString("Experience received from other images:");

    private static final SubLList $list870 = list(new SubLObject[]{ cons(makeInteger(80), ZERO_INTEGER), cons(makeInteger(60), ZERO_INTEGER), cons(makeInteger(40), ZERO_INTEGER), cons(TWENTY_INTEGER, ZERO_INTEGER), cons(ZERO_INTEGER, ZERO_INTEGER), cons(makeInteger(-20), ZERO_INTEGER), cons(makeInteger(-40), ZERO_INTEGER), cons(makeInteger(-60), ZERO_INTEGER), cons(makeInteger(-80), ZERO_INTEGER), cons(makeInteger(-100), ZERO_INTEGER) });

    private static final SubLSymbol $sym871$__ = makeSymbol(">=");



    private static final SubLString $$$Rule_Utility_Histogram = makeString("Rule Utility Histogram");



    private static final SubLString $$$Utility = makeString("Utility");

    private static final SubLString $$$Count = makeString("Count");

    private static final SubLString $$$Percent = makeString("Percent");



    private static final SubLList $list879 = cons(makeSymbol("BUCKET"), makeSymbol("BUCKET-COUNT"));

    private static final SubLString $str880$_A__ = makeString("~A %");

    private static final SubLInteger $int$40 = makeInteger(40);

    private static final SubLString $str882$_S_rules_with_image_specific_expe = makeString("~S rules with image-specific experience, sorted by ~A");

    private static final SubLString $str883$_Hide_Rule_Details_ = makeString("[Hide Rule Details]");

    private static final SubLString $str884$_S_rules__sorted_by__A = makeString("~S rules, sorted by ~A");

    private static final SubLString $str885$__S__S___S_____utility____S = makeString(" ~S/~S (~S %)  utility : ~S");

    private static final SubLString $str886$__S_utility = makeString(" ~S utility");

    private static final SubLString $str887$__never_considered = makeString(", never considered");

    private static final SubLString $str888$__due_to__S___success___S__S_ = makeString(", due to ~S % success (~S/~S)");

    private static final SubLString $str889$__ = makeString(": ");

    private static final SubLString $str890$_mode_is_the_least_powerful_infer = makeString(" mode is the least powerful inference mode in which this rule will be used.");









    private static final SubLString $$$Shallow = makeString("Shallow");



    private static final SubLString $$$Extended = makeString("Extended");

    private static final SubLString $$$Maximal = makeString("Maximal");

    private static final SubLSymbol CB_DISABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeSymbol("CB-DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");

    private static final SubLString $str900$cb_disable_strategic_heuristic_ru = makeString("cb-disable-strategic-heuristic-rule-historical-utility");

    private static final SubLSymbol CB_LINK_DISABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeSymbol("CB-LINK-DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");

    private static final SubLSymbol CB_ENABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeSymbol("CB-ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");

    private static final SubLString $str903$cb_enable_strategic_heuristic_rul = makeString("cb-enable-strategic-heuristic-rule-historical-utility");

    private static final SubLSymbol CB_LINK_ENABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY = makeSymbol("CB-LINK-ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY");

    private static final SubLSymbol CB_DISABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE = makeSymbol("CB-DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");

    private static final SubLString $str906$cb_disable_transformation_rule_st = makeString("cb-disable-transformation-rule-statistics-update");

    private static final SubLSymbol CB_LINK_DISABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE = makeSymbol("CB-LINK-DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");

    private static final SubLSymbol CB_ENABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE = makeSymbol("CB-ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");

    private static final SubLString $str909$cb_enable_transformation_rule_sta = makeString("cb-enable-transformation-rule-statistics-update");

    private static final SubLSymbol CB_LINK_ENABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE = makeSymbol("CB-LINK-ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE");

    private static final SubLSymbol CB_DISABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING = makeSymbol("CB-DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");

    private static final SubLString $str912$cb_disable_transformation_rule_hi = makeString("cb-disable-transformation-rule-historical-success-pruning");

    private static final SubLSymbol CB_LINK_DISABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING = makeSymbol("CB-LINK-DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");

    private static final SubLSymbol CB_ENABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING = makeSymbol("CB-ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");

    private static final SubLString $str915$cb_enable_transformation_rule_his = makeString("cb-enable-transformation-rule-historical-success-pruning");

    private static final SubLSymbol CB_LINK_ENABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING = makeSymbol("CB-LINK-ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING");

    private static final SubLList $list917 = list(makeSymbol("ASSERTION-ID"));

    private static final SubLString $str918$Could_not_determine_an_assertion_ = makeString("Could not determine an assertion from ~a");

    private static final SubLString $str919$The_transformation_statistics_hav = makeString("The transformation statistics have been cleared.");

    private static final SubLSymbol CB_CLEAR_TRANSFORMATION_RULE_STATISTICS = makeSymbol("CB-CLEAR-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLString $str921$_Clear_ = makeString("[Clear]");

    private static final SubLString $str922$cb_clear_transformation_rule_stat = makeString("cb-clear-transformation-rule-statistics&~A");

    private static final SubLSymbol $CLEAR_TRANSFORMATION_RULE_STATISTICS = makeKeyword("CLEAR-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLSymbol CB_LINK_CLEAR_TRANSFORMATION_RULE_STATISTICS = makeSymbol("CB-LINK-CLEAR-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLSymbol CB_CLEAR_ALL_TRANSFORMATION_RULE_STATISTICS = makeSymbol("CB-CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLString $str926$_Clear_All_ = makeString("[Clear All]");

    private static final SubLString $str927$cb_clear_all_transformation_rule_ = makeString("cb-clear-all-transformation-rule-statistics");

    private static final SubLSymbol CB_LINK_CLEAR_ALL_TRANSFORMATION_RULE_STATISTICS = makeSymbol("CB-LINK-CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLString $str929$Must_specify_either_load_or_save_ = makeString("Must specify either load or save.");

    private static final SubLString $str930$Unexpected_args__s = makeString("Unexpected args ~s");

    private static final SubLSymbol CB_HANDLE_TRANSFORMATION_RULE_STATISTICS = makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS");

    private static final SubLString $str932$The_specified_filename__S_could_n = makeString("The specified filename ~S could not be found.");

    private static final SubLString $str933$No_filename_was_specified_ = makeString("No filename was specified.");

    private static final SubLSymbol CB_HANDLE_TRANSFORMATION_RULE_STATISTICS_LOAD = makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-LOAD");

    private static final SubLString $str935$The_specified_filename__S_could_n = makeString("The specified filename ~S could not be opened for writing.");

    private static final SubLString $str936$Experience_saved_ = makeString("Experience saved.");

    private static final SubLSymbol CB_HANDLE_TRANSFORMATION_RULE_STATISTICS_SAVE = makeSymbol("CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-SAVE");

    private static final SubLString $$$Forward_Inference_Metrics = makeString("Forward Inference Metrics");

    private static final SubLSymbol CB_FORWARD_INFERENCE_METRICS = makeSymbol("CB-FORWARD-INFERENCE-METRICS");

    private static final SubLString $str940$cb_forward_inference_metrics = makeString("cb-forward-inference-metrics");

    private static final SubLSymbol $FORWARD_INFERENCE_METRICS = makeKeyword("FORWARD-INFERENCE-METRICS");

    private static final SubLSymbol CB_LINK_FORWARD_INFERENCE_METRICS = makeSymbol("CB-LINK-FORWARD-INFERENCE-METRICS");

    private static final SubLList $list943 = list(makeSymbol("ID"));

    private static final SubLString $$$Rule_Forward_Inference_Metrics = makeString("Rule Forward Inference Metrics");

    private static final SubLSymbol $RULE_FORWARD_INFERENCE_METRICS = makeKeyword("RULE-FORWARD-INFERENCE-METRICS");

    private static final SubLString $str946$_All_Forward_Inference_Metrics_ = makeString("[All Forward Inference Metrics]");



    private static final SubLSymbol CB_RULE_FORWARD_INFERENCE_METRICS = makeSymbol("CB-RULE-FORWARD-INFERENCE-METRICS");

    private static final SubLString $str949$_Forward_Inference_Metrics_ = makeString("[Forward Inference Metrics]");

    private static final SubLString $str950$cb_rule_forward_inference_metrics = makeString("cb-rule-forward-inference-metrics&~A");

    private static final SubLString $str951$cb_rule_forward_inference_metrics = makeString("cb-rule-forward-inference-metrics&NIL");

    private static final SubLSymbol CB_LINK_RULE_FORWARD_INFERENCE_METRICS = makeSymbol("CB-LINK-RULE-FORWARD-INFERENCE-METRICS");

    private static final SubLSymbol CB_CLEAR_FORWARD_INFERENCE_METRICS = makeSymbol("CB-CLEAR-FORWARD-INFERENCE-METRICS");

    private static final SubLString $str954$_Clear_Forward_Metrics_ = makeString("[Clear Forward Metrics]");

    private static final SubLString $str955$cb_clear_forward_inference_metric = makeString("cb-clear-forward-inference-metrics");

    private static final SubLSymbol $CLEAR_FORWARD_INFERENCE_METRICS = makeKeyword("CLEAR-FORWARD-INFERENCE-METRICS");

    private static final SubLSymbol CB_LINK_CLEAR_FORWARD_INFERENCE_METRICS = makeSymbol("CB-LINK-CLEAR-FORWARD-INFERENCE-METRICS");

    private static final SubLSymbol CB_START_GATHERING_FORWARD_INFERENCE_METRICS = makeSymbol("CB-START-GATHERING-FORWARD-INFERENCE-METRICS");

    private static final SubLString $str959$_Start_Gathering_Metrics_ = makeString("[Start Gathering Metrics]");

    private static final SubLString $str960$cb_start_gathering_forward_infere = makeString("cb-start-gathering-forward-inference-metrics");

    private static final SubLSymbol $START_GATHERING_FORWARD_INFERENCE_METRICS = makeKeyword("START-GATHERING-FORWARD-INFERENCE-METRICS");

    private static final SubLSymbol CB_LINK_START_GATHERING_FORWARD_INFERENCE_METRICS = makeSymbol("CB-LINK-START-GATHERING-FORWARD-INFERENCE-METRICS");

    private static final SubLSymbol CB_STOP_GATHERING_FORWARD_INFERENCE_METRICS = makeSymbol("CB-STOP-GATHERING-FORWARD-INFERENCE-METRICS");

    private static final SubLString $str964$_Stop_Gathering_Metrics_ = makeString("[Stop Gathering Metrics]");

    private static final SubLString $str965$cb_stop_gathering_forward_inferen = makeString("cb-stop-gathering-forward-inference-metrics");

    private static final SubLSymbol $STOP_GATHERING_FORWARD_INFERENCE_METRICS = makeKeyword("STOP-GATHERING-FORWARD-INFERENCE-METRICS");

    private static final SubLSymbol CB_LINK_STOP_GATHERING_FORWARD_INFERENCE_METRICS = makeSymbol("CB-LINK-STOP-GATHERING-FORWARD-INFERENCE-METRICS");

    private static final SubLString $str968$_No_forward_inference_metrics_hav = makeString(" No forward inference metrics have been gathered yet.");

    private static final SubLString $str969$No_forward_inference_metrics_have = makeString("No forward inference metrics have been gathered.");



    private static final SubLSymbol $TOTAL_INFERENCE_TIME = makeKeyword("TOTAL-INFERENCE-TIME");







    private static final SubLSymbol $AVERAGE_INFERENCES_PER_RULE = makeKeyword("AVERAGE-INFERENCES-PER-RULE");

    private static final SubLSymbol $STDEV_INFERENCES_PER_RULE = makeKeyword("STDEV-INFERENCES-PER-RULE");

    private static final SubLSymbol $AVERAGE_TRIGGER_PER_RULE = makeKeyword("AVERAGE-TRIGGER-PER-RULE");

    private static final SubLSymbol $STDEV_TRIGGER_PER_RULE = makeKeyword("STDEV-TRIGGER-PER-RULE");

    private static final SubLSymbol $AVERAGE_TIME_PER_RULE = makeKeyword("AVERAGE-TIME-PER-RULE");

    private static final SubLSymbol $STDEV_TIME_PER_RULE = makeKeyword("STDEV-TIME-PER-RULE");

    private static final SubLSymbol $AVERAGE_TIME_PER_INFERENCE = makeKeyword("AVERAGE-TIME-PER-INFERENCE");

    private static final SubLSymbol $STDEV_TIME_PER_INFERENCE = makeKeyword("STDEV-TIME-PER-INFERENCE");

    private static final SubLSymbol $AVERAGE_TIME_PER_TRIGGER = makeKeyword("AVERAGE-TIME-PER-TRIGGER");

    private static final SubLSymbol $STDEV_TIME_PER_TRIGGER = makeKeyword("STDEV-TIME-PER-TRIGGER");

    private static final SubLSymbol $SUCCESS_RULE_COUNT = makeKeyword("SUCCESS-RULE-COUNT");

    private static final SubLSymbol $SUCCESS_TRIGGER_COUNT = makeKeyword("SUCCESS-TRIGGER-COUNT");

    private static final SubLSymbol $SUCCESS_TIME_ESTIMATE = makeKeyword("SUCCESS-TIME-ESTIMATE");

    private static final SubLSymbol $SUCCESS_RULE_RATIO = makeKeyword("SUCCESS-RULE-RATIO");

    private static final SubLSymbol $SUCCESS_TRIGGER_RATIO = makeKeyword("SUCCESS-TRIGGER-RATIO");

    private static final SubLSymbol $SUCCESS_TIME_RATIO = makeKeyword("SUCCESS-TIME-RATIO");

    private static final SubLString $str991$Total_time__ = makeString("Total time: ");

    private static final SubLString $str992$Inference_time__ = makeString("Inference time: ");

    private static final SubLString $str993$___A__ = makeString(" (~A%)");

    private static final SubLString $$$Successful = makeString("Successful");

    private static final SubLList $list995 = list(makeSymbol("TIME"), makeSymbol("UNITS"));

    private static final SubLString $str996$__est_ = makeString(" (est)");

    private static final SubLString $str997$_inference_P = makeString(" inference~P");

    private static final SubLString $str998$_rule_P = makeString(" rule~P");

    private static final SubLString $str999$_trigger_P = makeString(" trigger~P");

    private static final SubLString $$$Total = makeString("Total");

    private static final SubLString $str1001$Success__ = makeString("Success %");

    private static final SubLString $str1002$__ = makeString(" %");

    private static final SubLString $$$Averages = makeString("Averages");

    private static final SubLString $str1004$___rule = makeString(" / rule");

    private static final SubLString $str1005$_inferences___rule = makeString(" inferences / rule");

    private static final SubLString $str1006$___inference = makeString(" / inference");

    private static final SubLString $str1007$_triggers___rule = makeString(" triggers / rule");

    private static final SubLString $str1008$___trigger = makeString(" / trigger");

    private static final SubLString $$$Standard_Deviations = makeString("Standard Deviations");

    private static final SubLString $str1010$_Show_Metric_Histogram_ = makeString("[Show Metric Histogram]");

    private static final SubLString $str1011$_Hide_Metric_Histogram_ = makeString("[Hide Metric Histogram]");



    private static final SubLSymbol $sym1013$_ = makeSymbol("+");

    private static final SubLSymbol $sym1014$SAFE__ = makeSymbol("SAFE->");

    private static final SubLString $$$Metric = makeString("Metric");

    private static final SubLString $$$Total_time = makeString("Total time");

    private static final SubLString $str1017$_ = makeString("%");

    private static final SubLString $str1018$Time___call = makeString("Time / call");

    private static final SubLList $list1019 = list(makeSymbol("JUST-TIME"), makeSymbol("UNITS"));

    private static final SubLList $list1020 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("RULE"), makeSymbol("TIME"), makeSymbol("INFERENCE-TIME"), makeSymbol("TIME-PLIST"), makeSymbol("COUNT-PLIST"), makeSymbol("TRIGGER-GAFS"), makeSymbol("INFERENCE-COUNT"), makeSymbol("INFERENCES") });

    private static final SubLList $list1021 = list(makeKeyword("RULE"), makeKeyword("TIME"), makeKeyword("INFERENCE-TIME"), makeKeyword("TIME-PLIST"), makeKeyword("COUNT-PLIST"), makeKeyword("TRIGGER-GAFS"), makeKeyword("INFERENCE-COUNT"), makeKeyword("INFERENCES"));















    private static final SubLString $str1029$cumulative_time__S_ = makeString("cumulative time ~S%");





    private static final SubLString $str1032$80_ = makeString("80%");

    private static final SubLString $$$Overhead = makeString("Overhead");

    private static final SubLString $str1034$_Show_Detail_ = makeString("[Show Detail]");

    private static final SubLString $str1035$Inferences_ = makeString("Inferences:");

    private static final SubLString $str1036$__S_good = makeString(" ~S good");

    private static final SubLString $str1037$__S_neutral = makeString(" ~S neutral");

    private static final SubLString $str1038$__S_no_good = makeString(" ~S no-good");

    private static final SubLString $str1039$Good__ = makeString("Good: ");

    private static final SubLString $str1040$Neutral__ = makeString("Neutral: ");

    private static final SubLString $str1041$No_Good__ = makeString("No-Good: ");

    private static final SubLString $str1042$Triggers_ = makeString("Triggers:");

    private static final SubLString $str1043$__S_successful = makeString(" ~S successful");

    private static final SubLString $str1044$__S_failed = makeString(" ~S failed");

    private static final SubLString $str1045$__S_unknown = makeString(" ~S unknown");

    private static final SubLString $str1046$Successful__ = makeString("Successful: ");

    private static final SubLString $str1047$_A_successful_trigger__P_now_inva = makeString("~A successful trigger~:P now invalid.");

    private static final SubLString $str1048$Failed__ = makeString("Failed: ");

    private static final SubLString $str1049$_A_failed_trigger__P_now_invalid_ = makeString("~A failed trigger~:P now invalid.");

    private static final SubLString $str1050$Unknown__unreifiable___ = makeString("Unknown (unreifiable): ");



    private static final SubLString $str1052$___as_ = makeString(" (~as)");

    private static final SubLString $str1053$inference_metrics = makeString("inference-metrics");

    private static final SubLString $str1054$_Show_metrics_ = makeString("[Show metrics]");

    private static final SubLString $str1055$_Hide_metrics_ = makeString("[Hide metrics]");







    private static final SubLString $str1059$_ = makeString("!");



    private static final SubLString $str1061$cb_inference_graph__A__A = makeString("cb-inference-graph&~A&~A");

    private static final SubLSymbol CB_LINK_INFERENCE_GRAPH = makeSymbol("CB-LINK-INFERENCE-GRAPH");

    private static final SubLSymbol CB_INFERENCE_GRAPH = makeSymbol("CB-INFERENCE-GRAPH");

    private static final SubLString $$$Graph_of_a_query_formula = makeString("Graph of a query formula");

    private static final SubLString $$$Refresh = makeString("Refresh");

    private static final SubLString $str1066$reloadCurrentFrame__reloadFrameBu = makeString("reloadCurrentFrame('reloadFrameButton');");

    private static final SubLString $str1067$Graph_for_ = makeString("Graph for:");

    private static final SubLString $str1068$_a = makeString("~a");

    private static final SubLInteger $int$30 = makeInteger(30);

    private static final SubLSymbol BBF_INFERENCE = makeSymbol("BBF-INFERENCE");





    public static SubLObject cb_inference_identifier(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        return cconcatenate(format_nil.format_nil_a_no_copy(store_id), new SubLObject[]{ $str1$_, format_nil.format_nil_a_no_copy(inference_id) });
    }

    public static SubLObject cb_guess_inference_from_identifier(final SubLObject identifier) {
        if (identifier.isString()) {
            final SubLObject ids = string_utilities.split_string(identifier, $list2);
            if (NIL != list_utilities.lengthE(ids, TWO_INTEGER, UNPROVIDED)) {
                SubLObject current;
                final SubLObject datum = current = ids;
                SubLObject store_id_string = NIL;
                SubLObject inference_id_string = NIL;
                destructuring_bind_must_consp(current, datum, $list3);
                store_id_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list3);
                inference_id_string = current.first();
                current = current.rest();
                if (NIL == current) {
                    return cb_guess_inference(store_id_string, inference_id_string);
                }
                cdestructuring_bind_error(datum, $list3);
            }
        }
        return NIL;
    }

    public static SubLObject cb_guess_inference(final SubLObject store_id_string, final SubLObject inference_id_string) {
        if ((NIL != string_utilities.digit_stringP(store_id_string)) && (NIL != string_utilities.digit_stringP(inference_id_string))) {
            final SubLObject store_suid = parse_integer(store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject inference_suid = parse_integer(inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(store_suid, inference_suid);
            if (NIL != inference_datastructures_inference.inference_p(inference)) {
                return inference;
            }
        }
        return NIL;
    }

    public static SubLObject html_princ_with_explanation(final SubLObject text, final SubLObject explanation, SubLObject caption, SubLObject width, SubLObject sticky) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        if (sticky == UNPROVIDED) {
            sticky = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != explanation) {
            if (explanation.isString()) {
                final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover(explanation, caption, width, sticky);
                html_markup(html_macros.$html_anchor_head$.getGlobalValue());
                html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(onmouseover);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str4$nd___);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ(text);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
            }
        } else {
            html_princ(text);
        }
        return NIL;
    }

    public static SubLObject html_princ_strong_with_explanation(final SubLObject text, final SubLObject explanation, SubLObject caption, SubLObject width, SubLObject sticky) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        if (sticky == UNPROVIDED) {
            sticky = NIL;
        }
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ_with_explanation(text, explanation, caption, width, sticky);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_princ_with_explanation(final SubLObject text, final SubLObject explanation, SubLObject caption, SubLObject width, SubLObject sticky) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        if (sticky == UNPROVIDED) {
            sticky = NIL;
        }
        return html_princ_with_explanation(text, explanation, caption, width, sticky);
    }

    public static SubLObject cb_princ_strong_with_explanation(final SubLObject text, final SubLObject explanation, SubLObject caption, SubLObject width, SubLObject sticky) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        if (sticky == UNPROVIDED) {
            sticky = NIL;
        }
        return html_princ_strong_with_explanation(text, explanation, caption, width, sticky);
    }

    public static SubLObject cb_princ_with_target_reference_and_explanation(final SubLObject target, final SubLObject linktext, final SubLObject explanation, SubLObject caption, SubLObject width, SubLObject sticky) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        if (sticky == UNPROVIDED) {
            sticky = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (explanation.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover(explanation, caption, width, sticky);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_hash, UNPROVIDED);
            html_markup(target);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_submit_input_with_explanation(SubLObject label, SubLObject explanation, SubLObject name, SubLObject script, SubLObject caption, SubLObject width, SubLObject sticky) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        if (explanation == UNPROVIDED) {
            explanation = NIL;
        }
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        if (sticky == UNPROVIDED) {
            sticky = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (explanation.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover(explanation, caption, width, sticky);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_submit_input(label, name, script);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_submit_input_with_explanation_and_inference_doc_more_link(SubLObject label, SubLObject explanation, SubLObject link_specification_string, SubLObject name, SubLObject script, SubLObject caption, SubLObject width) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        if (explanation == UNPROVIDED) {
            explanation = NIL;
        }
        if (link_specification_string == UNPROVIDED) {
            link_specification_string = NIL;
        }
        if (name == UNPROVIDED) {
            name = NIL;
        }
        if (script == UNPROVIDED) {
            script = NIL;
        }
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        final SubLObject more_link_string = cb_inference_more_link_string(link_specification_string);
        final SubLObject explanation_with_more_link = cconcatenate(explanation, new SubLObject[]{ $$$__, more_link_string });
        cb_submit_input_with_explanation(label, explanation_with_more_link, name, script, caption, width, T);
        return NIL;
    }

    public static SubLObject cb_princ_with_explanation_and_inference_doc_more_link(final SubLObject text, final SubLObject explanation, final SubLObject link_specification_string, SubLObject caption, SubLObject width) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        final SubLObject more_link_string = cb_inference_more_link_string(link_specification_string);
        final SubLObject explanation_with_more_link = cconcatenate(explanation, new SubLObject[]{ $$$__, more_link_string });
        cb_princ_with_explanation(text, explanation_with_more_link, caption, width, T);
        return NIL;
    }

    public static SubLObject cb_princ_strong_with_explanation_and_inference_doc_more_link(final SubLObject text, final SubLObject explanation, final SubLObject link_specification_string, SubLObject caption, SubLObject width) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        final SubLObject more_link_string = cb_inference_more_link_string(link_specification_string);
        final SubLObject explanation_with_more_link = cconcatenate(explanation, new SubLObject[]{ $$$__, more_link_string });
        cb_princ_strong_with_explanation(text, explanation_with_more_link, caption, width, T);
        return NIL;
    }

    public static SubLObject cb_princ_with_inference_doc_more_link(final SubLObject text, final SubLObject link_specification_string, SubLObject caption, SubLObject width) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        cb_princ_with_explanation_and_inference_doc_more_link(text, $str6$, link_specification_string, caption, width);
        return NIL;
    }

    public static SubLObject cb_princ_strong_with_inference_doc_more_link(final SubLObject text, final SubLObject link_specification_string, SubLObject caption, SubLObject width) {
        if (caption == UNPROVIDED) {
            caption = NIL;
        }
        if (width == UNPROVIDED) {
            width = NIL;
        }
        cb_princ_strong_with_explanation_and_inference_doc_more_link(text, $str6$, link_specification_string, caption, width);
        return NIL;
    }

    public static SubLObject cb_frame_link_with_explanation(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject url_body = NIL;
        SubLObject link_body = NIL;
        destructuring_bind_must_consp(current, datum, $list7);
        url_body = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list7);
        link_body = current.first();
        current = current.rest();
        final SubLObject target = (current.isCons()) ? current.first() : $MAIN;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        final SubLObject explanation = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        final SubLObject caption = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        final SubLObject width = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        final SubLObject sticky = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list7);
        current = current.rest();
        if (NIL == current) {
            return list(FRAME_LINK_HOVEROVER, url_body, link_body, target, explanation, caption, width, sticky);
        }
        cdestructuring_bind_error(datum, $list7);
        return NIL;
    }

    public static SubLObject cb_link_inference_doc(final SubLObject linktext, final SubLObject link_specification_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $cb_include_inference_helpP$.getDynamicValue(thread)) {
            final SubLObject target = (NIL != $cb_separate_doc_frame$.getDynamicValue(thread)) ? $DOC : $SELF;
            final SubLObject frame_name = cb_frame_name(target);
            final SubLObject full_pathname_and_anchor = inference_link_specification_string_to_full_pathname_and_anchor(link_specification_string);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(full_pathname_and_anchor);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        } else {
            html_princ(linktext);
        }
        return NIL;
    }

    public static SubLObject cb_show_inference_answer_counts(final SubLObject answer_count, final SubLObject new_answer_count, final SubLObject new_justification_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (answer_count.isZero()) {
            html_princ($$$None);
        } else {
            if (!answer_count.numE(new_answer_count)) {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str15$_D_total, answer_count);
            }
            if (!new_answer_count.isZero()) {
                if (!answer_count.numE(new_answer_count)) {
                    html_princ($str16$__);
                }
                format(html_macros.$html_stream$.getDynamicValue(thread), $str17$_D_new, new_answer_count);
            }
            if (!new_justification_count.numE(new_answer_count)) {
                html_princ($str16$__);
                format(html_macros.$html_stream$.getDynamicValue(thread), $str18$_D_new_justification_P, new_justification_count, new_justification_count);
            }
        }
        return NIL;
    }

    public static SubLObject cb_query_show_inference_status(final SubLObject inference, SubLObject explainP) {
        if (explainP == UNPROVIDED) {
            explainP = T;
        }
        final SubLObject status = inference_datastructures_inference.inference_status(inference);
        final SubLObject suspend_status = inference_datastructures_inference.inference_suspend_status(inference);
        cb_query_browser.cb_show_inference_status(status);
        if (((NIL != explainP) && ((status == $TAUTOLOGY) || (status == $CONTRADICTION))) && (NIL != suspend_status)) {
            html_indent(UNPROVIDED);
            cb_link($SUSPENDED_INITIAL_JUSTIFICATION, inference, $str22$_Explain_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (status == $SUSPENDED) {
            final SubLObject suspend_status_$1 = inference_datastructures_inference.inference_suspend_status(inference);
            html_princ($str16$__);
            cb_query_browser.cb_show_inference_suspend_status(suspend_status_$1);
        }
        return NIL;
    }

    public static SubLObject cb_inference_more_link_string(final SubLObject link_specification_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject more_link = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = html_macros.$html_stream$.currentBinding(thread);
            try {
                html_macros.$html_stream$.bind(stream, thread);
                cb_link($INFERENCE_DOC, $str24$More___, link_specification_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                html_macros.$html_stream$.rebind(_prev_bind_0, thread);
            }
            more_link = get_output_stream_string(stream);
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
        return more_link;
    }

    public static SubLObject cb_inference_help_directory() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cconcatenate(format_nil.format_nil_a_no_copy(system_parameters.$cyc_documentation_url$.getDynamicValue(thread)), $str25$help_inference_);
    }

    public static SubLObject inference_link_specification_string_to_full_pathname_and_anchor(final SubLObject link_specification_string) {
        return cconcatenate(cb_inference_help_directory(), new SubLObject[]{ $cb_inference_help_filename$.getGlobalValue(), $str27$_html_, link_specification_string });
    }

    public static SubLObject inference_parameter_p(final SubLObject v_object) {
        return list_utilities.sublisp_boolean(dictionary.dictionary_lookup($inference_parameter_table$.getGlobalValue(), v_object, NIL));
    }

    public static SubLObject inference_parameter_fancy_name(final SubLObject v_object) {
        return getf(dictionary.dictionary_lookup($inference_parameter_table$.getGlobalValue(), v_object, NIL), $FANCY_NAME, UNPROVIDED);
    }

    public static SubLObject inference_parameter_description(final SubLObject v_object) {
        return getf(dictionary.dictionary_lookup($inference_parameter_table$.getGlobalValue(), v_object, NIL), $DESCRIPTION, UNPROVIDED);
    }

    public static SubLObject inference_parameter_settings(final SubLObject v_object) {
        return getf(dictionary.dictionary_lookup($inference_parameter_table$.getGlobalValue(), v_object, NIL), $SETTINGS, UNPROVIDED);
    }

    public static SubLObject inference_parameter_scaling_factor(final SubLObject v_object) {
        return getf(dictionary.dictionary_lookup($inference_parameter_table$.getGlobalValue(), v_object, NIL), $SCALING_FACTOR, UNPROVIDED);
    }

    public static SubLObject inference_parameter_round_on_inputP(final SubLObject v_object) {
        return getf(dictionary.dictionary_lookup($inference_parameter_table$.getGlobalValue(), v_object, NIL), $kw33$ROUND_ON_INPUT_, UNPROVIDED);
    }

    public static SubLObject possibly_scale_value_on_input(SubLObject value, final SubLObject property) {
        value = (value.isNumber()) ? multiply(value, inference_parameter_scaling_factor(property)) : value;
        if (value.isNumber() && (NIL != inference_parameter_round_on_inputP(property))) {
            value = round(value, UNPROVIDED);
        }
        return value;
    }

    public static SubLObject possibly_scale_value_for_output(final SubLObject value, final SubLObject property) {
        return value.isNumber() ? divide(value, inference_parameter_scaling_factor(property)) : value;
    }

    public static SubLObject declare_inference_parameter(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject parameter = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        parameter = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list34);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list34);
            if (NIL == member(current_$2, $list35, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list34);
        }
        final SubLObject fancy_name_tail = property_list_member($FANCY_NAME, current);
        final SubLObject fancy_name = (NIL != fancy_name_tail) ? cadr(fancy_name_tail) : NIL;
        final SubLObject description_tail = property_list_member($DESCRIPTION, current);
        final SubLObject description = (NIL != description_tail) ? cadr(description_tail) : NIL;
        final SubLObject settings_tail = property_list_member($SETTINGS, current);
        final SubLObject settings = (NIL != settings_tail) ? cadr(settings_tail) : NIL;
        final SubLObject scaling_factor_tail = property_list_member($SCALING_FACTOR, current);
        final SubLObject scaling_factor = (NIL != scaling_factor_tail) ? cadr(scaling_factor_tail) : NIL;
        final SubLObject round_on_inputP_tail = property_list_member($kw33$ROUND_ON_INPUT_, current);
        final SubLObject round_on_inputP = (NIL != round_on_inputP_tail) ? cadr(round_on_inputP_tail) : NIL;
        return list(DECLARE_INFERENCE_PARAMETER_INTERNAL, parameter, fancy_name, description, list(QUOTE, settings), scaling_factor, round_on_inputP);
    }

    public static SubLObject declare_inference_parameter_internal(final SubLObject parameter, SubLObject fancy_name, SubLObject description, SubLObject settings, SubLObject scaling_factor, final SubLObject round_on_inputP) {
        assert NIL != keywordp(parameter) : "Types.keywordp(parameter) " + "CommonSymbols.NIL != Types.keywordp(parameter) " + parameter;
        if (!fancy_name.isString()) {
            fancy_name = prin1_to_string(parameter);
        }
        if (!description.isString()) {
            description = $str6$;
        }
        if (!settings.isCons()) {
            settings = $list42;
        }
        if (!scaling_factor.isNumber()) {
            scaling_factor = ONE_INTEGER;
        }
        final SubLObject data = list(new SubLObject[]{ $FANCY_NAME, fancy_name, $DESCRIPTION, description, $SETTINGS, settings, $SCALING_FACTOR, scaling_factor, $kw33$ROUND_ON_INPUT_, round_on_inputP });
        dictionary.dictionary_enter($inference_parameter_table$.getGlobalValue(), parameter, data);
        return parameter;
    }

    public static SubLObject inference_parameter_value_matches_setting(final SubLObject property, final SubLObject value, final SubLObject setting) {
        SubLObject method = NIL;
        SubLObject data = NIL;
        SubLObject explanation = NIL;
        destructuring_bind_must_consp(setting, setting, $list43);
        method = setting.first();
        SubLObject current = setting.rest();
        destructuring_bind_must_consp(current, setting, $list43);
        data = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, setting, $list43);
        explanation = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(setting, $list43);
            return NIL;
        }
        final SubLObject pcase_var = method;
        if (pcase_var.eql($VALUE)) {
            return list_utilities.equalE(data, value);
        }
        if (pcase_var.eql($ENTRY)) {
            return funcall(data, value);
        }
        return NIL;
    }

    public static SubLObject cb_query_new_followup(final SubLObject previous_inference, final SubLObject sentence, final SubLObject mt, final SubLObject non_explanatory_sentence, SubLObject v_inference_parameters) {
        final SubLObject problem_store = inference_datastructures_inference.inference_problem_store(previous_inference);
        v_inference_parameters = putf(copy_list(v_inference_parameters), $PROBLEM_STORE, problem_store);
        return cb_query_new(sentence, mt, non_explanatory_sentence, v_inference_parameters);
    }

    public static SubLObject cb_query_new(final SubLObject sentence, final SubLObject mt, final SubLObject non_explanatory_sentence, SubLObject v_inference_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject static_properties = inference_datastructures_enumerated_types.extract_query_static_or_meta_properties(v_inference_parameters);
        if (NIL != non_explanatory_sentence) {
            static_properties = putf(copy_list(static_properties), $NON_EXPLANATORY_SENTENCE, non_explanatory_sentence);
            v_inference_parameters = putf(copy_list(v_inference_parameters), $NON_EXPLANATORY_SENTENCE, non_explanatory_sentence);
        }
        thread.resetMultipleValues();
        final SubLObject right_sentence = czer_utilities.unwrap_if_ist(sentence, mt, UNPROVIDED);
        final SubLObject right_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != inference_strategist.inference_conditional_sentence_p(right_sentence)) {
            static_properties = putf(copy_list(static_properties), $kw192$CONDITIONAL_SENTENCE_, T);
            v_inference_parameters = putf(copy_list(v_inference_parameters), $kw192$CONDITIONAL_SENTENCE_, T);
        }
        cb_events.cb_post_query_event(right_sentence, right_mt, v_inference_parameters);
        final SubLObject new_inference = inference_kernel.new_continuable_inference(right_sentence, right_mt, static_properties);
        if (NIL != inference_datastructures_inference.continuable_inference_p(new_inference)) {
            return cb_query_continue(new_inference, v_inference_parameters);
        }
        return new_inference;
    }

    public static SubLObject cb_query_continue(final SubLObject previous_inference, final SubLObject v_inference_parameters) {
        final SubLObject dynamic_properties = inference_datastructures_enumerated_types.extract_query_dynamic_properties(v_inference_parameters);
        final SubLObject v_special_variable_state = new_cb_query_special_variable_state();
        final SubLObject semaphore = Semaphores.new_semaphore($$$CB_QUERY, ZERO_INTEGER);
        subl_promotions.make_process_with_args($$$CB_Query, CB_QUERY_CONTINUE_THREAD, list(previous_inference, dynamic_properties, v_special_variable_state, semaphore));
        Semaphores.semaphore_wait(semaphore);
        return previous_inference;
    }

    public static SubLObject new_cb_query_special_variable_state() {
        return special_variable_state.new_special_variable_state($html_state_variables$.getGlobalValue());
    }

    public static SubLObject cb_query_continue_thread(final SubLObject inference, final SubLObject query_dynamic_properties, final SubLObject v_special_variable_state, final SubLObject semaphore) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
        try {
            $package$.bind(find_package($$$CYC), thread);
            $print_readably$.bind(NIL, thread);
            $read_eval$.bind(NIL, thread);
            final SubLObject cprogv_var = special_variable_state.with_special_variable_state_variables(v_special_variable_state);
            final ArrayList old_values = extract_dynamic_values(cprogv_var);
            try {
                bind_dynamic_vars(cprogv_var, special_variable_state.with_special_variable_state_values(v_special_variable_state));
                SubLSystemTrampolineFile.enforceType(v_special_variable_state, SPECIAL_VARIABLE_STATE_P);
                Semaphores.semaphore_signal(semaphore);
                if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                    try {
                        final SubLObject query_form = list(CONTINUE_INFERENCE, inference, list_utilities.quotify(query_dynamic_properties));
                        process_utilities.current_process_note_form(query_form);
                        inference_kernel.continue_inference(inference, query_dynamic_properties);
                    } finally {
                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            process_utilities.current_process_clear_form();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                }
            } finally {
                rebind_dynamic_vars(cprogv_var, old_values);
            }
        } finally {
            $read_eval$.rebind(_prev_bind_3, thread);
            $print_readably$.rebind(_prev_bind_2, thread);
            $package$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_inferences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_act_forget_invalid_inferences();
        return $cb_inferences$.getDynamicValue(thread);
    }

    public static SubLObject do_cb_inferences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list200);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject inference = NIL;
        destructuring_bind_must_consp(current, datum, $list200);
        inference = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(DO_LIST, bq_cons(inference, $list202), listS(PWHEN, inference, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list200);
        return NIL;
    }

    public static SubLObject with_cb_inferences(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list204);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject focal_inference = NIL;
        SubLObject other_inferences = NIL;
        destructuring_bind_must_consp(current, datum, $list204);
        focal_inference = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list204);
        other_inferences = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDESTRUCTURING_BIND, list($sym206$_OPTIONAL, focal_inference, $sym207$_REST, other_inferences), $list208, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list204);
        return NIL;
    }

    public static SubLObject cb_focal_inference() {
        SubLObject current;
        final SubLObject datum = current = cb_inferences();
        final SubLObject focal_inference = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list209);
        final SubLObject other_inferences;
        current = other_inferences = current.rest();
        return focal_inference;
    }

    public static SubLObject cb_note_focal_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_act_forget_inference(NIL);
        cb_act_forget_inference(inference);
        $cb_inferences$.setDynamicValue(cons(inference, $cb_inferences$.getDynamicValue(thread)), thread);
        cb_destroy_all_inferences_but_last_n();
        return NIL;
    }

    public static SubLObject cb_note_no_focal_inference() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_act_forget_inference(NIL);
        $cb_inferences$.setDynamicValue(cons(NIL, $cb_inferences$.getDynamicValue(thread)), thread);
        return NIL;
    }

    public static SubLObject cb_steal_inferences_by_problem_store_ids(final SubLObject ids) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = ids;
        SubLObject id = NIL;
        id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(id, ZERO_INTEGER);
            if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                count = add(count, ONE_INTEGER);
                cb_note_focal_inference(inference);
            }
            cdolist_list_var = cdolist_list_var.rest();
            id = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject cb_act_forget_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_inferences$.setDynamicValue(delete(inference, $cb_inferences$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return T;
    }

    public static SubLObject cb_act_forget_invalid_inferences() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $cb_inferences$.setDynamicValue(list_utilities.delete_if_not(symbol_function(VALID_INFERENCE_P), $cb_inferences$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        return NIL;
    }

    public static SubLObject cb_act_destroy_inference(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_kb_query.kbq_deregister_query_spec_of_inference(inference);
        cb_kct_test.kct_deregister_test_spec_of_inference(inference);
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    try {
                        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
                            final SubLObject store = inference_datastructures_inference.inference_problem_store(inference);
                            if (ONE_INTEGER.numE(inference_datastructures_problem_store.problem_store_non_recursive_inference_count(store))) {
                                inference_datastructures_problem_store.destroy_problem_store(store);
                            } else {
                                inference_datastructures_inference.destroy_inference(inference);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            cb_act_forget_inference(inference);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
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
        return NIL;
    }

    public static SubLObject cb_destroy_all_inferences_but_last_n() {
        SubLObject current;
        final SubLObject datum = current = cb_inferences();
        final SubLObject focal_inference = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list209);
        final SubLObject other_inferences;
        current = other_inferences = current.rest();
        cb_destroy_all_inferences_but_last_n_int(other_inferences);
        return NIL;
    }

    public static SubLObject cb_destroy_all_inferences_but_last_n_int(final SubLObject other_inferences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != number_utilities.positive_infinity_p($cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread))) {
            return NIL;
        }
        if (NIL != list_utilities.lengthL(other_inferences, $cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread), UNPROVIDED)) {
            return NIL;
        }
        SubLObject list_var = NIL;
        SubLObject other_inference = NIL;
        SubLObject number = NIL;
        list_var = other_inferences;
        other_inference = list_var.first();
        for (number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , other_inference = list_var.first() , number = add(ONE_INTEGER, number)) {
            if (number.numGE($cb_destroy_all_inferences_but_last_n$.getDynamicValue(thread))) {
                cb_act_destroy_inference(other_inference);
            }
        }
        return NIL;
    }

    public static SubLObject cb_act_reinforce_inference(final SubLObject inference) {
        if (NIL != inference_datastructures_inference.valid_inference_p(inference)) {
            inference_analysis.reinforce_inference_transformation_rules(inference, $int$1000);
            return inference;
        }
        return NIL;
    }

    public static SubLObject cb_query(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_query(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Query;
        }
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str219$cb_query);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_query_internal(SubLObject rendering_properties) {
        if (rendering_properties == UNPROVIDED) {
            rendering_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_act_forget_invalid_inferences();
        SubLObject current;
        final SubLObject datum = current = cb_inferences();
        final SubLObject focal_inference = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list209);
        final SubLObject other_inferences;
        current = other_inferences = current.rest();
        final SubLObject current_$6;
        final SubLObject datum_$5 = current_$6 = rendering_properties;
        final SubLObject title_tail = property_list_member($TITLE, current_$6);
        final SubLObject title = (NIL != title_tail) ? cadr(title_tail) : $$$Query_Tool;
        final SubLObject refresh_tail = property_list_member($REFRESH, current_$6);
        final SubLObject refresh = (NIL != refresh_tail) ? cadr(refresh_tail) : NIL;
        final SubLObject sentence_tail = property_list_member($SENTENCE, current_$6);
        final SubLObject sentence = (NIL != sentence_tail) ? cadr(sentence_tail) : $UNSPECIFIED;
        final SubLObject mt_tail = property_list_member($MT, current_$6);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : $UNSPECIFIED;
        final SubLObject non_explanatory_sentence_tail = property_list_member($NON_EXPLANATORY_SENTENCE, current_$6);
        final SubLObject non_explanatory_sentence = (NIL != non_explanatory_sentence_tail) ? cadr(non_explanatory_sentence_tail) : $UNSPECIFIED;
        final SubLObject properties_tail = property_list_member($PROPERTIES, current_$6);
        final SubLObject v_properties = (NIL != properties_tail) ? cadr(properties_tail) : $UNSPECIFIED;
        final SubLObject query_spec_tail = property_list_member($QUERY_SPEC, current_$6);
        final SubLObject query_spec = (NIL != query_spec_tail) ? cadr(query_spec_tail) : $UNSPECIFIED;
        final SubLObject test_spec_tail = property_list_member($TEST_SPEC, current_$6);
        final SubLObject test_spec = (NIL != test_spec_tail) ? cadr(test_spec_tail) : $UNSPECIFIED;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str232$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$7 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                html_princ(title);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                if (NIL != refresh) {
                    html_refresh(refresh, UNPROVIDED);
                }
                html_complete.html_complete_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_script_utilities.html_set_all_radio_buttons_script();
                dhtml_macros.html_basic_cb_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$8 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str235$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$9 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$10 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str237$cb_handle_query, NIL, UNPROVIDED);
                            cb_show_query_header_top(title);
                            html_script_utilities.cb_hoverover_page_init();
                            cb_show_query_header_links(focal_inference, other_inferences);
                            if (NIL != other_inferences) {
                                html_hr(UNPROVIDED, UNPROVIDED);
                                cb_query_other_inferences_section(focal_inference, other_inferences);
                            }
                            if (NIL != focal_inference) {
                                html_hr(UNPROVIDED, UNPROVIDED);
                                cb_query_focal_inference_section(sentence, refresh, focal_inference);
                            }
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_query_new_inference_section(sentence, mt, non_explanatory_sentence, focal_inference, other_inferences, query_spec, test_spec);
                            html_hr(UNPROVIDED, UNPROVIDED);
                            cb_query_parameters_section(focal_inference, v_properties);
                            if (NIL != cb_query_proof_checker_section_relevantP(focal_inference, v_properties)) {
                                html_hr(UNPROVIDED, UNPROVIDED);
                                cb_query_proof_checker_setup_section(focal_inference, v_properties);
                            }
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$10, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$9, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$8, thread);
                }
                dhtml_macros.dhtml_set_visibility($str238$non_explanatory, $VISIBLE, $PARAGRAPH);
                final SubLObject sentence_$11 = cb_query_non_explanatory_sentence(non_explanatory_sentence, focal_inference);
                final SubLObject initial_visibility = ((NIL != sentence_$11) && ($UNSPECIFIED != sentence_$11)) ? $VISIBLE : $INVISIBLE;
                dhtml_macros.dhtml_set_visibility($str238$non_explanatory, initial_visibility, UNPROVIDED);
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$7, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_show_query_header_top(final SubLObject title) {
        html_markup(html_macros.$html_heading_head$.getGlobalValue());
        html_markup(TWO_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        html_princ(title);
        html_markup(html_macros.$html_heading_tail$.getGlobalValue());
        html_markup(TWO_INTEGER);
        html_char(CHAR_greater, UNPROVIDED);
        cb_help_preamble($CB_QUERY, NIL, UNPROVIDED);
        cb_link($QUERY, $str244$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_show_query_header_links(final SubLObject focal_inference, final SubLObject other_inferences) {
        if (((NIL != focal_inference) || (NIL != other_inferences)) || (NIL != cb_assertion_editor.cb_proof_checker_rules())) {
            html_indent(FOUR_INTEGER);
            cb_princ_strong_with_explanation($str245$Go_to_section__, $str246$Shortcut_links_to_sections_that_a, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != focal_inference) && (NIL != other_inferences)) {
                html_indent(UNPROVIDED);
                cb_princ_with_target_reference_and_explanation($str247$focal_inference_section, $str248$_Focal_Inference_, $str249$The_inference_you_are_currently_e, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != focal_inference) || (NIL != other_inferences)) {
                html_indent(UNPROVIDED);
                cb_princ_with_target_reference_and_explanation($str250$new_inference_section, $str251$_New_Inference_, $str252$Start_a_new_inference_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if ((NIL != focal_inference) || (NIL != other_inferences)) {
                html_indent(UNPROVIDED);
                cb_princ_with_target_reference_and_explanation($str253$parameters_section, $str254$_Inference_Parameters_, $str255$Adjust_the_inference_parameters_a, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != cb_assertion_editor.cb_proof_checker_rules()) {
                html_indent(UNPROVIDED);
                cb_princ_with_target_reference_and_explanation($str256$proof_checker_section, $str257$_Proof_Checker_Setup_, $str258$Specify_an_exact_set_of_rules__an, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject cb_query_inference_sharedP(final SubLObject inference) {
        return NIL;
    }

    public static SubLObject cb_query_any_inferences_sharedP(final SubLObject inferences) {
        SubLObject cdolist_list_var = inferences;
        SubLObject inference = NIL;
        inference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cb_query_inference_sharedP(inference)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_query_other_inferences_section(final SubLObject focal_inference, final SubLObject other_inferences) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dhtml_macros.dhtml_switch_visibility_links($str259$other_inferences, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_princ_strong_with_explanation($$$Other_Inferences, $str263$Examine__continue__or_destroy_pas, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_indent(FOUR_INTEGER);
        html_markup(html_macros.$html_italic_head$.getGlobalValue());
        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
        format(html_macros.$html_stream$.getDynamicValue(thread), $str264$__A_total_, length(other_inferences));
        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
        final SubLObject initial_visibility = (NIL != focal_inference) ? $INVISIBLE : $VISIBLE;
        dhtml_macros.dhtml_set_switched_visibility($str259$other_inferences, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str259$other_inferences);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ONE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(TWO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$12 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$13 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$14 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Actions);
                        html_newline(UNPROVIDED);
                        html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                        cb_link($DESTROY_ALL_OTHER_INFERENCES, $str269$_Destroy_All_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$14, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    SubLObject cdolist_list_var = other_inferences;
                    SubLObject inference = NIL;
                    inference = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$15 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_link($DEBUG_INFERENCE, inference, $str271$_Debug_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            cb_link($INFERENCE, inference, NIL, $str273$_Examine_, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            cb_link($FOCUS_INFERENCE, inference, $str275$_Focus_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            cb_link($DESTROY_INFERENCE, inference, $str277$_Destroy_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$15, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        inference = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$13, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Query);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$17, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    SubLObject cdolist_list_var = other_inferences;
                    SubLObject inference = NIL;
                    inference = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$18 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_query_browser.cb_show_inference_el_query(inference, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$18, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        inference = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$16, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$19 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$20 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Status);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$20, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    SubLObject cdolist_list_var = other_inferences;
                    SubLObject inference = NIL;
                    inference = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$21 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_query_show_inference_status(inference, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$21, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        inference = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$19, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$22 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$23 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Answers);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$23, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    SubLObject cdolist_list_var = other_inferences;
                    SubLObject inference = NIL;
                    inference = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
                        final SubLObject new_answer_count = inference_datastructures_inference.inference_new_answer_count(inference);
                        final SubLObject new_justification_count = inference_datastructures_inference.inference_new_justification_count(inference);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$24 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_show_inference_answer_counts(answer_count, new_answer_count, new_justification_count);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$24, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        cdolist_list_var = cdolist_list_var.rest();
                        inference = cdolist_list_var.first();
                    } 
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$22, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$12, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_query_focal_inference_section(final SubLObject sentence, final SubLObject refreshP, final SubLObject focal_inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition($str247$focal_inference_section);
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(focal_inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(focal_inference);
        html_hidden_input($str280$focal_problem_store, store_id, UNPROVIDED);
        html_hidden_input($str281$focal_inference, inference_id, UNPROVIDED);
        dhtml_macros.dhtml_switch_visibility_links($str281$focal_inference, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_princ_strong_with_explanation($$$Focal_Inference, $str249$The_inference_you_are_currently_e, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_indent(FOUR_INTEGER);
        html_princ_strong($str283$Actions__);
        html_indent(UNPROVIDED);
        cb_link($DEBUG_INFERENCE, focal_inference, $str271$_Debug_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($INFERENCE, focal_inference, NIL, $str273$_Examine_, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($MONITOR_INFERENCE, focal_inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != inference_reinforcement_applicableP(focal_inference)) {
            html_indent(UNPROVIDED);
            cb_link($REINFORCE_INFERENCE, focal_inference, $str286$_Reinforce_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_indent(UNPROVIDED);
        cb_link($DEFOCUS_INFERENCE, focal_inference, $str288$_Defocus_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($DESTROY_INFERENCE, focal_inference, $str277$_Destroy_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($TEMPLATE_OE_INFERENCE, focal_inference, $str290$_Template_OE_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($CB_OWL_EXPORT_INFERENCE_ANSWERS, focal_inference, $str292$_OWL_Export_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($KBQ_SAVE, focal_inference, $str294$_Save_As_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($KCT_SAVE, focal_inference, $str296$_Save_As_Test_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($INFERENCE_TO_SUBL_QUERY, focal_inference, $str298$_SubL_Query_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($INFERENCE_GRAPH, focal_inference, $str300$_Query_Graph_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject initial_visibility = ($UNSPECIFIED == sentence) ? $VISIBLE : $INVISIBLE;
        dhtml_macros.dhtml_set_switched_visibility($str281$focal_inference, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str281$focal_inference);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_newline(UNPROVIDED);
            cb_query_browser.cb_show_inference_el_query(focal_inference, UNPROVIDED);
            html_newline(TWO_INTEGER);
            cb_show_focal_inference_progress_section(focal_inference, refreshP);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_query_new_inference_section(final SubLObject sentence, final SubLObject mt, final SubLObject non_explanatory_sentence, final SubLObject focal_inference, final SubLObject other_inferences, SubLObject query_spec, SubLObject test_spec) {
        if (query_spec == UNPROVIDED) {
            query_spec = NIL;
        }
        if (test_spec == UNPROVIDED) {
            test_spec = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition($str250$new_inference_section);
        if ((NIL != query_spec) && (query_spec != $UNSPECIFIED)) {
            html_princ_strong($str301$Asking_query__);
            cb_form(query_spec, UNPROVIDED, UNPROVIDED);
            if (NIL != isa.isa_in_any_mtP(query_spec, $const302$UnrunnableQuery_SubstitutionOfInd)) {
                html_newline(UNPROVIDED);
                final SubLObject color_val = $RED;
                html_markup(html_macros.$html_font_head$.getGlobalValue());
                if (NIL != color_val) {
                    html_markup(html_macros.$html_font_color$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_color(color_val));
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($str304$WARNING__This_query_is_not_intend);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_font_tail$.getGlobalValue());
            }
            html_newline(TWO_INTEGER);
        }
        dhtml_macros.dhtml_switch_visibility_links($str305$new_inference, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_princ_strong_with_explanation($$$New_Inference, $str252$Start_a_new_inference_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        html_indent(FOUR_INTEGER);
        cb_query_new_inference_submit_section(focal_inference, query_spec, test_spec);
        SubLObject initial_visibility = $VISIBLE;
        if (($UNSPECIFIED == sentence) && ((((NIL != focal_inference) && ($RUNNING == inference_datastructures_inference.inference_status(focal_inference))) && (NIL == $cb_inference_progress_frame_enabledP$.getGlobalValue())) || ((NIL == focal_inference) && (NIL != other_inferences)))) {
            initial_visibility = $INVISIBLE;
        }
        dhtml_macros.dhtml_set_switched_visibility($str305$new_inference, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str305$new_inference);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_query_new_inference_mt_section(sentence, mt, focal_inference);
            cb_query_new_inference_sentence_section(sentence, focal_inference);
            html_newline(UNPROVIDED);
            cb_query_new_inference_non_explanatory_sentence_section(non_explanatory_sentence, focal_inference);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_query_new_inference_submit_section(final SubLObject focal_inference, SubLObject query_spec, SubLObject test_spec) {
        if (query_spec == UNPROVIDED) {
            query_spec = NIL;
        }
        if (test_spec == UNPROVIDED) {
            test_spec = NIL;
        }
        html_reset_input($$$Reset_All_Fields);
        if (NIL != focal_inference) {
            if (NIL != focal_inference) {
                html_indent(UNPROVIDED);
                cb_submit_input_with_explanation_and_inference_doc_more_link($$$Start_as_a_Followup_to_Focal, $str310$Starts_a_new_inference_as_a_follo, $str311$sharing_a_problem_store, $$$followup, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_indent(UNPROVIDED);
            cb_submit_input_with_explanation($$$Start_as_New, $str314$Starts_a_new_inference_with_a_fre, $$$new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            html_indent(UNPROVIDED);
            cb_submit_input_with_explanation($$$Start_Inference, $str314$Starts_a_new_inference_with_a_fre, $$$new, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        if ((NIL != query_spec) && (query_spec != $UNSPECIFIED)) {
            html_hidden_input($str317$query_spec, cb_term_identifier(query_spec), UNPROVIDED);
        }
        if ((NIL != test_spec) && (test_spec != $UNSPECIFIED)) {
            html_hidden_input($str318$test_spec, cb_term_identifier(test_spec), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject default_new_inference_monad_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $default_new_inference_monad_mt$.getDynamicValue(thread);
    }

    public static SubLObject default_new_inference_mt() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hlmt.$hlmts_supportedP$.getDynamicValue(thread)) {
            return $default_new_inference_mt$.getDynamicValue(thread);
        }
        return $$InferencePSC;
    }

    public static SubLObject set_default_new_inference_mt(final SubLObject mt) {
        $default_new_inference_mt$.setDynamicValue(hlmt.augment_hlmt(mt));
        return default_new_inference_mt();
    }

    public static SubLObject cb_query_new_inference_mt_section(final SubLObject sentence, SubLObject mt, final SubLObject focal_inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition($str326$mt_section);
        dhtml_macros.dhtml_switch_visibility_links($str327$cb_query_inference_mt, $$$Show, $$$Hide);
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_bold_head$.getGlobalValue());
        html_princ($$$Query_Context);
        html_markup(html_macros.$html_bold_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        final SubLObject initial_visibility = $VISIBLE;
        dhtml_macros.dhtml_set_switched_visibility($str327$cb_query_inference_mt, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str327$cb_query_inference_mt);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            if ($UNSPECIFIED == sentence) {
                if (NIL != focal_inference) {
                    mt = inference_datastructures_inference.inference_input_mt(focal_inference);
                } else {
                    mt = default_new_inference_mt();
                }
            } else
                if ($UNSPECIFIED == mt) {
                    mt = NIL;
                } else {
                    // mt = mt;
                }

            final SubLObject display_options = list($MONAD_CHOICES, $cb_query_default_mt_monad_choices$.getGlobalValue());
            cb_form_widgets.cb_mt_input_section(mt, display_options);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_query_new_inference_sentence_section(final SubLObject sentence, final SubLObject focal_inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition($str330$sentence_section);
        final SubLObject query_sentence = cb_query_sentence(sentence, focal_inference);
        final SubLObject width = $int$80;
        final SubLObject height = TEN_INTEGER;
        final SubLObject display_options = list(new SubLObject[]{ $INPUT_NAME, $$$sentence, $WIDTH, width, $HEIGHT, height, $COMPLETE_LABEL, $$$Complete, $CYCLIFY_LABEL, $$$Cyclify, $CLEAR_LABEL, $$$Clear_Sentence, $MODE, $QUERY });
        final SubLObject sentence_id = cconcatenate($str343$editor_, format_nil.format_nil_a_no_copy(html_macros.next_html_id(UNPROVIDED)));
        html_source_readability_terpri(UNPROVIDED);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        if (NIL != sentence_id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(sentence_id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_attribute_class$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($$$CycEditor);
        html_char(CHAR_quotation, UNPROVIDED);
        SubLObject cdolist_list_var = list($list346, bq_cons($str347$_cols_, width), bq_cons($str348$_rows_, height));
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject attribute = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list345);
            attribute = current.first();
            current = value = current.rest();
            html_markup(attribute);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(value);
            html_char(CHAR_quotation, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_source_readability_terpri(UNPROVIDED);
            cb_form_widgets.cb_el_sentence_input_section($UNSPECIFIED == query_sentence ? NIL : query_sentence, display_options);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_query_new_inference_non_explanatory_sentence_section(final SubLObject non_explanatory_sentence, final SubLObject focal_inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = cb_query_non_explanatory_sentence(non_explanatory_sentence, focal_inference);
        final SubLObject initial_visibility = ((NIL != sentence) && ($UNSPECIFIED != sentence)) ? $VISIBLE : $INVISIBLE;
        dhtml_macros.dhtml_switch_visibility_links($str238$non_explanatory, $$$Show, $$$Hide);
        html_indent(UNPROVIDED);
        cb_princ_strong_with_explanation($$$Pragmatics, $str350$An_optional_sentence_that_will_fu, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        dhtml_macros.dhtml_set_switched_visibility($str238$non_explanatory, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str238$non_explanatory);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject display_options = list(new SubLObject[]{ $INPUT_NAME, $str351$non_exp_sentence, $COMPLETE_LABEL, $$$Complete, $CYCLIFY_LABEL, $$$Cyclify, $CLEAR_LABEL, $$$Clear_Sentence, $HEIGHT, FIVE_INTEGER, $WIDTH, $int$80, $MODE, $QUERY });
            cb_form_widgets.cb_el_sentence_input_section($UNSPECIFIED == sentence ? NIL : sentence, display_options);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_query_sentence(final SubLObject explicit_sentence, final SubLObject focal_inference) {
        final SubLObject focal_sentence = (NIL != focal_inference) ? inference_datastructures_inference.inference_input_el_query(focal_inference) : $UNSPECIFIED;
        final SubLObject sentence = cb_query_select_sentence(explicit_sentence, focal_sentence);
        return sentence;
    }

    public static SubLObject cb_query_non_explanatory_sentence(final SubLObject explicit_sentence, final SubLObject focal_inference) {
        final SubLObject focal_sentence = ((NIL != focal_inference) && (NIL != inference_datastructures_inference.inference_input_non_explanatory_el_query(focal_inference))) ? inference_datastructures_inference.inference_input_non_explanatory_el_query(focal_inference) : $UNSPECIFIED;
        final SubLObject sentence = cb_query_select_sentence(explicit_sentence, focal_sentence);
        return sentence;
    }

    public static SubLObject cb_query_select_sentence(final SubLObject explicit_sentence, final SubLObject focal_sentence) {
        if ($UNSPECIFIED != explicit_sentence) {
            return fi.perform_fi_substitutions(explicit_sentence, UNPROVIDED);
        }
        if ($UNSPECIFIED != focal_sentence) {
            return fi.perform_fi_substitutions(focal_sentence, UNPROVIDED);
        }
        return $UNSPECIFIED;
    }

    public static SubLObject cb_query_parameters_section(final SubLObject focal_inference, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_target_definition($str253$parameters_section);
        dhtml_macros.dhtml_switch_visibility_links($str353$inference_parameters, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_princ_strong_with_explanation($$$Inference_Parameters, $str355$The_inference_parameters_and_reso, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        if ((NIL != focal_inference) && ((NIL != inference_datastructures_inference.continuable_inference_p(focal_inference)) || (((NIL != $cb_inference_progress_frame_enabledP$.getGlobalValue()) && (NIL != inference_datastructures_inference.running_inference_p(focal_inference))) && (NIL != inference_datastructures_inference.inference_continuableP(focal_inference))))) {
            html_indent(TWO_INTEGER);
            cb_submit_input_with_explanation($$$Continue_the_Focal_Inference, $str357$Continues_running_the_focal_infer, $$$continue, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject initial_visibility = $VISIBLE;
        dhtml_macros.dhtml_set_switched_visibility($str353$inference_parameters, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str353$inference_parameters);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_newline(UNPROVIDED);
            cb_submit_input_with_explanation($$$Save_Parameters, $str360$Saves_the_current_inference_param, $str361$save_parameters, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_submit_input_with_explanation($$$Load_Parameters, $str363$Loads_user_saved_default_inferenc, $str364$load_parameters, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(TWO_INTEGER);
            cb_submit_input_with_explanation($$$Reset_Parameters, $str366$Resets_all_the_inference_paramete, $str367$reset_parameters, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != focal_inference) && (NIL != inference_datastructures_inference.inference_has_some_answerP(focal_inference))) {
                html_indent(TWO_INTEGER);
                cb_submit_input_with_explanation($$$Strengthen_Parameters, $str369$Sets_the_inference_parameters_to_, $str370$strengthen_parameters, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_newline(TWO_INTEGER);
            cb_query_basic_inference_resource_constraints_section(focal_inference, T, T, query_properties);
            html_hr(UNPROVIDED, UNPROVIDED);
            cb_query_advanced_inference_parameters_section(focal_inference, query_properties);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_save_inference_parameter_defaults(final SubLObject v_inference_parameters) {
        $cb_default_query_parameters$.setDynamicValue(v_inference_parameters);
        cb_tools.cb_save_interface_state();
        return NIL;
    }

    public static SubLObject get_saved_inference_parameter_default(final SubLObject inference_parameter, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject saved_default = getf($cb_default_query_parameters$.getDynamicValue(thread), inference_parameter, NIL);
        if (NIL != saved_default) {
            return possibly_scale_value_for_output(saved_default, inference_parameter);
        }
        return v_default;
    }

    public static SubLObject cb_query_inference_resource_constraints_section(final SubLObject focal_inference, final SubLObject allow_editP, final SubLObject show_input_valuesP, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = $UNSPECIFIED;
        }
        html_markup(html_macros.$html_underlined_head$.getGlobalValue());
        cb_princ_strong_with_explanation($$$Inference_Resource_Constraints, $str373$Properties_that_can_change_while_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        return cb_query_basic_inference_resource_constraints_section(focal_inference, allow_editP, show_input_valuesP, query_properties);
    }

    public static SubLObject cb_query_basic_inference_resource_constraints_section(final SubLObject focal_inference, final SubLObject allow_editP, final SubLObject show_input_valuesP, final SubLObject query_properties) {
        cb_query_show_inference_properties($cb_basic_inference_resource_constraints$.getGlobalValue(), focal_inference, allow_editP, show_input_valuesP, query_properties, FOUR_INTEGER, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_query_advanced_inference_parameters_section(final SubLObject focal_inference, final SubLObject query_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        dhtml_macros.dhtml_switch_visibility_links($str374$advanced_parameters, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_princ_strong_with_explanation($$$Inference_Debugging_Parameters, $str376$The_advanced_inference_parameters, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        final SubLObject initial_visibility = $INVISIBLE;
        dhtml_macros.dhtml_set_switched_visibility($str374$advanced_parameters, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str374$advanced_parameters);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_newline(UNPROVIDED);
            cb_query_advanced_inference_mode_properties(focal_inference, T, T, query_properties);
            html_newline(UNPROVIDED);
            cb_query_advanced_inference_dynamic_properties(focal_inference, T, T, query_properties, NIL);
            html_newline(UNPROVIDED);
            cb_query_advanced_inference_static_properties(focal_inference, T, T, query_properties, NIL);
            html_newline(UNPROVIDED);
            cb_query_advanced_problem_store_static_properties(focal_inference, T, T, query_properties);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_inference_mode_property_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $cb_inference_mode_properties$.getGlobalValue());
    }

    public static SubLObject cb_inference_mode_property_datum_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object.first(), $cb_inference_mode_properties$.getGlobalValue());
    }

    public static SubLObject cb_possibly_filter_out_inference_mode_properties(final SubLObject properties_data, final SubLObject include_inference_mode_propertiesP) {
        if (NIL != include_inference_mode_propertiesP) {
            return properties_data;
        }
        return remove_if(CB_INFERENCE_MODE_PROPERTY_DATUM_P, properties_data, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_inference_mode_properties_data() {
        SubLObject data = NIL;
        SubLObject cdolist_list_var = $cb_all_inference_properties$.getGlobalValue();
        SubLObject datum = NIL;
        datum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cb_inference_mode_property_datum_p(datum)) {
                data = cons(datum, data);
            }
            cdolist_list_var = cdolist_list_var.rest();
            datum = cdolist_list_var.first();
        } 
        return list_utilities.sort_via_position(data, $cb_inference_mode_properties$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST));
    }

    public static SubLObject cb_query_advanced_inference_mode_properties(final SubLObject focal_inference, final SubLObject allow_editP, final SubLObject show_input_valuesP, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = $UNSPECIFIED;
        }
        html_markup(html_macros.$html_underlined_head$.getGlobalValue());
        cb_princ_strong_with_explanation($$$Inference_Engine_Mode_Properties, $str381$Properties_determined_by_the_choi, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        cb_query_show_inference_properties(cb_inference_mode_properties_data(), focal_inference, allow_editP, show_input_valuesP, query_properties, THREE_INTEGER, T);
        return NIL;
    }

    public static SubLObject cb_query_advanced_inference_dynamic_properties(final SubLObject focal_inference, final SubLObject allow_editP, final SubLObject show_input_valuesP, SubLObject query_properties, SubLObject include_inference_mode_propertiesP) {
        if (query_properties == UNPROVIDED) {
            query_properties = $UNSPECIFIED;
        }
        if (include_inference_mode_propertiesP == UNPROVIDED) {
            include_inference_mode_propertiesP = T;
        }
        html_markup(html_macros.$html_underlined_head$.getGlobalValue());
        cb_princ_strong_with_explanation($$$Inference_Dynamic_Properties, $str373$Properties_that_can_change_while_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        cb_query_show_inference_properties($cb_advanced_inference_dynamic_properties$.getGlobalValue(), focal_inference, allow_editP, show_input_valuesP, query_properties, THREE_INTEGER, include_inference_mode_propertiesP);
        return NIL;
    }

    public static SubLObject cb_query_advanced_inference_static_properties(final SubLObject focal_inference, final SubLObject allow_editP, final SubLObject show_input_valuesP, SubLObject query_properties, SubLObject include_inference_mode_propertiesP) {
        if (query_properties == UNPROVIDED) {
            query_properties = $UNSPECIFIED;
        }
        if (include_inference_mode_propertiesP == UNPROVIDED) {
            include_inference_mode_propertiesP = T;
        }
        html_markup(html_macros.$html_underlined_head$.getGlobalValue());
        cb_princ_strong_with_explanation($$$Inference_Static_Properties, $str386$Properties_that_can_vary_between_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        cb_query_show_inference_properties($cb_advanced_inference_static_properties$.getGlobalValue(), focal_inference, allow_editP, show_input_valuesP, query_properties, TWO_INTEGER, include_inference_mode_propertiesP);
        return NIL;
    }

    public static SubLObject cb_query_advanced_problem_store_static_properties(final SubLObject focal_inference, final SubLObject allow_editP, final SubLObject show_input_valuesP, final SubLObject query_properties) {
        html_markup(html_macros.$html_underlined_head$.getGlobalValue());
        cb_princ_strong_with_explanation($$$Problem_Store_Static_Properties, $str390$Properties_of_a_problem_store_tha, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_markup(html_macros.$html_underlined_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        cb_query_show_inference_properties($cb_advanced_problem_store_static_properties$.getGlobalValue(), focal_inference, allow_editP, show_input_valuesP, query_properties, THREE_INTEGER, NIL);
        return NIL;
    }

    public static SubLObject cb_all_inference_parameters() {
        return $cb_all_inference_parameters$.getGlobalValue();
    }

    public static SubLObject cb_query_show_inference_properties(SubLObject cb_properties, final SubLObject focal_inference, final SubLObject allow_editP, final SubLObject show_input_valuesP, final SubLObject query_properties, SubLObject group_size, SubLObject include_inference_mode_propertiesP) {
        if (group_size == UNPROVIDED) {
            group_size = TWO_INTEGER;
        }
        if (include_inference_mode_propertiesP == UNPROVIDED) {
            include_inference_mode_propertiesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_properties = cb_possibly_filter_out_inference_mode_properties(cb_properties, include_inference_mode_propertiesP);
        if (NIL != cb_properties) {
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(THREE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(THREE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                while (NIL != nthcdr(group_size, cb_properties)) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$25 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        SubLObject i;
                        SubLObject current;
                        SubLObject datum;
                        SubLObject temp;
                        SubLObject property;
                        SubLObject cb_default;
                        SubLObject entry_spec;
                        SubLObject remaining_cb_properties;
                        SubLObject value;
                        SubLObject _prev_bind_0_$26;
                        SubLObject _prev_bind_0_$27;
                        for (i = NIL, i = ZERO_INTEGER; i.numL(group_size); i = add(i, ONE_INTEGER)) {
                            datum = current = cb_properties;
                            destructuring_bind_must_consp(current, datum, $list391);
                            temp = current.rest();
                            current = current.first();
                            property = NIL;
                            cb_default = NIL;
                            destructuring_bind_must_consp(current, datum, $list391);
                            property = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list391);
                            cb_default = current.first();
                            current = current.rest();
                            entry_spec = (current.isCons()) ? current.first() : NIL;
                            destructuring_bind_must_listp(current, datum, $list391);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                remaining_cb_properties = cb_properties = current;
                                if (NIL != cb_inference_mode_property_p(property)) {
                                    cb_default = cb_default_property_value(property, cb_default, query_properties);
                                }
                                value = cb_query_property_value_from_properties_or_focal_inference(query_properties, focal_inference, property, cb_default, show_input_valuesP);
                                if (!i.isZero()) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    _prev_bind_0_$26 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent(FOUR_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$26, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                }
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                _prev_bind_0_$27 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    cb_query_show_inference_parameter(property, value, cb_default, allow_editP, entry_spec);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$27, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } else {
                                cdestructuring_bind_error(datum, $list391);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$25, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } 
                final SubLObject missing_count = subtract(group_size, length(cb_properties));
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$28 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    SubLObject cdolist_list_var = cb_properties;
                    SubLObject cb_property_spec = NIL;
                    cb_property_spec = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = cb_property_spec;
                        SubLObject property2 = NIL;
                        SubLObject cb_default2 = NIL;
                        destructuring_bind_must_consp(current2, datum2, $list392);
                        property2 = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum2, $list392);
                        cb_default2 = current2.first();
                        current2 = current2.rest();
                        final SubLObject entry_spec2 = (current2.isCons()) ? current2.first() : NIL;
                        destructuring_bind_must_listp(current2, datum2, $list392);
                        current2 = current2.rest();
                        if (NIL == current2) {
                            if (NIL != cb_inference_mode_property_p(property2)) {
                                cb_default2 = cb_default_property_value(property2, cb_default2, query_properties);
                            }
                            final SubLObject value = cb_query_property_value_from_properties_or_focal_inference(query_properties, focal_inference, property2, cb_default2, show_input_valuesP);
                            if (!cb_property_spec.eql(cb_properties.first())) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$29 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_indent(FOUR_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$29, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            }
                            html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($LEFT));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_align($TOP));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$30 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                cb_query_show_inference_parameter(property2, value, cb_default2, allow_editP, entry_spec2);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$30, thread);
                            }
                            html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        } else {
                            cdestructuring_bind_error(datum2, $list392);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        cb_property_spec = cdolist_list_var.first();
                    } 
                    if (!missing_count.isZero()) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        if (NIL != missing_count) {
                            html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(missing_count);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$31 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_indent(TWO_INTEGER);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$31, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$28, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_query_property_for_inference_mode(final SubLObject property, final SubLObject mode, final SubLObject cb_default) {
        final SubLObject mode_value = inference_parameters.query_property_for_inference_mode(mode, property, $NO_MODE_VALUE_SPECIFIED);
        if (mode_value == $NO_MODE_VALUE_SPECIFIED) {
            return cb_default;
        }
        return possibly_scale_value_for_output(mode_value, property);
    }

    public static SubLObject cb_default_property_value(final SubLObject property, final SubLObject cb_default, final SubLObject v_properties) {
        final SubLObject mode = (v_properties.isList()) ? getf(v_properties, $INFERENCE_MODE, cb_default_inference_mode()) : cb_default_inference_mode();
        return cb_query_property_for_inference_mode(property, mode, cb_default);
    }

    public static SubLObject cb_query_property_value_from_properties_or_focal_inference(final SubLObject query_properties, final SubLObject focal_inference, final SubLObject property, final SubLObject cb_default, final SubLObject show_input_valuesP) {
        SubLObject value = cb_query_property_value_from_properties_or_focal_inference_int(query_properties, focal_inference, property, cb_default, show_input_valuesP);
        if ((property == $PROBABLY_APPROXIMATELY_DONE) && (NIL == inference_datastructures_inference.pad_table_initializedP())) {
            value = $int$100;
        }
        return value;
    }

    public static SubLObject cb_query_property_value_from_properties_or_focal_inference_int(final SubLObject query_properties, final SubLObject focal_inference, final SubLObject property, final SubLObject cb_default, final SubLObject show_input_valuesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($UNSPECIFIED != query_properties) {
            final SubLObject value = getf(query_properties, property, $UNSPECIFIED);
            if ($UNSPECIFIED == value) {
                return cb_default;
            }
            return possibly_scale_value_for_output(value, property);
        } else {
            if (NIL != focal_inference) {
                final SubLObject v_default = possibly_scale_value_on_input(cb_default, property);
                final SubLObject value2 = (NIL != show_input_valuesP) ? inference_utilities.inference_input_property_lookup(focal_inference, property, v_default) : inference_utilities.inference_property_lookup(focal_inference, property, v_default);
                return possibly_scale_value_for_output(value2, property);
            }
            if (NIL != $cb_default_query_parameters$.getDynamicValue(thread)) {
                return get_saved_inference_parameter_default(property, cb_default);
            }
            return cb_default;
        }
    }

    public static SubLObject cb_query_show_inference_parameter(final SubLObject property, final SubLObject value, final SubLObject cb_default, final SubLObject allow_editP, final SubLObject entry_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_parameter_p(property)) {
            html_markup(html_macros.$html_teletype_head$.getGlobalValue());
            html_prin1(property);
            html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        } else {
            final SubLObject fancy_name = inference_parameter_fancy_name(property);
            final SubLObject description = inference_parameter_description(property);
            final SubLObject settings = inference_parameter_settings(property);
            if (NIL == list_utilities.equalE(value, cb_default)) {
                html_markup(html_macros.$html_big_head$.getGlobalValue());
                html_markup(html_macros.$html_teletype_head$.getGlobalValue());
                html_markup(html_macros.$html_span_head$.getGlobalValue());
                html_markup(html_macros.$html_span_style$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_style_background_color($YELLOW);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_princ_strong_with_explanation($str395$_, $str396$This_parameter_has_been_modified_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
                html_markup(html_macros.$html_span_tail$.getGlobalValue());
                html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
                html_markup(html_macros.$html_big_tail$.getGlobalValue());
                html_indent(UNPROVIDED);
            }
            if (NIL == string_utilities.empty_stringP(description)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                html_princ_with_explanation(fancy_name, description, fancy_name, UNPROVIDED, UNPROVIDED);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            } else {
                html_princ_strong(fancy_name);
            }
            cb_query_show_inference_parameter_settings(property, value, allow_editP, settings, entry_spec);
        }
        return NIL;
    }

    public static SubLObject cb_query_show_inference_parameter_settings(final SubLObject property, final SubLObject value, final SubLObject allow_editP, final SubLObject settings, final SubLObject entry_spec) {
        final SubLObject radio_name = html_control_parameter_radio_name(property);
        final SubLObject entry_name = html_control_parameter_entry_name(property);
        final SubLObject some_entryP = find($ENTRY, settings, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
        final SubLObject total_settings = length(settings);
        SubLObject list_var = NIL;
        SubLObject setting = NIL;
        SubLObject setting_number = NIL;
        list_var = settings;
        setting = list_var.first();
        for (setting_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , setting = list_var.first() , setting_number = add(ONE_INTEGER, setting_number)) {
            if (($INFERENCE_MODE != property) || (!$inference_mode_custom_value_number$.getGlobalValue().eql(setting_number))) {
                cb_query_show_inference_parameter_setting(property, value, allow_editP, setting, setting_number, total_settings, radio_name, some_entryP, entry_name, entry_spec);
            }
        }
        return NIL;
    }

    public static SubLObject cb_default_inference_mode() {
        return list_utilities.only_one(list_utilities.alist_lookup($cb_basic_inference_resource_constraints$.getGlobalValue(), $INFERENCE_MODE, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject cb_query_show_inference_parameter_setting(final SubLObject property, final SubLObject value, final SubLObject allow_editP, final SubLObject setting, final SubLObject setting_number, final SubLObject total_settings, final SubLObject radio_name, final SubLObject some_entryP, final SubLObject entry_name, final SubLObject entry_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_settingP = inference_parameter_value_matches_setting(property, value, setting);
        SubLObject input_id = NIL;
        if ((NIL != allow_editP) || (NIL != current_settingP)) {
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
            SubLObject method = NIL;
            SubLObject data = NIL;
            SubLObject explanation = NIL;
            destructuring_bind_must_consp(setting, setting, $list43);
            method = setting.first();
            SubLObject current = setting.rest();
            destructuring_bind_must_consp(current, setting, $list43);
            data = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, setting, $list43);
            explanation = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != allow_editP) {
                    final SubLObject encoded_radio_name = get_encoded_form_field_name(radio_name);
                    input_id = cconcatenate(format_nil.format_nil_a_no_copy(encoded_radio_name), new SubLObject[]{ $str1$_, format_nil.format_nil_a_no_copy(setting_number) });
                    if (ONE_INTEGER.numE(total_settings)) {
                        html_hidden_input(encoded_radio_name, setting_number, UNPROVIDED);
                    } else
                        if (property == $INFERENCE_MODE) {
                            cb_set_all_inference_mode_parameters_to_cb_default_radio_input(encoded_radio_name, input_id, setting_number, current_settingP);
                        } else
                            if (NIL != cb_inference_mode_property_p(property)) {
                                if (NIL != some_entryP) {
                                    if ($ENTRY == method) {
                                        cb_focus_and_set_inference_mode_radio_to_custom_radio_input(encoded_radio_name, input_id, entry_name, setting_number, current_settingP);
                                    } else {
                                        cb_clear_and_set_inference_mode_radio_to_custom_radio_input(encoded_radio_name, input_id, entry_name, setting_number, current_settingP);
                                    }
                                } else {
                                    cb_set_inference_mode_radio_to_custom_radio_input(encoded_radio_name, input_id, setting_number, current_settingP);
                                }
                            } else
                                if (NIL != some_entryP) {
                                    if ($ENTRY == method) {
                                        html_script_utilities.html_focus_radio_input(encoded_radio_name, entry_name, setting_number, current_settingP, input_id);
                                    } else {
                                        html_script_utilities.html_clear_radio_input(encoded_radio_name, entry_name, setting_number, current_settingP, input_id);
                                    }
                                } else {
                                    html_radio_input(encoded_radio_name, setting_number, current_settingP, input_id);
                                }



                }
                if ($ENTRY == method) {
                    html_indent(UNPROVIDED);
                    final SubLObject entry_default = (NIL != current_settingP) ? prin1_to_string(value) : NIL;
                    if (NIL != allow_editP) {
                        SubLObject current_$33;
                        final SubLObject datum_$32 = current_$33 = (NIL != entry_spec) ? entry_spec : $list397;
                        SubLObject type = NIL;
                        SubLObject size = NIL;
                        destructuring_bind_must_consp(current_$33, datum_$32, $list398);
                        type = current_$33.first();
                        current_$33 = current_$33.rest();
                        destructuring_bind_must_consp(current_$33, datum_$32, $list398);
                        size = current_$33.first();
                        current_$33 = current_$33.rest();
                        if (NIL == current_$33) {
                            final SubLObject pcase_var = type;
                            if (pcase_var.eql($TEXT)) {
                                html_text_input(entry_name, entry_default, size);
                            } else {
                                html_text_input(entry_name, entry_default, UNPROVIDED);
                            }
                        } else {
                            cdestructuring_bind_error(datum_$32, $list398);
                        }
                    } else {
                        html_princ(entry_default);
                    }
                }
                html_indent(UNPROVIDED);
                final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(makeBoolean(property != $INFERENCE_MODE), thread);
                    html_markup(html_macros.$html_label_head$.getGlobalValue());
                    if (NIL != input_id) {
                        html_markup(html_macros.$html_label_for$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(input_id));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$34 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(explanation);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$34, thread);
                    }
                    html_markup(html_macros.$html_label_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                }
            } else {
                cdestructuring_bind_error(setting, $list43);
            }
            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_set_radio_buttons_script(final SubLObject alist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_js_on_click_preamble$.getGlobalValue());
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject radio_field_name = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list404);
            radio_field_name = current.first();
            current = value = current.rest();
            if (value.isCons()) {
                SubLObject current_$36;
                final SubLObject datum_$35 = current_$36 = value;
                SubLObject radio_value = NIL;
                SubLObject entry_field_name = NIL;
                SubLObject entry_value = NIL;
                destructuring_bind_must_consp(current_$36, datum_$35, $list405);
                radio_value = current_$36.first();
                current_$36 = current_$36.rest();
                destructuring_bind_must_consp(current_$36, datum_$35, $list405);
                entry_field_name = current_$36.first();
                current_$36 = current_$36.rest();
                destructuring_bind_must_consp(current_$36, datum_$35, $list405);
                entry_value = current_$36.first();
                current_$36 = current_$36.rest();
                if (NIL == current_$36) {
                    format(html_macros.$html_stream$.getDynamicValue(thread), $cb_set_all_radio_buttons_body$.getGlobalValue(), radio_field_name, radio_value);
                    format(html_macros.$html_stream$.getDynamicValue(thread), $cb_set_field_value_body$.getGlobalValue(), entry_field_name, entry_value);
                } else {
                    cdestructuring_bind_error(datum_$35, $list405);
                }
            } else {
                format(html_macros.$html_stream$.getDynamicValue(thread), $cb_set_all_radio_buttons_body$.getGlobalValue(), radio_field_name, value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        format(html_macros.$html_stream$.getDynamicValue(thread), $html_js_on_click_postamble$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_set_radio_button_script(final SubLObject field_name, final SubLObject value) {
        return cb_set_radio_buttons_script(list_utilities.alist_enter(NIL, field_name, value, UNPROVIDED));
    }

    public static SubLObject inference_setting_number_for_parameter_value(final SubLObject parameter, final SubLObject value) {
        SubLObject list_var = NIL;
        SubLObject setting = NIL;
        SubLObject setting_number = NIL;
        list_var = inference_parameter_settings(parameter);
        setting = list_var.first();
        for (setting_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , setting = list_var.first() , setting_number = add(ONE_INTEGER, setting_number)) {
            if (NIL != inference_parameter_value_matches_setting(parameter, value, setting)) {
                return setting_number;
            }
        }
        return Errors.error($str406$No_setting_for__s_matched_the_val, parameter, value);
    }

    public static SubLObject cb_set_all_inference_mode_properties_to_defaults_script(final SubLObject inference_mode) {
        SubLObject alist = NIL;
        SubLObject cdolist_list_var = $cb_inference_mode_properties$.getGlobalValue();
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject radio_field_name = get_one_radio_field_name_regexp(property);
            final SubLObject mode_default = cb_query_property_for_inference_mode(property, inference_mode, $DEFAULT_UNSPECIFIED);
            final SubLObject setting_number = inference_setting_number_for_parameter_value(property, mode_default);
            final SubLObject settings = inference_parameter_settings(property);
            final SubLObject setting = nth(setting_number, settings);
            final SubLObject pcase_var;
            final SubLObject setting_type = pcase_var = setting.first();
            if (pcase_var.eql($VALUE)) {
                final SubLObject some_entryP = find($ENTRY, settings, symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
                if (NIL != some_entryP) {
                    final SubLObject entry_field_name = html_control_parameter_entry_name(property);
                    alist = list_utilities.alist_enter(alist, radio_field_name, list(setting_number, entry_field_name, $str6$), UNPROVIDED);
                } else {
                    alist = list_utilities.alist_enter(alist, radio_field_name, setting_number, UNPROVIDED);
                }
            } else
                if (pcase_var.eql($ENTRY)) {
                    final SubLObject entry_field_name2 = html_control_parameter_entry_name(property);
                    alist = list_utilities.alist_enter(alist, radio_field_name, list(setting_number, entry_field_name2, mode_default), UNPROVIDED);
                } else {
                    Errors.error($str408$Unexpected_inference_parameter_se, setting_type);
                }

            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        cb_set_radio_buttons_script(alist);
        return NIL;
    }

    public static SubLObject cb_set_all_inference_mode_parameters_to_cb_default_radio_input(final SubLObject encoded_radio_name, final SubLObject id, final SubLObject setting_number, final SubLObject current_settingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_mode = second(nth(setting_number, inference_parameter_settings($INFERENCE_MODE)));
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != encoded_radio_name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(encoded_radio_name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != setting_number) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(setting_number);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != current_settingP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        html_char(CHAR_space, UNPROVIDED);
        cb_set_all_inference_mode_properties_to_defaults_script(inference_mode);
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject get_big_radio_field_name_regexp() {
        SubLObject string = get_one_radio_field_name_regexp($cb_inference_mode_properties$.getGlobalValue().first());
        SubLObject cdolist_list_var = $cb_inference_mode_properties$.getGlobalValue().rest();
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            string = cconcatenate(string, new SubLObject[]{ $str409$_, get_one_radio_field_name_regexp(property) });
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        return string;
    }

    public static SubLObject get_one_radio_field_name_regexp(final SubLObject property) {
        return string_utilities.string_substitute($str410$_, $str411$_, get_encoded_form_field_name(html_control_parameter_radio_name(property)), UNPROVIDED);
    }

    public static SubLObject get_one_entry_field_name_regexp(final SubLObject property) {
        return string_utilities.string_substitute($str410$_, $str411$_, get_encoded_form_field_name(html_control_parameter_entry_name(property)), UNPROVIDED);
    }

    public static SubLObject cb_set_inference_mode_radio_to_custom_radio_input(final SubLObject encoded_radio_name, final SubLObject id, final SubLObject setting_number, final SubLObject current_settingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_mode_field_name = get_one_radio_field_name_regexp($INFERENCE_MODE);
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != encoded_radio_name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(encoded_radio_name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != setting_number) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(setting_number);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != current_settingP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        html_char(CHAR_space, UNPROVIDED);
        cb_set_radio_button_script(inference_mode_field_name, $inference_mode_custom_value_number$.getGlobalValue());
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_clear_and_set_inference_mode_radio_to_custom_radio_input(final SubLObject encoded_radio_name, final SubLObject id, final SubLObject entry_name, final SubLObject setting_number, final SubLObject current_settingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_mode_field_name = get_one_radio_field_name_regexp($INFERENCE_MODE);
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != encoded_radio_name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(encoded_radio_name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != setting_number) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(setting_number);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != current_settingP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        html_char(CHAR_space, UNPROVIDED);
        cb_set_radio_button_script(inference_mode_field_name, list($inference_mode_custom_value_number$.getGlobalValue(), entry_name, $str6$));
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_focus_and_set_inference_mode_radio_to_custom_radio_input(final SubLObject encoded_radio_name, final SubLObject id, final SubLObject entry_name, final SubLObject setting_number, final SubLObject current_settingP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_mode_field_name = get_one_radio_field_name_regexp($INFERENCE_MODE);
        html_markup(html_macros.$html_input_head$.getGlobalValue());
        html_markup(html_macros.$html_input_type$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_input_radio$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != id) {
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(id);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != encoded_radio_name) {
            html_markup(html_macros.$html_input_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(encoded_radio_name);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != setting_number) {
            html_markup(html_macros.$html_input_value$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_princ(setting_number);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        if (NIL != current_settingP) {
            html_simple_attribute(html_macros.$html_input_checked$.getGlobalValue());
        }
        html_char(CHAR_space, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $cb_focus_and_set_all_radio_buttons_script$.getGlobalValue(), new SubLObject[]{ entry_name, inference_mode_field_name, $inference_mode_custom_value_number$.getGlobalValue() });
        if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
            html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
        }
        html_char(CHAR_greater, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_query_proof_checker_section_relevantP(final SubLObject focal_inference, final SubLObject v_properties) {
        return makeBoolean((NIL != cb_assertion_editor.cb_proof_checker_rules()) || ((((NIL != focal_inference) && ((NIL != inference_datastructures_inference.inference_allowed_rules_list(focal_inference)) || (NIL != inference_datastructures_inference.inference_forbidden_rules_list(focal_inference)))) && ($UNSPECIFIED != v_properties)) && (inference_datastructures_enumerated_types.inference_query_property_lookup(v_properties, $ALLOWED_RULES).isList() || inference_datastructures_enumerated_types.inference_query_property_lookup(v_properties, $FORBIDDEN_RULES).isList())));
    }

    public static SubLObject cb_extract_specified_proof_checker_rules(final SubLObject focal_inference, final SubLObject v_properties) {
        SubLObject focal_allowed_rules = $UNSPECIFIED;
        SubLObject focal_forbidden_rules = $UNSPECIFIED;
        SubLObject specified_allowed_rules = $UNSPECIFIED;
        SubLObject specified_forbidden_rules = $UNSPECIFIED;
        if (NIL != focal_inference) {
            focal_allowed_rules = inference_datastructures_inference.inference_allowed_rules_list(focal_inference);
            focal_forbidden_rules = inference_datastructures_inference.inference_forbidden_rules_list(focal_inference);
        }
        if ($UNSPECIFIED != v_properties) {
            specified_allowed_rules = inference_datastructures_enumerated_types.inference_query_property_lookup(v_properties, $ALLOWED_RULES);
            specified_forbidden_rules = inference_datastructures_enumerated_types.inference_query_property_lookup(v_properties, $FORBIDDEN_RULES);
        }
        cb_possibly_add_rules_to_proof_checker(focal_allowed_rules);
        cb_possibly_add_rules_to_proof_checker(focal_forbidden_rules);
        cb_possibly_add_rules_to_proof_checker(specified_allowed_rules);
        cb_possibly_add_rules_to_proof_checker(specified_forbidden_rules);
        final SubLObject proof_checker_rules = cb_assertion_editor.cb_proof_checker_rules();
        SubLObject allowed_rules = $ALL;
        SubLObject forbidden_rules = $NONE;
        if ($UNSPECIFIED != v_properties) {
            allowed_rules = specified_allowed_rules;
            forbidden_rules = specified_forbidden_rules;
        } else
            if (NIL != focal_inference) {
                allowed_rules = focal_allowed_rules;
                forbidden_rules = focal_forbidden_rules;
            }

        return values(proof_checker_rules, allowed_rules, forbidden_rules);
    }

    public static SubLObject cb_possibly_add_rules_to_proof_checker(final SubLObject rules) {
        if (rules.isList()) {
            SubLObject cdolist_list_var = rules;
            SubLObject rule = NIL;
            rule = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cb_assertion_editor.cb_add_to_proof_checker_rules(rule);
                cdolist_list_var = cdolist_list_var.rest();
                rule = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject cb_query_proof_checker_setup_section(final SubLObject focal_inference, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject proof_checker_rules = cb_extract_specified_proof_checker_rules(focal_inference, v_properties);
        final SubLObject allowed_rules = thread.secondMultipleValue();
        final SubLObject forbidden_rules = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        html_target_definition($str256$proof_checker_section);
        dhtml_macros.dhtml_switch_visibility_links($str417$proof_checker, $$$Show, $$$Hide);
        final SubLObject size_val = FOUR_INTEGER;
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != size_val) {
            html_markup(html_macros.$html_font_size$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(size_val);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_princ_strong_with_explanation($$$Proof_Checker_Setup, $str419$Specify_an_exact_set_of_rules_all, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        final SubLObject initial_visibility = (NIL != proof_checker_rules) ? $VISIBLE : $INVISIBLE;
        dhtml_macros.dhtml_set_switched_visibility($str417$proof_checker, initial_visibility, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str417$proof_checker);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ONE_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$37 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$38 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str421$_FFDFDF);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$39 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_princ_strong_with_explanation($$$Forbidden, $str423$Forbid_the_use_of_this_rule_in_in, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        html_script_utilities.html_anchor_set_radio_buttons_to_value($str424$_Forbid_All_, $str425$this_document_forms_0_, $str426$_rule___, $$$forbidden);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$39, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str428$_FFFFDF);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$40 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_princ_strong_with_explanation($$$Unused, $str430$Neither_forbid_nor_allow__treat_l, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        html_script_utilities.html_anchor_set_radio_buttons_to_value($str431$_Unuse_All_, $str425$this_document_forms_0_, $str426$_rule___, $$$unused);
                        html_newline(UNPROVIDED);
                        cb_link($QUERY_PROOF_CHECKER_DROP_ALL, $str434$_Drop_All_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$40, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str435$_DFFFDF);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$41 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_princ_strong_with_explanation($$$Allowed, $str437$Allow_the_use_of_this_rule_in_inf, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_newline(UNPROVIDED);
                        html_script_utilities.html_anchor_set_radio_buttons_to_value($str438$_Allow_All_, $str425$this_document_forms_0_, $str426$_rule___, $$$allowed);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$41, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str440$_FFFFFF);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$42 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Proof_Checker_Rules);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$42, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$38, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                SubLObject list_var = NIL;
                SubLObject proof_checker_rule = NIL;
                SubLObject rule_number = NIL;
                list_var = proof_checker_rules;
                proof_checker_rule = list_var.first();
                for (rule_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , proof_checker_rule = list_var.first() , rule_number = add(ONE_INTEGER, rule_number)) {
                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$43 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        final SubLObject rule_status = cb_proof_checker_rule_status(proof_checker_rule, allowed_rules, forbidden_rules);
                        final SubLObject radio_name = cb_query_proof_checker_input_name(rule_number);
                        final SubLObject encoded_radio_name = get_encoded_form_field_name(radio_name);
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str421$_FFDFDF);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$44 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_radio_input(encoded_radio_name, $$$forbidden, eq(rule_status, $FORBIDDEN), UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$44, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str428$_FFFFDF);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$45 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_radio_input(encoded_radio_name, $$$unused, eq(rule_status, $UNUSED), UNPROVIDED);
                            html_newline(UNPROVIDED);
                            cb_link($QUERY_PROOF_CHECKER_DROP, proof_checker_rule, $str445$_Drop_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$45, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str435$_DFFFDF);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$46 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_radio_input(encoded_radio_name, $$$allowed, eq(rule_status, $ALLOWED), UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$46, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($TOP));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str440$_FFFFFF);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$47 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_show_assertion_readably(proof_checker_rule, T, T);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$47, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$43, thread);
                    }
                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$37, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_query_proof_checker_input_name(final SubLObject rule_number) {
        return cconcatenate($str447$rule_, format_nil.format_nil_a_no_copy(rule_number));
    }

    public static SubLObject cb_proof_checker_rule_status(final SubLObject proof_checker_rule, final SubLObject allowed_rules, final SubLObject forbidden_rules) {
        if ($ALL == allowed_rules) {
            if ($NONE == forbidden_rules) {
                return $UNUSED;
            }
            if (NIL != subl_promotions.memberP(proof_checker_rule, forbidden_rules, UNPROVIDED, UNPROVIDED)) {
                return $FORBIDDEN;
            }
            return $UNUSED;
        } else {
            if (NIL != subl_promotions.memberP(proof_checker_rule, allowed_rules, UNPROVIDED, UNPROVIDED)) {
                return $ALLOWED;
            }
            return $UNUSED;
        }
    }

    public static SubLObject cb_query_extract_proof_checker_parameters(final SubLObject args) {
        final SubLObject proof_checker_rules = cb_assertion_editor.cb_proof_checker_rules();
        SubLObject forbidden_rules = NIL;
        SubLObject unused_rules = NIL;
        SubLObject allowed_rules = NIL;
        SubLObject list_var = NIL;
        SubLObject proof_checker_rule = NIL;
        SubLObject rule_number = NIL;
        list_var = proof_checker_rules;
        proof_checker_rule = list_var.first();
        for (rule_number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , proof_checker_rule = list_var.first() , rule_number = add(ONE_INTEGER, rule_number)) {
            final SubLObject input_name = cb_query_proof_checker_input_name(rule_number);
            final SubLObject rule_choice = extract_encoded_form_field_value(input_name, args);
            if (rule_choice.equal($$$forbidden)) {
                forbidden_rules = cons(proof_checker_rule, forbidden_rules);
            } else
                if (rule_choice.equal($$$allowed)) {
                    allowed_rules = cons(proof_checker_rule, allowed_rules);
                } else {
                    unused_rules = cons(proof_checker_rule, unused_rules);
                }

        }
        forbidden_rules = nreverse(forbidden_rules);
        allowed_rules = nreverse(allowed_rules);
        if (NIL != allowed_rules) {
            return values(allowed_rules, $NONE);
        }
        if (NIL != forbidden_rules) {
            return values($ALL, forbidden_rules);
        }
        return values($ALL, $NONE);
    }

    public static SubLObject cb_show_problem_store_properties(final SubLObject store) {
        html_target_definition($str253$parameters_section);
        cb_princ_strong_with_explanation($$$Problem_Store_Static_Properties, $str448$Properties_which_must_remain_cons, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(TWO_INTEGER);
        final SubLObject v_properties = inference_datastructures_problem_store.problem_store_static_properties(store);
        cb_query_show_inference_properties($cb_advanced_problem_store_static_properties$.getGlobalValue(), NIL, NIL, NIL, v_properties, TWO_INTEGER, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_princ_strong($$$Other_Problem_Store_Properties);
        html_newline(UNPROVIDED);
        html_newline(UNPROVIDED);
        html_princ_strong($str450$Destruction_Imminent__);
        cb_show_boolean(inference_datastructures_problem_store.problem_store_destruction_imminentP(store));
        html_newline(UNPROVIDED);
        html_princ_strong($str451$Memoization_state___);
        cb_link($PROBLEM_STORE_MEMOIZATION_STATE, store, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        html_princ_strong($str453$Janitor___);
        cb_link($PROBLEM_STORE_JANITOR, store, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        if (NIL != inference_datastructures_problem_store.problem_store_could_recompute_destructiblesP(store)) {
            cb_link($RECOMPUTE_DESTRUCTIBLES, store, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != inference_datastructures_problem_store.problem_store_could_remove_destructiblesP(store)) {
            cb_link($REMOVE_DESTRUCTIBLES, store, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_query_proof_checker_drop(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL == assertion_handles.assertion_p(assertion)) {
            return cb_error($str457$_a_does_not_specify_an_assertion, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == assertions_high.rule_assertionP(assertion)) {
            return cb_error($str458$Assertion_specified_was_not_a_rul, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_assertion_editor.cb_delete_from_proof_checker_rules(assertion);
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_query_proof_checker_drop(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str445$_Drop_;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str462$No_longer_consider_this_rule_as_b.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str462$No_longer_consider_this_rule_as_b, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str463$cb_query_proof_checker_drop__A, assertion_handles.assertion_id(assertion));
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return assertion;
    }

    public static SubLObject cb_query_proof_checker_drop_all(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        cb_assertion_editor.cb_delete_all_proof_checker_rules();
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_query_proof_checker_drop_all(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str434$_Drop_All_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str466$No_longer_consider_any_of_these_r.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str466$No_longer_consider_any_of_these_r, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            html_princ($str467$cb_query_proof_checker_drop_all);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_handle_query(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference_method = cb_query_extract_inference_method(args);
        SubLObject v_inference_parameters = NIL;
        SubLObject parameter_error = NIL;
        final SubLObject pcase_var = inference_method;
        if (pcase_var.eql($CONTINUE) || pcase_var.eql($FOLLOWUP)) {
            thread.resetMultipleValues();
            final SubLObject v_inference_parameters_$48 = cb_query_extract_parameters(args, T, UNPROVIDED);
            final SubLObject parameter_error_$49 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            v_inference_parameters = v_inference_parameters_$48;
            parameter_error = parameter_error_$49;
        } else
            if (pcase_var.eql($NEW) || pcase_var.eql($SAVE_PARAMETERS)) {
                thread.resetMultipleValues();
                final SubLObject v_inference_parameters_$49 = cb_query_extract_parameters(args, NIL, UNPROVIDED);
                final SubLObject parameter_error_$50 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                v_inference_parameters = v_inference_parameters_$49;
                parameter_error = parameter_error_$50;
            } else
                if (pcase_var.eql($LOAD_PARAMETERS)) {
                    if (NIL != $cb_default_query_parameters$.getDynamicValue(thread)) {
                        v_inference_parameters = $cb_default_query_parameters$.getDynamicValue(thread);
                    } else {
                        v_inference_parameters = $UNSPECIFIED;
                    }
                } else
                    if (pcase_var.eql($RESET_PARAMETERS)) {
                        thread.resetMultipleValues();
                        final SubLObject v_inference_parameters_$50 = cb_query_extract_parameters(args, NIL, T);
                        final SubLObject parameter_error_$51 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        v_inference_parameters = v_inference_parameters_$50;
                        parameter_error = parameter_error_$51;
                    } else {
                        if (!pcase_var.eql($STRENGTHEN_PARAMETERS)) {
                            return cb_error($str476$Unknown_inference_method__how_did, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        thread.resetMultipleValues();
                        final SubLObject v_inference_parameters_$51 = cb_query_extract_parameters(args, NIL, T);
                        final SubLObject parameter_error_$52 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        v_inference_parameters = v_inference_parameters_$51;
                        parameter_error = parameter_error_$52;
                    }



        if (NIL != parameter_error) {
            return cb_error($str477$_A, parameter_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ($CONTINUE == inference_method) {
            final SubLObject inference = cb_query_extract_inference(args);
            if (NIL == inference_datastructures_inference.continuable_inference_p(inference)) {
                return cb_error($str478$That_inference_is_no_longer_conti, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            cb_query_continue(inference, v_inference_parameters);
            return cb_query_internal(UNPROVIDED);
        } else {
            if ($SAVE_PARAMETERS == inference_method) {
                cb_save_inference_parameter_defaults(v_inference_parameters);
                return cb_query_internal(list($PROPERTIES, v_inference_parameters));
            }
            if ($LOAD_PARAMETERS == inference_method) {
                return cb_query_internal(list($PROPERTIES, v_inference_parameters));
            }
            if ($RESET_PARAMETERS == inference_method) {
                return cb_query_internal($list479);
            }
            thread.resetMultipleValues();
            SubLObject mt = cb_form_widgets.cb_extract_mt_input(args, UNPROVIDED, UNPROVIDED);
            final SubLObject mt_error = thread.secondMultipleValue();
            final SubLObject mt_error_string = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != mt_error) {
                return cb_form_widgets.cb_mt_error(mt_error, mt_error_string);
            }
            thread.resetMultipleValues();
            SubLObject sentence = cb_extract_query_sentence_input(args, $list480);
            final SubLObject sentence_error = thread.secondMultipleValue();
            final SubLObject sentence_error_string = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != sentence_error) {
                return cb_form_widgets.cb_el_sentence_error(sentence_error, sentence_error_string, $list481);
            }
            thread.resetMultipleValues();
            SubLObject non_explanatory_sentence = cb_extract_query_sentence_input(args, $list482);
            final SubLObject non_explanatory_sentence_error = thread.secondMultipleValue();
            final SubLObject non_explanatory_sentence_error_string = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != non_explanatory_sentence_error) {
                return cb_form_widgets.cb_el_sentence_error(non_explanatory_sentence_error, non_explanatory_sentence_error_string, $list483);
            }
            thread.resetMultipleValues();
            final SubLObject query_spec = cb_query_extract_query_or_test_spec(args);
            final SubLObject test_spec = thread.secondMultipleValue();
            final SubLObject query_or_test_spec_error = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != query_or_test_spec_error) {
                return cb_error($str477$_A, query_or_test_spec_error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            thread.resetMultipleValues();
            final SubLObject sentence_$56 = cb_query_preprocess_arguments(sentence, mt, non_explanatory_sentence, v_inference_parameters);
            final SubLObject mt_$57 = thread.secondMultipleValue();
            final SubLObject non_explanatory_sentence_$58 = thread.thirdMultipleValue();
            final SubLObject v_inference_parameters_$52 = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            sentence = sentence_$56;
            mt = mt_$57;
            non_explanatory_sentence = non_explanatory_sentence_$58;
            v_inference_parameters = v_inference_parameters_$52;
            final SubLObject pcase_var2 = inference_method;
            if (pcase_var2.eql($NEW)) {
                final SubLObject new_inference = cb_query_new(sentence, mt, non_explanatory_sentence, v_inference_parameters);
                if (NIL != query_spec) {
                    cb_kb_query.kbq_register_query_spec_of_inference(new_inference, query_spec);
                }
                if (NIL != test_spec) {
                    cb_kct_test.kct_register_test_spec_of_inference(new_inference, test_spec);
                }
                cb_note_focal_inference(new_inference);
                return cb_query_internal(UNPROVIDED);
            }
            if (pcase_var2.eql($FOLLOWUP)) {
                final SubLObject inference2 = cb_query_extract_inference(args);
                final SubLObject followup_inference = cb_query_new_followup(inference2, sentence, mt, non_explanatory_sentence, v_inference_parameters);
                cb_note_focal_inference(followup_inference);
                return cb_query_internal(UNPROVIDED);
            }
            if (pcase_var2.eql($STRENGTHEN_PARAMETERS)) {
                final SubLObject inference2 = cb_query_extract_inference(args);
                final SubLObject strengthened_parameters = inference_parameters.inference_compute_all_answers_query_properties(inference2);
                return cb_parameter_strengthened_query(sentence, mt, strengthened_parameters, non_explanatory_sentence);
            }
            return cb_error($str476$Unknown_inference_method__how_did, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject cb_extract_query_sentence_input(final SubLObject args, SubLObject input_options) {
        if (input_options == UNPROVIDED) {
            input_options = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject sentence = cb_form_widgets.cb_extract_el_sentence_input(args, input_options);
        final SubLObject sentence_error = thread.secondMultipleValue();
        final SubLObject input_string = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL == sentence_error) {
        }
        return values(sentence, sentence_error, input_string);
    }

    public static SubLObject cb_query_preprocess_arguments(SubLObject sentence, final SubLObject mt, final SubLObject non_explanatory_sentence, SubLObject v_inference_parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $cb_perform_argumentation_for_closed_queryP$.getDynamicValue(thread)) && (NIL != closedP(sentence, UNPROVIDED))) {
            v_inference_parameters = putf(v_inference_parameters, $kw158$TRANSFORMATION_ALLOWED_, T);
            SubLObject max_transformation_depth = inference_datastructures_enumerated_types.inference_properties_max_transformation_depth(v_inference_parameters);
            max_transformation_depth = add(max_transformation_depth, ONE_INTEGER);
            v_inference_parameters = putf(v_inference_parameters, $MAX_TRANSFORMATION_DEPTH, max_transformation_depth);
            final SubLObject el_var = czer_utilities.unique_el_var_wrt_expression(sentence, $sym485$_TRUTH);
            sentence = list($$sentenceTruth, sentence, el_var);
        }
        return values(sentence, mt, non_explanatory_sentence, v_inference_parameters);
    }

    public static SubLObject cb_query_extract_inference_method(final SubLObject args) {
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($$$continue, args))) {
            return $CONTINUE;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($$$new, args))) {
            return $NEW;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($$$followup, args))) {
            return $FOLLOWUP;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str361$save_parameters, args))) {
            return $SAVE_PARAMETERS;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str364$load_parameters, args))) {
            return $LOAD_PARAMETERS;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str367$reset_parameters, args))) {
            return $RESET_PARAMETERS;
        }
        if (NIL != list_utilities.sublisp_boolean(html_extract_input($str370$strengthen_parameters, args))) {
            return $STRENGTHEN_PARAMETERS;
        }
        return $UNKNOWN;
    }

    public static SubLObject cb_query_extract_inference(final SubLObject args) {
        final SubLObject store_id_string = html_extract_input($str280$focal_problem_store, args);
        final SubLObject inference_id_string = html_extract_input($str281$focal_inference, args);
        return cb_guess_inference(store_id_string, inference_id_string);
    }

    public static SubLObject cb_query_extract_parameters(final SubLObject args, final SubLObject use_focal_inferenceP, SubLObject use_query_tool_defaultP) {
        if (use_query_tool_defaultP == UNPROVIDED) {
            use_query_tool_defaultP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject v_inference_parameters = cb_query_extract_inference_parameters_from_args_or_focal_inference(args, use_focal_inferenceP, use_query_tool_defaultP);
        final SubLObject parameter_error = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != parameter_error) {
            return values(NIL, parameter_error);
        }
        thread.resetMultipleValues();
        final SubLObject allowed_rules = cb_query_extract_proof_checker_parameters(args);
        final SubLObject forbidden_rules = thread.secondMultipleValue();
        thread.resetMultipleValues();
        v_inference_parameters = putf(v_inference_parameters, $ALLOWED_RULES, allowed_rules);
        v_inference_parameters = putf(v_inference_parameters, $FORBIDDEN_RULES, forbidden_rules);
        return values(v_inference_parameters, parameter_error);
    }

    public static SubLObject cb_query_extract_inference_parameters_from_args_or_focal_inference(final SubLObject args, final SubLObject use_focal_inferenceP, final SubLObject use_query_tool_defaultP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cb_inferences();
        final SubLObject focal_inference = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list209);
        final SubLObject other_inferences;
        current = other_inferences = current.rest();
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cb_all_inference_parameters();
        SubLObject parameter = NIL;
        parameter = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject value = cb_query_extract_inference_parameter_value(parameter, args, focal_inference, use_focal_inferenceP, use_query_tool_defaultP);
            final SubLObject error_message = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != error_message) {
                return values(NIL, error_message);
            }
            result = cons(parameter, result);
            result = cons(value, result);
            cdolist_list_var = cdolist_list_var.rest();
            parameter = cdolist_list_var.first();
        } 
        return values(nreverse(result), NIL);
    }

    public static SubLObject cb_query_extract_inference_parameter_value(final SubLObject parameter, final SubLObject args, final SubLObject focal_inference, final SubLObject use_focal_inferenceP, final SubLObject use_query_tool_defaultP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_parameter_p(parameter)) {
            return values(NIL, cconcatenate(format_nil.format_nil_s_no_copy(parameter), $str488$_is_not_an_inference_parameter_));
        }
        if (NIL != use_query_tool_defaultP) {
            if (NIL != focal_inference) {
                return values(inference_utilities.inference_property_lookup(focal_inference, parameter, NIL), NIL);
            }
            final SubLObject property_spec = find(parameter, $cb_all_inference_properties$.getGlobalValue(), symbol_function(EQ), symbol_function(FIRST), UNPROVIDED, UNPROVIDED);
            if (NIL != property_spec) {
                return possibly_scale_value_on_input(second(property_spec), parameter);
            }
        }
        final SubLObject fancy_name = inference_parameter_fancy_name(parameter);
        final SubLObject settings = inference_parameter_settings(parameter);
        final SubLObject radio_name = html_control_parameter_radio_name(parameter);
        SubLObject radio_choice = NIL;
        final SubLObject _prev_bind_0 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
        try {
            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.get_form_field_code(args), thread);
            radio_choice = extract_encoded_form_field_value(radio_name, args);
        } finally {
            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_0, thread);
        }
        if (NIL != radio_choice) {
            final SubLObject setting = nth(read_from_string_ignoring_errors(radio_choice, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), settings);
            SubLObject current;
            final SubLObject datum = current = setting;
            SubLObject method = NIL;
            SubLObject datum_$60 = NIL;
            destructuring_bind_must_consp(current, datum, $list489);
            method = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list489);
            datum_$60 = current.first();
            current = current.rest();
            final SubLObject explanation = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, datum, $list489);
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = method;
                if (pcase_var.eql($VALUE)) {
                    return values(possibly_scale_value_on_input(datum_$60, parameter), NIL);
                }
                if (pcase_var.eql($ENTRY)) {
                    final SubLObject entry_name = html_control_parameter_entry_name(parameter);
                    final SubLObject entry_string = html_extract_input(entry_name, args);
                    if (NIL == entry_string) {
                        return values(NIL, cconcatenate($str490$No_value_was_entered_for__, new SubLObject[]{ format_nil.format_nil_a_no_copy(fancy_name), $str491$__ }));
                    }
                    if (NIL != funcall(datum_$60, entry_string)) {
                        return values(entry_string, NIL);
                    }
                    final SubLObject value = read_from_string_ignoring_errors(entry_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
                    if (NIL == funcall(datum_$60, value)) {
                        return values(NIL, cconcatenate($str492$The_value_entered_for__, new SubLObject[]{ format_nil.format_nil_a_no_copy(fancy_name), $str493$__was_not_valid_ }));
                    }
                    return values(possibly_scale_value_on_input(value, parameter), NIL);
                }
            } else {
                cdestructuring_bind_error(datum, $list489);
            }
            return NIL;
        }
        if (NIL != use_focal_inferenceP) {
            return values(inference_utilities.inference_property_lookup(focal_inference, parameter, NIL), NIL);
        }
        if ($INFERENCE_MODE == parameter) {
            return values(inference_datastructures_enumerated_types.$default_inference_mode$.getGlobalValue(), NIL);
        }
        return values(NIL, cconcatenate($str494$No_choice_was_made_for__, new SubLObject[]{ format_nil.format_nil_a_no_copy(fancy_name), $str491$__ }));
    }

    public static SubLObject cb_query_extract_query_or_test_spec(final SubLObject args) {
        final SubLObject query_spec_id_string = html_extract_input($str317$query_spec, args);
        final SubLObject test_spec_id_string = html_extract_input($str318$test_spec, args);
        SubLObject query_spec = NIL;
        SubLObject test_spec = NIL;
        SubLObject error = NIL;
        if (NIL != query_spec_id_string) {
            query_spec = cb_guess_term(query_spec_id_string, UNPROVIDED);
            if (NIL != query_spec) {
                if (NIL == kb_query.kbq_query_spec_p(query_spec)) {
                    error = cconcatenate($str495$The_ID__, new SubLObject[]{ format_nil.format_nil_a_no_copy(query_spec_id_string), $str496$__does_not_denote_a_CycLQuerySpec });
                }
            } else {
                error = cconcatenate($str497$The_query_spec_ID__, new SubLObject[]{ format_nil.format_nil_a_no_copy(query_spec_id_string), $str498$__does_not_denote_a_FORT_ });
            }
        }
        if (NIL != test_spec_id_string) {
            test_spec = cb_guess_term(test_spec_id_string, UNPROVIDED);
            if (NIL != test_spec) {
                if (NIL == kct_utils.kct_test_spec_p(test_spec, UNPROVIDED)) {
                    error = cconcatenate($str495$The_ID__, new SubLObject[]{ format_nil.format_nil_a_no_copy(test_spec_id_string), $str499$__does_not_denote_a_KBContentTest });
                }
            } else {
                error = cconcatenate($str500$The_test_spec_ID__, new SubLObject[]{ format_nil.format_nil_a_no_copy(test_spec_id_string), $str498$__does_not_denote_a_FORT_ });
            }
        }
        return values(query_spec, test_spec, error);
    }

    public static SubLObject cb_new_cyc_query(final SubLObject sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        query_properties = copy_list(query_properties);
        query_properties = putf(query_properties, $BROWSABLE_, T);
        thread.resetMultipleValues();
        final SubLObject answers = inference_kernel.new_cyc_query(sentence, mt, query_properties);
        final SubLObject suspend_status = thread.secondMultipleValue();
        final SubLObject inference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        cb_note_focal_inference(inference);
        cb_show_inference_with_status_and_all_answers(inference);
        return values(answers, suspend_status, inference);
    }

    public static SubLObject cb_socratic_query(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return cb_query_internal(list($TITLE, $$$Socratic_Query, $SENTENCE, sentence, $MT, mt, $PROPERTIES, v_properties));
    }

    public static SubLObject cb_similar_query(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        return cb_query_internal(list($TITLE, $$$Similar_Query, $SENTENCE, sentence, $MT, mt, $PROPERTIES, v_properties));
    }

    public static SubLObject cb_link_assertion_similar_query(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str504$_Query_Similar_;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str505$cb_assertion_similar_query__A, id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }

    public static SubLObject cb_assertion_similar_query(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL == assertion) {
            return cb_error($str508$The_assertion_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return cb_similar_query(sentence, mt, UNPROVIDED);
    }

    public static SubLObject cb_antecedent_query(final SubLObject sentence, SubLObject mt, SubLObject non_explanatory_sentence) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (non_explanatory_sentence == UNPROVIDED) {
            non_explanatory_sentence = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_properties = list(new SubLObject[]{ $MAX_TIME, NIL, $MAX_STEP, NIL, $INFERENCE_MODE, $CUSTOM, $DIRECTION, $FORWARD, $kw158$TRANSFORMATION_ALLOWED_, NIL, $kw111$ALLOW_INDETERMINATE_RESULTS_, T, $PRODUCTIVITY_LIMIT, ask_utilities.productivity_limit_from_removal_cost_cutoff($forward_inference_removal_cost_cutoff$.getDynamicValue(thread)), $RESULT_UNIQUENESS, $PROOF });
        return cb_query_internal(listS($TITLE, new SubLObject[]{ $$$Antecedent_Query, $SENTENCE, sentence, $MT, mt, $PROPERTIES, query_properties, NIL != non_explanatory_sentence ? list($NON_EXPLANATORY_SENTENCE, non_explanatory_sentence) : NIL }));
    }

    public static SubLObject cb_link_antecedent_query(final SubLObject assertion, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str514$_Antecedent_Query_;
        }
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject id = assertion_handles.assertion_id(assertion);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str515$cb_assertion_antecedent_query__A, id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return assertion;
    }

    public static SubLObject cb_assertion_antecedent_query(final SubLObject args) {
        final SubLObject assertion = cb_guess_assertion(args);
        if (NIL == assertion) {
            return cb_error($str508$The_assertion_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject sentence = assertion_utilities.assertion_antecedent_query_formula(assertion);
        final SubLObject mt = $$InferencePSC;
        final SubLObject non_explanatory_sentence = rule_pragmatic_query_formula(assertion, UNPROVIDED);
        return cb_antecedent_query(sentence, mt, non_explanatory_sentence);
    }

    public static SubLObject rule_pragmatic_query_formula(final SubLObject rule, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL == mt) {
            mt = assertions_high.assertion_mt(rule);
        }
        final SubLObject dnf = inference_worker_transformation.backward_rule_pragmatic_dnf(rule, mt);
        final SubLObject hl_query_formula = clauses.dnf_formula(dnf);
        final SubLObject hl_to_el_variable_map = assertions_high.assertion_hl_to_el_variable_map(rule);
        final SubLObject el_query_formula = bindings.apply_bindings(hl_to_el_variable_map, hl_query_formula);
        return el_query_formula;
    }

    public static SubLObject cb_known_extent_query(final SubLObject sentence, SubLObject mt, SubLObject non_explanatory_sentence) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (non_explanatory_sentence == UNPROVIDED) {
            non_explanatory_sentence = NIL;
        }
        return cb_query_internal(listS($TITLE, new SubLObject[]{ $$$Known_Extent_Query, $SENTENCE, sentence, $MT, mt, NIL != non_explanatory_sentence ? list($NON_EXPLANATORY_SENTENCE, non_explanatory_sentence) : NIL }));
    }

    public static SubLObject cb_link_rule_known_extent_query(final SubLObject rule, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str520$_Known_Extent_Query_;
        }
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        final SubLObject id = assertion_handles.assertion_id(rule);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str522$cb_rule_known_extent_query__A, id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return rule;
    }

    public static SubLObject cb_rule_known_extent_query(final SubLObject args) {
        final SubLObject rule = cb_guess_assertion(args);
        if (NIL == rule) {
            return cb_error($str525$The_rule_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject sentence = assertion_utilities.assertion_known_extent_query_formula(rule);
        final SubLObject mt = $cb_default_unspecified_query_mt$.getGlobalValue();
        final SubLObject non_explanatory_sentence = rule_pragmatic_query_formula(rule, UNPROVIDED);
        return cb_known_extent_query(sentence, mt, non_explanatory_sentence);
    }

    public static SubLObject cb_unknown_extent_query(final SubLObject sentence, SubLObject mt, SubLObject non_explanatory_sentence) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (non_explanatory_sentence == UNPROVIDED) {
            non_explanatory_sentence = NIL;
        }
        return cb_query_internal(listS($TITLE, new SubLObject[]{ $$$Unknown_Extent_Query, $SENTENCE, sentence, $MT, mt, NIL != non_explanatory_sentence ? list($NON_EXPLANATORY_SENTENCE, non_explanatory_sentence) : NIL }));
    }

    public static SubLObject cb_link_rule_unknown_extent_query(final SubLObject rule, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str528$_Unknown_Extent_Query_;
        }
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        final SubLObject id = assertion_handles.assertion_id(rule);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str529$cb_rule_unknown_extent_query__A, id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return rule;
    }

    public static SubLObject cb_rule_unknown_extent_query(final SubLObject args) {
        final SubLObject rule = cb_guess_assertion(args);
        if (NIL == rule) {
            return cb_error($str525$The_rule_is_not_available_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject sentence = assertion_utilities.assertion_unknown_extent_query_formula(rule);
        final SubLObject mt = $cb_default_unspecified_query_mt$.getGlobalValue();
        final SubLObject non_explanatory_sentence = rule_pragmatic_query_formula(rule, UNPROVIDED);
        return cb_unknown_extent_query(sentence, mt, non_explanatory_sentence);
    }

    public static SubLObject cb_kb_query(final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject query_spec, SubLObject non_explanatory_sentence) {
        if (non_explanatory_sentence == UNPROVIDED) {
            non_explanatory_sentence = $UNSPECIFIED;
        }
        return cb_query_internal(list(new SubLObject[]{ $TITLE, $$$KB_Query, $SENTENCE, sentence, $MT, mt, $PROPERTIES, v_properties, $QUERY_SPEC, query_spec, $NON_EXPLANATORY_SENTENCE, non_explanatory_sentence }));
    }

    public static SubLObject cb_parameter_strengthened_query(final SubLObject sentence, final SubLObject mt, final SubLObject strengthened_properties, SubLObject non_explanatory_sentence) {
        if (non_explanatory_sentence == UNPROVIDED) {
            non_explanatory_sentence = $UNSPECIFIED;
        }
        return cb_query_internal(list(new SubLObject[]{ $TITLE, $$$Parameter_Strengthened_Query, $SENTENCE, sentence, $MT, mt, $PROPERTIES, strengthened_properties, $NON_EXPLANATORY_SENTENCE, non_explanatory_sentence }));
    }

    public static SubLObject cb_literal_query(final SubLObject args) {
        SubLObject fort_spec = NIL;
        SubLObject arg_string = NIL;
        SubLObject pred_spec = NIL;
        destructuring_bind_must_consp(args, args, $list536);
        fort_spec = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list536);
        arg_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list536);
        pred_spec = current.first();
        current = current.rest();
        final SubLObject mt_spec = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, args, $list536);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list536);
            return NIL;
        }
        SubLObject fort = NIL;
        SubLObject arg = NIL;
        SubLObject predicate = NIL;
        SubLObject mt = NIL;
        fort = cb_guess_fort(fort_spec, UNPROVIDED);
        if (NIL == forts.fort_p(fort)) {
            return cb_error($str537$Could_not_determine_a_term_from__, fort_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        arg = read_from_string_ignoring_errors(arg_string, NIL, NIL, UNPROVIDED, UNPROVIDED);
        if (!arg.isInteger()) {
            return cb_error($str538$Could_not_determine_an_arg_from__, arg_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        predicate = cb_guess_fort(pred_spec, UNPROVIDED);
        if (NIL == forts.fort_p(predicate)) {
            return cb_error($str537$Could_not_determine_a_term_from__, pred_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == mt_spec) {
            mt = $cb_default_unspecified_query_mt$.getGlobalValue();
        } else {
            mt = cb_guess_fort(mt_spec, UNPROVIDED);
        }
        if (NIL == forts.fort_p(mt)) {
            return cb_error($str537$Could_not_determine_a_term_from__, mt_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_literal_query_internal(fort, arg, predicate, mt);
    }

    public static SubLObject cb_lq(final SubLObject args) {
        return cb_literal_query(args);
    }

    public static SubLObject cb_print_literal_query_internal(final SubLObject query_formula, final SubLObject binding_lists, final SubLObject reason, final SubLObject v_arity, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query_ist_sentence = make_ist_sentence(mt, query_formula);
        final SubLObject title_var = $$$Literal_Query;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str232$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$61 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$62 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str235$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$63 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$64 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$64, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$65 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            cb_help_preamble($CB_LITERAL_QUERY, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                            cb_link($SENTENCE_QUERY_SIMILAR, query_ist_sentence, $str552$_Query_Tool_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            cb_show_query(query_formula, mt, $$$Last_query);
                            html_newline(UNPROVIDED);
                            if ((reason != $EXHAUST) && (reason != $EXHAUST_TOTAL)) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($str556$Query_halted_because___);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                cb_query_browser.cb_show_inference_suspend_status(reason);
                                html_newline(UNPROVIDED);
                            }
                            if (NIL == binding_lists) {
                                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                html_princ($$$No_answers_were_proven);
                                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                            } else
                                if (v_arity.numE(TWO_INTEGER)) {
                                    final SubLObject count = length(binding_lists);
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    if (count.numE(ONE_INTEGER)) {
                                        html_princ($$$One_answer);
                                    } else
                                        if (count.numG(ONE_INTEGER)) {
                                            format(html_macros.$html_stream$.getDynamicValue(thread), $str559$_S_answers, count);
                                        }

                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str560$_for__S__, bindings.variable_binding_variable(binding_lists.first().first()));
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    html_newline(UNPROVIDED);
                                    SubLObject value_list = NIL;
                                    SubLObject cdolist_list_var = binding_lists;
                                    SubLObject v_bindings = NIL;
                                    v_bindings = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        final SubLObject value = bindings.variable_binding_value(v_bindings.first());
                                        value_list = cons(value, value_list);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        v_bindings = cdolist_list_var.first();
                                    } 
                                    if (NIL != $sort_literal_query_terms_by_generality_estimateP$.getDynamicValue(thread)) {
                                        value_list = cardinality_estimates.sort_by_generality_estimate(value_list, UNPROVIDED);
                                    } else {
                                        value_list = kb_utilities.sort_terms(value_list, NIL, NIL, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                    cdolist_list_var = value_list;
                                    SubLObject value2 = NIL;
                                    value2 = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        if (NIL != $cb_literal_query_results_one_per_lineP$.getDynamicValue(thread)) {
                                            cb_show_term(value2, UNPROVIDED, UNPROVIDED);
                                            html_newline(UNPROVIDED);
                                        } else {
                                            html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                            cb_show_term(value2, UNPROVIDED, UNPROVIDED);
                                            html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                            html_indent(TWO_INTEGER);
                                            html_terpri(UNPROVIDED);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        value2 = cdolist_list_var.first();
                                    } 
                                } else {
                                    html_markup(html_macros.$html_strong_head$.getGlobalValue());
                                    html_princ($str561$Substituted_Results__);
                                    html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                                    SubLObject cdolist_list_var2 = binding_lists;
                                    SubLObject v_bindings2 = NIL;
                                    v_bindings2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        final SubLObject substituted_query = sublis(v_bindings2, query_formula, UNPROVIDED, UNPROVIDED);
                                        html_newline(UNPROVIDED);
                                        cb_show_term(substituted_query, UNPROVIDED, UNPROVIDED);
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        v_bindings2 = cdolist_list_var2.first();
                                    } 
                                }

                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$65, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$63, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$62, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$61, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_literal_query_internal(final SubLObject constant, final SubLObject arg, final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_arity = arity.arity(predicate);
        if (!v_arity.isInteger()) {
            return cb_error($str562$Could_not_determine_the_arity_of_, predicate, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject query_formula = list(predicate);
        SubLObject index;
        SubLObject arg_index;
        for (index = NIL, index = ZERO_INTEGER; index.numL(v_arity); index = add(index, ONE_INTEGER)) {
            arg_index = add(index, ONE_INTEGER);
            if (arg_index.numE(arg)) {
                query_formula = cons(constant, query_formula);
            } else {
                query_formula = cons(nth(arg_index, $cb_literal_query_variables$.getGlobalValue()), query_formula);
            }
        }
        query_formula = nreverse(query_formula);
        thread.resetMultipleValues();
        final SubLObject bindings_set = cb_new_literal_query(query_formula, mt);
        final SubLObject halt_status = thread.secondMultipleValue();
        thread.resetMultipleValues();
        cb_print_literal_query_internal(query_formula, bindings_set, halt_status, v_arity, mt);
        return NIL;
    }

    public static SubLObject cb_new_literal_query(final SubLObject sentence, final SubLObject mt) {
        final SubLObject query_properties = list(new SubLObject[]{ $kw158$TRANSFORMATION_ALLOWED_, NIL, $CONTINUABLE_, NIL, $kw162$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, NIL, $RESULT_UNIQUENESS, $BINDINGS, $MAX_TIME, $cb_literal_query_time_cutoff$.getGlobalValue(), $MAX_STEP, NIL, $kw86$CACHE_INFERENCE_RESULTS_, NIL, $ANSWER_LANGUAGE, $HL, $kw111$ALLOW_INDETERMINATE_RESULTS_, T, $kw184$NEW_TERMS_ALLOWED_, NIL, $RETURN, $BINDINGS, $PRODUCTIVITY_LIMIT, $POSITIVE_INFINITY, $PROBABLY_APPROXIMATELY_DONE, $float$1_0 });
        return inference_kernel.new_cyc_query(sentence, mt, query_properties);
    }

    public static SubLObject cb_literal_query_internal_arg1_isa(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject isa_hash = make_hash_table($int$64, symbol_function(EQUAL), UNPROVIDED);
        SubLObject all_mts = NIL;
        SubLObject cdolist_list_var = isa.all_isa_in_any_mt(fort);
        SubLObject an_isa = NIL;
        an_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$66;
            final SubLObject mf_mts = cdolist_list_var_$66 = isa.max_floor_mts_of_isa_paths(fort, an_isa, UNPROVIDED);
            SubLObject mf_mt = NIL;
            mf_mt = cdolist_list_var_$66.first();
            while (NIL != cdolist_list_var_$66) {
                hash_table_utilities.pushnew_hash(mf_mt, an_isa, isa_hash, UNPROVIDED);
                cdolist_list_var_$66 = cdolist_list_var_$66.rest();
                mf_mt = cdolist_list_var_$66.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            an_isa = cdolist_list_var.first();
        } 
        all_mts = Sort.sort(hash_table_utilities.hash_table_keys(isa_hash), symbol_function($sym569$GENERALITY_ESTIMATE_), UNPROVIDED);
        final SubLObject title_var = $$$Literal_Query;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str232$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$67 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$68 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str235$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$69 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$70 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$70, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        cb_help_preamble($CB_LITERAL_QUERY, UNPROVIDED, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        html_markup(html_macros.$html_strong_head$.getGlobalValue());
                        html_princ($str570$Simulated_query_over_all_mts__);
                        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                        html_newline(UNPROVIDED);
                        cb_form(listS($$isa, fort, $list572), UNPROVIDED, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        SubLObject cdolist_list_var2 = all_mts;
                        SubLObject mt = NIL;
                        mt = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            html_princ($$$Answers_in_);
                            cb_show_term(mt, UNPROVIDED, UNPROVIDED);
                            html_princ($str574$_);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            final SubLObject v_genl_mts = set_difference(genl_mts.selected_genl_mts(mt, all_mts, UNPROVIDED, UNPROVIDED), list(mt), UNPROVIDED, UNPROVIDED);
                            if (NIL != v_genl_mts) {
                                html_princ($str575$__inherits_from);
                                SubLObject cdolist_list_var_$67 = v_genl_mts;
                                SubLObject genl_mt = NIL;
                                genl_mt = cdolist_list_var_$67.first();
                                while (NIL != cdolist_list_var_$67) {
                                    html_princ($$$_);
                                    cb_show_term(genl_mt, UNPROVIDED, UNPROVIDED);
                                    cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                                    genl_mt = cdolist_list_var_$67.first();
                                } 
                                html_princ($str577$_);
                            }
                            html_newline(UNPROVIDED);
                            html_princ($str578$__);
                            SubLObject cdolist_list_var_$68;
                            final SubLObject the_isas = cdolist_list_var_$68 = Sort.sort(gethash(mt, isa_hash, UNPROVIDED), symbol_function($sym579$GENERALITY_ESTIMATE_), UNPROVIDED);
                            SubLObject the_isa = NIL;
                            the_isa = cdolist_list_var_$68.first();
                            while (NIL != cdolist_list_var_$68) {
                                html_markup(html_macros.$html_no_break_head$.getGlobalValue());
                                final SubLObject the_assertion = kb_indexing.find_gaf(list($$isa, fort, the_isa), mt);
                                if (NIL != the_assertion) {
                                    cb_link_assertion(the_assertion);
                                }
                                cb_show_term(the_isa, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_no_break_tail$.getGlobalValue());
                                html_princ($$$_);
                                cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                                the_isa = cdolist_list_var_$68.first();
                            } 
                            html_princ($str577$_);
                            html_newline(TWO_INTEGER);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            mt = cdolist_list_var2.first();
                        } 
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$69, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$68, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$67, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_include_literal_query_linkP(final SubLObject constant, final SubLObject arg, final SubLObject predicate, final SubLObject use) {
        if (use.eql($INDEX)) {
            if (NIL != subl_promotions.memberP(arg, $list581, UNPROVIDED, UNPROVIDED)) {
                if (NIL != hl_supports.hl_predicate_p(predicate)) {
                    return $LIKELY;
                }
                if (NIL != possible_to_conclude(predicate)) {
                    return $POSSIBLE;
                }
            }
        } else
            if (use.eql($INDEX_DISPLAY)) {
                if (NIL != hl_supports.hl_predicate_p(predicate)) {
                    return $LIKELY;
                }
                if (NIL != possible_to_conclude(predicate)) {
                    return $POSSIBLE;
                }
            } else
                if (use.eql($NORMAL)) {
                    if (kb_indexing.num_gaf_arg_index(constant, arg, predicate, UNPROVIDED).numG(ZERO_INTEGER)) {
                        return $KNOWN;
                    }
                    if (NIL != hl_supports.hl_predicate_p(predicate)) {
                        return $LIKELY;
                    }
                    if (NIL != possible_to_conclude(predicate)) {
                        return $POSSIBLE;
                    }
                }


        return NIL;
    }

    public static SubLObject possible_to_conclude(final SubLObject predicate) {
        return makeBoolean(kb_indexing.num_predicate_rule_index(predicate, $POS, UNPROVIDED, UNPROVIDED).numG(ZERO_INTEGER) || kb_indexing.num_gaf_arg_index(predicate, TWO_INTEGER, $$genlPreds, UNPROVIDED).numG(ZERO_INTEGER));
    }

    public static SubLObject cb_show_query(final SubLObject formula, final SubLObject mt, SubLObject query_prompt) {
        if (query_prompt == UNPROVIDED) {
            query_prompt = $$$Current_query;
        }
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        html_princ(query_prompt);
        html_princ($$$_in_);
        cb_show_term(mt, UNPROVIDED, UNPROVIDED);
        html_princ($str591$__);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_newline(UNPROVIDED);
        cb_show_term(formula, UNPROVIDED, UNPROVIDED);
        html_newline(UNPROVIDED);
        return NIL;
    }

    public static SubLObject cb_show_focal_inference_progress_section(final SubLObject focal_inference, final SubLObject refreshP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != inference_datastructures_inference.running_inference_p(focal_inference)) && (NIL != $cb_inference_progress_frame_enabledP$.getGlobalValue())) {
            final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(focal_inference);
            final SubLObject inference_suid = inference_datastructures_inference.inference_suid(focal_inference);
            final SubLObject height = (NIL != inference_datastructures_inference.closed_inference_p(focal_inference)) ? $cb_closed_inference_progress_frame_height$.getGlobalValue() : $cb_open_inference_progress_frame_height$.getGlobalValue();
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_iframe_head$.getGlobalValue());
            html_markup(html_macros.$html_iframe_src$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str593$cb_inference_progress_page__A__A, store_suid, inference_suid);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_iframe_name$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str594$inference_progress);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_iframe_width$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str595$100_);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_iframe_height$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(height);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_iframe_frameborder$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_iframe_marginwidth$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_iframe_marginheight$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_iframe_tail$.getGlobalValue());
        } else {
            final SubLObject refresh_mode = (NIL != refreshP) ? $ON : $OFF;
            cb_inference_progress_page_guts(focal_inference, refresh_mode, NIL);
        }
        return NIL;
    }

    public static SubLObject cb_inference_progress_page(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
            if (NIL == inference) {
                return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            final SubLObject refresh = (NIL != inference_datastructures_inference.running_inference_p(inference)) ? $cb_query_auto_refresh_rate$.getGlobalValue() : NIL;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str232$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$73 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_head_shortcut_icon();
                    html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css($CB_CYC);
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    format(html_macros.$html_stream$.getDynamicValue(thread), $str599$Inference__A__A_Progress, store_id_string, inference_id_string);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    if (NIL != refresh) {
                        html_refresh(refresh, UNPROVIDED);
                    }
                    dhtml_macros.dhtml_with_dom_script();
                    dhtml_macros.dhtml_with_toggle_visibility_support();
                    dhtml_macros.html_basic_cb_scripts();
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$74 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$75 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            cb_inference_progress_page_guts(inference, $DISABLED, T);
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$75, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$74, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$73, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(args, $list3);
        }
        return NIL;
    }

    public static SubLObject cb_inference_progress_page_guts(final SubLObject inference, final SubLObject refresh_mode, final SubLObject inside_progress_frameP) {
        cb_show_inference_status_section(inference, refresh_mode);
        if ((NIL == inside_progress_frameP) && (NIL != inference_datastructures_inference.continuable_inference_p(inference))) {
            html_newline(UNPROVIDED);
            cb_submit_input_with_explanation($$$Continue_the_Focal_Inference, $str357$Continues_running_the_focal_infer, $$$continue, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL != inside_progress_frameP) && (NIL == inference_datastructures_inference.running_inference_p(inference))) {
            html_newline(UNPROVIDED);
            cb_link($QUERY, $str602$_Refresh_Page_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_newline(TWO_INTEGER);
        cb_show_query_answer_section(inference, $cb_inference_answer_section_limit$.getGlobalValue());
        return inference;
    }

    public static SubLObject cb_show_inference_status_section(final SubLObject inference, final SubLObject refresh_mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_princ_strong($str603$Status__);
        html_indent(UNPROVIDED);
        cb_query_show_inference_status(inference, UNPROVIDED);
        final SubLObject pcase_var = inference_datastructures_inference.inference_status(inference);
        if (pcase_var.eql($RUNNING)) {
            html_indent(FOUR_INTEGER);
            if (refresh_mode.eql($ON)) {
                cb_link($QUERY, $str604$_Halt_Auto_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (refresh_mode.eql($OFF)) {
                    cb_link($QUERY, $str244$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    html_indent(UNPROVIDED);
                    cb_link($AUTO_REFRESH_QUERY, inference, $str606$_Auto_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (refresh_mode.eql($DISABLED)) {
                    }


            html_indent(UNPROVIDED);
            cb_link($INTERRUPT_INFERENCE, inference, $str608$_Interrupt_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            cb_link($ABORT_INFERENCE, inference, $str610$_Abort_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
            final SubLObject remaining_time = inference_datastructures_inference.inference_remaining_time(inference, UNPROVIDED);
            if (NIL != remaining_time) {
                html_newline(UNPROVIDED);
                if (NIL != subl_promotions.non_negative_integer_p(remaining_time)) {
                    html_princ_strong($str611$Max_time_remaining__);
                    html_princ(numeric_date_utilities.elapsed_seconds_string(remaining_time));
                } else {
                    html_princ_strong($str612$Time_over_budget__);
                    final SubLObject color_val = $RED;
                    html_markup(html_macros.$html_font_head$.getGlobalValue());
                    if (NIL != color_val) {
                        html_markup(html_macros.$html_font_color$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(color_val));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(numeric_date_utilities.elapsed_seconds_string(minus(remaining_time)));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
                    }
                    html_markup(html_macros.$html_font_tail$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject cb_show_query_answer_section(final SubLObject inference, SubLObject answer_limit) {
        if (answer_limit == UNPROVIDED) {
            answer_limit = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject answer_count = inference_datastructures_inference.inference_answer_count(inference);
        final SubLObject new_answer_count = inference_datastructures_inference.inference_new_answer_count(inference);
        final SubLObject new_justification_count = inference_datastructures_inference.inference_new_justification_count(inference);
        final SubLObject initial_visibility = $VISIBLE;
        if (answer_count.isZero() || (NIL == inference_datastructures_inference.inference_free_el_vars(inference))) {
            cb_query_browser.cb_show_inference_answer_section(inference, NIL);
        } else {
            dhtml_macros.dhtml_switch_visibility_links($str613$inference_answers, $$$Show, $$$Hide);
            final SubLObject size_val = FOUR_INTEGER;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != size_val) {
                html_markup(html_macros.$html_font_size$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(size_val);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ_strong($$$Answers);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
            html_indent(FOUR_INTEGER);
            html_markup(html_macros.$html_italic_head$.getGlobalValue());
            html_princ($str614$_);
            cb_show_inference_answer_counts(answer_count, new_answer_count, new_justification_count);
            html_princ($str577$_);
            html_markup(html_macros.$html_italic_tail$.getGlobalValue());
            if (NIL != inference_datastructures_inference.inference_has_some_answerP(inference)) {
                html_indent(FOUR_INTEGER);
                html_princ_strong($str283$Actions__);
                if (answer_limit.isInteger()) {
                    html_indent(ONE_INTEGER);
                    cb_link($ALL_INFERENCE_ANSWERS, inference, $str616$_All_Answers_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                html_indent(ONE_INTEGER);
                cb_link($SAVE_INFERENCE_ANSWERS, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != blue_grapher_utilities.determine_edge_templates_for_inference(inference)) {
                    html_indent(ONE_INTEGER);
                    cb_link($GRAPH_INFERENCE_ANSWERS, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (inference_datastructures_inference.inference_answer_count(inference).numGE(ONE_INTEGER)) {
                    html_indent(ONE_INTEGER);
                    cb_link($SAVE_INFERENCE_ANSWERS_AS_QUERIES, inference, $str620$_Save_Answers_as_Queries_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                if (inference_datastructures_inference.inference_answer_count(inference).numG(ONE_INTEGER)) {
                    html_indent(ONE_INTEGER);
                    cb_link($INFERENCE_ANSWER_TIMELINE, inference, $str622$_Timeline_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            dhtml_macros.dhtml_set_switched_visibility($str613$inference_answers, initial_visibility, $PARAGRAPH);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str613$inference_answers);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_query_browser.cb_show_inference_answer_section(inference, answer_limit);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject cb_auto_refresh_query(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return cb_auto_refresh_query_internal();
    }

    public static SubLObject cb_link_auto_refresh_query(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str606$_Auto_Refresh_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str624$Starts_up_an_auto_refresh_loop_th.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str624$Starts_up_an_auto_refresh_loop_th, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str625$cb_auto_refresh_query__A__A, store_suid, inference_suid);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_auto_refresh_query_internal() {
        SubLObject current;
        final SubLObject datum = current = cb_inferences();
        final SubLObject focal_inference = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list209);
        final SubLObject other_inferences;
        current = other_inferences = current.rest();
        if ((NIL != focal_inference) && ($RUNNING == inference_datastructures_inference.inference_status(focal_inference))) {
            return cb_query_internal(list($REFRESH, $cb_query_auto_refresh_rate$.getGlobalValue()));
        }
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_all_inference_answers(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str627$_More_____;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str628$cb_all_inference_answers__A__A, store_suid, inference_suid);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return inference;
    }

    public static SubLObject cb_all_inference_answers(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str232$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$77 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str630$Inference__A__A, store_id_string, inference_id_string);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                dhtml_macros.html_basic_cb_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$78 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$79 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        cb_show_inference_with_status_and_all_answers(inference);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$79, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$78, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$77, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return inference;
    }

    public static SubLObject cb_show_inference_with_status_and_all_answers(final SubLObject inference) {
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_princ_strong($$$Inference_Answers);
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        html_indent(FOUR_INTEGER);
        cb_link($ALL_INFERENCE_ANSWERS, inference, $str244$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($INFERENCE, inference, NIL, $str633$_Examine_Inference_, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        cb_link($QUERY, $str552$_Query_Tool_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        html_newline(TWO_INTEGER);
        cb_query_browser.cb_show_inference_el_query(inference, UNPROVIDED);
        html_newline(TWO_INTEGER);
        html_princ_strong($str603$Status__);
        html_indent(UNPROVIDED);
        cb_query_show_inference_status(inference, UNPROVIDED);
        html_newline(TWO_INTEGER);
        cb_show_query_answer_section(inference, NIL);
        return inference;
    }

    public static SubLObject cb_focus_inference(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_note_focal_inference(inference);
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_focus_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str275$_Focus_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str635$Make_this_inference_the_focal_inf.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str635$Make_this_inference_the_focal_inf, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str636$cb_focus_inference__A__A, store_suid, inference_suid);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_defocus_inference(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_note_no_focal_inference();
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_defocus_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str288$_Defocus_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str639$Make_this_inference_no_longer_the.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str639$Make_this_inference_no_longer_the, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str640$cb_defocus_inference__A__A, store_suid, inference_suid);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_interrupt_inference(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                        inference_strategist.inference_interrupt(inference, NIL);
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
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_interrupt_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str608$_Interrupt_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str643$cb_interrupt_inference__A__A, store_id, inference_id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_abort_inference(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
                        inference_strategist.inference_abort(inference);
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
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_abort_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str610$_Abort_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str646$cb_abort_inference__A__A, store_id, inference_id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_forget_inference(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_act_forget_inference(inference);
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_forget_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str649$_Forget_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str650$cb_forget_inference__A__A, store_id, inference_id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_forget_all_inferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject cdolist_list_var = cb_inferences();
        SubLObject inference = NIL;
        inference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference) {
                cb_act_forget_inference(inference);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference = cdolist_list_var.first();
        } 
        cb_note_no_focal_inference();
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_forget_all_inferences(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str654$_Forget_All_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str655$cb_forget_all_inferences);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_forget_all_other_inferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cb_inferences();
        final SubLObject focal_inference = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list209);
        current = current.rest();
        SubLObject cdolist_list_var;
        final SubLObject other_inferences = cdolist_list_var = current;
        SubLObject other_inference = NIL;
        other_inference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_act_forget_inference(other_inference);
            cdolist_list_var = cdolist_list_var.rest();
            other_inference = cdolist_list_var.first();
        } 
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_forget_all_other_inferences(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str654$_Forget_All_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str659$cb_forget_all_other_inferences);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_reinforce_inference(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_act_reinforce_inference(inference);
        return cb_simple_message_page($str662$Inference_heuristics_are_being_re, ONE_INTEGER, $int$2000);
    }

    public static SubLObject cb_link_reinforce_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str286$_Reinforce_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str665$Reinforce_the_inference_heuristic.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str665$Reinforce_the_inference_heuristic, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str666$cb_reinforce_inference__A__A, store_id, inference_id);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject inference_reinforcement_applicableP(final SubLObject inference) {
        return makeBoolean((NIL != number_utilities.possibly_positive_integer_p(inference_datastructures_inference.inference_max_transformation_depth(inference))) && (NIL != subl_promotions.positive_integer_p(inference_datastructures_inference.inference_answer_count(inference))));
    }

    public static SubLObject cb_destroy_inference(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        cb_act_destroy_inference(inference);
        SubLObject cdolist_list_var = cb_inferences();
        SubLObject inference_$80 = NIL;
        inference_$80 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_$80) && (NIL == inference_datastructures_inference.valid_inference_p(inference_$80))) {
                cb_act_forget_inference(inference_$80);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference_$80 = cdolist_list_var.first();
        } 
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_destroy_inference(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str277$_Destroy_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str669$Destroy_this_inference__reclaimin.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str669$Destroy_this_inference__reclaimin, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str670$cb_destroy_inference__A__A, store_id, inference_id);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_destroy_all_inferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject cdolist_list_var = cb_inferences();
        SubLObject inference = NIL;
        inference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference) {
                cb_act_destroy_inference(inference);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inference = cdolist_list_var.first();
        } 
        cb_note_no_focal_inference();
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_destroy_all_inferences(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str269$_Destroy_All_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str673$Destroy_all_inferences__including.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str673$Destroy_all_inferences__including, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            html_princ($str674$cb_destroy_all_inferences);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_destroy_all_other_inferences(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cb_inferences();
        final SubLObject focal_inferences = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list677);
        current = current.rest();
        SubLObject cdolist_list_var;
        final SubLObject other_inferences = cdolist_list_var = current;
        SubLObject other_inference = NIL;
        other_inference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cb_act_destroy_inference(other_inference);
            cdolist_list_var = cdolist_list_var.rest();
            other_inference = cdolist_list_var.first();
        } 
        return cb_query_internal(UNPROVIDED);
    }

    public static SubLObject cb_link_destroy_all_other_inferences(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str269$_Destroy_All_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str679$Destroy_all_inferences_other_than.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str679$Destroy_all_inferences_other_than, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            html_princ($str680$cb_destroy_all_other_inferences);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_link_inference_to_subl_query(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str298$_SubL_Query_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        cyc_file_dependencies.javascript($OVERLIB);
        if ($str682$Convert_this_inference_to_an_equi.isString()) {
            final SubLObject onmouseover = html_script_utilities.html_hoverover_anchor_onmouseover($str682$Convert_this_inference_to_an_equi, NIL, NIL, NIL);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str683$cb_inference_to_subl_query__A__A, store_id, inference_id);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_markup(html_macros.$html_anchor_onmouseover$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(onmouseover);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_anchor_onmouseout$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str4$nd___);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject cb_inference_to_subl_query(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        store_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
            final SubLObject input_string = inference_datastructures_inference.inference_to_new_cyc_query_form_string(inference);
            cb_tools.cb_handle_interactor(list(list($str685$input_string, input_string)));
        } else {
            cdestructuring_bind_error(datum, $list3);
        }
        return NIL;
    }

    public static SubLObject cb_link_graph_inference_answers(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str687$_Graph_Answers_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = (NIL != cconcatenate(format_nil.format_nil_a_no_copy(store_id), new SubLObject[]{ $str1$_, format_nil.format_nil_a_no_copy(inference_id) })) ? cb_frame_name(cconcatenate(format_nil.format_nil_a_no_copy(store_id), new SubLObject[]{ $str1$_, format_nil.format_nil_a_no_copy(inference_id) })) : NIL;
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str688$cb_graph_inference_answers__A__A, store_id, inference_id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str689$window_open__);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str688$cb_graph_inference_answers__A__A, store_id, inference_id);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str690$__);
        if (NIL != cconcatenate(format_nil.format_nil_a_no_copy(store_id), new SubLObject[]{ $str1$_, format_nil.format_nil_a_no_copy(inference_id) })) {
            format(html_macros.$html_stream$.getDynamicValue(thread), $str691$__A_, cconcatenate(format_nil.format_nil_a_no_copy(store_id), new SubLObject[]{ $str1$_, format_nil.format_nil_a_no_copy(inference_id) }));
        } else {
            format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
        }
        format(html_macros.$html_stream$.getDynamicValue(thread), $str693$___A____, cb_blue_grapher.cb_blue_construct_window_options(cb_blue_grapher.$cb_blue_applet_window_width$.getGlobalValue(), cb_blue_grapher.$cb_blue_applet_window_height$.getGlobalValue()));
        format(html_macros.$html_stream$.getDynamicValue(thread), $str694$return_false_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_graph_inference_answers(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list3);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return cb_graph_inference_answers_int(inference);
    }

    public static SubLObject cb_graph_inference_answers_int(final SubLObject inference) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject arghash = html_arghash.new_arghash(UNPROVIDED);
        html_arghash.set_arghash_value($SIGNATURE, arghash, cconcatenate(format_nil.format_nil_a_no_copy(store_id), new SubLObject[]{ $str1$_, format_nil.format_nil_a_no_copy(inference_id) }));
        html_arghash.set_arghash_value($INFERENCE_STORE_ID, arghash, store_id);
        html_arghash.set_arghash_value($INFERENCE_ID, arghash, inference_id);
        blue_grapher_utilities.html_determine_edge_templates_for_inference(inference);
        cb_blue_grapher.cb_blue_applet_window_internal(arghash);
        subl_promotions.make_process_with_args($str700$cb_graph_inference_answers_window, symbol_function(CB_GRAPH_INFERENCE_ANSWERS_WINDOW), list(arghash));
        return NIL;
    }

    public static SubLObject cb_graph_inference_answers_window(final SubLObject arghash) {
        final SubLObject builder_fn_key = $BBF_INFERENCE_ANSWERS;
        final SubLObject builder_fn = intern(string_utilities.string_from_keyword(builder_fn_key), $$$CYC);
        final SubLObject signature = html_arghash.get_arghash_value($SIGNATURE, arghash);
        blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list($BUILDER_FN, builder_fn, $PARAMS, list($INFERENCE_STORE_ID, html_arghash.get_arghash_value($INFERENCE_STORE_ID, arghash), $INFERENCE_ID, html_arghash.get_arghash_value($INFERENCE_ID, arghash)))));
        return NIL;
    }

    public static SubLObject cb_save_inference_answers_int(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject store_id_string = html_extract_input($str705$store_id, args);
        final SubLObject inference_id_string = html_extract_input($str706$inference_id, args);
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        SubLObject output_format = html_extract_input($str707$_ans_format, args);
        final SubLObject destination = read_from_string(html_extract_input($str708$_destination, args), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject filename = html_extract_input($str709$_filename, args);
        final SubLObject cycl_prefixP = html_extract_boolean($str710$cycl_prefix, args, UNPROVIDED);
        if (NIL != output_format) {
            output_format = read_from_string(output_format, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((destination == $FILE) && (NIL == string_utilities.non_empty_string_p(filename))) {
            return cb_error($str712$Please_enter_a_filename_to_save_t, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject pcase_var = output_format;
        if ((pcase_var.eql($TAB_DELIMITED) || pcase_var.eql($XML)) || pcase_var.eql($ALCHEMY)) {
            SubLObject error = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        cb_inference_output_answers_to_html_stream_or_file(inference, destination, filename, output_format, NIL, cycl_prefixP);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error) {
                cb_error($str717$Attempt_to_save_answers_failed___, error, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } else
            if (pcase_var.eql($CUSTOM_XML)) {
                SubLObject xml_spec = html_extract_string($str719$_spec, args, UNPROVIDED);
                SubLObject doneP = NIL;
                try {
                    xml_spec = read_from_string(xml_spec, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    doneP = cb_inference_output_answers_to_html_stream_or_file(inference, destination, filename, $XML, xml_spec, cycl_prefixP);
                } finally {
                    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL == doneP) {
                            html_princ_strong($str720$Error__Operation_failed);
                            html_newline(TWO_INTEGER);
                            html_princ($str721$The_query_results_were_not_transf);
                            html_newline(TWO_INTEGER);
                            cb_back_button($SELF, $$$Back);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                    }
                }
            } else {
                final SubLObject title_var = $str723$Error__Invalid_input;
                final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
                try {
                    html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                    html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
                    if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup($str232$_meta_http_equiv__X_UA_Compatible);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$81 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                    try {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                        html_markup(html_macros.$html_html_head$.getGlobalValue());
                        html_markup(html_macros.$html_head_head$.getGlobalValue());
                        html_macros.html_head_content_type();
                        cb_head_shortcut_icon();
                        html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                        cyc_file_dependencies.css($CB_CYC);
                        dhtml_macros.html_basic_cb_scripts();
                        if (NIL != title_var) {
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_title_head$.getGlobalValue());
                            html_princ(title_var);
                            html_markup(html_macros.$html_title_tail$.getGlobalValue());
                        }
                        html_markup(html_macros.$html_head_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        final SubLObject _prev_bind_0_$82 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                        try {
                            html_macros.$html_inside_bodyP$.bind(T, thread);
                            html_markup(html_macros.$html_body_head$.getGlobalValue());
                            if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                                html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_markup(html_macros.$html_body_class$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str235$yui_skin_sam);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$83 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_div_head$.getGlobalValue());
                                html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reloadFrameButton);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$84 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_input_head$.getGlobalValue());
                                    html_markup(html_macros.$html_input_type$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$button);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_input_name$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup($$$reload);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_input_value$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_princ($$$Refresh_Frames);
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                        html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                    }
                                    html_char(CHAR_greater, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$84, thread);
                                }
                                html_markup(html_macros.$html_div_tail$.getGlobalValue());
                                if (NIL != title_var) {
                                    html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    html_princ(title_var);
                                    html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                    html_markup(TWO_INTEGER);
                                    html_char(CHAR_greater, UNPROVIDED);
                                }
                                html_princ($str724$Please_select_one_of_the_output_f);
                                html_newline(TWO_INTEGER);
                                cb_back_button($SELF, $$$Back);
                                html_source_readability_terpri(UNPROVIDED);
                                html_copyright_notice();
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$83, thread);
                            }
                            html_markup(html_macros.$html_body_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$82, thread);
                        }
                        html_markup(html_macros.$html_html_tail$.getGlobalValue());
                    } finally {
                        cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$81, thread);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
                }
            }

        return NIL;
    }

    public static SubLObject cb_inference_output_answers_to_html_stream_or_file(final SubLObject inference, final SubLObject destination, final SubLObject filename, final SubLObject output_format, final SubLObject xml_spec, final SubLObject cycl_prefixP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (destination.eql($HTML_STREAM)) {
            return inference_utilities.inference_output_answers(inference, html_macros.$html_stream$.getDynamicValue(thread), output_format, xml_spec, cycl_prefixP);
        }
        if (destination.eql($FILE)) {
            final SubLObject result = inference_utilities.inference_output_answers_to_file(inference, filename, output_format, $OUTPUT, xml_spec, cycl_prefixP);
            cb_message_page_with_history(cconcatenate($$$Answers_were_saved_to_, new SubLObject[]{ format_nil.format_nil_a_no_copy(filename), $str410$_ }), T);
            return result;
        }
        return NIL;
    }

    public static SubLObject cb_save_inference_answers(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject title_var = $str731$Save_Query_Results_as_Text_XML;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str232$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$85 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_head_shortcut_icon();
                    html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css($CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (NIL != title_var) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ(title_var);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$86 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str235$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$87 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$88 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$button);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reload);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_princ($$$Refresh_Frames);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$88, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (NIL != title_var) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ(title_var);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                            }
                            final SubLObject frame_name_var = cb_frame_name(NIL);
                            html_markup(html_macros.$html_form_head$.getGlobalValue());
                            html_markup(html_macros.$html_form_action$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_form_method$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$post);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != frame_name_var) {
                                html_markup(html_macros.$html_form_target$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(frame_name_var);
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$89 = html_macros.$html_safe_print$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_macros.$within_html_form$.bind(T, thread);
                                html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                                html_hidden_input($str732$cb_save_inference_answers_int, T, UNPROVIDED);
                                html_hidden_input($str705$store_id, store_id_string, UNPROVIDED);
                                html_hidden_input($str706$inference_id, inference_id_string, UNPROVIDED);
                                cb_help_preamble($CB_SAVE_INFERENCE_ANSWERS, NIL, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_princ_strong($str733$Save_query_results_as_);
                                html_newline(UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_radio_input($str707$_ans_format, $str734$_tab_delimited, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($$$Text);
                                html_newline(UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_radio_input($str707$_ans_format, $str736$_xml, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($$$Default_XML);
                                html_newline(UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_radio_input($str707$_ans_format, $str738$_custom_xml, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($str739$User_defined_XML);
                                html_newline(UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_radio_input($str707$_ans_format, $str740$_alchemy, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($str741$Alchemy_text__bindings_must_be_se);
                                html_newline(TWO_INTEGER);
                                html_princ_strong($str742$Destination_);
                                html_newline(UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_radio_input($str708$_destination, $str743$_html_stream, T, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($$$Show_results_in_this_browser);
                                html_newline(UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_radio_input($str708$_destination, $str745$_file, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($str746$Save_results_in_file_);
                                html_glyph($NBSP, UNPROVIDED);
                                html_text_input($str709$_filename, NIL, $int$60);
                                html_script_utilities.html_clear_input_button($str709$_filename, $$$Clear, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_princ_strong($str750$Optional_Parameters_);
                                html_newline(UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_checkbox_input($str710$cycl_prefix, $str751$cycl_prefix_enabled, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                html_indent(UNPROVIDED);
                                html_princ($str752$Include______prefix_on_CycL_terms);
                                html_newline(TWO_INTEGER);
                                html_princ_strong($str753$Please_enter_XML_specifications_i);
                                html_princ($str739$User_defined_XML);
                                html_princ_strong($str574$_);
                                html_newline(UNPROVIDED);
                                html_markup(html_macros.$html_textarea_head$.getGlobalValue());
                                html_markup(html_macros.$html_textarea_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($str719$_spec);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_textarea_cols$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($int$60);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_textarea_rows$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TEN_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$90 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$90, thread);
                                }
                                html_markup(html_macros.$html_textarea_tail$.getGlobalValue());
                                html_newline(TWO_INTEGER);
                                html_reset_input(UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_submit_input($$$Submit, UNPROVIDED, UNPROVIDED);
                                html_newline(TWO_INTEGER);
                                html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                            } finally {
                                html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                                html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$89, thread);
                            }
                            html_markup(html_macros.$html_form_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$87, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$86, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$85, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
            return NIL;
        }
        cdestructuring_bind_error(args, $list3);
        return NIL;
    }

    public static SubLObject cb_link_save_inference_answers(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str756$_Save_Answers_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = NIL;
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str757$cb_save_inference_answers__A__A, store_id, inference_id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str689$window_open__);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str757$cb_save_inference_answers__A__A, store_id, inference_id);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str690$__);
        format(html_macros.$html_stream$.getDynamicValue(thread), $$$null);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str693$___A____, $str6$);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str694$return_false_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_save_inference_answers_as_queries(final SubLObject args) {
        SubLObject arghash = NIL;
        if (NIL != list_utilities.doubletonP(args)) {
            SubLObject store_id_string = NIL;
            SubLObject inference_id_string = NIL;
            destructuring_bind_must_consp(args, args, $list3);
            store_id_string = args.first();
            SubLObject current = args.rest();
            destructuring_bind_must_consp(current, args, $list3);
            inference_id_string = current.first();
            current = current.rest();
            if (NIL == current) {
                arghash = html_arghash.new_arghash(UNPROVIDED);
                html_arghash.set_arghash_value($STORE_ID, arghash, read_from_string_ignoring_errors(store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                html_arghash.set_arghash_value($INFERENCE_ID, arghash, read_from_string_ignoring_errors(inference_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                cdestructuring_bind_error(args, $list3);
            }
        } else {
            arghash = html_arghash.arglist_to_arghash(args);
        }
        return cb_save_inference_answers_as_queries_int(arghash);
    }

    public static SubLObject cb_save_inference_answers_as_queries_int(final SubLObject arghash) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
        if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup($str232$_meta_http_equiv__X_UA_Compatible);
        }
        html_source_readability_terpri(UNPROVIDED);
        final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
        try {
            cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
            html_markup(html_macros.$html_html_head$.getGlobalValue());
            html_markup(html_macros.$html_head_head$.getGlobalValue());
            html_macros.html_head_content_type();
            cb_head_shortcut_icon();
            html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
            cyc_file_dependencies.css($CB_CYC);
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_title_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $$$Save_Inference_Answers_as_Queries);
            html_markup(html_macros.$html_title_tail$.getGlobalValue());
            dhtml_macros.dhtml_with_dom_script();
            dhtml_macros.dhtml_with_toggle_visibility_support();
            html_markup(html_macros.$html_head_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$91 = html_macros.$html_inside_bodyP$.currentBinding(thread);
            try {
                html_macros.$html_inside_bodyP$.bind(T, thread);
                html_markup(html_macros.$html_body_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$92 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_big_head$.getGlobalValue());
                    html_princ_strong($$$Save_Inference_Answers_as_Queries);
                    html_markup(html_macros.$html_big_tail$.getGlobalValue());
                    html_newline(TWO_INTEGER);
                    SubLObject do_workP = NIL;
                    if (NIL != html_arghash.get_arghash_value($SUBMIT, arghash)) {
                        do_workP = T;
                        if (NIL == html_arghash.get_arghash_value($EL_VARIABLES, arghash)) {
                            do_workP = NIL;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$93 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($str764$Please_select_one_or_more_EL_vari);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$93, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                        }
                        if (NIL == html_arghash.get_arghash_value($ANSWER_IDS, arghash)) {
                            do_workP = NIL;
                            html_markup(html_macros.$html_font_head$.getGlobalValue());
                            if (NIL != html_macros.$html_color_sat_red$.getGlobalValue()) {
                                html_markup(html_macros.$html_font_color$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_color(html_macros.$html_color_sat_red$.getGlobalValue()));
                                html_char(CHAR_quotation, UNPROVIDED);
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$94 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                html_princ($$$Please_select_one_or_more_answers);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$94, thread);
                            }
                            html_markup(html_macros.$html_font_tail$.getGlobalValue());
                            html_newline(UNPROVIDED);
                        }
                    }
                    final SubLObject store_id = html_arghash.get_arghash_value($STORE_ID, arghash);
                    final SubLObject inference_id = html_arghash.get_arghash_value($INFERENCE_ID, arghash);
                    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_ids(store_id, inference_id);
                    if (NIL == inference_datastructures_inference.inference_p(inference)) {
                        return cb_error($str598$Inference__A_in_problem_store__A_, inference_id, store_id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if (NIL == do_workP) {
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$95 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str768$cb_save_inference_answers_as_quer, T, UNPROVIDED);
                            html_arghash.html_arghash_hidden_input(arghash, $STORE_ID, UNPROVIDED, UNPROVIDED);
                            html_arghash.html_arghash_hidden_input(arghash, $INFERENCE_ID, UNPROVIDED, UNPROVIDED);
                            cb_form(inference, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            cb_form(inference_datastructures_inference.inference_el_query(inference), NIL, T);
                            html_newline(UNPROVIDED);
                            html_princ($$$_in_);
                            cb_form(inference_datastructures_inference.inference_mt(inference), UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            html_arghash.html_arghash_submit_input(arghash, $$$Submit, $SUBMIT, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            thread.resetMultipleValues();
                            final SubLObject current_answers = cb_query_browser.cb_inference_current_answers(inference);
                            final SubLObject free_el_variables = thread.secondMultipleValue();
                            final SubLObject inference_new_justification_set = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == current_answers) {
                                cb_error($str769$Inference__A_in_problem_store__A_, inference_id, store_id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (NIL == inference_datastructures_inference.inference_free_el_vars(inference)) {
                                    return cb_error($str770$Inference__A_in_problem_store__A_, inference_id, store_id, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }

                            html_princ($str771$Which_variables_should_be_filled_);
                            html_newline(UNPROVIDED);
                            SubLObject cdolist_list_var = free_el_variables;
                            SubLObject free_el_variable = NIL;
                            free_el_variable = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                html_indent(TWO_INTEGER);
                                html_arghash.html_arghash_checkbox_input(arghash, $EL_VARIABLES, cycl_variables.variable_name(free_el_variable), UNPROVIDED, UNPROVIDED);
                                html_indent(TWO_INTEGER);
                                html_markup(html_macros.$html_bold_head$.getGlobalValue());
                                cb_form(free_el_variable, UNPROVIDED, UNPROVIDED);
                                html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                                html_newline(UNPROVIDED);
                                cdolist_list_var = cdolist_list_var.rest();
                                free_el_variable = cdolist_list_var.first();
                            } 
                            html_newline(UNPROVIDED);
                            html_princ($str772$Which_answers_should_be_used_to_g);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_border$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$96 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$97 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$98 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$98, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$99 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ_strong($$$Answer);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$99, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    cb_query_browser.cb_show_bindings_horizontal_variable_row(free_el_variables, NIL, T);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$97, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                SubLObject cdolist_list_var2 = current_answers;
                                SubLObject v_answer = NIL;
                                v_answer = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$100 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$101 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_arghash.html_arghash_checkbox_input(arghash, $ANSWER_IDS, inference_datastructures_inference.inference_answer_suid(v_answer), UNPROVIDED, UNPROVIDED);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$101, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$102 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            cb_query_browser.cb_show_inference_answer_section_answer_number(v_answer, inference_new_justification_set, length(current_answers));
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$102, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        cb_query_browser.cb_show_inference_answer_section_bindings(v_answer, free_el_variables);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$100, thread);
                                    }
                                    html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                    html_source_readability_terpri(UNPROVIDED);
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    v_answer = cdolist_list_var2.first();
                                } 
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$96, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            html_arghash.html_arghash_submit_input(arghash, $$$Submit, $SUBMIT, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$95, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                    } else {
                        SubLObject el_variables = html_arghash.get_arghash_value_list($EL_VARIABLES, arghash);
                        final SubLObject answer_ids = html_arghash.get_arghash_value_list($ANSWER_IDS, arghash);
                        el_variables = Mapping.mapcar(MAKE_EL_VAR, el_variables);
                        save_inference_answers_as_queries(inference, answer_ids, el_variables);
                    }
                    html_source_readability_terpri(UNPROVIDED);
                    html_copyright_notice();
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$92, thread);
                }
                html_markup(html_macros.$html_body_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$91, thread);
            }
            html_markup(html_macros.$html_html_tail$.getGlobalValue());
        } finally {
            cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
        }
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject save_inference_answers_as_queries(final SubLObject inference, final SubLObject answer_ids, final SubLObject el_variables) {
        SubLObject cdolist_list_var = answer_ids;
        SubLObject answer_id = NIL;
        answer_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject kb_query_being_saved = cb_kb_query_state.cb_kbq_new_query_state_from_inference(inference, UNPROVIDED);
            final SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, answer_id);
            final SubLObject answer_el_bindings = inference_datastructures_inference.inference_answer_bindings(v_answer);
            SubLObject query_formula = inference_datastructures_inference.inference_el_query(inference);
            final SubLObject query_properties = inference_datastructures_enumerated_types.inference_input_non_default_query_properties(inference);
            SubLObject relevant_el_bindings = NIL;
            SubLObject cdolist_list_var_$103 = answer_el_bindings;
            SubLObject answer_el_binding = NIL;
            answer_el_binding = cdolist_list_var_$103.first();
            while (NIL != cdolist_list_var_$103) {
                if (NIL != subl_promotions.memberP(answer_el_binding.first(), el_variables, UNPROVIDED, UNPROVIDED)) {
                    relevant_el_bindings = cons(answer_el_binding, relevant_el_bindings);
                }
                cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                answer_el_binding = cdolist_list_var_$103.first();
            } 
            query_formula = bindings.apply_bindings(relevant_el_bindings, query_formula);
            html_newline(UNPROVIDED);
            html_princ_strong($str775$Reifying_query_for__);
            cb_form(query_formula, NIL, T);
            cb_kb_query_state._csetf_kb_query_state_query_mts(kb_query_being_saved, list(inference_datastructures_inference.inference_mt(inference)));
            cb_kb_query_state._csetf_kb_query_state_sentences(kb_query_being_saved, list(query_formula));
            cb_kb_query_state._csetf_kb_query_state_query_properties(kb_query_being_saved, query_properties);
            cb_kb_query_state._csetf_kb_query_state_name(kb_query_being_saved, string_utilities.make_valid_constant_name(cconcatenate(format_nil.format_nil_a_no_copy($$$query_about), new SubLObject[]{ $$$_, format_nil.format_nil_a_no_copy(query_formula.first().isCons() ? query_formula.first().first() : query_formula.first()), $$$_, format_nil.format_nil_a_no_copy(relevant_el_bindings) }), UNPROVIDED));
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str777$New_Constant__);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            cb_kb_query.cb_kb_save_new_query(kb_query_being_saved, T);
            html_newline(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            answer_id = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject cb_link_save_inference_answers_as_queries(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str620$_Save_Answers_as_Queries_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_id = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str778$cb_save_inference_answers_as_quer, store_id, inference_id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_inference_answer_timeline(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
            if (NIL == inference) {
                return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str232$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                html_source_readability_terpri(UNPROVIDED);
                html_markup(html_macros.$html_title_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str780$Inference__A__A_Answer_Timeline, store_id_string, inference_id_string);
                html_markup(html_macros.$html_title_tail$.getGlobalValue());
                dhtml_macros.dhtml_with_dom_script();
                dhtml_macros.dhtml_with_toggle_visibility_support();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$104 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$105 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_big_head$.getGlobalValue());
                        html_princ_strong($$$Inference_Answer_Timeline);
                        html_markup(html_macros.$html_big_tail$.getGlobalValue());
                        html_princ($$$_for_);
                        cb_link($INFERENCE, inference, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        html_newline(TWO_INTEGER);
                        cb_show_inference_answer_timeline_image(inference, $list783);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$105, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$104, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } else {
            cdestructuring_bind_error(args, $list3);
        }
        return NIL;
    }

    public static SubLObject cb_link_inference_answer_timeline(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str785$_Answer_Timeline_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str786$cb_inference_answer_timeline__A__, store_suid, inference_suid);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return inference;
    }

    public static SubLObject cb_show_inference_answer_timeline_image(final SubLObject inference, SubLObject plot_properties) {
        if (plot_properties == UNPROVIDED) {
            plot_properties = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tuples = inference_answer_tuples_for_chart(inference);
        final SubLObject use_millisecondsP = numLE(list_utilities.last_one(tuples).first(), ONE_INTEGER);
        SubLObject chart_url = NIL;
        SubLObject s = NIL;
        try {
            s = make_private_string_output_stream();
            final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                write_string($str789$http___chart_apis_google_com_char, s, UNPROVIDED, UNPROVIDED);
                write_string($str790$cht_s, s, UNPROVIDED, UNPROVIDED);
                write_string($str791$_chs_600x450, s, UNPROVIDED, UNPROVIDED);
                final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
                final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
                final SubLObject title = cconcatenate($$$Inference_, new SubLObject[]{ format_nil.format_nil_a_no_copy(store_suid), $str410$_, format_nil.format_nil_a_no_copy(inference_suid), $$$_Answer_Timeline });
                format(s, $str794$_chtt__A, web_utilities.html_url_encode(title, UNPROVIDED));
                final SubLObject last_tuple = list_utilities.last_one(tuples);
                final SubLObject last_time = multiply(NIL != use_millisecondsP ? $int$1000 : ONE_INTEGER, number_utilities.significant_digits(last_tuple.first(), THREE_INTEGER));
                final SubLObject last_answer = max(TWO_INTEGER, second(last_tuple));
                format(s, $str795$_chds__S__S__S__S, new SubLObject[]{ ZERO_INTEGER, last_time, ZERO_INTEGER, last_answer });
                write_string($str796$_chxt_x_y_x_y, s, UNPROVIDED, UNPROVIDED);
                format(s, $str797$_chxr_0__S__S_1__S__S, new SubLObject[]{ ZERO_INTEGER, last_time, ZERO_INTEGER, last_answer });
                final SubLObject xunits = (NIL != use_millisecondsP) ? $$$milliseconds : $$$seconds;
                final SubLObject xlabel = cconcatenate($str800$Time__, new SubLObject[]{ format_nil.format_nil_a_no_copy(xunits), $str577$_ });
                final SubLObject ylabel = $str801$Answer__;
                format(s, $str802$_chxl_2___A_3___A, web_utilities.html_url_encode(xlabel, UNPROVIDED), web_utilities.html_url_encode(ylabel, UNPROVIDED));
                format(s, $str803$_chxp_2__S_3__S, $int$50, $int$50);
                write_string($str805$_chd_t_, s, UNPROVIDED, UNPROVIDED);
                SubLObject list_var = NIL;
                SubLObject tuple = NIL;
                SubLObject index = NIL;
                list_var = tuples;
                tuple = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple = list_var.first() , index = add(ONE_INTEGER, index)) {
                    SubLObject time = number_utilities.significant_digits(tuple.first(), THREE_INTEGER);
                    if (NIL != use_millisecondsP) {
                        time = round(multiply(time, $int$1000), UNPROVIDED);
                    }
                    if (!index.isZero()) {
                        write_string($str806$_, s, UNPROVIDED, UNPROVIDED);
                    }
                    princ(time, s);
                }
                write_string($str409$_, s, UNPROVIDED, UNPROVIDED);
                list_var = NIL;
                tuple = NIL;
                index = NIL;
                list_var = tuples;
                tuple = list_var.first();
                for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , tuple = list_var.first() , index = add(ONE_INTEGER, index)) {
                    final SubLObject v_answer = second(tuple);
                    if (!index.isZero()) {
                        write_string($str806$_, s, UNPROVIDED, UNPROVIDED);
                    }
                    princ(v_answer, s);
                }
            } finally {
                $read_default_float_format$.rebind(_prev_bind_0, thread);
            }
            chart_url = get_output_stream_string(s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                close(s, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        html_markup(html_macros.$html_image_head$.getGlobalValue());
        html_markup(html_macros.$html_image_src$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(chart_url);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_image_height$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($int$450);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_image_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($int$600);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_image_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject inference_answer_tuples_for_chart(final SubLObject inference) {
        final SubLObject tuples = plot_generation.inference_answer_elapsed_time_tuples(inference);
        if (NIL != list_utilities.lengthLE(tuples, $int$120, UNPROVIDED)) {
            return tuples;
        }
        final SubLObject total = length(tuples);
        final SubLObject first_10 = list_utilities.first_n(TEN_INTEGER, tuples);
        SubLObject middle = subseq(tuples, TEN_INTEGER, subtract(total, TWENTY_INTEGER));
        final SubLObject last_10 = list_utilities.last_n(TEN_INTEGER, tuples);
        middle = list_utilities.randomize_list(middle);
        middle = list_utilities.first_n($int$100, middle);
        middle = Sort.sort(middle, symbol_function($sym810$_), symbol_function(SECOND));
        final SubLObject result_tuples = nconc(first_10, middle, last_10);
        return result_tuples;
    }

    public static SubLObject cb_inference_strengthen_properties(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        SubLObject mode_string = NIL;
        destructuring_bind_must_consp(args, args, $list812);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list812);
        inference_id_string = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, args, $list812);
        mode_string = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list812);
            return NIL;
        }
        final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
        if (NIL == inference) {
            return cb_error($str598$Inference__A_in_problem_store__A_, inference_id_string, store_id_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject mode = read_from_string_ignoring_errors(mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject query_properties = NIL;
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($ALL)) {
            query_properties = inference_parameters.inference_compute_all_answers_query_properties(inference);
        } else {
            if (!pcase_var.eql($SOME)) {
                return cb_error($str814$Unexpected_mode__A, mode_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            query_properties = inference_parameters.inference_compute_some_answer_query_properties(inference);
        }
        final SubLObject sentence = inference_datastructures_inference.inference_input_el_query(inference);
        final SubLObject mt = inference_datastructures_inference.inference_input_mt(inference);
        return cb_parameter_strengthened_query(sentence, mt, query_properties, UNPROVIDED);
    }

    public static SubLObject cb_link_inference_strengthen_properties(final SubLObject inference, final SubLObject mode, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str816$_Strengthen_Parameters_;
        }
        assert NIL != inference_datastructures_inference.inference_p(inference) : "inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) " + inference;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.member_eqP(mode, $list817))) {
            Errors.error($str818$_S_was_an_invalid_mode, mode);
        }
        final SubLObject store_suid = inference_datastructures_inference.inference_problem_store_suid(inference);
        final SubLObject inference_suid = inference_datastructures_inference.inference_suid(inference);
        final SubLObject frame_name_var = cb_frame_name($MAIN);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str819$cb_inference_strengthen_propertie, new SubLObject[]{ store_suid, inference_suid, mode });
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return inference;
    }

    public static SubLObject query_tool_default_for_property(final SubLObject query_property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_enumerated_types.query_property_p(query_property) : "inference_datastructures_enumerated_types.query_property_p(query_property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(query_property) " + query_property;
        SubLObject value = NIL;
        SubLObject specifiedP = NIL;
        if (NIL != inference_datastructures_enumerated_types.inference_dynamic_property_p(query_property)) {
            thread.resetMultipleValues();
            final SubLObject value_$106 = scaled_property_default_spec_lookup(query_property, $cb_basic_inference_resource_constraints$.getGlobalValue());
            final SubLObject specifiedP_$107 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            value = value_$106;
            specifiedP = specifiedP_$107;
            if (NIL == specifiedP) {
                thread.resetMultipleValues();
                final SubLObject value_$107 = scaled_property_default_spec_lookup(query_property, $cb_advanced_inference_dynamic_properties$.getGlobalValue());
                final SubLObject specifiedP_$108 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                value = value_$107;
                specifiedP = specifiedP_$108;
            }
        } else
            if (NIL != inference_datastructures_enumerated_types.inference_static_property_p(query_property)) {
                thread.resetMultipleValues();
                final SubLObject value_$108 = scaled_property_default_spec_lookup(query_property, $cb_advanced_inference_static_properties$.getGlobalValue());
                final SubLObject specifiedP_$109 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                value = value_$108;
                specifiedP = specifiedP_$109;
            } else
                if (NIL != inference_datastructures_enumerated_types.strategy_dynamic_property_p(query_property)) {
                    thread.resetMultipleValues();
                    final SubLObject value_$109 = scaled_property_default_spec_lookup(query_property, $cb_advanced_strategy_dynamic_properties$.getGlobalValue());
                    final SubLObject specifiedP_$110 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    value = value_$109;
                    specifiedP = specifiedP_$110;
                } else
                    if (NIL != inference_datastructures_enumerated_types.strategy_static_property_p(query_property)) {
                        thread.resetMultipleValues();
                        final SubLObject value_$110 = scaled_property_default_spec_lookup(query_property, $cb_advanced_strategy_static_properties$.getGlobalValue());
                        final SubLObject specifiedP_$111 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        value = value_$110;
                        specifiedP = specifiedP_$111;
                    } else
                        if (NIL != inference_datastructures_enumerated_types.problem_store_dynamic_property_p(query_property)) {
                            thread.resetMultipleValues();
                            final SubLObject value_$111 = scaled_property_default_spec_lookup(query_property, $cb_advanced_problem_store_dynamic_properties$.getGlobalValue());
                            final SubLObject specifiedP_$112 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            value = value_$111;
                            specifiedP = specifiedP_$112;
                        } else
                            if (NIL != inference_datastructures_enumerated_types.problem_store_static_property_p(query_property)) {
                                thread.resetMultipleValues();
                                final SubLObject value_$112 = scaled_property_default_spec_lookup(query_property, $cb_advanced_problem_store_static_properties$.getGlobalValue());
                                final SubLObject specifiedP_$113 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                value = value_$112;
                                specifiedP = specifiedP_$113;
                            }





        return values(value, specifiedP);
    }

    public static SubLObject scaled_property_default_spec_lookup(final SubLObject query_property, final SubLObject alist) {
        SubLObject value = NIL;
        SubLObject specifiedP = NIL;
        final SubLObject default_spec = assoc(query_property, alist, UNPROVIDED, UNPROVIDED);
        if (NIL != default_spec) {
            value = possibly_scale_value_on_input(second(default_spec), query_property);
            specifiedP = T;
        } else {
            value = NIL;
            specifiedP = NIL;
        }
        return values(value, specifiedP);
    }

    public static SubLObject cb_transformation_rule_statistics(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = args;
        final SubLObject verbosity_string = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list823);
        current = current.rest();
        if (NIL == current) {
            SubLObject verbosity_level = NIL;
            if (NIL != verbosity_string) {
                verbosity_level = read_from_string_ignoring_errors(verbosity_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                verbosity_level = $TERSE;
            }
            if (!verbosity_level.isKeyword()) {
                verbosity_level = $TERSE;
            }
            return cb_transformation_rule_statistics_int(verbosity_level);
        }
        cdestructuring_bind_error(datum, $list823);
        return NIL;
    }

    public static SubLObject cb_transformation_rule_statistics_int(final SubLObject verbosity_level) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var;
        final SubLObject title = title_var = $$$Experience_Control_Panel;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str232$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$120 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$121 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str235$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$122 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$123 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$123, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        final SubLObject frame_name_var = cb_frame_name(NIL);
                        html_markup(html_macros.$html_form_head$.getGlobalValue());
                        html_markup(html_macros.$html_form_action$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(system_parameters.$cyc_cgi_program$.getDynamicValue(thread));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_form_method$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$post);
                        html_char(CHAR_quotation, UNPROVIDED);
                        if (NIL != frame_name_var) {
                            html_markup(html_macros.$html_form_target$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(frame_name_var);
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$124 = html_macros.$html_safe_print$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = html_macros.$within_html_form$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = html_macros.$html_form_field_uniquifier_code$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_macros.$within_html_form$.bind(T, thread);
                            html_macros.$html_form_field_uniquifier_code$.bind(html_macros.next_html_form_field_uniquifier_code(), thread);
                            html_hidden_input($str827$cb_handle_transformation_rule_sta, T, UNPROVIDED);
                            cb_link($TRANSFORMATION_RULE_STATISTICS, $str244$_Refresh_, verbosity_level, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            cb_link($CLEAR_ALL_TRANSFORMATION_RULE_STATISTICS, $str830$_Clear_All_Experience_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(UNPROVIDED);
                            html_markup(html_macros.$html_table_head$.getGlobalValue());
                            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(ZERO_INTEGER);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$125 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$126 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$127 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str831$Load_experience_from_file___);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$127, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$128 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$128, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$129 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_filename_input($str832$load_filename, $str6$, $int$80);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$129, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$130 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$130, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$131 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_submit_input($$$Load_Experience, $$$load, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$131, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$126, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$132 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$133 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ($str835$Save_experience_to_file___);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$133, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$134 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$134, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$135 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_filename_input($str836$save_filename, $str6$, $int$80);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$135, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$136 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_indent(TWO_INTEGER);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$136, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$137 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_submit_input($$$Save_Experience, $$$save, UNPROVIDED);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$137, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$132, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$125, thread);
                            }
                            html_markup(html_macros.$html_table_tail$.getGlobalValue());
                            cb_show_transformation_rule_statistics(verbosity_level, UNPROVIDED);
                            html_macros.embed_form_field_code(html_macros.$html_form_field_uniquifier_code$.getDynamicValue(thread));
                        } finally {
                            html_macros.$html_form_field_uniquifier_code$.rebind(_prev_bind_3, thread);
                            html_macros.$within_html_form$.rebind(_prev_bind_2, thread);
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$124, thread);
                        }
                        html_markup(html_macros.$html_form_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$122, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$121, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$120, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_transformation_rule_statistics(SubLObject linktext, SubLObject verbosity_level) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Transformation_Rule_Statistics;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str840$cb_transformation_rule_statistics, verbosity_level);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_transformation_rule_statistics(SubLObject verbosity_level, SubLObject order) {
        if (verbosity_level == UNPROVIDED) {
            verbosity_level = $TERSE;
        }
        if (order == UNPROVIDED) {
            order = $HISTORICAL_UTILITY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rules = inference_analysis.transformation_rules_with_statistics(order, UNPROVIDED, UNPROVIDED);
        final SubLObject rule_count = length(rules);
        final SubLObject recent_rule_count = inference_analysis.transformation_rules_with_recent_statistics_count();
        final SubLObject received_rule_count = inference_analysis.transformation_rules_with_received_statistics_count();
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ZERO_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            SubLObject enabledP = inference_analysis.transformation_rule_statistics_update_enabledP();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$138 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$139 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str845$Gather_during_inference___);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$139, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$140 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, UNPROVIDED);
                    cb_show_boolean(enabledP);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$140, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$141 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_link(NIL != enabledP ? $DISABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE : $ENABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE, NIL != enabledP ? $str848$_Disable_ : $str849$_Enable_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$141, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$138, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            enabledP = inference_strategic_heuristics.strategic_heuristic_rule_historical_utility_enabledP();
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$142 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$143 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str850$Use_for_sorting_during_inference_);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$143, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$144 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, UNPROVIDED);
                    cb_show_boolean(enabledP);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$144, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$145 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_link(NIL != enabledP ? $DISABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY : $ENABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY, NIL != enabledP ? $str848$_Disable_ : $str849$_Enable_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$145, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$142, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            enabledP = eql(ONE_INTEGER, inference_analysis.$transformation_rule_historical_success_pruning_threshold$.getDynamicValue(thread));
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$146 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$147 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ($str853$Prune_never_before_successful_rul);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$147, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$148 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_glyph($NBSP, UNPROVIDED);
                    cb_show_boolean(enabledP);
                    html_glyph($NBSP, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$148, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$149 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    cb_link(NIL != enabledP ? $DISABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING : $ENABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING, NIL != enabledP ? $str848$_Disable_ : $str849$_Enable_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$149, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$146, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        if (!rule_count.isPositive()) {
            html_newline(UNPROVIDED);
            html_princ($$$No_rules);
            return ZERO_INTEGER;
        }
        final SubLObject load_history = inference_analysis.transformation_rule_statistics_filename_load_history();
        html_newline(UNPROVIDED);
        if (NIL != load_history) {
            html_princ($str857$Experience_files_that_have_been_l);
            SubLObject cdolist_list_var = load_history;
            SubLObject filename = NIL;
            filename = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                html_indent(TWO_INTEGER);
                html_princ(filename);
                cdolist_list_var = cdolist_list_var.rest();
                filename = cdolist_list_var.first();
            } 
        } else {
            html_princ($str858$No_experience_files_have_been_loa);
        }
        html_newline(UNPROVIDED);
        final SubLObject received_history = inference_analysis.transformation_rule_statistics_received_filename_load_history();
        html_newline(UNPROVIDED);
        if (NIL != received_history) {
            html_princ($str859$Experience_files_that_have_been_r);
            SubLObject cdolist_list_var = received_history;
            SubLObject filename = NIL;
            filename = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                html_newline(UNPROVIDED);
                html_indent(TWO_INTEGER);
                html_princ(filename);
                cdolist_list_var = cdolist_list_var.rest();
                filename = cdolist_list_var.first();
            } 
        } else {
            html_princ($str860$No_experience_files_have_been_rec);
        }
        html_newline(UNPROVIDED);
        final SubLObject total_considered_count = inference_analysis.total_transformation_rule_considered_count();
        final SubLObject total_success_count = inference_analysis.total_transformation_rule_success_count();
        html_newline(UNPROVIDED);
        html_princ($str861$Total_experience_);
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        format(html_macros.$html_stream$.getDynamicValue(thread), $str862$_S_rule_considerations, total_considered_count);
        html_newline(UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str863$_S_rule_successes, total_success_count);
        html_newline(UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str864$_S_rules, rule_count);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_indent(TWO_INTEGER);
        if ($ALL == verbosity_level) {
            html_princ($str865$_see_below_);
        } else {
            cb_link($TRANSFORMATION_RULE_STATISTICS, $str866$_Show_Rule_Details_, $ALL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        final SubLObject recent_considered_count = inference_analysis.total_transformation_rule_recent_considered_count();
        final SubLObject recent_success_count = inference_analysis.total_transformation_rule_recent_success_count();
        html_newline(UNPROVIDED);
        html_princ($str867$Experience_acquired_by_this_image);
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        format(html_macros.$html_stream$.getDynamicValue(thread), $str862$_S_rule_considerations, recent_considered_count);
        html_newline(UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str863$_S_rule_successes, recent_success_count);
        html_newline(UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str864$_S_rules, recent_rule_count);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_indent(TWO_INTEGER);
        if ($IMAGE_SPECIFIC == verbosity_level) {
            html_princ($str865$_see_below_);
        } else {
            cb_link($TRANSFORMATION_RULE_STATISTICS, $str866$_Show_Rule_Details_, $IMAGE_SPECIFIC, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        final SubLObject received_considered_count = inference_analysis.total_transformation_rule_received_considered_count();
        final SubLObject received_success_count = inference_analysis.total_transformation_rule_received_success_count();
        html_newline(UNPROVIDED);
        html_princ($str869$Experience_received_from_other_im);
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_strong_head$.getGlobalValue());
        format(html_macros.$html_stream$.getDynamicValue(thread), $str862$_S_rule_considerations, received_considered_count);
        html_newline(UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str863$_S_rule_successes, received_success_count);
        html_newline(UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str864$_S_rules, received_rule_count);
        html_markup(html_macros.$html_strong_tail$.getGlobalValue());
        html_indent(TWO_INTEGER);
        if ($IMAGE_SPECIFIC == verbosity_level) {
            html_princ($str865$_see_below_);
        } else {
            cb_link($TRANSFORMATION_RULE_STATISTICS, $str866$_Show_Rule_Details_, $IMAGE_SPECIFIC, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        html_newline(UNPROVIDED);
        cb_system_tools.possibly_insert_experience_options();
        final SubLObject utility_histogram = copy_tree($list870);
        SubLObject cdolist_list_var = rules;
        SubLObject rule = NIL;
        rule = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject utility = inference_analysis.transformation_rule_historical_utility(rule);
            final SubLObject entry = find(utility, utility_histogram, symbol_function($sym871$__), symbol_function(CAR), UNPROVIDED, UNPROVIDED);
            rplacd(entry, add(entry.rest(), ONE_INTEGER));
            cdolist_list_var = cdolist_list_var.rest();
            rule = cdolist_list_var.first();
        } 
        html_newline(UNPROVIDED);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$150 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(FOUR_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$151 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Rule_Utility_Histogram);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$151, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$150, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$152 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$153 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Utility);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$153, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($RIGHT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$154 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Count);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$154, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$155 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Percent);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$155, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$152, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject max_bucket_count = number_utilities.maximum(Mapping.mapcar(symbol_function(CDR), utility_histogram), UNPROVIDED);
            SubLObject cdolist_list_var2 = utility_histogram;
            SubLObject histogram_entry = NIL;
            histogram_entry = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = histogram_entry;
                SubLObject bucket = NIL;
                SubLObject bucket_count = NIL;
                destructuring_bind_must_consp(current, datum, $list879);
                bucket = current.first();
                current = bucket_count = current.rest();
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$156 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$157 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(bucket);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$157, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$158 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(bucket_count);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$158, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$159 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        format(html_macros.$html_stream$.getDynamicValue(thread), $str880$_A__, number_utilities.significant_digits(divide(truncate(multiply($int$1000, divide(bucket_count, rule_count)), UNPROVIDED), TEN_INTEGER), THREE_INTEGER));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$159, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$160 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_percent_progress_bar(bucket_count, max_bucket_count, $int$40, html_macros.$html_color_sat_green$.getGlobalValue(), NIL);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$160, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$156, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                cdolist_list_var2 = cdolist_list_var2.rest();
                histogram_entry = cdolist_list_var2.first();
            } 
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        html_newline(TWO_INTEGER);
        final SubLObject pcase_var = verbosity_level;
        if (pcase_var.eql($IMAGE_SPECIFIC)) {
            final SubLObject recent_rules = inference_analysis.transformation_rules_with_statistics(order, T, UNPROVIDED);
            html_markup(html_macros.$html_strong_head$.getGlobalValue());
            format(html_macros.$html_stream$.getDynamicValue(thread), $str882$_S_rules_with_image_specific_expe, recent_rule_count, order);
            html_markup(html_macros.$html_strong_tail$.getGlobalValue());
            html_indent(TWO_INTEGER);
            cb_link($TRANSFORMATION_RULE_STATISTICS, $str883$_Hide_Rule_Details_, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var3 = recent_rules;
            SubLObject rule2 = NIL;
            rule2 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                cb_show_transformation_rule_statistics_int(rule2);
                cdolist_list_var3 = cdolist_list_var3.rest();
                rule2 = cdolist_list_var3.first();
            } 
        } else
            if (pcase_var.eql($ALL)) {
                html_markup(html_macros.$html_strong_head$.getGlobalValue());
                format(html_macros.$html_stream$.getDynamicValue(thread), $str884$_S_rules__sorted_by__A, rule_count, order);
                html_markup(html_macros.$html_strong_tail$.getGlobalValue());
                html_indent(TWO_INTEGER);
                cb_link($TRANSFORMATION_RULE_STATISTICS, $str883$_Hide_Rule_Details_, $TERSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = rules;
                rule = NIL;
                rule = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    cb_show_transformation_rule_statistics_int(rule);
                    cdolist_list_var = cdolist_list_var.rest();
                    rule = cdolist_list_var.first();
                } 
            }

        return length(rules);
    }

    public static SubLObject cb_show_transformation_rule_statistics_int(final SubLObject rule) {
        html_newline(TWO_INTEGER);
        cb_show_transformation_rule_statistics_for_rule(rule, $TERSE);
        html_newline(UNPROVIDED);
        cb_show_assertion_readably(rule, T, T);
        return rule;
    }

    public static SubLObject cb_show_transformation_rule_statistics_for_rule(final SubLObject rule, final SubLObject verbosity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject considered = inference_analysis.transformation_rule_considered_count(rule);
        final SubLObject success = inference_analysis.transformation_rule_success_count(rule);
        final SubLObject probability = inference_analysis.transformation_rule_success_probability(rule, UNPROVIDED);
        final SubLObject utility = inference_analysis.transformation_rule_historical_utility(rule);
        if (verbosity.eql($TERSE)) {
            cb_show_transformation_rule_utility_keyword(utility);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str885$__S__S___S_____utility____S, new SubLObject[]{ success, considered, number_utilities.significant_digits(multiply($int$100, probability), FOUR_INTEGER), utility });
        } else {
            cb_show_transformation_rule_utility_keyword(utility);
            format(html_macros.$html_stream$.getDynamicValue(thread), $str886$__S_utility, utility);
            if (considered.isZero()) {
                html_princ($str887$__never_considered);
            } else {
                format(html_macros.$html_stream$.getDynamicValue(thread), $str888$__due_to__S___success___S__S_, new SubLObject[]{ number_utilities.significant_digits(multiply($int$100, probability), FOUR_INTEGER), success, considered });
            }
        }
        return rule;
    }

    public static SubLObject cb_show_transformation_rule_utility_keyword(final SubLObject utility) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject color = transformation_rule_utility_color_and_keyword(utility);
        final SubLObject keyword = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject string = cconcatenate(keyword, $str889$__);
        final SubLObject explanation = cconcatenate(format_nil.format_nil_a_no_copy(keyword), $str890$_mode_is_the_least_powerful_infer);
        html_markup(html_macros.$html_font_head$.getGlobalValue());
        if (NIL != color) {
            html_markup(html_macros.$html_font_color$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_color(color));
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_princ_strong_with_explanation(string, explanation, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_font_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject transformation_rule_utility_color_and_keyword(final SubLObject utility) {
        final SubLObject min_shallow_utility = inference_parameters.min_rule_utility_for_inference_mode($SHALLOW);
        final SubLObject min_extended_utility = inference_parameters.min_rule_utility_for_inference_mode($EXTENDED);
        final SubLObject min_maximal_utility = inference_parameters.min_rule_utility_for_inference_mode($MAXIMAL);
        if (utility.numGE(min_shallow_utility)) {
            return values($BLUE, $$$Shallow);
        }
        if (utility.numGE(min_extended_utility)) {
            return values($MAGENTA, $$$Extended);
        }
        if (utility.numGE(min_maximal_utility)) {
            return values($RED, $$$Maximal);
        }
        return values($RED, $$$Forbidden);
    }

    public static SubLObject cb_disable_strategic_heuristic_rule_historical_utility(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_strategic_heuristics.disable_strategic_heuristic_rule_historical_utility();
        return cb_transformation_rule_statistics(UNPROVIDED);
    }

    public static SubLObject cb_link_disable_strategic_heuristic_rule_historical_utility(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str848$_Disable_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str900$cb_disable_strategic_heuristic_ru);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_enable_strategic_heuristic_rule_historical_utility(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_strategic_heuristics.enable_strategic_heuristic_rule_historical_utility();
        return cb_transformation_rule_statistics(UNPROVIDED);
    }

    public static SubLObject cb_link_enable_strategic_heuristic_rule_historical_utility(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str849$_Enable_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str903$cb_enable_strategic_heuristic_rul);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_disable_transformation_rule_statistics_update(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_analysis.disable_transformation_rule_statistics_update();
        return cb_transformation_rule_statistics(UNPROVIDED);
    }

    public static SubLObject cb_link_disable_transformation_rule_statistics_update(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str848$_Disable_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str906$cb_disable_transformation_rule_st);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_enable_transformation_rule_statistics_update(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_analysis.enable_transformation_rule_statistics_update();
        return cb_transformation_rule_statistics(UNPROVIDED);
    }

    public static SubLObject cb_link_enable_transformation_rule_statistics_update(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str849$_Enable_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str909$cb_enable_transformation_rule_sta);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_disable_transformation_rule_historical_success_pruning(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_analysis.$transformation_rule_historical_success_pruning_threshold$.setDynamicValue(ZERO_INTEGER);
        return cb_transformation_rule_statistics(UNPROVIDED);
    }

    public static SubLObject cb_link_disable_transformation_rule_historical_success_pruning(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str848$_Disable_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str912$cb_disable_transformation_rule_hi);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_enable_transformation_rule_historical_success_pruning(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_analysis.$transformation_rule_historical_success_pruning_threshold$.setDynamicValue(ONE_INTEGER);
        return cb_transformation_rule_statistics(UNPROVIDED);
    }

    public static SubLObject cb_link_enable_transformation_rule_historical_success_pruning(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str849$_Enable_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str915$cb_enable_transformation_rule_his);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_clear_transformation_rule_statistics(final SubLObject args) {
        SubLObject assertion_id = NIL;
        destructuring_bind_must_consp(args, args, $list917);
        assertion_id = args.first();
        final SubLObject current = args.rest();
        if (NIL != current) {
            cdestructuring_bind_error(args, $list917);
            return NIL;
        }
        final SubLObject rule = cb_guess_assertion(assertion_id);
        if (NIL == rule) {
            return cb_error($str918$Could_not_determine_an_assertion_, assertion_id, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        inference_analysis.clear_transformation_rule_statistics(rule);
        return cb_simple_message_page($str919$The_transformation_statistics_hav, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_link_clear_transformation_rule_statistics(final SubLObject rule, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str921$_Clear_;
        }
        final SubLObject id = assertion_handles.assertion_id(rule);
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str922$cb_clear_transformation_rule_stat, id);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return rule;
    }

    public static SubLObject cb_clear_all_transformation_rule_statistics(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_analysis.clear_all_transformation_rule_statistics();
        return cb_transformation_rule_statistics(UNPROVIDED);
    }

    public static SubLObject cb_link_clear_all_transformation_rule_statistics(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str926$_Clear_All_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str927$cb_clear_all_transformation_rule_);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_handle_transformation_rule_statistics(final SubLObject args) {
        final SubLObject loadP = list_utilities.sublisp_boolean(html_extract_input($$$load, args));
        final SubLObject saveP = list_utilities.sublisp_boolean(html_extract_input($$$save, args));
        if (loadP.eql(saveP)) {
            return cb_error($str929$Must_specify_either_load_or_save_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != loadP) {
            return cb_handle_transformation_rule_statistics_load(args);
        }
        if (NIL != saveP) {
            return cb_handle_transformation_rule_statistics_save(args);
        }
        return cb_error($str930$Unexpected_args__s, args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cb_handle_transformation_rule_statistics_load(final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject load_filename = html_extract_input($str832$load_filename, args);
        SubLObject non_existentP = NIL;
        if (NIL != load_filename) {
            load_filename = string_utilities.trim_whitespace(load_filename);
            if (NIL != string_utilities.empty_stringP(load_filename)) {
                load_filename = NIL;
            }
        }
        if (NIL != load_filename) {
            non_existentP = makeBoolean(NIL == Filesys.probe_file(load_filename));
        }
        if (NIL != non_existentP) {
            return cb_error($str932$The_specified_filename__S_could_n, load_filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == load_filename) {
            return cb_error($str933$No_filename_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject _prev_bind_0 = inference_analysis.$transformation_rule_statistics_update_enabledP$.currentBinding(thread);
        try {
            inference_analysis.$transformation_rule_statistics_update_enabledP$.bind(T, thread);
            inference_analysis.load_transformation_rule_statistics(load_filename, T, UNPROVIDED);
        } finally {
            inference_analysis.$transformation_rule_statistics_update_enabledP$.rebind(_prev_bind_0, thread);
        }
        return cb_transformation_rule_statistics_int(NIL);
    }

    public static SubLObject cb_handle_transformation_rule_statistics_save(final SubLObject args) {
        SubLObject save_filename = html_extract_input($str836$save_filename, args);
        SubLObject invalid_for_writingP = NIL;
        if (NIL != save_filename) {
            save_filename = string_utilities.trim_whitespace(save_filename);
            if (NIL != string_utilities.empty_stringP(save_filename)) {
                save_filename = NIL;
            }
        }
        if (NIL != save_filename) {
            invalid_for_writingP = makeBoolean(NIL == file_utilities.file_valid_for_writing_p(save_filename));
        }
        if (NIL != invalid_for_writingP) {
            return cb_error($str935$The_specified_filename__S_could_n, save_filename, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == save_filename) {
            return cb_error($str933$No_filename_was_specified_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        inference_analysis.save_transformation_rule_statistics(save_filename, NIL);
        return cb_message_page_with_history($str936$Experience_saved_, UNPROVIDED);
    }

    public static SubLObject cb_forward_inference_metrics(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var = $$$Forward_Inference_Metrics;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str232$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$161 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                dhtml_macros.html_basic_cb_scripts();
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$162 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str235$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$163 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$164 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh_Frames);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$164, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        if (NIL != title_var) {
                            html_markup(html_macros.$html_heading_head$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                            html_princ(title_var);
                            html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                            html_markup(TWO_INTEGER);
                            html_char(CHAR_greater, UNPROVIDED);
                        }
                        dhtml_macros.dhtml_with_toggle_visibility_support();
                        cb_show_forward_inference_metrics(UNPROVIDED);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$163, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$162, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$161, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_link_forward_inference_metrics(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $$$Forward_Inference_Metrics;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str940$cb_forward_inference_metrics);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_rule_forward_inference_metrics(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = args;
        SubLObject id = NIL;
        destructuring_bind_must_consp(current, datum, $list943);
        id = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject rule = cb_guess_assertion(id);
            final SubLObject global_info = inference_metrics.forward_inference_metrics_info(UNPROVIDED);
            final SubLObject rule_info = inference_metrics.rule_forward_inference_metrics_info(rule);
            final SubLObject global_statistics = inference_metrics.global_statistics_from_forward_inference_metrics_info(global_info);
            final SubLObject title_var = $$$Rule_Forward_Inference_Metrics;
            final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
            try {
                html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
                if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup($str232$_meta_http_equiv__X_UA_Compatible);
                }
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$165 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
                try {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                    html_markup(html_macros.$html_html_head$.getGlobalValue());
                    html_markup(html_macros.$html_head_head$.getGlobalValue());
                    html_macros.html_head_content_type();
                    cb_head_shortcut_icon();
                    html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                    cyc_file_dependencies.css($CB_CYC);
                    dhtml_macros.html_basic_cb_scripts();
                    if (NIL != title_var) {
                        html_source_readability_terpri(UNPROVIDED);
                        html_markup(html_macros.$html_title_head$.getGlobalValue());
                        html_princ(title_var);
                        html_markup(html_macros.$html_title_tail$.getGlobalValue());
                    }
                    html_markup(html_macros.$html_head_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                    final SubLObject _prev_bind_0_$166 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                    try {
                        html_macros.$html_inside_bodyP$.bind(T, thread);
                        html_markup(html_macros.$html_body_head$.getGlobalValue());
                        if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                            html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                            html_char(CHAR_quotation, UNPROVIDED);
                        }
                        html_markup(html_macros.$html_body_class$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($str235$yui_skin_sam);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$167 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_div_head$.getGlobalValue());
                            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reloadFrameButton);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$168 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_input_head$.getGlobalValue());
                                html_markup(html_macros.$html_input_type$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$button);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_name$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup($$$reload);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_input_value$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_princ($$$Refresh_Frames);
                                html_char(CHAR_quotation, UNPROVIDED);
                                if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                    html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                                }
                                html_char(CHAR_greater, UNPROVIDED);
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$168, thread);
                            }
                            html_markup(html_macros.$html_div_tail$.getGlobalValue());
                            if (NIL != title_var) {
                                html_markup(html_macros.$html_heading_head$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                                html_princ(title_var);
                                html_markup(html_macros.$html_heading_tail$.getGlobalValue());
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_greater, UNPROVIDED);
                            }
                            cb_link($RULE_FORWARD_INFERENCE_METRICS, rule, $str244$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(UNPROVIDED);
                            cb_link($FORWARD_INFERENCE_METRICS, $str946$_All_Forward_Inference_Metrics_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_newline(TWO_INTEGER);
                            cb_show_rule_forward_inference_metrics(rule_info, $VERBOSE, global_statistics, UNPROVIDED);
                            html_source_readability_terpri(UNPROVIDED);
                            html_copyright_notice();
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$167, thread);
                        }
                        html_markup(html_macros.$html_body_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                    } finally {
                        html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$166, thread);
                    }
                    html_markup(html_macros.$html_html_tail$.getGlobalValue());
                } finally {
                    cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$165, thread);
                }
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list943);
        }
        return NIL;
    }

    public static SubLObject cb_link_rule_forward_inference_metrics(final SubLObject rule, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str949$_Forward_Inference_Metrics_;
        }
        if (NIL != assertions_high.rule_assertionP(rule)) {
            final SubLObject id = assertion_handles.assertion_id(rule);
            final SubLObject frame_name_var = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str950$cb_rule_forward_inference_metrics, id);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        } else {
            final SubLObject frame_name_var2 = cb_frame_name($SELF);
            html_markup(html_macros.$html_anchor_head$.getGlobalValue());
            html_markup(html_macros.$html_anchor_href$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            cyc_cgi_url_int();
            format(html_macros.$html_stream$.getDynamicValue(thread), $str951$cb_rule_forward_inference_metrics);
            html_char(CHAR_quotation, UNPROVIDED);
            if (NIL != frame_name_var2) {
                html_markup(html_macros.$html_anchor_target$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(frame_name_var2);
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_2 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_princ(linktext);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_2, thread);
            }
            html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        }
        return rule;
    }

    public static SubLObject cb_clear_forward_inference_metrics(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_metrics.clear_forward_inference_metrics();
        return cb_forward_inference_metrics(UNPROVIDED);
    }

    public static SubLObject cb_link_clear_forward_inference_metrics(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str954$_Clear_Forward_Metrics_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str955$cb_clear_forward_inference_metric);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_start_gathering_forward_inference_metrics(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_metrics.$gathering_forward_inference_metricsP$.setDynamicValue(T);
        return cb_forward_inference_metrics(UNPROVIDED);
    }

    public static SubLObject cb_link_start_gathering_forward_inference_metrics(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str959$_Start_Gathering_Metrics_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str960$cb_start_gathering_forward_infere);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_stop_gathering_forward_inference_metrics(SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        inference_metrics.$gathering_forward_inference_metricsP$.setDynamicValue(NIL);
        return cb_forward_inference_metrics(UNPROVIDED);
    }

    public static SubLObject cb_link_stop_gathering_forward_inference_metrics(SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str964$_Stop_Gathering_Metrics_;
        }
        final SubLObject frame_name_var = cb_frame_name($SELF);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        html_princ($str965$cb_stop_gathering_forward_inferen);
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_forward_inference_metrics(SubLObject threshold) {
        if (threshold == UNPROVIDED) {
            threshold = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject info = inference_metrics.forward_inference_metrics_info(threshold);
        final SubLObject global_statistics = inference_metrics.global_statistics_from_forward_inference_metrics_info(info);
        final SubLObject success_statistics = inference_metrics.forward_inference_success_metrics_from_info(info);
        final SubLObject metric_time_totals_statistics = inference_metrics.forward_inference_metrics_time_totals();
        final SubLObject metric_count_totals_statistics = inference_metrics.forward_inference_metrics_count_totals();
        cb_link($FORWARD_INFERENCE_METRICS, $str244$_Refresh_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_indent(UNPROVIDED);
        if (NIL != info) {
            cb_link($CLEAR_FORWARD_INFERENCE_METRICS, $str954$_Clear_Forward_Metrics_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            html_indent(UNPROVIDED);
        }
        if (NIL != inference_metrics.$gathering_forward_inference_metricsP$.getDynamicValue(thread)) {
            cb_link($STOP_GATHERING_FORWARD_INFERENCE_METRICS, $str964$_Stop_Gathering_Metrics_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            cb_link($START_GATHERING_FORWARD_INFERENCE_METRICS, $str959$_Start_Gathering_Metrics_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if (NIL == info) {
            html_newline(TWO_INTEGER);
            if (NIL != inference_metrics.$gathering_forward_inference_metricsP$.getDynamicValue(thread)) {
                html_princ($str968$_No_forward_inference_metrics_hav);
            } else {
                html_princ($str969$No_forward_inference_metrics_have);
            }
        } else {
            final SubLObject current;
            final SubLObject datum = current = global_statistics;
            final SubLObject total_time_tail = property_list_member($TOTAL_TIME, current);
            final SubLObject total_time = (NIL != total_time_tail) ? cadr(total_time_tail) : NIL;
            final SubLObject total_inference_time_tail = property_list_member($TOTAL_INFERENCE_TIME, current);
            final SubLObject total_inference_time = (NIL != total_inference_time_tail) ? cadr(total_inference_time_tail) : NIL;
            final SubLObject total_inferences_tail = property_list_member($TOTAL_INFERENCES, current);
            final SubLObject total_inferences = (NIL != total_inferences_tail) ? cadr(total_inferences_tail) : NIL;
            final SubLObject total_triggers_tail = property_list_member($TOTAL_TRIGGERS, current);
            final SubLObject total_triggers = (NIL != total_triggers_tail) ? cadr(total_triggers_tail) : NIL;
            final SubLObject total_rules_tail = property_list_member($TOTAL_RULES, current);
            final SubLObject total_rules = (NIL != total_rules_tail) ? cadr(total_rules_tail) : NIL;
            final SubLObject average_inferences_per_rule_tail = property_list_member($AVERAGE_INFERENCES_PER_RULE, current);
            final SubLObject average_inferences_per_rule = (NIL != average_inferences_per_rule_tail) ? cadr(average_inferences_per_rule_tail) : NIL;
            final SubLObject stdev_inferences_per_rule_tail = property_list_member($STDEV_INFERENCES_PER_RULE, current);
            final SubLObject stdev_inferences_per_rule = (NIL != stdev_inferences_per_rule_tail) ? cadr(stdev_inferences_per_rule_tail) : NIL;
            final SubLObject average_trigger_per_rule_tail = property_list_member($AVERAGE_TRIGGER_PER_RULE, current);
            final SubLObject average_trigger_per_rule = (NIL != average_trigger_per_rule_tail) ? cadr(average_trigger_per_rule_tail) : NIL;
            final SubLObject stdev_trigger_per_rule_tail = property_list_member($STDEV_TRIGGER_PER_RULE, current);
            final SubLObject stdev_trigger_per_rule = (NIL != stdev_trigger_per_rule_tail) ? cadr(stdev_trigger_per_rule_tail) : NIL;
            final SubLObject average_time_per_rule_tail = property_list_member($AVERAGE_TIME_PER_RULE, current);
            final SubLObject average_time_per_rule = (NIL != average_time_per_rule_tail) ? cadr(average_time_per_rule_tail) : NIL;
            final SubLObject stdev_time_per_rule_tail = property_list_member($STDEV_TIME_PER_RULE, current);
            final SubLObject stdev_time_per_rule = (NIL != stdev_time_per_rule_tail) ? cadr(stdev_time_per_rule_tail) : NIL;
            final SubLObject average_time_per_inference_tail = property_list_member($AVERAGE_TIME_PER_INFERENCE, current);
            final SubLObject average_time_per_inference = (NIL != average_time_per_inference_tail) ? cadr(average_time_per_inference_tail) : NIL;
            final SubLObject stdev_time_per_inference_tail = property_list_member($STDEV_TIME_PER_INFERENCE, current);
            final SubLObject stdev_time_per_inference = (NIL != stdev_time_per_inference_tail) ? cadr(stdev_time_per_inference_tail) : NIL;
            final SubLObject average_time_per_trigger_tail = property_list_member($AVERAGE_TIME_PER_TRIGGER, current);
            final SubLObject average_time_per_trigger = (NIL != average_time_per_trigger_tail) ? cadr(average_time_per_trigger_tail) : NIL;
            final SubLObject stdev_time_per_trigger_tail = property_list_member($STDEV_TIME_PER_TRIGGER, current);
            final SubLObject stdev_time_per_trigger = (NIL != stdev_time_per_trigger_tail) ? cadr(stdev_time_per_trigger_tail) : NIL;
            final SubLObject current_$170;
            final SubLObject datum_$169 = current_$170 = success_statistics;
            final SubLObject success_rule_count_tail = property_list_member($SUCCESS_RULE_COUNT, current_$170);
            final SubLObject success_rule_count = (NIL != success_rule_count_tail) ? cadr(success_rule_count_tail) : NIL;
            final SubLObject success_trigger_count_tail = property_list_member($SUCCESS_TRIGGER_COUNT, current_$170);
            final SubLObject success_trigger_count = (NIL != success_trigger_count_tail) ? cadr(success_trigger_count_tail) : NIL;
            final SubLObject success_time_estimate_tail = property_list_member($SUCCESS_TIME_ESTIMATE, current_$170);
            final SubLObject success_time_estimate = (NIL != success_time_estimate_tail) ? cadr(success_time_estimate_tail) : NIL;
            final SubLObject success_rule_ratio_tail = property_list_member($SUCCESS_RULE_RATIO, current_$170);
            final SubLObject success_rule_ratio = (NIL != success_rule_ratio_tail) ? cadr(success_rule_ratio_tail) : NIL;
            final SubLObject success_trigger_ratio_tail = property_list_member($SUCCESS_TRIGGER_RATIO, current_$170);
            final SubLObject success_trigger_ratio = (NIL != success_trigger_ratio_tail) ? cadr(success_trigger_ratio_tail) : NIL;
            final SubLObject success_time_ratio_tail = property_list_member($SUCCESS_TIME_RATIO, current_$170);
            final SubLObject success_time_ratio = (NIL != success_time_ratio_tail) ? cadr(success_time_ratio_tail) : NIL;
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str991$Total_time__);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_princ(numeric_date_utilities.readable_elapsed_time_string_ms(total_time));
            html_newline(UNPROVIDED);
            html_markup(html_macros.$html_bold_head$.getGlobalValue());
            html_princ($str992$Inference_time__);
            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
            html_princ(numeric_date_utilities.readable_elapsed_time_string_ms(total_inference_time));
            format(html_macros.$html_stream$.getDynamicValue(thread), $str993$___A__, number_utilities.significant_digits(multiply($int$100, number_utilities.safe_X(total_inference_time, total_time)), THREE_INTEGER));
            html_newline(TWO_INTEGER);
            html_markup(html_macros.$html_table_head$.getGlobalValue());
            html_markup(html_macros.$html_table_border$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellpadding$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_table_cellspacing$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(ZERO_INTEGER);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$171 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$172 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Successful);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$173 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$174 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$171;
                                final SubLObject datum_$170 = current_$171 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(success_time_estimate), UNPROVIDED);
                                SubLObject time = NIL;
                                SubLObject units = NIL;
                                destructuring_bind_must_consp(current_$171, datum_$170, $list995);
                                time = current_$171.first();
                                current_$171 = current_$171.rest();
                                destructuring_bind_must_consp(current_$171, datum_$170, $list995);
                                units = current_$171.first();
                                current_$171 = current_$171.rest();
                                if (NIL == current_$171) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$175 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(time);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$175, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$176 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units);
                                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                                        html_markup(html_macros.$html_italic_head$.getGlobalValue());
                                        html_princ($str996$__est_);
                                        html_markup(html_macros.$html_italic_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$176, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$170, $list995);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$174, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$177 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$178 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(success_trigger_count);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$178, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$179 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str997$_inference_P, success_trigger_count);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$179, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$177, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$180 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$181 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(success_rule_count);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$181, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$182 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str998$_rule_P);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$182, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$180, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$183 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$184 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(success_trigger_count);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$184, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$185 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str999$_trigger_P, success_trigger_count);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$185, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$183, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$186 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$187 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$187, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$188 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$188, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$186, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$173, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$172, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$189 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$189, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$190 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Total);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$191 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$192 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$172;
                                final SubLObject datum_$171 = current_$172 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(total_inference_time), UNPROVIDED);
                                SubLObject time = NIL;
                                SubLObject units = NIL;
                                destructuring_bind_must_consp(current_$172, datum_$171, $list995);
                                time = current_$172.first();
                                current_$172 = current_$172.rest();
                                destructuring_bind_must_consp(current_$172, datum_$171, $list995);
                                units = current_$172.first();
                                current_$172 = current_$172.rest();
                                if (NIL == current_$172) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$193 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(time);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$193, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$194 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$194, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$171, $list995);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$192, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$195 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$196 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(total_inferences);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$196, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$197 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str997$_inference_P, total_inferences);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$197, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$195, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$198 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$199 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(total_rules);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$199, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$200 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str998$_rule_P, total_rules);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$200, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$198, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$201 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$202 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(total_triggers);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$202, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$203 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str999$_trigger_P, total_triggers);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$203, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$201, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$204 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$205 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$205, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$206 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$206, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$204, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$191, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$190, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$207 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$207, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$208 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($str1001$Success__);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$209 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$210 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$211 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(number_utilities.safe_percent(success_time_ratio, ONE_INTEGER, THREE_INTEGER));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$211, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$212 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str1002$__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$212, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$210, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$213 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$214 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(number_utilities.safe_percent(success_trigger_ratio, ONE_INTEGER, THREE_INTEGER));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$214, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$215 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str1002$__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$215, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$213, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$216 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$217 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(number_utilities.safe_percent(success_rule_ratio, ONE_INTEGER, THREE_INTEGER));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$217, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$218 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str1002$__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$218, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$216, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$219 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$220 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(number_utilities.safe_percent(success_trigger_ratio, ONE_INTEGER, THREE_INTEGER));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$220, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$221 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str1002$__);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$221, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$219, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$222 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$223 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$223, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$224 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_glyph($NBSP, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$224, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$222, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$209, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$208, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$225 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$225, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$226 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Averages);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$227 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$228 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$173;
                                final SubLObject datum_$172 = current_$173 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(average_time_per_rule), UNPROVIDED);
                                SubLObject time = NIL;
                                SubLObject units = NIL;
                                destructuring_bind_must_consp(current_$173, datum_$172, $list995);
                                time = current_$173.first();
                                current_$173 = current_$173.rest();
                                destructuring_bind_must_consp(current_$173, datum_$172, $list995);
                                units = current_$173.first();
                                current_$173 = current_$173.rest();
                                if (NIL == current_$173) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$229 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(time);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$229, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$230 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units);
                                        html_princ($str1004$___rule);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$230, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$172, $list995);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$228, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$231 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$232 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(number_utilities.significant_digits(average_inferences_per_rule, THREE_INTEGER));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$232, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$233 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str1005$_inferences___rule);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$233, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$231, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$234 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$174;
                                final SubLObject datum_$173 = current_$174 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(average_time_per_inference), UNPROVIDED);
                                SubLObject time = NIL;
                                SubLObject units = NIL;
                                destructuring_bind_must_consp(current_$174, datum_$173, $list995);
                                time = current_$174.first();
                                current_$174 = current_$174.rest();
                                destructuring_bind_must_consp(current_$174, datum_$173, $list995);
                                units = current_$174.first();
                                current_$174 = current_$174.rest();
                                if (NIL == current_$174) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$235 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(time);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$235, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$236 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units);
                                        html_princ($str1006$___inference);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$236, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$173, $list995);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$234, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$237 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$238 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(number_utilities.significant_digits(average_trigger_per_rule, THREE_INTEGER));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$238, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$239 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str1007$_triggers___rule);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$239, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$237, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$240 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$175;
                                final SubLObject datum_$174 = current_$175 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(average_time_per_trigger), UNPROVIDED);
                                SubLObject time = NIL;
                                SubLObject units = NIL;
                                destructuring_bind_must_consp(current_$175, datum_$174, $list995);
                                time = current_$175.first();
                                current_$175 = current_$175.rest();
                                destructuring_bind_must_consp(current_$175, datum_$174, $list995);
                                units = current_$175.first();
                                current_$175 = current_$175.rest();
                                if (NIL == current_$175) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$241 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(time);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$241, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$242 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units);
                                        html_princ($str1008$___trigger);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$242, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$174, $list995);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$240, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$227, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$226, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$243 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_indent(TWO_INTEGER);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$243, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$244 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ_strong($$$Standard_Deviations);
                        html_hr(UNPROVIDED, UNPROVIDED);
                        html_markup(html_macros.$html_table_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_border$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(ZERO_INTEGER);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$245 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$246 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$176;
                                final SubLObject datum_$175 = current_$176 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(stdev_time_per_rule), UNPROVIDED);
                                SubLObject time = NIL;
                                SubLObject units = NIL;
                                destructuring_bind_must_consp(current_$176, datum_$175, $list995);
                                time = current_$176.first();
                                current_$176 = current_$176.rest();
                                destructuring_bind_must_consp(current_$176, datum_$175, $list995);
                                units = current_$176.first();
                                current_$176 = current_$176.rest();
                                if (NIL == current_$176) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$247 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(time);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$247, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$248 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units);
                                        html_princ($str1004$___rule);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$248, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$175, $list995);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$246, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$249 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$250 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(number_utilities.significant_digits(stdev_inferences_per_rule, THREE_INTEGER));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$250, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$251 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str1005$_inferences___rule);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$251, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$249, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$252 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$177;
                                final SubLObject datum_$176 = current_$177 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(stdev_time_per_inference), UNPROVIDED);
                                SubLObject time = NIL;
                                SubLObject units = NIL;
                                destructuring_bind_must_consp(current_$177, datum_$176, $list995);
                                time = current_$177.first();
                                current_$177 = current_$177.rest();
                                destructuring_bind_must_consp(current_$177, datum_$176, $list995);
                                units = current_$177.first();
                                current_$177 = current_$177.rest();
                                if (NIL == current_$177) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$253 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(time);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$253, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$254 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units);
                                        html_princ($str1006$___inference);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$254, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$176, $list995);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$252, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$255 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$256 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(number_utilities.significant_digits(stdev_trigger_per_rule, THREE_INTEGER));
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$256, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($CENTER));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$257 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ($str1007$_triggers___rule);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$257, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$255, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$258 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$178;
                                final SubLObject datum_$177 = current_$178 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(stdev_time_per_trigger), UNPROVIDED);
                                SubLObject time = NIL;
                                SubLObject units = NIL;
                                destructuring_bind_must_consp(current_$178, datum_$177, $list995);
                                time = current_$178.first();
                                current_$178 = current_$178.rest();
                                destructuring_bind_must_consp(current_$178, datum_$177, $list995);
                                units = current_$178.first();
                                current_$178 = current_$178.rest();
                                if (NIL == current_$178) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$259 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(time);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$259, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($CENTER));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$260 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units);
                                        html_princ($str1008$___trigger);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$260, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$177, $list995);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$258, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$245, thread);
                        }
                        html_markup(html_macros.$html_table_tail$.getGlobalValue());
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$244, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$171, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_table_tail$.getGlobalValue());
            html_newline(UNPROVIDED);
            dhtml_macros.dhtml_switch_visibility_links($str259$other_inferences, $str1010$_Show_Metric_Histogram_, $str1011$_Hide_Metric_Histogram_);
            dhtml_macros.dhtml_set_switched_visibility($str259$other_inferences, $INVISIBLE, $TEXT);
            html_markup(html_macros.$html_div_head$.getGlobalValue());
            html_markup(html_macros.$html_attribute_id$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup($str259$other_inferences);
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                cb_forward_inference_metrics_times_and_counts_table(metric_time_totals_statistics, metric_count_totals_statistics);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_div_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            html_newline(UNPROVIDED);
            SubLObject cumulative_time = ZERO_INTEGER;
            SubLObject list_var = NIL;
            SubLObject rule_info = NIL;
            SubLObject index = NIL;
            list_var = info;
            rule_info = list_var.first();
            for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , rule_info = list_var.first() , index = add(ONE_INTEGER, index)) {
                if ((NIL == threshold) || index.numL(threshold)) {
                    final SubLObject time2 = getf(rule_info, $TIME, UNPROVIDED);
                    cumulative_time = add(cumulative_time, time2);
                    html_newline(UNPROVIDED);
                    cb_show_rule_forward_inference_metrics(rule_info, $cb_show_forward_inference_metrics_verbosity$.getDynamicValue(thread), global_statistics, cumulative_time);
                }
            }
        }
        return NIL;
    }

    public static SubLObject extend_metric_plist_with_totals(SubLObject metric_plist) {
        SubLObject remainder;
        SubLObject key;
        SubLObject value;
        for (remainder = NIL, remainder = metric_plist; NIL != remainder; remainder = cddr(remainder)) {
            key = remainder.first();
            value = cadr(remainder);
            if (key.isCons()) {
                metric_plist = putf(metric_plist, key.first(), add(list_utilities.plist_lookup(metric_plist, key.first(), ZERO_INTEGER), value));
            }
        }
        return metric_plist;
    }

    public static SubLObject cb_forward_inference_metrics_times_and_counts_table(SubLObject time_plist, SubLObject count_plist) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject total_time = apply($sym1013$_, list_utilities.plist_values(time_plist));
        time_plist = extend_metric_plist_with_totals(time_plist);
        time_plist = list_utilities.sort_plist_by_values(time_plist, $sym1014$SAFE__);
        count_plist = extend_metric_plist_with_totals(count_plist);
        count_plist = list_utilities.sort_plist_by_values(count_plist, $sym1014$SAFE__);
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$277 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$278 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Count);
                    html_hr(UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$278, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$279 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Metric);
                    html_hr(UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$279, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$280 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($$$Total_time);
                    html_hr(UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$280, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$281 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($str1017$_);
                    html_hr(UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$281, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(TWO_INTEGER);
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$282 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_princ_strong($str1018$Time___call);
                    html_hr(UNPROVIDED, UNPROVIDED);
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$282, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$277, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            SubLObject row_num = ZERO_INTEGER;
            SubLObject bgcolor = NIL;
            SubLObject remainder;
            SubLObject metric;
            SubLObject time;
            SubLObject count;
            SubLObject _prev_bind_0_$283;
            SubLObject _prev_bind_0_$284;
            SubLObject _prev_bind_0_$285;
            SubLObject current;
            SubLObject datum;
            SubLObject just_time;
            SubLObject units;
            SubLObject _prev_bind_0_$286;
            SubLObject _prev_bind_0_$287;
            SubLObject _prev_bind_0_$288;
            SubLObject _prev_bind_0_$289;
            SubLObject time_$290;
            SubLObject _prev_bind_0_$290;
            SubLObject _prev_bind_0_$291;
            for (remainder = NIL, remainder = time_plist; NIL != remainder; remainder = cddr(remainder)) {
                metric = remainder.first();
                time = cadr(remainder);
                if (metric.isCons()) {
                    row_num = add(row_num, ONE_INTEGER);
                    bgcolor = nth(mod(row_num, TWO_INTEGER), list(html_macros.$html_color_lighter_grey$.getGlobalValue(), html_macros.$html_color_lightest_grey$.getGlobalValue()));
                } else {
                    row_num = ZERO_INTEGER;
                    bgcolor = html_macros.$html_color_light_grey$.getGlobalValue();
                }
                count = getf(count_plist, metric, UNPROVIDED);
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                if (NIL != bgcolor) {
                    html_markup(html_macros.$html_table_row_bgcolor$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(bgcolor);
                    html_char(CHAR_quotation, UNPROVIDED);
                }
                html_char(CHAR_greater, UNPROVIDED);
                _prev_bind_0_$283 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$284 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(count);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$284, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$285 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if (metric.isCons()) {
                            cb_form(metric, UNPROVIDED, UNPROVIDED);
                        } else {
                            html_markup(html_macros.$html_bold_head$.getGlobalValue());
                            cb_form(metric, UNPROVIDED, UNPROVIDED);
                            html_markup(html_macros.$html_bold_tail$.getGlobalValue());
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$285, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    datum = current = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(time), UNPROVIDED);
                    just_time = NIL;
                    units = NIL;
                    destructuring_bind_must_consp(current, datum, $list1019);
                    just_time = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list1019);
                    units = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_0_$286 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(just_time);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$286, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_0_$287 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(units);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$287, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } else {
                        cdestructuring_bind_error(datum, $list1019);
                    }
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($RIGHT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$288 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ(number_utilities.safe_percent(time, total_time, THREE_INTEGER));
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$288, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($CENTER));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    _prev_bind_0_$289 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_princ($str1002$__);
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$289, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    datum = current = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(number_utilities.safe_X(time, count)), UNPROVIDED);
                    time_$290 = NIL;
                    units = NIL;
                    destructuring_bind_must_consp(current, datum, $list995);
                    time_$290 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list995);
                    units = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($RIGHT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_0_$290 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(time_$290);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$290, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($LEFT));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_align($CENTER));
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        _prev_bind_0_$291 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_princ(units);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$291, thread);
                        }
                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                    } else {
                        cdestructuring_bind_error(datum, $list995);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$283, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_rule_forward_inference_metrics(final SubLObject rule_info, final SubLObject verbosity, SubLObject global_statistics, SubLObject cumulative_time) {
        if (global_statistics == UNPROVIDED) {
            global_statistics = NIL;
        }
        if (cumulative_time == UNPROVIDED) {
            cumulative_time = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current;
        final SubLObject datum = current = global_statistics;
        final SubLObject total_time_tail = property_list_member($TOTAL_TIME, current);
        final SubLObject total_time = (NIL != total_time_tail) ? cadr(total_time_tail) : NIL;
        final SubLObject average_time_per_rule_tail = property_list_member($AVERAGE_TIME_PER_RULE, current);
        final SubLObject average_time_per_rule = (NIL != average_time_per_rule_tail) ? cadr(average_time_per_rule_tail) : NIL;
        final SubLObject stdev_time_per_rule_tail = property_list_member($STDEV_TIME_PER_RULE, current);
        final SubLObject stdev_time_per_rule = (NIL != stdev_time_per_rule_tail) ? cadr(stdev_time_per_rule_tail) : NIL;
        final SubLObject average_inferences_per_rule_tail = property_list_member($AVERAGE_INFERENCES_PER_RULE, current);
        final SubLObject average_inferences_per_rule = (NIL != average_inferences_per_rule_tail) ? cadr(average_inferences_per_rule_tail) : NIL;
        final SubLObject stdev_inferences_per_rule_tail = property_list_member($STDEV_INFERENCES_PER_RULE, current);
        final SubLObject stdev_inferences_per_rule = (NIL != stdev_inferences_per_rule_tail) ? cadr(stdev_inferences_per_rule_tail) : NIL;
        final SubLObject average_time_per_inference_tail = property_list_member($AVERAGE_TIME_PER_INFERENCE, current);
        final SubLObject average_time_per_inference = (NIL != average_time_per_inference_tail) ? cadr(average_time_per_inference_tail) : NIL;
        final SubLObject stdev_time_per_inference_tail = property_list_member($STDEV_TIME_PER_INFERENCE, current);
        final SubLObject stdev_time_per_inference = (NIL != stdev_time_per_inference_tail) ? cadr(stdev_time_per_inference_tail) : NIL;
        final SubLObject average_time_per_trigger_tail = property_list_member($AVERAGE_TIME_PER_TRIGGER, current);
        final SubLObject average_time_per_trigger = (NIL != average_time_per_trigger_tail) ? cadr(average_time_per_trigger_tail) : NIL;
        final SubLObject stdev_time_per_trigger_tail = property_list_member($STDEV_TIME_PER_TRIGGER, current);
        final SubLObject stdev_time_per_trigger = (NIL != stdev_time_per_trigger_tail) ? cadr(stdev_time_per_trigger_tail) : NIL;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = rule_info;
        SubLObject bad = NIL;
        SubLObject current_$295 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, rule_info, $list1020);
            current_$295 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, rule_info, $list1020);
            if (NIL == member(current_$295, $list1021, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$295 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(rule_info, $list1020);
        }
        final SubLObject rule_tail = property_list_member($RULE, rule_info);
        final SubLObject rule = (NIL != rule_tail) ? cadr(rule_tail) : NIL;
        final SubLObject time_tail = property_list_member($TIME, rule_info);
        final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
        final SubLObject inference_time_tail = property_list_member($INFERENCE_TIME, rule_info);
        final SubLObject inference_time = (NIL != inference_time_tail) ? cadr(inference_time_tail) : NIL;
        final SubLObject time_plist_tail = property_list_member($TIME_PLIST, rule_info);
        final SubLObject time_plist = (NIL != time_plist_tail) ? cadr(time_plist_tail) : NIL;
        final SubLObject count_plist_tail = property_list_member($COUNT_PLIST, rule_info);
        final SubLObject count_plist = (NIL != count_plist_tail) ? cadr(count_plist_tail) : NIL;
        final SubLObject trigger_gafs_tail = property_list_member($TRIGGER_GAFS, rule_info);
        final SubLObject trigger_gafs = (NIL != trigger_gafs_tail) ? cadr(trigger_gafs_tail) : NIL;
        final SubLObject inference_count_tail = property_list_member($INFERENCE_COUNT, rule_info);
        final SubLObject inference_count = (NIL != inference_count_tail) ? cadr(inference_count_tail) : NIL;
        final SubLObject inferences_tail = property_list_member($INFERENCES, rule_info);
        final SubLObject inferences = (NIL != inferences_tail) ? cadr(inferences_tail) : NIL;
        html_markup(html_macros.$html_table_head$.getGlobalValue());
        html_markup(html_macros.$html_table_border$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(ONE_INTEGER);
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup(html_macros.$html_table_width$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str595$100_);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$296 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($TOP));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str395$_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$297 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_border$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(ZERO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$298 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if ((NIL != global_statistics) && (NIL != cumulative_time)) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$299 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$300 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    final SubLObject cumulative_percent = (cumulative_time.numE(total_time)) ? $int$100 : number_utilities.safe_percent(cumulative_time, total_time, THREE_INTEGER);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str1029$cumulative_time__S_, cumulative_percent);
                                    html_newline(TWO_INTEGER);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$300, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$299, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$301 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            SubLObject current_$296;
                            final SubLObject datum_$302 = current_$296 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(time), UNPROVIDED);
                            SubLObject just_time = NIL;
                            SubLObject units = NIL;
                            destructuring_bind_must_consp(current_$296, datum_$302, $list1019);
                            just_time = current_$296.first();
                            current_$296 = current_$296.rest();
                            destructuring_bind_must_consp(current_$296, datum_$302, $list1019);
                            units = current_$296.first();
                            current_$296 = current_$296.rest();
                            if (NIL == current_$296) {
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$302 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(just_time);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$302, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$303 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(units);
                                    if (total_time.isPositive()) {
                                        final SubLObject stdevs = (stdev_time_per_rule.isZero()) ? NIL : number_utilities.standard_deviations_above_mean(time, average_time_per_rule, stdev_time_per_rule);
                                        if ((NIL != stdevs) && stdevs.numG(ONE_INTEGER)) {
                                            final SubLObject backgrond_color = (stdevs.numG(TWO_INTEGER)) ? $RED : $YELLOW;
                                            final SubLObject text_color = (stdevs.numG(TWO_INTEGER)) ? $WHITE : $BLACK;
                                            html_indent(UNPROVIDED);
                                            cb_show_warning_icon(backgrond_color, text_color, truncate(stdevs, UNPROVIDED));
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$303, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } else {
                                cdestructuring_bind_error(datum_$302, $list1019);
                            }
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$301, thread);
                        }
                        html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                        html_source_readability_terpri(UNPROVIDED);
                        if (NIL != trigger_gafs) {
                            final SubLObject trigger_count = length(trigger_gafs);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$304 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$305 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$305, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$304, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$306 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$307 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(trigger_count);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$307, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$308 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str999$_trigger_P, trigger_count);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$308, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$306, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            final SubLObject rule_average_time_per_trigger = number_utilities.safe_X(time, trigger_count);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$309 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                SubLObject current_$297;
                                final SubLObject datum_$303 = current_$297 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(rule_average_time_per_trigger), UNPROVIDED);
                                SubLObject just_time2 = NIL;
                                SubLObject units2 = NIL;
                                destructuring_bind_must_consp(current_$297, datum_$303, $list1019);
                                just_time2 = current_$297.first();
                                current_$297 = current_$297.rest();
                                destructuring_bind_must_consp(current_$297, datum_$303, $list1019);
                                units2 = current_$297.first();
                                current_$297 = current_$297.rest();
                                if (NIL == current_$297) {
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($RIGHT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$310 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(just_time2);
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$310, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($LEFT));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_markup(html_align($TOP));
                                    html_char(CHAR_quotation, UNPROVIDED);
                                    html_char(CHAR_greater, UNPROVIDED);
                                    final SubLObject _prev_bind_0_$311 = html_macros.$html_safe_print$.currentBinding(thread);
                                    try {
                                        html_macros.$html_safe_print$.bind(T, thread);
                                        html_princ(units2);
                                        html_princ($str1008$___trigger);
                                        if (total_time.isPositive()) {
                                            final SubLObject stdevs2 = (stdev_time_per_trigger.isZero()) ? NIL : number_utilities.standard_deviations_above_mean(rule_average_time_per_trigger, average_time_per_trigger, stdev_time_per_trigger);
                                            if ((NIL != stdevs2) && stdevs2.numG(ONE_INTEGER)) {
                                                html_indent(UNPROVIDED);
                                                cb_show_warning_icon($RED, $WHITE, truncate(stdevs2, UNPROVIDED));
                                            }
                                        }
                                    } finally {
                                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$311, thread);
                                    }
                                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                } else {
                                    cdestructuring_bind_error(datum_$303, $list1019);
                                }
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$309, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                        }
                        if (inference_count.isPositive()) {
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$312 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(TWO_INTEGER);
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$313 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_hr(UNPROVIDED, UNPROVIDED);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$313, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$312, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                            html_char(CHAR_greater, UNPROVIDED);
                            final SubLObject _prev_bind_0_$314 = html_macros.$html_safe_print$.currentBinding(thread);
                            try {
                                html_macros.$html_safe_print$.bind(T, thread);
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($RIGHT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$315 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    html_princ(inference_count);
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$315, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($LEFT));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_markup(html_align($TOP));
                                html_char(CHAR_quotation, UNPROVIDED);
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$316 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str997$_inference_P, inference_count);
                                    if (total_time.isPositive()) {
                                        final SubLObject stdevs3 = (stdev_inferences_per_rule.isZero()) ? NIL : number_utilities.standard_deviations_above_mean(inference_count, average_inferences_per_rule, stdev_inferences_per_rule);
                                        if ((NIL != stdevs3) && stdevs3.numG(ONE_INTEGER)) {
                                            html_indent(UNPROVIDED);
                                            cb_show_warning_icon($YELLOW, $BLACK, truncate(stdevs3, UNPROVIDED));
                                        }
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$316, thread);
                                }
                                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                            } finally {
                                html_macros.$html_safe_print$.rebind(_prev_bind_0_$314, thread);
                            }
                            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                            html_source_readability_terpri(UNPROVIDED);
                            if (NIL != inference_time) {
                                final SubLObject rule_average_time_per_inference = number_utilities.safe_X(inference_time, inference_count);
                                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                                html_char(CHAR_greater, UNPROVIDED);
                                final SubLObject _prev_bind_0_$317 = html_macros.$html_safe_print$.currentBinding(thread);
                                try {
                                    html_macros.$html_safe_print$.bind(T, thread);
                                    SubLObject current_$298;
                                    final SubLObject datum_$304 = current_$298 = string_utilities.split_string(numeric_date_utilities.readable_elapsed_time_string_ms(rule_average_time_per_inference), UNPROVIDED);
                                    SubLObject just_time3 = NIL;
                                    SubLObject units3 = NIL;
                                    destructuring_bind_must_consp(current_$298, datum_$304, $list1019);
                                    just_time3 = current_$298.first();
                                    current_$298 = current_$298.rest();
                                    destructuring_bind_must_consp(current_$298, datum_$304, $list1019);
                                    units3 = current_$298.first();
                                    current_$298 = current_$298.rest();
                                    if (NIL == current_$298) {
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($RIGHT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$318 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ(just_time3);
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$318, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                                        html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($LEFT));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_markup(html_align($TOP));
                                        html_char(CHAR_quotation, UNPROVIDED);
                                        html_char(CHAR_greater, UNPROVIDED);
                                        final SubLObject _prev_bind_0_$319 = html_macros.$html_safe_print$.currentBinding(thread);
                                        try {
                                            html_macros.$html_safe_print$.bind(T, thread);
                                            html_princ(units3);
                                            html_princ($str1006$___inference);
                                            if (total_time.isPositive()) {
                                                final SubLObject stdevs4 = (stdev_time_per_inference.isZero()) ? NIL : number_utilities.standard_deviations_above_mean(rule_average_time_per_inference, average_time_per_inference, stdev_time_per_inference);
                                                if ((NIL != stdevs4) && stdevs4.numG(ONE_INTEGER)) {
                                                    html_indent(UNPROVIDED);
                                                    cb_show_warning_icon($RED, $WHITE, truncate(stdevs4, UNPROVIDED));
                                                }
                                            }
                                        } finally {
                                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$319, thread);
                                        }
                                        html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                                    } else {
                                        cdestructuring_bind_error(datum_$304, $list1019);
                                    }
                                } finally {
                                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$317, thread);
                                }
                                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                                html_source_readability_terpri(UNPROVIDED);
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$298, thread);
                    }
                    html_markup(html_macros.$html_table_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$297, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($LEFT));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_align($CENTER));
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_macros.$html_table_data_width$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup($str1032$80_);
                html_char(CHAR_quotation, UNPROVIDED);
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$320 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    if (NIL != assertion_handles.assertion_p(rule)) {
                        cb_show_assertion_readably(rule, T, T);
                    } else {
                        html_princ($$$Overhead);
                    }
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$320, thread);
                }
                html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$296, thread);
            }
            html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
            html_source_readability_terpri(UNPROVIDED);
            if (((NIL != inferences) || (NIL != trigger_gafs)) || (NIL != time_plist)) {
                html_markup(html_macros.$html_table_row_head$.getGlobalValue());
                html_char(CHAR_greater, UNPROVIDED);
                final SubLObject _prev_bind_0_$321 = html_macros.$html_safe_print$.currentBinding(thread);
                try {
                    html_macros.$html_safe_print$.bind(T, thread);
                    html_markup(html_macros.$html_table_data_head$.getGlobalValue());
                    html_markup(html_macros.$html_table_data_colspan$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(TWO_INTEGER);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_align$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($LEFT));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_macros.$html_table_data_valign$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup(html_align($TOP));
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$322 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        if ($VERBOSE != verbosity) {
                            cb_link($RULE_FORWARD_INFERENCE_METRICS, rule, $str1034$_Show_Detail_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            html_indent(TWO_INTEGER);
                        }
                        if (NIL != inferences) {
                            thread.resetMultipleValues();
                            final SubLObject good_inferences = categorize_inferences_by_provability_status(inferences);
                            final SubLObject neutral_inferences = thread.secondMultipleValue();
                            final SubLObject no_good_inferences = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            html_princ($str1035$Inferences_);
                            if (NIL != good_inferences) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1036$__S_good, length(good_inferences));
                            }
                            if (NIL != neutral_inferences) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1037$__S_neutral, length(neutral_inferences));
                            }
                            if (NIL != no_good_inferences) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1038$__S_no_good, length(no_good_inferences));
                            }
                            if ($VERBOSE == verbosity) {
                                if (NIL != good_inferences) {
                                    html_newline(UNPROVIDED);
                                    if ((NIL != neutral_inferences) || (NIL != no_good_inferences)) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str1039$Good__);
                                    }
                                    SubLObject cdolist_list_var = good_inferences;
                                    SubLObject inference = NIL;
                                    inference = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        cb_show_inference_link_and_time(inference);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        inference = cdolist_list_var.first();
                                    } 
                                }
                                if (NIL != neutral_inferences) {
                                    html_newline(UNPROVIDED);
                                    if ((NIL != good_inferences) || (NIL != no_good_inferences)) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str1040$Neutral__);
                                    }
                                    SubLObject cdolist_list_var = neutral_inferences;
                                    SubLObject inference = NIL;
                                    inference = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        cb_show_inference_link_and_time(inference);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        inference = cdolist_list_var.first();
                                    } 
                                }
                                if (NIL != no_good_inferences) {
                                    html_newline(UNPROVIDED);
                                    if ((NIL != good_inferences) || (NIL != neutral_inferences)) {
                                        format(html_macros.$html_stream$.getDynamicValue(thread), $str1041$No_Good__);
                                    }
                                    SubLObject cdolist_list_var = no_good_inferences;
                                    SubLObject inference = NIL;
                                    inference = cdolist_list_var.first();
                                    while (NIL != cdolist_list_var) {
                                        cb_show_inference_link_and_time(inference);
                                        cdolist_list_var = cdolist_list_var.rest();
                                        inference = cdolist_list_var.first();
                                    } 
                                }
                            }
                        }
                        thread.resetMultipleValues();
                        final SubLObject triggers_with_dependent = categorize_reified_supports_by_dependent_involving_support(trigger_gafs, rule);
                        final SubLObject triggers_without_dependent = thread.secondMultipleValue();
                        final SubLObject unreifiable_triggers = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != inferences) {
                            if ($VERBOSE == verbosity) {
                                html_newline(UNPROVIDED);
                            } else {
                                html_indent(FOUR_INTEGER);
                            }
                        }
                        if ((NIL != trigger_gafs) && (((NIL != triggers_with_dependent) || (NIL != triggers_without_dependent)) || (NIL != unreifiable_triggers))) {
                            html_princ($str1042$Triggers_);
                            if (NIL != triggers_with_dependent) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1043$__S_successful, length(triggers_with_dependent));
                            }
                            if (NIL != triggers_without_dependent) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1044$__S_failed, length(triggers_without_dependent));
                            }
                            if (NIL != unreifiable_triggers) {
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1045$__S_unknown, length(unreifiable_triggers));
                            }
                        }
                        if (((NIL != time_plist) || (NIL != count_plist)) && ($VERBOSE == verbosity)) {
                            html_newline(TWO_INTEGER);
                            cb_forward_inference_metrics_times_and_counts_table(time_plist, count_plist);
                            if (NIL != triggers_with_dependent) {
                                html_newline(UNPROVIDED);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1046$Successful__);
                                SubLObject invalid_count = ZERO_INTEGER;
                                SubLObject cdolist_list_var2 = triggers_with_dependent;
                                SubLObject trigger = NIL;
                                trigger = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL != assertion_handles.valid_assertionP(trigger, UNPROVIDED)) {
                                        html_newline(UNPROVIDED);
                                        cb_show_assertion_readably(trigger, T, T);
                                    } else
                                        if (NIL != arguments.support_p(trigger)) {
                                            html_newline(UNPROVIDED);
                                            cb_form(trigger, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            invalid_count = add(invalid_count, ONE_INTEGER);
                                        }

                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    trigger = cdolist_list_var2.first();
                                } 
                                if (!invalid_count.isZero()) {
                                    html_newline(format(html_macros.$html_stream$.getDynamicValue(thread), $str1047$_A_successful_trigger__P_now_inva, invalid_count));
                                }
                            }
                            if (NIL != triggers_without_dependent) {
                                html_newline(TWO_INTEGER);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1048$Failed__);
                                SubLObject invalid_count = ZERO_INTEGER;
                                SubLObject cdolist_list_var2 = triggers_without_dependent;
                                SubLObject trigger = NIL;
                                trigger = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL != assertion_handles.valid_assertionP(trigger, UNPROVIDED)) {
                                        html_newline(UNPROVIDED);
                                        cb_show_assertion_readably(trigger, T, T);
                                    } else
                                        if (NIL != arguments.support_p(trigger)) {
                                            html_newline(UNPROVIDED);
                                            cb_form(trigger, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            invalid_count = add(invalid_count, ONE_INTEGER);
                                        }

                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    trigger = cdolist_list_var2.first();
                                } 
                                if (!invalid_count.isZero()) {
                                    html_newline(UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str1049$_A_failed_trigger__P_now_invalid_, invalid_count);
                                }
                            }
                            if (NIL != unreifiable_triggers) {
                                html_newline(TWO_INTEGER);
                                format(html_macros.$html_stream$.getDynamicValue(thread), $str1050$Unknown__unreifiable___);
                                SubLObject invalid_count = ZERO_INTEGER;
                                SubLObject cdolist_list_var2 = unreifiable_triggers;
                                SubLObject trigger = NIL;
                                trigger = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    if (NIL != assertion_handles.valid_assertionP(trigger, UNPROVIDED)) {
                                        html_newline(UNPROVIDED);
                                        cb_show_assertion_readably(trigger, T, T);
                                    } else
                                        if (NIL != arguments.support_p(trigger)) {
                                            html_newline(UNPROVIDED);
                                            cb_form(trigger, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            invalid_count = add(invalid_count, ONE_INTEGER);
                                        }

                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    trigger = cdolist_list_var2.first();
                                } 
                                if (!invalid_count.isZero()) {
                                    html_newline(UNPROVIDED);
                                    format(html_macros.$html_stream$.getDynamicValue(thread), $str1049$_A_failed_trigger__P_now_invalid_, invalid_count);
                                }
                            }
                        }
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$322, thread);
                    }
                    html_markup(html_macros.$html_table_data_tail$.getGlobalValue());
                } finally {
                    html_macros.$html_safe_print$.rebind(_prev_bind_0_$321, thread);
                }
                html_markup(html_macros.$html_table_row_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
            }
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_table_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_show_inference_link_and_time(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        cb_link($INFERENCE, inference, $VERY_VERBOSE, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(html_macros.$html_stream$.getDynamicValue(thread), $str1052$___as_, inference_datastructures_inference.inference_cumulative_time(inference));
        html_indent(UNPROVIDED);
        return inference;
    }

    public static SubLObject cb_show_forward_inference_statistics_for_rule(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule_info = inference_metrics.rule_forward_inference_metrics_info(rule);
        final SubLObject current;
        final SubLObject datum = current = rule_info;
        final SubLObject time_tail = property_list_member($TIME, current);
        final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
        final SubLObject inference_time_tail = property_list_member($INFERENCE_TIME, current);
        final SubLObject inference_time = (NIL != inference_time_tail) ? cadr(inference_time_tail) : NIL;
        final SubLObject time_plist_tail = property_list_member($TIME_PLIST, current);
        final SubLObject time_plist = (NIL != time_plist_tail) ? cadr(time_plist_tail) : NIL;
        final SubLObject count_plist_tail = property_list_member($COUNT_PLIST, current);
        final SubLObject count_plist = (NIL != count_plist_tail) ? cadr(count_plist_tail) : NIL;
        final SubLObject inference_count_tail = property_list_member($INFERENCE_COUNT, current);
        final SubLObject inference_count = (NIL != inference_count_tail) ? cadr(inference_count_tail) : NIL;
        final SubLObject trigger_gafs_tail = property_list_member($TRIGGER_GAFS, current);
        final SubLObject trigger_gafs = (NIL != trigger_gafs_tail) ? cadr(trigger_gafs_tail) : NIL;
        final SubLObject inferences_tail = property_list_member($INFERENCES, current);
        final SubLObject inferences = (NIL != inferences_tail) ? cadr(inferences_tail) : NIL;
        html_princ($str991$Total_time__);
        html_princ(numeric_date_utilities.readable_elapsed_time_string_ms(time));
        html_newline(UNPROVIDED);
        dhtml_macros.dhtml_switch_visibility_links($str1053$inference_metrics, $str1054$_Show_metrics_, $str1055$_Hide_metrics_);
        dhtml_macros.dhtml_set_switched_visibility($str1053$inference_metrics, $INVISIBLE, $PARAGRAPH);
        html_markup(html_macros.$html_div_head$.getGlobalValue());
        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_markup($str1053$inference_metrics);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            cb_forward_inference_metrics_times_and_counts_table(time_plist, count_plist);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_div_tail$.getGlobalValue());
        html_source_readability_terpri(UNPROVIDED);
        return NIL;
    }

    public static SubLObject categorize_inferences_by_provability_status(final SubLObject inferences) {
        SubLObject good_inferences = NIL;
        SubLObject neutral_inferences = NIL;
        SubLObject no_good_inferences = NIL;
        SubLObject cdolist_list_var = inferences;
        SubLObject inference = NIL;
        inference = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = inference_datastructures_inference.inference_provability_status(inference);
            if (pcase_var.eql($GOOD)) {
                good_inferences = cons(inference, good_inferences);
            } else
                if (pcase_var.eql($NEUTRAL)) {
                    neutral_inferences = cons(inference, neutral_inferences);
                } else
                    if (pcase_var.eql($NO_GOOD)) {
                        no_good_inferences = cons(inference, no_good_inferences);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            inference = cdolist_list_var.first();
        } 
        return values(good_inferences, neutral_inferences, no_good_inferences);
    }

    public static SubLObject categorize_reified_supports_by_dependent_involving_support(final SubLObject reified_supports, final SubLObject support) {
        if (NIL != support) {
            SubLObject reified_supports_with_dependent = NIL;
            SubLObject reified_supports_without_dependent = NIL;
            SubLObject unreifiable_supports = NIL;
            SubLObject cdolist_list_var = reified_supports;
            SubLObject reified_support = NIL;
            reified_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != arguments.reified_support_has_dependent_with_supportP_kb_hl_support_aware_version(reified_support, support)) {
                    reified_supports_with_dependent = cons(reified_support, reified_supports_with_dependent);
                } else
                    if ((NIL != assertion_handles.assertion_p(reified_support)) || (NIL != kb_hl_supports_high.find_kb_hl_support(reified_support))) {
                        reified_supports_without_dependent = cons(reified_support, reified_supports_without_dependent);
                    } else {
                        unreifiable_supports = cons(reified_support, unreifiable_supports);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                reified_support = cdolist_list_var.first();
            } 
            return values(reified_supports_with_dependent, reified_supports_without_dependent, unreifiable_supports);
        }
        return NIL;
    }

    public static SubLObject cb_show_warning_icon(SubLObject background_color, SubLObject text_color, SubLObject repeat) {
        if (background_color == UNPROVIDED) {
            background_color = $RED;
        }
        if (text_color == UNPROVIDED) {
            text_color = $BLACK;
        }
        if (repeat == UNPROVIDED) {
            repeat = ONE_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_markup(html_macros.$html_big_head$.getGlobalValue());
        html_markup(html_macros.$html_teletype_head$.getGlobalValue());
        html_markup(html_macros.$html_span_head$.getGlobalValue());
        html_markup(html_macros.$html_span_style$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        html_style_background_color(background_color);
        html_char(CHAR_quotation, UNPROVIDED);
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            final SubLObject color_val = text_color;
            html_markup(html_macros.$html_font_head$.getGlobalValue());
            if (NIL != color_val) {
                html_markup(html_macros.$html_font_color$.getGlobalValue());
                html_char(CHAR_quotation, UNPROVIDED);
                html_markup(html_color(color_val));
                html_char(CHAR_quotation, UNPROVIDED);
            }
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0_$329 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(repeat); i = add(i, ONE_INTEGER)) {
                    html_princ($str1059$_);
                }
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0_$329, thread);
            }
            html_markup(html_macros.$html_font_tail$.getGlobalValue());
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_span_tail$.getGlobalValue());
        html_markup(html_macros.$html_teletype_tail$.getGlobalValue());
        html_markup(html_macros.$html_big_tail$.getGlobalValue());
        return NIL;
    }

    public static SubLObject cb_link_inference_graph(final SubLObject inference, SubLObject linktext) {
        if (linktext == UNPROVIDED) {
            linktext = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == linktext) {
            linktext = $str300$_Query_Graph_;
        }
        final SubLObject frame_name_var = cb_frame_name($CONTENT);
        html_markup(html_macros.$html_anchor_head$.getGlobalValue());
        html_markup(html_macros.$html_anchor_href$.getGlobalValue());
        html_char(CHAR_quotation, UNPROVIDED);
        cyc_cgi_url_int();
        format(html_macros.$html_stream$.getDynamicValue(thread), $str1061$cb_inference_graph__A__A, inference_datastructures_inference.inference_problem_store_suid(inference), inference_datastructures_inference.inference_suid(inference));
        html_char(CHAR_quotation, UNPROVIDED);
        if (NIL != frame_name_var) {
            html_markup(html_macros.$html_anchor_target$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(frame_name_var);
            html_char(CHAR_quotation, UNPROVIDED);
        }
        html_char(CHAR_greater, UNPROVIDED);
        final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
        try {
            html_macros.$html_safe_print$.bind(T, thread);
            html_princ(linktext);
        } finally {
            html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
        }
        html_markup(html_macros.$html_anchor_tail$.getGlobalValue());
        return inference;
    }

    public static SubLObject cb_inference_graph(final SubLObject args) {
        SubLObject store_id_string = NIL;
        SubLObject inference_id_string = NIL;
        destructuring_bind_must_consp(args, args, $list3);
        store_id_string = args.first();
        SubLObject current = args.rest();
        destructuring_bind_must_consp(current, args, $list3);
        inference_id_string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject inference = cb_guess_inference(store_id_string, inference_id_string);
            if (NIL != inference_datastructures_inference.inference_p(inference)) {
                cb_inference_graph_internal(inference);
            }
        } else {
            cdestructuring_bind_error(args, $list3);
        }
        return NIL;
    }

    public static SubLObject cb_inference_graph_internal(final SubLObject inference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject title_var;
        final SubLObject title = title_var = $$$Graph_of_a_query_formula;
        final SubLObject _prev_bind_0 = html_macros.$html_id_space_id_generator$.currentBinding(thread);
        try {
            html_macros.$html_id_space_id_generator$.bind(NIL != integer_sequence_generator.integer_sequence_generator_p(html_macros.$html_id_space_id_generator$.getDynamicValue(thread)) ? html_macros.$html_id_space_id_generator$.getDynamicValue(thread) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            html_markup($str231$__DOCTYPE_html_PUBLIC_____W3C__DT);
            if (NIL != html_macros.$html_force_ie_standards_mode$.getDynamicValue(thread)) {
                html_source_readability_terpri(UNPROVIDED);
                html_markup($str232$_meta_http_equiv__X_UA_Compatible);
            }
            html_source_readability_terpri(UNPROVIDED);
            final SubLObject _prev_bind_0_$330 = cyc_file_dependencies.$html_emitted_file_dependencies$.currentBinding(thread);
            try {
                cyc_file_dependencies.$html_emitted_file_dependencies$.bind(cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread) == $UNINITIALIZED ? list(EMPTY_SUBL_OBJECT_ARRAY) : cyc_file_dependencies.$html_emitted_file_dependencies$.getDynamicValue(thread), thread);
                html_markup(html_macros.$html_html_head$.getGlobalValue());
                html_markup(html_macros.$html_head_head$.getGlobalValue());
                html_macros.html_head_content_type();
                cb_head_shortcut_icon();
                html_meta_robot_instructions($cb_permit_robots_to_indexP$.getDynamicValue(thread), $cb_permit_robots_to_followP$.getDynamicValue(thread));
                cyc_file_dependencies.css($CB_CYC);
                if (NIL != title_var) {
                    html_source_readability_terpri(UNPROVIDED);
                    html_markup(html_macros.$html_title_head$.getGlobalValue());
                    html_princ(title_var);
                    html_markup(html_macros.$html_title_tail$.getGlobalValue());
                }
                dhtml_macros.html_basic_cb_scripts();
                html_markup(html_macros.$html_head_tail$.getGlobalValue());
                html_source_readability_terpri(UNPROVIDED);
                final SubLObject _prev_bind_0_$331 = html_macros.$html_inside_bodyP$.currentBinding(thread);
                try {
                    html_macros.$html_inside_bodyP$.bind(T, thread);
                    html_markup(html_macros.$html_body_head$.getGlobalValue());
                    if (NIL != html_macros.$html_default_bgcolor$.getDynamicValue(thread)) {
                        html_markup(html_macros.$html_body_bgcolor$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup(html_color(html_macros.$html_default_bgcolor$.getDynamicValue(thread)));
                        html_char(CHAR_quotation, UNPROVIDED);
                    }
                    html_markup(html_macros.$html_body_class$.getGlobalValue());
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_markup($str235$yui_skin_sam);
                    html_char(CHAR_quotation, UNPROVIDED);
                    html_char(CHAR_greater, UNPROVIDED);
                    final SubLObject _prev_bind_0_$332 = html_macros.$html_safe_print$.currentBinding(thread);
                    try {
                        html_macros.$html_safe_print$.bind(T, thread);
                        html_markup(html_macros.$html_div_head$.getGlobalValue());
                        html_markup(html_macros.$html_attribute_id$.getGlobalValue());
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_markup($$$reloadFrameButton);
                        html_char(CHAR_quotation, UNPROVIDED);
                        html_char(CHAR_greater, UNPROVIDED);
                        final SubLObject _prev_bind_0_$333 = html_macros.$html_safe_print$.currentBinding(thread);
                        try {
                            html_macros.$html_safe_print$.bind(T, thread);
                            html_markup(html_macros.$html_input_head$.getGlobalValue());
                            html_markup(html_macros.$html_input_type$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$button);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_name$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($$$reload);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_input_value$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_princ($$$Refresh);
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup(html_macros.$html_event_attribute_onclick$.getGlobalValue());
                            html_char(CHAR_quotation, UNPROVIDED);
                            html_markup($str1066$reloadCurrentFrame__reloadFrameBu);
                            html_char(CHAR_quotation, UNPROVIDED);
                            if (NIL != html_macros.$html_input_disabledP$.getDynamicValue(thread)) {
                                html_simple_attribute(html_macros.$html_input_disabled$.getGlobalValue());
                            }
                            html_char(CHAR_greater, UNPROVIDED);
                        } finally {
                            html_macros.$html_safe_print$.rebind(_prev_bind_0_$333, thread);
                        }
                        html_markup(html_macros.$html_div_tail$.getGlobalValue());
                        html_markup(html_macros.$html_small_head$.getGlobalValue());
                        html_princ($str1067$Graph_for_);
                        html_newline(UNPROVIDED);
                        cb_form(inference_datastructures_inference.inference_el_query(inference), NIL, T);
                        html_markup(html_macros.$html_small_tail$.getGlobalValue());
                        cb_inference_print_graph_of_inference(inference);
                        html_source_readability_terpri(UNPROVIDED);
                        html_copyright_notice();
                    } finally {
                        html_macros.$html_safe_print$.rebind(_prev_bind_0_$332, thread);
                    }
                    html_markup(html_macros.$html_body_tail$.getGlobalValue());
                    html_source_readability_terpri(UNPROVIDED);
                } finally {
                    html_macros.$html_inside_bodyP$.rebind(_prev_bind_0_$331, thread);
                }
                html_markup(html_macros.$html_html_tail$.getGlobalValue());
            } finally {
                cyc_file_dependencies.$html_emitted_file_dependencies$.rebind(_prev_bind_0_$330, thread);
            }
            html_source_readability_terpri(UNPROVIDED);
        } finally {
            html_macros.$html_id_space_id_generator$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cb_inference_print_graph_of_inference(final SubLObject inference) {
        html_newline(TWO_INTEGER);
        final SubLObject signature = format(NIL, $str1068$_a, random.random(expt(TWO_INTEGER, $int$30)));
        final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        blue_grapher_utilities.blue_event(signature, list(cb_blue_grapher.$cb_blue_cyc_graph_command_add_graph_string$.getGlobalValue(), list($BUILDER_FN, BBF_INFERENCE, $PARAMS, list($STORE_SUID, inference_datastructures_inference.inference_problem_store_suid(inference), $INFERENCE_SUID, inference_datastructures_inference.inference_suid(inference)), $MT, mt)));
        cb_blue_grapher.cb_blue_applet(list($WIDTH, $int$800, $HEIGHT, $int$600, $SIGNATURE, signature));
        return NIL;
    }

    public static SubLObject declare_cb_query_file() {
        declareFunction(me, "cb_inference_identifier", "CB-INFERENCE-IDENTIFIER", 1, 0, false);
        declareFunction(me, "cb_guess_inference_from_identifier", "CB-GUESS-INFERENCE-FROM-IDENTIFIER", 1, 0, false);
        declareFunction(me, "cb_guess_inference", "CB-GUESS-INFERENCE", 2, 0, false);
        declareFunction(me, "html_princ_with_explanation", "HTML-PRINC-WITH-EXPLANATION", 2, 3, false);
        declareFunction(me, "html_princ_strong_with_explanation", "HTML-PRINC-STRONG-WITH-EXPLANATION", 2, 3, false);
        declareFunction(me, "cb_princ_with_explanation", "CB-PRINC-WITH-EXPLANATION", 2, 3, false);
        declareFunction(me, "cb_princ_strong_with_explanation", "CB-PRINC-STRONG-WITH-EXPLANATION", 2, 3, false);
        declareFunction(me, "cb_princ_with_target_reference_and_explanation", "CB-PRINC-WITH-TARGET-REFERENCE-AND-EXPLANATION", 3, 3, false);
        declareFunction(me, "cb_submit_input_with_explanation", "CB-SUBMIT-INPUT-WITH-EXPLANATION", 0, 7, false);
        declareFunction(me, "cb_submit_input_with_explanation_and_inference_doc_more_link", "CB-SUBMIT-INPUT-WITH-EXPLANATION-AND-INFERENCE-DOC-MORE-LINK", 0, 7, false);
        declareFunction(me, "cb_princ_with_explanation_and_inference_doc_more_link", "CB-PRINC-WITH-EXPLANATION-AND-INFERENCE-DOC-MORE-LINK", 3, 2, false);
        declareFunction(me, "cb_princ_strong_with_explanation_and_inference_doc_more_link", "CB-PRINC-STRONG-WITH-EXPLANATION-AND-INFERENCE-DOC-MORE-LINK", 3, 2, false);
        declareFunction(me, "cb_princ_with_inference_doc_more_link", "CB-PRINC-WITH-INFERENCE-DOC-MORE-LINK", 2, 2, false);
        declareFunction(me, "cb_princ_strong_with_inference_doc_more_link", "CB-PRINC-STRONG-WITH-INFERENCE-DOC-MORE-LINK", 2, 2, false);
        declareMacro(me, "cb_frame_link_with_explanation", "CB-FRAME-LINK-WITH-EXPLANATION");
        declareFunction(me, "cb_link_inference_doc", "CB-LINK-INFERENCE-DOC", 2, 0, false);
        declareFunction(me, "cb_show_inference_answer_counts", "CB-SHOW-INFERENCE-ANSWER-COUNTS", 3, 0, false);
        declareFunction(me, "cb_query_show_inference_status", "CB-QUERY-SHOW-INFERENCE-STATUS", 1, 1, false);
        declareFunction(me, "cb_inference_more_link_string", "CB-INFERENCE-MORE-LINK-STRING", 1, 0, false);
        declareFunction(me, "cb_inference_help_directory", "CB-INFERENCE-HELP-DIRECTORY", 0, 0, false);
        declareFunction(me, "inference_link_specification_string_to_full_pathname_and_anchor", "INFERENCE-LINK-SPECIFICATION-STRING-TO-FULL-PATHNAME-AND-ANCHOR", 1, 0, false);
        declareFunction(me, "inference_parameter_p", "INFERENCE-PARAMETER-P", 1, 0, false);
        declareFunction(me, "inference_parameter_fancy_name", "INFERENCE-PARAMETER-FANCY-NAME", 1, 0, false);
        declareFunction(me, "inference_parameter_description", "INFERENCE-PARAMETER-DESCRIPTION", 1, 0, false);
        declareFunction(me, "inference_parameter_settings", "INFERENCE-PARAMETER-SETTINGS", 1, 0, false);
        declareFunction(me, "inference_parameter_scaling_factor", "INFERENCE-PARAMETER-SCALING-FACTOR", 1, 0, false);
        declareFunction(me, "inference_parameter_round_on_inputP", "INFERENCE-PARAMETER-ROUND-ON-INPUT?", 1, 0, false);
        declareFunction(me, "possibly_scale_value_on_input", "POSSIBLY-SCALE-VALUE-ON-INPUT", 2, 0, false);
        declareFunction(me, "possibly_scale_value_for_output", "POSSIBLY-SCALE-VALUE-FOR-OUTPUT", 2, 0, false);
        declareMacro(me, "declare_inference_parameter", "DECLARE-INFERENCE-PARAMETER");
        declareFunction(me, "declare_inference_parameter_internal", "DECLARE-INFERENCE-PARAMETER-INTERNAL", 6, 0, false);
        declareFunction(me, "inference_parameter_value_matches_setting", "INFERENCE-PARAMETER-VALUE-MATCHES-SETTING", 3, 0, false);
        declareFunction(me, "cb_query_new_followup", "CB-QUERY-NEW-FOLLOWUP", 5, 0, false);
        declareFunction(me, "cb_query_new", "CB-QUERY-NEW", 4, 0, false);
        declareFunction(me, "cb_query_continue", "CB-QUERY-CONTINUE", 2, 0, false);
        declareFunction(me, "new_cb_query_special_variable_state", "NEW-CB-QUERY-SPECIAL-VARIABLE-STATE", 0, 0, false);
        declareFunction(me, "cb_query_continue_thread", "CB-QUERY-CONTINUE-THREAD", 4, 0, false);
        declareFunction(me, "cb_inferences", "CB-INFERENCES", 0, 0, false);
        declareMacro(me, "do_cb_inferences", "DO-CB-INFERENCES");
        declareMacro(me, "with_cb_inferences", "WITH-CB-INFERENCES");
        declareFunction(me, "cb_focal_inference", "CB-FOCAL-INFERENCE", 0, 0, false);
        declareFunction(me, "cb_note_focal_inference", "CB-NOTE-FOCAL-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_note_no_focal_inference", "CB-NOTE-NO-FOCAL-INFERENCE", 0, 0, false);
        declareFunction(me, "cb_steal_inferences_by_problem_store_ids", "CB-STEAL-INFERENCES-BY-PROBLEM-STORE-IDS", 1, 0, false);
        declareFunction(me, "cb_act_forget_inference", "CB-ACT-FORGET-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_act_forget_invalid_inferences", "CB-ACT-FORGET-INVALID-INFERENCES", 0, 0, false);
        declareFunction(me, "cb_act_destroy_inference", "CB-ACT-DESTROY-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_destroy_all_inferences_but_last_n", "CB-DESTROY-ALL-INFERENCES-BUT-LAST-N", 0, 0, false);
        declareFunction(me, "cb_destroy_all_inferences_but_last_n_int", "CB-DESTROY-ALL-INFERENCES-BUT-LAST-N-INT", 1, 0, false);
        declareFunction(me, "cb_act_reinforce_inference", "CB-ACT-REINFORCE-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_query", "CB-QUERY", 0, 1, false);
        declareFunction(me, "cb_link_query", "CB-LINK-QUERY", 0, 1, false);
        declareFunction(me, "cb_query_internal", "CB-QUERY-INTERNAL", 0, 1, false);
        declareFunction(me, "cb_show_query_header_top", "CB-SHOW-QUERY-HEADER-TOP", 1, 0, false);
        declareFunction(me, "cb_show_query_header_links", "CB-SHOW-QUERY-HEADER-LINKS", 2, 0, false);
        declareFunction(me, "cb_query_inference_sharedP", "CB-QUERY-INFERENCE-SHARED?", 1, 0, false);
        declareFunction(me, "cb_query_any_inferences_sharedP", "CB-QUERY-ANY-INFERENCES-SHARED?", 1, 0, false);
        declareFunction(me, "cb_query_other_inferences_section", "CB-QUERY-OTHER-INFERENCES-SECTION", 2, 0, false);
        declareFunction(me, "cb_query_focal_inference_section", "CB-QUERY-FOCAL-INFERENCE-SECTION", 3, 0, false);
        declareFunction(me, "cb_query_new_inference_section", "CB-QUERY-NEW-INFERENCE-SECTION", 5, 2, false);
        declareFunction(me, "cb_query_new_inference_submit_section", "CB-QUERY-NEW-INFERENCE-SUBMIT-SECTION", 1, 2, false);
        declareFunction(me, "default_new_inference_monad_mt", "DEFAULT-NEW-INFERENCE-MONAD-MT", 0, 0, false);
        declareFunction(me, "default_new_inference_mt", "DEFAULT-NEW-INFERENCE-MT", 0, 0, false);
        declareFunction(me, "set_default_new_inference_mt", "SET-DEFAULT-NEW-INFERENCE-MT", 1, 0, false);
        declareFunction(me, "cb_query_new_inference_mt_section", "CB-QUERY-NEW-INFERENCE-MT-SECTION", 3, 0, false);
        declareFunction(me, "cb_query_new_inference_sentence_section", "CB-QUERY-NEW-INFERENCE-SENTENCE-SECTION", 2, 0, false);
        declareFunction(me, "cb_query_new_inference_non_explanatory_sentence_section", "CB-QUERY-NEW-INFERENCE-NON-EXPLANATORY-SENTENCE-SECTION", 2, 0, false);
        declareFunction(me, "cb_query_sentence", "CB-QUERY-SENTENCE", 2, 0, false);
        declareFunction(me, "cb_query_non_explanatory_sentence", "CB-QUERY-NON-EXPLANATORY-SENTENCE", 2, 0, false);
        declareFunction(me, "cb_query_select_sentence", "CB-QUERY-SELECT-SENTENCE", 2, 0, false);
        declareFunction(me, "cb_query_parameters_section", "CB-QUERY-PARAMETERS-SECTION", 2, 0, false);
        declareFunction(me, "cb_save_inference_parameter_defaults", "CB-SAVE-INFERENCE-PARAMETER-DEFAULTS", 1, 0, false);
        declareFunction(me, "get_saved_inference_parameter_default", "GET-SAVED-INFERENCE-PARAMETER-DEFAULT", 1, 1, false);
        declareFunction(me, "cb_query_inference_resource_constraints_section", "CB-QUERY-INFERENCE-RESOURCE-CONSTRAINTS-SECTION", 3, 1, false);
        declareFunction(me, "cb_query_basic_inference_resource_constraints_section", "CB-QUERY-BASIC-INFERENCE-RESOURCE-CONSTRAINTS-SECTION", 4, 0, false);
        declareFunction(me, "cb_query_advanced_inference_parameters_section", "CB-QUERY-ADVANCED-INFERENCE-PARAMETERS-SECTION", 2, 0, false);
        declareFunction(me, "cb_inference_mode_property_p", "CB-INFERENCE-MODE-PROPERTY-P", 1, 0, false);
        declareFunction(me, "cb_inference_mode_property_datum_p", "CB-INFERENCE-MODE-PROPERTY-DATUM-P", 1, 0, false);
        declareFunction(me, "cb_possibly_filter_out_inference_mode_properties", "CB-POSSIBLY-FILTER-OUT-INFERENCE-MODE-PROPERTIES", 2, 0, false);
        declareFunction(me, "cb_inference_mode_properties_data", "CB-INFERENCE-MODE-PROPERTIES-DATA", 0, 0, false);
        declareFunction(me, "cb_query_advanced_inference_mode_properties", "CB-QUERY-ADVANCED-INFERENCE-MODE-PROPERTIES", 3, 1, false);
        declareFunction(me, "cb_query_advanced_inference_dynamic_properties", "CB-QUERY-ADVANCED-INFERENCE-DYNAMIC-PROPERTIES", 3, 2, false);
        declareFunction(me, "cb_query_advanced_inference_static_properties", "CB-QUERY-ADVANCED-INFERENCE-STATIC-PROPERTIES", 3, 2, false);
        declareFunction(me, "cb_query_advanced_problem_store_static_properties", "CB-QUERY-ADVANCED-PROBLEM-STORE-STATIC-PROPERTIES", 4, 0, false);
        declareFunction(me, "cb_all_inference_parameters", "CB-ALL-INFERENCE-PARAMETERS", 0, 0, false);
        declareFunction(me, "cb_query_show_inference_properties", "CB-QUERY-SHOW-INFERENCE-PROPERTIES", 5, 2, false);
        declareFunction(me, "cb_query_property_for_inference_mode", "CB-QUERY-PROPERTY-FOR-INFERENCE-MODE", 3, 0, false);
        declareFunction(me, "cb_default_property_value", "CB-DEFAULT-PROPERTY-VALUE", 3, 0, false);
        declareFunction(me, "cb_query_property_value_from_properties_or_focal_inference", "CB-QUERY-PROPERTY-VALUE-FROM-PROPERTIES-OR-FOCAL-INFERENCE", 5, 0, false);
        declareFunction(me, "cb_query_property_value_from_properties_or_focal_inference_int", "CB-QUERY-PROPERTY-VALUE-FROM-PROPERTIES-OR-FOCAL-INFERENCE-INT", 5, 0, false);
        declareFunction(me, "cb_query_show_inference_parameter", "CB-QUERY-SHOW-INFERENCE-PARAMETER", 5, 0, false);
        declareFunction(me, "cb_query_show_inference_parameter_settings", "CB-QUERY-SHOW-INFERENCE-PARAMETER-SETTINGS", 5, 0, false);
        declareFunction(me, "cb_default_inference_mode", "CB-DEFAULT-INFERENCE-MODE", 0, 0, false);
        declareFunction(me, "cb_query_show_inference_parameter_setting", "CB-QUERY-SHOW-INFERENCE-PARAMETER-SETTING", 10, 0, false);
        declareFunction(me, "cb_set_radio_buttons_script", "CB-SET-RADIO-BUTTONS-SCRIPT", 1, 0, false);
        declareFunction(me, "cb_set_radio_button_script", "CB-SET-RADIO-BUTTON-SCRIPT", 2, 0, false);
        declareFunction(me, "inference_setting_number_for_parameter_value", "INFERENCE-SETTING-NUMBER-FOR-PARAMETER-VALUE", 2, 0, false);
        declareFunction(me, "cb_set_all_inference_mode_properties_to_defaults_script", "CB-SET-ALL-INFERENCE-MODE-PROPERTIES-TO-DEFAULTS-SCRIPT", 1, 0, false);
        declareFunction(me, "cb_set_all_inference_mode_parameters_to_cb_default_radio_input", "CB-SET-ALL-INFERENCE-MODE-PARAMETERS-TO-CB-DEFAULT-RADIO-INPUT", 4, 0, false);
        declareFunction(me, "get_big_radio_field_name_regexp", "GET-BIG-RADIO-FIELD-NAME-REGEXP", 0, 0, false);
        declareFunction(me, "get_one_radio_field_name_regexp", "GET-ONE-RADIO-FIELD-NAME-REGEXP", 1, 0, false);
        declareFunction(me, "get_one_entry_field_name_regexp", "GET-ONE-ENTRY-FIELD-NAME-REGEXP", 1, 0, false);
        declareFunction(me, "cb_set_inference_mode_radio_to_custom_radio_input", "CB-SET-INFERENCE-MODE-RADIO-TO-CUSTOM-RADIO-INPUT", 4, 0, false);
        declareFunction(me, "cb_clear_and_set_inference_mode_radio_to_custom_radio_input", "CB-CLEAR-AND-SET-INFERENCE-MODE-RADIO-TO-CUSTOM-RADIO-INPUT", 5, 0, false);
        declareFunction(me, "cb_focus_and_set_inference_mode_radio_to_custom_radio_input", "CB-FOCUS-AND-SET-INFERENCE-MODE-RADIO-TO-CUSTOM-RADIO-INPUT", 5, 0, false);
        declareFunction(me, "cb_query_proof_checker_section_relevantP", "CB-QUERY-PROOF-CHECKER-SECTION-RELEVANT?", 2, 0, false);
        declareFunction(me, "cb_extract_specified_proof_checker_rules", "CB-EXTRACT-SPECIFIED-PROOF-CHECKER-RULES", 2, 0, false);
        declareFunction(me, "cb_possibly_add_rules_to_proof_checker", "CB-POSSIBLY-ADD-RULES-TO-PROOF-CHECKER", 1, 0, false);
        declareFunction(me, "cb_query_proof_checker_setup_section", "CB-QUERY-PROOF-CHECKER-SETUP-SECTION", 2, 0, false);
        declareFunction(me, "cb_query_proof_checker_input_name", "CB-QUERY-PROOF-CHECKER-INPUT-NAME", 1, 0, false);
        declareFunction(me, "cb_proof_checker_rule_status", "CB-PROOF-CHECKER-RULE-STATUS", 3, 0, false);
        declareFunction(me, "cb_query_extract_proof_checker_parameters", "CB-QUERY-EXTRACT-PROOF-CHECKER-PARAMETERS", 1, 0, false);
        declareFunction(me, "cb_show_problem_store_properties", "CB-SHOW-PROBLEM-STORE-PROPERTIES", 1, 0, false);
        declareFunction(me, "cb_query_proof_checker_drop", "CB-QUERY-PROOF-CHECKER-DROP", 1, 0, false);
        declareFunction(me, "cb_link_query_proof_checker_drop", "CB-LINK-QUERY-PROOF-CHECKER-DROP", 1, 1, false);
        declareFunction(me, "cb_query_proof_checker_drop_all", "CB-QUERY-PROOF-CHECKER-DROP-ALL", 0, 1, false);
        declareFunction(me, "cb_link_query_proof_checker_drop_all", "CB-LINK-QUERY-PROOF-CHECKER-DROP-ALL", 0, 1, false);
        declareFunction(me, "cb_handle_query", "CB-HANDLE-QUERY", 1, 0, false);
        declareFunction(me, "cb_extract_query_sentence_input", "CB-EXTRACT-QUERY-SENTENCE-INPUT", 1, 1, false);
        declareFunction(me, "cb_query_preprocess_arguments", "CB-QUERY-PREPROCESS-ARGUMENTS", 4, 0, false);
        declareFunction(me, "cb_query_extract_inference_method", "CB-QUERY-EXTRACT-INFERENCE-METHOD", 1, 0, false);
        declareFunction(me, "cb_query_extract_inference", "CB-QUERY-EXTRACT-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_query_extract_parameters", "CB-QUERY-EXTRACT-PARAMETERS", 2, 1, false);
        declareFunction(me, "cb_query_extract_inference_parameters_from_args_or_focal_inference", "CB-QUERY-EXTRACT-INFERENCE-PARAMETERS-FROM-ARGS-OR-FOCAL-INFERENCE", 3, 0, false);
        declareFunction(me, "cb_query_extract_inference_parameter_value", "CB-QUERY-EXTRACT-INFERENCE-PARAMETER-VALUE", 5, 0, false);
        declareFunction(me, "cb_query_extract_query_or_test_spec", "CB-QUERY-EXTRACT-QUERY-OR-TEST-SPEC", 1, 0, false);
        declareFunction(me, "cb_new_cyc_query", "CB-NEW-CYC-QUERY", 1, 2, false);
        declareFunction(me, "cb_socratic_query", "CB-SOCRATIC-QUERY", 1, 2, false);
        declareFunction(me, "cb_similar_query", "CB-SIMILAR-QUERY", 1, 2, false);
        declareFunction(me, "cb_link_assertion_similar_query", "CB-LINK-ASSERTION-SIMILAR-QUERY", 1, 1, false);
        declareFunction(me, "cb_assertion_similar_query", "CB-ASSERTION-SIMILAR-QUERY", 1, 0, false);
        declareFunction(me, "cb_antecedent_query", "CB-ANTECEDENT-QUERY", 1, 2, false);
        declareFunction(me, "cb_link_antecedent_query", "CB-LINK-ANTECEDENT-QUERY", 1, 1, false);
        declareFunction(me, "cb_assertion_antecedent_query", "CB-ASSERTION-ANTECEDENT-QUERY", 1, 0, false);
        declareFunction(me, "rule_pragmatic_query_formula", "RULE-PRAGMATIC-QUERY-FORMULA", 1, 1, false);
        declareFunction(me, "cb_known_extent_query", "CB-KNOWN-EXTENT-QUERY", 1, 2, false);
        declareFunction(me, "cb_link_rule_known_extent_query", "CB-LINK-RULE-KNOWN-EXTENT-QUERY", 1, 1, false);
        declareFunction(me, "cb_rule_known_extent_query", "CB-RULE-KNOWN-EXTENT-QUERY", 1, 0, false);
        declareFunction(me, "cb_unknown_extent_query", "CB-UNKNOWN-EXTENT-QUERY", 1, 2, false);
        declareFunction(me, "cb_link_rule_unknown_extent_query", "CB-LINK-RULE-UNKNOWN-EXTENT-QUERY", 1, 1, false);
        declareFunction(me, "cb_rule_unknown_extent_query", "CB-RULE-UNKNOWN-EXTENT-QUERY", 1, 0, false);
        declareFunction(me, "cb_kb_query", "CB-KB-QUERY", 4, 1, false);
        declareFunction(me, "cb_parameter_strengthened_query", "CB-PARAMETER-STRENGTHENED-QUERY", 3, 1, false);
        declareFunction(me, "cb_literal_query", "CB-LITERAL-QUERY", 1, 0, false);
        declareFunction(me, "cb_lq", "CB-LQ", 1, 0, false);
        declareFunction(me, "cb_print_literal_query_internal", "CB-PRINT-LITERAL-QUERY-INTERNAL", 5, 0, false);
        declareFunction(me, "cb_literal_query_internal", "CB-LITERAL-QUERY-INTERNAL", 4, 0, false);
        declareFunction(me, "cb_new_literal_query", "CB-NEW-LITERAL-QUERY", 2, 0, false);
        declareFunction(me, "cb_literal_query_internal_arg1_isa", "CB-LITERAL-QUERY-INTERNAL-ARG1-ISA", 1, 0, false);
        declareFunction(me, "cb_include_literal_query_linkP", "CB-INCLUDE-LITERAL-QUERY-LINK?", 4, 0, false);
        declareFunction(me, "possible_to_conclude", "POSSIBLE-TO-CONCLUDE", 1, 0, false);
        declareFunction(me, "cb_show_query", "CB-SHOW-QUERY", 2, 1, false);
        declareFunction(me, "cb_show_focal_inference_progress_section", "CB-SHOW-FOCAL-INFERENCE-PROGRESS-SECTION", 2, 0, false);
        declareFunction(me, "cb_inference_progress_page", "CB-INFERENCE-PROGRESS-PAGE", 1, 0, false);
        declareFunction(me, "cb_inference_progress_page_guts", "CB-INFERENCE-PROGRESS-PAGE-GUTS", 3, 0, false);
        declareFunction(me, "cb_show_inference_status_section", "CB-SHOW-INFERENCE-STATUS-SECTION", 2, 0, false);
        declareFunction(me, "cb_show_query_answer_section", "CB-SHOW-QUERY-ANSWER-SECTION", 1, 1, false);
        declareFunction(me, "cb_auto_refresh_query", "CB-AUTO-REFRESH-QUERY", 0, 1, false);
        declareFunction(me, "cb_link_auto_refresh_query", "CB-LINK-AUTO-REFRESH-QUERY", 1, 1, false);
        declareFunction(me, "cb_auto_refresh_query_internal", "CB-AUTO-REFRESH-QUERY-INTERNAL", 0, 0, false);
        declareFunction(me, "cb_link_all_inference_answers", "CB-LINK-ALL-INFERENCE-ANSWERS", 1, 1, false);
        declareFunction(me, "cb_all_inference_answers", "CB-ALL-INFERENCE-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_show_inference_with_status_and_all_answers", "CB-SHOW-INFERENCE-WITH-STATUS-AND-ALL-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_focus_inference", "CB-FOCUS-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_link_focus_inference", "CB-LINK-FOCUS-INFERENCE", 1, 1, false);
        declareFunction(me, "cb_defocus_inference", "CB-DEFOCUS-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_link_defocus_inference", "CB-LINK-DEFOCUS-INFERENCE", 1, 1, false);
        declareFunction(me, "cb_interrupt_inference", "CB-INTERRUPT-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_link_interrupt_inference", "CB-LINK-INTERRUPT-INFERENCE", 1, 1, false);
        declareFunction(me, "cb_abort_inference", "CB-ABORT-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_link_abort_inference", "CB-LINK-ABORT-INFERENCE", 1, 1, false);
        declareFunction(me, "cb_forget_inference", "CB-FORGET-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_link_forget_inference", "CB-LINK-FORGET-INFERENCE", 1, 1, false);
        declareFunction(me, "cb_forget_all_inferences", "CB-FORGET-ALL-INFERENCES", 0, 1, false);
        declareFunction(me, "cb_link_forget_all_inferences", "CB-LINK-FORGET-ALL-INFERENCES", 0, 1, false);
        declareFunction(me, "cb_forget_all_other_inferences", "CB-FORGET-ALL-OTHER-INFERENCES", 0, 1, false);
        declareFunction(me, "cb_link_forget_all_other_inferences", "CB-LINK-FORGET-ALL-OTHER-INFERENCES", 0, 1, false);
        declareFunction(me, "cb_reinforce_inference", "CB-REINFORCE-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_link_reinforce_inference", "CB-LINK-REINFORCE-INFERENCE", 1, 1, false);
        declareFunction(me, "inference_reinforcement_applicableP", "INFERENCE-REINFORCEMENT-APPLICABLE?", 1, 0, false);
        declareFunction(me, "cb_destroy_inference", "CB-DESTROY-INFERENCE", 1, 0, false);
        declareFunction(me, "cb_link_destroy_inference", "CB-LINK-DESTROY-INFERENCE", 1, 1, false);
        declareFunction(me, "cb_destroy_all_inferences", "CB-DESTROY-ALL-INFERENCES", 0, 1, false);
        declareFunction(me, "cb_link_destroy_all_inferences", "CB-LINK-DESTROY-ALL-INFERENCES", 0, 1, false);
        declareFunction(me, "cb_destroy_all_other_inferences", "CB-DESTROY-ALL-OTHER-INFERENCES", 0, 1, false);
        declareFunction(me, "cb_link_destroy_all_other_inferences", "CB-LINK-DESTROY-ALL-OTHER-INFERENCES", 0, 1, false);
        declareFunction(me, "cb_link_inference_to_subl_query", "CB-LINK-INFERENCE-TO-SUBL-QUERY", 1, 1, false);
        declareFunction(me, "cb_inference_to_subl_query", "CB-INFERENCE-TO-SUBL-QUERY", 0, 1, false);
        declareFunction(me, "cb_link_graph_inference_answers", "CB-LINK-GRAPH-INFERENCE-ANSWERS", 1, 1, false);
        declareFunction(me, "cb_graph_inference_answers", "CB-GRAPH-INFERENCE-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_graph_inference_answers_int", "CB-GRAPH-INFERENCE-ANSWERS-INT", 1, 0, false);
        declareFunction(me, "cb_graph_inference_answers_window", "CB-GRAPH-INFERENCE-ANSWERS-WINDOW", 1, 0, false);
        declareFunction(me, "cb_save_inference_answers_int", "CB-SAVE-INFERENCE-ANSWERS-INT", 1, 0, false);
        declareFunction(me, "cb_inference_output_answers_to_html_stream_or_file", "CB-INFERENCE-OUTPUT-ANSWERS-TO-HTML-STREAM-OR-FILE", 6, 0, false);
        declareFunction(me, "cb_save_inference_answers", "CB-SAVE-INFERENCE-ANSWERS", 1, 0, false);
        declareFunction(me, "cb_link_save_inference_answers", "CB-LINK-SAVE-INFERENCE-ANSWERS", 1, 1, false);
        declareFunction(me, "cb_save_inference_answers_as_queries", "CB-SAVE-INFERENCE-ANSWERS-AS-QUERIES", 1, 0, false);
        declareFunction(me, "cb_save_inference_answers_as_queries_int", "CB-SAVE-INFERENCE-ANSWERS-AS-QUERIES-INT", 1, 0, false);
        declareFunction(me, "save_inference_answers_as_queries", "SAVE-INFERENCE-ANSWERS-AS-QUERIES", 3, 0, false);
        declareFunction(me, "cb_link_save_inference_answers_as_queries", "CB-LINK-SAVE-INFERENCE-ANSWERS-AS-QUERIES", 1, 1, false);
        declareFunction(me, "cb_inference_answer_timeline", "CB-INFERENCE-ANSWER-TIMELINE", 1, 0, false);
        declareFunction(me, "cb_link_inference_answer_timeline", "CB-LINK-INFERENCE-ANSWER-TIMELINE", 1, 1, false);
        declareFunction(me, "cb_show_inference_answer_timeline_image", "CB-SHOW-INFERENCE-ANSWER-TIMELINE-IMAGE", 1, 1, false);
        declareFunction(me, "inference_answer_tuples_for_chart", "INFERENCE-ANSWER-TUPLES-FOR-CHART", 1, 0, false);
        declareFunction(me, "cb_inference_strengthen_properties", "CB-INFERENCE-STRENGTHEN-PROPERTIES", 1, 0, false);
        declareFunction(me, "cb_link_inference_strengthen_properties", "CB-LINK-INFERENCE-STRENGTHEN-PROPERTIES", 2, 1, false);
        declareFunction(me, "query_tool_default_for_property", "QUERY-TOOL-DEFAULT-FOR-PROPERTY", 1, 0, false);
        declareFunction(me, "scaled_property_default_spec_lookup", "SCALED-PROPERTY-DEFAULT-SPEC-LOOKUP", 2, 0, false);
        declareFunction(me, "cb_transformation_rule_statistics", "CB-TRANSFORMATION-RULE-STATISTICS", 0, 1, false);
        declareFunction(me, "cb_transformation_rule_statistics_int", "CB-TRANSFORMATION-RULE-STATISTICS-INT", 1, 0, false);
        declareFunction(me, "cb_link_transformation_rule_statistics", "CB-LINK-TRANSFORMATION-RULE-STATISTICS", 0, 2, false);
        declareFunction(me, "cb_show_transformation_rule_statistics", "CB-SHOW-TRANSFORMATION-RULE-STATISTICS", 0, 2, false);
        declareFunction(me, "cb_show_transformation_rule_statistics_int", "CB-SHOW-TRANSFORMATION-RULE-STATISTICS-INT", 1, 0, false);
        declareFunction(me, "cb_show_transformation_rule_statistics_for_rule", "CB-SHOW-TRANSFORMATION-RULE-STATISTICS-FOR-RULE", 2, 0, false);
        declareFunction(me, "cb_show_transformation_rule_utility_keyword", "CB-SHOW-TRANSFORMATION-RULE-UTILITY-KEYWORD", 1, 0, false);
        declareFunction(me, "transformation_rule_utility_color_and_keyword", "TRANSFORMATION-RULE-UTILITY-COLOR-AND-KEYWORD", 1, 0, false);
        declareFunction(me, "cb_disable_strategic_heuristic_rule_historical_utility", "CB-DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 1, false);
        declareFunction(me, "cb_link_disable_strategic_heuristic_rule_historical_utility", "CB-LINK-DISABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 1, false);
        declareFunction(me, "cb_enable_strategic_heuristic_rule_historical_utility", "CB-ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 1, false);
        declareFunction(me, "cb_link_enable_strategic_heuristic_rule_historical_utility", "CB-LINK-ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY", 0, 1, false);
        declareFunction(me, "cb_disable_transformation_rule_statistics_update", "CB-DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 1, false);
        declareFunction(me, "cb_link_disable_transformation_rule_statistics_update", "CB-LINK-DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 1, false);
        declareFunction(me, "cb_enable_transformation_rule_statistics_update", "CB-ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 1, false);
        declareFunction(me, "cb_link_enable_transformation_rule_statistics_update", "CB-LINK-ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE", 0, 1, false);
        declareFunction(me, "cb_disable_transformation_rule_historical_success_pruning", "CB-DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING", 0, 1, false);
        declareFunction(me, "cb_link_disable_transformation_rule_historical_success_pruning", "CB-LINK-DISABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING", 0, 1, false);
        declareFunction(me, "cb_enable_transformation_rule_historical_success_pruning", "CB-ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING", 0, 1, false);
        declareFunction(me, "cb_link_enable_transformation_rule_historical_success_pruning", "CB-LINK-ENABLE-TRANSFORMATION-RULE-HISTORICAL-SUCCESS-PRUNING", 0, 1, false);
        declareFunction(me, "cb_clear_transformation_rule_statistics", "CB-CLEAR-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction(me, "cb_link_clear_transformation_rule_statistics", "CB-LINK-CLEAR-TRANSFORMATION-RULE-STATISTICS", 1, 1, false);
        declareFunction(me, "cb_clear_all_transformation_rule_statistics", "CB-CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS", 0, 1, false);
        declareFunction(me, "cb_link_clear_all_transformation_rule_statistics", "CB-LINK-CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS", 0, 1, false);
        declareFunction(me, "cb_handle_transformation_rule_statistics", "CB-HANDLE-TRANSFORMATION-RULE-STATISTICS", 1, 0, false);
        declareFunction(me, "cb_handle_transformation_rule_statistics_load", "CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-LOAD", 1, 0, false);
        declareFunction(me, "cb_handle_transformation_rule_statistics_save", "CB-HANDLE-TRANSFORMATION-RULE-STATISTICS-SAVE", 1, 0, false);
        declareFunction(me, "cb_forward_inference_metrics", "CB-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_link_forward_inference_metrics", "CB-LINK-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_rule_forward_inference_metrics", "CB-RULE-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_link_rule_forward_inference_metrics", "CB-LINK-RULE-FORWARD-INFERENCE-METRICS", 1, 1, false);
        declareFunction(me, "cb_clear_forward_inference_metrics", "CB-CLEAR-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_link_clear_forward_inference_metrics", "CB-LINK-CLEAR-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_start_gathering_forward_inference_metrics", "CB-START-GATHERING-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_link_start_gathering_forward_inference_metrics", "CB-LINK-START-GATHERING-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_stop_gathering_forward_inference_metrics", "CB-STOP-GATHERING-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_link_stop_gathering_forward_inference_metrics", "CB-LINK-STOP-GATHERING-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "cb_show_forward_inference_metrics", "CB-SHOW-FORWARD-INFERENCE-METRICS", 0, 1, false);
        declareFunction(me, "extend_metric_plist_with_totals", "EXTEND-METRIC-PLIST-WITH-TOTALS", 1, 0, false);
        declareFunction(me, "cb_forward_inference_metrics_times_and_counts_table", "CB-FORWARD-INFERENCE-METRICS-TIMES-AND-COUNTS-TABLE", 2, 0, false);
        declareFunction(me, "cb_show_rule_forward_inference_metrics", "CB-SHOW-RULE-FORWARD-INFERENCE-METRICS", 2, 2, false);
        declareFunction(me, "cb_show_inference_link_and_time", "CB-SHOW-INFERENCE-LINK-AND-TIME", 1, 0, false);
        declareFunction(me, "cb_show_forward_inference_statistics_for_rule", "CB-SHOW-FORWARD-INFERENCE-STATISTICS-FOR-RULE", 1, 0, false);
        declareFunction(me, "categorize_inferences_by_provability_status", "CATEGORIZE-INFERENCES-BY-PROVABILITY-STATUS", 1, 0, false);
        declareFunction(me, "categorize_reified_supports_by_dependent_involving_support", "CATEGORIZE-REIFIED-SUPPORTS-BY-DEPENDENT-INVOLVING-SUPPORT", 2, 0, false);
        declareFunction(me, "cb_show_warning_icon", "CB-SHOW-WARNING-ICON", 0, 3, false);
        declareFunction(me, "cb_link_inference_graph", "CB-LINK-INFERENCE-GRAPH", 1, 1, false);
        declareFunction(me, "cb_inference_graph", "CB-INFERENCE-GRAPH", 1, 0, false);
        declareFunction(me, "cb_inference_graph_internal", "CB-INFERENCE-GRAPH-INTERNAL", 1, 0, false);
        declareFunction(me, "cb_inference_print_graph_of_inference", "CB-INFERENCE-PRINT-GRAPH-OF-INFERENCE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_query_file() {
        deflexical("*CB-INFERENCE-PROGRESS-FRAME-ENABLED?*", T);
        deflexical("*CB-INFERENCE-HELP-FILENAME*", $str26$inference_overview);
        deflexical("*INFERENCE-PARAMETER-TABLE*", SubLSystemTrampolineFile.maybeDefault($inference_parameter_table$, $inference_parameter_table$, () -> dictionary.new_dictionary(EQ, UNPROVIDED)));
        deflexical("*INFERENCE-MODE-CUSTOM-VALUE-NUMBER*", FOUR_INTEGER);
        defvar("*CB-INFERENCES*", NIL);
        defvar("*CB-CYC-EDITOR-ENABLED?*", NIL);
        defparameter("*DEFAULT-NEW-INFERENCE-MONAD-MT*", $const319$CurrentWorldDataCollectorMt_NonHo);
        defparameter("*DEFAULT-NEW-INFERENCE-MT*", listS($$MtSpace, $default_new_inference_monad_mt$.getDynamicValue(), $list322));
        deflexical("*CB-QUERY-DEFAULT-MT-MONAD-CHOICES*", $list325);
        defparameter("*CB-DEFAULT-QUERY-PARAMETERS*", NIL);
        deflexical("*CB-BASIC-INFERENCE-RESOURCE-CONSTRAINTS*", $list371);
        deflexical("*CB-INFERENCE-MODE-PROPERTIES*", $list377);
        deflexical("*CB-ADVANCED-INFERENCE-DYNAMIC-PROPERTIES*", $list382);
        deflexical("*CB-ADVANCED-INFERENCE-STATIC-PROPERTIES*", $list384);
        deflexical("*CB-ADVANCED-STRATEGY-DYNAMIC-PROPERTIES*", list(listS($PRODUCTIVITY_LIMIT, integerDivide(inference_datastructures_enumerated_types.$default_productivity_limit$.getGlobalValue(), $int$100), $list387)));
        deflexical("*CB-ADVANCED-STRATEGY-STATIC-PROPERTIES*", list(listS($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, integerDivide(inference_datastructures_enumerated_types.$default_removal_backtracking_productivity_limit$.getGlobalValue(), $int$100), $list387)));
        deflexical("*CB-ADVANCED-PROBLEM-STORE-DYNAMIC-PROPERTIES*", NIL);
        deflexical("*CB-ADVANCED-PROBLEM-STORE-STATIC-PROPERTIES*", $list388);
        deflexical("*CB-ALL-INFERENCE-PROPERTIES*", append(new SubLObject[]{ $cb_basic_inference_resource_constraints$.getGlobalValue(), $cb_advanced_inference_dynamic_properties$.getGlobalValue(), $cb_advanced_inference_static_properties$.getGlobalValue(), $cb_advanced_strategy_dynamic_properties$.getGlobalValue(), $cb_advanced_strategy_static_properties$.getGlobalValue(), $cb_advanced_problem_store_static_properties$.getGlobalValue() }));
        deflexical("*CB-ALL-INFERENCE-PARAMETERS*", Mapping.mapcar(symbol_function(FIRST), $cb_all_inference_properties$.getGlobalValue()));
        deflexical("*HTML-JS-ON-CLICK-PREAMBLE*", $str400$onClick__);
        deflexical("*HTML-JS-ON-CLICK-POSTAMBLE*", $str401$_);
        deflexical("*CB-SET-ALL-RADIO-BUTTONS-BODY*", $str402$set_all_radio_buttons_document_fo);
        deflexical("*CB-SET-FIELD-VALUE-BODY*", $str403$with__this_form_elements___A____v);
        deflexical("*CB-FOCUS-AND-SET-ALL-RADIO-BUTTONS-SCRIPT*", $str412$onClick__with__this_form_elements);
        deflexical("*CB-DEFAULT-UNSPECIFIED-QUERY-MT*", $$EverythingPSC);
        deflexical("*CB-LITERAL-QUERY-VARIABLES*", $list541);
        deflexical("*CB-LITERAL-QUERY-TIME-CUTOFF*", NIL);
        defparameter("*SORT-LITERAL-QUERY-TERMS-BY-GENERALITY-ESTIMATE?*", NIL);
        deflexical("*CB-QUERY-AUTO-REFRESH-RATE*", THREE_INTEGER);
        deflexical("*CB-OPEN-INFERENCE-PROGRESS-FRAME-HEIGHT*", $int$800);
        deflexical("*CB-CLOSED-INFERENCE-PROGRESS-FRAME-HEIGHT*", $int$80);
        deflexical("*CB-INFERENCE-ANSWER-SECTION-LIMIT*", TEN_INTEGER);
        defparameter("*CB-SHOW-FORWARD-INFERENCE-METRICS-VERBOSITY*", $TERSE);
        return NIL;
    }

    public static SubLObject setup_cb_query_file() {
        setup_cb_link_method($INFERENCE_DOC, CB_LINK_INFERENCE_DOC, TWO_INTEGER);
        declare_defglobal($inference_parameter_table$);
        meta_macros.declare_indention_pattern(DECLARE_INFERENCE_PARAMETER, $list40);
        register_macro_helper(DECLARE_INFERENCE_PARAMETER_INTERNAL, DECLARE_INFERENCE_PARAMETER);
        declare_inference_parameter_internal($MAX_NUMBER, $$$Number_cutoff, $str48$This_controls_how_many_answers_we, $list49, NIL, NIL);
        declare_inference_parameter_internal($MAX_TIME, $$$Time_cutoff, $str52$This_controls_how_long_we_allow_a, $list53, NIL, NIL);
        declare_inference_parameter_internal($MAX_STEP, $$$Step_cutoff, $str56$This_controls_how_many_inference_, $list57, NIL, NIL);
        declare_inference_parameter_internal($INFERENCE_MODE, $$$Inference_engine_mode, $str60$This_controls_what_mode_the_infer, $list61, NIL, NIL);
        declare_inference_parameter_internal($FORWARD_MAX_TIME, $$$Forward_time_cutoff, $str64$This_controls_how_long_we_allow_f, $list53, NIL, NIL);
        declare_inference_parameter_internal($MAX_TRANSFORMATION_DEPTH, $$$Transformation_cutoff, $str67$This_specifies_the_maximum_allowa, $list68, NIL, NIL);
        declare_inference_parameter_internal($MIN_RULE_UTILITY, $$$Rule_utility_threshold, $str71$This_specifies_the_minimum_allowa, $list72, NIL, NIL);
        declare_inference_parameter_internal($MAX_PROOF_DEPTH, $$$Proof_complexity_cutoff, $str75$This_specifies_the_maximum_allowa, $list76, NIL, NIL);
        declare_inference_parameter_internal($PROBABLY_APPROXIMATELY_DONE, $$$Probably_Done_cutoff, $str79$Probably_Approximately_Done__This, $list80, $float$0_01, NIL);
        declare_inference_parameter_internal($BLOCK_, $$$Step_by_step, $str84$This_controls_whether_the_inferen, $list85, NIL, NIL);
        declare_inference_parameter_internal($kw86$CACHE_INFERENCE_RESULTS_, $$$Cache_backward_query_results, $str88$This_controls_whether_or_not_the_, $list85, NIL, NIL);
        declare_inference_parameter_internal($ANSWER_LANGUAGE, $$$Answer_language, $str91$This_controls_the_CycL_language_u, $list92, NIL, NIL);
        declare_inference_parameter_internal($CONTINUABLE_, $$$Continuable, $str95$This_controls_whether_the_inferen, $list96, NIL, NIL);
        declare_inference_parameter_internal($METRICS, $$$Metrics, $str99$This_controls_which_metrics_are_g, $list100, NIL, NIL);
        declare_inference_parameter_internal($kw101$ALLOW_HL_PREDICATE_TRANSFORMATION_, $$$Allow_HL_predicate_transformation, $str103$Whether_transformation_is_allowed, $list104, NIL, NIL);
        declare_inference_parameter_internal($kw105$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_, $str106$Allow_unbound_predicate_rule_back, $str107$Whether_it_is_permissible_to_use_, $list104, NIL, NIL);
        declare_inference_parameter_internal($kw108$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_, $str109$Allow_evaluatable_predicate_trans, $str110$Whether_transformation_is_allowed, $list104, NIL, NIL);
        declare_inference_parameter_internal($kw111$ALLOW_INDETERMINATE_RESULTS_, $str112$Allow_result_bindings_to_indeterm, $str113$Whether_it_is_permissible_to_use_, $list85, NIL, NIL);
        declare_inference_parameter_internal($kw114$ALLOW_ABNORMALITY_CHECKING_, $str115$Allow_abnormality_checking_, $str116$Whether_to_check_for_exceptions_t, $list85, NIL, NIL);
        declare_inference_parameter_internal($TRANSITIVE_CLOSURE_MODE, $$$Transitive_closure_mode, $str119$The_degree_to_which_modules__such, $list120, NIL, NIL);
        declare_inference_parameter_internal($RESULT_UNIQUENESS, $$$Result_uniqueness_is_based_on, $str123$If_result_uniqueness_is_based_on_, $list124, NIL, NIL);
        declare_inference_parameter_internal($DISJUNCTION_FREE_EL_VARS_POLICY, $str126$If_disjuncts_have_different_free_, $str127$What_to_do_if_different_top_level, $list128, NIL, NIL);
        declare_inference_parameter_internal($ALLOWED_MODULES, $$$Allowed_HL_Modules, $str131$An_HL_module_specification_which_, $list132, NIL, NIL);
        declare_inference_parameter_internal($PRODUCTIVITY_LIMIT, $$$Productivity_limit, $str135$If_a_tactic_is_estimated_to_have_, $list136, $int$100, T);
        declare_inference_parameter_internal($REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT, $str139$Removal_backtracking_productivity, $str140$If_a_tactic_is_estimated_to_have_, $list141, $int$100, T);
        declare_inference_parameter_internal($EQUALITY_REASONING_METHOD, $$$Canonicalize_problems, $str144$Whether_to_canonicalize_problem_q, $list145, NIL, NIL);
        declare_inference_parameter_internal($EQUALITY_REASONING_DOMAIN, $$$Allow_problem_reuse_for, $str148$Which_problems_are_permitted_to_b, $list149, NIL, NIL);
        declare_inference_parameter_internal($INTERMEDIATE_STEP_VALIDATION_LEVEL, $$$Intermediate_proof_validation, $str152$How_carefully_to_check_the_interm, $list153, NIL, NIL);
        declare_inference_parameter_internal($MAX_PROBLEM_COUNT, $$$Space_cutoff, $str156$The_maximum_number_of_subproblems, $list157, NIL, NIL);
        declare_inference_parameter_internal($kw158$TRANSFORMATION_ALLOWED_, $$$Allow_transformation_at_all, $str160$Even_stronger_than_setting_the_in, $list161, NIL, NIL);
        declare_inference_parameter_internal($kw162$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $str163$Add_restriction_layer_of_indirect, $str164$When_solving_an_open_problem__the, $list85, NIL, NIL);
        declare_inference_parameter_internal($kw165$NEGATION_BY_FAILURE_, $$$Enable_negation_by_failure, $str167$This_controls_whether_or_not_we_a, $list85, NIL, NIL);
        declare_inference_parameter_internal($kw168$COMPLETENESS_MINIMIZATION_ALLOWED_, $str169$Enable_use_of_completeness_meta_k, $str170$This_controls_whether_or_not_we_a, $list85, NIL, NIL);
        declare_inference_parameter_internal($DIRECTION, $$$Inference_Direction, $str173$This_controls_whether_inferences_, $list174, NIL, NIL);
        declare_inference_parameter_internal($kw175$EVALUATE_SUBL_ALLOWED_, $str176$Enable_evaluation_of_SubL_perform, $str177$This_controls_whether_or_not_we_a, $list85, NIL, NIL);
        declare_inference_parameter_internal($kw178$REWRITE_ALLOWED_, $$$Enable_sidechaining, $str180$This_controls_whether_or_not_we_a, $list85, NIL, NIL);
        declare_inference_parameter_internal($kw181$ABDUCTION_ALLOWED_, $$$Enable_abduction, $str183$This_controls_whether_or_not_we_a, $list85, NIL, NIL);
        declare_inference_parameter_internal($kw184$NEW_TERMS_ALLOWED_, $$$Introduce_new_terms, $str186$This_controls_whether_or_not_we_a, $list85, NIL, NIL);
        declare_inference_parameter_internal($kw187$COMPUTE_ANSWER_JUSTIFICATIONS_, $$$Compute_Answer_Justifications, $str189$This_controls_whether_or_not_we_c, $list85, NIL, NIL);
        register_html_state_variable($cb_inferences$);
        html_macros.note_cgi_handler_function(CB_QUERY, $HTML_HANDLER);
        sethash($QUERY, cyc_file_dependencies.$cb_icon_definitions$.getGlobalValue(), list($str217$query_tool_gif, NIL));
        setup_cb_link_method($QUERY, CB_LINK_QUERY, ONE_INTEGER);
        declare_cb_tool($QUERY, $$$Query, $$$Query, $$$Ask_a_Query);
        sethash($CB_QUERY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str243$cb_query_html, NIL));
        register_html_state_variable($default_new_inference_monad_mt$);
        register_html_interface_variable($default_new_inference_monad_mt$);
        register_html_state_variable($default_new_inference_mt$);
        register_html_interface_variable($default_new_inference_mt$);
        register_html_state_variable($cb_default_query_parameters$);
        register_html_interface_variable($cb_default_query_parameters$);
        html_macros.note_cgi_handler_function(CB_QUERY_PROOF_CHECKER_DROP, $HTML_HANDLER);
        setup_cb_link_method($QUERY_PROOF_CHECKER_DROP, CB_LINK_QUERY_PROOF_CHECKER_DROP, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_QUERY_PROOF_CHECKER_DROP_ALL, $HTML_HANDLER);
        setup_cb_link_method($QUERY_PROOF_CHECKER_DROP_ALL, CB_LINK_QUERY_PROOF_CHECKER_DROP_ALL, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HANDLE_QUERY, $HTML_HANDLER);
        setup_cb_link_method($ASSERTION_SIMILAR_QUERY, CB_LINK_ASSERTION_SIMILAR_QUERY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_SIMILAR_QUERY, $HTML_HANDLER);
        setup_cb_link_method($ANTECEDENT_QUERY, CB_LINK_ANTECEDENT_QUERY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ASSERTION_ANTECEDENT_QUERY, $HTML_HANDLER);
        setup_cb_link_method($RULE_KNOWN_EXTENT_QUERY, CB_LINK_RULE_KNOWN_EXTENT_QUERY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_RULE_KNOWN_EXTENT_QUERY, $HTML_HANDLER);
        setup_cb_link_method($RULE_UNKNOWN_EXTENT_QUERY, CB_LINK_RULE_UNKNOWN_EXTENT_QUERY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_RULE_UNKNOWN_EXTENT_QUERY, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_LITERAL_QUERY, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_LQ, $HTML_HANDLER);
        sethash($CB_LITERAL_QUERY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str543$cb_literal_query_html, NIL));
        sethash($CB_LITERAL_QUERY, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str543$cb_literal_query_html, NIL));
        html_macros.note_cgi_handler_function(CB_INFERENCE_PROGRESS_PAGE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_AUTO_REFRESH_QUERY, $HTML_HANDLER);
        setup_cb_link_method($AUTO_REFRESH_QUERY, CB_LINK_AUTO_REFRESH_QUERY, TWO_INTEGER);
        setup_cb_link_method($ALL_INFERENCE_ANSWERS, CB_LINK_ALL_INFERENCE_ANSWERS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ALL_INFERENCE_ANSWERS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_FOCUS_INFERENCE, $HTML_HANDLER);
        setup_cb_link_method($FOCUS_INFERENCE, CB_LINK_FOCUS_INFERENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_DEFOCUS_INFERENCE, $HTML_HANDLER);
        setup_cb_link_method($DEFOCUS_INFERENCE, CB_LINK_DEFOCUS_INFERENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_INTERRUPT_INFERENCE, $HTML_HANDLER);
        setup_cb_link_method($INTERRUPT_INFERENCE, CB_LINK_INTERRUPT_INFERENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_ABORT_INFERENCE, $HTML_HANDLER);
        setup_cb_link_method($ABORT_INFERENCE, CB_LINK_ABORT_INFERENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_FORGET_INFERENCE, $HTML_HANDLER);
        setup_cb_link_method($FORGET_INFERENCE, CB_LINK_FORGET_INFERENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_FORGET_ALL_INFERENCES, $HTML_HANDLER);
        setup_cb_link_method($FORGET_ALL_INFERENCES, CB_LINK_FORGET_ALL_INFERENCES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_FORGET_ALL_OTHER_INFERENCES, $HTML_HANDLER);
        setup_cb_link_method($FORGET_ALL_OTHER_INFERENCES, CB_LINK_FORGET_ALL_OTHER_INFERENCES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_REINFORCE_INFERENCE, $HTML_HANDLER);
        setup_cb_link_method($REINFORCE_INFERENCE, CB_LINK_REINFORCE_INFERENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_DESTROY_INFERENCE, $HTML_HANDLER);
        setup_cb_link_method($DESTROY_INFERENCE, CB_LINK_DESTROY_INFERENCE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_DESTROY_ALL_INFERENCES, $HTML_HANDLER);
        setup_cb_link_method($DESTROY_ALL_INFERENCES, CB_LINK_DESTROY_ALL_INFERENCES, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_DESTROY_ALL_OTHER_INFERENCES, $HTML_HANDLER);
        setup_cb_link_method($DESTROY_ALL_OTHER_INFERENCES, CB_LINK_DESTROY_ALL_OTHER_INFERENCES, ONE_INTEGER);
        setup_cb_link_method($INFERENCE_TO_SUBL_QUERY, CB_LINK_INFERENCE_TO_SUBL_QUERY, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERENCE_TO_SUBL_QUERY, $HTML_HANDLER);
        setup_cb_link_method($GRAPH_INFERENCE_ANSWERS, CB_LINK_GRAPH_INFERENCE_ANSWERS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_GRAPH_INFERENCE_ANSWERS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_SAVE_INFERENCE_ANSWERS_INT, $HTML_HANDLER);
        sethash($CB_SAVE_INFERENCE_ANSWERS, cyc_file_dependencies.$cb_help_definitions$.getGlobalValue(), list($str730$cb_save_inference_answers_html, NIL));
        html_macros.note_cgi_handler_function(CB_SAVE_INFERENCE_ANSWERS, $HTML_HANDLER);
        setup_cb_link_method($SAVE_INFERENCE_ANSWERS, CB_LINK_SAVE_INFERENCE_ANSWERS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_SAVE_INFERENCE_ANSWERS_AS_QUERIES, $HTML_HANDLER);
        setup_cb_link_method($SAVE_INFERENCE_ANSWERS_AS_QUERIES, CB_LINK_SAVE_INFERENCE_ANSWERS_AS_QUERIES, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERENCE_ANSWER_TIMELINE, $HTML_HANDLER);
        setup_cb_link_method($INFERENCE_ANSWER_TIMELINE, CB_LINK_INFERENCE_ANSWER_TIMELINE, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERENCE_STRENGTHEN_PROPERTIES, $HTML_HANDLER);
        setup_cb_link_method($INFERENCE_STRENGTHEN_PROPERTIES, CB_LINK_INFERENCE_STRENGTHEN_PROPERTIES, THREE_INTEGER);
        html_macros.note_cgi_handler_function(CB_TRANSFORMATION_RULE_STATISTICS, $HTML_HANDLER);
        setup_cb_link_method($TRANSFORMATION_RULE_STATISTICS, CB_LINK_TRANSFORMATION_RULE_STATISTICS, TWO_INTEGER);
        cyc_navigator_internals.def_navigator_link($TRANSFORMATION_RULE_STATISTICS, $TEXT, $list842, $str843$cb_transformation_rule_statistics, ZERO_INTEGER, $MAIN, $$$Experience_Control_Panel, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_macros.note_cgi_handler_function(CB_DISABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY, $HTML_HANDLER);
        setup_cb_link_method($DISABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY, CB_LINK_DISABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_ENABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY, $HTML_HANDLER);
        setup_cb_link_method($ENABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY, CB_LINK_ENABLE_STRATEGIC_HEURISTIC_RULE_HISTORICAL_UTILITY, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_DISABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE, $HTML_HANDLER);
        setup_cb_link_method($DISABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE, CB_LINK_DISABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_ENABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE, $HTML_HANDLER);
        setup_cb_link_method($ENABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE, CB_LINK_ENABLE_TRANSFORMATION_RULE_STATISTICS_UPDATE, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_DISABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING, $HTML_HANDLER);
        setup_cb_link_method($DISABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING, CB_LINK_DISABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_ENABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING, $HTML_HANDLER);
        setup_cb_link_method($ENABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING, CB_LINK_ENABLE_TRANSFORMATION_RULE_HISTORICAL_SUCCESS_PRUNING, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_CLEAR_TRANSFORMATION_RULE_STATISTICS, $HTML_HANDLER);
        setup_cb_link_method($CLEAR_TRANSFORMATION_RULE_STATISTICS, CB_LINK_CLEAR_TRANSFORMATION_RULE_STATISTICS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_CLEAR_ALL_TRANSFORMATION_RULE_STATISTICS, $HTML_HANDLER);
        setup_cb_link_method($CLEAR_ALL_TRANSFORMATION_RULE_STATISTICS, CB_LINK_CLEAR_ALL_TRANSFORMATION_RULE_STATISTICS, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TRANSFORMATION_RULE_STATISTICS, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TRANSFORMATION_RULE_STATISTICS_LOAD, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_HANDLE_TRANSFORMATION_RULE_STATISTICS_SAVE, $HTML_HANDLER);
        html_macros.note_cgi_handler_function(CB_FORWARD_INFERENCE_METRICS, $HTML_HANDLER);
        setup_cb_link_method($FORWARD_INFERENCE_METRICS, CB_LINK_FORWARD_INFERENCE_METRICS, ONE_INTEGER);
        cyc_navigator_internals.def_navigator_link($FORWARD_INFERENCE_METRICS, $TEXT, $list842, $str940$cb_forward_inference_metrics, ZERO_INTEGER, $MAIN, $$$Forward_Inference_Metrics, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        html_macros.note_cgi_handler_function(CB_RULE_FORWARD_INFERENCE_METRICS, $HTML_HANDLER);
        setup_cb_link_method($RULE_FORWARD_INFERENCE_METRICS, CB_LINK_RULE_FORWARD_INFERENCE_METRICS, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_CLEAR_FORWARD_INFERENCE_METRICS, $HTML_HANDLER);
        setup_cb_link_method($CLEAR_FORWARD_INFERENCE_METRICS, CB_LINK_CLEAR_FORWARD_INFERENCE_METRICS, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_START_GATHERING_FORWARD_INFERENCE_METRICS, $HTML_HANDLER);
        setup_cb_link_method($START_GATHERING_FORWARD_INFERENCE_METRICS, CB_LINK_START_GATHERING_FORWARD_INFERENCE_METRICS, ONE_INTEGER);
        html_macros.note_cgi_handler_function(CB_STOP_GATHERING_FORWARD_INFERENCE_METRICS, $HTML_HANDLER);
        setup_cb_link_method($STOP_GATHERING_FORWARD_INFERENCE_METRICS, CB_LINK_STOP_GATHERING_FORWARD_INFERENCE_METRICS, ONE_INTEGER);
        setup_cb_link_method($INFERENCE_GRAPH, CB_LINK_INFERENCE_GRAPH, TWO_INTEGER);
        html_macros.note_cgi_handler_function(CB_INFERENCE_GRAPH, $HTML_HANDLER);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_query_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_query_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_query_file();
    }

    
}

/**
 * Total time: 21480 ms
 */
