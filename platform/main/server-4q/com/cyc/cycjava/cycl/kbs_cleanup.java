package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.inference.kb_query;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kbs_cleanup extends SubLTranslatedFile {
    public static final SubLFile me = new kbs_cleanup();

    public static final String myName = "com.cyc.cycjava.cycl.kbs_cleanup";

    public static final String myFingerPrint = "89c1808003801a3723dded26027942a24d517e424f24cd751badf370e066450a";

    // defvar
    // Definitions
    // A list of predicates whose extent should not be included in the KB subset
    private static final SubLSymbol $kbs_clear_extent$ = makeSymbol("*KBS-CLEAR-EXTENT*");

    // defparameter
    private static final SubLSymbol $show_kbs_cleanup_warningsP$ = makeSymbol("*SHOW-KBS-CLEANUP-WARNINGS?*");

    // defparameter
    private static final SubLSymbol $sparse_nart_preds$ = makeSymbol("*SPARSE-NART-PREDS*");

    // deflexical
    private static final SubLSymbol $uninteresting_nart_predicates_wrt_opencyc$ = makeSymbol("*UNINTERESTING-NART-PREDICATES-WRT-OPENCYC*");

    // Internal Constants
    public static final SubLList $list0 = list(reader_make_constant_shell(makeString("cyclistNotes")));

    public static final SubLString $$$opencyc = makeString("opencyc");

    public static final SubLString $str2$Clearing_invalid_bookkeeping_asse = makeString("Clearing invalid bookkeeping assertions");





    private static final SubLObject $$myCreator = reader_make_constant_shell(makeString("myCreator"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLObject $$myCreationPurpose = reader_make_constant_shell(makeString("myCreationPurpose"));

    public static final SubLString $$$Fixing_invalid_deductions = makeString("Fixing invalid deductions");

    public static final SubLString $str9$invalid_deduction___S = makeString("invalid deduction: ~S");



    public static final SubLString $str11$clearing_extent_of__S = makeString("clearing extent of ~S");



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static final SubLString $str15$Killing_terms_without_isa_asserti = makeString("Killing terms without isa assertions (this message will appear twice (constants then NARTs))");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLString $str17$Killing__S___S_ = makeString("Killing ~S (~S)");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$HLPrototypicalTerm = reader_make_constant_shell(makeString("HLPrototypicalTerm"));

    public static final SubLString $$$Killing_naked_prototypicals = makeString("Killing naked prototypicals");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLObject $$hlPrototypicalInstance = reader_make_constant_shell(makeString("hlPrototypicalInstance"));

    private static final SubLString $str24$Killing__S = makeString("Killing ~S");

    private static final SubLObject $$SkolemFunction = reader_make_constant_shell(makeString("SkolemFunction"));

    private static final SubLString $$$Killing_empty_skolems = makeString("Killing empty skolems");

    private static final SubLString $str27$Removing_bad___termOfUnit_asserti = makeString("Removing bad #$termOfUnit assertions...");

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    private static final SubLString $str29$Removing__A = makeString("Removing ~A");

    private static final SubLList $list30 = list(reader_make_constant_shell(makeString("termOfUnit")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")));

    private static final SubLString $str31$Killing_NARTs_with_only_definitio = makeString("Killing NARTs with only definitional info");

    private static final SubLString $str32$Keeping__S___S_ = makeString("Keeping ~S (~S)");

    private static final SubLString $$$Removing_invalid_arguments = makeString("Removing invalid arguments");

    private static final SubLString $str34$Assertion__S_removed_ = makeString("Assertion ~S removed!");

    private static final SubLString $str35$Removing_redundant_true_asserted_ = makeString("Removing redundant true asserted arguments");





    private static final SubLSymbol ARGUMENT_TRUTH = makeSymbol("ARGUMENT-TRUTH");

    private static final SubLString $str39$Assertion_removed_ = makeString("Assertion removed!");

    private static final SubLString $$$Removing_invalid_KB_queries = makeString("Removing invalid KB queries");

    private static final SubLObject $$KBContentTest_FullySpecified = reader_make_constant_shell(makeString("KBContentTest-FullySpecified"));











    private static final SubLString $str47$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str52$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str53$Killing_query__A_because_it_has_n = makeString("Killing query ~A because it has no query specification.");

    private static final SubLString $str54$Killing_invalid_query__A_because_ = makeString("Killing invalid query ~A because: ~A");

    private static final SubLString $str55$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str56$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    public static final SubLList $list57 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str58$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str59$Forgetting_useless_NARTs_wrt_Open = makeString("Forgetting useless NARTs wrt OpenCyc");

    private static final SubLString $str60$Gathering_useless_NARTs_wrt_OpenC = makeString("Gathering useless NARTs wrt OpenCyc");



    private static final SubLList $list62 = list(reader_make_constant_shell(makeString("prettyString")), reader_make_constant_shell(makeString("prettyString-Canonical")), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("quotedIsa")));



    public static SubLObject kbs_cleanup() {
        fix_invalid_deductions();
        kbs_clear_extent();
        kill_empty_kbs_terms();
        kill_empty_skolems();
        kill_naked_prototypicals();
        remove_bad_term_of_unit_assertions();
        kill_sparse_narts();
        at_defns.initialize_sufficient_defns_cache();
        at_defns.initialize_sufficient_functions_cache();
        skolems.reset_skolem_defn_table(T, NIL);
        kbs_kill_unrunnable_kb_queries();
        if ($$$opencyc.equal(kbs_utilities.get_kbs_name())) {
            forget_useless_narts_wrt_opencyc_until_quiescence();
        }
        clean_invalid_bookkeeping_info();
        return NIL;
    }

    public static SubLObject clean_invalid_bookkeeping_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str2$Clearing_invalid_bookkeeping_asse;
        final SubLObject total_$1 = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$2 = idx;
                if (NIL == id_index_objects_empty_p(idx_$2, $SKIP)) {
                    final SubLObject idx_$3 = idx_$2;
                    if (NIL == id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$3);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        SubLObject creator;
                        SubLObject purpose;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            constant = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(constant)) {
                                    constant = $SKIP;
                                }
                                creator = bookkeeping_store.creator(constant, UNPROVIDED);
                                if (((NIL != creator) && (NIL != forts.invalid_fortP(creator))) && (NIL != bookkeeping_store.hl_unassert_bookkeeping_binary_gaf($$myCreator, constant, creator, $$BookkeepingMt))) {
                                    total = add(total, ONE_INTEGER);
                                }
                                purpose = bookkeeping_store.creation_purpose(constant, UNPROVIDED);
                                if (((NIL != purpose) && (NIL != forts.invalid_fortP(purpose))) && (NIL != bookkeeping_store.hl_unassert_bookkeeping_binary_gaf($$myCreationPurpose, constant, purpose, $$BookkeepingMt))) {
                                    total = add(total, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total_$1);
                            }
                        }
                    }
                    final SubLObject idx_$4 = idx_$2;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$4)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$4);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$4);
                        final SubLObject end_id = id_index_next_id(idx_$4);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                final SubLObject creator2 = bookkeeping_store.creator(constant2, UNPROVIDED);
                                if (((NIL != creator2) && (NIL != forts.invalid_fortP(creator2))) && (NIL != bookkeeping_store.hl_unassert_bookkeeping_binary_gaf($$myCreator, constant2, creator2, $$BookkeepingMt))) {
                                    total = add(total, ONE_INTEGER);
                                }
                                final SubLObject purpose2 = bookkeeping_store.creation_purpose(constant2, UNPROVIDED);
                                if (((NIL != purpose2) && (NIL != forts.invalid_fortP(purpose2))) && (NIL != bookkeeping_store.hl_unassert_bookkeeping_binary_gaf($$myCreationPurpose, constant2, purpose2, $$BookkeepingMt))) {
                                    total = add(total, ONE_INTEGER);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total_$1);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject fix_invalid_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            final SubLObject idx = deduction_handles.do_deductions_table();
            final SubLObject mess = $$$Fixing_invalid_deductions;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_0_$6 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$7 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$8 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$8, $SKIP)) {
                        final SubLObject idx_$9 = idx_$8;
                        if (NIL == id_index_dense_objects_empty_p(idx_$9, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$9);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject deduction;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                d_handle = aref(vector_var, d_id);
                                if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(d_handle)) {
                                        d_handle = $SKIP;
                                    }
                                    deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                    if (NIL == deduction_handles.valid_deduction(deduction, T)) {
                                        if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                            Errors.warn($str9$invalid_deduction___S, deduction_handles.deduction_id(deduction));
                                        }
                                        remove_invalid_deduction(deduction);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$10 = idx_$8;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$10)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$10);
                            SubLObject d_id2 = id_index_sparse_id_threshold(idx_$10);
                            final SubLObject end_id = id_index_next_id(idx_$10);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                    final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    if (NIL == deduction_handles.valid_deduction(deduction2, T)) {
                                        if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                            Errors.warn($str9$invalid_deduction___S, deduction_handles.deduction_id(deduction2));
                                        }
                                        remove_invalid_deduction(deduction2);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                d_id2 = add(d_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$7, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$6, thread);
            }
        } finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject remove_invalid_deduction(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
        return tms.tms_remove_argument(deduction, supported_object, UNPROVIDED);
    }

    public static SubLObject kbs_clear_extent() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $kbs_clear_extent$.getDynamicValue(thread);
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject message = format(NIL, $str11$clearing_extent_of__S, predicate);
            final SubLObject total = kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED);
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$12 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$14 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$15 = $progress_notification_count$.currentBinding(thread);
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
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$16 = NIL;
                                        final SubLObject token_var_$17 = NIL;
                                        while (NIL == done_var_$16) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                            final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(ass));
                                            if (NIL != valid_$18) {
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                                SubLObject ignore_errors_tag = NIL;
                                                try {
                                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                                    final SubLObject _prev_bind_0_$13 = Errors.$error_handler$.currentBinding(thread);
                                                    try {
                                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                                        try {
                                                            tms.tms_remove_assertion(ass);
                                                        } catch (final Throwable catch_var) {
                                                            Errors.handleThrowable(catch_var, NIL);
                                                        }
                                                    } finally {
                                                        Errors.$error_handler$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                } catch (final Throwable ccatch_env_var) {
                                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                                } finally {
                                                    thread.throwStack.pop();
                                                }
                                            }
                                            done_var_$16 = makeBoolean(NIL == valid_$18);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_3_$15, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$14, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$13, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject kill_empty_kbs_terms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            final SubLObject message = $str15$Killing_terms_without_isa_asserti;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$22 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$23 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = NIL;
                    table_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                            final SubLObject idx_$24 = idx;
                            if (NIL == id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$24);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject total_$25;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    fort = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(fort)) {
                                            fort = $SKIP;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        if ((NIL != forts.valid_fortP(fort)) && (!kb_indexing.num_gaf_arg_index(fort, ONE_INTEGER, $$isa, UNPROVIDED).isPositive())) {
                                            if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                total_$25 = kb_indexing.num_index(fort);
                                                Errors.warn($str17$Killing__S___S_, fort, total_$25);
                                            }
                                            cyc_kernel.cyc_kill(fort);
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$25 = idx;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$25)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$25);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$25);
                                final SubLObject end_id = id_index_next_id(idx_$25);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        if ((NIL != forts.valid_fortP(fort2)) && (!kb_indexing.num_gaf_arg_index(fort2, ONE_INTEGER, $$isa, UNPROVIDED).isPositive())) {
                                            if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                final SubLObject total_$26 = kb_indexing.num_index(fort2);
                                                Errors.warn($str17$Killing__S___S_, fort2, total_$26);
                                            }
                                            cyc_kernel.cyc_kill(fort2);
                                        }
                                    }
                                    id2 = add(id2, ONE_INTEGER);
                                } 
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$23, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$22, thread);
            }
        } finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject kill_naked_prototypicals() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            SubLObject prototypicals = NIL;
            final SubLObject _prev_bind_0_$29 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$30 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                prototypicals = isa.all_quoted_instances($$HLPrototypicalTerm, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$30, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$29, thread);
            }
            final SubLObject list_var = prototypicals;
            final SubLObject _prev_bind_0_$30 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$31 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Killing_naked_prototypicals, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject prototypical = NIL;
                    prototypical = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (((NIL != forts.fort_p(prototypical)) && (!kb_indexing.num_gaf_arg_index(prototypical, ONE_INTEGER, $$hlPrototypicalInstance, UNPROVIDED).isPositive())) && (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread))) {
                            Errors.warn($str24$Killing__S, prototypical);
                            cyc_kernel.cyc_kill(prototypical);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        prototypical = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$31, thread);
                $progress_note$.rebind(_prev_bind_0_$30, thread);
            }
        } finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject kill_empty_skolems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            SubLObject v_skolems = NIL;
            final SubLObject _prev_bind_0_$34 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$35 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                v_skolems = isa.all_fort_instances($$SkolemFunction, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_1_$35, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$34, thread);
            }
            final SubLObject list_var = v_skolems;
            final SubLObject _prev_bind_0_$35 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$36 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Killing_empty_skolems, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject skolem = NIL;
                    skolem = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL != skolems.skolem_function_has_no_defn_assertions_robustP(skolem)) {
                            if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                Errors.warn($str24$Killing__S, skolem);
                            }
                            cyc_kernel.cyc_kill(skolem);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        skolem = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$36, thread);
                $progress_note$.rebind(_prev_bind_0_$35, thread);
            }
        } finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject remove_bad_term_of_unit_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($str27$Removing_bad___termOfUnit_asserti);
                final SubLObject _prev_bind_0_$39 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$40 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject tou_count = kb_indexing.num_predicate_extent_index($$termOfUnit, UNPROVIDED);
                    SubLObject count = ZERO_INTEGER;
                    final SubLObject pred_var = $$termOfUnit;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$40 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$41 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$43 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$44 = $progress_notification_count$.currentBinding(thread);
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
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$45 = NIL;
                                        final SubLObject token_var_$46 = NIL;
                                        while (NIL == done_var_$45) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$46);
                                            final SubLObject valid_$47 = makeBoolean(!token_var_$46.eql(assertion));
                                            if (NIL != valid_$47) {
                                                if (NIL == kb_cleanup.tou_assertion_goodP(assertion)) {
                                                    if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                        Errors.warn($str29$Removing__A, assertion);
                                                    }
                                                    assertions_high.remove_assertion(assertion);
                                                }
                                                count = add(count, ONE_INTEGER);
                                                note_percent_progress(count, tou_count);
                                            }
                                            done_var_$45 = makeBoolean(NIL == valid_$47);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_3_$44, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$43, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$41, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$40, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$40, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$39, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject kill_sparse_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kill_total = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = $str31$Killing_NARTs_with_only_definitio;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_0_$50 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$51 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$52 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$52, $SKIP)) {
                        final SubLObject idx_$53 = idx_$52;
                        if (NIL == id_index_dense_objects_empty_p(idx_$53, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$53);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject nart;
                            SubLObject total_$54;
                            SubLObject def_total;
                            SubLObject cdolist_list_var;
                            SubLObject pred;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                nart = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(nart)) {
                                        nart = $SKIP;
                                    }
                                    if (NIL != nart_handles.valid_nartP(nart, UNPROVIDED)) {
                                        total_$54 = kb_indexing.num_index(nart);
                                        def_total = ZERO_INTEGER;
                                        cdolist_list_var = $sparse_nart_preds$.getDynamicValue(thread);
                                        pred = NIL;
                                        pred = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            def_total = add(def_total, kb_indexing.num_gaf_arg_index(nart, ONE_INTEGER, pred, UNPROVIDED));
                                            cdolist_list_var = cdolist_list_var.rest();
                                            pred = cdolist_list_var.first();
                                        } 
                                        if (total_$54.numG(def_total)) {
                                            if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                Errors.warn($str32$Keeping__S___S_, nart, subtract(total_$54, def_total));
                                            }
                                        } else {
                                            cyc_kernel.cyc_kill(nart);
                                            kill_total = add(kill_total, ONE_INTEGER);
                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$54 = idx_$52;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$54)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$54);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$54);
                            final SubLObject end_id = id_index_next_id(idx_$54);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                    if (NIL != nart_handles.valid_nartP(nart2, UNPROVIDED)) {
                                        final SubLObject total_$55 = kb_indexing.num_index(nart2);
                                        SubLObject def_total2 = ZERO_INTEGER;
                                        SubLObject cdolist_list_var2 = $sparse_nart_preds$.getDynamicValue(thread);
                                        SubLObject pred2 = NIL;
                                        pred2 = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            def_total2 = add(def_total2, kb_indexing.num_gaf_arg_index(nart2, ONE_INTEGER, pred2, UNPROVIDED));
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            pred2 = cdolist_list_var2.first();
                                        } 
                                        if (total_$55.numG(def_total2)) {
                                            if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                Errors.warn($str32$Keeping__S___S_, nart2, subtract(total_$55, def_total2));
                                            }
                                        } else {
                                            cyc_kernel.cyc_kill(nart2);
                                            kill_total = add(kill_total, ONE_INTEGER);
                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$51, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$50, thread);
            }
        } finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return kill_total;
    }

    public static SubLObject fix_reconsider_tms() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = $$$Removing_invalid_arguments;
            final SubLObject total_$58 = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_0_$59 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$60 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$61 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$61, $SKIP)) {
                        final SubLObject idx_$62 = idx_$61;
                        if (NIL == id_index_dense_objects_empty_p(idx_$62, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$62);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            SubLObject id;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                        id = assertion_handles.assertion_id(assertion);
                                        if (NIL != tms.tms_reconsider_assertion(assertion)) {
                                            if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                Errors.warn($str34$Assertion__S_removed_, id);
                                            }
                                            total = add(total, ONE_INTEGER);
                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$58);
                                }
                            }
                        }
                        final SubLObject idx_$63 = idx_$61;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$63)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$63);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$63);
                            final SubLObject end_id = id_index_next_id(idx_$63);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (NIL != assertions_high.valid_assertion(assertion2, UNPROVIDED)) {
                                        final SubLObject id2 = assertion_handles.assertion_id(assertion2);
                                        if (NIL != tms.tms_reconsider_assertion(assertion2)) {
                                            if (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread)) {
                                                Errors.warn($str34$Assertion__S_removed_, id2);
                                            }
                                            total = add(total, ONE_INTEGER);
                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$58);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$60, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$59, thread);
            }
        } finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject fix_remove_redundant_arguments() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            Errors.$continue_cerrorP$.bind(T, thread);
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = $str35$Removing_redundant_true_asserted_;
            final SubLObject total_$65 = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
            final SubLObject _prev_bind_0_$66 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$67 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$68 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$68, $SKIP)) {
                        final SubLObject idx_$69 = idx_$68;
                        if (NIL == id_index_dense_objects_empty_p(idx_$69, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$69);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            SubLObject v_arguments;
                            SubLObject asserted_argument;
                            SubLObject assertion_goneP;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (((((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) && (NIL != assertions_high.gaf_assertionP(assertion))) && (NIL != assertions_high.asserted_assertionP(assertion))) && (NIL == assertions_high.assertion_has_dependents_p(assertion))) && (NIL != assertions_high.assertion_has_truth(assertion, $TRUE))) {
                                        v_arguments = assertions_high.assertion_arguments(assertion);
                                        if ((NIL == list_utilities.singletonP(v_arguments)) && (NIL == find($FALSE, v_arguments, symbol_function(EQL), symbol_function(ARGUMENT_TRUTH), UNPROVIDED, UNPROVIDED))) {
                                            asserted_argument = assertions_high.get_asserted_argument(assertion);
                                            if (NIL != asserted_argument) {
                                                total = add(total, ONE_INTEGER);
                                                assertion_goneP = tms.tms_remove_argument(asserted_argument, assertion, UNPROVIDED);
                                                if ((NIL != assertion_goneP) && (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread))) {
                                                    Errors.warn($str39$Assertion_removed_);
                                                }
                                            }
                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$65);
                                }
                            }
                        }
                        final SubLObject idx_$70 = idx_$68;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$70)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$70);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$70);
                            final SubLObject end_id = id_index_next_id(idx_$70);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (((((NIL != assertions_high.valid_assertion(assertion2, UNPROVIDED)) && (NIL != assertions_high.gaf_assertionP(assertion2))) && (NIL != assertions_high.asserted_assertionP(assertion2))) && (NIL == assertions_high.assertion_has_dependents_p(assertion2))) && (NIL != assertions_high.assertion_has_truth(assertion2, $TRUE))) {
                                        final SubLObject v_arguments2 = assertions_high.assertion_arguments(assertion2);
                                        if ((NIL == list_utilities.singletonP(v_arguments2)) && (NIL == find($FALSE, v_arguments2, symbol_function(EQL), symbol_function(ARGUMENT_TRUTH), UNPROVIDED, UNPROVIDED))) {
                                            final SubLObject asserted_argument2 = assertions_high.get_asserted_argument(assertion2);
                                            if (NIL != asserted_argument2) {
                                                total = add(total, ONE_INTEGER);
                                                final SubLObject assertion_goneP2 = tms.tms_remove_argument(asserted_argument2, assertion2, UNPROVIDED);
                                                if ((NIL != assertion_goneP2) && (NIL != $show_kbs_cleanup_warningsP$.getDynamicValue(thread))) {
                                                    Errors.warn($str39$Assertion_removed_);
                                                }
                                            }
                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total_$65);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$67, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$66, thread);
            }
        } finally {
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return total;
    }

    public static SubLObject kbs_kill_unrunnable_kb_queries() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        format(T, $$$Removing_invalid_KB_queries);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject node_var = $$KBContentTest_FullySpecified;
            final SubLObject _prev_bind_0_$72 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$73 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$74 = node_var;
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
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str52$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str47$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$75 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$75 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$76 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$76 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$82 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                SubLObject iteration_state_$86;
                                                                                for (iteration_state_$86 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$86); iteration_state_$86 = dictionary_contents.do_dictionary_contents_next(iteration_state_$86)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$86);
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
                                                                                                SubLObject query;
                                                                                                SubLObject query_spec;
                                                                                                SubLObject severity;
                                                                                                SubLObject reason;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(query)) {
                                                                                                            query_spec = kct_utils.kct_query_specification(query, UNPROVIDED);
                                                                                                            if (NIL == query_spec) {
                                                                                                                Errors.warn($str53$Killing_query__A_because_it_has_n, query);
                                                                                                            } else
                                                                                                                if (NIL == kb_query.kbq_runnableP(query_spec)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    severity = kb_query.why_not_kbq_valid(query_spec, UNPROVIDED);
                                                                                                                    reason = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    Errors.warn($str54$Killing_invalid_query__A_because_, query, reason);
                                                                                                                    cyc_kernel.cyc_kill(query);
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                }

                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject query2 = NIL;
                                                                                                    query2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(query2)) {
                                                                                                                final SubLObject query_spec2 = kct_utils.kct_query_specification(query2, UNPROVIDED);
                                                                                                                if (NIL == query_spec2) {
                                                                                                                    Errors.warn($str53$Killing_query__A_because_it_has_n, query2);
                                                                                                                } else
                                                                                                                    if (NIL == kb_query.kbq_runnableP(query_spec2)) {
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        final SubLObject severity2 = kb_query.why_not_kbq_valid(query_spec2, UNPROVIDED);
                                                                                                                        final SubLObject reason2 = thread.secondMultipleValue();
                                                                                                                        thread.resetMultipleValues();
                                                                                                                        Errors.warn($str54$Killing_invalid_query__A_because_, query2, reason2);
                                                                                                                        cyc_kernel.cyc_kill(query2);
                                                                                                                        count = add(count, ONE_INTEGER);
                                                                                                                    }

                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        query2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$79, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$86);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$78, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str56$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list57);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list57);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list57);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject query;
                                                                                            SubLObject query_spec;
                                                                                            SubLObject severity;
                                                                                            SubLObject reason;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                query = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, query)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(query)) {
                                                                                                        query_spec = kct_utils.kct_query_specification(query, UNPROVIDED);
                                                                                                        if (NIL == query_spec) {
                                                                                                            Errors.warn($str53$Killing_query__A_because_it_has_n, query);
                                                                                                        } else
                                                                                                            if (NIL == kb_query.kbq_runnableP(query_spec)) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                severity = kb_query.why_not_kbq_valid(query_spec, UNPROVIDED);
                                                                                                                reason = thread.secondMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                Errors.warn($str54$Killing_invalid_query__A_because_, query, reason);
                                                                                                                cyc_kernel.cyc_kill(query);
                                                                                                                count = add(count, ONE_INTEGER);
                                                                                                            }

                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$90 = sol;
                                                                                                SubLObject query2 = NIL;
                                                                                                query2 = csome_list_var_$90.first();
                                                                                                while (NIL != csome_list_var_$90) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(query2)) {
                                                                                                            final SubLObject query_spec2 = kct_utils.kct_query_specification(query2, UNPROVIDED);
                                                                                                            if (NIL == query_spec2) {
                                                                                                                Errors.warn($str53$Killing_query__A_because_it_has_n, query2);
                                                                                                            } else
                                                                                                                if (NIL == kb_query.kbq_runnableP(query_spec2)) {
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    final SubLObject severity2 = kb_query.why_not_kbq_valid(query_spec2, UNPROVIDED);
                                                                                                                    final SubLObject reason2 = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    Errors.warn($str54$Killing_invalid_query__A_because_, query2, reason2);
                                                                                                                    cyc_kernel.cyc_kill(query2);
                                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                                }

                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$90 = csome_list_var_$90.rest();
                                                                                                    query2 = csome_list_var_$90.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$81, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$80, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list57);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$91;
                                                                final SubLObject new_list = cdolist_list_var_$91 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$91.first();
                                                                while (NIL != cdolist_list_var_$91) {
                                                                    final SubLObject _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject query3;
                                                                            SubLObject query_spec3;
                                                                            SubLObject severity3;
                                                                            SubLObject reason3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                query3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, query3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(query3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(query3)) {
                                                                                        query_spec3 = kct_utils.kct_query_specification(query3, UNPROVIDED);
                                                                                        if (NIL == query_spec3) {
                                                                                            Errors.warn($str53$Killing_query__A_because_it_has_n, query3);
                                                                                        } else
                                                                                            if (NIL == kb_query.kbq_runnableP(query_spec3)) {
                                                                                                thread.resetMultipleValues();
                                                                                                severity3 = kb_query.why_not_kbq_valid(query_spec3, UNPROVIDED);
                                                                                                reason3 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                Errors.warn($str54$Killing_invalid_query__A_because_, query3, reason3);
                                                                                                cyc_kernel.cyc_kill(query3);
                                                                                                count = add(count, ONE_INTEGER);
                                                                                            }

                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject query4 = NIL;
                                                                                query4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(query4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(query4)) {
                                                                                            final SubLObject query_spec4 = kct_utils.kct_query_specification(query4, UNPROVIDED);
                                                                                            if (NIL == query_spec4) {
                                                                                                Errors.warn($str53$Killing_query__A_because_it_has_n, query4);
                                                                                            } else
                                                                                                if (NIL == kb_query.kbq_runnableP(query_spec4)) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    final SubLObject severity4 = kb_query.why_not_kbq_valid(query_spec4, UNPROVIDED);
                                                                                                    final SubLObject reason4 = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    Errors.warn($str54$Killing_invalid_query__A_because_, query4, reason4);
                                                                                                    cyc_kernel.cyc_kill(query4);
                                                                                                    count = add(count, ONE_INTEGER);
                                                                                                }

                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    query4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$82, thread);
                                                                    }
                                                                    cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                                    generating_fn = cdolist_list_var_$91.first();
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
                                                    final SubLObject _prev_bind_0_$83 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
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
                                                                            final SubLObject _prev_bind_0_$84 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$87;
                                                                                for (iteration_state_$87 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$87); iteration_state_$87 = dictionary_contents.do_dictionary_contents_next(iteration_state_$87)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$87);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$85 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                            } else
                                                                                                if (sol3.isList()) {
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
                                                                                                    Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$85, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$87);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$84, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str56$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$92;
                                                                final SubLObject new_list2 = cdolist_list_var_$92 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$92.first();
                                                                while (NIL != cdolist_list_var_$92) {
                                                                    final SubLObject _prev_bind_0_$86 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                        } else
                                                                            if (sol4.isList()) {
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
                                                                                Errors.error($str55$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$86, thread);
                                                                    }
                                                                    cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                                    generating_fn2 = cdolist_list_var_$92.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$78, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$83, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$74 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$82, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$76, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$76, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str58$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$75, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$75, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$74, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$74, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$87 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$87, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$73, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$88 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$88, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$73, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$72, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject forget_useless_narts_wrt_opencyc_until_quiescence() {
        SubLObject passes = ZERO_INTEGER;
        for (SubLObject count = ONE_INTEGER; count.numG(ZERO_INTEGER); count = forget_useless_narts_wrt_opencyc()) {
            passes = add(passes, ONE_INTEGER);
        }
        return passes;
    }

    public static SubLObject forget_useless_narts_wrt_opencyc() {
        return kb_cleanup.forget_narts(gather_useless_narts_wrt_opencyc(), $str59$Forgetting_useless_NARTs_wrt_Open);
    }

    public static SubLObject gather_useless_narts_wrt_opencyc() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject useless_narts = NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $str60$Gathering_useless_NARTs_wrt_OpenC;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$102 = idx;
                if (NIL == id_index_objects_empty_p(idx_$102, $SKIP)) {
                    final SubLObject idx_$103 = idx_$102;
                    if (NIL == id_index_dense_objects_empty_p(idx_$103, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$103);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        SubLObject ignore_errors_tag;
                        SubLObject _prev_bind_0_$104;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            nart = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(nart)) {
                                    nart = $SKIP;
                                }
                                ignore_errors_tag = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    _prev_bind_0_$104 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (NIL == useful_nart_wrt_opencycP(nart)) {
                                                useless_narts = cons(nart, useless_narts);
                                            }
                                        } catch (final Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$104, thread);
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$104 = idx_$102;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$104)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$104);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$104);
                        final SubLObject end_id = id_index_next_id(idx_$104);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                SubLObject ignore_errors_tag2 = NIL;
                                try {
                                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                                    final SubLObject _prev_bind_0_$105 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                        try {
                                            if (NIL == useful_nart_wrt_opencycP(nart2)) {
                                                useless_narts = cons(nart2, useless_narts);
                                            }
                                        } catch (final Throwable catch_var2) {
                                            Errors.handleThrowable(catch_var2, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_$105, thread);
                                    }
                                } catch (final Throwable ccatch_env_var2) {
                                    ignore_errors_tag2 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$106 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$106, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(useless_narts);
    }

    public static SubLObject useful_nart_wrt_opencycP(final SubLObject nart) {
        assert NIL != nart_handles.nart_p(nart) : "nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) " + nart;
        final SubLObject independent_assertions = narts_high.nart_independent_assertions(nart);
        SubLObject usefulP = NIL;
        if (NIL == usefulP) {
            SubLObject csome_list_var = independent_assertions;
            SubLObject candidate = NIL;
            candidate = csome_list_var.first();
            while ((NIL == usefulP) && (NIL != csome_list_var)) {
                if (NIL != useful_nart_assertion_wrt_opencycP(candidate)) {
                    usefulP = candidate;
                }
                csome_list_var = csome_list_var.rest();
                candidate = csome_list_var.first();
            } 
        }
        return usefulP;
    }

    public static SubLObject useful_nart_assertion_wrt_opencycP(final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        return makeBoolean((NIL != assertions_high.rule_assertionP(assertion)) || (NIL == list_utilities.member_eqP(assertions_high.gaf_predicate(assertion), $uninteresting_nart_predicates_wrt_opencyc$.getGlobalValue())));
    }

    public static SubLObject declare_kbs_cleanup_file() {
        declareFunction(me, "kbs_cleanup", "KBS-CLEANUP", 0, 0, false);
        declareFunction(me, "clean_invalid_bookkeeping_info", "CLEAN-INVALID-BOOKKEEPING-INFO", 0, 0, false);
        declareFunction(me, "fix_invalid_deductions", "FIX-INVALID-DEDUCTIONS", 0, 0, false);
        declareFunction(me, "remove_invalid_deduction", "REMOVE-INVALID-DEDUCTION", 1, 0, false);
        declareFunction(me, "kbs_clear_extent", "KBS-CLEAR-EXTENT", 0, 0, false);
        declareFunction(me, "kill_empty_kbs_terms", "KILL-EMPTY-KBS-TERMS", 0, 0, false);
        declareFunction(me, "kill_naked_prototypicals", "KILL-NAKED-PROTOTYPICALS", 0, 0, false);
        declareFunction(me, "kill_empty_skolems", "KILL-EMPTY-SKOLEMS", 0, 0, false);
        declareFunction(me, "remove_bad_term_of_unit_assertions", "REMOVE-BAD-TERM-OF-UNIT-ASSERTIONS", 0, 0, false);
        declareFunction(me, "kill_sparse_narts", "KILL-SPARSE-NARTS", 0, 0, false);
        declareFunction(me, "fix_reconsider_tms", "FIX-RECONSIDER-TMS", 0, 0, false);
        declareFunction(me, "fix_remove_redundant_arguments", "FIX-REMOVE-REDUNDANT-ARGUMENTS", 0, 0, false);
        declareFunction(me, "kbs_kill_unrunnable_kb_queries", "KBS-KILL-UNRUNNABLE-KB-QUERIES", 0, 0, false);
        declareFunction(me, "forget_useless_narts_wrt_opencyc_until_quiescence", "FORGET-USELESS-NARTS-WRT-OPENCYC-UNTIL-QUIESCENCE", 0, 0, false);
        declareFunction(me, "forget_useless_narts_wrt_opencyc", "FORGET-USELESS-NARTS-WRT-OPENCYC", 0, 0, false);
        declareFunction(me, "gather_useless_narts_wrt_opencyc", "GATHER-USELESS-NARTS-WRT-OPENCYC", 0, 0, false);
        declareFunction(me, "useful_nart_wrt_opencycP", "USEFUL-NART-WRT-OPENCYC?", 1, 0, false);
        declareFunction(me, "useful_nart_assertion_wrt_opencycP", "USEFUL-NART-ASSERTION-WRT-OPENCYC?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kbs_cleanup_file() {
        defvar("*KBS-CLEAR-EXTENT*", $list0);
        defparameter("*SHOW-KBS-CLEANUP-WARNINGS?*", NIL);
        defparameter("*SPARSE-NART-PREDS*", $list30);
        deflexical("*UNINTERESTING-NART-PREDICATES-WRT-OPENCYC*", $list62);
        return NIL;
    }

    public static SubLObject setup_kbs_cleanup_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kbs_cleanup_file();
    }

    @Override
    public void initializeVariables() {
        init_kbs_cleanup_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kbs_cleanup_file();
    }

    
}

/**
 * Total time: 2055 ms
 */
