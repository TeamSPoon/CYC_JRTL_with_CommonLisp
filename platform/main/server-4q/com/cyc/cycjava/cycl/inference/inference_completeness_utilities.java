package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.equals;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_completeness_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new inference_completeness_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.inference.inference_completeness_utilities";

    public static final String myFingerPrint = "a76a0c15bfda1005e81b50dae82539710913197a76379d7d2ea62f37ab89f461";

    // Internal Constants
    public static final SubLSymbol $sym0$INFERENCE_MINIMIZE_EXTENT_ = makeSymbol("INFERENCE-MINIMIZE-EXTENT?");

    private static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS");

    private static final SubLInteger $int$8192 = makeInteger(8192);

    public static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS");

    public static final SubLSymbol INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS");

    public static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS");

    public static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS");

    public static final SubLSymbol INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS");

    public static final SubLSymbol INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS = makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS");



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLSymbol INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS = makeSymbol("INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS");

    public static SubLObject inference_minimize_extentP_internal(final SubLObject predicate) {
        return kb_accessors.minimize_extent(predicate, UNPROVIDED);
    }

    public static SubLObject inference_minimize_extentP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_minimize_extentP_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym0$INFERENCE_MINIMIZE_EXTENT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym0$INFERENCE_MINIMIZE_EXTENT_, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym0$INFERENCE_MINIMIZE_EXTENT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_minimize_extentP_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject inference_complete_extent_assertedP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_asserted_gaf(predicate, mt));
    }

    public static SubLObject inference_complete_extent_asserted_gaf(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.complete_extent_asserted_gaf(predicate, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }

    public static SubLObject inference_complete_extent_asserted_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_complete_extent_asserted_gaf(predicate, mt);
        if (NIL != var) {
            gafs = cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.complete_extent_asserted_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
            if (NIL != var2) {
                gafs = cons(var2, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static SubLObject inference_complete_extent_asserted_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_asserted_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_complete_extent_enumerableP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_gaf(predicate, mt));
    }

    public static SubLObject inference_complete_extent_enumerable_gaf(final SubLObject predicate, final SubLObject mt) {
        return inference_complete_extent_enumerable_gafs(predicate, mt).first();
    }

    public static SubLObject inference_complete_extent_enumerable_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_complete_extent_asserted_gaf(predicate, mt);
        if (NIL != var) {
            gafs = cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.complete_extent_enumerable_gaf(predicate, UNPROVIDED);
            if (NIL != var2) {
                gafs = cons(var2, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static SubLObject inference_complete_extent_enumerable_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, TWO_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_enumerable_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_complete_extent_decidableP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_decidable_gaf(predicate, mt));
    }

    public static SubLObject inference_complete_extent_decidable_gaf(final SubLObject predicate, final SubLObject mt) {
        return inference_complete_extent_decidable_gafs(predicate, mt).first();
    }

    public static SubLObject inference_complete_extent_decidable_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_gafs(predicate, mt);
        SubLObject stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_decidable_gaf(predicate, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static SubLObject inference_complete_extent_decidable_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_decidable_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, TWO_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_decidable_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_complete_extent_enumerable_for_argP(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_for_arg_gaf(predicate, argnum, mt));
    }

    public static SubLObject inference_complete_extent_enumerable_for_arg_gaf(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt).first();
    }

    public static SubLObject inference_complete_extent_enumerable_for_arg_gafs_internal(final SubLObject predicate, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_gafs(predicate, mt);
        SubLObject stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_for_arg_gaf(predicate, argnum, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static SubLObject inference_complete_extent_enumerable_for_arg_gafs(final SubLObject predicate, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, THREE_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(predicate, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_enumerable_for_arg_gafs_internal(predicate, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_complete_extent_enumerable_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        SubLObject cdolist_list_var;
        SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
        SubLObject stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
        stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static SubLObject inference_complete_extent_enumerable_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_enumerable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_complete_extent_decidable_for_value_in_argP(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, mt));
    }

    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gaf(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        return inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt).first();
    }

    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs_internal(final SubLObject predicate, final SubLObject value, final SubLObject argnum, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        SubLObject cdolist_list_var;
        final SubLObject stronger_gafs = cdolist_list_var = inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
        SubLObject stronger_gaf = NIL;
        stronger_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            gafs = cons(stronger_gaf, gafs);
            cdolist_list_var = cdolist_list_var.rest();
            stronger_gaf = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_decidable_for_value_in_arg_gaf(predicate, value, argnum, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static SubLObject inference_complete_extent_decidable_for_value_in_arg_gafs(final SubLObject predicate, final SubLObject value, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, FOUR_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(predicate, value, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (value.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.eql(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_decidable_for_value_in_arg_gafs_internal(predicate, value, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, value, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_completely_enumerable_collectionP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_collection_gaf(collection, mt));
    }

    public static SubLObject inference_completely_enumerable_collection_gaf(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.completely_enumerable_collection_gaf(collection, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }

    public static SubLObject inference_completely_decidable_collectionP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_decidable_collection_gaf(collection, mt));
    }

    public static SubLObject inference_completely_decidable_collection_gaf(final SubLObject collection, final SubLObject mt) {
        return inference_completely_decidable_collection_gafs(collection, mt).first();
    }

    public static SubLObject inference_completely_decidable_collection_gafs_internal(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        final SubLObject var;
        final SubLObject stronger_gaf = var = inference_completely_enumerable_collection_gaf(collection, mt);
        if (NIL != var) {
            gafs = cons(var, gafs);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var2;
            final SubLObject gaf = var2 = kb_accessors.completely_decidable_collection_gaf(collection, UNPROVIDED);
            if (NIL != var2) {
                gafs = cons(var2, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static SubLObject inference_completely_decidable_collection_gafs(final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_completely_decidable_collection_gafs_internal(collection, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, TWO_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(collection, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (collection.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_completely_decidable_collection_gafs_internal(collection, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(collection, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_complete_asentP(final SubLObject asent, final SubLObject mt) {
        if (NIL != variables.fully_bound_p(asent)) {
            return inference_completely_decidable_asentP(asent, mt);
        }
        return inference_completely_enumerable_asentP(asent, mt);
    }

    public static SubLObject inference_completely_asserted_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_asserted_asent_gaf(asent, mt));
    }

    public static SubLObject inference_completely_asserted_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_asserted_asent_gafs(asent, mt).first();
    }

    public static SubLObject inference_completely_asserted_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject gaf = inference_complete_extent_asserted_gaf(predicate, mt);
            if (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent)) {
                final SubLObject var = gaf;
                if (NIL != var) {
                    result_gafs = cons(var, result_gafs);
                }
            }
            final SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs = inference_complete_extent_asserted_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if ((NIL != gafs) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var = gafs;
                        SubLObject gaf2 = NIL;
                        gaf2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject item_var = gaf2;
                            if (NIL == member(item_var, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var, result_gafs);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            gaf2 = cdolist_list_var.first();
                        } 
                    }
                }
            }
        }
        return nreverse(result_gafs);
    }

    public static SubLObject inference_completely_enumerable_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_asent_gaf(asent, mt));
    }

    public static SubLObject inference_completely_enumerable_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_enumerable_asent_gafs(asent, mt);
    }

    public static SubLObject inference_completely_enumerable_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
            if ((NIL != gafs) && (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_gafs = cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if ($$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_completely_enumerable_collection_gaf(collection, mt);
                    if ((NIL != gaf2) && (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                        result_gafs = cons(gaf2, result_gafs);
                    }
                }
            }
            SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs2 = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                    if ((NIL != gafs2) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject item_var = gaf3;
                            if (NIL == member(item_var, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        } 
                    }
                }
            }
            terms = cycl_utilities.formula_terms(asent, $IGNORE);
            list_var = NIL;
            value = NIL;
            argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs2 = inference_complete_extent_enumerable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if ((NIL != gafs2) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject item_var = gaf3;
                            if (NIL == member(item_var, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        } 
                    }
                }
            }
        }
        return nreverse(result_gafs);
    }

    public static SubLObject inference_completely_decidable_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_decidable_asent_gaf(asent, mt));
    }

    public static SubLObject inference_completely_decidable_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_decidable_asent_gafs(asent, mt).first();
    }

    public static SubLObject inference_completely_decidable_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            SubLObject gafs = inference_complete_extent_enumerable_gafs(predicate, mt);
            if ((NIL != gafs) && (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_gafs = cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if ($$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_completely_enumerable_collection_gaf(collection, mt);
                    if ((NIL != gaf2) && (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                        result_gafs = cons(gaf2, result_gafs);
                    }
                }
            }
            gafs = inference_complete_extent_decidable_gafs(predicate, mt);
            if ((NIL != gafs) && (NIL != equals.unique_names_assumption_applicable_to_all_argsP(asent))) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = gaf;
                    if (NIL == member(item_var, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                        result_gafs = cons(item_var, result_gafs);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if ($$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(collection)) {
                    final SubLObject gafs2 = inference_completely_decidable_collection_gafs(collection, mt);
                    if ((NIL != gafs2) && (NIL != equals.unique_names_assumption_applicable_to_termP(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
                        SubLObject cdolist_list_var2 = gafs2;
                        SubLObject gaf3 = NIL;
                        gaf3 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            final SubLObject item_var2 = gaf3;
                            if (NIL == member(item_var2, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var2, result_gafs);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            gaf3 = cdolist_list_var2.first();
                        } 
                    }
                }
            }
            SubLObject terms = cycl_utilities.formula_terms(asent, $IGNORE);
            SubLObject list_var = NIL;
            SubLObject value = NIL;
            SubLObject argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs3 = inference_complete_extent_enumerable_for_arg_gafs(predicate, argnum, mt);
                    if ((NIL != gafs3) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var3 = gafs3;
                        SubLObject gaf4 = NIL;
                        gaf4 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            final SubLObject item_var3 = gaf4;
                            if (NIL == member(item_var3, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var3, result_gafs);
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            gaf4 = cdolist_list_var3.first();
                        } 
                    }
                }
            }
            terms = cycl_utilities.formula_terms(asent, $IGNORE);
            list_var = NIL;
            value = NIL;
            argnum = NIL;
            list_var = terms;
            value = list_var.first();
            for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , value = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
                if (NIL != variables.fully_bound_p(value)) {
                    final SubLObject gafs3 = inference_complete_extent_decidable_for_value_in_arg_gafs(predicate, value, argnum, mt);
                    if ((NIL != gafs3) && (NIL != equals.unique_names_assumption_applicable_to_all_args_exceptP(asent, argnum))) {
                        SubLObject cdolist_list_var3 = gafs3;
                        SubLObject gaf4 = NIL;
                        gaf4 = cdolist_list_var3.first();
                        while (NIL != cdolist_list_var3) {
                            final SubLObject item_var3 = gaf4;
                            if (NIL == member(item_var3, result_gafs, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result_gafs = cons(item_var3, result_gafs);
                            }
                            cdolist_list_var3 = cdolist_list_var3.rest();
                            gaf4 = cdolist_list_var3.first();
                        } 
                    }
                }
            }
        }
        return nreverse(result_gafs);
    }

    public static SubLObject completeness_constraint_mt(final SubLObject mt) {
        return mt_relevance_macros.conservative_constraint_mt(mt);
    }

    public static SubLObject inference_complete_extent_enumerable_via_backchainP(final SubLObject predicate, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_complete_extent_enumerable_via_backchain_gaf(predicate, mt));
    }

    public static SubLObject inference_complete_extent_enumerable_via_backchain_gaf(final SubLObject predicate, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        return inference_complete_extent_enumerable_via_backchain_gafs(predicate, mt).first();
    }

    public static SubLObject inference_complete_extent_enumerable_via_backchain_gafs_internal(final SubLObject predicate, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gafs = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject var;
            final SubLObject gaf = var = kb_accessors.complete_extent_enumerable_via_backchain_gaf(predicate, UNPROVIDED);
            if (NIL != var) {
                gafs = cons(var, gafs);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(gafs);
    }

    public static SubLObject inference_complete_extent_enumerable_via_backchain_gafs(final SubLObject predicate, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return inference_complete_extent_enumerable_via_backchain_gafs_internal(predicate, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, TWO_INTEGER, $int$8192, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (predicate.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(inference_complete_extent_enumerable_via_backchain_gafs_internal(predicate, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(predicate, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject inference_collection_completely_enumerable_via_backchainP(final SubLObject collection, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_collection_completely_enumerable_via_backchain_gaf(collection, mt));
    }

    public static SubLObject inference_collection_completely_enumerable_via_backchain_gaf(final SubLObject collection, SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        mt = completeness_constraint_mt(mt);
        SubLObject gaf = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            gaf = kb_accessors.collection_completely_enumerable_via_backchain_gaf(collection, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return gaf;
    }

    public static SubLObject inference_completely_enumerable_via_backchain_asentP(final SubLObject asent, final SubLObject mt) {
        return list_utilities.sublisp_boolean(inference_completely_enumerable_via_backchain_asent_gaf(asent, mt));
    }

    public static SubLObject inference_completely_enumerable_via_backchain_asent_gaf(final SubLObject asent, final SubLObject mt) {
        return inference_completely_enumerable_via_backchain_asent_gafs(asent, mt).first();
    }

    public static SubLObject inference_completely_enumerable_via_backchain_asent_gafs(final SubLObject asent, SubLObject mt) {
        mt = completeness_constraint_mt(mt);
        SubLObject result_gafs = NIL;
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        if (NIL != forts.fort_p(predicate)) {
            final SubLObject gafs = inference_complete_extent_enumerable_via_backchain_gafs(predicate, mt);
            if (NIL != gafs) {
                SubLObject cdolist_list_var = gafs;
                SubLObject gaf = NIL;
                gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    result_gafs = cons(gaf, result_gafs);
                    cdolist_list_var = cdolist_list_var.rest();
                    gaf = cdolist_list_var.first();
                } 
            }
            if ($$isa.eql(predicate)) {
                final SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (NIL != forts.fort_p(collection)) {
                    final SubLObject gaf2 = inference_collection_completely_enumerable_via_backchain_gaf(collection, mt);
                    if (NIL != gaf2) {
                        result_gafs = cons(gaf2, result_gafs);
                    }
                }
            }
        }
        return nreverse(result_gafs);
    }

    public static SubLObject declare_inference_completeness_utilities_file() {
        declareFunction(me, "inference_minimize_extentP_internal", "INFERENCE-MINIMIZE-EXTENT?-INTERNAL", 1, 0, false);
        declareFunction(me, "inference_minimize_extentP", "INFERENCE-MINIMIZE-EXTENT?", 1, 0, false);
        declareFunction(me, "inference_complete_extent_assertedP", "INFERENCE-COMPLETE-EXTENT-ASSERTED?", 2, 0, false);
        declareFunction(me, "inference_complete_extent_asserted_gaf", "INFERENCE-COMPLETE-EXTENT-ASSERTED-GAF", 2, 0, false);
        declareFunction(me, "inference_complete_extent_asserted_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG?", 4, 0, false);
        declareFunction(me, "inference_complete_extent_asserted_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        declareFunction(me, "inference_complete_extent_asserted_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        declareFunction(me, "inference_complete_extent_asserted_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ASSERTED-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        declareFunction(me, "inference_complete_extent_enumerableP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE?", 2, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAF", 2, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS-INTERNAL", 2, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-GAFS", 2, 0, false);
        declareFunction(me, "inference_complete_extent_decidableP", "INFERENCE-COMPLETE-EXTENT-DECIDABLE?", 2, 0, false);
        declareFunction(me, "inference_complete_extent_decidable_gaf", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAF", 2, 0, false);
        declareFunction(me, "inference_complete_extent_decidable_gafs_internal", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS-INTERNAL", 2, 0, false);
        declareFunction(me, "inference_complete_extent_decidable_gafs", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-GAFS", 2, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_for_argP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG?", 3, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_for_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAF", 3, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_for_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS-INTERNAL", 3, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_for_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-ARG-GAFS", 3, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG?", 4, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        declareFunction(me, "inference_complete_extent_decidable_for_value_in_argP", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG?", 4, 0, false);
        declareFunction(me, "inference_complete_extent_decidable_for_value_in_arg_gaf", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAF", 4, 0, false);
        declareFunction(me, "inference_complete_extent_decidable_for_value_in_arg_gafs_internal", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS-INTERNAL", 4, 0, false);
        declareFunction(me, "inference_complete_extent_decidable_for_value_in_arg_gafs", "INFERENCE-COMPLETE-EXTENT-DECIDABLE-FOR-VALUE-IN-ARG-GAFS", 4, 0, false);
        declareFunction(me, "inference_completely_enumerable_collectionP", "INFERENCE-COMPLETELY-ENUMERABLE-COLLECTION?", 2, 0, false);
        declareFunction(me, "inference_completely_enumerable_collection_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-COLLECTION-GAF", 2, 0, false);
        declareFunction(me, "inference_completely_decidable_collectionP", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION?", 2, 0, false);
        declareFunction(me, "inference_completely_decidable_collection_gaf", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAF", 2, 0, false);
        declareFunction(me, "inference_completely_decidable_collection_gafs_internal", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS-INTERNAL", 2, 0, false);
        declareFunction(me, "inference_completely_decidable_collection_gafs", "INFERENCE-COMPLETELY-DECIDABLE-COLLECTION-GAFS", 2, 0, false);
        declareFunction(me, "inference_complete_asentP", "INFERENCE-COMPLETE-ASENT?", 2, 0, false);
        declareFunction(me, "inference_completely_asserted_asentP", "INFERENCE-COMPLETELY-ASSERTED-ASENT?", 2, 0, false);
        declareFunction(me, "inference_completely_asserted_asent_gaf", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAF", 2, 0, false);
        declareFunction(me, "inference_completely_asserted_asent_gafs", "INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS", 2, 0, false);
        declareFunction(me, "inference_completely_enumerable_asentP", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT?", 2, 0, false);
        declareFunction(me, "inference_completely_enumerable_asent_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAF", 2, 0, false);
        declareFunction(me, "inference_completely_enumerable_asent_gafs", "INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS", 2, 0, false);
        declareFunction(me, "inference_completely_decidable_asentP", "INFERENCE-COMPLETELY-DECIDABLE-ASENT?", 2, 0, false);
        declareFunction(me, "inference_completely_decidable_asent_gaf", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAF", 2, 0, false);
        declareFunction(me, "inference_completely_decidable_asent_gafs", "INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS", 2, 0, false);
        declareFunction(me, "completeness_constraint_mt", "COMPLETENESS-CONSTRAINT-MT", 1, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_via_backchainP", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN?", 2, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_via_backchain_gaf", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAF", 2, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_via_backchain_gafs_internal", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS-INTERNAL", 2, 0, false);
        declareFunction(me, "inference_complete_extent_enumerable_via_backchain_gafs", "INFERENCE-COMPLETE-EXTENT-ENUMERABLE-VIA-BACKCHAIN-GAFS", 2, 0, false);
        declareFunction(me, "inference_collection_completely_enumerable_via_backchainP", "INFERENCE-COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN?", 2, 0, false);
        declareFunction(me, "inference_collection_completely_enumerable_via_backchain_gaf", "INFERENCE-COLLECTION-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-GAF", 2, 0, false);
        declareFunction(me, "inference_completely_enumerable_via_backchain_asentP", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT?", 2, 0, false);
        declareFunction(me, "inference_completely_enumerable_via_backchain_asent_gaf", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT-GAF", 2, 0, false);
        declareFunction(me, "inference_completely_enumerable_via_backchain_asent_gafs", "INFERENCE-COMPLETELY-ENUMERABLE-VIA-BACKCHAIN-ASENT-GAFS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_completeness_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_inference_completeness_utilities_file() {
        memoization_state.note_memoized_function($sym0$INFERENCE_MINIMIZE_EXTENT_);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ASSERTED_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ENUMERABLE_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_DECIDABLE_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_ARG_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ENUMERABLE_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_DECIDABLE_FOR_VALUE_IN_ARG_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETELY_DECIDABLE_COLLECTION_GAFS);
        memoization_state.note_memoized_function(INFERENCE_COMPLETE_EXTENT_ENUMERABLE_VIA_BACKCHAIN_GAFS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_completeness_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_completeness_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_completeness_utilities_file();
    }

    
}

/**
 * Total time: 207 ms
 */
