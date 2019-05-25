package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_abduction;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.negation_predicate;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_trampolines
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.inference_trampolines";
  public static final String myFingerPrint = "fc715d1b5f0d1e4297a83a1b426a3c7c43377855f54cd834050897f6fe1952e4";
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378L)
  private static SubLSymbol $indeterminate_term_p_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9901L)
  private static SubLSymbol $some_max_floor_mtsP_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10468L)
  private static SubLSymbol $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11102L)
  public static SubLSymbol $block_inference_excepted_assertion_in_inference_index_lookupP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11285L)
  public static SubLSymbol $disable_inference_excepted_assertion_supportP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21541L)
  public static SubLSymbol $recursive_query_override_properties$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 23619L)
  private static SubLSymbol $inference_true_sentence_recursion_stack$;
  private static final SubLObject $const0$Collection;
  private static final SubLSymbol $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P;
  private static final SubLSymbol $sym2$INDETERMINATE_TERM_P;
  private static final SubLObject $const3$IndeterminateTerm;
  private static final SubLSymbol $sym4$_INDETERMINATE_TERM_P_CACHING_STATE_;
  private static final SubLSymbol $sym5$CLEAR_INDETERMINATE_TERM_P;
  private static final SubLSymbol $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_;
  private static final SubLSymbol $sym7$INFERENCE_ALL_GENL_PREDICATES;
  private static final SubLSymbol $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT;
  private static final SubLSymbol $sym9$INFERENCE_ALL_GENL_INVERSES;
  private static final SubLSymbol $sym10$INFERENCE_ALL_SPEC_INVERSES_INT;
  private static final SubLSymbol $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX;
  private static final SubLSymbol $kw12$DEPTH;
  private static final SubLSymbol $kw13$STACK;
  private static final SubLSymbol $kw14$QUEUE;
  private static final SubLSymbol $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw16$ERROR;
  private static final SubLString $str17$_A_is_not_a__A;
  private static final SubLSymbol $sym18$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw19$CERROR;
  private static final SubLString $str20$continue_anyway;
  private static final SubLSymbol $kw21$WARN;
  private static final SubLString $str22$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const23$genlPreds;
  private static final SubLString $str24$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str25$attempting_to_bind_direction_link;
  private static final SubLString $str26$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT;
  private static final SubLSymbol $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX;
  private static final SubLObject $const29$genlInverse;
  private static final SubLSymbol $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT;
  private static final SubLSymbol $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX;
  private static final SubLSymbol $sym32$HLMT_EQUAL;
  private static final SubLSymbol $sym33$SOME_MAX_FLOOR_MTS__CACHED;
  private static final SubLSymbol $sym34$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_;
  private static final SubLInteger $int35$256;
  private static final SubLSymbol $sym36$CLEAR_SOME_MAX_FLOOR_MTS__CACHED;
  private static final SubLSymbol $sym37$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED;
  private static final SubLSymbol $sym38$_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym39$CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED;
  private static final SubLSymbol $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT;
  private static final SubLSymbol $sym41$INFERENCE_APPLICABLE_SDCT_;
  private static final SubLSymbol $sym42$ASSERTION_P;
  private static final SubLSymbol $sym43$INFERENCE_EXCEPTED_ASSERTION__SHALLOW;
  private static final SubLSymbol $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_;
  private static final SubLInteger $int45$2048;
  private static final SubLSymbol $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW;
  private static final SubLList $list47;
  private static final SubLList $list48;
  private static final SubLSymbol $kw49$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw50$DONE;
  private static final SubLSymbol $sym51$DO_INFERENCE_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $sym52$DO_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $sym53$INFERENCE_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $kw54$TRUTH;
  private static final SubLSymbol $sym55$SENSE_TRUTH;
  private static final SubLSymbol $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX;
  private static final SubLSymbol $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM;
  private static final SubLSymbol $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX;
  private static final SubLSymbol $sym60$INFERENCE_KEY_GAF_ARG_INDEX;
  private static final SubLSymbol $sym61$PROBLEM_P;
  private static final SubLList $list62;
  private static final SubLObject $const63$isa;
  private static final SubLObject $const64$genls;
  private static final SubLSymbol $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_;
  private static final SubLSymbol $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_;
  private static final SubLSymbol $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_;
  private static final SubLSymbol $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_;
  private static final SubLSymbol $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_;
  private static final SubLSymbol $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_;
  private static final SubLSymbol $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_;
  private static final SubLSymbol $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_;
  private static final SubLObject $const73$highlyRelevantMt;
  private static final SubLSymbol $kw74$TRUE;
  private static final SubLObject $const75$highlyRelevantAssertion;
  private static final SubLObject $const76$highlyRelevantPredAssertion;
  private static final SubLObject $const77$highlyRelevantTerm;
  private static final SubLObject $const78$irrelevantMt;
  private static final SubLObject $const79$irrelevantAssertion;
  private static final SubLObject $const80$irrelevantPredAssertion;
  private static final SubLObject $const81$irrelevantTerm;
  private static final SubLObject $const82$assertionUtility;
  private static final SubLSymbol $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY;
  private static final SubLSymbol $kw84$ALLOWED_MODULES;
  private static final SubLSymbol $kw85$FALSE;
  private static final SubLSymbol $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY;
  private static final SubLSymbol $kw87$MAX_NUMBER;
  private static final SubLSymbol $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED;
  private static final SubLObject $const91$InferencePSC;
  private static final SubLSymbol $kw92$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw93$MIN_RULE_UTILITY;
  private static final SubLInteger $int94$_100;
  private static final SubLObject $const95$TheSetOf;
  private static final SubLSymbol $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS;

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1010L)
  public static SubLObject inference_atomic_term_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != cycl_grammar.subl_strict_atomic_term_p( v_object ) || NIL != constant_handles.constant_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1251L)
  public static SubLObject inference_collectionP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( ( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.collectionP( v_object ) ) || ( NIL != el_utilities.possibly_naut_p( v_object ) && NIL != isa.isaP( v_object, $const0$Collection,
        mt, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1492L)
  public static SubLObject inference_predicate_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != fort_types_interface.predicateP( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1600L)
  public static SubLObject inference_commutative_relationP(final SubLObject relation)
  {
    return fort_types_interface.commutative_relation_p( relation );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 1888L)
  public static SubLObject inference_symmetric_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.symmetric_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2000L)
  public static SubLObject inference_commutative_predicate_p(final SubLObject predicate)
  {
    return fort_types_interface.commutative_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2110L)
  public static SubLObject inference_partially_commutative_predicate_p_internal(final SubLObject predicate)
  {
    return fort_types_interface.partially_commutative_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2110L)
  public static SubLObject inference_partially_commutative_predicate_p(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_partially_commutative_predicate_p_internal( predicate );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_partially_commutative_predicate_p_internal( predicate ) ) );
      memoization_state.caching_state_put( caching_state, predicate, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2283L)
  public static SubLObject inference_at_least_partially_commutative_predicate_p(final SubLObject predicate)
  {
    return makeBoolean( NIL != inference_commutative_predicate_p( predicate ) || NIL != inference_partially_commutative_predicate_p( predicate ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2489L)
  public static SubLObject inference_asymmetric_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.asymmetric_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2604L)
  public static SubLObject inference_transitive_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.transitive_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2719L)
  public static SubLObject inference_evaluatable_predicateP(final SubLObject predicate)
  {
    return relation_evaluation.evaluatable_predicateP( predicate, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2827L)
  public static SubLObject inference_reflexive_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.reflexive_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 2939L)
  public static SubLObject inference_irreflexive_predicateP(final SubLObject predicate)
  {
    return fort_types_interface.irreflexive_binary_predicate_p( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3055L)
  public static SubLObject inference_indeterminate_termP(final SubLObject value)
  {
    if( NIL != forts.fort_p( value ) )
    {
      return indeterminate_term_p( value );
    }
    if( NIL != el_utilities.possibly_naut_p( value ) )
    {
      return makeBoolean( NIL != kb_accessors.common_non_skolem_indeterminate_term_denoting_functionP( cycl_utilities.formula_operator( value ) ) || NIL != memoized_inference_indeterminate_termP( value ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378L)
  public static SubLObject clear_indeterminate_term_p()
  {
    final SubLObject cs = $indeterminate_term_p_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378L)
  public static SubLObject remove_indeterminate_term_p(final SubLObject fort)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $indeterminate_term_p_caching_state$.getGlobalValue(), ConsesLow.list( fort ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378L)
  public static SubLObject indeterminate_term_p_internal(final SubLObject fort)
  {
    return isa.quoted_isa_in_any_mtP( fort, $const3$IndeterminateTerm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3378L)
  public static SubLObject indeterminate_term_p(final SubLObject fort)
  {
    SubLObject caching_state = $indeterminate_term_p_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym2$INDETERMINATE_TERM_P, $sym4$_INDETERMINATE_TERM_P_CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym5$CLEAR_INDETERMINATE_TERM_P );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( indeterminate_term_p_internal( fort ) ) );
      memoization_state.caching_state_put( caching_state, fort, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3639L)
  public static SubLObject memoized_inference_indeterminate_termP_internal(final SubLObject value)
  {
    return isa.quoted_isa_in_any_mtP( value, $const3$IndeterminateTerm );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3639L)
  public static SubLObject memoized_inference_indeterminate_termP(final SubLObject value)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_inference_indeterminate_termP_internal( value );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, value, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_inference_indeterminate_termP_internal( value ) ) );
      memoization_state.caching_state_put( caching_state, value, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 3833L)
  public static SubLObject inference_some_genl_pred_or_inverseP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    try
    {
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      ans = genl_predicates.some_genl_pred_or_inverseP( pred, NIL, UNPROVIDED );
    }
    finally
    {
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4226L)
  public static SubLObject inference_some_spec_pred_or_inverseP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == genl_predicates.some_spec_predicate_or_inverse_somewhereP( pred ) )
    {
      return NIL;
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    try
    {
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      ans = genl_predicates.some_spec_pred_or_inverseP( pred, NIL, UNPROVIDED );
    }
    finally
    {
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4497L)
  public static SubLObject inference_some_negation_pred_or_inverseP(final SubLObject pred)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
    try
    {
      system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
      ans = negation_predicate.some_negation_pred_or_inverseP( pred, NIL, UNPROVIDED );
    }
    finally
    {
      system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4701L)
  public static SubLObject inference_all_genl_predicates_internal(final SubLObject predicate)
  {
    return genl_predicates.all_genl_predicates( predicate, NIL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4701L)
  public static SubLObject inference_all_genl_predicates(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_genl_predicates_internal( predicate );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym7$INFERENCE_ALL_GENL_PREDICATES, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym7$INFERENCE_ALL_GENL_PREDICATES, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym7$INFERENCE_ALL_GENL_PREDICATES, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_genl_predicates_internal( predicate ) ) );
      memoization_state.caching_state_put( caching_state, predicate, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 4822L)
  public static SubLObject inference_all_spec_predicates(final SubLObject predicate)
  {
    if( NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP( predicate ) )
    {
      return inference_all_spec_predicates_int( predicate );
    }
    return ConsesLow.list( predicate );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5035L)
  public static SubLObject inference_all_spec_predicates_int_internal(final SubLObject predicate)
  {
    return genl_predicates.all_spec_predicates( predicate, NIL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5035L)
  public static SubLObject inference_all_spec_predicates_int(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_spec_predicates_int_internal( predicate );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_spec_predicates_int_internal( predicate ) ) );
      memoization_state.caching_state_put( caching_state, predicate, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5178L)
  public static SubLObject inference_all_genl_inverses_internal(final SubLObject predicate)
  {
    return genl_predicates.all_genl_inverses( predicate, NIL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5178L)
  public static SubLObject inference_all_genl_inverses(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_genl_inverses_internal( predicate );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym9$INFERENCE_ALL_GENL_INVERSES, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym9$INFERENCE_ALL_GENL_INVERSES, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym9$INFERENCE_ALL_GENL_INVERSES, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_genl_inverses_internal( predicate ) ) );
      memoization_state.caching_state_put( caching_state, predicate, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5295L)
  public static SubLObject inference_all_spec_inverses(final SubLObject predicate)
  {
    if( NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP( predicate ) )
    {
      return inference_all_spec_inverses_int( predicate );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5491L)
  public static SubLObject inference_all_spec_inverses_int_internal(final SubLObject predicate)
  {
    return genl_predicates.all_spec_inverses( predicate, NIL, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5491L)
  public static SubLObject inference_all_spec_inverses_int(final SubLObject predicate)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_spec_inverses_int_internal( predicate );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym10$INFERENCE_ALL_SPEC_INVERSES_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym10$INFERENCE_ALL_SPEC_INVERSES_INT, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym10$INFERENCE_ALL_SPEC_INVERSES_INT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_spec_inverses_int_internal( predicate ) ) );
      memoization_state.caching_state_put( caching_state, predicate, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5629L)
  public static SubLObject inference_all_proper_genl_predicates_with_axiom_index_internal(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cost = ZERO_INTEGER;
    final SubLObject deck_type = $kw14$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw16$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw19$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw21$WARN ) )
            {
              Errors.warn( $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const23$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$7 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject genl_pred = node_var_$7;
                  final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$7 ) && !genl_pred.eql( pred ) )
                    {
                      final SubLObject num = kb_indexing.relevant_num_predicate_rule_index( genl_pred, sense );
                      if( num.isPositive() )
                      {
                        result = ConsesLow.cons( genl_pred, result );
                        cost = Numbers.add( cost, num );
                      }
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$7 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$12;
                                    for( iteration_state_$12 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$12 ); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next( iteration_state_$12 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$12 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str24$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$7, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$12 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$6, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$14;
                          final SubLObject new_list = cdolist_list_var_$14 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$14.first();
                          while ( NIL != cdolist_list_var_$14)
                          {
                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str24$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$8, thread );
                            }
                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                            generating_fn = cdolist_list_var_$14.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$5, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$5, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$4, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$6, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$4, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$3, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$3, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$9, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Sequences.nreverse( result ), cost );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 5629L)
  public static SubLObject inference_all_proper_genl_predicates_with_axiom_index(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_proper_genl_predicates_with_axiom_index_internal( pred, sense );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, sense );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sense.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_proper_genl_predicates_with_axiom_index_internal( pred, sense ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, sense ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6510L)
  public static SubLObject inference_all_proper_spec_predicates_with_axiom_index(final SubLObject pred, final SubLObject sense)
  {
    if( NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP( pred ) )
    {
      return inference_all_proper_spec_predicates_with_axiom_index_int( pred, sense );
    }
    return Values.values( NIL, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6766L)
  public static SubLObject inference_all_proper_spec_predicates_with_axiom_index_int_internal(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cost = ZERO_INTEGER;
    final SubLObject deck_type = $kw14$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw16$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw19$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw21$WARN ) )
            {
              Errors.warn( $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$19 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$20 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$22 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const23$genlPreds ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$23 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject spec_pred = node_var_$23;
                  final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$23 ) && !spec_pred.eql( pred ) )
                    {
                      final SubLObject num = kb_indexing.relevant_num_predicate_rule_index( spec_pred, sense );
                      if( num.isPositive() )
                      {
                        result = ConsesLow.cons( spec_pred, result );
                        cost = Numbers.add( cost, num );
                      }
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const23$genlPreds ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$21 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$23 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$28;
                                    for( iteration_state_$28 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$28 ); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next( iteration_state_$28 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$28 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str24$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$23, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$28 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$22, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$30;
                          final SubLObject new_list = cdolist_list_var_$30 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$30.first();
                          while ( NIL != cdolist_list_var_$30)
                          {
                            final SubLObject _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str24$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$24, thread );
                            }
                            cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                            generating_fn = cdolist_list_var_$30.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$21, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$21, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$20, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$22, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$20, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$19, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$19, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$18, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$17, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Sequences.nreverse( result ), cost );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 6766L)
  public static SubLObject inference_all_proper_spec_predicates_with_axiom_index_int(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_proper_spec_predicates_with_axiom_index_int_internal( pred, sense );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, TWO_INTEGER, NIL, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, sense );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sense.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_proper_spec_predicates_with_axiom_index_int_internal( pred, sense ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, sense ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 7433L)
  public static SubLObject inference_all_proper_genl_inverses_with_axiom_index_internal(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cost = ZERO_INTEGER;
    final SubLObject deck_type = $kw14$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$33 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw16$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw19$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw21$WARN ) )
            {
              Errors.warn( $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$36 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$38 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const29$genlInverse ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$39 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject genl_pred = node_var_$39;
                  final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$39 ) && !genl_pred.eql( pred ) )
                    {
                      final SubLObject num = kb_indexing.relevant_num_predicate_rule_index( genl_pred, sense );
                      if( num.isPositive() )
                      {
                        result = ConsesLow.cons( genl_pred, result );
                        cost = Numbers.add( cost, num );
                      }
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$39 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$44;
                                    for( iteration_state_$44 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$44 ); iteration_state_$44 = dictionary_contents.do_dictionary_contents_next( iteration_state_$44 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$44 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str24$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$39, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$44 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$38, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$46;
                          final SubLObject new_list = cdolist_list_var_$46 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$46.first();
                          while ( NIL != cdolist_list_var_$46)
                          {
                            final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str24$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$40, thread );
                            }
                            cdolist_list_var_$46 = cdolist_list_var_$46.rest();
                            generating_fn = cdolist_list_var_$46.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$37, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$37, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$36, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$38, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$36, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$35, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$35, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$34, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$33, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Sequences.nreverse( result ), cost );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 7433L)
  public static SubLObject inference_all_proper_genl_inverses_with_axiom_index(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_proper_genl_inverses_with_axiom_index_internal( pred, sense );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, sense );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sense.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_proper_genl_inverses_with_axiom_index_internal( pred, sense ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, sense ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8086L)
  public static SubLObject inference_all_proper_spec_inverses_with_axiom_index(final SubLObject pred, final SubLObject sense)
  {
    if( NIL != genl_predicates.some_spec_predicate_or_inverse_somewhereP( pred ) )
    {
      return inference_all_proper_spec_inverses_with_axiom_index_int( pred, sense );
    }
    return Values.values( NIL, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8338L)
  public static SubLObject inference_all_proper_spec_inverses_with_axiom_index_int_internal(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject cost = ZERO_INTEGER;
    final SubLObject deck_type = $kw14$QUEUE;
    final SubLObject recur_deck = deck.create_deck( deck_type );
    SubLObject node_and_predicate_mode = NIL;
    final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
    try
    {
      sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
      try
      {
        final SubLObject tv_var = NIL;
        final SubLObject _prev_bind_0_$49 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
        try
        {
          sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
          sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
          if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
          {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
            if( pcase_var.eql( $kw16$ERROR ) )
            {
              sbhl_paranoia.sbhl_error( ONE_INTEGER, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw19$CERROR ) )
            {
              sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            }
            else if( pcase_var.eql( $kw21$WARN ) )
            {
              Errors.warn( $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P );
            }
            else
            {
              Errors.warn( $str22$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
              Errors.cerror( $str20$continue_anyway, $str17$_A_is_not_a__A, tv_var, $sym18$SBHL_TRUE_TV_P );
            }
          }
          final SubLObject _prev_bind_0_$50 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$51 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
          final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
          final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
          final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ), thread );
            sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ) ), thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ) ), thread );
            sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ), thread );
            if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( pred, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
            {
              final SubLObject _prev_bind_0_$51 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
              final SubLObject _prev_bind_1_$52 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
              final SubLObject _prev_bind_2_$54 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(
                    $const29$genlInverse ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_marking_utilities.sbhl_mark_node_marked( pred, UNPROVIDED );
                for( node_and_predicate_mode = ConsesLow.list( pred, sbhl_search_vars.genl_inverse_mode_p() ); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop( recur_deck ) )
                {
                  final SubLObject node_var_$55 = node_and_predicate_mode.first();
                  final SubLObject predicate_mode = conses_high.second( node_and_predicate_mode );
                  final SubLObject spec_pred = node_var_$55;
                  final SubLObject _prev_bind_0_$52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( predicate_mode, thread );
                    if( NIL != sbhl_search_utilities.apply_sbhl_add_node_test( sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$55 ) && !spec_pred.eql( pred ) )
                    {
                      final SubLObject num = kb_indexing.relevant_num_predicate_rule_index( spec_pred, sense );
                      if( num.isPositive() )
                      {
                        result = ConsesLow.cons( spec_pred, result );
                        cost = Numbers.add( cost, num );
                      }
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const29$genlInverse ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$53 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var_$55 );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              SubLObject iteration_state;
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    SubLObject iteration_state_$60;
                                    for( iteration_state_$60 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$60 ); iteration_state_$60 = dictionary_contents.do_dictionary_contents_next( iteration_state_$60 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$60 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          final SubLObject sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            final SubLObject set_contents_var = set.do_set_internal( sol );
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            SubLObject csome_list_var = sol;
                                            SubLObject node_vars_link_node2 = NIL;
                                            node_vars_link_node2 = csome_list_var.first();
                                            while ( NIL != csome_list_var)
                                            {
                                              if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                deck.deck_push( ConsesLow.list( node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str24$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$55, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$60 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$54, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str25$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$62;
                          final SubLObject new_list = cdolist_list_var_$62 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$62.first();
                          while ( NIL != cdolist_list_var_$62)
                          {
                            final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              final SubLObject sol2;
                              final SubLObject link_nodes2 = sol2 = Functions.funcall( generating_fn, node );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject node_vars_link_node3;
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                SubLObject csome_list_var2 = sol2;
                                SubLObject node_vars_link_node4 = NIL;
                                node_vars_link_node4 = csome_list_var2.first();
                                while ( NIL != csome_list_var2)
                                {
                                  if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                    deck.deck_push( ConsesLow.list( node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p() ), recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str24$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$56, thread );
                            }
                            cdolist_list_var_$62 = cdolist_list_var_$62.rest();
                            generating_fn = cdolist_list_var_$62.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$53, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$53, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_0_$52, thread );
                  }
                }
              }
              finally
              {
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$54, thread );
                sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$52, thread );
                sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$51, thread );
              }
            }
            else
            {
              sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str26$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                  UNPROVIDED );
            }
          }
          finally
          {
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
            sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$51, thread );
            sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$50, thread );
          }
        }
        finally
        {
          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_2, thread );
          sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$49, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$57 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$57, thread );
        }
      }
    }
    finally
    {
      sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0, thread );
    }
    return Values.values( Sequences.nreverse( result ), cost );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 8338L)
  public static SubLObject inference_all_proper_spec_inverses_with_axiom_index_int(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_proper_spec_inverses_with_axiom_index_int_internal( pred, sense );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, TWO_INTEGER, NIL, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, sense );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sense.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_proper_spec_inverses_with_axiom_index_int_internal( pred, sense ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, sense ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9007L)
  public static SubLObject inference_all_negation_predicates_with_axiom_index_internal(final SubLObject pred, final SubLObject sense)
  {
    SubLObject result = NIL;
    SubLObject cost = ZERO_INTEGER;
    SubLObject cdolist_list_var = negation_predicate.all_negation_predicates( pred, NIL, NIL );
    SubLObject negation_pred = NIL;
    negation_pred = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject num = kb_indexing.relevant_num_predicate_rule_index( negation_pred, sense );
      if( num.isPositive() )
      {
        result = ConsesLow.cons( negation_pred, result );
        cost = Numbers.add( cost, num );
      }
      cdolist_list_var = cdolist_list_var.rest();
      negation_pred = cdolist_list_var.first();
    }
    return Values.values( Sequences.nreverse( result ), cost );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9007L)
  public static SubLObject inference_all_negation_predicates_with_axiom_index(final SubLObject pred, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_all_negation_predicates_with_axiom_index_internal( pred, sense );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, TWO_INTEGER, NIL, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( pred, sense );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( pred.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sense.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_all_negation_predicates_with_axiom_index_internal( pred, sense ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( pred, sense ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9634L)
  public static SubLObject inference_some_max_floor_mts(SubLObject mts)
  {
    mts = Sequences.remove_duplicates( mts, Symbols.symbol_function( $sym32$HLMT_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    mts = mt_vars.minimize_mts_wrt_core( mts );
    return some_max_floor_mtsP_cached( mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9901L)
  public static SubLObject clear_some_max_floor_mtsP_cached()
  {
    final SubLObject cs = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9901L)
  public static SubLObject remove_some_max_floor_mtsP_cached(final SubLObject mts)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $some_max_floor_mtsP_cached_caching_state$.getGlobalValue(), ConsesLow.list( mts ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9901L)
  public static SubLObject some_max_floor_mtsP_cached_internal(final SubLObject mts)
  {
    return some_max_floor_mtsP( mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 9901L)
  public static SubLObject some_max_floor_mtsP_cached(final SubLObject mts)
  {
    SubLObject caching_state = $some_max_floor_mtsP_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym33$SOME_MAX_FLOOR_MTS__CACHED, $sym34$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_, $int35$256, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_mt_dependent_cache_clear_callback( $sym36$CLEAR_SOME_MAX_FLOOR_MTS__CACHED );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( some_max_floor_mtsP_cached_internal( mts ) ) );
      memoization_state.caching_state_put( caching_state, mts, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10051L)
  public static SubLObject inference_max_floor_mts_with_cycles_pruned(SubLObject mts, SubLObject candidates)
  {
    if( candidates == UNPROVIDED )
    {
      candidates = NIL;
    }
    mts = Sequences.remove_duplicates( mts, Symbols.symbol_function( $sym32$HLMT_EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    mts = mt_vars.minimize_mts_wrt_core( mts );
    if( NIL != candidates )
    {
      return genl_mts.max_floor_mts_with_cycles_pruned( mts, candidates, UNPROVIDED );
    }
    return inference_max_floor_mts_with_cycles_pruned_cached( mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10468L)
  public static SubLObject clear_inference_max_floor_mts_with_cycles_pruned_cached()
  {
    final SubLObject cs = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10468L)
  public static SubLObject remove_inference_max_floor_mts_with_cycles_pruned_cached(final SubLObject mts)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue(), ConsesLow.list( mts ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10468L)
  public static SubLObject inference_max_floor_mts_with_cycles_pruned_cached_internal(final SubLObject mts)
  {
    return genl_mts.max_floor_mts_with_cycles_pruned( mts, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10468L)
  public static SubLObject inference_max_floor_mts_with_cycles_pruned_cached(final SubLObject mts)
  {
    SubLObject caching_state = $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym37$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED, $sym38$_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED_CACHING_STATE_,
          $int35$256, EQUAL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_mt_dependent_cache_clear_callback( $sym39$CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, mts, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( inference_max_floor_mts_with_cycles_pruned_cached_internal( mts ) ) );
      memoization_state.caching_state_put( caching_state, mts, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10654L)
  public static SubLObject inference_max_floor_mts_of_nat_internal(final SubLObject nat)
  {
    return at_utilities.max_floor_mts_of_nat( nat, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10654L)
  public static SubLObject inference_max_floor_mts_of_nat(final SubLObject nat)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_max_floor_mts_of_nat_internal( nat );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, nat, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_max_floor_mts_of_nat_internal( nat ) ) );
      memoization_state.caching_state_put( caching_state, nat, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10763L)
  public static SubLObject some_max_floor_mtsP(final SubLObject mts)
  {
    return list_utilities.sublisp_boolean( genl_mts.max_floor_mts( mts, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10942L)
  public static SubLObject inference_applicable_sdctP_internal(final SubLObject col)
  {
    return sdc.applicable_sdctP( col, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 10942L)
  public static SubLObject inference_applicable_sdctP(final SubLObject col)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_applicable_sdctP_internal( col );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym41$INFERENCE_APPLICABLE_SDCT_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym41$INFERENCE_APPLICABLE_SDCT_, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym41$INFERENCE_APPLICABLE_SDCT_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_applicable_sdctP_internal( col ) ) );
      memoization_state.caching_state_put( caching_state, col, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11362L)
  public static SubLObject expression_has_inference_excepted_assertionP_iteration_helper(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != $block_inference_excepted_assertion_in_inference_index_lookupP$.getDynamicValue( thread ) && NIL != expression_has_inference_excepted_assertionP( expression ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11642L)
  public static SubLObject expression_has_inference_excepted_assertionP(final SubLObject expression)
  {
    final SubLObject assertions = cycl_utilities.expression_gather( expression, $sym42$ASSERTION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return list_utilities.sublisp_boolean( Sequences.find_if( $sym43$INFERENCE_EXCEPTED_ASSERTION__SHALLOW, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 11870L)
  public static SubLObject inference_excepted_assertionP(final SubLObject assertion, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $disable_inference_excepted_assertion_supportP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
    if( NIL != kb_control_vars.within_forward_inferenceP() && NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP( mt ) )
    {
      return NIL;
    }
    return memoized_inference_excepted_assertionP( assertion, mt_relevance_macros.current_mt_relevance_mt(), justifyP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12350L)
  public static SubLObject memoized_inference_excepted_assertionP_internal(final SubLObject assertion, final SubLObject mt, final SubLObject justifyP)
  {
    return assertion_utilities.excepted_assertion_in_mtP( assertion, mt_relevance_macros.conservative_constraint_mt( mt ), justifyP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12350L)
  public static SubLObject memoized_inference_excepted_assertionP(final SubLObject assertion, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_inference_excepted_assertionP_internal( assertion, mt, justifyP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, THREE_INTEGER, $int45$2048, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( assertion, mt, justifyP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( assertion.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && justifyP.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_inference_excepted_assertionP_internal( assertion, mt, justifyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( assertion, mt, justifyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 12569L)
  public static SubLObject inference_excepted_assertionP_shallow(final SubLObject assertion, SubLObject justifyP)
  {
    if( justifyP == UNPROVIDED )
    {
      justifyP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $disable_inference_excepted_assertion_supportP$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    final SubLObject mt = mt_relevance_macros.current_mt_relevance_mt();
    if( NIL != kb_control_vars.within_forward_inferenceP() && NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP( mt ) )
    {
      return NIL;
    }
    return memoized_inference_excepted_assertionP_shallow( assertion, mt_relevance_macros.current_mt_relevance_mt(), justifyP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13065L)
  public static SubLObject memoized_inference_excepted_assertionP_shallow_internal(final SubLObject assertion, final SubLObject mt, final SubLObject justifyP)
  {
    return assertion_utilities.excepted_assertion_in_mtP_shallow( assertion, mt_relevance_macros.conservative_constraint_mt( mt ), justifyP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13065L)
  public static SubLObject memoized_inference_excepted_assertionP_shallow(final SubLObject assertion, final SubLObject mt, final SubLObject justifyP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return memoized_inference_excepted_assertionP_shallow_internal( assertion, mt, justifyP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, THREE_INTEGER, $int45$2048, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( assertion, mt, justifyP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( assertion.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && justifyP.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( memoized_inference_excepted_assertionP_shallow_internal( assertion, mt, justifyP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( assertion, mt, justifyP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13300L)
  public static SubLObject do_inference_gafs_potentially_matching_formula(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject asent = NIL;
    SubLObject sense = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    asent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    sense = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$65 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      current_$65 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      if( NIL == conses_high.member( current_$65, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$65 == $kw49$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw50$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym51$DO_INFERENCE_GAF_LOOKUP_INDEX, ConsesLow.list( assertion_var, asent, sense, $kw50$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 13787L)
  public static SubLObject do_inference_gaf_lookup_index(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject asent = NIL;
    SubLObject sense = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    asent = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
    sense = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$66 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      current_$66 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list47 );
      if( NIL == conses_high.member( current_$66, $list48, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$66 == $kw49$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw50$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym52$DO_GAF_LOOKUP_INDEX, ConsesLow.list( assertion_var, ConsesLow.list( $sym53$INFERENCE_GAF_LOOKUP_INDEX, asent, sense ), $kw54$TRUTH, ConsesLow.list( $sym55$SENSE_TRUTH, sense ),
        $kw50$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14516L)
  public static SubLObject inference_gaf_lookup_index_internal(final SubLObject asent, final SubLObject sense)
  {
    return kb_indexing.best_gaf_lookup_index( asent, enumeration_types.sense_truth( sense ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14516L)
  public static SubLObject inference_gaf_lookup_index(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_gaf_lookup_index_internal( asent, sense );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym53$INFERENCE_GAF_LOOKUP_INDEX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym53$INFERENCE_GAF_LOOKUP_INDEX, TWO_INTEGER, $int45$2048, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym53$INFERENCE_GAF_LOOKUP_INDEX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( asent, sense );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( asent.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sense.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_gaf_lookup_index_internal( asent, sense ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( asent, sense ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14667L)
  public static SubLObject inference_num_gaf_lookup_index_internal(final SubLObject asent, final SubLObject sense)
  {
    return kb_indexing.num_best_gaf_lookup_index( asent, enumeration_types.sense_truth( sense ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14667L)
  public static SubLObject inference_num_gaf_lookup_index(final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_num_gaf_lookup_index_internal( asent, sense );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX, TWO_INTEGER, $int45$2048, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( asent, sense );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( asent.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && sense.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_num_gaf_lookup_index_internal( asent, sense ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( asent, sense ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14826L)
  public static SubLObject inference_relevant_num_gaf_lookup_index_internal(final SubLObject mt_info, final SubLObject asent, final SubLObject sense)
  {
    return kb_indexing.num_best_gaf_lookup_index( asent, enumeration_types.sense_truth( sense ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 14826L)
  public static SubLObject inference_relevant_num_gaf_lookup_index(final SubLObject mt_info, final SubLObject asent, final SubLObject sense)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_relevant_num_gaf_lookup_index_internal( mt_info, asent, sense );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, THREE_INTEGER, $int45$2048, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( mt_info, asent, sense );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( mt_info.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( asent.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && sense.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_relevant_num_gaf_lookup_index_internal( mt_info, asent, sense ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( mt_info, asent, sense ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15021L)
  public static SubLObject inference_argnums_from_gafs_mentioning_term_internal(final SubLObject v_term)
  {
    return kb_indexing.argnums_from_gafs_mentioning_term_with_relevant_mt( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15021L)
  public static SubLObject inference_argnums_from_gafs_mentioning_term(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_argnums_from_gafs_mentioning_term_internal( v_term );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, ONE_INTEGER, $int45$2048, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_argnums_from_gafs_mentioning_term_internal( v_term ) ) );
      memoization_state.caching_state_put( caching_state, v_term, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15188L)
  public static SubLObject inference_preds_from_gafs_mentioning_term_at_index_internal(final SubLObject v_term, SubLObject argnum)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    return kb_indexing.preds_from_gafs_mentioning_term_at_argnum_with_relevant_mt( v_term, argnum );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15188L)
  public static SubLObject inference_preds_from_gafs_mentioning_term_at_index(final SubLObject v_term, SubLObject argnum)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_preds_from_gafs_mentioning_term_at_index_internal( v_term, argnum );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, TWO_INTEGER, $int45$2048, EQL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( v_term, argnum );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && argnum.eql( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_preds_from_gafs_mentioning_term_at_index_internal( v_term, argnum ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, argnum ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15394L)
  public static SubLObject inference_key_gaf_arg_index_internal(final SubLObject v_term, SubLObject argnum, SubLObject pred)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    return kb_indexing.relevant_key_gaf_arg_index( v_term, argnum, pred );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15394L)
  public static SubLObject inference_key_gaf_arg_index(final SubLObject v_term, SubLObject argnum, SubLObject pred)
  {
    if( argnum == UNPROVIDED )
    {
      argnum = NIL;
    }
    if( pred == UNPROVIDED )
    {
      pred = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_key_gaf_arg_index_internal( v_term, argnum, pred );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym60$INFERENCE_KEY_GAF_ARG_INDEX, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym60$INFERENCE_KEY_GAF_ARG_INDEX, THREE_INTEGER, $int45$2048, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym60$INFERENCE_KEY_GAF_ARG_INDEX, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( v_term, argnum, pred );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( v_term.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( argnum.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && pred.eql( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_key_gaf_arg_index_internal( v_term, argnum, pred ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( v_term, argnum, pred ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15555L)
  public static SubLObject compute_problem_backchain_requiredP(final SubLObject problem)
  {
    assert NIL != inference_datastructures_problem.problem_p( problem ) : problem;
    SubLObject cdolist_list_var;
    final SubLObject query = cdolist_list_var = inference_datastructures_problem.problem_query( problem );
    SubLObject contextualized_dnf_clause = NIL;
    contextualized_dnf_clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == inference_some_backchain_required_asent_in_clauseP( contextualized_dnf_clause ) )
      {
        return NIL;
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_dnf_clause = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 15991L)
  public static SubLObject inference_some_backchain_required_asent_in_clauseP(final SubLObject contextualized_dnf_clause)
  {
    SubLObject cdolist_list_var = clauses.neg_lits( contextualized_dnf_clause );
    SubLObject contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_backchain_required_contextualized_asentP( contextualized_asent ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    contextualized_asent = NIL;
    contextualized_asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != inference_backchain_required_contextualized_asentP( contextualized_asent ) )
      {
        return T;
      }
      cdolist_list_var = cdolist_list_var.rest();
      contextualized_asent = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 16262L)
  public static SubLObject inference_backchain_required_contextualized_asentP(final SubLObject contextualized_asent)
  {
    final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent( contextualized_asent );
    final SubLObject mt = inference_datastructures_problem_query.contextualized_asent_mt( contextualized_asent );
    return inference_backchain_required_asentP( asent, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 16539L)
  public static SubLObject inference_backchain_required_asentP(final SubLObject asent, SubLObject mt)
  {
    mt = backchain_control_mt( mt );
    final SubLObject pred = cycl_utilities.atomic_sentence_predicate( asent );
    if( NIL != forts.fort_p( pred ) )
    {
      if( NIL != inference_predicate_backchain_requiredP( pred, mt ) )
      {
        return T;
      }
      final SubLObject pred_$67 = cycl_utilities.atomic_sentence_predicate( asent );
      if( NIL != subl_promotions.memberP( pred_$67, $list62, Symbols.symbol_function( EQL ), UNPROVIDED ) )
      {
        final SubLObject col = cycl_utilities.atomic_sentence_arg2( asent, UNPROVIDED );
        if( NIL != forts.fort_p( col ) )
        {
          if( NIL != inference_collection_backchain_requiredP( col, mt ) )
          {
            return T;
          }
          if( pred_$67.eql( $const63$isa ) && NIL != inference_collection_isa_backchain_requiredP( col, mt ) )
          {
            return T;
          }
          if( pred_$67.eql( $const64$genls ) && NIL != inference_collection_genls_backchain_requiredP( col, mt ) )
          {
            return T;
          }
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17288L)
  public static SubLObject inference_predicate_backchain_requiredP_internal(final SubLObject predicate, final SubLObject mt)
  {
    return kb_accessors.backchain_requiredP( predicate, backchain_control_mt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17288L)
  public static SubLObject inference_predicate_backchain_requiredP(final SubLObject predicate, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_predicate_backchain_requiredP_internal( predicate, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( predicate, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( predicate.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_predicate_backchain_requiredP_internal( predicate, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( predicate, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17447L)
  public static SubLObject inference_backchain_forbiddenP_internal(final SubLObject predicate, final SubLObject mt)
  {
    return kb_accessors.backchain_forbiddenP( predicate, backchain_control_mt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17447L)
  public static SubLObject inference_backchain_forbiddenP(final SubLObject predicate, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_backchain_forbiddenP_internal( predicate, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( predicate, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( predicate.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_backchain_forbiddenP_internal( predicate, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( predicate, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17598L)
  public static SubLObject inference_collection_isa_backchain_encouragedP_internal(final SubLObject collection, final SubLObject mt)
  {
    return kb_accessors.collection_isa_backchain_encouragedP( collection, backchain_control_mt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17598L)
  public static SubLObject inference_collection_isa_backchain_encouragedP(final SubLObject collection, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_collection_isa_backchain_encouragedP_internal( collection, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( collection, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( collection.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_collection_isa_backchain_encouragedP_internal( collection, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( collection, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17782L)
  public static SubLObject inference_collection_genls_backchain_encouragedP_internal(final SubLObject collection, final SubLObject mt)
  {
    return kb_accessors.collection_genls_backchain_encouragedP( collection, backchain_control_mt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17782L)
  public static SubLObject inference_collection_genls_backchain_encouragedP(final SubLObject collection, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_collection_genls_backchain_encouragedP_internal( collection, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( collection, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( collection.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_collection_genls_backchain_encouragedP_internal( collection, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( collection, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17970L)
  public static SubLObject inference_collection_backchain_encouragedP_internal(final SubLObject collection, final SubLObject mt)
  {
    return kb_accessors.collection_backchain_encouragedP( collection, backchain_control_mt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 17970L)
  public static SubLObject inference_collection_backchain_encouragedP(final SubLObject collection, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_collection_backchain_encouragedP_internal( collection, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( collection, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( collection.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_collection_backchain_encouragedP_internal( collection, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( collection, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18146L)
  public static SubLObject inference_collection_backchain_requiredP_internal(final SubLObject col, final SubLObject mt)
  {
    return kb_accessors.collection_backchain_requiredP( col, backchain_control_mt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18146L)
  public static SubLObject inference_collection_backchain_requiredP(final SubLObject col, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_collection_backchain_requiredP_internal( col, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( col, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( col.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_collection_backchain_requiredP_internal( col, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( col, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18304L)
  public static SubLObject inference_collection_isa_backchain_requiredP_internal(final SubLObject col, final SubLObject mt)
  {
    return kb_accessors.collection_isa_backchain_requiredP( col, backchain_control_mt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18304L)
  public static SubLObject inference_collection_isa_backchain_requiredP(final SubLObject col, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_collection_isa_backchain_requiredP_internal( col, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( col, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( col.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_collection_isa_backchain_requiredP_internal( col, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( col, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18471L)
  public static SubLObject inference_collection_genls_backchain_requiredP_internal(final SubLObject col, final SubLObject mt)
  {
    return kb_accessors.collection_genls_backchain_requiredP( col, backchain_control_mt( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18471L)
  public static SubLObject inference_collection_genls_backchain_requiredP(final SubLObject col, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_collection_genls_backchain_requiredP_internal( col, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( col, mt );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( col.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_collection_genls_backchain_requiredP_internal( col, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( col, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18642L)
  public static SubLObject backchain_control_mt(final SubLObject mt)
  {
    return mt_relevance_macros.conservative_constraint_mt( mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 18980L)
  public static SubLObject inference_relevant_mtP(final SubLObject assertion_mt, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( assertion_mt ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( assertion_mt, $const73$highlyRelevantMt, inference_mt, ONE_INTEGER, $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 19254L)
  public static SubLObject inference_relevant_assertionP(final SubLObject assertion, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( assertion, $const75$highlyRelevantAssertion, inference_mt, ONE_INTEGER,
        $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 19500L)
  public static SubLObject inference_relevant_predicate_assertionP(final SubLObject predicate, final SubLObject assertion, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( predicate ) && NIL != assertion_handles.assertion_p( assertion ) && NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const76$highlyRelevantPredAssertion,
        predicate, assertion, inference_mt, ONE_INTEGER, TWO_INTEGER, $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 19806L)
  public static SubLObject inference_relevant_termP(final SubLObject v_term, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( v_term ) && NIL != kb_accessors.highly_relevant_term_somewhereP( v_term ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( v_term, $const77$highlyRelevantTerm,
        inference_mt, ONE_INTEGER, $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 20081L)
  public static SubLObject inference_irrelevant_mtP(final SubLObject assertion_mt, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( assertion_mt ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( assertion_mt, $const78$irrelevantMt, inference_mt, ONE_INTEGER, $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 20315L)
  public static SubLObject inference_irrelevant_assertionP(final SubLObject assertion, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( assertion, $const79$irrelevantAssertion, inference_mt, ONE_INTEGER,
        $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 20559L)
  public static SubLObject inference_irrelevant_predicate_assertionP(final SubLObject predicate, final SubLObject assertion, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( predicate ) && NIL != assertion_handles.assertion_p( assertion ) && NIL != kb_mapping_utilities.pred_u_v_holds_in_relevant_mts( $const80$irrelevantPredAssertion, predicate,
        assertion, inference_mt, ONE_INTEGER, TWO_INTEGER, $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 20863L)
  public static SubLObject inference_irrelevant_termP(final SubLObject v_term, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != forts.fort_p( v_term ) && NIL != kb_accessors.irrelevant_term_somewhereP( v_term ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( v_term, $const81$irrelevantTerm,
        inference_mt, ONE_INTEGER, $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21131L)
  public static SubLObject inference_rule_has_utilityP(final SubLObject assertion, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    return makeBoolean( NIL != assertion_handles.assertion_p( assertion ) && NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts( assertion, $const82$assertionUtility, inference_mt, ONE_INTEGER, $kw74$TRUE ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21340L)
  public static SubLObject inference_rule_utility(final SubLObject assertion, SubLObject inference_mt)
  {
    if( inference_mt == UNPROVIDED )
    {
      inference_mt = NIL;
    }
    if( NIL != assertion_handles.assertion_p( assertion ) )
    {
      return kb_mapping_utilities.fpred_value_in_relevant_mts( assertion, $const82$assertionUtility, inference_mt, ONE_INTEGER, TWO_INTEGER, $kw74$TRUE );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21918L)
  public static SubLObject inference_known_sentence_removal_query_internal(SubLObject asent, SubLObject mt, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw74$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject halt_reason = T;
    SubLObject inference = NIL;
    SubLObject metrics = NIL;
    SubLObject results = NIL;
    if( NIL != cycl_grammar.cycl_atomic_sentence_p( asent ) )
    {
      if( NIL != el_utilities.ist_of_atomic_sentence_p( asent ) )
      {
        thread.resetMultipleValues();
        final SubLObject asent_$68 = czer_utilities.unwrap_if_ist( asent, mt, UNPROVIDED );
        final SubLObject mt_$69 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        asent = asent_$68;
        mt = mt_$69;
      }
      final SubLObject pcase_var = truth;
      if( pcase_var.eql( $kw74$TRUE ) )
      {
        SubLObject query_properties = determine_sentence_recursive_query_properties( asent, mt );
        final SubLObject _prev_bind_0 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding( thread );
        try
        {
          czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind( T, thread );
          query_properties = conses_high.putf( query_properties, $kw84$ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec() );
          thread.resetMultipleValues();
          final SubLObject results_$70 = ask_utilities.recursive_query( asent, mt, query_properties );
          final SubLObject halt_reason_$71 = thread.secondMultipleValue();
          final SubLObject inference_$72 = thread.thirdMultipleValue();
          final SubLObject metrics_$73 = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          results = results_$70;
          halt_reason = halt_reason_$71;
          inference = inference_$72;
          metrics = metrics_$73;
        }
        finally
        {
          czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind( _prev_bind_0, thread );
        }
      }
      else if( pcase_var.eql( $kw85$FALSE ) )
      {
        thread.resetMultipleValues();
        final SubLObject results_$71 = ask_utilities.recursive_query( el_utilities.make_negation( asent ), mt, ConsesLow.list( $kw84$ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec() ) );
        final SubLObject halt_reason_$72 = thread.secondMultipleValue();
        final SubLObject inference_$73 = thread.thirdMultipleValue();
        final SubLObject metrics_$74 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        results = results_$71;
        halt_reason = halt_reason_$72;
        inference = inference_$73;
        metrics = metrics_$74;
      }
    }
    return Values.values( results, halt_reason, inference, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 21918L)
  public static SubLObject inference_known_sentence_removal_query(final SubLObject asent, final SubLObject mt, SubLObject truth)
  {
    if( truth == UNPROVIDED )
    {
      truth = $kw74$TRUE;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_known_sentence_removal_query_internal( asent, mt, truth );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( asent, mt, truth );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( asent.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && truth.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_known_sentence_removal_query_internal( asent, mt, truth ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( asent, mt, truth ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 23262L)
  public static SubLObject inference_known_sentence_recursive_query(final SubLObject formula, final SubLObject mt, SubLObject number)
  {
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject results = inference_true_sentence_recursive_query( formula, mt, number, UNPROVIDED );
    final SubLObject halt_reason = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( results, inference_datastructures_enumerated_types.exhausted_query_halt_reason_p( halt_reason ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 23697L)
  public static SubLObject inference_true_sentence_recursion_cycleP(final SubLObject sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_universal_p( sentence ) )
    {
      return T;
    }
    return subl_promotions.memberP( sentence, $inference_true_sentence_recursion_stack$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 24098L)
  public static SubLObject inference_true_sentence_recursive_query_internal(final SubLObject formula, final SubLObject mt, SubLObject number, SubLObject dummy_query_properties)
  {
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( dummy_query_properties == UNPROVIDED )
    {
      dummy_query_properties = $recursive_query_override_properties$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    SubLObject halt_reason = NIL;
    SubLObject inference = NIL;
    SubLObject metrics = NIL;
    if( NIL == inference_true_sentence_recursion_cycleP( formula ) )
    {
      final SubLObject _prev_bind_0 = $inference_true_sentence_recursion_stack$.currentBinding( thread );
      try
      {
        $inference_true_sentence_recursion_stack$.bind( ConsesLow.cons( formula, $inference_true_sentence_recursion_stack$.getDynamicValue( thread ) ), thread );
        SubLObject query_properties = determine_sentence_recursive_query_properties( formula, mt );
        final SubLObject _prev_bind_0_$78 = czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.currentBinding( thread );
        try
        {
          czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.bind( T, thread );
          query_properties = conses_high.putf( query_properties, $kw87$MAX_NUMBER, number );
          query_properties = conses_high.putf( query_properties, $kw84$ALLOWED_MODULES, removal_modules_abduction.abductive_modules_not_allowed_spec() );
          thread.resetMultipleValues();
          final SubLObject results_$79 = ask_utilities.inference_recursive_query_unique_bindings( formula, mt, query_properties );
          final SubLObject halt_reason_$80 = thread.secondMultipleValue();
          final SubLObject inference_$81 = thread.thirdMultipleValue();
          final SubLObject metrics_$82 = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          results = results_$79;
          halt_reason = halt_reason_$80;
          inference = inference_$81;
          metrics = metrics_$82;
        }
        finally
        {
          czer_vars.$disable_create_narts_regardless_of_whether_within_assertP$.rebind( _prev_bind_0_$78, thread );
        }
      }
      finally
      {
        $inference_true_sentence_recursion_stack$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( results, halt_reason, inference, metrics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 24098L)
  public static SubLObject inference_true_sentence_recursive_query(final SubLObject formula, final SubLObject mt, SubLObject number, SubLObject dummy_query_properties)
  {
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( dummy_query_properties == UNPROVIDED )
    {
      dummy_query_properties = $recursive_query_override_properties$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_true_sentence_recursive_query_internal( formula, mt, number, dummy_query_properties );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( formula, mt, number, dummy_query_properties );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( formula.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( number.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && dummy_query_properties.equal( cached_args.first() ) )
              {
                return memoization_state.caching_results( results2 );
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_true_sentence_recursive_query_internal( formula, mt, number, dummy_query_properties ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( formula, mt, number, dummy_query_properties ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25167L)
  public static SubLObject inference_mts_where_gaf_sentence_true_internal(final SubLObject gaf_sentence)
  {
    final SubLObject all_mt_support_combinations = inference_mts_where_gaf_sentence_true_justified( gaf_sentence );
    SubLObject all_mts = NIL;
    SubLObject cdolist_list_var = all_mt_support_combinations;
    SubLObject mt_support_combination = NIL;
    mt_support_combination = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = mt_support_combination;
      SubLObject mts = NIL;
      SubLObject support_combination = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
      mts = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list89 );
      support_combination = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject cdolist_list_var_$83 = mts;
        SubLObject mt = NIL;
        mt = cdolist_list_var_$83.first();
        while ( NIL != cdolist_list_var_$83)
        {
          final SubLObject item_var = mt;
          if( NIL == conses_high.member( item_var, all_mts, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            all_mts = ConsesLow.cons( item_var, all_mts );
          }
          cdolist_list_var_$83 = cdolist_list_var_$83.rest();
          mt = cdolist_list_var_$83.first();
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list89 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt_support_combination = cdolist_list_var.first();
    }
    return Sequences.nreverse( all_mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25167L)
  public static SubLObject inference_mts_where_gaf_sentence_true(final SubLObject gaf_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_mts_where_gaf_sentence_true_internal( gaf_sentence );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, ONE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, gaf_sentence, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_mts_where_gaf_sentence_true_internal( gaf_sentence ) ) );
      memoization_state.caching_state_put( caching_state, gaf_sentence, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25689L)
  public static SubLObject inference_mts_where_gaf_sentence_true_justified_memoized_internal(final SubLObject gaf_sentence)
  {
    return inference_mts_where_gaf_sentence_true_justified( gaf_sentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25689L)
  public static SubLObject inference_mts_where_gaf_sentence_true_justified_memoized(final SubLObject gaf_sentence)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_mts_where_gaf_sentence_true_justified_memoized_internal( gaf_sentence );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, ONE_INTEGER, NIL, EQUAL,
          UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, gaf_sentence, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_mts_where_gaf_sentence_true_justified_memoized_internal( gaf_sentence ) ) );
      memoization_state.caching_state_put( caching_state, gaf_sentence, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 25869L)
  public static SubLObject inference_mts_where_gaf_sentence_true_justified(final SubLObject gaf_sentence)
  {
    SubLObject all_mt_support_combinations = NIL;
    SubLObject cdolist_list_var;
    final SubLObject raw_justifications = cdolist_list_var = backward.removal_ask_justifications( gaf_sentence, $const91$InferencePSC, $kw74$TRUE, UNPROVIDED );
    SubLObject raw_justification = NIL;
    raw_justification = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject cdolist_list_var_$84;
      final SubLObject mt_support_combinations = cdolist_list_var_$84 = forward.compute_all_mt_and_support_combinations( raw_justification, UNPROVIDED );
      SubLObject mt_support_combination = NIL;
      mt_support_combination = cdolist_list_var_$84.first();
      while ( NIL != cdolist_list_var_$84)
      {
        all_mt_support_combinations = ConsesLow.cons( mt_support_combination, all_mt_support_combinations );
        cdolist_list_var_$84 = cdolist_list_var_$84.rest();
        mt_support_combination = cdolist_list_var_$84.first();
      }
      cdolist_list_var = cdolist_list_var.rest();
      raw_justification = cdolist_list_var.first();
    }
    return Sequences.nreverse( all_mt_support_combinations );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 26510L)
  public static SubLObject determine_sentence_recursive_query_properties(final SubLObject sentence, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $recursive_query_override_properties$.getDynamicValue( thread ) )
    {
      return $recursive_query_override_properties$.getDynamicValue( thread );
    }
    return determine_sentence_recursive_query_properties_recursive( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 27086L)
  public static SubLObject determine_sentence_recursive_query_properties_recursive(final SubLObject sentence, final SubLObject mt)
  {
    if( NIL != inference_completeness_utilities.inference_completely_enumerable_via_backchain_asentP( sentence, mt ) )
    {
      if( NIL != inference_datastructures_inference.inference_p( inference_macros.current_controlling_inference() ) )
      {
        return ConsesLow.list( $kw92$MAX_TRANSFORMATION_DEPTH, inference_utilities.inference_property_lookup( inference_macros.current_controlling_inference(), $kw92$MAX_TRANSFORMATION_DEPTH, UNPROVIDED ),
            $kw93$MIN_RULE_UTILITY, inference_utilities.inference_property_lookup( inference_macros.current_controlling_inference(), $kw93$MIN_RULE_UTILITY, UNPROVIDED ) );
      }
      return ConsesLow.list( $kw92$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw93$MIN_RULE_UTILITY, $int94$_100 );
    }
    else
    {
      if( NIL != el_utilities.el_conjunction_p( sentence ) || NIL != el_utilities.el_disjunction_p( sentence ) )
      {
        final SubLObject xjuncts = cycl_utilities.formula_args( sentence, UNPROVIDED );
        SubLObject xjunction_properties = NIL;
        SubLObject cdolist_list_var = xjuncts;
        SubLObject xjunct = NIL;
        xjunct = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject xjunct_properties = determine_sentence_recursive_query_properties_recursive( xjunct, mt );
          if( NIL != xjunct_properties )
          {
            xjunction_properties = inference_parameters.inference_merge_query_properties( xjunction_properties, xjunct_properties );
          }
          cdolist_list_var = cdolist_list_var.rest();
          xjunct = cdolist_list_var.first();
        }
        return xjunction_properties;
      }
      if( NIL != el_utilities.el_existential_p( sentence ) )
      {
        return determine_sentence_recursive_query_properties_recursive( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), mt );
      }
      if( NIL != el_utilities.el_formula_with_operator_p( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), $const95$TheSetOf ) )
      {
        return determine_sentence_recursive_query_properties_recursive( cycl_utilities.formula_arg2( cycl_utilities.formula_arg2( sentence, UNPROVIDED ), UNPROVIDED ), mt );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 28451L)
  public static SubLObject inference_rule_type_constraints_internal(final SubLObject rule)
  {
    return assertion_utilities.rule_type_constraints( rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-trampolines.lisp", position = 28451L)
  public static SubLObject inference_rule_type_constraints(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return inference_rule_type_constraints_internal( rule );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS, ONE_INTEGER, NIL, EQL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS, caching_state );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( inference_rule_type_constraints_internal( rule ) ) );
      memoization_state.caching_state_put( caching_state, rule, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  public static SubLObject declare_inference_trampolines_file()
  {
    SubLFiles.declareFunction( me, "inference_atomic_term_p", "INFERENCE-ATOMIC-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_collectionP", "INFERENCE-COLLECTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_predicate_p", "INFERENCE-PREDICATE-P", 1, 0, false );
    new $inference_predicate_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_commutative_relationP", "INFERENCE-COMMUTATIVE-RELATION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_symmetric_predicateP", "INFERENCE-SYMMETRIC-PREDICATE?", 1, 0, false );
    new $inference_symmetric_predicateP$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_commutative_predicate_p", "INFERENCE-COMMUTATIVE-PREDICATE-P", 1, 0, false );
    new $inference_commutative_predicate_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_partially_commutative_predicate_p_internal", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_partially_commutative_predicate_p", "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false );
    new $inference_partially_commutative_predicate_p$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_at_least_partially_commutative_predicate_p", "INFERENCE-AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_asymmetric_predicateP", "INFERENCE-ASYMMETRIC-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_transitive_predicateP", "INFERENCE-TRANSITIVE-PREDICATE?", 1, 0, false );
    new $inference_transitive_predicateP$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_evaluatable_predicateP", "INFERENCE-EVALUATABLE-PREDICATE?", 1, 0, false );
    new $inference_evaluatable_predicateP$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_reflexive_predicateP", "INFERENCE-REFLEXIVE-PREDICATE?", 1, 0, false );
    new $inference_reflexive_predicateP$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_irreflexive_predicateP", "INFERENCE-IRREFLEXIVE-PREDICATE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_indeterminate_termP", "INFERENCE-INDETERMINATE-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_indeterminate_term_p", "CLEAR-INDETERMINATE-TERM-P", 0, 0, false );
    new $clear_indeterminate_term_p$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_indeterminate_term_p", "REMOVE-INDETERMINATE-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "indeterminate_term_p_internal", "INDETERMINATE-TERM-P-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "indeterminate_term_p", "INDETERMINATE-TERM-P", 1, 0, false );
    SubLFiles.declareFunction( me, "memoized_inference_indeterminate_termP_internal", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "memoized_inference_indeterminate_termP", "MEMOIZED-INFERENCE-INDETERMINATE-TERM?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_some_genl_pred_or_inverseP", "INFERENCE-SOME-GENL-PRED-OR-INVERSE?", 1, 0, false );
    new $inference_some_genl_pred_or_inverseP$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_some_spec_pred_or_inverseP", "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?", 1, 0, false );
    new $inference_some_spec_pred_or_inverseP$UnaryFunction();
    SubLFiles.declareFunction( me, "inference_some_negation_pred_or_inverseP", "INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_genl_predicates_internal", "INFERENCE-ALL-GENL-PREDICATES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_genl_predicates", "INFERENCE-ALL-GENL-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_spec_predicates", "INFERENCE-ALL-SPEC-PREDICATES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_spec_predicates_int_internal", "INFERENCE-ALL-SPEC-PREDICATES-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_spec_predicates_int", "INFERENCE-ALL-SPEC-PREDICATES-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_genl_inverses_internal", "INFERENCE-ALL-GENL-INVERSES-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_genl_inverses", "INFERENCE-ALL-GENL-INVERSES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_spec_inverses", "INFERENCE-ALL-SPEC-INVERSES", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_spec_inverses_int_internal", "INFERENCE-ALL-SPEC-INVERSES-INT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_spec_inverses_int", "INFERENCE-ALL-SPEC-INVERSES-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_genl_predicates_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_genl_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_spec_predicates_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_spec_predicates_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_spec_predicates_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_genl_inverses_with_axiom_index_internal", "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_genl_inverses_with_axiom_index", "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_spec_inverses_with_axiom_index", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_spec_inverses_with_axiom_index_int_internal", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_proper_spec_inverses_with_axiom_index_int", "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_negation_predicates_with_axiom_index_internal", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_all_negation_predicates_with_axiom_index", "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_some_max_floor_mts", "INFERENCE-SOME-MAX-FLOOR-MTS", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_some_max_floor_mtsP_cached", "CLEAR-SOME-MAX-FLOOR-MTS?-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_some_max_floor_mtsP_cached", "REMOVE-SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "some_max_floor_mtsP_cached_internal", "SOME-MAX-FLOOR-MTS?-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "some_max_floor_mtsP_cached", "SOME-MAX-FLOOR-MTS?-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_floor_mts_with_cycles_pruned", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_inference_max_floor_mts_with_cycles_pruned_cached", "CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_inference_max_floor_mts_with_cycles_pruned_cached", "REMOVE-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_floor_mts_with_cycles_pruned_cached_internal", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_floor_mts_with_cycles_pruned_cached", "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_floor_mts_of_nat_internal", "INFERENCE-MAX-FLOOR-MTS-OF-NAT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_max_floor_mts_of_nat", "INFERENCE-MAX-FLOOR-MTS-OF-NAT", 1, 0, false );
    SubLFiles.declareFunction( me, "some_max_floor_mtsP", "SOME-MAX-FLOOR-MTS?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_applicable_sdctP_internal", "INFERENCE-APPLICABLE-SDCT?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_applicable_sdctP", "INFERENCE-APPLICABLE-SDCT?", 1, 0, false );
    SubLFiles.declareFunction( me, "expression_has_inference_excepted_assertionP_iteration_helper", "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?-ITERATION-HELPER", 1, 0, false );
    SubLFiles.declareFunction( me, "expression_has_inference_excepted_assertionP", "EXPRESSION-HAS-INFERENCE-EXCEPTED-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_excepted_assertionP", "INFERENCE-EXCEPTED-ASSERTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "memoized_inference_excepted_assertionP_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "memoized_inference_excepted_assertionP", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_excepted_assertionP_shallow", "INFERENCE-EXCEPTED-ASSERTION?-SHALLOW", 1, 1, false );
    SubLFiles.declareFunction( me, "memoized_inference_excepted_assertionP_shallow_internal", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "memoized_inference_excepted_assertionP_shallow", "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW", 3, 0, false );
    SubLFiles.declareMacro( me, "do_inference_gafs_potentially_matching_formula", "DO-INFERENCE-GAFS-POTENTIALLY-MATCHING-FORMULA" );
    SubLFiles.declareMacro( me, "do_inference_gaf_lookup_index", "DO-INFERENCE-GAF-LOOKUP-INDEX" );
    SubLFiles.declareFunction( me, "inference_gaf_lookup_index_internal", "INFERENCE-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_gaf_lookup_index", "INFERENCE-GAF-LOOKUP-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_num_gaf_lookup_index_internal", "INFERENCE-NUM-GAF-LOOKUP-INDEX-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_num_gaf_lookup_index", "INFERENCE-NUM-GAF-LOOKUP-INDEX", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_relevant_num_gaf_lookup_index_internal", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_relevant_num_gaf_lookup_index", "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_argnums_from_gafs_mentioning_term_internal", "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_argnums_from_gafs_mentioning_term", "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_preds_from_gafs_mentioning_term_at_index_internal", "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX-INTERNAL", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_preds_from_gafs_mentioning_term_at_index", "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_key_gaf_arg_index_internal", "INFERENCE-KEY-GAF-ARG-INDEX-INTERNAL", 1, 2, false );
    SubLFiles.declareFunction( me, "inference_key_gaf_arg_index", "INFERENCE-KEY-GAF-ARG-INDEX", 1, 2, false );
    SubLFiles.declareFunction( me, "compute_problem_backchain_requiredP", "COMPUTE-PROBLEM-BACKCHAIN-REQUIRED?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_some_backchain_required_asent_in_clauseP", "INFERENCE-SOME-BACKCHAIN-REQUIRED-ASENT-IN-CLAUSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_backchain_required_contextualized_asentP", "INFERENCE-BACKCHAIN-REQUIRED-CONTEXTUALIZED-ASENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_backchain_required_asentP", "INFERENCE-BACKCHAIN-REQUIRED-ASENT?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_predicate_backchain_requiredP_internal", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_predicate_backchain_requiredP", "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_backchain_forbiddenP_internal", "INFERENCE-BACKCHAIN-FORBIDDEN?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_backchain_forbiddenP", "INFERENCE-BACKCHAIN-FORBIDDEN?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_isa_backchain_encouragedP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_isa_backchain_encouragedP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_genls_backchain_encouragedP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_genls_backchain_encouragedP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_backchain_encouragedP_internal", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_backchain_encouragedP", "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_backchain_requiredP_internal", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_backchain_requiredP", "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_isa_backchain_requiredP_internal", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_isa_backchain_requiredP", "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_genls_backchain_requiredP_internal", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_collection_genls_backchain_requiredP", "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?", 2, 0, false );
    SubLFiles.declareFunction( me, "backchain_control_mt", "BACKCHAIN-CONTROL-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_relevant_mtP", "INFERENCE-RELEVANT-MT?", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_relevant_assertionP", "INFERENCE-RELEVANT-ASSERTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_relevant_predicate_assertionP", "INFERENCE-RELEVANT-PREDICATE-ASSERTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "inference_relevant_termP", "INFERENCE-RELEVANT-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_irrelevant_mtP", "INFERENCE-IRRELEVANT-MT?", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_irrelevant_assertionP", "INFERENCE-IRRELEVANT-ASSERTION?", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_irrelevant_predicate_assertionP", "INFERENCE-IRRELEVANT-PREDICATE-ASSERTION?", 2, 1, false );
    SubLFiles.declareFunction( me, "inference_irrelevant_termP", "INFERENCE-IRRELEVANT-TERM?", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_rule_has_utilityP", "INFERENCE-RULE-HAS-UTILITY?", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_rule_utility", "INFERENCE-RULE-UTILITY", 1, 1, false );
    SubLFiles.declareFunction( me, "inference_known_sentence_removal_query_internal", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "inference_known_sentence_removal_query", "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY", 2, 1, false );
    SubLFiles.declareFunction( me, "inference_known_sentence_recursive_query", "INFERENCE-KNOWN-SENTENCE-RECURSIVE-QUERY", 2, 1, false );
    SubLFiles.declareFunction( me, "inference_true_sentence_recursion_cycleP", "INFERENCE-TRUE-SENTENCE-RECURSION-CYCLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_true_sentence_recursive_query_internal", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY-INTERNAL", 2, 2, false );
    SubLFiles.declareFunction( me, "inference_true_sentence_recursive_query", "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY", 2, 2, false );
    SubLFiles.declareFunction( me, "inference_mts_where_gaf_sentence_true_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_mts_where_gaf_sentence_true", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_mts_where_gaf_sentence_true_justified_memoized_internal", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_mts_where_gaf_sentence_true_justified_memoized", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_mts_where_gaf_sentence_true_justified", "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED", 1, 0, false );
    SubLFiles.declareFunction( me, "determine_sentence_recursive_query_properties", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "determine_sentence_recursive_query_properties_recursive", "DETERMINE-SENTENCE-RECURSIVE-QUERY-PROPERTIES-RECURSIVE", 2, 0, false );
    SubLFiles.declareFunction( me, "inference_rule_type_constraints_internal", "INFERENCE-RULE-TYPE-CONSTRAINTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_rule_type_constraints", "INFERENCE-RULE-TYPE-CONSTRAINTS", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_trampolines_file()
  {
    $indeterminate_term_p_caching_state$ = SubLFiles.deflexical( "*INDETERMINATE-TERM-P-CACHING-STATE*", NIL );
    $some_max_floor_mtsP_cached_caching_state$ = SubLFiles.deflexical( "*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*", NIL );
    $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$ = SubLFiles.deflexical( "*INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-CACHING-STATE*", NIL );
    $block_inference_excepted_assertion_in_inference_index_lookupP$ = SubLFiles.defparameter( "*BLOCK-INFERENCE-EXCEPTED-ASSERTION-IN-INFERENCE-INDEX-LOOKUP?*", T );
    $disable_inference_excepted_assertion_supportP$ = SubLFiles.defparameter( "*DISABLE-INFERENCE-EXCEPTED-ASSERTION-SUPPORT?*", NIL );
    $recursive_query_override_properties$ = SubLFiles.defparameter( "*RECURSIVE-QUERY-OVERRIDE-PROPERTIES*", NIL );
    $inference_true_sentence_recursion_stack$ = SubLFiles.defparameter( "*INFERENCE-TRUE-SENTENCE-RECURSION-STACK*", NIL );
    return NIL;
  }

  public static SubLObject setup_inference_trampolines_file()
  {
    memoization_state.note_memoized_function( $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P );
    memoization_state.note_globally_cached_function( $sym2$INDETERMINATE_TERM_P );
    memoization_state.note_memoized_function( $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_ );
    memoization_state.note_memoized_function( $sym7$INFERENCE_ALL_GENL_PREDICATES );
    memoization_state.note_memoized_function( $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT );
    memoization_state.note_memoized_function( $sym9$INFERENCE_ALL_GENL_INVERSES );
    memoization_state.note_memoized_function( $sym10$INFERENCE_ALL_SPEC_INVERSES_INT );
    memoization_state.note_memoized_function( $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX );
    memoization_state.note_memoized_function( $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT );
    memoization_state.note_memoized_function( $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX );
    memoization_state.note_memoized_function( $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT );
    memoization_state.note_memoized_function( $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX );
    memoization_state.note_globally_cached_function( $sym33$SOME_MAX_FLOOR_MTS__CACHED );
    memoization_state.note_globally_cached_function( $sym37$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED );
    memoization_state.note_memoized_function( $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT );
    memoization_state.note_memoized_function( $sym41$INFERENCE_APPLICABLE_SDCT_ );
    memoization_state.note_memoized_function( $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_ );
    memoization_state.note_memoized_function( $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW );
    memoization_state.note_memoized_function( $sym53$INFERENCE_GAF_LOOKUP_INDEX );
    memoization_state.note_memoized_function( $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX );
    memoization_state.note_memoized_function( $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX );
    memoization_state.note_memoized_function( $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM );
    memoization_state.note_memoized_function( $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX );
    memoization_state.note_memoized_function( $sym60$INFERENCE_KEY_GAF_ARG_INDEX );
    memoization_state.note_memoized_function( $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_ );
    memoization_state.note_memoized_function( $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_ );
    memoization_state.note_memoized_function( $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_ );
    memoization_state.note_memoized_function( $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_ );
    memoization_state.note_memoized_function( $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_ );
    memoization_state.note_memoized_function( $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_ );
    memoization_state.note_memoized_function( $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_ );
    memoization_state.note_memoized_function( $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_ );
    memoization_state.note_memoized_function( $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY );
    memoization_state.note_memoized_function( $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY );
    memoization_state.note_memoized_function( $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE );
    memoization_state.note_memoized_function( $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED );
    memoization_state.note_memoized_function( $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_trampolines_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_trampolines_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_trampolines_file();
  }
  static
  {
    me = new inference_trampolines();
    $indeterminate_term_p_caching_state$ = null;
    $some_max_floor_mtsP_cached_caching_state$ = null;
    $inference_max_floor_mts_with_cycles_pruned_cached_caching_state$ = null;
    $block_inference_excepted_assertion_in_inference_index_lookupP$ = null;
    $disable_inference_excepted_assertion_supportP$ = null;
    $recursive_query_override_properties$ = null;
    $inference_true_sentence_recursion_stack$ = null;
    $const0$Collection = constant_handles.reader_make_constant_shell( makeString( "Collection" ) );
    $sym1$INFERENCE_PARTIALLY_COMMUTATIVE_PREDICATE_P = makeSymbol( "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P" );
    $sym2$INDETERMINATE_TERM_P = makeSymbol( "INDETERMINATE-TERM-P" );
    $const3$IndeterminateTerm = constant_handles.reader_make_constant_shell( makeString( "IndeterminateTerm" ) );
    $sym4$_INDETERMINATE_TERM_P_CACHING_STATE_ = makeSymbol( "*INDETERMINATE-TERM-P-CACHING-STATE*" );
    $sym5$CLEAR_INDETERMINATE_TERM_P = makeSymbol( "CLEAR-INDETERMINATE-TERM-P" );
    $sym6$MEMOIZED_INFERENCE_INDETERMINATE_TERM_ = makeSymbol( "MEMOIZED-INFERENCE-INDETERMINATE-TERM?" );
    $sym7$INFERENCE_ALL_GENL_PREDICATES = makeSymbol( "INFERENCE-ALL-GENL-PREDICATES" );
    $sym8$INFERENCE_ALL_SPEC_PREDICATES_INT = makeSymbol( "INFERENCE-ALL-SPEC-PREDICATES-INT" );
    $sym9$INFERENCE_ALL_GENL_INVERSES = makeSymbol( "INFERENCE-ALL-GENL-INVERSES" );
    $sym10$INFERENCE_ALL_SPEC_INVERSES_INT = makeSymbol( "INFERENCE-ALL-SPEC-INVERSES-INT" );
    $sym11$INFERENCE_ALL_PROPER_GENL_PREDICATES_WITH_AXIOM_INDEX = makeSymbol( "INFERENCE-ALL-PROPER-GENL-PREDICATES-WITH-AXIOM-INDEX" );
    $kw12$DEPTH = makeKeyword( "DEPTH" );
    $kw13$STACK = makeKeyword( "STACK" );
    $kw14$QUEUE = makeKeyword( "QUEUE" );
    $sym15$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw16$ERROR = makeKeyword( "ERROR" );
    $str17$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym18$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw19$CERROR = makeKeyword( "CERROR" );
    $str20$continue_anyway = makeString( "continue anyway" );
    $kw21$WARN = makeKeyword( "WARN" );
    $str22$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const23$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $str24$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str25$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str26$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $sym27$INFERENCE_ALL_PROPER_SPEC_PREDICATES_WITH_AXIOM_INDEX_INT = makeSymbol( "INFERENCE-ALL-PROPER-SPEC-PREDICATES-WITH-AXIOM-INDEX-INT" );
    $sym28$INFERENCE_ALL_PROPER_GENL_INVERSES_WITH_AXIOM_INDEX = makeSymbol( "INFERENCE-ALL-PROPER-GENL-INVERSES-WITH-AXIOM-INDEX" );
    $const29$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $sym30$INFERENCE_ALL_PROPER_SPEC_INVERSES_WITH_AXIOM_INDEX_INT = makeSymbol( "INFERENCE-ALL-PROPER-SPEC-INVERSES-WITH-AXIOM-INDEX-INT" );
    $sym31$INFERENCE_ALL_NEGATION_PREDICATES_WITH_AXIOM_INDEX = makeSymbol( "INFERENCE-ALL-NEGATION-PREDICATES-WITH-AXIOM-INDEX" );
    $sym32$HLMT_EQUAL = makeSymbol( "HLMT-EQUAL" );
    $sym33$SOME_MAX_FLOOR_MTS__CACHED = makeSymbol( "SOME-MAX-FLOOR-MTS?-CACHED" );
    $sym34$_SOME_MAX_FLOOR_MTS__CACHED_CACHING_STATE_ = makeSymbol( "*SOME-MAX-FLOOR-MTS?-CACHED-CACHING-STATE*" );
    $int35$256 = makeInteger( 256 );
    $sym36$CLEAR_SOME_MAX_FLOOR_MTS__CACHED = makeSymbol( "CLEAR-SOME-MAX-FLOOR-MTS?-CACHED" );
    $sym37$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED = makeSymbol( "INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED" );
    $sym38$_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED_CACHING_STATE_ = makeSymbol( "*INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED-CACHING-STATE*" );
    $sym39$CLEAR_INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED_CACHED = makeSymbol( "CLEAR-INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED-CACHED" );
    $sym40$INFERENCE_MAX_FLOOR_MTS_OF_NAT = makeSymbol( "INFERENCE-MAX-FLOOR-MTS-OF-NAT" );
    $sym41$INFERENCE_APPLICABLE_SDCT_ = makeSymbol( "INFERENCE-APPLICABLE-SDCT?" );
    $sym42$ASSERTION_P = makeSymbol( "ASSERTION-P" );
    $sym43$INFERENCE_EXCEPTED_ASSERTION__SHALLOW = makeSymbol( "INFERENCE-EXCEPTED-ASSERTION?-SHALLOW" );
    $sym44$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION_ = makeSymbol( "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?" );
    $int45$2048 = makeInteger( 2048 );
    $sym46$MEMOIZED_INFERENCE_EXCEPTED_ASSERTION__SHALLOW = makeSymbol( "MEMOIZED-INFERENCE-EXCEPTED-ASSERTION?-SHALLOW" );
    $list47 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "ASENT" ), makeSymbol( "SENSE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list48 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw49$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw50$DONE = makeKeyword( "DONE" );
    $sym51$DO_INFERENCE_GAF_LOOKUP_INDEX = makeSymbol( "DO-INFERENCE-GAF-LOOKUP-INDEX" );
    $sym52$DO_GAF_LOOKUP_INDEX = makeSymbol( "DO-GAF-LOOKUP-INDEX" );
    $sym53$INFERENCE_GAF_LOOKUP_INDEX = makeSymbol( "INFERENCE-GAF-LOOKUP-INDEX" );
    $kw54$TRUTH = makeKeyword( "TRUTH" );
    $sym55$SENSE_TRUTH = makeSymbol( "SENSE-TRUTH" );
    $sym56$INFERENCE_NUM_GAF_LOOKUP_INDEX = makeSymbol( "INFERENCE-NUM-GAF-LOOKUP-INDEX" );
    $sym57$INFERENCE_RELEVANT_NUM_GAF_LOOKUP_INDEX = makeSymbol( "INFERENCE-RELEVANT-NUM-GAF-LOOKUP-INDEX" );
    $sym58$INFERENCE_ARGNUMS_FROM_GAFS_MENTIONING_TERM = makeSymbol( "INFERENCE-ARGNUMS-FROM-GAFS-MENTIONING-TERM" );
    $sym59$INFERENCE_PREDS_FROM_GAFS_MENTIONING_TERM_AT_INDEX = makeSymbol( "INFERENCE-PREDS-FROM-GAFS-MENTIONING-TERM-AT-INDEX" );
    $sym60$INFERENCE_KEY_GAF_ARG_INDEX = makeSymbol( "INFERENCE-KEY-GAF-ARG-INDEX" );
    $sym61$PROBLEM_P = makeSymbol( "PROBLEM-P" );
    $list62 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) );
    $const63$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const64$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $sym65$INFERENCE_PREDICATE_BACKCHAIN_REQUIRED_ = makeSymbol( "INFERENCE-PREDICATE-BACKCHAIN-REQUIRED?" );
    $sym66$INFERENCE_BACKCHAIN_FORBIDDEN_ = makeSymbol( "INFERENCE-BACKCHAIN-FORBIDDEN?" );
    $sym67$INFERENCE_COLLECTION_ISA_BACKCHAIN_ENCOURAGED_ = makeSymbol( "INFERENCE-COLLECTION-ISA-BACKCHAIN-ENCOURAGED?" );
    $sym68$INFERENCE_COLLECTION_GENLS_BACKCHAIN_ENCOURAGED_ = makeSymbol( "INFERENCE-COLLECTION-GENLS-BACKCHAIN-ENCOURAGED?" );
    $sym69$INFERENCE_COLLECTION_BACKCHAIN_ENCOURAGED_ = makeSymbol( "INFERENCE-COLLECTION-BACKCHAIN-ENCOURAGED?" );
    $sym70$INFERENCE_COLLECTION_BACKCHAIN_REQUIRED_ = makeSymbol( "INFERENCE-COLLECTION-BACKCHAIN-REQUIRED?" );
    $sym71$INFERENCE_COLLECTION_ISA_BACKCHAIN_REQUIRED_ = makeSymbol( "INFERENCE-COLLECTION-ISA-BACKCHAIN-REQUIRED?" );
    $sym72$INFERENCE_COLLECTION_GENLS_BACKCHAIN_REQUIRED_ = makeSymbol( "INFERENCE-COLLECTION-GENLS-BACKCHAIN-REQUIRED?" );
    $const73$highlyRelevantMt = constant_handles.reader_make_constant_shell( makeString( "highlyRelevantMt" ) );
    $kw74$TRUE = makeKeyword( "TRUE" );
    $const75$highlyRelevantAssertion = constant_handles.reader_make_constant_shell( makeString( "highlyRelevantAssertion" ) );
    $const76$highlyRelevantPredAssertion = constant_handles.reader_make_constant_shell( makeString( "highlyRelevantPredAssertion" ) );
    $const77$highlyRelevantTerm = constant_handles.reader_make_constant_shell( makeString( "highlyRelevantTerm" ) );
    $const78$irrelevantMt = constant_handles.reader_make_constant_shell( makeString( "irrelevantMt" ) );
    $const79$irrelevantAssertion = constant_handles.reader_make_constant_shell( makeString( "irrelevantAssertion" ) );
    $const80$irrelevantPredAssertion = constant_handles.reader_make_constant_shell( makeString( "irrelevantPredAssertion" ) );
    $const81$irrelevantTerm = constant_handles.reader_make_constant_shell( makeString( "irrelevantTerm" ) );
    $const82$assertionUtility = constant_handles.reader_make_constant_shell( makeString( "assertionUtility" ) );
    $sym83$INFERENCE_KNOWN_SENTENCE_REMOVAL_QUERY = makeSymbol( "INFERENCE-KNOWN-SENTENCE-REMOVAL-QUERY" );
    $kw84$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $kw85$FALSE = makeKeyword( "FALSE" );
    $sym86$INFERENCE_TRUE_SENTENCE_RECURSIVE_QUERY = makeSymbol( "INFERENCE-TRUE-SENTENCE-RECURSIVE-QUERY" );
    $kw87$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $sym88$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE = makeSymbol( "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE" );
    $list89 = ConsesLow.list( makeSymbol( "MTS" ), makeSymbol( "SUPPORT-COMBINATION" ) );
    $sym90$INFERENCE_MTS_WHERE_GAF_SENTENCE_TRUE_JUSTIFIED_MEMOIZED = makeSymbol( "INFERENCE-MTS-WHERE-GAF-SENTENCE-TRUE-JUSTIFIED-MEMOIZED" );
    $const91$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw92$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw93$MIN_RULE_UTILITY = makeKeyword( "MIN-RULE-UTILITY" );
    $int94$_100 = makeInteger( -100 );
    $const95$TheSetOf = constant_handles.reader_make_constant_shell( makeString( "TheSetOf" ) );
    $sym96$INFERENCE_RULE_TYPE_CONSTRAINTS = makeSymbol( "INFERENCE-RULE-TYPE-CONSTRAINTS" );
  }

  public static final class $inference_predicate_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_predicate_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-PREDICATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_predicate_p( arg1 );
    }
  }

  public static final class $inference_symmetric_predicateP$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_symmetric_predicateP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-SYMMETRIC-PREDICATE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_symmetric_predicateP( arg1 );
    }
  }

  public static final class $inference_commutative_predicate_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_commutative_predicate_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-COMMUTATIVE-PREDICATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_commutative_predicate_p( arg1 );
    }
  }

  public static final class $inference_partially_commutative_predicate_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_partially_commutative_predicate_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_partially_commutative_predicate_p( arg1 );
    }
  }

  public static final class $inference_transitive_predicateP$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_transitive_predicateP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-TRANSITIVE-PREDICATE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_transitive_predicateP( arg1 );
    }
  }

  public static final class $inference_evaluatable_predicateP$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_evaluatable_predicateP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-EVALUATABLE-PREDICATE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_evaluatable_predicateP( arg1 );
    }
  }

  public static final class $inference_reflexive_predicateP$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_reflexive_predicateP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-REFLEXIVE-PREDICATE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_reflexive_predicateP( arg1 );
    }
  }

  public static final class $clear_indeterminate_term_p$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_indeterminate_term_p$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-INDETERMINATE-TERM-P" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_indeterminate_term_p();
    }
  }

  public static final class $inference_some_genl_pred_or_inverseP$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_some_genl_pred_or_inverseP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-SOME-GENL-PRED-OR-INVERSE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_some_genl_pred_or_inverseP( arg1 );
    }
  }

  public static final class $inference_some_spec_pred_or_inverseP$UnaryFunction
      extends
        UnaryFunction
  {
    public $inference_some_spec_pred_or_inverseP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "INFERENCE-SOME-SPEC-PRED-OR-INVERSE?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return inference_some_spec_pred_or_inverseP( arg1 );
    }
  }
}
/*
 *
 * Total time: 1586 ms
 *
 */