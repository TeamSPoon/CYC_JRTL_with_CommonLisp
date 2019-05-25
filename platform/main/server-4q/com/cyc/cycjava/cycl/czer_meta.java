package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class czer_meta
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.czer_meta";
  public static final String myFingerPrint = "122a246071f82f6a3c5534ea15ef28e135c562cfe575ad33d32b20ebc7375be2";
  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 7792L)
  private static SubLSymbol $meta_relation_somewhereP_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 10324L)
  private static SubLSymbol $possibly_meta_relation_somewhereP_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 20314L)
  private static SubLSymbol $cached_find_assertions_cycl_caching_state$;
  private static final SubLSymbol $sym0$EL_VAR_;
  private static final SubLSymbol $sym1$TRUE;
  private static final SubLSymbol $sym2$GAF_ASSERTION_;
  private static final SubLSymbol $sym3$RULE_ASSERTION_;
  private static final SubLSymbol $sym4$ASSERTED_ASSERTION_;
  private static final SubLSymbol $sym5$DEDUCED_ASSERTION_;
  private static final SubLSymbol $sym6$NL_SEMANTIC_ASSERTION_;
  private static final SubLSymbol $sym7$META_RELATION_SOMEWHERE_;
  private static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const9$EverythingPSC;
  private static final SubLSymbol $sym10$_META_RELATION_SOMEWHERE__CACHING_STATE_;
  private static final SubLSymbol $sym11$CLEAR_META_RELATION_SOMEWHERE_;
  private static final SubLSymbol $sym12$POSSIBLY_META_RELATION_SOMEWHERE__CACHED;
  private static final SubLSymbol $sym13$_POSSIBLY_META_RELATION_SOMEWHERE__CACHED_CACHING_STATE_;
  private static final SubLSymbol $sym14$CLEAR_POSSIBLY_META_RELATION_SOMEWHERE__CACHED;
  private static final SubLSymbol $kw15$DEFAULT;
  private static final SubLSymbol $sym16$CACHED_FIND_ASSERTIONS_CYCL;
  private static final SubLSymbol $sym17$_CACHED_FIND_ASSERTIONS_CYCL_CACHING_STATE_;
  private static final SubLSymbol $sym18$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_CNF_;
  private static final SubLSymbol $sym19$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_GAF_;
  private static final SubLList $list20;
  private static final SubLSymbol $kw21$ASSERT;
  private static final SubLString $str22$Cannot_set_tense_czer_to_invalid_;
  private static final SubLObject $const23$True;
  private static final SubLObject $const24$False;
  private static final SubLSymbol $sym25$EL_META_FORMULA_;
  private static final SubLSymbol $sym26$EXPRESS_AS_META_FORMULA;
  private static final SubLSymbol $sym27$GROUND_EL_META_FORMULA_;
  private static final SubLString $str28$invalid_meta_arg___s;
  private static final SubLSymbol $kw29$IGNORE;
  private static final SubLSymbol $sym30$KB_ASSERTION_;
  private static final SubLSymbol $kw31$REGULARIZE;

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 413L)
  public static SubLObject has_exceptionP(final SubLObject assertion)
  {
    SubLObject exceptionP = NIL;
    if( NIL == exceptionP )
    {
      SubLObject csome_list_var = assertion_utilities.all_meta_assertions( assertion );
      SubLObject meta_assertion = NIL;
      meta_assertion = csome_list_var.first();
      while ( NIL == exceptionP && NIL != csome_list_var)
      {
        if( NIL != el_utilities.el_exception_p( uncanonicalizer.assertion_el_formula( meta_assertion ) ) )
        {
          exceptionP = T;
        }
        csome_list_var = csome_list_var.rest();
        meta_assertion = csome_list_var.first();
      }
    }
    return exceptionP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 784L)
  public static SubLObject accessible_kb_assertions(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != el_utilities.mt_designating_literalP( sentence ) )
    {
      return find_kb_assertions( el_utilities.designated_sentence( sentence ), el_utilities.designated_mt( sentence ) );
    }
    return accessible_assertions_cycl( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 1227L)
  public static SubLObject accessible_kb_assertionsP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject sentence_assertions = accessible_kb_assertions( sentence, mt );
    if( NIL != sentence_assertions )
    {
      return makeBoolean( NIL == subl_promotions.memberP( NIL, sentence_assertions, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 1617L)
  public static SubLObject accessible_assertions_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sentence_assertions = NIL;
    SubLObject canon_versions = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      final SubLObject _prev_bind_0_$1 = control_vars.$within_assert$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = control_vars.$within_ask$.currentBinding( thread );
      final SubLObject _prev_bind_3 = czer_vars.$recanonicalizingP$.currentBinding( thread );
      try
      {
        control_vars.$within_assert$.bind( NIL, thread );
        control_vars.$within_ask$.bind( NIL, thread );
        czer_vars.$recanonicalizingP$.bind( T, thread );
        canon_versions = czer_main.canonicalize_wf_cycl( sentence, UNPROVIDED );
      }
      finally
      {
        czer_vars.$recanonicalizingP$.rebind( _prev_bind_3, thread );
        control_vars.$within_ask$.rebind( _prev_bind_1_$2, thread );
        control_vars.$within_assert$.rebind( _prev_bind_0_$1, thread );
      }
      if( canon_versions.isCons() )
      {
        SubLObject cdolist_list_var = canon_versions;
        SubLObject canon_version = NIL;
        canon_version = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          SubLObject cnf_assertions = NIL;
          thread.resetMultipleValues();
          final SubLObject cnf = fi.fi_canonicalize( canon_version, T, UNPROVIDED );
          final SubLObject v_variables = thread.secondMultipleValue();
          final SubLObject rm_tv = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL == clauses.neg_lits( cnf ) && NIL != list_utilities.singletonP( clauses.pos_lits( cnf ) ) && NIL != el_utilities.mt_designating_literalP( clauses.pos_lits( cnf ).first() ) && NIL != hlmt.hlmt_p(
              el_utilities.designated_mt( clauses.pos_lits( cnf ).first() ) ) )
          {
            final SubLObject literal = clauses.pos_lits( cnf ).first();
            SubLObject cdolist_list_var_$3 = find_kb_assertions( el_utilities.designated_sentence( literal ), el_utilities.designated_mt( literal ) );
            SubLObject assertion = NIL;
            assertion = cdolist_list_var_$3.first();
            while ( NIL != cdolist_list_var_$3)
            {
              cnf_assertions = ConsesLow.cons( assertion, cnf_assertions );
              cdolist_list_var_$3 = cdolist_list_var_$3.rest();
              assertion = cdolist_list_var_$3.first();
            }
          }
          else
          {
            SubLObject cdolist_list_var_$4 = kb_indexing.find_all_assertions( cnf );
            SubLObject assertion2 = NIL;
            assertion2 = cdolist_list_var_$4.first();
            while ( NIL != cdolist_list_var_$4)
            {
              if( NIL != mt_relevance_macros.relevant_mtP( assertions_high.assertion_mt( assertion2 ) ) )
              {
                cnf_assertions = ConsesLow.cons( assertion2, cnf_assertions );
              }
              cdolist_list_var_$4 = cdolist_list_var_$4.rest();
              assertion2 = cdolist_list_var_$4.first();
            }
          }
          sentence_assertions = ConsesLow.cons( cnf_assertions, sentence_assertions );
          cdolist_list_var = cdolist_list_var.rest();
          canon_version = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return sentence_assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 2793L)
  public static SubLObject kb_versions(final SubLObject el_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != wff.el_wffP( el_object, mt, UNPROVIDED ) )
    {
      return find_kb_assertions( el_object, mt );
    }
    if( NIL != term.ground_nautP( el_object, Symbols.symbol_function( $sym0$EL_VAR_ ) ) )
    {
      return list_utilities.list_if( narts_high.find_nart( el_object ) );
    }
    return ConsesLow.list( el_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 3125L)
  public static SubLObject literal_meta_args(final SubLObject literal, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject n = ZERO_INTEGER;
    final SubLObject meta_pred = el_utilities.literal_arg0( literal, UNPROVIDED );
    SubLObject args = NIL;
    SubLObject cdolist_list_var = el_utilities.literal_args( literal, UNPROVIDED );
    SubLObject arg = NIL;
    arg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      n = Numbers.add( n, ONE_INTEGER );
      if( NIL != possibly_meta_argP( meta_pred, n, mt ) )
      {
        args = ConsesLow.cons( arg, args );
      }
      cdolist_list_var = cdolist_list_var.rest();
      arg = cdolist_list_var.first();
    }
    return Sequences.nreverse( args );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 3522L)
  public static SubLObject el_assertion_specP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return el_constrained_assertion_specP( sentence, Symbols.symbol_function( $sym1$TRUE ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 3895L)
  public static SubLObject el_gaf_assertion_specP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return el_constrained_assertion_specP( sentence, Symbols.symbol_function( $sym2$GAF_ASSERTION_ ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 4213L)
  public static SubLObject el_rule_assertion_specP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return el_constrained_assertion_specP( sentence, Symbols.symbol_function( $sym3$RULE_ASSERTION_ ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 4535L)
  public static SubLObject el_asserted_assertion_specP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return el_constrained_assertion_specP( sentence, Symbols.symbol_function( $sym4$ASSERTED_ASSERTION_ ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 4875L)
  public static SubLObject el_deduced_assertion_specP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return el_constrained_assertion_specP( sentence, Symbols.symbol_function( $sym5$DEDUCED_ASSERTION_ ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 5209L)
  public static SubLObject el_constrained_assertion_specP(final SubLObject sentence, final SubLObject constraint, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject passP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      thread.resetMultipleValues();
      final SubLObject assertions = find_kb_assertions( sentence, UNPROVIDED );
      final SubLObject some_not_foundP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != assertions )
      {
        if( NIL == some_not_foundP )
        {
          if( NIL != list_utilities.singletonP( assertions ) )
          {
            passP = Functions.funcall( constraint, assertions.first() );
          }
          else if( NIL != czer_vars.$distributing_meta_knowledgeP$.getDynamicValue( thread ) )
          {
            passP = Types.sublisp_null( list_utilities.find_if_not( constraint, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
          }
          else if( NIL != czer_vars.$distribute_meta_over_common_elP$.getDynamicValue( thread ) )
          {
            passP = makeBoolean( NIL == list_utilities.find_if_not( constraint, assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED ) && NIL != common_el_sentencesP( assertions ) );
          }
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return passP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 6136L)
  public static SubLObject el_nl_semantic_assertion_specP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return el_constrained_assertion_specP( sentence, Symbols.symbol_function( $sym6$NL_SEMANTIC_ASSERTION_ ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 6502L)
  public static SubLObject common_el_sentencesP(final SubLObject assertions)
  {
    if( NIL != list_utilities.singletonP( assertions ) )
    {
      return assertion_handles.assertion_p( assertions.first() );
    }
    if( NIL != assertions )
    {
      SubLObject el_sentence = NIL;
      SubLObject uncommonP = NIL;
      if( NIL == uncommonP )
      {
        SubLObject csome_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = csome_list_var.first();
        while ( NIL == uncommonP && NIL != csome_list_var)
        {
          if( NIL != el_sentence )
          {
            uncommonP = makeBoolean( NIL == assertion_handles.assertion_p( assertion ) || !el_sentence.equal( uncanonicalizer.assertion_el_formula( assertion ) ) );
          }
          else
          {
            el_sentence = uncanonicalizer.assertion_el_formula( assertion );
          }
          csome_list_var = csome_list_var.rest();
          assertion = csome_list_var.first();
        }
      }
      return makeBoolean( NIL == uncommonP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 7061L)
  public static SubLObject meta_predicateP(final SubLObject symbol, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != fort_types_interface.predicateP( symbol ) && NIL != meta_relationP( symbol, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 7385L)
  public static SubLObject meta_relationP(final SubLObject symbol, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != kb_accessors.relationP( symbol ) && NIL == term.mt_designating_relationP( symbol ) && NIL != meta_relation_somewhereP( symbol ) && NIL != meta_relation_intP( symbol, mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 7792L)
  public static SubLObject clear_meta_relation_somewhereP()
  {
    final SubLObject cs = $meta_relation_somewhereP_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 7792L)
  public static SubLObject remove_meta_relation_somewhereP(final SubLObject relation)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $meta_relation_somewhereP_caching_state$.getGlobalValue(), ConsesLow.list( relation ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 7792L)
  public static SubLObject meta_relation_somewhereP_internal(final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
      v_answer = meta_relation_intP( relation, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 7792L)
  public static SubLObject meta_relation_somewhereP(final SubLObject relation)
  {
    SubLObject caching_state = $meta_relation_somewhereP_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym7$META_RELATION_SOMEWHERE_, $sym10$_META_RELATION_SOMEWHERE__CACHING_STATE_, NIL, EQL, ONE_INTEGER, ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym11$CLEAR_META_RELATION_SOMEWHERE_ );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( meta_relation_somewhereP_internal( relation ) ) );
      memoization_state.caching_state_put( caching_state, relation, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 8056L)
  public static SubLObject meta_relation_intP(final SubLObject symbol, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject max_arity = arity.max_arity( symbol );
    SubLObject okP = NIL;
    if( NIL == max_arity )
    {
      max_arity = FIVE_INTEGER;
    }
    if( NIL == okP )
    {
      SubLObject end_var;
      SubLObject index;
      SubLObject quoted_pred;
      for( end_var = number_utilities.f_1X( max_arity ), index = NIL, index = ONE_INTEGER; NIL == okP && !index.numGE( end_var ); index = number_utilities.f_1X( index ) )
      {
        quoted_pred = kb_accessors.arg_quoted_isa_pred( index, UNPROVIDED, UNPROVIDED );
        if( NIL == okP && NIL != forts.fort_p( quoted_pred ) )
        {
          okP = genls.genl_of_any_argP( czer_vars.$meta_arg_type$.getGlobalValue(), symbol, quoted_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
      }
    }
    return okP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 8561L)
  public static SubLObject sentence_with_meta_predicateP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return meta_predicateP( cycl_utilities.formula_operator( sentence ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 8765L)
  public static SubLObject sentence_with_meta_relationP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return meta_relationP( cycl_utilities.formula_operator( sentence ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 8966L)
  public static SubLObject possibly_meta_predicateP(final SubLObject symbol, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != fort_types_interface.predicateP( symbol ) && NIL == term.mt_designating_relationP( symbol ) && NIL != possibly_meta_relation_somewhereP( symbol ) && ( NIL != possibly_meta_relation_intP(
        symbol, mt ) || NIL != meta_relation_intP( symbol, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 9561L)
  public static SubLObject possibly_meta_relationP(final SubLObject symbol, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != kb_accessors.relationP( symbol ) && NIL == term.mt_designating_relationP( symbol ) && NIL != possibly_meta_relation_somewhereP( symbol ) && ( NIL != possibly_meta_relation_intP( symbol,
        mt ) || NIL != meta_relation_intP( symbol, mt ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 10154L)
  public static SubLObject possibly_meta_relation_somewhereP(final SubLObject relation)
  {
    return makeBoolean( NIL != meta_relation_somewhereP( relation ) || NIL != possibly_meta_relation_somewhereP_cached( relation ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 10324L)
  public static SubLObject clear_possibly_meta_relation_somewhereP_cached()
  {
    final SubLObject cs = $possibly_meta_relation_somewhereP_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 10324L)
  public static SubLObject remove_possibly_meta_relation_somewhereP_cached(final SubLObject relation)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $possibly_meta_relation_somewhereP_cached_caching_state$.getGlobalValue(), ConsesLow.list( relation ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 10324L)
  public static SubLObject possibly_meta_relation_somewhereP_cached_internal(final SubLObject relation)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_answer = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
      v_answer = possibly_meta_relation_intP( relation, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 10324L)
  public static SubLObject possibly_meta_relation_somewhereP_cached(final SubLObject relation)
  {
    SubLObject caching_state = $possibly_meta_relation_somewhereP_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym12$POSSIBLY_META_RELATION_SOMEWHERE__CACHED, $sym13$_POSSIBLY_META_RELATION_SOMEWHERE__CACHED_CACHING_STATE_, NIL, EQL, ONE_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym14$CLEAR_POSSIBLY_META_RELATION_SOMEWHERE__CACHED );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( possibly_meta_relation_somewhereP_cached_internal( relation ) ) );
      memoization_state.caching_state_put( caching_state, relation, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 10661L)
  public static SubLObject possibly_meta_relation_intP(final SubLObject symbol, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return conses_high.member( czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.arg_quoted_isa( symbol, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 10798L)
  public static SubLObject sentence_with_possibly_meta_predicateP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return possibly_meta_predicateP( cycl_utilities.formula_operator( sentence ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 11060L)
  public static SubLObject sentence_with_possibly_meta_relationP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return possibly_meta_relationP( cycl_utilities.formula_operator( sentence ), mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 11288L)
  public static SubLObject possibly_meta_argP(final SubLObject meta_pred, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != possibly_but_not_definitely_meta_argP( meta_pred, n, mt ) )
    {
      return T;
    }
    return definitely_meta_argP( meta_pred, n, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 11592L)
  public static SubLObject possibly_but_not_definitely_meta_argP(final SubLObject meta_pred, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return subl_promotions.memberP( czer_vars.$possibly_meta_arg_type$.getGlobalValue(), kb_accessors.argn_quoted_isa( meta_pred, n, mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 11753L)
  public static SubLObject definitely_meta_argP(final SubLObject meta_pred, final SubLObject n, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLObject quoted_arg_isa_pred = kb_accessors.arg_quoted_isa_pred( n, UNPROVIDED, UNPROVIDED );
    if( NIL != forts.fort_p( quoted_arg_isa_pred ) )
    {
      return genls.genl_of_any_argP( czer_vars.$meta_arg_type$.getGlobalValue(), meta_pred, quoted_arg_isa_pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 12073L)
  public static SubLObject find_assertion_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != el_utilities.el_formula_p( sentence ) || NIL != term.kb_assertionP( sentence ) )
    {
      return find_kb_assertions( sentence, mt ).first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 12559L)
  public static SubLObject find_unique_assertion_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_formula_p( sentence ) || NIL != term.kb_assertionP( sentence ) )
    {
      thread.resetMultipleValues();
      final SubLObject assertions = find_kb_assertions( sentence, mt );
      final SubLObject some_missingP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != list_utilities.singletonP( assertions ) && NIL == some_missingP )
      {
        return assertions.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 12970L)
  public static SubLObject find_visible_assertion_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != el_utilities.el_formula_p( sentence ) || NIL != term.kb_assertionP( sentence ) )
    {
      final SubLObject assertions = find_visible_kb_assertions( sentence, mt );
      if( NIL != list_utilities.singletonP( assertions ) )
      {
        return assertions.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 13320L)
  public static SubLObject find_kb_assertions(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != term.kb_assertionP( sentence ) )
    {
      return Values.values( ConsesLow.list( sentence ), NIL );
    }
    if( NIL != el_utilities.mt_designating_literalP( sentence ) )
    {
      return find_kb_assertions( el_utilities.designated_sentence( sentence ), el_utilities.designated_mt( sentence ) );
    }
    return find_assertions_cycl( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 13638L)
  public static SubLObject find_visible_kb_assertions(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != term.kb_assertionP( sentence ) )
    {
      return find_visible_sibling_mt_assertions( sentence );
    }
    if( NIL != el_utilities.mt_designating_literalP( sentence ) )
    {
      return find_visible_kb_assertions( el_utilities.designated_sentence( sentence ), el_utilities.designated_mt( sentence ) );
    }
    return find_visible_assertions_cycl( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 13996L)
  public static SubLObject find_visible_sibling_mt_assertions(final SubLObject assertion)
  {
    final SubLObject sibling_assertions = kb_indexing.sibling_mt_assertions( assertion, UNPROVIDED );
    final SubLObject assertion_mt = assertions_high.assertion_mt( assertion );
    SubLObject assertions = NIL;
    SubLObject cdolist_list_var = sibling_assertions;
    SubLObject sibling_assertion = NIL;
    sibling_assertion = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != genl_mts.genl_mtP( assertion_mt, assertions_high.assertion_mt( sibling_assertion ), UNPROVIDED, UNPROVIDED ) )
      {
        assertions = ConsesLow.cons( sibling_assertion, assertions );
      }
      cdolist_list_var = cdolist_list_var.rest();
      sibling_assertion = cdolist_list_var.first();
    }
    assertions = ConsesLow.cons( assertion, assertions );
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 14404L)
  public static SubLObject find_some_assertion_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != el_utilities.el_formula_p( sentence ) )
    {
      final SubLObject assertions = find_kb_assertions( sentence, mt );
      if( NIL != assertions )
      {
        return assertions.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 14624L)
  public static SubLObject all_kb_assertions_findableP(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject assertions = find_kb_assertions( sentence, mt );
    final SubLObject some_missingP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return makeBoolean( NIL != assertions && NIL == some_missingP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 14842L)
  public static SubLObject recanonicalized_candidate_assertion_equals_cnfP(final SubLObject goofball, final SubLObject cnf)
  {
    return Equality.equal( recanonicalize_candidate_assertion(), cnf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 15174L)
  public static SubLObject recanonicalized_candidate_assertion_equals_gafP(final SubLObject goofball, final SubLObject gaf)
  {
    return Equality.equal( clause_utilities.gaf_cnf_literal( recanonicalize_candidate_assertion() ), gaf );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 15524L)
  public static SubLObject recanonicalize_candidate_assertion()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.memberP( control_vars.$candidate_assertion$.getDynamicValue( thread ), czer_vars.$recanonicalizing_candidate_assertion_stack$.getDynamicValue( thread ), Symbols.symbol_function( EQ ),
        UNPROVIDED ) )
    {
      return NIL;
    }
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$recanonicalizing_candidate_assertion_stack$.currentBinding( thread );
    try
    {
      at_vars.$noting_at_violationsP$.bind( NIL, thread );
      czer_vars.$recanonicalizing_candidate_assertion_stack$.bind( ConsesLow.cons( control_vars.$candidate_assertion$.getDynamicValue( thread ), czer_vars.$recanonicalizing_candidate_assertion_stack$.getDynamicValue(
          thread ) ), thread );
      result = czer_utilities.extract_hl_clauses( czer_main.canonicalize_wf_cycl( fi.assertion_fi_formula( control_vars.$candidate_assertion$.getDynamicValue( thread ), UNPROVIDED ), assertions_high.assertion_mt(
          control_vars.$candidate_assertion$.getDynamicValue( thread ) ) ) ).first();
    }
    finally
    {
      czer_vars.$recanonicalizing_candidate_assertion_stack$.rebind( _prev_bind_2, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 16375L)
  public static SubLObject candidate_assertion_el_formula()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( control_vars.$candidate_assertion$.getDynamicValue( thread ) ) )
    {
      return uncanonicalizer.assertion_el_formula( control_vars.$candidate_assertion$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 17214L)
  public static SubLObject candidate_assertion_fi_formula()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != assertion_handles.assertion_p( control_vars.$candidate_assertion$.getDynamicValue( thread ) ) )
    {
      return fi.assertion_fi_formula( control_vars.$candidate_assertion$.getDynamicValue( thread ), T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 17531L)
  public static SubLObject robust_assertion_lookupP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $kw15$DEFAULT == czer_vars.$robust_assertion_lookup$.getDynamicValue( thread ) )
    {
      return NIL;
    }
    return czer_vars.$robust_assertion_lookup$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 18221L)
  public static SubLObject find_assertions_cycl_in_mt(final SubLObject sentence, final SubLObject mt, final SubLObject use_genl_mtsP)
  {
    if( NIL != use_genl_mtsP )
    {
      return find_visible_assertions_cycl( sentence, mt );
    }
    return find_assertions_cycl( sentence, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 18421L)
  public static SubLObject find_assertions_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.el_formula_p( sentence ) )
    {
      final SubLObject fort_mt = cycl_utilities.reify_when_closed_naut( mt );
      if( NIL == hlmt.hlmt_p( fort_mt ) )
      {
        return Values.values( NIL, NIL );
      }
      if( NIL != czer_vars.$within_canonicalizerP$.getDynamicValue( thread ) || NIL != wff_vars.$within_wffP$.getDynamicValue( thread ) )
      {
        return cached_find_assertions_cycl( sentence, fort_mt, NIL );
      }
      return find_assertions_cycl_int( sentence, fort_mt, NIL );
    }
    else
    {
      if( NIL != term.kb_assertionP( sentence ) )
      {
        return Values.values( ConsesLow.list( sentence ), NIL );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 19567L)
  public static SubLObject find_visible_assertions_cycl(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != mt_relevance_macros.any_or_all_mts_relevant_to_mtP( mt ) && NIL != el_utilities.el_formula_p( sentence ) )
    {
      SubLObject result = NIL;
      SubLObject missingP = NIL;
      final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$relevant_mt_function$.bind( $sym8$RELEVANT_MT_IS_EVERYTHING, thread );
        mt_relevance_macros.$mt$.bind( $const9$EverythingPSC, thread );
        thread.resetMultipleValues();
        final SubLObject result_$5 = find_assertions_cycl( sentence, UNPROVIDED );
        final SubLObject missingP_$6 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$5;
        missingP = missingP_$6;
      }
      finally
      {
        mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
      }
      return Values.values( result, missingP );
    }
    if( NIL != el_utilities.el_formula_p( sentence ) )
    {
      final SubLObject fort_mt = cycl_utilities.reify_when_closed_naut( mt );
      if( NIL != czer_vars.$within_canonicalizerP$.getDynamicValue( thread ) || NIL != wff_vars.$within_wffP$.getDynamicValue( thread ) )
      {
        return cached_find_assertions_cycl( sentence, fort_mt, T );
      }
      return find_assertions_cycl_int( sentence, fort_mt, T );
    }
    else
    {
      if( NIL != term.kb_assertionP( sentence ) )
      {
        return find_visible_sibling_mt_assertions( sentence );
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 20314L)
  public static SubLObject clear_cached_find_assertions_cycl()
  {
    final SubLObject cs = $cached_find_assertions_cycl_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 20314L)
  public static SubLObject remove_cached_find_assertions_cycl(final SubLObject sentence, final SubLObject mt, final SubLObject include_genl_mtsP)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $cached_find_assertions_cycl_caching_state$.getGlobalValue(), ConsesLow.list( sentence, mt, include_genl_mtsP ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 20314L)
  public static SubLObject cached_find_assertions_cycl_internal(final SubLObject sentence, final SubLObject mt, final SubLObject include_genl_mtsP)
  {
    return find_assertions_cycl_int( sentence, mt, include_genl_mtsP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 20314L)
  public static SubLObject cached_find_assertions_cycl(final SubLObject sentence, final SubLObject mt, final SubLObject include_genl_mtsP)
  {
    SubLObject caching_state = $cached_find_assertions_cycl_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym16$CACHED_FIND_ASSERTIONS_CYCL, $sym17$_CACHED_FIND_ASSERTIONS_CYCL_CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, EIGHT_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( sentence, mt, include_genl_mtsP );
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
        if( sentence.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && include_genl_mtsP.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( cached_find_assertions_cycl_internal( sentence, mt, include_genl_mtsP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( sentence, mt, include_genl_mtsP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 20477L)
  public static SubLObject find_assertions_cycl_int(final SubLObject sentence, final SubLObject mt, final SubLObject include_genl_mtsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject result = find_assertions_cycl_int_2( sentence, mt, include_genl_mtsP );
    SubLObject missingP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == result && NIL != robust_assertion_lookupP() )
    {
      final SubLObject _prev_bind_0 = control_vars.$cnf_matching_predicate$.currentBinding( thread );
      final SubLObject _prev_bind_2 = control_vars.$gaf_matching_predicate$.currentBinding( thread );
      try
      {
        control_vars.$cnf_matching_predicate$.bind( $sym18$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_CNF_, thread );
        control_vars.$gaf_matching_predicate$.bind( $sym19$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_GAF_, thread );
        thread.resetMultipleValues();
        final SubLObject result_$7 = find_assertions_cycl_int_2( sentence, mt, include_genl_mtsP );
        final SubLObject missingP_$8 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$7;
        missingP = missingP_$8;
      }
      finally
      {
        control_vars.$gaf_matching_predicate$.rebind( _prev_bind_2, thread );
        control_vars.$cnf_matching_predicate$.rebind( _prev_bind_0, thread );
      }
    }
    return Values.values( result, missingP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 21106L)
  public static SubLObject find_assertions_cycl_int_2(final SubLObject sentence, SubLObject mt, final SubLObject include_genl_mtsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject new_var_sentence = czer_main.el_nununiquify_vars( sentence );
    SubLObject all_assertions = NIL;
    SubLObject canon_cnf_tvs = NIL;
    SubLObject blists = NIL;
    SubLObject missingP = NIL;
    thread.resetMultipleValues();
    final SubLObject canon_cnf_tvs_$9 = canon_cnfs_sentence( new_var_sentence, T, mt );
    final SubLObject blists_$10 = thread.secondMultipleValue();
    final SubLObject mt_$11 = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    canon_cnf_tvs = canon_cnf_tvs_$9;
    blists = blists_$10;
    mt = mt_$11;
    if( NIL == cycl_grammar.cycl_truth_value_p( blists ) )
    {
      SubLObject cnf_tv = NIL;
      SubLObject cnf_tv_$12 = NIL;
      SubLObject blist = NIL;
      SubLObject blist_$13 = NIL;
      cnf_tv = canon_cnf_tvs;
      cnf_tv_$12 = cnf_tv.first();
      blist = blists;
      blist_$13 = blist.first();
      while ( NIL != blist || NIL != cnf_tv)
      {
        SubLObject current;
        final SubLObject datum = current = cnf_tv_$12;
        SubLObject cnf = NIL;
        SubLObject hl_tv = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
        cnf = current.first();
        current = ( hl_tv = current.rest() );
        final SubLObject assertions_for_cnf = find_assertions_from_cnf( cnf, blist_$13, mt, include_genl_mtsP );
        if( NIL == assertions_for_cnf )
        {
          missingP = T;
        }
        SubLObject cdolist_list_var = assertions_for_cnf;
        SubLObject assertion_for_cnf = NIL;
        assertion_for_cnf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject assertion_tv = assertions_high.cyc_assertion_tv( assertion_for_cnf );
          if( ( NIL != enumeration_types.tv_trueP( hl_tv ) && NIL != enumeration_types.tv_unknownP( assertion_tv ) ) || ( NIL != enumeration_types.tv_trueP( hl_tv ) && NIL != enumeration_types.tv_trueP( assertion_tv ) )
              || ( NIL != enumeration_types.tv_falseP( hl_tv ) && NIL != enumeration_types.tv_falseP( assertion_tv ) ) )
          {
            all_assertions = ConsesLow.cons( assertion_for_cnf, all_assertions );
          }
          cdolist_list_var = cdolist_list_var.rest();
          assertion_for_cnf = cdolist_list_var.first();
        }
        cnf_tv = cnf_tv.rest();
        cnf_tv_$12 = cnf_tv.first();
        blist = blist.rest();
        blist_$13 = blist.first();
      }
    }
    if( NIL == all_assertions )
    {
      missingP = T;
    }
    return Values.values( Sequences.nreverse( all_assertions ), missingP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 22610L)
  public static SubLObject find_assertions_from_cnf(final SubLObject cnf, final SubLObject blist, final SubLObject mt, final SubLObject include_genl_mtsP)
  {
    SubLObject assertions_for_cnf = NIL;
    if( NIL != clause_utilities.pos_atomic_cnf_p( cnf ) && NIL != el_utilities.mt_designating_literalP( clause_utilities.atomic_cnf_asent( cnf ) ) && NIL != hlmt.hlmt_p( el_utilities.designated_mt( clause_utilities
        .atomic_cnf_asent( cnf ) ) ) )
    {
      final SubLObject new_assertions = find_assertions_from_mt_designating_literal( cnf, blist );
      assertions_for_cnf = ConsesLow.nconc( assertions_for_cnf, new_assertions );
    }
    if( NIL != kb_accessors.decontextualized_atomic_cnfP( cnf ) )
    {
      final SubLObject new_assertions = find_assertions_from_decontextualized_literal( cnf, mt );
      assertions_for_cnf = ConsesLow.nconc( assertions_for_cnf, new_assertions );
    }
    else
    {
      final SubLObject new_assertions = ( NIL != mt_relevance_macros.all_mts_are_relevantP() ) ? kb_indexing.find_all_assertions( cnf )
          : ( ( NIL != include_genl_mtsP ) ? indexing_utilities.find_all_assertions_genl_mts( cnf, mt ) : removal_module_utilities.non_null_answer_to_singleton( kb_indexing.find_assertion( cnf, mt ) ) );
      if( NIL != new_assertions )
      {
        assertions_for_cnf = ConsesLow.nconc( assertions_for_cnf, new_assertions );
      }
    }
    return assertions_for_cnf;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 23813L)
  public static SubLObject find_assertions_from_mt_designating_literal(final SubLObject cnf, final SubLObject blist)
  {
    final SubLObject asent = clause_utilities.atomic_cnf_asent( cnf );
    return find_kb_assertions( cycl_utilities.expression_sublis( list_utilities.flip_alist( blist ), el_utilities.designated_sentence( asent ), UNPROVIDED, UNPROVIDED ), el_utilities.designated_mt( asent ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 24400L)
  public static SubLObject find_assertions_from_decontextualized_literal(final SubLObject cnf, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject new_assertions = NIL;
    if( NIL != czer_vars.$find_uncanonical_decontextualized_assertionsP$.getDynamicValue( thread ) )
    {
      new_assertions = kb_indexing.find_all_assertions( cnf );
    }
    else
    {
      final SubLObject convention_mt = kb_accessors.possibly_convention_mt_for_decontextualized_cnf( mt, cnf );
      new_assertions = ConsesLow.list( kb_indexing.find_assertion( cnf, convention_mt ) );
    }
    return new_assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 24818L)
  public static SubLObject canon_versions(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject canon_versions = NIL;
    final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_6 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      at_vars.$noting_at_violationsP$.bind( NIL, thread );
      at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
      wff_vars.$noting_wff_violationsP$.bind( NIL, thread );
      wff_vars.$accumulating_wff_violationsP$.bind( NIL, thread );
      control_vars.$within_assert$.bind( NIL, thread );
      control_vars.$within_ask$.bind( NIL, thread );
      canon_versions = czer_main.canonicalize_wf_cycl( sentence, mt );
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_6, thread );
      control_vars.$within_assert$.rebind( _prev_bind_5, thread );
      wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_4, thread );
      wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_3, thread );
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_2, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return canon_versions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 25352L)
  public static SubLObject canon_versions_sentence(final SubLObject sentence, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject canon_versions = NIL;
    final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = control_vars.$within_assert$.currentBinding( thread );
    final SubLObject _prev_bind_6 = control_vars.$within_ask$.currentBinding( thread );
    try
    {
      at_vars.$noting_at_violationsP$.bind( NIL, thread );
      at_vars.$accumulating_at_violationsP$.bind( NIL, thread );
      wff_vars.$noting_wff_violationsP$.bind( NIL, thread );
      wff_vars.$accumulating_wff_violationsP$.bind( NIL, thread );
      control_vars.$within_assert$.bind( NIL, thread );
      control_vars.$within_ask$.bind( NIL, thread );
      if( NIL == czer_vars.valid_tense_czer_mode_p( $kw21$ASSERT ) )
      {
        Errors.error( $str22$Cannot_set_tense_czer_to_invalid_ );
      }
      final SubLObject _prev_bind_0_$14 = czer_vars.$tense_czer_mode$.currentBinding( thread );
      try
      {
        czer_vars.$tense_czer_mode$.bind( $kw21$ASSERT, thread );
        thread.resetMultipleValues();
        final SubLObject canon_versions_$15 = czer_main.canonicalize_wf_cycl_sentence( sentence, mt );
        final SubLObject mt_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_versions = canon_versions_$15;
        mt = mt_$16;
      }
      finally
      {
        czer_vars.$tense_czer_mode$.rebind( _prev_bind_0_$14, thread );
      }
    }
    finally
    {
      control_vars.$within_ask$.rebind( _prev_bind_6, thread );
      control_vars.$within_assert$.rebind( _prev_bind_5, thread );
      wff_vars.$accumulating_wff_violationsP$.rebind( _prev_bind_4, thread );
      wff_vars.$noting_wff_violationsP$.rebind( _prev_bind_3, thread );
      at_vars.$accumulating_at_violationsP$.rebind( _prev_bind_2, thread );
      at_vars.$noting_at_violationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( canon_versions, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 25880L)
  public static SubLObject canon_cnfs(final SubLObject sentence, SubLObject canon_gafP, SubLObject mt)
  {
    if( canon_gafP == UNPROVIDED )
    {
      canon_gafP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject canon_versions = canon_versions( sentence, mt );
    final SubLObject blists = czer_utilities.extract_blists( canon_versions );
    SubLObject result = NIL;
    if( NIL != el_utilities.el_formula_p( canon_versions ) )
    {
      SubLObject cdolist_list_var = canon_versions;
      SubLObject canon_version = NIL;
      canon_version = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject cnf = fi.fi_canonicalize( canon_version, canon_gafP, UNPROVIDED );
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != canon_gafP )
        {
          result = ConsesLow.cons( ConsesLow.cons( cnf, hl_tv ), result );
        }
        else
        {
          result = ConsesLow.cons( cnf, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        canon_version = cdolist_list_var.first();
      }
    }
    return Values.values( Sequences.nreverse( result ), blists );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 26554L)
  public static SubLObject canon_cnfs_sentence(final SubLObject sentence, SubLObject canon_gafP, SubLObject mt)
  {
    if( canon_gafP == UNPROVIDED )
    {
      canon_gafP = NIL;
    }
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject canon_versions = NIL;
    thread.resetMultipleValues();
    final SubLObject canon_versions_$17 = canon_versions_sentence( sentence, mt );
    final SubLObject mt_$18 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    canon_versions = canon_versions_$17;
    mt = mt_$18;
    final SubLObject blists = czer_utilities.extract_blists( canon_versions );
    SubLObject result = NIL;
    if( NIL != el_utilities.el_formula_p( canon_versions ) )
    {
      SubLObject cdolist_list_var = canon_versions;
      SubLObject canon_version = NIL;
      canon_version = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        thread.resetMultipleValues();
        final SubLObject cnf = fi.fi_canonicalize( canon_version, canon_gafP, UNPROVIDED );
        final SubLObject v_variables = thread.secondMultipleValue();
        final SubLObject hl_tv = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != canon_gafP )
        {
          result = ConsesLow.cons( ConsesLow.cons( cnf, hl_tv ), result );
        }
        else
        {
          result = ConsesLow.cons( cnf, result );
        }
        cdolist_list_var = cdolist_list_var.rest();
        canon_version = cdolist_list_var.first();
      }
    }
    return Values.values( Sequences.nreverse( result ), blists, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 27199L)
  public static SubLObject canonicalize_meta_clauses(final SubLObject v_clauses)
  {
    if( $const23$True.eql( v_clauses ) )
    {
      return v_clauses;
    }
    if( $const24$False.eql( v_clauses ) )
    {
      return v_clauses;
    }
    SubLObject result = NIL;
    SubLObject cdolist_list_var = v_clauses;
    SubLObject clause = NIL;
    clause = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != distributing_meta_proposition_clauseP( clause ) )
      {
        result = ConsesLow.nconc( express_as_distributed_meta_proposition( clause ), result );
      }
      else if( NIL != meta_proposition_clauseP( clause ) )
      {
        result = ConsesLow.cons( express_as_meta_proposition( clause ), result );
      }
      else
      {
        result = ConsesLow.cons( clause, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      clause = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 27853L)
  public static SubLObject express_as_meta_proposition(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != control_vars.$within_ask$.getDynamicValue( thread ) )
    {
      return transform_delta( clause, Symbols.symbol_function( $sym25$EL_META_FORMULA_ ), Symbols.symbol_function( $sym26$EXPRESS_AS_META_FORMULA ), Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    return transform_list_utilities.quiescent_transform( clause, Symbols.symbol_function( $sym27$GROUND_EL_META_FORMULA_ ), Symbols.symbol_function( $sym26$EXPRESS_AS_META_FORMULA ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 28114L)
  public static SubLObject transform_delta(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    return ntransform_delta( conses_high.copy_tree( v_object ), pred, transform, test, key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 28329L)
  public static SubLObject ntransform_delta(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( NIL == Functions.funcall( pred, v_object ) )
    {
      return ntransform_delta_int( v_object, pred, transform, test, key );
    }
    final SubLObject new_object = Functions.funcall( transform, Functions.funcall( key, v_object ) );
    if( NIL != Functions.funcall( test, v_object, new_object ) )
    {
      return ntransform_delta_int( v_object, pred, transform, test, key );
    }
    return ntransform_delta( conses_high.copy_tree( new_object ), pred, transform, test, key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 28803L)
  public static SubLObject ntransform_delta_int(final SubLObject v_object, final SubLObject pred, final SubLObject transform, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( v_object.isAtom() )
    {
      return v_object;
    }
    SubLObject list;
    for( list = NIL, list = v_object; list.rest().isCons(); list = list.rest() )
    {
      ConsesLow.rplaca( list, ntransform_delta( list.first(), pred, transform, test, key ) );
    }
    ConsesLow.rplaca( list, ntransform_delta( list.first(), pred, transform, test, key ) );
    if( NIL != list.rest() )
    {
      ConsesLow.rplacd( list, ntransform_delta( list.rest(), pred, transform, test, key ) );
    }
    return v_object;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 29387L)
  public static SubLObject express_as_meta_formula(final SubLObject formula)
  {
    if( NIL != assertion_handles.assertion_p( formula ) )
    {
      return formula;
    }
    if( NIL != el_utilities.el_formula_p( formula ) )
    {
      return express_as_meta_formula_int( formula, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 29709L)
  public static SubLObject meta_assertion_formulas(final SubLObject formula)
  {
    return express_as_meta_formula_int( formula, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 29941L)
  public static SubLObject express_as_meta_formula_int(final SubLObject formula, final SubLObject find_assertionsP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject n = ZERO_INTEGER;
    final SubLObject meta_relation = cycl_utilities.formula_arg0( formula );
    SubLObject terms = NIL;
    SubLObject meta_terms = NIL;
    SubLObject cdolist_list_var = cycl_utilities.formula_args( formula, UNPROVIDED );
    SubLObject v_term = NIL;
    v_term = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      n = Numbers.add( n, ONE_INTEGER );
      if( NIL != possibly_meta_argP( meta_relation, n, UNPROVIDED ) )
      {
        if( NIL != el_utilities.mt_designating_formulaP( v_term ) )
        {
          if( NIL != find_assertionsP )
          {
            final SubLObject mt = el_utilities.designated_mt( v_term );
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
            try
            {
              mt_relevance_macros.$mt$.bind( ( NIL != hlmt.closed_possibly_hlmt_p( mt ) ) ? mt : mt_relevance_macros.$mt$.getDynamicValue( thread ), thread );
              terms = ConsesLow.cons( find_unique_assertion_cycl( el_utilities.designated_sentence( v_term ), UNPROVIDED ), terms );
            }
            finally
            {
              mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
            }
          }
          else
          {
            meta_terms = ConsesLow.cons( el_utilities.designated_sentence( v_term ), meta_terms );
          }
        }
        else if( NIL != cycl_variables.cyc_varP( v_term ) )
        {
          terms = ConsesLow.cons( v_term, terms );
        }
        else if( NIL != find_assertionsP )
        {
          final SubLObject assertion = find_unique_assertion_cycl( v_term, UNPROVIDED );
          if( NIL != term.kb_assertionP( assertion ) )
          {
            terms = ConsesLow.cons( assertion, terms );
          }
          else
          {
            el_utilities.el_error( THREE_INTEGER, $str28$invalid_meta_arg___s, v_term, UNPROVIDED, UNPROVIDED );
            terms = ConsesLow.cons( v_term, terms );
          }
        }
        else
        {
          meta_terms = ConsesLow.cons( v_term, meta_terms );
        }
      }
      else
      {
        terms = ConsesLow.cons( v_term, terms );
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_term = cdolist_list_var.first();
    }
    return ( NIL != find_assertionsP ) ? el_utilities.make_formula( meta_relation, Sequences.nreverse( terms ), UNPROVIDED ) : Sequences.nreverse( meta_terms );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 31132L)
  public static SubLObject express_as_distributed_meta_proposition(final SubLObject clause)
  {
    final SubLObject asent = clauses.pos_lits( clause ).first();
    return express_asent_as_distributed_meta_proposition( asent );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 31465L)
  public static SubLObject express_asent_as_distributed_meta_proposition(final SubLObject asent)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    if( NIL != el_utilities.ist_sentence_p( asent, UNPROVIDED ) )
    {
      if( NIL != hlmt.hlmt_p( el_utilities.designated_mt( asent ) ) )
      {
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( el_utilities.designated_mt( asent ) );
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          result = express_asent_as_distributed_meta_proposition( el_utilities.designated_sentence( asent ) );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
      else
      {
        result = clause_utilities.make_gaf_cnf( asent );
      }
    }
    else
    {
      final SubLObject meta_pred = cycl_utilities.atomic_sentence_predicate( asent );
      SubLObject n = ZERO_INTEGER;
      SubLObject terms = NIL;
      SubLObject cdolist_list_var = cycl_utilities.atomic_sentence_args( asent, $kw29$IGNORE );
      SubLObject v_term = NIL;
      v_term = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        n = Numbers.add( n, ONE_INTEGER );
        if( NIL != czer_utilities.possibly_assertion_argP( meta_pred, n, UNPROVIDED ) )
        {
          final SubLObject assertions = find_kb_assertions( v_term, UNPROVIDED );
          if( NIL != assertions )
          {
            terms = ConsesLow.cons( assertions, terms );
          }
          else
          {
            terms = ConsesLow.cons( ConsesLow.list( v_term ), terms );
          }
        }
        else
        {
          terms = ConsesLow.cons( ConsesLow.list( v_term ), terms );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_term = cdolist_list_var.first();
      }
      cdolist_list_var = list_utilities.cross_products( ConsesLow.cons( ConsesLow.list( meta_pred ), Sequences.nreverse( terms ) ) );
      SubLObject pos_lit = NIL;
      pos_lit = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( clauses.make_cnf( NIL, ConsesLow.list( pos_lit ) ), result );
        cdolist_list_var = cdolist_list_var.rest();
        pos_lit = cdolist_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 32541L)
  public static SubLObject meta_proposition_clauseP(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = clauses.neg_lits( clause );
    SubLObject asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.contains_subformula_p( asent ) )
      {
        if( NIL != control_vars.$within_ask$.getDynamicValue( thread ) )
        {
          if( NIL != cycl_utilities.expression_find_if( $sym25$EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED ) )
          {
            return T;
          }
        }
        else if( NIL != cycl_utilities.expression_find_if( $sym27$GROUND_EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    cdolist_list_var = clauses.pos_lits( clause );
    asent = NIL;
    asent = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.contains_subformula_p( asent ) )
      {
        if( NIL != control_vars.$within_ask$.getDynamicValue( thread ) )
        {
          if( NIL != cycl_utilities.expression_find_if( $sym25$EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED ) )
          {
            return T;
          }
        }
        else if( NIL != cycl_utilities.expression_find_if( $sym27$GROUND_EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED ) )
        {
          return T;
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      asent = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 33011L)
  public static SubLObject distributing_meta_proposition_clauseP(final SubLObject clause)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == clauses.neg_lits( clause ) )
    {
      final SubLObject pos_lits = clauses.pos_lits( clause );
      final SubLObject literal = pos_lits.first();
      if( NIL != list_utilities.singletonP( pos_lits ) )
      {
        return makeBoolean( NIL != meta_literalP( literal, mt_relevance_macros.$mt$.getDynamicValue( thread ) ) && NIL != distributing_meta_literalP( literal ) );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 33742L)
  public static SubLObject distributing_meta_literalP(final SubLObject literal)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != el_utilities.contains_subformula_p( literal ) && NIL != el_utilities.literalP( literal ) )
    {
      return makeBoolean( NIL != czer_utilities.distributing_meta_predP( el_utilities.literal_arg0( literal, UNPROVIDED ) ) || NIL != distributing_meta_mt_literalP( literal )
          || ( NIL != czer_vars.$distribute_meta_over_common_elP$.getDynamicValue( thread ) && NIL != meta_args_have_common_el_sentencesP( literal, UNPROVIDED ) ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 34085L)
  public static SubLObject distributing_meta_mt_literalP(final SubLObject literal)
  {
    return makeBoolean( NIL != el_utilities.mt_designating_literalP( literal ) && NIL != hlmt.hlmt_p( el_utilities.literal_arg1( literal, UNPROVIDED ) ) && NIL != distributing_meta_literalP( el_utilities.literal_arg2(
        literal, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 34420L)
  public static SubLObject meta_mt_literalP(final SubLObject literal)
  {
    return makeBoolean( NIL != el_utilities.mt_designating_literalP( literal ) && NIL != hlmt.hlmt_p( el_utilities.designated_mt( literal ) ) && NIL != meta_literalP( el_utilities.designated_sentence( literal ),
        el_utilities.designated_mt( literal ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 34732L)
  public static SubLObject meta_mt_formulaP(final SubLObject formula)
  {
    return makeBoolean( NIL != el_utilities.mt_designating_formulaP( formula ) && NIL != hlmt.hlmt_p( el_utilities.designated_mt( formula ) ) && NIL != meta_formulaP( el_utilities.designated_sentence( formula ),
        el_utilities.designated_mt( formula ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 35044L)
  public static SubLObject meta_literalP(final SubLObject literal, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject meta_literalP = makeBoolean( NIL != el_utilities.contains_subformula_p( literal ) && NIL != meta_mt_literalP( literal ) );
    if( NIL == meta_literalP && NIL != hlmt.hlmt_p( mt ) )
    {
      final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding( thread );
      try
      {
        wff_vars.$wff_violations$.bind( NIL, thread );
        meta_literalP = makeBoolean( NIL != el_utilities.literalP( literal ) && NIL != possibly_meta_predicateP( el_utilities.literal_arg0( literal, UNPROVIDED ), mt ) && NIL != meta_args_wffP( literal, mt,
            UNPROVIDED ) );
      }
      finally
      {
        wff_vars.$wff_violations$.rebind( _prev_bind_0, thread );
      }
    }
    return meta_literalP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 35511L)
  public static SubLObject meta_formulaP(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject meta_formulaP = meta_mt_formulaP( formula );
    if( NIL == meta_formulaP && NIL != hlmt.hlmt_p( mt ) )
    {
      final SubLObject _prev_bind_0 = wff_vars.$wff_violations$.currentBinding( thread );
      try
      {
        wff_vars.$wff_violations$.bind( NIL, thread );
        meta_formulaP = makeBoolean( NIL != possibly_meta_relationP( cycl_utilities.formula_operator( formula ), mt ) && NIL != meta_args_wffP( formula, mt, UNPROVIDED ) );
      }
      finally
      {
        wff_vars.$wff_violations$.rebind( _prev_bind_0, thread );
      }
    }
    return meta_formulaP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 35905L)
  public static SubLObject meta_args_wffP(final SubLObject literal, SubLObject mt, SubLObject varP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym0$EL_VAR_ );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject not_wffP = NIL;
    final SubLObject n = ZERO_INTEGER;
    final SubLObject meta_pred = el_utilities.literal_predicate( literal, UNPROVIDED );
    SubLObject n_$19 = ZERO_INTEGER;
    final SubLObject args = cycl_utilities.formula_args( el_utilities.literal_atomic_sentence( literal ), $kw29$IGNORE );
    SubLObject rest;
    SubLObject arg;
    for( rest = NIL, rest = args; NIL == not_wffP && NIL != rest; rest = rest.rest() )
    {
      arg = rest.first();
      n_$19 = Numbers.add( n_$19, ONE_INTEGER );
      if( NIL != definitely_meta_argP( meta_pred, n_$19, mt ) )
      {
        if( NIL == findable_assertion_argP( meta_pred, arg, mt, varP ) )
        {
          not_wffP = T;
        }
      }
      else if( NIL != possibly_but_not_definitely_meta_argP( meta_pred, n_$19, mt ) && NIL == findable_assertion_argP( meta_pred, arg, mt, varP ) && NIL == at_admitted.admitted_argumentP( arg, n_$19, meta_pred, mt ) )
      {
        not_wffP = T;
      }
    }
    if( NIL != not_wffP && NIL != czer_vars.$noting_ill_formed_meta_argsP$.getDynamicValue( thread ) )
    {
      czer_vars.$recan_ill_formed_meta_argsP$.setDynamicValue( definitely_meta_argP( meta_pred, n, mt ), thread );
    }
    return makeBoolean( NIL == not_wffP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 36862L)
  public static SubLObject findable_assertion_argP(final SubLObject meta_pred, final SubLObject arg, final SubLObject mt, final SubLObject varP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return makeBoolean( NIL != Functions.funcall( varP, arg ) || NIL != term.kb_assertionP( arg ) || NIL != find_unique_assertion_cycl( arg, mt ) || ( NIL != all_kb_assertions_findableP( arg, mt )
        && ( NIL != czer_utilities.distributing_meta_predP( meta_pred ) || ( NIL != czer_vars.$distribute_meta_over_common_elP$.getDynamicValue( thread ) && NIL != common_el_sentencesP( find_kb_assertions( arg,
            UNPROVIDED ) ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 37327L)
  public static SubLObject meta_args_have_common_el_sentencesP(final SubLObject literal, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    SubLObject uncommonP = Numbers.numE( el_utilities.literal_arity( literal, $kw29$IGNORE ), ZERO_INTEGER );
    SubLObject vacuousP = T;
    final SubLObject meta_pred = el_utilities.literal_arg0( literal, UNPROVIDED );
    SubLObject argnum = ZERO_INTEGER;
    final SubLObject args = cycl_utilities.formula_args( literal, $kw29$IGNORE );
    SubLObject rest;
    SubLObject arg;
    for( rest = NIL, rest = args; NIL == uncommonP && NIL != rest; rest = rest.rest() )
    {
      arg = rest.first();
      argnum = Numbers.add( argnum, ONE_INTEGER );
      if( NIL != possibly_meta_argP( meta_pred, argnum, mt ) )
      {
        vacuousP = NIL;
        uncommonP = makeBoolean( NIL == common_el_sentencesP( find_kb_assertions( arg, UNPROVIDED ) ) );
      }
    }
    return makeBoolean( NIL == vacuousP && NIL == uncommonP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 37825L)
  public static SubLObject el_meta_formulaP(final SubLObject formula, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( NIL != meta_formulaP( formula, mt ) )
    {
      return makeBoolean( NIL == Sequences.find_if( Symbols.symbol_function( $sym30$KB_ASSERTION_ ), cycl_utilities.formula_args( formula, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 38042L)
  public static SubLObject ground_meta_formulaP(final SubLObject formula, SubLObject mt, SubLObject varP)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym0$EL_VAR_ );
    }
    if( NIL != meta_formulaP( formula, mt ) )
    {
      return makeBoolean( NIL == Sequences.find_if( varP, cycl_utilities.formula_args( formula, $kw31$REGULARIZE ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/czer-meta.lisp", position = 38354L)
  public static SubLObject ground_el_meta_formulaP(final SubLObject formula, SubLObject mt, SubLObject varP)
  {
    if( mt == UNPROVIDED )
    {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if( varP == UNPROVIDED )
    {
      varP = Symbols.symbol_function( $sym0$EL_VAR_ );
    }
    if( NIL != ground_meta_formulaP( formula, mt, varP ) )
    {
      return makeBoolean( NIL == Sequences.find_if( Symbols.symbol_function( $sym30$KB_ASSERTION_ ), cycl_utilities.formula_args( formula, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    }
    return NIL;
  }

  public static SubLObject declare_czer_meta_file()
  {
    SubLFiles.declareFunction( me, "has_exceptionP", "HAS-EXCEPTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "accessible_kb_assertions", "ACCESSIBLE-KB-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "accessible_kb_assertionsP", "ACCESSIBLE-KB-ASSERTIONS?", 1, 1, false );
    SubLFiles.declareFunction( me, "accessible_assertions_cycl", "ACCESSIBLE-ASSERTIONS-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "kb_versions", "KB-VERSIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "literal_meta_args", "LITERAL-META-ARGS", 1, 1, false );
    SubLFiles.declareFunction( me, "el_assertion_specP", "EL-ASSERTION-SPEC?", 1, 1, false );
    SubLFiles.declareFunction( me, "el_gaf_assertion_specP", "EL-GAF-ASSERTION-SPEC?", 1, 1, false );
    SubLFiles.declareFunction( me, "el_rule_assertion_specP", "EL-RULE-ASSERTION-SPEC?", 1, 1, false );
    SubLFiles.declareFunction( me, "el_asserted_assertion_specP", "EL-ASSERTED-ASSERTION-SPEC?", 1, 1, false );
    SubLFiles.declareFunction( me, "el_deduced_assertion_specP", "EL-DEDUCED-ASSERTION-SPEC?", 1, 1, false );
    SubLFiles.declareFunction( me, "el_constrained_assertion_specP", "EL-CONSTRAINED-ASSERTION-SPEC?", 2, 1, false );
    SubLFiles.declareFunction( me, "el_nl_semantic_assertion_specP", "EL-NL-SEMANTIC-ASSERTION-SPEC?", 1, 1, false );
    SubLFiles.declareFunction( me, "common_el_sentencesP", "COMMON-EL-SENTENCES?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_predicateP", "META-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_relationP", "META-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_meta_relation_somewhereP", "CLEAR-META-RELATION-SOMEWHERE?", 0, 0, false );
    new $clear_meta_relation_somewhereP$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_meta_relation_somewhereP", "REMOVE-META-RELATION-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_relation_somewhereP_internal", "META-RELATION-SOMEWHERE?-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_relation_somewhereP", "META-RELATION-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_relation_intP", "META-RELATION-INT?", 1, 1, false );
    SubLFiles.declareFunction( me, "sentence_with_meta_predicateP", "SENTENCE-WITH-META-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "sentence_with_meta_relationP", "SENTENCE-WITH-META-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "possibly_meta_predicateP", "POSSIBLY-META-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "possibly_meta_relationP", "POSSIBLY-META-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "possibly_meta_relation_somewhereP", "POSSIBLY-META-RELATION-SOMEWHERE?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_possibly_meta_relation_somewhereP_cached", "CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 0, 0, false );
    new $clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction();
    SubLFiles.declareFunction( me, "remove_possibly_meta_relation_somewhereP_cached", "REMOVE-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_meta_relation_somewhereP_cached_internal", "POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_meta_relation_somewhereP_cached", "POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 1, 0, false );
    SubLFiles.declareFunction( me, "possibly_meta_relation_intP", "POSSIBLY-META-RELATION-INT?", 1, 1, false );
    SubLFiles.declareFunction( me, "sentence_with_possibly_meta_predicateP", "SENTENCE-WITH-POSSIBLY-META-PREDICATE?", 1, 1, false );
    SubLFiles.declareFunction( me, "sentence_with_possibly_meta_relationP", "SENTENCE-WITH-POSSIBLY-META-RELATION?", 1, 1, false );
    SubLFiles.declareFunction( me, "possibly_meta_argP", "POSSIBLY-META-ARG?", 2, 1, false );
    SubLFiles.declareFunction( me, "possibly_but_not_definitely_meta_argP", "POSSIBLY-BUT-NOT-DEFINITELY-META-ARG?", 2, 1, false );
    SubLFiles.declareFunction( me, "definitely_meta_argP", "DEFINITELY-META-ARG?", 2, 1, false );
    SubLFiles.declareFunction( me, "find_assertion_cycl", "FIND-ASSERTION-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "find_unique_assertion_cycl", "FIND-UNIQUE-ASSERTION-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "find_visible_assertion_cycl", "FIND-VISIBLE-ASSERTION-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "find_kb_assertions", "FIND-KB-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "find_visible_kb_assertions", "FIND-VISIBLE-KB-ASSERTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "find_visible_sibling_mt_assertions", "FIND-VISIBLE-SIBLING-MT-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "find_some_assertion_cycl", "FIND-SOME-ASSERTION-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "all_kb_assertions_findableP", "ALL-KB-ASSERTIONS-FINDABLE?", 1, 1, false );
    SubLFiles.declareFunction( me, "recanonicalized_candidate_assertion_equals_cnfP", "RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-CNF?", 2, 0, false );
    SubLFiles.declareFunction( me, "recanonicalized_candidate_assertion_equals_gafP", "RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-GAF?", 2, 0, false );
    SubLFiles.declareFunction( me, "recanonicalize_candidate_assertion", "RECANONICALIZE-CANDIDATE-ASSERTION", 0, 0, false );
    SubLFiles.declareFunction( me, "candidate_assertion_el_formula", "CANDIDATE-ASSERTION-EL-FORMULA", 0, 0, false );
    SubLFiles.declareFunction( me, "candidate_assertion_fi_formula", "CANDIDATE-ASSERTION-FI-FORMULA", 0, 0, false );
    SubLFiles.declareFunction( me, "robust_assertion_lookupP", "ROBUST-ASSERTION-LOOKUP?", 0, 0, false );
    SubLFiles.declareFunction( me, "find_assertions_cycl_in_mt", "FIND-ASSERTIONS-CYCL-IN-MT", 3, 0, false );
    SubLFiles.declareFunction( me, "find_assertions_cycl", "FIND-ASSERTIONS-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "find_visible_assertions_cycl", "FIND-VISIBLE-ASSERTIONS-CYCL", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_cached_find_assertions_cycl", "CLEAR-CACHED-FIND-ASSERTIONS-CYCL", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_cached_find_assertions_cycl", "REMOVE-CACHED-FIND-ASSERTIONS-CYCL", 3, 0, false );
    SubLFiles.declareFunction( me, "cached_find_assertions_cycl_internal", "CACHED-FIND-ASSERTIONS-CYCL-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "cached_find_assertions_cycl", "CACHED-FIND-ASSERTIONS-CYCL", 3, 0, false );
    SubLFiles.declareFunction( me, "find_assertions_cycl_int", "FIND-ASSERTIONS-CYCL-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "find_assertions_cycl_int_2", "FIND-ASSERTIONS-CYCL-INT-2", 3, 0, false );
    SubLFiles.declareFunction( me, "find_assertions_from_cnf", "FIND-ASSERTIONS-FROM-CNF", 4, 0, false );
    SubLFiles.declareFunction( me, "find_assertions_from_mt_designating_literal", "FIND-ASSERTIONS-FROM-MT-DESIGNATING-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "find_assertions_from_decontextualized_literal", "FIND-ASSERTIONS-FROM-DECONTEXTUALIZED-LITERAL", 2, 0, false );
    SubLFiles.declareFunction( me, "canon_versions", "CANON-VERSIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "canon_versions_sentence", "CANON-VERSIONS-SENTENCE", 1, 1, false );
    SubLFiles.declareFunction( me, "canon_cnfs", "CANON-CNFS", 1, 2, false );
    SubLFiles.declareFunction( me, "canon_cnfs_sentence", "CANON-CNFS-SENTENCE", 1, 2, false );
    SubLFiles.declareFunction( me, "canonicalize_meta_clauses", "CANONICALIZE-META-CLAUSES", 1, 0, false );
    SubLFiles.declareFunction( me, "express_as_meta_proposition", "EXPRESS-AS-META-PROPOSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "transform_delta", "TRANSFORM-DELTA", 3, 2, false );
    SubLFiles.declareFunction( me, "ntransform_delta", "NTRANSFORM-DELTA", 3, 2, false );
    SubLFiles.declareFunction( me, "ntransform_delta_int", "NTRANSFORM-DELTA-INT", 3, 2, false );
    SubLFiles.declareFunction( me, "express_as_meta_formula", "EXPRESS-AS-META-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_assertion_formulas", "META-ASSERTION-FORMULAS", 1, 0, false );
    SubLFiles.declareFunction( me, "express_as_meta_formula_int", "EXPRESS-AS-META-FORMULA-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "express_as_distributed_meta_proposition", "EXPRESS-AS-DISTRIBUTED-META-PROPOSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "express_asent_as_distributed_meta_proposition", "EXPRESS-ASENT-AS-DISTRIBUTED-META-PROPOSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_proposition_clauseP", "META-PROPOSITION-CLAUSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "distributing_meta_proposition_clauseP", "DISTRIBUTING-META-PROPOSITION-CLAUSE?", 1, 0, false );
    SubLFiles.declareFunction( me, "distributing_meta_literalP", "DISTRIBUTING-META-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "distributing_meta_mt_literalP", "DISTRIBUTING-META-MT-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_mt_literalP", "META-MT-LITERAL?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_mt_formulaP", "META-MT-FORMULA?", 1, 0, false );
    SubLFiles.declareFunction( me, "meta_literalP", "META-LITERAL?", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_formulaP", "META-FORMULA?", 1, 1, false );
    SubLFiles.declareFunction( me, "meta_args_wffP", "META-ARGS-WFF?", 1, 2, false );
    SubLFiles.declareFunction( me, "findable_assertion_argP", "FINDABLE-ASSERTION-ARG?", 4, 0, false );
    SubLFiles.declareFunction( me, "meta_args_have_common_el_sentencesP", "META-ARGS-HAVE-COMMON-EL-SENTENCES?", 1, 1, false );
    SubLFiles.declareFunction( me, "el_meta_formulaP", "EL-META-FORMULA?", 1, 1, false );
    new $el_meta_formulaP$UnaryFunction();
    new $el_meta_formulaP$BinaryFunction();
    SubLFiles.declareFunction( me, "ground_meta_formulaP", "GROUND-META-FORMULA?", 1, 2, false );
    SubLFiles.declareFunction( me, "ground_el_meta_formulaP", "GROUND-EL-META-FORMULA?", 1, 2, false );
    new $ground_el_meta_formulaP$UnaryFunction();
    new $ground_el_meta_formulaP$BinaryFunction();
    return NIL;
  }

  public static SubLObject init_czer_meta_file()
  {
    $meta_relation_somewhereP_caching_state$ = SubLFiles.deflexical( "*META-RELATION-SOMEWHERE?-CACHING-STATE*", NIL );
    $possibly_meta_relation_somewhereP_cached_caching_state$ = SubLFiles.deflexical( "*POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-CACHING-STATE*", NIL );
    $cached_find_assertions_cycl_caching_state$ = SubLFiles.deflexical( "*CACHED-FIND-ASSERTIONS-CYCL-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_czer_meta_file()
  {
    memoization_state.note_globally_cached_function( $sym7$META_RELATION_SOMEWHERE_ );
    memoization_state.note_globally_cached_function( $sym12$POSSIBLY_META_RELATION_SOMEWHERE__CACHED );
    memoization_state.note_globally_cached_function( $sym16$CACHED_FIND_ASSERTIONS_CYCL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_czer_meta_file();
  }

  @Override
  public void initializeVariables()
  {
    init_czer_meta_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_czer_meta_file();
  }
  static
  {
    me = new czer_meta();
    $meta_relation_somewhereP_caching_state$ = null;
    $possibly_meta_relation_somewhereP_cached_caching_state$ = null;
    $cached_find_assertions_cycl_caching_state$ = null;
    $sym0$EL_VAR_ = makeSymbol( "EL-VAR?" );
    $sym1$TRUE = makeSymbol( "TRUE" );
    $sym2$GAF_ASSERTION_ = makeSymbol( "GAF-ASSERTION?" );
    $sym3$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $sym4$ASSERTED_ASSERTION_ = makeSymbol( "ASSERTED-ASSERTION?" );
    $sym5$DEDUCED_ASSERTION_ = makeSymbol( "DEDUCED-ASSERTION?" );
    $sym6$NL_SEMANTIC_ASSERTION_ = makeSymbol( "NL-SEMANTIC-ASSERTION?" );
    $sym7$META_RELATION_SOMEWHERE_ = makeSymbol( "META-RELATION-SOMEWHERE?" );
    $sym8$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const9$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym10$_META_RELATION_SOMEWHERE__CACHING_STATE_ = makeSymbol( "*META-RELATION-SOMEWHERE?-CACHING-STATE*" );
    $sym11$CLEAR_META_RELATION_SOMEWHERE_ = makeSymbol( "CLEAR-META-RELATION-SOMEWHERE?" );
    $sym12$POSSIBLY_META_RELATION_SOMEWHERE__CACHED = makeSymbol( "POSSIBLY-META-RELATION-SOMEWHERE?-CACHED" );
    $sym13$_POSSIBLY_META_RELATION_SOMEWHERE__CACHED_CACHING_STATE_ = makeSymbol( "*POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-CACHING-STATE*" );
    $sym14$CLEAR_POSSIBLY_META_RELATION_SOMEWHERE__CACHED = makeSymbol( "CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED" );
    $kw15$DEFAULT = makeKeyword( "DEFAULT" );
    $sym16$CACHED_FIND_ASSERTIONS_CYCL = makeSymbol( "CACHED-FIND-ASSERTIONS-CYCL" );
    $sym17$_CACHED_FIND_ASSERTIONS_CYCL_CACHING_STATE_ = makeSymbol( "*CACHED-FIND-ASSERTIONS-CYCL-CACHING-STATE*" );
    $sym18$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_CNF_ = makeSymbol( "RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-CNF?" );
    $sym19$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_GAF_ = makeSymbol( "RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-GAF?" );
    $list20 = ConsesLow.cons( makeSymbol( "CNF" ), makeSymbol( "HL-TV" ) );
    $kw21$ASSERT = makeKeyword( "ASSERT" );
    $str22$Cannot_set_tense_czer_to_invalid_ = makeString( "Cannot set tense czer to invalid mode." );
    $const23$True = constant_handles.reader_make_constant_shell( makeString( "True" ) );
    $const24$False = constant_handles.reader_make_constant_shell( makeString( "False" ) );
    $sym25$EL_META_FORMULA_ = makeSymbol( "EL-META-FORMULA?" );
    $sym26$EXPRESS_AS_META_FORMULA = makeSymbol( "EXPRESS-AS-META-FORMULA" );
    $sym27$GROUND_EL_META_FORMULA_ = makeSymbol( "GROUND-EL-META-FORMULA?" );
    $str28$invalid_meta_arg___s = makeString( "invalid meta-arg: ~s" );
    $kw29$IGNORE = makeKeyword( "IGNORE" );
    $sym30$KB_ASSERTION_ = makeSymbol( "KB-ASSERTION?" );
    $kw31$REGULARIZE = makeKeyword( "REGULARIZE" );
  }

  public static final class $clear_meta_relation_somewhereP$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_meta_relation_somewhereP$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-META-RELATION-SOMEWHERE?" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_meta_relation_somewhereP();
    }
  }

  public static final class $clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction
      extends
        ZeroArityFunction
  {
    public $clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED" ) );
    }

    @Override
    public SubLObject processItem()
    {
      return clear_possibly_meta_relation_somewhereP_cached();
    }
  }

  public static final class $el_meta_formulaP$UnaryFunction
      extends
        UnaryFunction
  {
    public $el_meta_formulaP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-META-FORMULA?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return el_meta_formulaP( arg1, $el_meta_formulaP$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $el_meta_formulaP$BinaryFunction
      extends
        BinaryFunction
  {
    public $el_meta_formulaP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "EL-META-FORMULA?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return el_meta_formulaP( arg1, arg2 );
    }
  }

  public static final class $ground_el_meta_formulaP$UnaryFunction
      extends
        UnaryFunction
  {
    public $ground_el_meta_formulaP$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GROUND-EL-META-FORMULA?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return ground_el_meta_formulaP( arg1, $ground_el_meta_formulaP$UnaryFunction.UNPROVIDED, $ground_el_meta_formulaP$UnaryFunction.UNPROVIDED );
    }
  }

  public static final class $ground_el_meta_formulaP$BinaryFunction
      extends
        BinaryFunction
  {
    public $ground_el_meta_formulaP$BinaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "GROUND-EL-META-FORMULA?" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1, final SubLObject arg2)
    {
      return ground_el_meta_formulaP( arg1, arg2, $ground_el_meta_formulaP$BinaryFunction.UNPROVIDED );
    }
  }
}
/*
 * 
 * Total time: 485 ms
 * 
 */