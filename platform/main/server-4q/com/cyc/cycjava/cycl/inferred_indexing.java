package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cb_utilities.cb_sort_preds_for_display;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inferred_indexing extends SubLTranslatedFile {
    public static final SubLFile me = new inferred_indexing();

    public static final String myName = "com.cyc.cycjava.cycl.inferred_indexing";

    public static final String myFingerPrint = "a12ea05530dd493ba376d0dffb065f2fcb2072f156a659c4d09db070aaadeb65";





    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));















    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));









    private static final SubLString $str16$Unexpected_inheritance_pred__S = makeString("Unexpected inheritance pred ~S");

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));





    private static final SubLObject $$relationInstanceAll = reader_make_constant_shell(makeString("relationInstanceAll"));

    private static final SubLObject $$relationAllExists = reader_make_constant_shell(makeString("relationAllExists"));

    private static final SubLObject $$relationExistsAll = reader_make_constant_shell(makeString("relationExistsAll"));

    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    public static final SubLSymbol $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_ = makeSymbol("CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?");



    public static final SubLSymbol CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE = makeSymbol("CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE");

    public static final SubLSymbol $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$ = makeSymbol("*CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*");

    public static final SubLSymbol CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE = makeSymbol("CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE");

    public static final SubLSymbol $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$ = makeSymbol("*CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*");

    public static final SubLList $list31 = list(makeSymbol("INFER-PRED"), makeSymbol("QUA"), makeSymbol("ARGNUM"), makeSymbol("PRED"));

    public static final SubLSymbol NUM_INFERRED_GAF_ARG_INDEX_TUPLE = makeSymbol("NUM-INFERRED-GAF-ARG-INDEX-TUPLE");

    public static final SubLSymbol NUM_INFERRED_GAF_ARG_INDEX_TUPLES = makeSymbol("NUM-INFERRED-GAF-ARG-INDEX-TUPLES");



    private static final SubLSymbol $ALLOW_PREDICATE_TYPES = makeKeyword("ALLOW-PREDICATE-TYPES");



    private static final SubLSymbol $FORBID_PREDICATE_TYPES = makeKeyword("FORBID-PREDICATE-TYPES");

    public static final SubLSymbol $sym38$GENERALITY_ESTIMATE_ = makeSymbol("GENERALITY-ESTIMATE<");

    public static final SubLList $list39 = list(reader_make_constant_shell(makeString("equals")));

    public static final SubLSymbol $sym40$_ = makeSymbol("<");



    public static final SubLString $str42$Unexpected_order_by____S = makeString("Unexpected order-by : ~S");



    public static SubLObject term_inheritance_collections(final SubLObject v_term, SubLObject ontology_horizon, SubLObject mt) {
        if (ontology_horizon == UNPROVIDED) {
            ontology_horizon = $$Thing;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        if (NIL == ontology_horizon) {
            ontology_horizon = $$Thing;
        }
        final SubLObject pcase_var = ontology_horizon;
        if (pcase_var.eql($SELF)) {
            return list(v_term);
        }
        if (pcase_var.eql($MIDDLE)) {
            ontology_horizon = middle_upper_ontology_boundary_generality_estimate();
        } else
            if (pcase_var.eql($LOWER)) {
                ontology_horizon = lower_middle_ontology_boundary_generality_estimate();
            }

        SubLObject candidates = (NIL != fort_types_interface.isa_collection_in_any_mtP(v_term)) ? genls.all_genls(v_term, mt, UNPROVIDED) : isa.all_isa(v_term, mt, UNPROVIDED);
        if (!ontology_horizon.eql($$Thing)) {
            if (!ontology_horizon.isNumber()) {
                ontology_horizon = cardinality_estimates.generality_estimate(ontology_horizon);
            }
            SubLObject filtered_candidates = NIL;
            SubLObject cdolist_list_var = candidates;
            SubLObject candidate = NIL;
            candidate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject generality = cardinality_estimates.generality_estimate(candidate);
                if (!generality.numG(ontology_horizon)) {
                    filtered_candidates = cons(candidate, filtered_candidates);
                }
                cdolist_list_var = cdolist_list_var.rest();
                candidate = cdolist_list_var.first();
            } 
            candidates = filtered_candidates;
        }
        candidates = cardinality_estimates.sort_by_generality_estimate(candidates, $ASCENDING);
        return candidates;
    }

    public static SubLObject new_term_inheritance_iterator(final SubLObject v_term, SubLObject ontology_horizon, SubLObject mt) {
        if (ontology_horizon == UNPROVIDED) {
            ontology_horizon = $$Thing;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        final SubLObject candidates = term_inheritance_collections(v_term, ontology_horizon, mt);
        return iteration.new_list_iterator(adjoin(v_term, candidates, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject all_inferred_gaf_arg_index_tuples(final SubLObject v_term, SubLObject filters, SubLObject order_by) {
        if (filters == UNPROVIDED) {
            filters = NIL;
        }
        if (order_by == UNPROVIDED) {
            order_by = $PREDICATE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_tuples = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TWO_INTEGER);
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject current;
                        final SubLObject datum = current = filters;
                        final SubLObject ontology_horizon_tail = property_list_member($ONTOLOGY_HORIZON, current);
                        final SubLObject ontology_horizon = (NIL != ontology_horizon_tail) ? cadr(ontology_horizon_tail) : NIL;
                        final SubLObject microtheory_tail = property_list_member($MICROTHEORY, current);
                        final SubLObject microtheory = (NIL != microtheory_tail) ? cadr(microtheory_tail) : $$EverythingPSC;
                        final SubLObject default_infer_pred = (NIL != fort_types_interface.isa_collection_in_any_mtP(v_term)) ? $$genls : $$isa;
                        final SubLObject iterator_var = new_term_inheritance_iterator(v_term, ontology_horizon, microtheory);
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject item = iteration.iteration_next(iterator_var);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                final SubLObject infer_pred = (item.equal(v_term)) ? $$equals : default_infer_pred;
                                SubLObject cdolist_list_var;
                                final SubLObject tuples = cdolist_list_var = inferred_gaf_arg_index_tuples(v_term, infer_pred, item, filters);
                                SubLObject tuple = NIL;
                                tuple = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    all_tuples = cons(tuple, all_tuples);
                                    cdolist_list_var = cdolist_list_var.rest();
                                    tuple = cdolist_list_var.first();
                                } 
                            }
                        }
                        all_tuples = sort_inferred_gaf_arg_index_tuples(v_term, all_tuples, order_by);
                    } finally {
                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return all_tuples;
    }

    public static SubLObject all_inferred_gaf_arg_index_predicates(final SubLObject v_term) {
        final SubLObject all_tuples = all_inferred_gaf_arg_index_tuples(v_term, NIL, $PREDICATE);
        final SubLObject tuple_groups = categorize_inferred_gaf_arg_index_tuples(v_term, all_tuples, $PREDICATE);
        final SubLObject first_tuples = list_utilities.nmapcar(symbol_function(FIRST), tuple_groups);
        SubLObject predicates = list_utilities.nmapcar(symbol_function(FOURTH), first_tuples);
        predicates = list_utilities.delete_duplicates_sorted(predicates, UNPROVIDED);
        return predicates;
    }

    public static SubLObject all_inferred_gaf_arg_index_ontology_terms(final SubLObject v_term) {
        final SubLObject all_tuples = all_inferred_gaf_arg_index_tuples(v_term, NIL, $ONTOLOGY);
        final SubLObject tuple_groups = categorize_inferred_gaf_arg_index_tuples(v_term, all_tuples, $ONTOLOGY);
        final SubLObject first_tuples = list_utilities.nmapcar(symbol_function(FIRST), tuple_groups);
        SubLObject qua_terms = list_utilities.nmapcar(symbol_function(SECOND), first_tuples);
        qua_terms = list_utilities.delete_duplicates_sorted(qua_terms, UNPROVIDED);
        return qua_terms;
    }

    public static SubLObject inferred_index_filters_extract_microtheory(final SubLObject filters) {
        return getf(filters, $MICROTHEORY, $$EverythingPSC);
    }

    public static SubLObject inferred_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject infer_pred, final SubLObject qua, final SubLObject filters) {
        if (infer_pred.eql($$equals)) {
            return direct_gaf_arg_index_tuples(v_term, filters);
        }
        if (infer_pred.eql($$isa)) {
            return inferred_gaf_arg_index_tuples_via_isa(v_term, qua, filters);
        }
        if (infer_pred.eql($$genls)) {
            return inferred_gaf_arg_index_tuples_via_genls(v_term, qua, filters);
        }
        return Errors.error($str16$Unexpected_inheritance_pred__S, infer_pred);
    }

    public static SubLObject direct_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject filters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inferred_index_filters_extract_microtheory(filters));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject argnums = kb_indexing.relevant_key_gaf_arg_index(v_term, UNPROVIDED, UNPROVIDED);
            if ((NIL != forts.fort_p(v_term)) && (NIL != fort_types_interface.collectionP(v_term))) {
                final SubLObject item_var = TWO_INTEGER;
                if (NIL == member(item_var, argnums, symbol_function(EQL), symbol_function(IDENTITY))) {
                    argnums = cons(item_var, argnums);
                }
            }
            SubLObject cdolist_list_var = argnums;
            SubLObject argnum = NIL;
            argnum = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject preds = kb_indexing.relevant_key_gaf_arg_index(v_term, argnum, UNPROVIDED);
                if (((NIL != forts.fort_p(v_term)) && (NIL != fort_types_interface.collectionP(v_term))) && argnum.numE(TWO_INTEGER)) {
                    if (cardinality_estimates.instance_cardinality(v_term).isPositive()) {
                        final SubLObject item_var2 = $$isa;
                        if (NIL == member(item_var2, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                            preds = cons(item_var2, preds);
                        }
                    }
                    if (cardinality_estimates.quoted_instance_cardinality(v_term).isPositive()) {
                        final SubLObject item_var2 = $$quotedIsa;
                        if (NIL == member(item_var2, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                            preds = cons(item_var2, preds);
                        }
                    }
                }
                SubLObject cdolist_list_var_$4 = preds;
                SubLObject pred = NIL;
                pred = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    if (NIL != pred_filters_allowP(filters, pred)) {
                        tuples = cons(list($$equals, v_term, argnum, pred), tuples);
                    }
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    pred = cdolist_list_var_$4.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                argnum = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_inferred_gaf_arg_index_tuples(v_term, tuples, $PREDICATE);
    }

    public static SubLObject inferred_gaf_arg_index_tuples_via_isa(final SubLObject v_term, final SubLObject qua, final SubLObject filters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inferred_index_filters_extract_microtheory(filters));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (kb_indexing.relevant_num_gaf_arg_index(qua, TWO_INTEGER, $$relationAllInstance).isPositive()) {
                if (NIL != pred_filters_allowP(filters, $$relationAllInstance)) {
                    tuples = cons(list($$isa, qua, TWO_INTEGER, $$relationAllInstance), tuples);
                }
                SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(qua, TWO_INTEGER, $$relationAllInstance, NIL, $TRUE);
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pred = assertions_high.gaf_arg1(gaf);
                    if (NIL != pred_filters_allowP(filters, pred)) {
                        tuples = cons(list($QUERY_ISA, qua, ONE_INTEGER, pred), tuples);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if (kb_indexing.relevant_num_gaf_arg_index(qua, THREE_INTEGER, $$relationInstanceAll).isPositive()) {
                if (NIL != pred_filters_allowP(filters, $$relationInstanceAll)) {
                    tuples = cons(list($$isa, qua, THREE_INTEGER, $$relationInstanceAll), tuples);
                }
                SubLObject cdolist_list_var = kb_mapping.gather_gaf_arg_index(qua, THREE_INTEGER, $$relationInstanceAll, NIL, $TRUE);
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pred = assertions_high.gaf_arg1(gaf);
                    if (NIL != pred_filters_allowP(filters, pred)) {
                        tuples = cons(list($QUERY_ISA, qua, TWO_INTEGER, pred), tuples);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if (kb_indexing.relevant_num_gaf_arg_index(qua, TWO_INTEGER, $$relationAllExists).isPositive() && (NIL != pred_filters_allowP(filters, $$relationAllExists))) {
                tuples = cons(list($$isa, qua, TWO_INTEGER, $$relationAllExists), tuples);
            }
            if (kb_indexing.relevant_num_gaf_arg_index(qua, THREE_INTEGER, $$relationExistsAll).isPositive() && (NIL != pred_filters_allowP(filters, $$relationExistsAll))) {
                tuples = cons(list($$isa, qua, THREE_INTEGER, $$relationExistsAll), tuples);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_inferred_gaf_arg_index_tuples(v_term, tuples, $PREDICATE);
    }

    public static SubLObject inferred_gaf_arg_index_tuples_via_genls(final SubLObject v_term, final SubLObject qua, final SubLObject filters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuples = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(inferred_index_filters_extract_microtheory(filters));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = kb_indexing.relevant_key_gaf_arg_index(qua, UNPROVIDED, UNPROVIDED);
            SubLObject argnum = NIL;
            argnum = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$5;
                final SubLObject preds = cdolist_list_var_$5 = kb_indexing.relevant_key_gaf_arg_index(qua, argnum, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    if ((((!pred.eql($$genls)) && (NIL != somewhere_cache.some_pred_assertion_somewhereP($$transitiveViaArgInverse, pred, ONE_INTEGER, UNPROVIDED))) && (NIL != pred_filters_allowP(filters, pred))) && (NIL != cached_transitive_via_arg_inverse_genls_in_any_mtP(pred, argnum))) {
                        tuples = cons(list($$genls, qua, argnum, pred), tuples);
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    pred = cdolist_list_var_$5.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                argnum = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sort_inferred_gaf_arg_index_tuples(v_term, tuples, $PREDICATE);
    }

    public static SubLObject transitive_via_arg_inverse_genlsP(final SubLObject pred, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != somewhere_cache.some_pred_assertion_somewhereP($$transitiveViaArgInverse, pred, ONE_INTEGER, UNPROVIDED)) && (NIL != kb_mapping_utilities.tuple_holds_in_relevant_mts(list($$transitiveViaArgInverse, pred, $$genls, argnum), mt, ONE_INTEGER, $TRUE)));
    }

    public static SubLObject cached_transitive_via_arg_inverse_genls_in_any_mtP_internal(final SubLObject pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = transitive_via_arg_inverse_genlsP(pred, argnum, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject cached_transitive_via_arg_inverse_genls_in_any_mtP(final SubLObject pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return cached_transitive_via_arg_inverse_genls_in_any_mtP_internal(pred, argnum);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, TWO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, argnum);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && argnum.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(cached_transitive_via_arg_inverse_genls_in_any_mtP_internal(pred, argnum)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, argnum));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject middle_upper_ontology_boundary_generality_estimate() {
        return truncate(expt(number_utilities.$e$.getGlobalValue(), multiply(divide(TWO_INTEGER, THREE_INTEGER), log(cardinality_estimates.generality_estimate($$Thing), UNPROVIDED))), UNPROVIDED);
    }

    public static SubLObject lower_middle_ontology_boundary_generality_estimate() {
        return truncate(expt(number_utilities.$e$.getGlobalValue(), multiply(divide(ONE_INTEGER, THREE_INTEGER), log(cardinality_estimates.generality_estimate($$Thing), UNPROVIDED))), UNPROVIDED);
    }

    public static SubLObject clear_cached_middle_upper_ontology_boundary_generality_estimate() {
        final SubLObject cs = $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_middle_upper_ontology_boundary_generality_estimate() {
        return memoization_state.caching_state_remove_function_results_with_args($cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_middle_upper_ontology_boundary_generality_estimate_internal() {
        return middle_upper_ontology_boundary_generality_estimate();
    }

    public static SubLObject cached_middle_upper_ontology_boundary_generality_estimate() {
        SubLObject caching_state = $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE, $cached_middle_upper_ontology_boundary_generality_estimate_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_middle_upper_ontology_boundary_generality_estimate_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cached_lower_middle_ontology_boundary_generality_estimate() {
        final SubLObject cs = $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_lower_middle_ontology_boundary_generality_estimate() {
        return memoization_state.caching_state_remove_function_results_with_args($cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_lower_middle_ontology_boundary_generality_estimate_internal() {
        return lower_middle_ontology_boundary_generality_estimate();
    }

    public static SubLObject cached_lower_middle_ontology_boundary_generality_estimate() {
        SubLObject caching_state = $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE, $cached_lower_middle_ontology_boundary_generality_estimate_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_lower_middle_ontology_boundary_generality_estimate_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject upper_ontology_collection_p(final SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collection_p(v_object))) && cardinality_estimates.generality_estimate(v_object).numG(cached_middle_upper_ontology_boundary_generality_estimate()));
    }

    public static SubLObject middle_ontology_collection_p(final SubLObject v_object) {
        return makeBoolean((((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collection_p(v_object))) && cardinality_estimates.generality_estimate(v_object).numLE(cached_middle_upper_ontology_boundary_generality_estimate())) && cardinality_estimates.generality_estimate(v_object).numG(cached_lower_middle_ontology_boundary_generality_estimate()));
    }

    public static SubLObject lower_ontology_collection_p(final SubLObject v_object) {
        return makeBoolean(((NIL != forts.fort_p(v_object)) && (NIL != fort_types_interface.collection_p(v_object))) && cardinality_estimates.generality_estimate(v_object).numLE(cached_lower_middle_ontology_boundary_generality_estimate()));
    }

    public static SubLObject num_inferred_gaf_arg_index_tuple(final SubLObject tuple, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject infer_pred = NIL;
            SubLObject qua = NIL;
            SubLObject argnum = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(tuple, tuple, $list31);
            infer_pred = tuple.first();
            SubLObject current = tuple.rest();
            destructuring_bind_must_consp(current, tuple, $list31);
            qua = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, tuple, $list31);
            argnum = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, tuple, $list31);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                num = kb_indexing.relevant_num_gaf_arg_index(qua, argnum, pred);
            } else {
                cdestructuring_bind_error(tuple, $list31);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return num;
    }

    public static SubLObject num_inferred_gaf_arg_index_tuples(final SubLObject tuples, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            num = number_utilities.summation(Mapping.mapcar(symbol_function(NUM_INFERRED_GAF_ARG_INDEX_TUPLE), tuples));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return num;
    }

    public static SubLObject num_inferred_gaf_arg_index_tuple_groups(final SubLObject tuple_groups, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject num = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            num = number_utilities.summation(Mapping.mapcar(symbol_function(NUM_INFERRED_GAF_ARG_INDEX_TUPLES), tuple_groups));
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return num;
    }

    public static SubLObject categorize_via_pred_filters(final SubLObject predicates, final SubLObject pred_filters) {
        if (NIL == pred_filters) {
            return values(copy_list(predicates), NIL);
        }
        SubLObject allowed_predicates = NIL;
        SubLObject disallowed_predicates = NIL;
        SubLObject cdolist_list_var = predicates;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pred_filters_allowP(pred_filters, predicate)) {
                allowed_predicates = cons(predicate, allowed_predicates);
            } else {
                disallowed_predicates = cons(predicate, disallowed_predicates);
            }
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return values(nreverse(allowed_predicates), nreverse(disallowed_predicates));
    }

    public static SubLObject pred_filters_allowP(final SubLObject pred_filters, final SubLObject pred) {
        if (NIL == pred_filters) {
            return T;
        }
        final SubLObject allow_predicates_tail = property_list_member($ALLOW_PREDICATES, pred_filters);
        final SubLObject allow_predicates = (NIL != allow_predicates_tail) ? cadr(allow_predicates_tail) : NIL;
        final SubLObject allow_predicate_types_tail = property_list_member($ALLOW_PREDICATE_TYPES, pred_filters);
        final SubLObject allow_predicate_types = (NIL != allow_predicate_types_tail) ? cadr(allow_predicate_types_tail) : NIL;
        final SubLObject forbid_predicates_tail = property_list_member($FORBID_PREDICATES, pred_filters);
        final SubLObject forbid_predicates = (NIL != forbid_predicates_tail) ? cadr(forbid_predicates_tail) : NIL;
        final SubLObject forbid_predicate_types_tail = property_list_member($FORBID_PREDICATE_TYPES, pred_filters);
        final SubLObject forbid_predicate_types = (NIL != forbid_predicate_types_tail) ? cadr(forbid_predicate_types_tail) : NIL;
        if (NIL != list_utilities.member_eqP(pred, allow_predicates)) {
            return T;
        }
        if (NIL != list_utilities.member_eqP(pred, forbid_predicates)) {
            return NIL;
        }
        SubLObject cdolist_list_var = allow_predicate_types;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != isa.isa_in_any_mtP(pred, type)) || (NIL != isa.quoted_isa_in_any_mtP(pred, type))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        cdolist_list_var = forbid_predicate_types;
        type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != isa.isa_in_any_mtP(pred, type)) || (NIL != isa.quoted_isa_in_any_mtP(pred, type))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject sort_inferred_gaf_arg_index_tuples(final SubLObject v_term, SubLObject tuples, SubLObject order_by) {
        if (order_by == UNPROVIDED) {
            order_by = $PREDICATE;
        }
        final SubLObject pcase_var = order_by;
        if (pcase_var.eql($PREDICATE)) {
            tuples = kb_utilities.sort_terms(tuples, NIL, T, T, T, symbol_function(SECOND), UNPROVIDED);
            tuples = Sort.stable_sort(tuples, $sym38$GENERALITY_ESTIMATE_, symbol_function(SECOND));
            tuples = list_utilities.stable_sort_via_position(tuples, $list39, symbol_function(EQL), symbol_function(FIRST));
            tuples = Sort.stable_sort(tuples, $sym40$_, symbol_function(THIRD));
            tuples = sort_inferred_gaf_arg_index_tuples_by_predicates(v_term, tuples);
        } else
            if (pcase_var.eql($ONTOLOGY)) {
                tuples = Sort.stable_sort(tuples, $sym40$_, symbol_function(THIRD));
                tuples = sort_inferred_gaf_arg_index_tuples_by_predicates(v_term, tuples);
                tuples = kb_utilities.sort_terms(tuples, NIL, T, T, T, symbol_function(SECOND), UNPROVIDED);
                tuples = Sort.stable_sort(tuples, $sym38$GENERALITY_ESTIMATE_, symbol_function(SECOND));
                tuples = list_utilities.stable_sort_via_position(tuples, $list39, symbol_function(EQL), symbol_function(FIRST));
            } else {
                Errors.error($str42$Unexpected_order_by____S, order_by);
            }

        return tuples;
    }

    public static SubLObject sort_inferred_gaf_arg_index_tuples_by_predicates(final SubLObject v_term, final SubLObject tuples) {
        return cb_sort_preds_for_display(v_term, tuples, symbol_function(FOURTH));
    }

    public static SubLObject categorize_inferred_gaf_arg_index_tuples(final SubLObject v_term, final SubLObject all_tuples, final SubLObject order_by) {
        SubLObject tuple_groups = NIL;
        if (order_by.eql($ONTOLOGY)) {
            SubLObject last_qua = $UNINITIALIZED;
            SubLObject tuples = NIL;
            SubLObject cdolist_list_var = all_tuples;
            SubLObject tuple = NIL;
            tuple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject qua = second(tuple);
                if (!qua.equal(last_qua)) {
                    last_qua = qua;
                    if (NIL != tuples) {
                        tuple_groups = cons(nreverse(tuples), tuple_groups);
                        tuples = NIL;
                    }
                }
                tuples = cons(tuple, tuples);
                cdolist_list_var = cdolist_list_var.rest();
                tuple = cdolist_list_var.first();
            } 
            if (NIL != tuples) {
                tuple_groups = cons(nreverse(tuples), tuple_groups);
            }
        } else
            if (order_by.eql($PREDICATE)) {
                SubLObject last_argnum = $UNINITIALIZED;
                SubLObject last_pred = $UNINITIALIZED;
                SubLObject tuples2 = NIL;
                SubLObject cdolist_list_var2 = all_tuples;
                SubLObject tuple2 = NIL;
                tuple2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    final SubLObject argnum = third(tuple2);
                    final SubLObject pred = fourth(tuple2);
                    if ((!argnum.equal(last_argnum)) || (!pred.equal(last_pred))) {
                        last_argnum = argnum;
                        last_pred = pred;
                        if (NIL != tuples2) {
                            tuple_groups = cons(nreverse(tuples2), tuple_groups);
                            tuples2 = NIL;
                        }
                    }
                    tuples2 = cons(tuple2, tuples2);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    tuple2 = cdolist_list_var2.first();
                } 
                if (NIL != tuples2) {
                    tuple_groups = cons(nreverse(tuples2), tuple_groups);
                }
            }

        return nreverse(tuple_groups);
    }

    public static SubLObject declare_inferred_indexing_file() {
        declareFunction(me, "term_inheritance_collections", "TERM-INHERITANCE-COLLECTIONS", 1, 2, false);
        declareFunction(me, "new_term_inheritance_iterator", "NEW-TERM-INHERITANCE-ITERATOR", 1, 2, false);
        declareFunction(me, "all_inferred_gaf_arg_index_tuples", "ALL-INFERRED-GAF-ARG-INDEX-TUPLES", 1, 2, false);
        declareFunction(me, "all_inferred_gaf_arg_index_predicates", "ALL-INFERRED-GAF-ARG-INDEX-PREDICATES", 1, 0, false);
        declareFunction(me, "all_inferred_gaf_arg_index_ontology_terms", "ALL-INFERRED-GAF-ARG-INDEX-ONTOLOGY-TERMS", 1, 0, false);
        declareFunction(me, "inferred_index_filters_extract_microtheory", "INFERRED-INDEX-FILTERS-EXTRACT-MICROTHEORY", 1, 0, false);
        declareFunction(me, "inferred_gaf_arg_index_tuples", "INFERRED-GAF-ARG-INDEX-TUPLES", 4, 0, false);
        declareFunction(me, "direct_gaf_arg_index_tuples", "DIRECT-GAF-ARG-INDEX-TUPLES", 2, 0, false);
        declareFunction(me, "inferred_gaf_arg_index_tuples_via_isa", "INFERRED-GAF-ARG-INDEX-TUPLES-VIA-ISA", 3, 0, false);
        declareFunction(me, "inferred_gaf_arg_index_tuples_via_genls", "INFERRED-GAF-ARG-INDEX-TUPLES-VIA-GENLS", 3, 0, false);
        declareFunction(me, "transitive_via_arg_inverse_genlsP", "TRANSITIVE-VIA-ARG-INVERSE-GENLS?", 2, 1, false);
        declareFunction(me, "cached_transitive_via_arg_inverse_genls_in_any_mtP_internal", "CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?-INTERNAL", 2, 0, false);
        declareFunction(me, "cached_transitive_via_arg_inverse_genls_in_any_mtP", "CACHED-TRANSITIVE-VIA-ARG-INVERSE-GENLS-IN-ANY-MT?", 2, 0, false);
        declareFunction(me, "middle_upper_ontology_boundary_generality_estimate", "MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        declareFunction(me, "lower_middle_ontology_boundary_generality_estimate", "LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        declareFunction(me, "clear_cached_middle_upper_ontology_boundary_generality_estimate", "CLEAR-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        declareFunction(me, "remove_cached_middle_upper_ontology_boundary_generality_estimate", "REMOVE-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        declareFunction(me, "cached_middle_upper_ontology_boundary_generality_estimate_internal", "CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-INTERNAL", 0, 0, false);
        declareFunction(me, "cached_middle_upper_ontology_boundary_generality_estimate", "CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        declareFunction(me, "clear_cached_lower_middle_ontology_boundary_generality_estimate", "CLEAR-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        declareFunction(me, "remove_cached_lower_middle_ontology_boundary_generality_estimate", "REMOVE-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        declareFunction(me, "cached_lower_middle_ontology_boundary_generality_estimate_internal", "CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-INTERNAL", 0, 0, false);
        declareFunction(me, "cached_lower_middle_ontology_boundary_generality_estimate", "CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE", 0, 0, false);
        declareFunction(me, "upper_ontology_collection_p", "UPPER-ONTOLOGY-COLLECTION-P", 1, 0, false);
        declareFunction(me, "middle_ontology_collection_p", "MIDDLE-ONTOLOGY-COLLECTION-P", 1, 0, false);
        declareFunction(me, "lower_ontology_collection_p", "LOWER-ONTOLOGY-COLLECTION-P", 1, 0, false);
        declareFunction(me, "num_inferred_gaf_arg_index_tuple", "NUM-INFERRED-GAF-ARG-INDEX-TUPLE", 1, 1, false);
        declareFunction(me, "num_inferred_gaf_arg_index_tuples", "NUM-INFERRED-GAF-ARG-INDEX-TUPLES", 1, 1, false);
        declareFunction(me, "num_inferred_gaf_arg_index_tuple_groups", "NUM-INFERRED-GAF-ARG-INDEX-TUPLE-GROUPS", 1, 1, false);
        declareFunction(me, "categorize_via_pred_filters", "CATEGORIZE-VIA-PRED-FILTERS", 2, 0, false);
        declareFunction(me, "pred_filters_allowP", "PRED-FILTERS-ALLOW?", 2, 0, false);
        declareFunction(me, "sort_inferred_gaf_arg_index_tuples", "SORT-INFERRED-GAF-ARG-INDEX-TUPLES", 2, 1, false);
        declareFunction(me, "sort_inferred_gaf_arg_index_tuples_by_predicates", "SORT-INFERRED-GAF-ARG-INDEX-TUPLES-BY-PREDICATES", 2, 0, false);
        declareFunction(me, "categorize_inferred_gaf_arg_index_tuples", "CATEGORIZE-INFERRED-GAF-ARG-INDEX-TUPLES", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_inferred_indexing_file() {
        deflexical("*CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*", NIL);
        deflexical("*CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_inferred_indexing_file() {
        memoization_state.note_memoized_function($sym25$CACHED_TRANSITIVE_VIA_ARG_INVERSE_GENLS_IN_ANY_MT_);
        memoization_state.note_globally_cached_function(CACHED_MIDDLE_UPPER_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE);
        memoization_state.note_globally_cached_function(CACHED_LOWER_MIDDLE_ONTOLOGY_BOUNDARY_GENERALITY_ESTIMATE);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inferred_indexing_file();
    }

    @Override
    public void initializeVariables() {
        init_inferred_indexing_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inferred_indexing_file();
    }

    
}

/**
 * Total time: 429 ms
 */
