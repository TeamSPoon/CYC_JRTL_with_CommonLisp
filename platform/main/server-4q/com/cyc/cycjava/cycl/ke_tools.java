package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_gather_arg$;
import static com.cyc.cycjava.cycl.el_utilities.valid_arity_p;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
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


public final class ke_tools extends SubLTranslatedFile {
    public static final SubLFile me = new ke_tools();

    public static final String myName = "com.cyc.cycjava.cycl.ke_tools";

    public static final String myFingerPrint = "615771f23dda87d5d6d3ebe9da3843ecf29c738d8d79e9ef2e74d9fd93f0faf0";

    // defparameter
    private static final SubLSymbol $fort1_preds$ = makeSymbol("*FORT1-PREDS*");

    // defparameter
    private static final SubLSymbol $fort2_preds$ = makeSymbol("*FORT2-PREDS*");

    // defparameter
    private static final SubLSymbol $forts_candidate_preds$ = makeSymbol("*FORTS-CANDIDATE-PREDS*");

    // deflexical
    private static final SubLSymbol $cached_pred_args_isa_accessed_in_spacesP_caching_state$ = makeSymbol("*CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $cached_pred_args_genls_accessed_in_spacesP_caching_state$ = makeSymbol("*CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?-CACHING-STATE*");















    public static final SubLSymbol PREDS_FOR_PAIR = makeSymbol("PREDS-FOR-PAIR");

    public static final SubLList $list8 = list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), makeKeyword("ALL")), list(makeSymbol("MODE"), makeKeyword("MIXED")));

    public static final SubLString $str9$Return_a_list_of_the_predicates_r = makeString("Return a list of the predicates relevant to relating FORT-1 and FORT-2.\nMODE may be :figurative (instances of collections), \n:literal (constants), or \n:mixed (referents).");

    public static final SubLList $list10 = list(list(makeSymbol("FORT-1"), makeSymbol("FORT-P")), list(makeSymbol("FORT-2"), makeSymbol("FORT-P")));

    public static final SubLList $list11 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLSymbol GATHER_ACCESSED_ARG_ISA_OF_PREDS = makeSymbol("GATHER-ACCESSED-ARG-ISA-OF-PREDS");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));



    public static final SubLSymbol GATHER_ARG_ISA_PREDS_OF_COLLECTION = makeSymbol("GATHER-ARG-ISA-PREDS-OF-COLLECTION");

    public static final SubLSymbol GATHER_ARG_ISA_PREDS_OF_COLLECTION_INT = makeSymbol("GATHER-ARG-ISA-PREDS-OF-COLLECTION-INT");

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLSymbol GATHER_COL_LEGAL_PREDS = makeSymbol("GATHER-COL-LEGAL-PREDS");

    public static final SubLSymbol $sym24$NEW_NOTE_PREDS_W_ACCESSED_ARG_CONSTRAINT = makeSymbol("NEW-NOTE-PREDS-W/ACCESSED-ARG-CONSTRAINT");

    public static final SubLSymbol GATHER_PREDS_CONSTRAINED_BY_SUPERIORS_OF_DEFN_ADMITTED = makeSymbol("GATHER-PREDS-CONSTRAINED-BY-SUPERIORS-OF-DEFN-ADMITTED");

    public static final SubLSymbol GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS = makeSymbol("GATHER-ACCESSED-ARG-CONSTRAINED-BY-PREDS");

    public static final SubLSymbol UNRECORD_ALL_SUPERIORS_AS_UNSEARCHED_IGNORE_ARG2 = makeSymbol("UNRECORD-ALL-SUPERIORS-AS-UNSEARCHED-IGNORE-ARG2");

    public static final SubLSymbol $sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT = makeSymbol("GATHER-PREDS-W/ACCESSED-ARG-CONSTRAINT");

    private static final SubLObject $$ArgIsaBinaryPredicate = reader_make_constant_shell(makeString("ArgIsaBinaryPredicate"));

    private static final SubLObject $$ArgGenlBinaryPredicate = reader_make_constant_shell(makeString("ArgGenlBinaryPredicate"));

    public static final SubLSymbol $sym31$CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES_ = makeSymbol("CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?");

    public static final SubLSymbol $sym32$_CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES__CACHING_STATE_ = makeSymbol("*CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?-CACHING-STATE*");



    private static final SubLInteger $int$2048 = makeInteger(2048);

    public static final SubLSymbol $sym35$CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES_ = makeSymbol("CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?");

    public static final SubLSymbol $sym36$_CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES__CACHING_STATE_ = makeSymbol("*CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?-CACHING-STATE*");

    public static final SubLSymbol $sym37$NON_SEARCHED_ARG_ = makeSymbol("NON-SEARCHED-ARG?");

    private static final SubLObject $$transitiveViaArg = reader_make_constant_shell(makeString("transitiveViaArg"));

    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    public static SubLObject why_not_wff_assertion(final SubLObject assertion) {
        return wff.why_not_wff(fi.assertion_fi_formula(assertion, UNPROVIDED), assertions_high.assertion_mt(assertion), UNPROVIDED);
    }

    public static SubLObject bogus_assertionP(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return makeBoolean($BOGUS.eql(assertions_low.assertion_formula_data(assertion)) || $BOGUS.eql(assertions_high.assertion_mt(assertion)));
        }
        return NIL;
    }

    public static SubLObject free_assertionP(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            return eql($FREE, assertions_low.assertion_formula_data(assertion));
        }
        return NIL;
    }

    public static SubLObject preds_for_pair(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt, SubLObject mode) {
        if (mt == UNPROVIDED) {
            mt = $ALL;
        }
        if (mode == UNPROVIDED) {
            mode = $MIXED;
        }
        SubLSystemTrampolineFile.enforceType(fort_1, FORT_P);
        SubLSystemTrampolineFile.enforceType(fort_2, FORT_P);
        final SubLObject pcase_var = mode;
        if (pcase_var.eql($FIGURATIVE)) {
            return preds_of_instances(fort_1, fort_2, mt);
        }
        if (pcase_var.eql($LITERAL)) {
            return preds_of_constants(fort_1, fort_2, mt);
        }
        if (pcase_var.eql($MIXED)) {
            return preds_of_referents(fort_1, fort_2, mt);
        }
        return NIL;
    }

    public static SubLObject preds_of_instances(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(col_1) : "forts.fort_p(col_1) " + "CommonSymbols.NIL != forts.fort_p(col_1) " + col_1;
        assert NIL != forts.fort_p(col_2) : "forts.fort_p(col_2) " + "CommonSymbols.NIL != forts.fort_p(col_2) " + col_2;
        SubLObject preds = NIL;
        if (NIL != hlmt.hlmt_equal($ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                preds = preds_of_instances_int(col_1, col_2, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    preds = preds_of_instances_int(col_1, col_2, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }

        return preds;
    }

    public static SubLObject preds_of_instances_int(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$7 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    preds = preds_of_instances_in_space_1(col_1, col_2);
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$7, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$3, thread);
                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$2, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.min_predicates(preds, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != sbhl_search_vars.$maximize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.max_predicates(preds, UNPROVIDED, UNPROVIDED);
        }
        return preds;
    }

    public static SubLObject preds_of_instances_in_space_1(final SubLObject col_1, final SubLObject col_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col_1, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_instances_in_space_2(col_1, col_2);
                    } finally {
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$10, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col_1, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_instances_in_space_2(final SubLObject col_1, final SubLObject col_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col_2, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$12 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread), thread);
                    preds = preds_of_instances_in_spaces(col_1, col_2);
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$12, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), col_2, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_instances_in_spaces(final SubLObject col_1, final SubLObject col_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            SubLObject cdolist_list_var = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
            SubLObject ceiling = NIL;
            ceiling = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), ceiling, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                ceiling = cdolist_list_var.first();
            } 
            final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
            try {
                sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                try {
                    genls.map_union_all_genls(list(col_1, col_2), symbol_function(GATHER_ACCESSED_ARG_ISA_OF_PREDS), UNPROVIDED, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        preds = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            } finally {
                sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                clear_pred_args_constraints_accessed_in_spacesP();
                if (NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
                    SubLObject cdolist_list_var2 = preds;
                    SubLObject pred = NIL;
                    pred = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pred = cdolist_list_var2.first();
                    } 
                }
                SubLObject cdolist_list_var2 = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling2 = NIL;
                ceiling2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), ceiling2, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ceiling2 = cdolist_list_var2.first();
                } 
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject arg_isa_preds_of_collection_table(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        SubLObject preds = NIL;
        if (NIL != hlmt.hlmt_equal($ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                preds = arg_isa_preds_of_collection_table_int(collection);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    preds = arg_isa_preds_of_collection_table_int(collection);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            } else
                if (NIL == mt) {
                    preds = arg_isa_preds_of_collection_table_int(collection);
                }


        return preds;
    }

    public static SubLObject arg_isa_preds_of_collection_table_int(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject table = NIL;
        final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_answer$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
            final SubLObject _prev_bind_0_$14 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    genls.map_all_genls(symbol_function(GATHER_ARG_ISA_PREDS_OF_COLLECTION), collection, UNPROVIDED, UNPROVIDED);
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$14, thread);
            }
            table = $mapping_answer$.getDynamicValue(thread);
        } finally {
            $mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return table;
    }

    public static SubLObject gather_arg_isa_preds_of_collection(final SubLObject collection) {
        kb_mapping.map_gaf_arg_index(symbol_function(GATHER_ARG_ISA_PREDS_OF_COLLECTION_INT), collection, THREE_INTEGER, $$argIsa, $TRUE, UNPROVIDED);
        return NIL;
    }

    public static SubLObject gather_arg_isa_preds_of_collection_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject argnum = (NIL != forts.fort_p(relation)) ? assertions_high.gaf_arg2(assertion) : NIL;
            final SubLObject collection = (argnum.isInteger()) ? assertions_high.gaf_arg3(assertion) : NIL;
            if ((NIL != forts.fort_p(collection)) && (NIL != term.kb_predicateP(relation))) {
                hash_table_utilities.pushnew_hash(relation, argnum, $mapping_answer$.getDynamicValue(thread), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject legal_preds_of_forts_isa(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort_1) : "forts.fort_p(fort_1) " + "CommonSymbols.NIL != forts.fort_p(fort_1) " + fort_1;
        assert NIL != forts.fort_p(fort_2) : "forts.fort_p(fort_2) " + "CommonSymbols.NIL != forts.fort_p(fort_2) " + fort_2;
        SubLObject preds = NIL;
        if (NIL != hlmt.hlmt_equal($ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                preds = legal_preds_of_forts_int(fort_1, fort_2);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    preds = legal_preds_of_forts_int(fort_1, fort_2);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }

        return preds;
    }

    public static SubLObject legal_preds_of_forts_int(final SubLObject fort1, final SubLObject fort2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$16 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort1, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$18 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort2, UNPROVIDED, UNPROVIDED);
                                final SubLObject _prev_bind_0_$19 = $fort1_preds$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = $fort2_preds$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = $forts_candidate_preds$.currentBinding(thread);
                                try {
                                    $fort1_preds$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
                                    $fort2_preds$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
                                    $forts_candidate_preds$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
                                    final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$21 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                final SubLObject _prev_bind_0_$22 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    try {
                                                        isa.map_all_isa(symbol_function(GATHER_COL_LEGAL_PREDS), fort1, UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values = getValuesAsVector();
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$22, thread);
                                                }
                                                final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    try {
                                                        isa.map_all_isa(symbol_function(GATHER_COL_LEGAL_PREDS), fort2, UNPROVIDED, UNPROVIDED);
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values2 = getValuesAsVector();
                                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                            restoreValuesFromVector(_values2);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$24, thread);
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0_$21, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values3 = getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                restoreValuesFromVector(_values3);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$20, thread);
                                    }
                                    final SubLObject cdohash_table = $forts_candidate_preds$.getDynamicValue(thread);
                                    SubLObject candidate = NIL;
                                    SubLObject value = NIL;
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            candidate = getEntryKey(cdohash_entry);
                                            value = getEntryValue(cdohash_entry);
                                            final SubLObject fort1_args = gethash(candidate, $fort1_preds$.getDynamicValue(thread), UNPROVIDED);
                                            final SubLObject fort2_args = (NIL != fort1_args) ? gethash(candidate, $fort2_preds$.getDynamicValue(thread), UNPROVIDED) : NIL;
                                            final SubLObject deltaP = (NIL != fort2_args) ? makeBoolean(((NIL != second(fort1_args)) || (NIL != second(fort2_args))) || (!fort1_args.first().eql(fort2_args.first()))) : NIL;
                                            if (NIL != deltaP) {
                                                preds = cons(candidate, preds);
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                } finally {
                                    $forts_candidate_preds$.rebind(_prev_bind_3, thread);
                                    $fort2_preds$.rebind(_prev_bind_2, thread);
                                    $fort1_preds$.rebind(_prev_bind_0_$19, thread);
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$17, thread);
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values5 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    restoreValuesFromVector(_values5);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject gather_col_legal_preds(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread))) {
            sbhl_marking_methods.sbhl_record_node(col, sbhl_marking_vars.$sbhl_space_3$.getDynamicValue(thread));
            kb_mapping.map_gaf_arg_index(symbol_function($sym24$NEW_NOTE_PREDS_W_ACCESSED_ARG_CONSTRAINT), col, THREE_INTEGER, $$argIsa, $TRUE, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject preds_of_forts(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort_1) : "forts.fort_p(fort_1) " + "CommonSymbols.NIL != forts.fort_p(fort_1) " + fort_1;
        assert NIL != forts.fort_p(fort_2) : "forts.fort_p(fort_2) " + "CommonSymbols.NIL != forts.fort_p(fort_2) " + fort_2;
        SubLObject preds = NIL;
        if (NIL != hlmt.hlmt_equal($ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                preds = preds_of_forts_int(fort_1, fort_2);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    preds = preds_of_forts_int(fort_1, fort_2);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }

        return preds;
    }

    public static SubLObject preds_of_forts_int(final SubLObject fort1, final SubLObject fort2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject _prev_bind_0_$29 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort1, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$30 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$31 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort2, UNPROVIDED, UNPROVIDED);
                                final SubLObject _prev_bind_0_$32 = $fort1_preds$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = $fort2_preds$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = $forts_candidate_preds$.currentBinding(thread);
                                try {
                                    $fort1_preds$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
                                    $fort2_preds$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
                                    $forts_candidate_preds$.bind(make_hash_table($int$512, UNPROVIDED, UNPROVIDED), thread);
                                    kb_mapping.map_predicate_extent_index(symbol_function($sym24$NEW_NOTE_PREDS_W_ACCESSED_ARG_CONSTRAINT), $$argIsa, $TRUE, UNPROVIDED);
                                    final SubLObject cdohash_table = $forts_candidate_preds$.getDynamicValue(thread);
                                    SubLObject candidate = NIL;
                                    SubLObject value = NIL;
                                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                    try {
                                        while (iteratorHasNext(cdohash_iterator)) {
                                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                            candidate = getEntryKey(cdohash_entry);
                                            value = getEntryValue(cdohash_entry);
                                            final SubLObject fort1_args = gethash(candidate, $fort1_preds$.getDynamicValue(thread), UNPROVIDED);
                                            final SubLObject fort2_args = (NIL != fort1_args) ? gethash(candidate, $fort2_preds$.getDynamicValue(thread), UNPROVIDED) : NIL;
                                            final SubLObject deltaP = (NIL != fort2_args) ? makeBoolean(((NIL != second(fort1_args)) || (NIL != second(fort2_args))) || (!fort1_args.first().eql(fort2_args.first()))) : NIL;
                                            if (NIL != deltaP) {
                                                preds = cons(candidate, preds);
                                            }
                                        } 
                                    } finally {
                                        releaseEntrySetIterator(cdohash_iterator);
                                    }
                                } finally {
                                    $forts_candidate_preds$.rebind(_prev_bind_3, thread);
                                    $fort2_preds$.rebind(_prev_bind_2, thread);
                                    $fort1_preds$.rebind(_prev_bind_0_$32, thread);
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0_$31, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$30, thread);
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0_$29, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject new_note_preds_wXaccessed_arg_constraint(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject argnum = (NIL != forts.fort_p(relation)) ? assertions_high.gaf_arg2(assertion) : NIL;
            final SubLObject collection = (argnum.isInteger()) ? assertions_high.gaf_arg3(assertion) : NIL;
            SubLObject candidateP = NIL;
            if ((NIL != forts.fort_p(collection)) && (NIL != term.kb_predicateP(relation))) {
                if (NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, sbhl_marking_vars.$sbhl_space_1$.getDynamicValue(thread))) {
                    hash_table_utilities.pushnew_hash(relation, argnum, $fort1_preds$.getDynamicValue(thread), UNPROVIDED);
                    candidateP = T;
                }
                if ((NIL != sbhl_marking_vars.sbhl_table_p(sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread))) && (NIL != sbhl_marking_methods.sbhl_recorded_node_p(collection, sbhl_marking_vars.$sbhl_space_2$.getDynamicValue(thread)))) {
                    hash_table_utilities.pushnew_hash(relation, argnum, $fort2_preds$.getDynamicValue(thread), UNPROVIDED);
                    candidateP = T;
                }
                if (NIL != candidateP) {
                    sethash(relation, $forts_candidate_preds$.getDynamicValue(thread), T);
                }
            }
        }
        return NIL;
    }

    public static SubLObject preds_of_constants(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $ALL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort_1) : "forts.fort_p(fort_1) " + "CommonSymbols.NIL != forts.fort_p(fort_1) " + fort_1;
        assert NIL != forts.fort_p(fort_2) : "forts.fort_p(fort_2) " + "CommonSymbols.NIL != forts.fort_p(fort_2) " + fort_2;
        SubLObject preds = NIL;
        if (NIL != hlmt.hlmt_equal($ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                preds = preds_of_constants_int(fort_1, fort_2, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    preds = preds_of_constants_int(fort_1, fort_2, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }

        return preds;
    }

    public static SubLObject preds_of_constants_int(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$36 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$36 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$37 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    preds = preds_of_constants_in_space_1(fort_1, fort_2);
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$41, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$38, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$37, thread);
                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$36, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$36, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$35, thread);
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.min_predicates(preds, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != sbhl_search_vars.$maximize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.max_predicates(preds, UNPROVIDED, UNPROVIDED);
        }
        return preds;
    }

    public static SubLObject preds_of_constants_in_space_1(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort_1, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_constants_in_space_2(fort_1, fort_2);
                    } finally {
                        final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$44, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort_1, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_constants_in_space_2(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort_2, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$46 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_constants_in_space_3(fort_1, fort_2);
                    } finally {
                        final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$46, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort_2, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_constants_in_space_3(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_1, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$48 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_constants_in_space_4(fort_1, fort_2);
                    } finally {
                        final SubLObject _prev_bind_0_$49 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$49, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$48, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_1, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_constants_in_space_4(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_4$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_4$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_2, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$50 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread), thread);
                    preds = preds_of_constants_in_spaces(fort_1, fort_2);
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$50, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_4$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_2, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_constants_in_spaces(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = at_vars.$at_arg1$.currentBinding(thread);
            final SubLObject _prev_bind_2 = at_vars.$at_arg2$.currentBinding(thread);
            try {
                at_vars.$at_arg1$.bind(fort_1, thread);
                at_vars.$at_arg2$.bind(fort_2, thread);
                SubLObject cdolist_list_var = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling = NIL;
                ceiling = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), ceiling, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    ceiling = cdolist_list_var.first();
                } 
                final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                    try {
                        if (NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
                            at_defns.map_sufficient_defn_cols(symbol_function(GATHER_PREDS_CONSTRAINED_BY_SUPERIORS_OF_DEFN_ADMITTED));
                        }
                        genls.map_union_all_genls(cons(fort_1, cons(fort_2, nconc(isa.isa(fort_1, UNPROVIDED, UNPROVIDED), isa.isa(fort_2, UNPROVIDED, UNPROVIDED)))), symbol_function(GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS), UNPROVIDED, UNPROVIDED);
                    } finally {
                        final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            preds = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                        }
                    }
                } finally {
                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$51, thread);
                }
            } finally {
                at_vars.$at_arg2$.rebind(_prev_bind_2, thread);
                at_vars.$at_arg1$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                clear_pred_args_constraints_accessed_in_spacesP();
                if (NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
                    SubLObject cdolist_list_var2 = preds;
                    SubLObject pred = NIL;
                    pred = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pred = cdolist_list_var2.first();
                    } 
                }
                SubLObject cdolist_list_var2 = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling2 = NIL;
                ceiling2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), ceiling2, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ceiling2 = cdolist_list_var2.first();
                } 
                if (NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0_$53 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                        at_defns.map_sufficient_defn_cols(symbol_function(UNRECORD_ALL_SUPERIORS_AS_UNSEARCHED_IGNORE_ARG2));
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$53, thread);
                    }
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_referents(final SubLObject fort_1, final SubLObject fort_2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort_1) : "forts.fort_p(fort_1) " + "CommonSymbols.NIL != forts.fort_p(fort_1) " + fort_1;
        assert NIL != forts.fort_p(fort_2) : "forts.fort_p(fort_2) " + "CommonSymbols.NIL != forts.fort_p(fort_2) " + fort_2;
        SubLObject preds = NIL;
        if (NIL != hlmt.hlmt_equal($ALL, mt)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                preds = preds_of_refererents_int(fort_1, fort_2, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
                    preds = preds_of_refererents_int(fort_1, fort_2, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
                }
            }

        return preds;
    }

    public static SubLObject preds_of_refererents_int(final SubLObject fort_1, final SubLObject fort_2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
            SubLObject needs_to_releaseP = NIL;
            try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                final SubLObject _prev_bind_0_$54 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_1_$55 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject _prev_bind_0_$55 = sbhl_marking_vars.$sbhl_space_0$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$56 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space_0$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$60 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                    preds = preds_of_refererents_in_space_1(fort_1, fort_2);
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$60, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$57, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$56, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$56, thread);
                            sbhl_marking_vars.$sbhl_space_0$.rebind(_prev_bind_0_$55, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$58 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$58, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$55, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$54, thread);
                }
            } finally {
                if (NIL != needs_to_releaseP) {
                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.min_predicates(preds, UNPROVIDED, UNPROVIDED);
        }
        if (NIL != sbhl_search_vars.$maximize_sbhl_resultP$.getDynamicValue(thread)) {
            return genl_predicates.max_predicates(preds, UNPROVIDED, UNPROVIDED);
        }
        return preds;
    }

    public static SubLObject preds_of_refererents_in_space_1(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_1$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_1$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort_1, UNPROVIDED, UNPROVIDED);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_1, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$63 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_refererents_in_space_2(fort_1, fort_2);
                    } finally {
                        final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$63, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_1$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort_1, UNPROVIDED, UNPROVIDED);
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_1, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_refererents_in_space_2(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_2$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_2$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort_2, UNPROVIDED, UNPROVIDED);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_2, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$65 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_refererents_in_space_3(fort_1, fort_2);
                    } finally {
                        final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$65, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_2$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$isa), fort_2, UNPROVIDED, UNPROVIDED);
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_2, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_refererents_in_space_3(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_3$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_3$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_1, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$67 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        preds = preds_of_refererents_in_space_4(fort_1, fort_2);
                    } finally {
                        final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$67, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_3$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_1, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_refererents_in_space_4(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space_4$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space_4$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_2, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$69 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.$sbhl_space_0$.getDynamicValue(thread), thread);
                    preds = preds_of_refererents_in_spaces(fort_1, fort_2);
                } finally {
                    sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0_$69, thread);
                }
            } finally {
                sbhl_marking_vars.$sbhl_space_4$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), fort_2, UNPROVIDED, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return preds;
    }

    public static SubLObject preds_of_refererents_in_spaces(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        try {
            final SubLObject _prev_bind_0 = at_vars.$at_arg1$.currentBinding(thread);
            final SubLObject _prev_bind_2 = at_vars.$at_arg2$.currentBinding(thread);
            try {
                at_vars.$at_arg1$.bind(fort_1, thread);
                at_vars.$at_arg2$.bind(fort_2, thread);
                SubLObject cdolist_list_var = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling = NIL;
                ceiling = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), ceiling, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    ceiling = cdolist_list_var.first();
                } 
                final SubLObject _prev_bind_0_$70 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                    try {
                        if (NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
                            at_defns.map_sufficient_defn_cols(symbol_function(GATHER_PREDS_CONSTRAINED_BY_SUPERIORS_OF_DEFN_ADMITTED));
                        }
                        genls.map_union_all_genls(cons(fort_1, cons(fort_2, nconc(isa.isa(fort_1, UNPROVIDED, UNPROVIDED), isa.isa(fort_2, UNPROVIDED, UNPROVIDED)))), symbol_function(GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS), UNPROVIDED, UNPROVIDED);
                    } finally {
                        final SubLObject _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            preds = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                        }
                    }
                } finally {
                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_$70, thread);
                }
            } finally {
                at_vars.$at_arg2$.rebind(_prev_bind_2, thread);
                at_vars.$at_arg1$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                clear_pred_args_constraints_accessed_in_spacesP();
                if (NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
                    SubLObject cdolist_list_var2 = preds;
                    SubLObject pred = NIL;
                    pred = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), pred, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pred = cdolist_list_var2.first();
                    } 
                }
                SubLObject cdolist_list_var2 = kb_paths.$kbp_genl_bound$.getDynamicValue(thread);
                SubLObject ceiling2 = NIL;
                ceiling2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    sbhl_marking_methods.sbhl_unrecord_all_recorded_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), ceiling2, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    ceiling2 = cdolist_list_var2.first();
                } 
                if (NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                        at_defns.map_sufficient_defn_cols(symbol_function(UNRECORD_ALL_SUPERIORS_AS_UNSEARCHED_IGNORE_ARG2));
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_6, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$72, thread);
                    }
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return preds;
    }

    public static SubLObject gather_preds_constrained_by_superiors_of_defn_admitted(final SubLObject col, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(col, UNPROVIDED)) {
            SubLObject admitsP = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    admitsP = makeBoolean((NIL != at_defns.sufficient_defns_admit_int(col, at_vars.$at_arg1$.getDynamicValue(thread), defn_assertions, UNPROVIDED, UNPROVIDED)) || (NIL != at_defns.sufficient_defns_admit_int(col, at_vars.$at_arg2$.getDynamicValue(thread), defn_assertions, UNPROVIDED, UNPROVIDED)));
                } finally {
                    final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
            }
            if (NIL != admitsP) {
                genls.map_all_genls(symbol_function(GATHER_ACCESSED_ARG_CONSTRAINED_BY_PREDS), col, UNPROVIDED, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject gather_accessed_arg_isa_of_preds(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $mapping_gather_arg$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
        try {
            $mapping_gather_arg$.bind(ONE_INTEGER, thread);
            at_vars.$at_check_arg_isaP$.bind(T, thread);
            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
            SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts($$ArgIsaBinaryPredicate);
            SubLObject arg_isa_pred = NIL;
            arg_isa_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                kb_mapping.map_gaf_arg_index(symbol_function($sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT), col, TWO_INTEGER, arg_isa_pred, $TRUE, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                arg_isa_pred = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_3, thread);
            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_2, thread);
            $mapping_gather_arg$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject gather_accessed_arg_constrained_by_preds(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $mapping_gather_arg$.currentBinding(thread);
        try {
            $mapping_gather_arg$.bind(ONE_INTEGER, thread);
            final SubLObject _prev_bind_0_$74 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
            try {
                at_vars.$at_check_arg_isaP$.bind(T, thread);
                SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts($$ArgIsaBinaryPredicate);
                SubLObject arg_isa_pred = NIL;
                arg_isa_pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    kb_mapping.map_gaf_arg_index(symbol_function($sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT), col, TWO_INTEGER, arg_isa_pred, $TRUE, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg_isa_pred = cdolist_list_var.first();
                } 
            } finally {
                at_vars.$at_check_arg_isaP$.rebind(_prev_bind_0_$74, thread);
            }
            final SubLObject _prev_bind_0_$75 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
            try {
                at_vars.$at_check_arg_genlsP$.bind(T, thread);
                SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts($$ArgGenlBinaryPredicate);
                SubLObject arg_genl_pred = NIL;
                arg_genl_pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    kb_mapping.map_gaf_arg_index(symbol_function($sym28$GATHER_PREDS_W_ACCESSED_ARG_CONSTRAINT), col, TWO_INTEGER, arg_genl_pred, $TRUE, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    arg_genl_pred = cdolist_list_var.first();
                } 
            } finally {
                at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_0_$75, thread);
            }
        } finally {
            $mapping_gather_arg$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject gather_preds_wXaccessed_arg_constraint(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject relation = assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread));
            if ((((NIL != forts.fort_p(relation)) && (NIL == sbhl_marking_methods.sbhl_recorded_node_p(relation, UNPROVIDED))) && (NIL != term.kb_predicateP(relation))) && (NIL != pred_args_constraints_accessed_in_spacesP(relation))) {
                sbhl_search_vars.$sbhl_result$.setDynamicValue(cons(relation, sbhl_search_vars.$sbhl_result$.getDynamicValue(thread)), thread);
                if (NIL != sbhl_search_vars.$minimize_sbhl_resultP$.getDynamicValue(thread)) {
                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genlPreds), relation, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    public static SubLObject clear_pred_args_constraints_accessed_in_spacesP() {
        clear_cached_pred_args_isa_accessed_in_spacesP();
        clear_cached_pred_args_genls_accessed_in_spacesP();
        return NIL;
    }

    public static SubLObject pred_args_constraints_accessed_in_spacesP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread)) || (NIL != cached_pred_args_isa_accessed_in_spacesP(pred))) && ((NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread)) || (NIL != cached_pred_args_genls_accessed_in_spacesP(pred))));
    }

    public static SubLObject clear_cached_pred_args_isa_accessed_in_spacesP() {
        final SubLObject cs = $cached_pred_args_isa_accessed_in_spacesP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_pred_args_isa_accessed_in_spacesP(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_pred_args_isa_accessed_in_spacesP_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_pred_args_isa_accessed_in_spacesP_internal(final SubLObject pred) {
        return pred_args_isa_accessed_in_spacesP(pred, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_pred_args_isa_accessed_in_spacesP(final SubLObject pred) {
        SubLObject caching_state = $cached_pred_args_isa_accessed_in_spacesP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym31$CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES_, $sym32$_CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES__CACHING_STATE_, $int$4096, EQL, ONE_INTEGER, $int$2048);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_pred_args_isa_accessed_in_spacesP_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pred_args_isa_accessed_in_spacesP(final SubLObject pred, SubLObject isa_space_1, SubLObject isa_space_2) {
        if (isa_space_1 == UNPROVIDED) {
            isa_space_1 = sbhl_marking_vars.$sbhl_space_1$.getDynamicValue();
        }
        if (isa_space_2 == UNPROVIDED) {
            isa_space_2 = sbhl_marking_vars.$sbhl_space_2$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arity.variable_arityP(pred)) {
            SubLObject failsP = NIL;
            if (NIL == failsP) {
                SubLObject csome_list_var = kb_accessors.args_isa(pred, UNPROVIDED);
                SubLObject args_isa = NIL;
                args_isa = csome_list_var.first();
                while ((NIL == failsP) && (NIL != csome_list_var)) {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(isa_space_1, thread);
                        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(args_isa, UNPROVIDED)) {
                            failsP = T;
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
                    }
                    _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(isa_space_2, thread);
                        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(args_isa, UNPROVIDED)) {
                            failsP = T;
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    args_isa = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == failsP);
        }
        SubLObject accessedP = NIL;
        final SubLObject v_arity = arity.arity(pred);
        if ((NIL != valid_arity_p(v_arity)) && (NIL == accessedP)) {
            SubLObject csome_list_var2 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject arg1 = NIL;
            arg1 = csome_list_var2.first();
            while ((NIL == accessedP) && (NIL != csome_list_var2)) {
                if (arg1.numLE(v_arity)) {
                    final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(at_vars.$at_arg1$.getDynamicValue(thread), thread);
                        if ((NIL != arg_accessed_in_spaceP(pred, kb_accessors.arg_isa_pred(arg1, UNPROVIDED, UNPROVIDED), ONE_INTEGER, TWO_INTEGER, isa_space_1, UNPROVIDED)) && (NIL == accessedP)) {
                            SubLObject csome_list_var_$76 = czer_vars.$arg_positions$.getGlobalValue();
                            SubLObject arg2 = NIL;
                            arg2 = csome_list_var_$76.first();
                            while ((NIL == accessedP) && (NIL != csome_list_var_$76)) {
                                if (arg2.numLE(v_arity) && (!arg1.numE(arg2))) {
                                    final SubLObject _prev_bind_0_$77 = at_vars.$at_arg$.currentBinding(thread);
                                    try {
                                        at_vars.$at_arg$.bind(at_vars.$at_arg2$.getDynamicValue(thread), thread);
                                        accessedP = arg_accessed_in_spaceP(pred, kb_accessors.arg_isa_pred(arg2, UNPROVIDED, UNPROVIDED), ONE_INTEGER, TWO_INTEGER, isa_space_2, UNPROVIDED);
                                    } finally {
                                        at_vars.$at_arg$.rebind(_prev_bind_0_$77, thread);
                                    }
                                }
                                csome_list_var_$76 = csome_list_var_$76.rest();
                                arg2 = csome_list_var_$76.first();
                            } 
                        }
                    } finally {
                        at_vars.$at_arg$.rebind(_prev_bind_2, thread);
                    }
                }
                csome_list_var2 = csome_list_var2.rest();
                arg1 = csome_list_var2.first();
            } 
        }
        return accessedP;
    }

    public static SubLObject clear_cached_pred_args_genls_accessed_in_spacesP() {
        final SubLObject cs = $cached_pred_args_genls_accessed_in_spacesP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_pred_args_genls_accessed_in_spacesP(final SubLObject pred) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_pred_args_genls_accessed_in_spacesP_caching_state$.getGlobalValue(), list(pred), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_pred_args_genls_accessed_in_spacesP_internal(final SubLObject pred) {
        return pred_args_genls_accessed_in_spacesP(pred, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_pred_args_genls_accessed_in_spacesP(final SubLObject pred) {
        SubLObject caching_state = $cached_pred_args_genls_accessed_in_spacesP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym35$CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES_, $sym36$_CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES__CACHING_STATE_, $int$4096, EQL, ONE_INTEGER, $int$2048);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_pred_args_genls_accessed_in_spacesP_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject pred_args_genls_accessed_in_spacesP(final SubLObject pred, SubLObject genls_space_1, SubLObject genls_space_2) {
        if (genls_space_1 == UNPROVIDED) {
            genls_space_1 = sbhl_marking_vars.$sbhl_space_3$.getDynamicValue();
        }
        if (genls_space_2 == UNPROVIDED) {
            genls_space_2 = sbhl_marking_vars.$sbhl_space_4$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arity.variable_arityP(pred)) {
            SubLObject failsP = NIL;
            if (NIL == failsP) {
                SubLObject csome_list_var = kb_accessors.args_genl(pred, UNPROVIDED);
                SubLObject args_genl = NIL;
                args_genl = csome_list_var.first();
                while ((NIL == failsP) && (NIL != csome_list_var)) {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(genls_space_1, thread);
                        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(args_genl, UNPROVIDED)) {
                            failsP = T;
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
                    }
                    _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_table$.bind(genls_space_2, thread);
                        if (NIL == sbhl_marking_methods.sbhl_recorded_node_p(args_genl, UNPROVIDED)) {
                            failsP = T;
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
                    }
                    csome_list_var = csome_list_var.rest();
                    args_genl = csome_list_var.first();
                } 
            }
            return makeBoolean(NIL == failsP);
        }
        SubLObject accessedP = NIL;
        final SubLObject v_arity = arity.arity(pred);
        if ((NIL != valid_arity_p(v_arity)) && (NIL == accessedP)) {
            SubLObject csome_list_var2 = czer_vars.$arg_positions$.getGlobalValue();
            SubLObject arg1 = NIL;
            arg1 = csome_list_var2.first();
            while ((NIL == accessedP) && (NIL != csome_list_var2)) {
                if (arg1.numLE(v_arity)) {
                    final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding(thread);
                    try {
                        at_vars.$at_arg$.bind(at_vars.$at_arg1$.getDynamicValue(thread), thread);
                        if ((NIL != arg_accessed_in_spaceP(pred, kb_accessors.arg_genl_pred(arg1, UNPROVIDED, UNPROVIDED), ONE_INTEGER, TWO_INTEGER, genls_space_1, UNPROVIDED)) && (NIL == accessedP)) {
                            SubLObject csome_list_var_$78 = czer_vars.$arg_positions$.getGlobalValue();
                            SubLObject arg2 = NIL;
                            arg2 = csome_list_var_$78.first();
                            while ((NIL == accessedP) && (NIL != csome_list_var_$78)) {
                                if (arg2.numLE(v_arity) && (!arg1.numE(arg2))) {
                                    final SubLObject _prev_bind_0_$79 = at_vars.$at_arg$.currentBinding(thread);
                                    try {
                                        at_vars.$at_arg$.bind(at_vars.$at_arg2$.getDynamicValue(thread), thread);
                                        accessedP = arg_accessed_in_spaceP(pred, kb_accessors.arg_genl_pred(arg2, UNPROVIDED, UNPROVIDED), ONE_INTEGER, TWO_INTEGER, genls_space_2, UNPROVIDED);
                                    } finally {
                                        at_vars.$at_arg$.rebind(_prev_bind_0_$79, thread);
                                    }
                                }
                                csome_list_var_$78 = csome_list_var_$78.rest();
                                arg2 = csome_list_var_$78.first();
                            } 
                        }
                    } finally {
                        at_vars.$at_arg$.rebind(_prev_bind_2, thread);
                    }
                }
                csome_list_var2 = csome_list_var2.rest();
                arg1 = csome_list_var2.first();
            } 
        }
        return accessedP;
    }

    public static SubLObject arg_accessed_in_spaceP(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_arg, final SubLObject sbhl_table, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject failsP = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mapping_answer$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $mapping_gather_arg$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_table, thread);
            $mapping_answer$.bind(NIL, thread);
            $mapping_gather_arg$.bind(gather_arg, thread);
            kb_mapping.map_gaf_arg_index(symbol_function($sym37$NON_SEARCHED_ARG_), v_term, index_arg, pred, truth, UNPROVIDED);
            failsP = $mapping_answer$.getDynamicValue(thread);
        } finally {
            $mapping_gather_arg$.rebind(_prev_bind_3, thread);
            $mapping_answer$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == failsP);
    }

    public static SubLObject non_searched_argP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sbhl_marking_methods.sbhl_recorded_node_p(assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread)), UNPROVIDED)) && (NIL == ((NIL != at_vars.$at_arg$.getDynamicValue(thread)) && (NIL != at_vars.$at_defns_availableP$.getDynamicValue(thread)) ? at_defns.defns_admitP(assertions_high.gaf_arg(assertion, $mapping_gather_arg$.getDynamicValue(thread)), at_vars.$at_arg$.getDynamicValue(thread), UNPROVIDED) : NIL))) {
            $mapping_answer$.setDynamicValue(T, thread);
            mapping_finished();
        }
        return NIL;
    }

    public static SubLObject weakest_args(final SubLObject predicate, final SubLObject argnum, final SubLObject args, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = args;
        SubLObject cdolist_list_var = transitive_via_arg_preds(predicate, argnum, mt);
        SubLObject transitive_pred = NIL;
        transitive_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = superiors_wrt(transitive_pred, result, mt);
            cdolist_list_var = cdolist_list_var.rest();
            transitive_pred = cdolist_list_var.first();
        } 
        cdolist_list_var = transitive_via_arg_inverses(predicate, argnum, mt);
        SubLObject transitive_inverse = NIL;
        transitive_inverse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = inferiors_wrt(transitive_inverse, result, mt);
            cdolist_list_var = cdolist_list_var.rest();
            transitive_inverse = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject strongest_args(final SubLObject predicate, final SubLObject argnum, final SubLObject args, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject result = args;
        SubLObject cdolist_list_var = transitive_via_arg_preds(predicate, argnum, mt);
        SubLObject transitive_pred = NIL;
        transitive_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = inferiors_wrt(transitive_pred, result, mt);
            cdolist_list_var = cdolist_list_var.rest();
            transitive_pred = cdolist_list_var.first();
        } 
        cdolist_list_var = transitive_via_arg_inverses(predicate, argnum, mt);
        SubLObject transitive_inverse = NIL;
        transitive_inverse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = superiors_wrt(transitive_inverse, result, mt);
            cdolist_list_var = cdolist_list_var.rest();
            transitive_inverse = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject subsumed_by_stronger_argsP(final SubLObject predicate, final SubLObject argnum, final SubLObject weak_args, final SubLObject strong_args, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject unique_weak_args = list_utilities.fast_delete_duplicates(weak_args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject unique_strong_args = list_utilities.fast_delete_duplicates(strong_args, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject unsubsumed_weak_args = list_utilities.fast_set_difference(unique_weak_args, unique_strong_args, UNPROVIDED);
        return makeBoolean((NIL == unsubsumed_weak_args) || (NIL == subsetp(unsubsumed_weak_args, strongest_args(predicate, argnum, append(unsubsumed_weak_args, unique_strong_args), mt), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject transitive_via_arg_preds(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.pred_arg_values_in_relevant_mts(relation, $$transitiveViaArg, argnum, mt, ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject transitive_via_arg_inverses(final SubLObject relation, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return kb_mapping_utilities.pred_arg_values_in_relevant_mts(relation, $$transitiveViaArgInverse, argnum, mt, ONE_INTEGER, THREE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject superiors_wrt(final SubLObject predicate, final SubLObject candidates, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_predicate_p(predicate)) {
            final SubLObject result = sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(predicate), candidates, mt, UNPROVIDED, UNPROVIDED);
            return result;
        }
        if (NIL != kb_accessors.transitive_predicateP(predicate)) {
            return gt_methods.gt_max_nodes(predicate, candidates, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject inferiors_wrt(final SubLObject predicate, final SubLObject candidates, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != sbhl_module_utilities.sbhl_predicate_p(predicate)) {
            final SubLObject result = sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(predicate), candidates, mt, UNPROVIDED);
            return result;
        }
        if (NIL != kb_accessors.transitive_predicateP(predicate)) {
            return gt_methods.gt_min_nodes(predicate, candidates, mt);
        }
        return NIL;
    }

    public static SubLObject declare_ke_tools_file() {
        declareFunction(me, "why_not_wff_assertion", "WHY-NOT-WFF-ASSERTION", 1, 0, false);
        declareFunction(me, "bogus_assertionP", "BOGUS-ASSERTION?", 1, 0, false);
        declareFunction(me, "free_assertionP", "FREE-ASSERTION?", 1, 0, false);
        declareFunction(me, "preds_for_pair", "PREDS-FOR-PAIR", 2, 2, false);
        declareFunction(me, "preds_of_instances", "PREDS-OF-INSTANCES", 2, 1, false);
        declareFunction(me, "preds_of_instances_int", "PREDS-OF-INSTANCES-INT", 2, 1, false);
        declareFunction(me, "preds_of_instances_in_space_1", "PREDS-OF-INSTANCES-IN-SPACE-1", 2, 0, false);
        declareFunction(me, "preds_of_instances_in_space_2", "PREDS-OF-INSTANCES-IN-SPACE-2", 2, 0, false);
        declareFunction(me, "preds_of_instances_in_spaces", "PREDS-OF-INSTANCES-IN-SPACES", 2, 0, false);
        declareFunction(me, "arg_isa_preds_of_collection_table", "ARG-ISA-PREDS-OF-COLLECTION-TABLE", 1, 1, false);
        declareFunction(me, "arg_isa_preds_of_collection_table_int", "ARG-ISA-PREDS-OF-COLLECTION-TABLE-INT", 1, 0, false);
        declareFunction(me, "gather_arg_isa_preds_of_collection", "GATHER-ARG-ISA-PREDS-OF-COLLECTION", 1, 0, false);
        declareFunction(me, "gather_arg_isa_preds_of_collection_int", "GATHER-ARG-ISA-PREDS-OF-COLLECTION-INT", 1, 0, false);
        declareFunction(me, "legal_preds_of_forts_isa", "LEGAL-PREDS-OF-FORTS-ISA", 2, 1, false);
        declareFunction(me, "legal_preds_of_forts_int", "LEGAL-PREDS-OF-FORTS-INT", 2, 0, false);
        declareFunction(me, "gather_col_legal_preds", "GATHER-COL-LEGAL-PREDS", 1, 0, false);
        declareFunction(me, "preds_of_forts", "PREDS-OF-FORTS", 2, 1, false);
        declareFunction(me, "preds_of_forts_int", "PREDS-OF-FORTS-INT", 2, 0, false);
        declareFunction(me, "new_note_preds_wXaccessed_arg_constraint", "NEW-NOTE-PREDS-W/ACCESSED-ARG-CONSTRAINT", 1, 0, false);
        declareFunction(me, "preds_of_constants", "PREDS-OF-CONSTANTS", 2, 1, false);
        declareFunction(me, "preds_of_constants_int", "PREDS-OF-CONSTANTS-INT", 2, 1, false);
        declareFunction(me, "preds_of_constants_in_space_1", "PREDS-OF-CONSTANTS-IN-SPACE-1", 2, 0, false);
        declareFunction(me, "preds_of_constants_in_space_2", "PREDS-OF-CONSTANTS-IN-SPACE-2", 2, 0, false);
        declareFunction(me, "preds_of_constants_in_space_3", "PREDS-OF-CONSTANTS-IN-SPACE-3", 2, 0, false);
        declareFunction(me, "preds_of_constants_in_space_4", "PREDS-OF-CONSTANTS-IN-SPACE-4", 2, 0, false);
        declareFunction(me, "preds_of_constants_in_spaces", "PREDS-OF-CONSTANTS-IN-SPACES", 2, 0, false);
        declareFunction(me, "preds_of_referents", "PREDS-OF-REFERENTS", 3, 0, false);
        declareFunction(me, "preds_of_refererents_int", "PREDS-OF-REFERERENTS-INT", 2, 1, false);
        declareFunction(me, "preds_of_refererents_in_space_1", "PREDS-OF-REFERERENTS-IN-SPACE-1", 2, 0, false);
        declareFunction(me, "preds_of_refererents_in_space_2", "PREDS-OF-REFERERENTS-IN-SPACE-2", 2, 0, false);
        declareFunction(me, "preds_of_refererents_in_space_3", "PREDS-OF-REFERERENTS-IN-SPACE-3", 2, 0, false);
        declareFunction(me, "preds_of_refererents_in_space_4", "PREDS-OF-REFERERENTS-IN-SPACE-4", 2, 0, false);
        declareFunction(me, "preds_of_refererents_in_spaces", "PREDS-OF-REFERERENTS-IN-SPACES", 2, 0, false);
        declareFunction(me, "gather_preds_constrained_by_superiors_of_defn_admitted", "GATHER-PREDS-CONSTRAINED-BY-SUPERIORS-OF-DEFN-ADMITTED", 2, 0, false);
        declareFunction(me, "gather_accessed_arg_isa_of_preds", "GATHER-ACCESSED-ARG-ISA-OF-PREDS", 1, 0, false);
        declareFunction(me, "gather_accessed_arg_constrained_by_preds", "GATHER-ACCESSED-ARG-CONSTRAINED-BY-PREDS", 1, 0, false);
        declareFunction(me, "gather_preds_wXaccessed_arg_constraint", "GATHER-PREDS-W/ACCESSED-ARG-CONSTRAINT", 1, 0, false);
        declareFunction(me, "clear_pred_args_constraints_accessed_in_spacesP", "CLEAR-PRED-ARGS-CONSTRAINTS-ACCESSED-IN-SPACES?", 0, 0, false);
        declareFunction(me, "pred_args_constraints_accessed_in_spacesP", "PRED-ARGS-CONSTRAINTS-ACCESSED-IN-SPACES?", 1, 0, false);
        declareFunction(me, "clear_cached_pred_args_isa_accessed_in_spacesP", "CLEAR-CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?", 0, 0, false);
        declareFunction(me, "remove_cached_pred_args_isa_accessed_in_spacesP", "REMOVE-CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?", 1, 0, false);
        declareFunction(me, "cached_pred_args_isa_accessed_in_spacesP_internal", "CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_pred_args_isa_accessed_in_spacesP", "CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?", 1, 0, false);
        declareFunction(me, "pred_args_isa_accessed_in_spacesP", "PRED-ARGS-ISA-ACCESSED-IN-SPACES?", 1, 2, false);
        declareFunction(me, "clear_cached_pred_args_genls_accessed_in_spacesP", "CLEAR-CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?", 0, 0, false);
        declareFunction(me, "remove_cached_pred_args_genls_accessed_in_spacesP", "REMOVE-CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?", 1, 0, false);
        declareFunction(me, "cached_pred_args_genls_accessed_in_spacesP_internal", "CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_pred_args_genls_accessed_in_spacesP", "CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?", 1, 0, false);
        declareFunction(me, "pred_args_genls_accessed_in_spacesP", "PRED-ARGS-GENLS-ACCESSED-IN-SPACES?", 1, 2, false);
        declareFunction(me, "arg_accessed_in_spaceP", "ARG-ACCESSED-IN-SPACE?", 5, 1, false);
        declareFunction(me, "non_searched_argP", "NON-SEARCHED-ARG?", 1, 0, false);
        declareFunction(me, "weakest_args", "WEAKEST-ARGS", 3, 1, false);
        declareFunction(me, "strongest_args", "STRONGEST-ARGS", 3, 1, false);
        declareFunction(me, "subsumed_by_stronger_argsP", "SUBSUMED-BY-STRONGER-ARGS?", 4, 1, false);
        declareFunction(me, "transitive_via_arg_preds", "TRANSITIVE-VIA-ARG-PREDS", 2, 1, false);
        declareFunction(me, "transitive_via_arg_inverses", "TRANSITIVE-VIA-ARG-INVERSES", 2, 1, false);
        declareFunction(me, "superiors_wrt", "SUPERIORS-WRT", 2, 1, false);
        declareFunction(me, "inferiors_wrt", "INFERIORS-WRT", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_ke_tools_file() {
        defparameter("*FORT1-PREDS*", NIL);
        defparameter("*FORT2-PREDS*", NIL);
        defparameter("*FORTS-CANDIDATE-PREDS*", NIL);
        deflexical("*CACHED-PRED-ARGS-ISA-ACCESSED-IN-SPACES?-CACHING-STATE*", NIL);
        deflexical("*CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_ke_tools_file() {
        register_cyc_api_function(PREDS_FOR_PAIR, $list8, $str9$Return_a_list_of_the_predicates_r, $list10, $list11);
        memoization_state.note_globally_cached_function($sym31$CACHED_PRED_ARGS_ISA_ACCESSED_IN_SPACES_);
        memoization_state.note_globally_cached_function($sym35$CACHED_PRED_ARGS_GENLS_ACCESSED_IN_SPACES_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_ke_tools_file();
    }

    @Override
    public void initializeVariables() {
        init_ke_tools_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_ke_tools_file();
    }

    
}

/**
 * Total time: 1175 ms
 */
