package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class constraint_filters extends SubLTranslatedFile {
    public static final SubLFile me = new constraint_filters();

    public static final String myName = "com.cyc.cycjava.cycl.constraint_filters";

    public static final String myFingerPrint = "5f90365ca969bf41a7c6ef4ef2e9ff98d674680f32aa878cf9ba7a564df5dcc6";

    // Internal Constants
    public static final SubLSymbol FORT_OR_CHLMT_P = makeSymbol("FORT-OR-CHLMT-P");

    public static final SubLSymbol FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS = makeSymbol("FILTER-TERMS-FOR-ARG-CONSTRAINTS-AT-ARGPOS");

    public static final SubLSymbol FILTER_TERMS_FOR_ARG_CONSTRAINTS = makeSymbol("FILTER-TERMS-FOR-ARG-CONSTRAINTS");

    public static final SubLList $list3 = list(reader_make_constant_shell(makeString("InferencePSC")), reader_make_constant_shell(makeString("EverythingPSC")));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));

    public static final SubLSymbol CONSTRAINT_FILTER_MIN_ISA = makeSymbol("CONSTRAINT-FILTER-MIN-ISA");

    private static final SubLObject $$Number_General = reader_make_constant_shell(makeString("Number-General"));

    private static final SubLSymbol $sym9$ANY_NOT_ISA_ = makeSymbol("ANY-NOT-ISA?");

    private static final SubLSymbol $sym10$ANY_NOT_QUOTED_ISA_ = makeSymbol("ANY-NOT-QUOTED-ISA?");

    private static final SubLSymbol $sym11$ANY_DEFNS_REJECT_ = makeSymbol("ANY-DEFNS-REJECT?");

    private static final SubLSymbol $sym12$ANY_SPEC_OF_ = makeSymbol("ANY-SPEC-OF?");

    private static final SubLSymbol FORMULA_TERM_ARG_CONSTRAINTS = makeSymbol("FORMULA-TERM-ARG-CONSTRAINTS");

    private static final SubLList $list14 = list(makeSymbol("ISA-CONSTRAINTS"), makeSymbol("GENLS-CONSTRAINTS"), makeSymbol("QUOTED-ISA-CONSTRAINTS"));

    private static final SubLSymbol $sym15$QUOTED_COLLECTION_ = makeSymbol("QUOTED-COLLECTION?");

    private static final SubLSymbol CONSTRAINED_CYCL_FILTER = makeSymbol("CONSTRAINED-CYCL-FILTER");













    private static final SubLList $list23 = list(list(list(list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)), makeInteger(2000)), list(reader_make_constant_shell(makeString("temporallyBetween")), makeSymbol("?EVENT"), makeSymbol("?EARLIER"), makeSymbol("?LATER")), list(TWO_INTEGER), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt")), makeSymbol("FILTER-CONSTRAINED-CYCLS")), list(list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))));

    private static final SubLSymbol SETS_EQUALP = makeSymbol("SETS-EQUALP");

    public static final SubLList $list25 = list(list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?Y"), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("is-Underspecified")), makeSymbol("?X"), makeSymbol("?Y"))), reader_make_constant_shell(makeString("InferencePSC")), list(reader_make_constant_shell(makeString("CarmelBird-Author")), reader_make_constant_shell(makeString("LarryBird")), reader_make_constant_shell(makeString("Bird")), reader_make_constant_shell(makeString("BirdWatching")))), list(reader_make_constant_shell(makeString("BirdWatching")), reader_make_constant_shell(makeString("Bird")))), list(list(makeSymbol("?Y"), list(reader_make_constant_shell(makeString("is-Underspecified")), makeSymbol("?X"), makeSymbol("?Y")), reader_make_constant_shell(makeString("InferencePSC")), list(reader_make_constant_shell(makeString("CarmelBird-Author")), reader_make_constant_shell(makeString("LarryBird")), reader_make_constant_shell(makeString("Bird")), reader_make_constant_shell(makeString("BirdWatching")))), list(reader_make_constant_shell(makeString("CarmelBird-Author")), reader_make_constant_shell(makeString("LarryBird")), reader_make_constant_shell(makeString("Bird")), reader_make_constant_shell(makeString("BirdWatching")))), list(list(makeSymbol("?X"), list(reader_make_constant_shell(makeString("cityInState")), makeSymbol("?X"), makeSymbol("?Y")), reader_make_constant_shell(makeString("InferencePSC")), list(reader_make_constant_shell(makeString("BillingsMustangs-BaseballTeam")), list(reader_make_constant_shell(makeString("CityNamedFn")), makeString("Billings"), reader_make_constant_shell(makeString("Montana-State"))))), list(list(reader_make_constant_shell(makeString("CityNamedFn")), makeString("Billings"), reader_make_constant_shell(makeString("Montana-State"))))));

    public static SubLObject filter_terms_by_constraining_collection(final SubLObject constraining_collection, final SubLObject mt, final SubLObject terms) {
        if ((NIL != hlmt.fort_or_chlmt_p(constraining_collection)) && (NIL != list_utilities.list_of_type_p(symbol_function(FORT_OR_CHLMT_P), terms))) {
            return isa.all_instances_among(constraining_collection, terms, mt, UNPROVIDED);
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != lexicon_accessors.denot_has_typeP(v_term, constraining_collection, mt)) {
                result = cons(v_term, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject filter_terms_for_arg_constraints_at_argpos(final SubLObject arg_position, final SubLObject formula, final SubLObject mt, final SubLObject possible_substitutions, SubLObject use_all_mentionsP) {
        if (use_all_mentionsP == UNPROVIDED) {
            use_all_mentionsP = T;
        }
        return filter_terms_for_arg_constraints(cycl_utilities.formula_arg_position(formula, arg_position, UNPROVIDED), formula, mt, possible_substitutions);
    }

    public static SubLObject filter_terms_for_arg_constraints(final SubLObject v_term, final SubLObject formula, final SubLObject mt, final SubLObject possible_substitutions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject filtered = NIL;
        SubLObject subst_requires_individualP = NIL;
        final SubLObject disjointness_check_mt = (NIL != subl_promotions.memberP(mt, $list3, UNPROVIDED, UNPROVIDED)) ? $$BaseKB : mt;
        thread.resetMultipleValues();
        final SubLObject isa_constraints = formula_term_arg_constraints(v_term, formula, mt);
        final SubLObject genls_constraints = thread.secondMultipleValue();
        final SubLObject quoted_isa_constraints = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        subst_requires_individualP = any_spec_ofP(isa_constraints, $$Individual, mt);
        SubLObject cdolist_list_var = possible_substitutions;
        SubLObject substitution = NIL;
        substitution = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != subst_requires_individualP) && (NIL != fort_types_interface.isa_collectionP(substitution, UNPROVIDED))) {
                filtered = cons(substitution, filtered);
            } else
                if (NIL != any_defns_rejectP(isa_constraints, substitution, mt)) {
                    filtered = cons(substitution, filtered);
                } else
                    if (NIL != disjoint_with.any_disjoint_with_anyP(genls_constraints, genls.min_genls(substitution, mt, UNPROVIDED), disjointness_check_mt, UNPROVIDED, UNPROVIDED)) {
                        filtered = cons(substitution, filtered);
                    } else
                        if ((NIL != any_spec_ofP(isa_constraints, $$Date, mt)) && (NIL == date_utilities.date_p(substitution))) {
                            filtered = cons(substitution, filtered);
                        } else
                            if ((NIL == isa.isa_allP(substitution, isa_constraints, mt)) && ((NIL != disjoint_with.any_disjoint_with_anyP(isa_constraints, constraint_filter_min_isa(substitution, mt), disjointness_check_mt, UNPROVIDED, UNPROVIDED)) || (NIL != any_not_isaP(isa_constraints, substitution, mt)))) {
                                filtered = cons(substitution, filtered);
                            } else
                                if (NIL != any_not_quoted_isaP(quoted_isa_constraints, substitution, mt)) {
                                    filtered = cons(substitution, filtered);
                                } else {
                                    result = cons(substitution, result);
                                }





            cdolist_list_var = cdolist_list_var.rest();
            substitution = cdolist_list_var.first();
        } 
        return values(nreverse(result), nreverse(filtered));
    }

    public static SubLObject constraint_filter_min_isa_internal(final SubLObject v_term, final SubLObject mt) {
        SubLObject result = isa.min_isa(v_term, mt, UNPROVIDED);
        if ((NIL == result) && v_term.isNumber()) {
            result = list($$Number_General);
        }
        return result;
    }

    public static SubLObject constraint_filter_min_isa(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return constraint_filter_min_isa_internal(v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CONSTRAINT_FILTER_MIN_ISA, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CONSTRAINT_FILTER_MIN_ISA, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CONSTRAINT_FILTER_MIN_ISA, caching_state);
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
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(constraint_filter_min_isa_internal(v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject any_not_isaP_internal(final SubLObject isa_constraints, final SubLObject v_term, final SubLObject mt) {
        SubLObject rejectP = NIL;
        if (NIL == rejectP) {
            SubLObject csome_list_var = isa_constraints;
            SubLObject isa_constraint = NIL;
            isa_constraint = csome_list_var.first();
            while ((NIL == rejectP) && (NIL != csome_list_var)) {
                if (NIL != isa.not_isaP(v_term, isa_constraint, mt, UNPROVIDED)) {
                    rejectP = T;
                }
                csome_list_var = csome_list_var.rest();
                isa_constraint = csome_list_var.first();
            } 
        }
        return rejectP;
    }

    public static SubLObject any_not_isaP(final SubLObject isa_constraints, final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_not_isaP_internal(isa_constraints, v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym9$ANY_NOT_ISA_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym9$ANY_NOT_ISA_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym9$ANY_NOT_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isa_constraints, v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_not_isaP_internal(isa_constraints, v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(isa_constraints, v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject any_not_quoted_isaP_internal(final SubLObject quoted_isa_constraints, final SubLObject v_term, final SubLObject mt) {
        SubLObject rejectP = NIL;
        if (NIL == rejectP) {
            SubLObject csome_list_var = quoted_isa_constraints;
            SubLObject quoted_isa_constraint = NIL;
            quoted_isa_constraint = csome_list_var.first();
            while ((NIL == rejectP) && (NIL != csome_list_var)) {
                if (NIL == at_defns.quiet_quoted_has_typeP(v_term, quoted_isa_constraint, mt)) {
                    rejectP = T;
                }
                csome_list_var = csome_list_var.rest();
                quoted_isa_constraint = csome_list_var.first();
            } 
        }
        return rejectP;
    }

    public static SubLObject any_not_quoted_isaP(final SubLObject quoted_isa_constraints, final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_not_quoted_isaP_internal(quoted_isa_constraints, v_term, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym10$ANY_NOT_QUOTED_ISA_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym10$ANY_NOT_QUOTED_ISA_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym10$ANY_NOT_QUOTED_ISA_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(quoted_isa_constraints, v_term, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (quoted_isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (v_term.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_not_quoted_isaP_internal(quoted_isa_constraints, v_term, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(quoted_isa_constraints, v_term, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject any_defns_rejectP_internal(final SubLObject isa_constraints, final SubLObject substitution, final SubLObject mt) {
        SubLObject rejectP = NIL;
        if (NIL == rejectP) {
            SubLObject csome_list_var;
            SubLObject isa_constraint;
            for (csome_list_var = isa_constraints, isa_constraint = NIL, isa_constraint = csome_list_var.first(); (NIL == rejectP) && (NIL != csome_list_var); rejectP = at_defns.defns_rejectP(isa_constraint, substitution, mt) , csome_list_var = csome_list_var.rest() , isa_constraint = csome_list_var.first()) {
            }
        }
        return rejectP;
    }

    public static SubLObject any_defns_rejectP(final SubLObject isa_constraints, final SubLObject substitution, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_defns_rejectP_internal(isa_constraints, substitution, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym11$ANY_DEFNS_REJECT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym11$ANY_DEFNS_REJECT_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym11$ANY_DEFNS_REJECT_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(isa_constraints, substitution, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (isa_constraints.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (substitution.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_defns_rejectP_internal(isa_constraints, substitution, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(isa_constraints, substitution, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject any_spec_ofP_internal(final SubLObject terms, final SubLObject genl, final SubLObject mt) {
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = terms;
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (NIL != genls.genlsP(v_term, genl, mt, UNPROVIDED)) {
                    result = T;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject any_spec_ofP(final SubLObject terms, final SubLObject genl, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return any_spec_ofP_internal(terms, genl, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym12$ANY_SPEC_OF_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym12$ANY_SPEC_OF_, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym12$ANY_SPEC_OF_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(terms, genl, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (terms.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (genl.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(any_spec_ofP_internal(terms, genl, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(terms, genl, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject formula_term_arg_constraints_internal(final SubLObject v_term, final SubLObject formula, final SubLObject mt) {
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(formula, UNPROVIDED);
        final SubLObject var_formula = cycl_utilities.expression_subst(var, v_term, formula, EQUALP, UNPROVIDED);
        final SubLObject constraint_dict = at_var_types.formula_variables_arg_constraints_dict(var_formula, mt, UNPROVIDED, UNPROVIDED);
        final SubLObject constraints = dictionary.dictionary_lookup(constraint_dict, var, UNPROVIDED);
        if (NIL != constraints) {
            SubLObject current;
            final SubLObject datum = current = constraints;
            SubLObject isa_constraints = NIL;
            SubLObject genls_constraints = NIL;
            SubLObject quoted_isa_constraints = NIL;
            destructuring_bind_must_consp(current, datum, $list14);
            isa_constraints = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list14);
            genls_constraints = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list14);
            quoted_isa_constraints = current.first();
            current = current.rest();
            if (NIL == current) {
                return values(remove_if($sym15$QUOTED_COLLECTION_, isa_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), remove_if($sym15$QUOTED_COLLECTION_, genls_constraints, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), quoted_isa_constraints);
            }
            cdestructuring_bind_error(datum, $list14);
        }
        return values(NIL, NIL);
    }

    public static SubLObject formula_term_arg_constraints(final SubLObject v_term, final SubLObject formula, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return formula_term_arg_constraints_internal(v_term, formula, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, FORMULA_TERM_ARG_CONSTRAINTS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), FORMULA_TERM_ARG_CONSTRAINTS, THREE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, FORMULA_TERM_ARG_CONSTRAINTS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(v_term, formula, mt);
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
                    if (formula.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(formula_term_arg_constraints_internal(v_term, formula, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, formula, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject declare_constraint_filters_file() {
        declareFunction(me, "filter_terms_by_constraining_collection", "FILTER-TERMS-BY-CONSTRAINING-COLLECTION", 3, 0, false);
        declareFunction(me, "filter_terms_for_arg_constraints_at_argpos", "FILTER-TERMS-FOR-ARG-CONSTRAINTS-AT-ARGPOS", 4, 1, false);
        declareFunction(me, "filter_terms_for_arg_constraints", "FILTER-TERMS-FOR-ARG-CONSTRAINTS", 4, 0, false);
        declareFunction(me, "constraint_filter_min_isa_internal", "CONSTRAINT-FILTER-MIN-ISA-INTERNAL", 2, 0, false);
        declareFunction(me, "constraint_filter_min_isa", "CONSTRAINT-FILTER-MIN-ISA", 2, 0, false);
        declareFunction(me, "any_not_isaP_internal", "ANY-NOT-ISA?-INTERNAL", 3, 0, false);
        declareFunction(me, "any_not_isaP", "ANY-NOT-ISA?", 3, 0, false);
        declareFunction(me, "any_not_quoted_isaP_internal", "ANY-NOT-QUOTED-ISA?-INTERNAL", 3, 0, false);
        declareFunction(me, "any_not_quoted_isaP", "ANY-NOT-QUOTED-ISA?", 3, 0, false);
        declareFunction(me, "any_defns_rejectP_internal", "ANY-DEFNS-REJECT?-INTERNAL", 3, 0, false);
        declareFunction(me, "any_defns_rejectP", "ANY-DEFNS-REJECT?", 3, 0, false);
        declareFunction(me, "any_spec_ofP_internal", "ANY-SPEC-OF?-INTERNAL", 3, 0, false);
        declareFunction(me, "any_spec_ofP", "ANY-SPEC-OF?", 3, 0, false);
        declareFunction(me, "formula_term_arg_constraints_internal", "FORMULA-TERM-ARG-CONSTRAINTS-INTERNAL", 3, 0, false);
        declareFunction(me, "formula_term_arg_constraints", "FORMULA-TERM-ARG-CONSTRAINTS", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_constraint_filters_file() {
        return NIL;
    }

    public static SubLObject setup_constraint_filters_file() {
        register_external_symbol(FILTER_TERMS_FOR_ARG_CONSTRAINTS_AT_ARGPOS);
        register_external_symbol(FILTER_TERMS_FOR_ARG_CONSTRAINTS);
        memoization_state.note_memoized_function(CONSTRAINT_FILTER_MIN_ISA);
        memoization_state.note_memoized_function($sym9$ANY_NOT_ISA_);
        memoization_state.note_memoized_function($sym10$ANY_NOT_QUOTED_ISA_);
        memoization_state.note_memoized_function($sym11$ANY_DEFNS_REJECT_);
        memoization_state.note_memoized_function($sym12$ANY_SPEC_OF_);
        memoization_state.note_memoized_function(FORMULA_TERM_ARG_CONSTRAINTS);
        define_test_case_table_int(CONSTRAINED_CYCL_FILTER, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list23);
        define_test_case_table_int(FILTER_TERMS_FOR_ARG_CONSTRAINTS, list(new SubLObject[]{ $TEST, SETS_EQUALP, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list25);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_constraint_filters_file();
    }

    @Override
    public void initializeVariables() {
        init_constraint_filters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_constraint_filters_file();
    }

    
}

/**
 * Total time: 299 ms
 */
