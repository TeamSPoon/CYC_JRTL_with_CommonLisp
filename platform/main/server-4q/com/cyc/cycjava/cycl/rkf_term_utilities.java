package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$rkf_mt$;
import static com.cyc.cycjava.cycl.el_utilities.make_ternary_formula;
import static com.cyc.cycjava.cycl.el_utilities.specs_fn_arg;
import static com.cyc.cycjava.cycl.el_utilities.specs_fn_naut_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.digit_char_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.constantp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.ArrayList;

import com.cyc.cycjava.cycl.inference.harness.prove;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class rkf_term_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new rkf_term_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.rkf_term_utilities";

    public static final String myFingerPrint = "d1087eea3a94dbdd3f449d049e426e0e05402951ac33d83e391a9f663fb2546f";





    // defparameter
    private static final SubLSymbol $rkf_terms_created_accumulator$ = makeSymbol("*RKF-TERMS-CREATED-ACCUMULATOR*");

    // Internal Constants
    public static final SubLString $str0$RKF_ = makeString("RKF-");

    public static final SubLString $str1$ = makeString("");

    public static final SubLList $list2 = list(list(makeSymbol("PREFIX")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $rkf_name_prefix$ = makeSymbol("*RKF-NAME-PREFIX*");

    public static final SubLList $list5 = list(list(makeSymbol("SUFFIX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $rkf_name_suffix$ = makeSymbol("*RKF-NAME-SUFFIX*");

    public static final SubLSymbol CREATE_NEW_CONSTANT = makeSymbol("CREATE-NEW-CONSTANT");







    public static final SubLString $$$Number = makeString("Number");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));





    private static final SubLObject $$termDependsOn = reader_make_constant_shell(makeString("termDependsOn"));

    private static final SubLString $str17$Couldn_t_create_new_instance_of__ = makeString("Couldn't create new instance of ~S. Got ~S");

    private static final SubLList $list18 = list(reader_make_constant_shell(makeString("Collection")));

    private static final SubLString $str19$constantNameAutoGeneratedFromColl = makeString("constantNameAutoGeneratedFromCollection");

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLList $list21 = list(reader_make_constant_shell(makeString("nonPlural-Generic")));

    private static final SubLString $$$Scenario = makeString("Scenario");



    private static final SubLString $str24$_instance = makeString("-instance");

    private static final SubLSymbol RKF_INSTANTIATE_REFERENCE_P = makeSymbol("RKF-INSTANTIATE-REFERENCE-P");

    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));



    private static final SubLSymbol RKF_TERMS_CREATED_HARVESTER = makeSymbol("RKF-TERMS-CREATED-HARVESTER");

    private static final SubLSymbol RKF_TERMS_CREATED_IN_TEMPORAL_ORDER = makeSymbol("RKF-TERMS-CREATED-IN-TEMPORAL-ORDER");

    private static final SubLObject $$IntermediateVocabTerm = reader_make_constant_shell(makeString("IntermediateVocabTerm"));

    public static SubLObject with_rkf_name_prefix(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prefix = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        prefix = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($rkf_name_prefix$, prefix)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static SubLObject with_rkf_name_suffix(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject suffix = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        suffix = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($rkf_name_suffix$, suffix)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static SubLObject create_new_constant(SubLObject name, final SubLObject isas, final SubLObject v_genls, SubLObject elmt, SubLObject prefix, SubLObject html_state, SubLObject initial_case, SubLObject nowP, SubLObject assume_wffP) {
        if (prefix == UNPROVIDED) {
            prefix = $str1$;
        }
        if (html_state == UNPROVIDED) {
            html_state = NIL;
        }
        if (initial_case == UNPROVIDED) {
            initial_case = T;
        }
        if (nowP == UNPROVIDED) {
            nowP = NIL;
        }
        if (assume_wffP == UNPROVIDED) {
            assume_wffP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
        assert NIL != listp(isas) : "Types.listp(isas) " + "CommonSymbols.NIL != Types.listp(isas) " + isas;
        assert NIL != listp(v_genls) : "Types.listp(v_genls) " + "CommonSymbols.NIL != Types.listp(v_genls) " + v_genls;
        assert NIL != hlmt.possibly_mt_p(elmt) : "hlmt.possibly_mt_p(elmt) " + "CommonSymbols.NIL != hlmt.possibly_mt_p(elmt) " + elmt;
        if (NIL != digit_char_p(string_utilities.first_char(name), UNPROVIDED)) {
            name = cconcatenate($$$Number, name);
        }
        elmt = hlmt_czer.coerce_to_hlmt(elmt);
        SubLObject constant = NIL;
        final SubLObject _prev_bind_0 = $rkf_name_prefix$.currentBinding(thread);
        try {
            $rkf_name_prefix$.bind(prefix, thread);
            constant = rkf_create(name, NIL, NIL, NIL, initial_case);
        } finally {
            $rkf_name_prefix$.rebind(_prev_bind_0, thread);
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
                if (NIL != constantp(constant, UNPROVIDED)) {
                    cb_tools.cb_add_to_constant_history(constant);
                } else {
                    cb_tools.cb_add_to_nat_history(constant);
                }
                html_kernel.snapshot_html_state(state_var);
            } finally {
                rebind_dynamic_vars(cprogv_var, old_values);
            }
        }
        SubLObject cdolist_list_var = isas;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_assert(list($$isa, constant, v_isa), elmt, nowP, assume_wffP);
            api_widgets.recheck_collection_instances_cooccurence_cache(v_isa, elmt);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        cdolist_list_var = v_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rkf_assertion_utilities.rkf_assert(list($$genls, constant, genl), elmt, nowP, assume_wffP);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        return constant;
    }

    public static SubLObject rkf_create(final SubLObject preferred_phrase, SubLObject dependent_mt, SubLObject prefix, SubLObject suffix, SubLObject initial_case) {
        if (dependent_mt == UNPROVIDED) {
            dependent_mt = NIL;
        }
        if (prefix == UNPROVIDED) {
            prefix = NIL;
        }
        if (suffix == UNPROVIDED) {
            suffix = NIL;
        }
        if (initial_case == UNPROVIDED) {
            initial_case = $UPCASE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(preferred_phrase) : "Types.stringp(preferred_phrase) " + "CommonSymbols.NIL != Types.stringp(preferred_phrase) " + preferred_phrase;
        final SubLObject name = rkf_suggest_constant_name(preferred_phrase, prefix, suffix, initial_case);
        SubLObject new_term = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            new_term = ke.ke_create(name);
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != new_term) {
            rkf_event_dispatcher.rkf_post_create_term_event(new_term, UNPROVIDED);
            if (NIL != dependent_mt) {
                rkf_mark_term_as_contextual(new_term, dependent_mt);
            }
        }
        return new_term;
    }

    public static SubLObject rkf_mark_term_as_contextual(final SubLObject v_term, final SubLObject dependent_mt) {
        assert NIL != hlmt.hlmt_p(dependent_mt) : "hlmt.hlmt_p(dependent_mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(dependent_mt) " + dependent_mt;
        rkf_assertion_utilities.rkf_assert(list($$termDependsOn, v_term, dependent_mt), dependent_mt, UNPROVIDED, UNPROVIDED);
        return v_term;
    }

    public static SubLObject rkf_find_or_create(final SubLObject preferred_phrase, SubLObject dependent_mt, SubLObject prefix, SubLObject suffix) {
        if (dependent_mt == UNPROVIDED) {
            dependent_mt = NIL;
        }
        if (prefix == UNPROVIDED) {
            prefix = NIL;
        }
        if (suffix == UNPROVIDED) {
            suffix = NIL;
        }
        assert NIL != stringp(preferred_phrase) : "Types.stringp(preferred_phrase) " + "CommonSymbols.NIL != Types.stringp(preferred_phrase) " + preferred_phrase;
        final SubLObject potential_term = fi.fi_find_int(cconcatenate($str0$RKF_, preferred_phrase));
        if (NIL != potential_term) {
            return potential_term;
        }
        return rkf_create(preferred_phrase, dependent_mt, prefix, suffix, UNPROVIDED);
    }

    public static SubLObject rkf_re_create(final SubLObject preferred_phrase, final SubLObject external_id, SubLObject dependent_mt) {
        if (dependent_mt == UNPROVIDED) {
            dependent_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(preferred_phrase) : "Types.stringp(preferred_phrase) " + "CommonSymbols.NIL != Types.stringp(preferred_phrase) " + preferred_phrase;
        final SubLObject name = rkf_suggest_constant_name(preferred_phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_term = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            new_term = ke.ke_create_from_serialization(name, external_id);
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != new_term) {
            rkf_event_dispatcher.rkf_post_create_term_event(new_term, UNPROVIDED);
            if (NIL != dependent_mt) {
                rkf_mark_term_as_contextual(new_term, dependent_mt);
            }
        }
        return new_term;
    }

    public static SubLObject rkf_create_instance_now(final SubLObject collection, SubLObject isa_mt) {
        if (isa_mt == UNPROVIDED) {
            isa_mt = mt_vars.$default_assert_mt$.getGlobalValue();
        }
        final SubLObject name = rkf_new_constant_name_from_collection(collection);
        final SubLObject constant = ke.ke_create_now(name, UNPROVIDED);
        if (NIL == valid_constantP(constant, UNPROVIDED)) {
            Errors.error($str17$Couldn_t_create_new_instance_of__, collection, constant);
        }
        if (NIL != specs_fn_naut_p(collection)) {
            rkf_assertion_utilities.rkf_assert_now(listS($$isa, constant, $list18), isa_mt);
            rkf_assertion_utilities.rkf_assert_now(list($$genls, constant, specs_fn_arg(collection)), isa_mt);
        } else {
            rkf_assertion_utilities.rkf_assert_now(list($$isa, constant, collection), isa_mt);
        }
        final SubLObject pred = constants_high.find_constant($str19$constantNameAutoGeneratedFromColl);
        if (NIL != pred) {
            rkf_assertion_utilities.rkf_assert_now(make_ternary_formula(pred, constant, collection, name), $$BaseKB);
        }
        return constant;
    }

    public static SubLObject rkf_new_constant_name_from_collection(final SubLObject collection) {
        final SubLObject initial_name = string_utilities.make_valid_constant_name(pph_main.generate_phrase(collection, $list21, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
        final SubLObject name = constant_completion_high.uniquify_constant_name(initial_name, UNPROVIDED);
        return name;
    }

    public static SubLObject rkf_scenario_create(SubLObject string) {
        if (string == UNPROVIDED) {
            string = $$$Scenario;
        }
        return rkf_create(string, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_suggest_constant_name(final SubLObject string, SubLObject prefix_param, SubLObject suffix_param, SubLObject initial_case) {
        if (prefix_param == UNPROVIDED) {
            prefix_param = NIL;
        }
        if (suffix_param == UNPROVIDED) {
            suffix_param = NIL;
        }
        if (initial_case == UNPROVIDED) {
            initial_case = $UPCASE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject prefix = (NIL != prefix_param) ? prefix_param : $rkf_name_prefix$.getDynamicValue(thread);
        final SubLObject suffix = (NIL != suffix_param) ? suffix_param : $rkf_name_suffix$.getDynamicValue(thread);
        return constants_high.suggest_constant_name(string, prefix, suffix, initial_case, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_kill(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            rkf_event_dispatcher.rkf_post_kill_term_event(fort, UNPROVIDED);
            ans = ke.ke_kill(fort);
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rkf_kill_now(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            rkf_event_dispatcher.rkf_post_kill_term_event(fort, UNPROVIDED);
            ans = ke.ke_kill_now(fort);
        } finally {
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rkf_instantiate(final SubLObject collection, SubLObject interaction_mt) {
        if (interaction_mt == UNPROVIDED) {
            interaction_mt = $rkf_mt$.getDynamicValue();
        }
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        final SubLObject name = rkf_suggest_instance_name(collection);
        final SubLObject v_term = rkf_create(name, interaction_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        rkf_assertion_utilities.rkf_assert(list($$isa, v_term, collection), interaction_mt, UNPROVIDED, UNPROVIDED);
        return v_term;
    }

    public static SubLObject rkf_suggest_instance_name(final SubLObject collection) {
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        return constant_completion_high.uniquify_constant_name(cconcatenate(prove.suggest_string_from_fort_el_formula(collection), $str24$_instance), UNPROVIDED);
    }

    public static SubLObject rkf_gather_instantiate_references(final SubLObject formula) {
        return list_utilities.tree_gather(formula, symbol_function(RKF_INSTANTIATE_REFERENCE_P), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rkf_instantiate_reference_p(final SubLObject obj) {
        return makeBoolean((((NIL != list_utilities.proper_list_p(obj)) && TWO_INTEGER.numE(length(obj))) && $$SomeFn.eql(obj.first())) && (NIL != forts.fort_p(second(obj))));
    }

    public static SubLObject rkf_subst_instantiate_reference(final SubLObject v_term, final SubLObject instantiate, final SubLObject formula) {
        return subst(v_term, instantiate, formula, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject rkf_term_defined_in_mtP(final SubLObject v_term, final SubLObject mt) {
        return list_utilities.sublisp_boolean(backward.removal_ask(list($$termDependsOn, v_term, mt), mt, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject rkf_terms_created_in_interaction_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject terms = NIL;
        final SubLObject _prev_bind_0 = $rkf_terms_created_accumulator$.currentBinding(thread);
        try {
            $rkf_terms_created_accumulator$.bind(NIL, thread);
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                kb_mapping.map_mt_contents(RKF_TERMS_CREATED_HARVESTER, mt, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
            }
            terms = $rkf_terms_created_accumulator$.getDynamicValue(thread);
        } finally {
            $rkf_terms_created_accumulator$.rebind(_prev_bind_0, thread);
        }
        return Sort.sort(terms, RKF_TERMS_CREATED_IN_TEMPORAL_ORDER, UNPROVIDED);
    }

    public static SubLObject rkf_terms_created_harvester(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject predicate = assertions_high.gaf_arg0(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (((NIL != forts.fort_p(predicate)) && (NIL != genl_predicates.genl_predP(predicate, $$termDependsOn, mt, UNPROVIDED))) && mt.eql(assertions_high.gaf_arg2(assertion))) {
                final SubLObject item_var;
                final SubLObject v_term = item_var = assertions_high.gaf_arg1(assertion);
                if (NIL == member(item_var, $rkf_terms_created_accumulator$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $rkf_terms_created_accumulator$.setDynamicValue(cons(item_var, $rkf_terms_created_accumulator$.getDynamicValue(thread)), thread);
                }
            }
        }
        return assertion;
    }

    public static SubLObject rkf_terms_created_in_temporal_order(final SubLObject term_a, final SubLObject term_b) {
        final SubLObject time_a = bookkeeping_store.creation_time(term_a, UNPROVIDED);
        final SubLObject second_a = bookkeeping_store.creation_second(term_a, UNPROVIDED);
        final SubLObject time_b = bookkeeping_store.creation_time(term_b, UNPROVIDED);
        final SubLObject second_b = bookkeeping_store.creation_second(term_b, UNPROVIDED);
        if (NIL != list_utilities.safe_L(time_a, time_b)) {
            return T;
        }
        if (NIL != list_utilities.safe_G(time_a, time_b)) {
            return NIL;
        }
        if (NIL != list_utilities.safe_L(second_a, second_b)) {
            return T;
        }
        if (NIL != list_utilities.safe_G(second_a, second_b)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject intermediate_vocab_termP(final SubLObject v_term) {
        return NIL != forts.fort_p(v_term) ? isa.isa_in_any_mtP(v_term, $$IntermediateVocabTerm) : NIL;
    }

    public static SubLObject declare_rkf_term_utilities_file() {
        declareMacro(me, "with_rkf_name_prefix", "WITH-RKF-NAME-PREFIX");
        declareMacro(me, "with_rkf_name_suffix", "WITH-RKF-NAME-SUFFIX");
        declareFunction(me, "create_new_constant", "CREATE-NEW-CONSTANT", 4, 5, false);
        declareFunction(me, "rkf_create", "RKF-CREATE", 1, 4, false);
        declareFunction(me, "rkf_mark_term_as_contextual", "RKF-MARK-TERM-AS-CONTEXTUAL", 2, 0, false);
        declareFunction(me, "rkf_find_or_create", "RKF-FIND-OR-CREATE", 1, 3, false);
        declareFunction(me, "rkf_re_create", "RKF-RE-CREATE", 2, 1, false);
        declareFunction(me, "rkf_create_instance_now", "RKF-CREATE-INSTANCE-NOW", 1, 1, false);
        declareFunction(me, "rkf_new_constant_name_from_collection", "RKF-NEW-CONSTANT-NAME-FROM-COLLECTION", 1, 0, false);
        declareFunction(me, "rkf_scenario_create", "RKF-SCENARIO-CREATE", 0, 1, false);
        declareFunction(me, "rkf_suggest_constant_name", "RKF-SUGGEST-CONSTANT-NAME", 1, 3, false);
        declareFunction(me, "rkf_kill", "RKF-KILL", 1, 0, false);
        declareFunction(me, "rkf_kill_now", "RKF-KILL-NOW", 1, 0, false);
        declareFunction(me, "rkf_instantiate", "RKF-INSTANTIATE", 1, 1, false);
        declareFunction(me, "rkf_suggest_instance_name", "RKF-SUGGEST-INSTANCE-NAME", 1, 0, false);
        declareFunction(me, "rkf_gather_instantiate_references", "RKF-GATHER-INSTANTIATE-REFERENCES", 1, 0, false);
        declareFunction(me, "rkf_instantiate_reference_p", "RKF-INSTANTIATE-REFERENCE-P", 1, 0, false);
        declareFunction(me, "rkf_subst_instantiate_reference", "RKF-SUBST-INSTANTIATE-REFERENCE", 3, 0, false);
        declareFunction(me, "rkf_term_defined_in_mtP", "RKF-TERM-DEFINED-IN-MT?", 2, 0, false);
        declareFunction(me, "rkf_terms_created_in_interaction_mt", "RKF-TERMS-CREATED-IN-INTERACTION-MT", 1, 0, false);
        declareFunction(me, "rkf_terms_created_harvester", "RKF-TERMS-CREATED-HARVESTER", 1, 0, false);
        declareFunction(me, "rkf_terms_created_in_temporal_order", "RKF-TERMS-CREATED-IN-TEMPORAL-ORDER", 2, 0, false);
        declareFunction(me, "intermediate_vocab_termP", "INTERMEDIATE-VOCAB-TERM?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_rkf_term_utilities_file() {
        defparameter("*RKF-NAME-PREFIX*", $str0$RKF_);
        defparameter("*RKF-NAME-SUFFIX*", $str1$);
        defparameter("*RKF-TERMS-CREATED-ACCUMULATOR*", NIL);
        return NIL;
    }

    public static SubLObject setup_rkf_term_utilities_file() {
        register_external_symbol(CREATE_NEW_CONSTANT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rkf_term_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_rkf_term_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rkf_term_utilities_file();
    }

    
}

/**
 * Total time: 114 ms
 */
