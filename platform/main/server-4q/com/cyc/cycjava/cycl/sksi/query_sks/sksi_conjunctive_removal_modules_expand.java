package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_conjunctive_removal_modules_expand
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_modules_expand";
  public static final String myFingerPrint = "06f1baa9eb3eb9dc377346f6c1ba58b63ffd63de465e8a54f8d9ca2be861bec5";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 974L)
  private static SubLSymbol $sksi_crm_return_null_bindingsP$;
  private static final SubLList $list0;
  private static final SubLSymbol $kw1$VARPRED;
  private static final SubLSymbol $kw2$GENLPREDS;
  private static final SubLSymbol $kw3$GENLINVERSE;
  private static final SubLString $str4$__SKSI__A_;
  private static final SubLString $str5$Could_not_form_a_CSQL_query_with_;
  private static final SubLObject $const6$meaningSentencePredicateForSource;
  private static final SubLSymbol $kw7$TRUE;
  private static final SubLString $str8$Could_not_find_table_name_via___m;
  private static final SubLSymbol $kw9$ROBUST;
  private static final SubLSymbol $kw10$NORMAL;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$_EXIT;
  private static final SubLSymbol $sym13$SKSI_CRM_RESULT_ITERATOR_NEXT;
  private static final SubLSymbol $sym14$SKSI_CRM_RESULT_ITERATOR_DONE;
  private static final SubLSymbol $sym15$SKSI_CRM_RESULT_ITERATOR_FINALIZE;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLSymbol $kw18$SKSI;
  private static final SubLObject $const19$genlPreds;
  private static final SubLObject $const20$genlInverse;
  private static final SubLString $str21$Unknown_support_keyword__a_;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$SKSI_CRM_RESULT_ITERATOR_P;
  private static final SubLSymbol $kw24$RS_INDEX;
  private static final SubLSymbol $kw25$DECODE;
  private static final SubLSymbol $sym26$VARIABLE_P;
  private static final SubLSymbol $sym27$FIRST;
  private static final SubLSymbol $sym28$ALPHA_OR_UNDERSCORE_P;
  private static final SubLSymbol $sym29$SKSI_CSQL_ATOMS_EQUAL;
  private static final SubLSymbol $sym30$TEST_SKSI_CONJUNCTIVE_QUERY_TO_CSQL;
  private static final SubLSymbol $kw31$TEST;
  private static final SubLSymbol $sym32$SKSI_CSQL_EQUIVALENT;
  private static final SubLSymbol $kw33$OWNER;
  private static final SubLSymbol $kw34$CLASSES;
  private static final SubLSymbol $kw35$KB;
  private static final SubLSymbol $kw36$FULL;
  private static final SubLSymbol $kw37$WORKING_;
  private static final SubLObject $list38;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 1297L)
  public static SubLObject removal_sksi_conjunction_pos_lits_output_generate(final SubLObject contextualized_dnf_clause, final SubLObject sks_profile, SubLObject accept_null_bindingsP, SubLObject ask_queryP)
  {
    if( accept_null_bindingsP == UNPROVIDED )
    {
      accept_null_bindingsP = NIL;
    }
    if( ask_queryP == UNPROVIDED )
    {
      ask_queryP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = sksi_query_datastructures.sks_profile_mapping_mt( sks_profile );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    final SubLObject _prev_bind_4 = sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $sksi_crm_return_null_bindingsP$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.bind( sksi_query_utilities.sksi_cost_recording_suspended_for_current_iterator_initial_state(), thread );
      $sksi_crm_return_null_bindingsP$.bind( accept_null_bindingsP, thread );
      final SubLObject logical_schemata = sksi_query_datastructures.sks_profile_logical_schemata( sks_profile );
      final SubLObject sks = sksi_query_datastructures.sks_profile_sks( sks_profile );
      final SubLObject meaning_sentence_gafs = sksi_conjunctive_removal_module_utilities.get_all_meaning_sentence_gafs_for_contextualized_dnf_clause( contextualized_dnf_clause, logical_schemata, sks, T, UNPROVIDED,
          UNPROVIDED );
      result = sksi_crm_expand_iterate_over_meaning_sentence_gafs( NIL, meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP );
      if( NIL != ask_queryP && NIL == sksi_query_utilities.sksi_cost_recording_suspended_for_current_iteratorP() )
      {
        result = sksi_query_utilities.generate_sksi_conjunctive_cost_recording_iterator( result, sks );
      }
    }
    finally
    {
      $sksi_crm_return_null_bindingsP$.rebind( _prev_bind_5, thread );
      sksi_query_utilities.$sksi_cost_recording_suspended_for_current_iteratorP$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 2421L)
  public static SubLObject sksi_crm_expand_iterate_over_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs_so_far, final SubLObject remaining_meaning_sentence_gafs, final SubLObject contextualized_dnf_clause,
      final SubLObject sks_profile, SubLObject ask_queryP)
  {
    if( ask_queryP == UNPROVIDED )
    {
      ask_queryP = T;
    }
    SubLObject results = NIL;
    if( NIL == remaining_meaning_sentence_gafs )
    {
      results = sksi_crm_expand_process_meaning_sentence_gafs( meaning_sentence_gafs_so_far, contextualized_dnf_clause, sks_profile, ask_queryP );
    }
    else
    {
      final SubLObject gafs = remaining_meaning_sentence_gafs.first();
      if( NIL != gafs )
      {
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          results = ConsesLow.nconc( results, sksi_crm_expand_iterate_over_meaning_sentence_gafs( list_utilities.snoc( gaf, meaning_sentence_gafs_so_far ), remaining_meaning_sentence_gafs.rest(),
              contextualized_dnf_clause, sks_profile, ask_queryP ) );
          cdolist_list_var = cdolist_list_var.rest();
          gaf = cdolist_list_var.first();
        }
      }
      else
      {
        results = sksi_crm_expand_iterate_over_meaning_sentence_gafs( list_utilities.snoc( NIL, meaning_sentence_gafs_so_far ), remaining_meaning_sentence_gafs.rest(), contextualized_dnf_clause, sks_profile,
            ask_queryP );
      }
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 3433L)
  public static SubLObject sksi_crm_expand_process_meaning_sentence_gafs(final SubLObject meaning_sentence_gafs, final SubLObject contextualized_dnf_clause, final SubLObject sks_profile, SubLObject ask_queryP)
  {
    if( ask_queryP == UNPROVIDED )
    {
      ask_queryP = T;
    }
    SubLObject asents = NIL;
    SubLObject keywords = NIL;
    SubLObject new_meaning_sentence_gafs = NIL;
    SubLObject num = ZERO_INTEGER;
    SubLObject cdolist_list_var = clauses.pos_lits( contextualized_dnf_clause );
    SubLObject lit = NIL;
    lit = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = lit;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
      asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject meaning_sentence_gaf = ConsesLow.nth( num, meaning_sentence_gafs );
        if( NIL != meaning_sentence_gaf )
        {
          final SubLObject asent_args = cycl_utilities.formula_args( asent, UNPROVIDED );
          final SubLObject inverse_args = Sequences.reverse( asent_args );
          final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf( meaning_sentence_gaf, UNPROVIDED );
          new_meaning_sentence_gafs = ConsesLow.cons( meaning_sentence_gaf, new_meaning_sentence_gafs );
          asents = ConsesLow.cons( NIL, asents );
          keywords = ConsesLow.cons( NIL, keywords );
          if( NIL != sksi_conjunctive_removal_module_utilities.variable_predicate_litP( asent ) )
          {
            ConsesLow.set_nth( ZERO_INTEGER, asents, ConsesLow.cons( lit, ConsesLow.nth( ZERO_INTEGER, asents ) ) );
            ConsesLow.set_nth( ZERO_INTEGER, keywords, ConsesLow.cons( $kw1$VARPRED, ConsesLow.nth( ZERO_INTEGER, keywords ) ) );
          }
          else
          {
            final SubLObject asent_pred = el_utilities.literal_predicate( asent, UNPROVIDED );
            final SubLObject spec_preds = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_preds_from_meaning_sentence( asent_pred, meaning_sentence, mt, UNPROVIDED, UNPROVIDED );
            final SubLObject spec_inverses = sksi_conjunctive_removal_module_utilities.sksi_relevant_spec_inverses_from_meaning_sentence( asent_pred, meaning_sentence, mt, UNPROVIDED, UNPROVIDED );
            if( NIL == spec_preds && NIL == spec_inverses )
            {
              return NIL;
            }
            SubLObject cdolist_list_var_$1 = spec_preds;
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var_$1.first();
            while ( NIL != cdolist_list_var_$1)
            {
              final SubLObject new_asent = el_utilities.list_to_elf( ConsesLow.cons( spec_pred, asent_args ) );
              final SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent( mt, new_asent );
              ConsesLow.set_nth( ZERO_INTEGER, asents, ConsesLow.cons( new_lit, ConsesLow.nth( ZERO_INTEGER, asents ) ) );
              ConsesLow.set_nth( ZERO_INTEGER, keywords, ConsesLow.cons( $kw2$GENLPREDS, ConsesLow.nth( ZERO_INTEGER, keywords ) ) );
              cdolist_list_var_$1 = cdolist_list_var_$1.rest();
              spec_pred = cdolist_list_var_$1.first();
            }
            SubLObject cdolist_list_var_$2 = spec_inverses;
            SubLObject spec_inverse = NIL;
            spec_inverse = cdolist_list_var_$2.first();
            while ( NIL != cdolist_list_var_$2)
            {
              final SubLObject new_asent = el_utilities.list_to_elf( ConsesLow.cons( spec_inverse, inverse_args ) );
              final SubLObject new_lit = inference_datastructures_problem_query.make_contextualized_asent( mt, new_asent );
              ConsesLow.set_nth( ZERO_INTEGER, asents, ConsesLow.cons( new_lit, ConsesLow.nth( ZERO_INTEGER, asents ) ) );
              ConsesLow.set_nth( ZERO_INTEGER, keywords, ConsesLow.cons( $kw3$GENLINVERSE, ConsesLow.nth( ZERO_INTEGER, keywords ) ) );
              cdolist_list_var_$2 = cdolist_list_var_$2.rest();
              spec_inverse = cdolist_list_var_$2.first();
            }
          }
        }
        else
        {
          keywords = ConsesLow.cons( NIL, keywords );
          asents = ConsesLow.cons( lit, asents );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
      }
      num = Numbers.add( num, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      lit = cdolist_list_var.first();
    }
    asents = Sequences.nreverse( asents );
    keywords = Sequences.nreverse( keywords );
    new_meaning_sentence_gafs = Sequences.nreverse( new_meaning_sentence_gafs );
    return sksi_crm_expand_iterate_over_asents( NIL, NIL, NIL, NIL, NIL, asents, NIL, keywords, new_meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 5572L)
  public static SubLObject sksi_crm_expand_iterate_over_asents(final SubLObject regular_asents_so_far, final SubLObject comparison_asents_so_far, final SubLObject evaluate_asents_so_far,
      final SubLObject sksi_unknown_sentence_asents_fo_far, final SubLObject all_asents_so_far, final SubLObject remaining_asents, final SubLObject keywords_so_far, final SubLObject remaining_keywords,
      final SubLObject meaning_sentence_gafs, final SubLObject contextualized_dnf_clause, final SubLObject sks_profile, SubLObject ask_queryP)
  {
    if( ask_queryP == UNPROVIDED )
    {
      ask_queryP = T;
    }
    SubLObject results = NIL;
    if( NIL == remaining_asents )
    {
      results = sksi_crm_expand_get_results( meaning_sentence_gafs, regular_asents_so_far, comparison_asents_so_far, evaluate_asents_so_far, sksi_unknown_sentence_asents_fo_far, all_asents_so_far,
          contextualized_dnf_clause, keywords_so_far, sks_profile, ask_queryP );
    }
    else if( NIL != remaining_keywords.first() )
    {
      SubLObject asent = NIL;
      SubLObject asent_$3 = NIL;
      SubLObject keyword = NIL;
      SubLObject keyword_$4 = NIL;
      asent = remaining_asents.first();
      asent_$3 = asent.first();
      keyword = remaining_keywords.first();
      keyword_$4 = keyword.first();
      while ( NIL != keyword || NIL != asent)
      {
        results = ConsesLow.nconc( results, sksi_crm_expand_iterate_over_asents( list_utilities.snoc( asent_$3, regular_asents_so_far ), comparison_asents_so_far, evaluate_asents_so_far,
            sksi_unknown_sentence_asents_fo_far, list_utilities.snoc( asent_$3, all_asents_so_far ), remaining_asents.rest(), list_utilities.snoc( keyword_$4, keywords_so_far ), remaining_keywords.rest(),
            meaning_sentence_gafs, contextualized_dnf_clause, sks_profile, ask_queryP ) );
        asent = asent.rest();
        asent_$3 = asent.first();
        keyword = keyword.rest();
        keyword_$4 = keyword.first();
      }
    }
    else
    {
      final SubLObject asent = remaining_asents.first();
      final SubLObject asent_asent = inference_datastructures_problem_query.contextualized_asent_asent( asent );
      if( NIL != sksi_query_utilities.evaluate_literal_p( asent_asent ) )
      {
        results = ConsesLow.nconc( results, sksi_crm_expand_iterate_over_asents( regular_asents_so_far, comparison_asents_so_far, list_utilities.snoc( asent, evaluate_asents_so_far ), sksi_unknown_sentence_asents_fo_far,
            list_utilities.snoc( asent, all_asents_so_far ), remaining_asents.rest(), list_utilities.snoc( NIL, keywords_so_far ), remaining_keywords.rest(), meaning_sentence_gafs, contextualized_dnf_clause, sks_profile,
            ask_queryP ) );
      }
      else if( NIL != sksi_query_utilities.sksi_unknown_sentence_literal_p( asent_asent ) )
      {
        results = ConsesLow.nconc( results, sksi_crm_expand_iterate_over_asents( regular_asents_so_far, comparison_asents_so_far, evaluate_asents_so_far, list_utilities.snoc( asent, sksi_unknown_sentence_asents_fo_far ),
            list_utilities.snoc( asent, all_asents_so_far ), remaining_asents.rest(), list_utilities.snoc( NIL, keywords_so_far ), remaining_keywords.rest(), meaning_sentence_gafs, contextualized_dnf_clause, sks_profile,
            ask_queryP ) );
      }
      else if( NIL != sksi_query_utilities.comparison_literal_p( asent_asent ) )
      {
        results = ConsesLow.nconc( results, sksi_crm_expand_iterate_over_asents( regular_asents_so_far, list_utilities.snoc( asent, comparison_asents_so_far ), evaluate_asents_so_far, sksi_unknown_sentence_asents_fo_far,
            list_utilities.snoc( asent, all_asents_so_far ), remaining_asents.rest(), list_utilities.snoc( NIL, keywords_so_far ), remaining_keywords.rest(), meaning_sentence_gafs, contextualized_dnf_clause, sks_profile,
            ask_queryP ) );
      }
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 8337L)
  public static SubLObject sksi_crm_expand_get_results(final SubLObject meaning_sentence_gafs, final SubLObject regular_asents, final SubLObject comparison_asents, final SubLObject evaluate_asents,
      final SubLObject sksi_unknown_sentence_asents, final SubLObject all_asents, final SubLObject contextualized_dnf_clause, final SubLObject keywords, final SubLObject sks_profile, SubLObject ask_queryP)
  {
    if( ask_queryP == UNPROVIDED )
    {
      ask_queryP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject sks = sksi_query_datastructures.sks_profile_sks( sks_profile );
    final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt( sks_profile );
    SubLObject results = NIL;
    if( NIL != sksi_conjunctive_removal_module_utilities.sksi_crm_joinable_asentsP( regular_asents, meaning_sentence_gafs, sksi_query_datastructures.sks_profile_physical_schemata( sks_profile ) ) )
    {
      thread.resetMultipleValues();
      final SubLObject csql = sksi_conjunctive_removal_module_utilities.sksi_crm_generate_csql_for_query( regular_asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents, meaning_sentence_gafs,
          sks_profile );
      final SubLObject var_decoding_map = thread.secondMultipleValue();
      final SubLObject booleanP = thread.thirdMultipleValue();
      final SubLObject error_message = thread.fourthMultipleValue();
      final SubLObject var_pfi_encodings = thread.fifthMultipleValue();
      final SubLObject var_lit_pfis = thread.sixthMultipleValue();
      final SubLObject lit_pfi_selects = thread.seventhMultipleValue();
      final SubLObject var_lfi_map = thread.eighthMultipleValue();
      thread.resetMultipleValues();
      if( NIL != error_message )
      {
        if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( FOUR_INTEGER ) )
        {
          PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str4$__SKSI__A_, $str5$Could_not_form_a_CSQL_query_with_ ), new SubLObject[] { FOUR_INTEGER,
            meaning_sentence_gafs, ConsesLow.append( regular_asents, comparison_asents, evaluate_asents, sksi_unknown_sentence_asents ), error_message
          } );
          streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
        }
      }
      else if( NIL != ask_queryP )
      {
        if( NIL != booleanP )
        {
          final SubLObject result = sksi_sks_interaction.generate_boolean_from_csql( csql, sks, UNPROVIDED );
          if( NIL != result )
          {
            final SubLObject supports = conjunctive_boolean_csql_to_sksi_support( all_asents, keywords, contextualized_dnf_clause, content_mt );
            inference_worker_removal.conjunctive_removal_callback( NIL, supports );
          }
        }
        else
        {
          SubLObject table_names = NIL;
          SubLObject cdolist_list_var = all_asents;
          SubLObject asent = NIL;
          asent = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject v_term = conses_high.second( asent ).first();
            if( NIL != forts.fort_p( v_term ) )
            {
              table_names = ConsesLow.cons( kb_mapping_utilities.pred_values( conses_high.second( asent ).first(), $const6$meaningSentencePredicateForSource, TWO_INTEGER, ONE_INTEGER, $kw7$TRUE ), table_names );
            }
            else if( NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP( FOUR_INTEGER ) )
            {
              PrintLow.format( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ), Sequences.cconcatenate( $str4$__SKSI__A_, $str8$Could_not_find_table_name_via___m ), new SubLObject[] { FOUR_INTEGER, v_term,
                asent
              } );
              streams_high.force_output( sksi_debugging.$sksi_trace_stream$.getDynamicValue( thread ) );
            }
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
          }
          final SubLObject _prev_bind_0 = sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.currentBinding( thread );
          try
          {
            sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.bind( Sequences.remove_duplicates( list_utilities.flatten( table_names ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), thread );
            final SubLObject trans_style = ( NIL != $sksi_crm_return_null_bindingsP$.getDynamicValue( thread ) ) ? $kw9$ROBUST : $kw10$NORMAL;
            final SubLObject rs_iterator = sksi_sks_interaction.generate_iterator_from_csql( csql, sks, NIL, ZERO_INTEGER, NIL, trans_style );
            if( rs_iterator.equal( $list11 ) )
            {
              SubLObject supports2 = NIL;
              SubLObject cdolist_list_var2 = all_asents;
              SubLObject asent2 = NIL;
              asent2 = cdolist_list_var2.first();
              while ( NIL != cdolist_list_var2)
              {
                supports2 = ConsesLow.cons( sksi_infrastructure_utilities.make_sksi_support( asent2, mt_relevance_macros.$mt$.getDynamicValue( thread ) ), supports2 );
                cdolist_list_var2 = cdolist_list_var2.rest();
                asent2 = cdolist_list_var2.first();
              }
              return ConsesLow.list( iteration.new_list_iterator( ConsesLow.list( ConsesLow.list( NIL, ConsesLow.list( supports2 ) ) ) ) );
            }
            if( NIL != iteration.iterator_p( rs_iterator ) && NIL == iteration.iteration_done( rs_iterator ) )
            {
              final SubLObject result_iterator = new_sksi_crm_result_iterator( rs_iterator, var_decoding_map, all_asents, contextualized_dnf_clause, keywords, sks, content_mt );
              results = ConsesLow.list( result_iterator );
            }
          }
          finally
          {
            sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$.rebind( _prev_bind_0, thread );
          }
        }
      }
      else
      {
        results = ConsesLow.cons( ConsesLow.list( csql, var_decoding_map, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map ), results );
      }
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 11320L)
  public static SubLObject sksi_crm_result_iterator_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != iteration.iterator_p( v_object ) && iteration.iteration_next_peek( v_object ) == $sym13$SKSI_CRM_RESULT_ITERATOR_NEXT );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 11577L)
  public static SubLObject new_sksi_crm_result_iterator(final SubLObject rs_iterator, final SubLObject var_decoding_map, final SubLObject asents, final SubLObject contextualized_dnf_clause, final SubLObject keywords,
      final SubLObject sks, final SubLObject content_mt)
  {
    return iteration.new_iterator( sksi_crm_result_iterator_state( rs_iterator, var_decoding_map, asents, contextualized_dnf_clause, keywords, sks, content_mt ), $sym14$SKSI_CRM_RESULT_ITERATOR_DONE,
        $sym13$SKSI_CRM_RESULT_ITERATOR_NEXT, $sym15$SKSI_CRM_RESULT_ITERATOR_FINALIZE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 11972L)
  public static SubLObject sksi_crm_result_iterator_state(final SubLObject rs_iterator, final SubLObject var_decoding_map, final SubLObject asents, final SubLObject contextualized_dnf_clause, final SubLObject keywords,
      final SubLObject sks, final SubLObject content_mt)
  {
    final SubLObject support_template = sksi_crm_result_iterator_build_support_template( asents, content_mt, contextualized_dnf_clause, keywords );
    final SubLObject content_mt_$5 = sksi_kb_accessors.sk_source_content_mt( sks );
    final SubLObject queue = NIL;
    return ConsesLow.list( queue, rs_iterator, var_decoding_map, support_template, sks, content_mt_$5 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 12382L)
  public static SubLObject sksi_crm_result_iterator_build_support_template(final SubLObject asents, final SubLObject content_mt, final SubLObject contextualized_dnf_clause, final SubLObject keywords)
  {
    SubLObject support_template = NIL;
    SubLObject asent = NIL;
    SubLObject asent_$6 = NIL;
    SubLObject original_lit = NIL;
    SubLObject original_lit_$7 = NIL;
    SubLObject keyword = NIL;
    SubLObject keyword_$8 = NIL;
    asent = asents;
    asent_$6 = asent.first();
    original_lit = clauses.pos_lits( contextualized_dnf_clause );
    original_lit_$7 = original_lit.first();
    keyword = keywords;
    keyword_$8 = keyword.first();
    while ( NIL != keyword || NIL != original_lit || NIL != asent)
    {
      SubLObject current;
      final SubLObject datum = current = asent_$6;
      SubLObject asent_mt = NIL;
      SubLObject asent_asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
      asent_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list16 );
      asent_asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        SubLObject current_$10;
        final SubLObject datum_$9 = current_$10 = original_lit_$7;
        SubLObject original_mt = NIL;
        SubLObject original_asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list17 );
        original_mt = current_$10.first();
        current_$10 = current_$10.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current_$10, datum_$9, $list17 );
        original_asent = current_$10.first();
        current_$10 = current_$10.rest();
        if( NIL == current_$10 )
        {
          final SubLObject asent_support = arguments.make_hl_support( $kw18$SKSI, asent_asent, content_mt, UNPROVIDED );
          final SubLObject aux_support = sksi_crm_result_iterator_build_auxiliary_support( asent_asent, original_asent, original_mt, keyword_$8 );
          if( NIL != aux_support )
          {
            support_template = ConsesLow.cons( ConsesLow.list( asent_support, aux_support ), support_template );
          }
          else
          {
            support_template = ConsesLow.cons( ConsesLow.list( asent_support ), support_template );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$9, $list17 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list16 );
      }
      asent = asent.rest();
      asent_$6 = asent.first();
      original_lit = original_lit.rest();
      original_lit_$7 = original_lit.first();
      keyword = keyword.rest();
      keyword_$8 = keyword.first();
    }
    return Sequences.nreverse( support_template );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 13202L)
  public static SubLObject sksi_crm_result_iterator_build_auxiliary_support(final SubLObject asent, final SubLObject original_asent, final SubLObject original_mt, final SubLObject support_keyword)
  {
    SubLObject support = NIL;
    if( NIL != support_keyword && !asent.equal( original_asent ) )
    {
      final SubLObject pred = el_utilities.literal_predicate( asent, UNPROVIDED );
      final SubLObject original_pred = el_utilities.literal_predicate( original_asent, UNPROVIDED );
      if( support_keyword.eql( $kw2$GENLPREDS ) )
      {
        support = arguments.make_hl_support( $kw2$GENLPREDS, el_utilities.make_binary_formula( $const19$genlPreds, pred, original_pred ), original_mt, UNPROVIDED );
      }
      else if( support_keyword.eql( $kw3$GENLINVERSE ) )
      {
        support = arguments.make_hl_support( $kw2$GENLPREDS, el_utilities.make_binary_formula( $const20$genlInverse, pred, original_pred ), original_mt, UNPROVIDED );
      }
      else
      {
        Errors.warn( $str21$Unknown_support_keyword__a_, support_keyword );
      }
    }
    return support;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 13908L)
  public static SubLObject sksi_crm_result_iterator_done(final SubLObject state)
  {
    SubLObject queue = NIL;
    SubLObject rs_iterator = NIL;
    SubLObject var_decoding_map = NIL;
    SubLObject support_template = NIL;
    SubLObject sks = NIL;
    SubLObject content_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list22 );
    queue = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    rs_iterator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    var_decoding_map = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    support_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    content_mt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL == queue && NIL != iteration.iteration_done( rs_iterator ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list22 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 14194L)
  public static SubLObject sksi_crm_result_iterator_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject queue = NIL;
    SubLObject rs_iterator = NIL;
    SubLObject var_decoding_map = NIL;
    SubLObject support_template = NIL;
    SubLObject sks = NIL;
    SubLObject content_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list22 );
    queue = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    rs_iterator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    var_decoding_map = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    support_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    content_mt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      SubLObject result = NIL;
      SubLObject premature_endP = NIL;
      if( NIL != queue )
      {
        ConsesLow.set_nth( ZERO_INTEGER, state, queue.rest() );
        result = queue.first();
      }
      else
      {
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( content_mt );
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          while ( NIL == result && NIL == premature_endP)
          {
            thread.resetMultipleValues();
            final SubLObject raw_results = iteration.iteration_next( rs_iterator );
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if( NIL != validP )
            {
              final SubLObject results = list_utilities.fast_delete_duplicates( sksi_crm_expand_process_results( raw_results, var_decoding_map, support_template, sks ), Symbols.symbol_function( EQUAL ), UNPROVIDED,
                  UNPROVIDED, UNPROVIDED, UNPROVIDED );
              if( NIL == results )
              {
                continue;
              }
              result = results.first();
              ConsesLow.set_nth( ZERO_INTEGER, state, results.rest() );
            }
            else
            {
              premature_endP = T;
            }
          }
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
      return Values.values( result, state, premature_endP );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list22 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 15006L)
  public static SubLObject sksi_crm_result_iterator_finalize(final SubLObject state)
  {
    SubLObject queue = NIL;
    SubLObject rs_iterator = NIL;
    SubLObject var_decoding_map = NIL;
    SubLObject support_template = NIL;
    SubLObject sks = NIL;
    SubLObject content_mt = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list22 );
    queue = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    rs_iterator = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    var_decoding_map = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    support_template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    sks = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list22 );
    content_mt = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return iteration.iteration_finalize( rs_iterator );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list22 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 15278L)
  public static SubLObject sksi_crm_result_iterator_size(final SubLObject result_iterator)
  {
    assert NIL != sksi_crm_result_iterator_p( result_iterator ) : result_iterator;
    final SubLObject state = iteration.iteration_state_peek( result_iterator );
    if( NIL != list_utilities.proper_list_p( state ) )
    {
      final SubLObject raw_iterator = conses_high.second( state );
      if( NIL != iteration.list_iterator_p( raw_iterator ) )
      {
        final SubLObject size = iteration.list_iterator_size( raw_iterator );
        return size;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 15688L)
  public static SubLObject sksi_crm_expand_process_results(final SubLObject raw_results, final SubLObject var_decoding_map, final SubLObject support_template, final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject processed_results = NIL;
    SubLObject binding_lists = NIL;
    SubLObject alist = NIL;
    SubLObject list_var = NIL;
    SubLObject raw_result = NIL;
    SubLObject index = NIL;
    list_var = raw_results;
    raw_result = list_var.first();
    for( index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), raw_result = list_var.first(), index = Numbers.add( ONE_INTEGER, index ) )
    {
      alist = conses_high.acons( ConsesLow.list( $kw24$RS_INDEX, index ), raw_result, alist );
    }
    SubLObject iteration_state;
    for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( var_decoding_map ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
        iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
    {
      thread.resetMultipleValues();
      final SubLObject var = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
      final SubLObject decodings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject subst_decodings = NIL;
      SubLObject var_bindings = NIL;
      SubLObject cdolist_list_var = decodings;
      SubLObject decoding = NIL;
      decoding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        subst_decodings = ConsesLow.cons( conses_high.sublis( alist, decoding, Symbols.symbol_function( EQUAL ), UNPROVIDED ), subst_decodings );
        cdolist_list_var = cdolist_list_var.rest();
        decoding = cdolist_list_var.first();
      }
      subst_decodings = ( cdolist_list_var = list_utilities.fast_delete_duplicates( subst_decodings, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      SubLObject subst_decoding = NIL;
      subst_decoding = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject reformed = sksi_reformulate.sksi_reformulate( subst_decoding, $kw25$DECODE, sks );
        if( NIL == sksi_query_utilities.sksi_unreformulatable_p( reformed ) )
        {
          final SubLObject binding = bindings.make_variable_binding( var, reformed );
          if( NIL == sksi_crm_valid_bindingP( binding ) )
          {
            return NIL;
          }
          var_bindings = ConsesLow.cons( binding, var_bindings );
        }
        cdolist_list_var = cdolist_list_var.rest();
        subst_decoding = cdolist_list_var.first();
      }
      binding_lists = ConsesLow.cons( list_utilities.fast_delete_duplicates( var_bindings, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), binding_lists );
    }
    dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    SubLObject cdolist_list_var2;
    final SubLObject all_bindings = cdolist_list_var2 = sksi_crm_cartesian_product( binding_lists );
    SubLObject v_bindings = NIL;
    v_bindings = cdolist_list_var2.first();
    while ( NIL != cdolist_list_var2)
    {
      v_bindings = sksi_crm_nsanitize_bindings( v_bindings );
      final SubLObject supports = conses_high.sublis( v_bindings, support_template, Symbols.symbol_function( EQ ), UNPROVIDED );
      processed_results = ConsesLow.cons( ConsesLow.list( v_bindings, supports ), processed_results );
      cdolist_list_var2 = cdolist_list_var2.rest();
      v_bindings = cdolist_list_var2.first();
    }
    return processed_results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 17124L)
  public static SubLObject sksi_crm_valid_bindingP(final SubLObject binding)
  {
    final SubLObject variable = bindings.variable_binding_variable( binding );
    return makeBoolean( NIL != variables.variable_p( variable ) || NIL != unification.unify_possible( variable, bindings.variable_binding_value( binding ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 17406L)
  public static SubLObject sksi_crm_nsanitize_bindings(SubLObject v_bindings)
  {
    if( NIL != list_utilities.find_if_not( Symbols.symbol_function( $sym26$VARIABLE_P ), v_bindings, Symbols.symbol_function( $sym27$FIRST ), UNPROVIDED, UNPROVIDED ) )
    {
      v_bindings = list_utilities.delete_if_not( Symbols.symbol_function( $sym26$VARIABLE_P ), v_bindings, Symbols.symbol_function( $sym27$FIRST ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return v_bindings;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 17626L)
  public static SubLObject sksi_crm_cartesian_product(final SubLObject lists)
  {
    SubLObject non_singletonP = NIL;
    SubLObject result = NIL;
    if( NIL == non_singletonP )
    {
      SubLObject csome_list_var = lists;
      SubLObject list = NIL;
      list = csome_list_var.first();
      while ( NIL == non_singletonP && NIL != csome_list_var)
      {
        if( NIL == list_utilities.singletonP( list ) )
        {
          non_singletonP = T;
        }
        csome_list_var = csome_list_var.rest();
        list = csome_list_var.first();
      }
    }
    if( NIL != non_singletonP )
    {
      result = list_utilities.cartesian_product( lists, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    else
    {
      SubLObject sub_result = NIL;
      SubLObject cdolist_list_var = lists;
      SubLObject list2 = NIL;
      list2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        sub_result = ConsesLow.nconc( sub_result, list2 );
        cdolist_list_var = cdolist_list_var.rest();
        list2 = cdolist_list_var.first();
      }
      result = ConsesLow.cons( sub_result, result );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 18030L)
  public static SubLObject conjunctive_boolean_csql_to_sksi_support(final SubLObject lits, final SubLObject keywords, final SubLObject contextualized_dnf_clause, final SubLObject content_mt)
  {
    SubLObject supports = NIL;
    SubLObject lit = NIL;
    SubLObject lit_$11 = NIL;
    SubLObject original_lit = NIL;
    SubLObject original_lit_$12 = NIL;
    SubLObject keyword = NIL;
    SubLObject keyword_$13 = NIL;
    lit = lits;
    lit_$11 = lit.first();
    original_lit = clauses.pos_lits( contextualized_dnf_clause );
    original_lit_$12 = original_lit.first();
    keyword = keywords;
    keyword_$13 = keyword.first();
    while ( NIL != keyword || NIL != original_lit || NIL != lit)
    {
      SubLObject current;
      final SubLObject datum = current = original_lit_$12;
      SubLObject original_mt = NIL;
      SubLObject original_asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      original_mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list17 );
      original_asent = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent( lit_$11 );
        SubLObject support = NIL;
        if( !asent.equal( original_asent ) )
        {
          final SubLObject pred = el_utilities.literal_predicate( asent, UNPROVIDED );
          final SubLObject original_pred = el_utilities.literal_predicate( original_asent, UNPROVIDED );
          if( keyword_$13 == $kw2$GENLPREDS )
          {
            support = ConsesLow.cons( arguments.make_hl_support( $kw2$GENLPREDS, el_utilities.list_to_elf( ConsesLow.list( $const19$genlPreds, pred, original_pred ) ), original_mt, UNPROVIDED ), support );
          }
          else
          {
            support = ConsesLow.cons( arguments.make_hl_support( $kw2$GENLPREDS, el_utilities.list_to_elf( ConsesLow.list( $const20$genlInverse, pred, original_pred ) ), original_mt, UNPROVIDED ), support );
          }
        }
        support = ConsesLow.cons( arguments.make_hl_support( $kw18$SKSI, asent, content_mt, UNPROVIDED ), support );
        supports = ConsesLow.cons( support, supports );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list17 );
      }
      lit = lit.rest();
      lit_$11 = lit.first();
      original_lit = original_lit.rest();
      original_lit_$12 = original_lit.first();
      keyword = keyword.rest();
      keyword_$13 = keyword.first();
    }
    return Sequences.nreverse( supports );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 19112L)
  public static SubLObject test_sksi_conjunctive_query_to_csql(final SubLObject contextualized_dnf_clause, final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject local_state;
    final SubLObject state = local_state = memoization_state.new_memoization_state( UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        return removal_sksi_conjunction_pos_lits_output_generate( variables.canonicalize_default_el_vars( contextualized_dnf_clause ), sksi_query_datastructures.new_sks_profile( sks, UNPROVIDED, UNPROVIDED ), NIL, NIL )
            .first().first();
      }
      finally
      {
        final SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$14, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 19112L)
  public static SubLObject sksi_csql_atoms_equal(final SubLObject atom1, final SubLObject atom2)
  {
    return makeBoolean( atom1.eql( atom2 ) || ( atom1.isString() && atom2.isString() && NIL != Strings.stringE( list_utilities.remove_if_not( $sym28$ALPHA_OR_UNDERSCORE_P, atom1, UNPROVIDED, UNPROVIDED, UNPROVIDED,
        UNPROVIDED ), list_utilities.remove_if_not( $sym28$ALPHA_OR_UNDERSCORE_P, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-modules-expand.lisp", position = 19112L)
  public static SubLObject sksi_csql_equivalent(final SubLObject csql1, final SubLObject csql2)
  {
    return conses_high.tree_equal( csql1, csql2, $sym29$SKSI_CSQL_ATOMS_EQUAL );
  }

  public static SubLObject declare_sksi_conjunctive_removal_modules_expand_file()
  {
    SubLFiles.declareFunction( me, "removal_sksi_conjunction_pos_lits_output_generate", "REMOVAL-SKSI-CONJUNCTION-POS-LITS-OUTPUT-GENERATE", 2, 2, false );
    SubLFiles.declareFunction( me, "sksi_crm_expand_iterate_over_meaning_sentence_gafs", "SKSI-CRM-EXPAND-ITERATE-OVER-MEANING-SENTENCE-GAFS", 4, 1, false );
    SubLFiles.declareFunction( me, "sksi_crm_expand_process_meaning_sentence_gafs", "SKSI-CRM-EXPAND-PROCESS-MEANING-SENTENCE-GAFS", 3, 1, false );
    SubLFiles.declareFunction( me, "sksi_crm_expand_iterate_over_asents", "SKSI-CRM-EXPAND-ITERATE-OVER-ASENTS", 11, 1, false );
    SubLFiles.declareFunction( me, "sksi_crm_expand_get_results", "SKSI-CRM-EXPAND-GET-RESULTS", 9, 1, false );
    SubLFiles.declareFunction( me, "sksi_crm_result_iterator_p", "SKSI-CRM-RESULT-ITERATOR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sksi_crm_result_iterator", "NEW-SKSI-CRM-RESULT-ITERATOR", 7, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_result_iterator_state", "SKSI-CRM-RESULT-ITERATOR-STATE", 7, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_result_iterator_build_support_template", "SKSI-CRM-RESULT-ITERATOR-BUILD-SUPPORT-TEMPLATE", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_result_iterator_build_auxiliary_support", "SKSI-CRM-RESULT-ITERATOR-BUILD-AUXILIARY-SUPPORT", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_result_iterator_done", "SKSI-CRM-RESULT-ITERATOR-DONE", 1, 0, false );
    new $sksi_crm_result_iterator_done$UnaryFunction();
    SubLFiles.declareFunction( me, "sksi_crm_result_iterator_next", "SKSI-CRM-RESULT-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_result_iterator_finalize", "SKSI-CRM-RESULT-ITERATOR-FINALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_result_iterator_size", "SKSI-CRM-RESULT-ITERATOR-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_expand_process_results", "SKSI-CRM-EXPAND-PROCESS-RESULTS", 4, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_valid_bindingP", "SKSI-CRM-VALID-BINDING?", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_nsanitize_bindings", "SKSI-CRM-NSANITIZE-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_crm_cartesian_product", "SKSI-CRM-CARTESIAN-PRODUCT", 1, 0, false );
    SubLFiles.declareFunction( me, "conjunctive_boolean_csql_to_sksi_support", "CONJUNCTIVE-BOOLEAN-CSQL-TO-SKSI-SUPPORT", 4, 0, false );
    SubLFiles.declareFunction( me, "test_sksi_conjunctive_query_to_csql", "TEST-SKSI-CONJUNCTIVE-QUERY-TO-CSQL", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_csql_atoms_equal", "SKSI-CSQL-ATOMS-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_csql_equivalent", "SKSI-CSQL-EQUIVALENT", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_sksi_conjunctive_removal_modules_expand_file()
  {
    $sksi_crm_return_null_bindingsP$ = SubLFiles.defparameter( "*SKSI-CRM-RETURN-NULL-BINDINGS?*", NIL );
    return NIL;
  }

  public static SubLObject setup_sksi_conjunctive_removal_modules_expand_file()
  {
    generic_testing.define_test_case_table_int( $sym30$TEST_SKSI_CONJUNCTIVE_QUERY_TO_CSQL, ConsesLow.list( new SubLObject[] { $kw31$TEST, $sym32$SKSI_CSQL_EQUIVALENT, $kw33$OWNER, NIL, $kw34$CLASSES, NIL, $kw35$KB,
      $kw36$FULL, $kw37$WORKING_, T
    } ), $list38 );
    return NIL;
  }

  private static SubLObject _constant_38_initializer()
  {
    return ConsesLow.list( ConsesLow.list( ConsesLow.list( ConsesLow.list( NIL, ConsesLow.list( new SubLObject[] { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow
        .list( constant_handles.reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?VAR0" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DateAfterFn" ) ), makeSymbol(
            "?VAR1" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) ), makeInteger( 300 ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksiLaterThan" ) ), makeSymbol( "?VAR2" ), makeSymbol( "?VAR0" ) ) ), ConsesLow.list( constant_handles
                    .reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pharmaceuticalGC3Code" ) ), makeSymbol( "?VAR3" ), makeString(
                        "H2F" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "patientOfClaim" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SchemaObjectFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                "CycRxClaimMapping" ) ), makeInteger( "939621383841318230" ) ), makeSymbol( "?VAR4" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ),
                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "pharmaceuticalOfClaim" ) ), makeSymbol( "?VAR5" ), makeSymbol( "?VAR3" ) ) ), ConsesLow.list( constant_handles
                                        .reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "acceptanceOutcomeTypeOfClaim" ) ),
                                            makeSymbol( "?VAR5" ), constant_handles.reader_make_constant_shell( makeString( "AcceptingAnInsuranceClaim" ) ) ) ), ConsesLow.list( constant_handles
                                                .reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientOfClaim" ) ), makeSymbol(
                                                    "?VAR5" ), makeSymbol( "?VAR4" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "claimProcessedOnDate" ) ), makeSymbol( "?VAR5" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list( constant_handles
                                                            .reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "patientOfClaim" ) ),
                                                                makeSymbol( "?VAR6" ), makeSymbol( "?VAR4" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow
                                                                    .list( constant_handles.reader_make_constant_shell( makeString( "claimProcessedOnDate" ) ), makeSymbol( "?VAR6" ), makeSymbol( "?VAR2" ) ) )
    } ) ), constant_handles.reader_make_constant_shell( makeString( "CycRx-KS" ) ) ), ConsesLow.list( makeKeyword( "SELECT" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "FIELD" ), makeString(
        "product_service_id" ), makeString( "drug723227" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
            "phcy_claim_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                "patient_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                    "phcy_claim_id" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                        "serviced_dte" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "EVAL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLDateAfterFn" ) ), ConsesLow
                            .list( makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                "CSQLSecondsDurationFn" ) ), makeInteger( 25920000 ) ) ) )
    } ), ConsesLow.list( makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ), makeString( "claim" ), makeString( "claim723234" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString(
        "claim" ), makeString( "claim723232" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "claim" ), makeString( "claim723228" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "drug" ),
            makeString( "drug723227" ), NIL ) ) ), ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLLaterThan" ) ), ConsesLow.list(
                makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723234" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLDateAfterFn" ) ), ConsesLow.list(
                    makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLSecondsDurationFn" ) ), makeInteger(
                        25920000 ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString(
                            "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723234" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ),
                                    makeString( "claim723234" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                                        "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723232" ) ) ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "claim723232" ) ), ConsesLow
                                                .list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "drug723227" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                    "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "specific_class_cde" ), makeString( "drug723227" ) ), makeString( "H2F" ) ), ConsesLow.list(
                                                        constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "phcy_claim_id" ), makeString(
                                                            "claim723228" ) ), makeInteger( "939621383841318230" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow
                                                                .list( makeKeyword( "FIELD" ), makeString( "claim_accepted_ind" ), makeString( "claim723232" ) ), makeString( "Y" ) ) ) ) ) ), ConsesLow.list( ConsesLow
                                                                    .list( ConsesLow.list( NIL, ConsesLow.list( new SubLObject[]
                                                                    { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles
                                                                        .reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?VAR0" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                            makeString( "DateAfterFn" ) ), makeSymbol( "?VAR1" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                "MonthsDuration" ) ), THREE_INTEGER ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ),
                                                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksiLaterThan" ) ), makeSymbol( "?VAR2" ), makeSymbol(
                                                                                        "?VAR0" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list(
                                                                                            constant_handles.reader_make_constant_shell( makeString( "pharmaceuticalGC3Code" ) ), makeSymbol( "?VAR3" ), makeString(
                                                                                                "H2F" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list(
                                                                                                    constant_handles.reader_make_constant_shell( makeString( "patientOfClaim" ) ), ConsesLow.list( constant_handles
                                                                                                        .reader_make_constant_shell( makeString( "SchemaObjectFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                            makeString( "CycRxClaimMapping" ) ), makeInteger( "939621383841318230" ) ), makeSymbol( "?VAR4" ) ) ), ConsesLow
                                                                                                                .list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list(
                                                                                                                    constant_handles.reader_make_constant_shell( makeString( "pharmaceuticalOfClaim" ) ), makeSymbol(
                                                                                                                        "?VAR5" ), makeSymbol( "?VAR3" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                            makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                makeString( "acceptanceOutcomeTypeOfClaim" ) ), makeSymbol( "?VAR5" ), constant_handles
                                                                                                                                    .reader_make_constant_shell( makeString( "AcceptingAnInsuranceClaim" ) ) ) ), ConsesLow
                                                                                                                                        .list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ),
                                                                                                                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                "patientOfClaim" ) ), makeSymbol( "?VAR5" ), makeSymbol( "?VAR4" ) ) ),
                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "claimProcessedOnDate" ) ), makeSymbol( "?VAR5" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list(
                                                                              constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                  makeString( "patientOfClaim" ) ), makeSymbol( "?VAR6" ), makeSymbol( "?VAR4" ) ) ), ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                          "claimProcessedOnDate" ) ), makeSymbol( "?VAR6" ), makeSymbol( "?VAR2" ) ) )
    } ) ), constant_handles.reader_make_constant_shell( makeString( "CycRx-KS" ) ) ), ConsesLow.list( makeKeyword( "SELECT" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "FIELD" ), makeString(
        "product_service_id" ), makeString( "drug723227" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
            "phcy_claim_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                "patient_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                    "phcy_claim_id" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                        "serviced_dte" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "EVAL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLDateAfterFn" ) ), ConsesLow
                            .list( makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLMonthsDurationFn" ) ),
                                THREE_INTEGER ) ) )
    } ), ConsesLow.list( makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ), makeString( "claim" ), makeString( "claim723234" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString(
        "claim" ), makeString( "claim723232" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "claim" ), makeString( "claim723228" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "drug" ),
            makeString( "drug723227" ), NIL ) ) ), ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLLaterThan" ) ), ConsesLow.list(
                makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723234" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLDateAfterFn" ) ), ConsesLow.list(
                    makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLMonthsDurationFn" ) ),
                        THREE_INTEGER ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString(
                            "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723234" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ),
                                    makeString( "claim723234" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                                        "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723232" ) ) ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "claim723232" ) ), ConsesLow
                                                .list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "drug723227" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                    "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "specific_class_cde" ), makeString( "drug723227" ) ), makeString( "H2F" ) ), ConsesLow.list(
                                                        constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "phcy_claim_id" ), makeString(
                                                            "claim723228" ) ), makeInteger( "939621383841318230" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow
                                                                .list( makeKeyword( "FIELD" ), makeString( "claim_accepted_ind" ), makeString( "claim723232" ) ), makeString( "Y" ) ) ) ) ) ), ConsesLow.list( ConsesLow
                                                                    .list( ConsesLow.list( NIL, ConsesLow.list( new SubLObject[]
                                                                    { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles
                                                                        .reader_make_constant_shell( makeString( "evaluate" ) ), makeSymbol( "?VAR0" ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                            makeString( "DateAfterFn" ) ), makeSymbol( "?VAR1" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                "DecadesDuration" ) ), ONE_INTEGER ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ),
                                                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksiLaterThan" ) ), makeSymbol( "?VAR2" ), makeSymbol(
                                                                                        "?VAR0" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list(
                                                                                            constant_handles.reader_make_constant_shell( makeString( "pharmaceuticalGC3Code" ) ), makeSymbol( "?VAR3" ), makeString(
                                                                                                "H2F" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list(
                                                                                                    constant_handles.reader_make_constant_shell( makeString( "patientOfClaim" ) ), ConsesLow.list( constant_handles
                                                                                                        .reader_make_constant_shell( makeString( "SchemaObjectFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                            makeString( "CycRxClaimMapping" ) ), makeInteger( "939621383841318230" ) ), makeSymbol( "?VAR4" ) ) ), ConsesLow
                                                                                                                .list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list(
                                                                                                                    constant_handles.reader_make_constant_shell( makeString( "pharmaceuticalOfClaim" ) ), makeSymbol(
                                                                                                                        "?VAR5" ), makeSymbol( "?VAR3" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                            makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                makeString( "acceptanceOutcomeTypeOfClaim" ) ), makeSymbol( "?VAR5" ), constant_handles
                                                                                                                                    .reader_make_constant_shell( makeString( "AcceptingAnInsuranceClaim" ) ) ) ), ConsesLow
                                                                                                                                        .list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ),
                                                                                                                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                "patientOfClaim" ) ), makeSymbol( "?VAR5" ), makeSymbol( "?VAR4" ) ) ),
                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "claimProcessedOnDate" ) ), makeSymbol( "?VAR5" ), makeSymbol( "?VAR1" ) ) ), ConsesLow.list(
                                                                              constant_handles.reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                  makeString( "patientOfClaim" ) ), makeSymbol( "?VAR6" ), makeSymbol( "?VAR4" ) ) ), ConsesLow.list( constant_handles
                                                                                      .reader_make_constant_shell( makeString( "CycRxQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                          "claimProcessedOnDate" ) ), makeSymbol( "?VAR6" ), makeSymbol( "?VAR2" ) ) )
    } ) ), constant_handles.reader_make_constant_shell( makeString( "CycRx-KS" ) ) ), ConsesLow.list( makeKeyword( "SELECT" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "FIELD" ), makeString(
        "product_service_id" ), makeString( "drug723227" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
            "phcy_claim_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                "patient_id" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                    "phcy_claim_id" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                        "serviced_dte" ), makeString( "claim723234" ) ), ConsesLow.list( makeKeyword( "EVAL" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLDateAfterFn" ) ), ConsesLow
                            .list( makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLYearsDurationFn" ) ),
                                TEN_INTEGER ) ) )
    } ), ConsesLow.list( makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ), makeString( "claim" ), makeString( "claim723234" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString(
        "claim" ), makeString( "claim723232" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "claim" ), makeString( "claim723228" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "drug" ),
            makeString( "drug723227" ), NIL ) ) ), ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLLaterThan" ) ), ConsesLow.list(
                makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723234" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLDateAfterFn" ) ), ConsesLow.list(
                    makeKeyword( "FIELD" ), makeString( "serviced_dte" ), makeString( "claim723232" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLYearsDurationFn" ) ),
                        TEN_INTEGER ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString(
                            "claim723232" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723234" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ),
                                    makeString( "claim723234" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                                        "patient_id" ), makeString( "claim723228" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "patient_id" ), makeString( "claim723232" ) ) ), ConsesLow.list( constant_handles
                                            .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "claim723232" ) ), ConsesLow
                                                .list( makeKeyword( "FIELD" ), makeString( "product_service_id" ), makeString( "drug723227" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                    "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "specific_class_cde" ), makeString( "drug723227" ) ), makeString( "H2F" ) ), ConsesLow.list(
                                                        constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "phcy_claim_id" ), makeString(
                                                            "claim723228" ) ), makeInteger( "939621383841318230" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow
                                                                .list( makeKeyword( "FIELD" ), makeString( "claim_accepted_ind" ), makeString( "claim723232" ) ), makeString( "Y" ) ) ) ) ) ), ConsesLow.list( ConsesLow
                                                                    .list( ConsesLow.list( NIL, ConsesLow.list( new SubLObject[]
                                                                    { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles
                                                                        .reader_make_constant_shell( makeString( "greaterThan" ) ), makeSymbol( "?VAR0" ), makeInteger( 25 ) ) ), ConsesLow.list( constant_handles
                                                                            .reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                "greaterThan" ) ), FIVE_INTEGER, makeSymbol( "?VAR1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                    "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "greaterThan" ) ), makeInteger(
                                                                                        60 ), makeSymbol( "?VAR2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                            "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                "detectedFinalValueOfGaugeTrendDetection-ImplicitUnits" ) ), makeSymbol( "?VAR3" ), makeSymbol( "?VAR0" ) ) ), ConsesLow
                                                                                                    .list( constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list(
                                                                                                        constant_handles.reader_make_constant_shell( makeString( "sksiUnknownSentence" ) ), ConsesLow.list( constant_handles
                                                                                                            .reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol( "?T-START" ), ConsesLow.list(
                                                                                                                constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles
                                                                                                                    .reader_make_constant_shell( makeString( "gaugeTrendDetectionStartDate" ) ), makeSymbol( "?VAR3" ),
                                                                                                                    makeSymbol( "?T-START" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                        "sksiLaterThan" ) ), makeSymbol( "?T-START" ), ConsesLow.list( constant_handles
                                                                                                                            .reader_make_constant_shell( makeString( "MilliSecondFn" ) ), ZERO_INTEGER, ConsesLow.list(
                                                                                                                                constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), ZERO_INTEGER,
                                                                                                                                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "MinuteFn" ) ),
                                                                                                                                    SIXTEEN_INTEGER, ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                        makeString( "HourFn" ) ), THREE_INTEGER, ConsesLow.list( constant_handles
                                                                                                                                            .reader_make_constant_shell( makeString( "DayFn" ) ), THIRTEEN_INTEGER,
                                                                                                                                            ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                    "March" ) ), ConsesLow.list( constant_handles
                                                                                                                                                        .reader_make_constant_shell( makeString( "YearFn" ) ), makeInteger(
                                                                                                                                                            2011 ) ) ) ) ) ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                                .reader_make_constant_shell( makeString(
                                                                                                                                                                    "WellSurveillanceQueryMt" ) ), ConsesLow.list(
                                                                                                                                                                        constant_handles.reader_make_constant_shell(
                                                                                                                                                                            makeString( "sksiUnknownSentence" ) ), ConsesLow
                                                                                                                                                                                .list( constant_handles
                                                                                                                                                                                    .reader_make_constant_shell( makeString(
                                                                                                                                                                                        "thereExists" ) ), makeSymbol(
                                                                                                                                                                                            "?T-END" ), ConsesLow.list(
                                                                                                                                                                                                constant_handles
                                                                                                                                                                                                    .reader_make_constant_shell(
                                                                                                                                                                                                        makeString(
                                                                                                                                                                                                            "and" ) ),
                                                                                                                                                                                                ConsesLow.list(
                                                                                                                                                                                                    constant_handles
                                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                                            makeString(
                                                                                                                                                                                                                "gaugeTrendDetectionEndDate" ) ),
                                                                                                                                                                                                    makeSymbol( "?VAR3" ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "?T-END" ) ),
                                                                                                                                                                                                ConsesLow.list(
                                                                                                                                                                                                    constant_handles
                                                                                                                                                                                                        .reader_make_constant_shell(
                                                                                                                                                                                                            makeString(
                                                                                                                                                                                                                "sksiLaterThan" ) ),
                                                                                                                                                                                                    ConsesLow.list(
                                                                                                                                                                                                        constant_handles
                                                                                                                                                                                                            .reader_make_constant_shell(
                                                                                                                                                                                                                makeString(
                                                                                                                                                                                                                    "MilliSecondFn" ) ),
                                                                                                                                                                                                        ZERO_INTEGER,
                                                                                                                                                                                                        ConsesLow.list(
                                                                                                                                                                                                            constant_handles
                                                                                                                                                                                                                .reader_make_constant_shell(
                                                                                                                                                                                                                    makeString(
                                                                                                                                                                                                                        "SecondFn" ) ),
                                                                                                                                                                                                            ZERO_INTEGER,
                                                                                                                                                                                                            ConsesLow.list(
                                                                                                                                                                                                                constant_handles
                                                                                                                                                                                                                    .reader_make_constant_shell(
                                                                                                                                                                                                                        makeString(
                                                                                                                                                                                                                            "MinuteFn" ) ),
                                                                                                                                                                                                                makeInteger(
                                                                                                                                                                                                                    44 ),
                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                        constant_handles
                                                                                                                                                                                                                            .reader_make_constant_shell(
                                                                                                                                                                                                                                makeString(
                                                                                                                                                                                                                                    "HourFn" ) ),
                                                                                                                                                                                                                        makeInteger(
                                                                                                                                                                                                                            22 ),
                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                constant_handles
                                                                                                                                                                                                                                    .reader_make_constant_shell(
                                                                                                                                                                                                                                        makeString(
                                                                                                                                                                                                                                            "DayFn" ) ),
                                                                                                                                                                                                                                TWELVE_INTEGER,
                                                                                                                                                                                                                                ConsesLow
                                                                                                                                                                                                                                    .list(
                                                                                                                                                                                                                                        constant_handles
                                                                                                                                                                                                                                            .reader_make_constant_shell(
                                                                                                                                                                                                                                                makeString(
                                                                                                                                                                                                                                                    "MonthFn" ) ),
                                                                                                                                                                                                                                        constant_handles
                                                                                                                                                                                                                                            .reader_make_constant_shell(
                                                                                                                                                                                                                                                makeString(
                                                                                                                                                                                                                                                    "March" ) ),
                                                                                                                                                                                                                                        ConsesLow
                                                                                                                                                                                                                                            .list(
                                                                                                                                                                                                                                                constant_handles
                                                                                                                                                                                                                                                    .reader_make_constant_shell(
                                                                                                                                                                                                                                                        makeString(
                                                                                                                                                                                                                                                            "YearFn" ) ),
                                                                                                                                                                                                                                                makeInteger(
                                                                                                                                                                                                                                                    2011 ) ) ) ) ) ) ) ),
                                                                                                                                                                                                    makeSymbol(
                                                                                                                                                                                                        "?T-END" ) ) ) ) ) ),
                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "detectedMagnitudeOfGaugeTrendDetection-ImplicitUnits" ) ), makeSymbol( "?VAR3" ), makeSymbol(
                                                                              "?VAR1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list(
                                                                                  constant_handles.reader_make_constant_shell( makeString( "gaugeTrendDetectionAssessmentDate" ) ), makeSymbol( "?VAR3" ), ConsesLow.list(
                                                                                      constant_handles.reader_make_constant_shell( makeString( "MilliSecondFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                          .reader_make_constant_shell( makeString( "SecondFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                              .reader_make_constant_shell( makeString( "MinuteFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "HourFn" ) ), EIGHT_INTEGER, ConsesLow.list( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "DayFn" ) ), THIRTEEN_INTEGER, ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                              "March" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "YearFn" ) ),
                                                                                                                  makeInteger( 2011 ) ) ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                      makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles
                                                                                                                          .reader_make_constant_shell( makeString( "sksiUnknownSentence" ) ), ConsesLow.list(
                                                                                                                              constant_handles.reader_make_constant_shell( makeString( "thereExists" ) ), makeSymbol(
                                                                                                                                  "?T-START" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                      "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "gaugeTrendDetectionStartDate" ) ), makeSymbol( "?VAR4" ), makeSymbol(
                                                                                                                                              "?T-START" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                                                  makeString( "sksiLaterThan" ) ), makeSymbol( "?T-START" ), ConsesLow.list(
                                                                                                                                                      constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                          "MilliSecondFn" ) ), ZERO_INTEGER, ConsesLow.list(
                                                                                                                                                              constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                                  "SecondFn" ) ), ZERO_INTEGER, ConsesLow.list(
                                                                                                                                                                      constant_handles.reader_make_constant_shell(
                                                                                                                                                                          makeString( "MinuteFn" ) ), SIXTEEN_INTEGER,
                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                          .reader_make_constant_shell( makeString(
                                                                                                                                                                              "HourFn" ) ), THREE_INTEGER, ConsesLow.list(
                                                                                                                                                                                  constant_handles
                                                                                                                                                                                      .reader_make_constant_shell(
                                                                                                                                                                                          makeString( "DayFn" ) ),
                                                                                                                                                                                  THIRTEEN_INTEGER, ConsesLow.list(
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "MonthFn" ) ),
                                                                                                                                                                                      constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "March" ) ),
                                                                                                                                                                                      ConsesLow.list( constant_handles
                                                                                                                                                                                          .reader_make_constant_shell(
                                                                                                                                                                                              makeString( "YearFn" ) ),
                                                                                                                                                                                          makeInteger(
                                                                                                                                                                                              2011 ) ) ) ) ) ) ) ) ) ) ) ) ),
                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "sksiUnknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                              "thereExists" ) ), makeSymbol( "?T-END" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list(
                                                                                  constant_handles.reader_make_constant_shell( makeString( "gaugeTrendDetectionEndDate" ) ), makeSymbol( "?VAR4" ), makeSymbol(
                                                                                      "?T-END" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "sksiLaterThan" ) ), ConsesLow.list(
                                                                                          constant_handles.reader_make_constant_shell( makeString( "MilliSecondFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                              .reader_make_constant_shell( makeString( "SecondFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                  .reader_make_constant_shell( makeString( "MinuteFn" ) ), makeInteger( 44 ), ConsesLow.list( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "HourFn" ) ), makeInteger( 22 ), ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "DayFn" ) ), TWELVE_INTEGER, ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                  makeString( "March" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                      "YearFn" ) ), makeInteger( 2011 ) ) ) ) ) ) ) ), makeSymbol( "?T-END" ) ) ) ) ) ), ConsesLow.list(
                                                                                                                          constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow
                                                                                                                              .list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                  "gaugeTrendDetectionBySensor" ) ), makeSymbol( "?VAR4" ), makeSymbol( "?VAR5" ) ) ),
                                                                      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles
                                                                          .reader_make_constant_shell( makeString( "gaugeTrendDetectionBySensor" ) ), makeSymbol( "?VAR3" ), makeSymbol( "?VAR6" ) ) ), ConsesLow.list(
                                                                              constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list( constant_handles
                                                                                  .reader_make_constant_shell( makeString( "detectedMagnitudeOfGaugeTrendDetection-ImplicitUnits" ) ), makeSymbol( "?VAR4" ), makeSymbol(
                                                                                      "?VAR2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list(
                                                                                          constant_handles.reader_make_constant_shell( makeString( "gaugeTrendDetectionAssessmentDate" ) ), makeSymbol( "?VAR4" ), ConsesLow
                                                                                              .list( constant_handles.reader_make_constant_shell( makeString( "MilliSecondFn" ) ), ZERO_INTEGER, ConsesLow.list(
                                                                                                  constant_handles.reader_make_constant_shell( makeString( "SecondFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                      .reader_make_constant_shell( makeString( "MinuteFn" ) ), ZERO_INTEGER, ConsesLow.list( constant_handles
                                                                                                          .reader_make_constant_shell( makeString( "HourFn" ) ), EIGHT_INTEGER, ConsesLow.list( constant_handles
                                                                                                              .reader_make_constant_shell( makeString( "DayFn" ) ), THIRTEEN_INTEGER, ConsesLow.list( constant_handles
                                                                                                                  .reader_make_constant_shell( makeString( "MonthFn" ) ), constant_handles.reader_make_constant_shell(
                                                                                                                      makeString( "March" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                          "YearFn" ) ), makeInteger( 2011 ) ) ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                              .reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ), ConsesLow.list(
                                                                                                                                  constant_handles.reader_make_constant_shell( makeString( "gaugeInWell" ) ), makeSymbol(
                                                                                                                                      "?VAR5" ), constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                          "OilWell-033" ) ) ) ), ConsesLow.list( constant_handles
                                                                                                                                              .reader_make_constant_shell( makeString( "WellSurveillanceQueryMt" ) ),
                                                                                                                                              ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                                  "gaugeInWell" ) ), makeSymbol( "?VAR6" ), constant_handles
                                                                                                                                                      .reader_make_constant_shell( makeString( "OilWell-033" ) ) ) )
    } ) ), constant_handles.reader_make_constant_shell( makeString( "WellSurveillanceDataStore-KS" ) ) ), ConsesLow.list( makeKeyword( "SELECT" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword(
        "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND0" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "FINAL_VALUE" ), makeString( "GAUGE_TREND0" ) ), ConsesLow.list( makeKeyword( "FIELD" ),
            makeString( "ID" ), makeString( "GAUGE_TREND1" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "CHANGE_VALUE" ), makeString( "GAUGE_TREND1" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                "ID" ), makeString( "GAUGE_TREND2" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND3" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ),
                    makeString( "GAUGE_TREND3" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND4" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ),
                        makeString( "GAUGE_TREND4" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND5" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "CHANGE_VALUE" ),
                            makeString( "GAUGE_TREND5" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND6" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ),
                                makeString( "GAUGE7" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE8" ) )
    } ), ConsesLow.list( makeKeyword( "FROM" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "TABLE" ), makeString( "GAUGE" ), makeString( "GAUGE8" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ),
        makeString( "GAUGE" ), makeString( "GAUGE7" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND6" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString(
            "GAUGE_TREND" ), makeString( "GAUGE_TREND5" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND4" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ),
                makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND3" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND2" ), NIL ), ConsesLow.list( makeKeyword(
                    "TABLE" ), makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND1" ), NIL ), ConsesLow.list( makeKeyword( "TABLE" ), makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND0" ), NIL )
    } ) ), ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( new SubLObject[] { ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLNot" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "CSQLExists" ) ), ConsesLow.list( makeKeyword( "SELECT" ), ONE_INTEGER, ConsesLow.list( makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ),
            makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND9" ), NIL ) ) ), ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND0" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND9" ) ) ),
                ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLLaterThan" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "START_DATE" ), makeString( "GAUGE_TREND9" ) ),
                    makeString( "2011-03-13 03:16:00.0" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ),
                        makeString( "GAUGE_TREND6" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE7" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                            "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ), makeString( "GAUGE_TREND9" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString(
                                "GAUGE8" ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLNot" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                    "CSQLExists" ) ), ConsesLow.list( makeKeyword( "SELECT" ), ONE_INTEGER, ConsesLow.list( makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ), makeString(
                                        "GAUGE_TREND" ), makeString( "GAUGE_TREND10" ), NIL ) ) ), ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell(
                                            makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND0" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                                                "ID" ), makeString( "GAUGE_TREND10" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLLaterThan" ) ), makeString(
                                                    "2011-03-12 22:44:00.0" ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "END_DATE" ), makeString( "GAUGE_TREND10" ) ) ), ConsesLow.list( constant_handles
                                                        .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ), makeString( "GAUGE_TREND6" ) ),
                                                        ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE7" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                            "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ), makeString( "GAUGE_TREND10" ) ), ConsesLow.list( makeKeyword( "FIELD" ),
                                                                makeString( "ID" ), makeString( "GAUGE8" ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLNot" ) ), ConsesLow
                                                                    .list( constant_handles.reader_make_constant_shell( makeString( "CSQLExists" ) ), ConsesLow.list( makeKeyword( "SELECT" ), ONE_INTEGER, ConsesLow.list(
                                                                        makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ), makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND10" ), NIL ),
                                                                            ConsesLow.list( makeKeyword( "TABLE" ), makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND11" ), NIL ) ) ), ConsesLow.list( makeKeyword(
                                                                                "WHERE" ), ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list(
                                                                                    makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND11" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ),
                                                                                        makeString( "GAUGE_TREND3" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLLaterThan" ) ),
                                                                                            ConsesLow.list( makeKeyword( "FIELD" ), makeString( "START_DATE" ), makeString( "GAUGE_TREND11" ) ), makeString(
                                                                                                "2011-03-13 03:16:00.0" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ),
                                                                                                    ConsesLow.list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ), makeString( "GAUGE_TREND11" ) ), ConsesLow.list(
                                                                                                        makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE7" ) ) ), ConsesLow.list( constant_handles
                                                                                                            .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                                                                                                                "GAUGE_ID" ), makeString( "GAUGE_TREND10" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ),
                                                                                                                    makeString( "GAUGE8" ) ) ) ) ) ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                                                                                                                        makeString( "CSQLNot" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                            "CSQLExists" ) ), ConsesLow.list( makeKeyword( "SELECT" ), ONE_INTEGER, ConsesLow.list(
                                                                                                                                makeKeyword( "FROM" ), ConsesLow.list( ConsesLow.list( makeKeyword( "TABLE" ), makeString(
                                                                                                                                    "GAUGE_TREND" ), makeString( "GAUGE_TREND10" ), NIL ), ConsesLow.list( makeKeyword(
                                                                                                                                        "TABLE" ), makeString( "GAUGE_TREND" ), makeString( "GAUGE_TREND12" ), NIL ) ) ),
                                                                                                                                ConsesLow.list( makeKeyword( "WHERE" ), ConsesLow.list( ConsesLow.list( constant_handles
                                                                                                                                    .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword(
                                                                                                                                        "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND12" ) ), ConsesLow.list(
                                                                                                                                            makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND3" ) ) ),
                                                                                                                                    ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                                                        "CSQLLaterThan" ) ), makeString( "2011-03-12 22:44:00.0" ), ConsesLow.list(
                                                                                                                                            makeKeyword( "FIELD" ), makeString( "END_DATE" ), makeString(
                                                                                                                                                "GAUGE_TREND12" ) ) ), ConsesLow.list( constant_handles
                                                                                                                                                    .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow
                                                                                                                                                        .list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ), makeString(
                                                                                                                                                            "GAUGE_TREND12" ) ), ConsesLow.list( makeKeyword( "FIELD" ),
                                                                                                                                                                makeString( "ID" ), makeString( "GAUGE7" ) ) ), ConsesLow
                                                                                                                                                                    .list( constant_handles.reader_make_constant_shell(
                                                                                                                                                                        makeString( "CSQLEquals" ) ), ConsesLow.list(
                                                                                                                                                                            makeKeyword( "FIELD" ), makeString(
                                                                                                                                                                                "GAUGE_ID" ), makeString(
                                                                                                                                                                                    "GAUGE_TREND10" ) ), ConsesLow.list(
                                                                                                                                                                                        makeKeyword( "FIELD" ), makeString(
                                                                                                                                                                                            "ID" ), makeString(
                                                                                                                                                                                                "GAUGE8" ) ) ) ) ) ) ) ),
      ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLGreaterThan" ) ), makeInteger( 60 ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "CHANGE_VALUE" ), makeString(
          "GAUGE_TREND5" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLGreaterThan" ) ), FIVE_INTEGER, ConsesLow.list( makeKeyword( "FIELD" ), makeString( "CHANGE_VALUE" ),
              makeString( "GAUGE_TREND1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLGreaterThan" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "FINAL_VALUE" ),
                  makeString( "GAUGE_TREND0" ) ), makeInteger( 25 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                      "GAUGE_ID" ), makeString( "GAUGE_TREND4" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE8" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell(
                          makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "GAUGE_ID" ), makeString( "GAUGE_TREND3" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ),
                              makeString( "GAUGE7" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString(
                                  "GAUGE_TREND5" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND6" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                      "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND3" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString(
                                          "GAUGE_TREND6" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ),
                                              makeString( "GAUGE_TREND3" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND5" ) ) ), ConsesLow.list( constant_handles
                                                  .reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND2" ) ), ConsesLow.list(
                                                      makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND4" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                          "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND1" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                                                              "ID" ), makeString( "GAUGE_TREND4" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list(
                                                                  makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND0" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString(
                                                                      "GAUGE_TREND4" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword(
                                                                          "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND1" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString(
                                                                              "GAUGE_TREND2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list( makeKeyword(
                                                                                  "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND0" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ID" ), makeString(
                                                                                      "GAUGE_TREND2" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ), ConsesLow.list(
                                                                                          makeKeyword( "FIELD" ), makeString( "ID" ), makeString( "GAUGE_TREND0" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString(
                                                                                              "ID" ), makeString( "GAUGE_TREND1" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                  "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ASSESS_DATE" ), makeString( "GAUGE_TREND2" ) ),
                                                                                                  makeString( "2011-03-13 08:00:00.0" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                      "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "ASSESS_DATE" ), makeString( "GAUGE_TREND6" ) ),
                                                                                                      makeString( "2011-03-13 08:00:00.0" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString(
                                                                                                          "CSQLEquals" ) ), ConsesLow.list( makeKeyword( "FIELD" ), makeString( "WELL_ID" ), makeString( "GAUGE7" ) ),
                                                                                                          makeInteger( 33 ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "CSQLEquals" ) ),
                                                                                                              ConsesLow.list( makeKeyword( "FIELD" ), makeString( "WELL_ID" ), makeString( "GAUGE8" ) ), makeInteger( 33 ) )
    } ) ) ) ) );
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_conjunctive_removal_modules_expand_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_conjunctive_removal_modules_expand_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_conjunctive_removal_modules_expand_file();
  }
  static
  {
    me = new sksi_conjunctive_removal_modules_expand();
    $sksi_crm_return_null_bindingsP$ = null;
    $list0 = ConsesLow.list( makeSymbol( "MT" ), makeSymbol( "ASENT" ) );
    $kw1$VARPRED = makeKeyword( "VARPRED" );
    $kw2$GENLPREDS = makeKeyword( "GENLPREDS" );
    $kw3$GENLINVERSE = makeKeyword( "GENLINVERSE" );
    $str4$__SKSI__A_ = makeString( "~&SKSI-~A " );
    $str5$Could_not_form_a_CSQL_query_with_ = makeString( "Could not form a CSQL query with:~%  Meaning sentence GAFs: ~a~%  Literals: ~a~% for the reason: ~a" );
    $const6$meaningSentencePredicateForSource = constant_handles.reader_make_constant_shell( makeString( "meaningSentencePredicateForSource" ) );
    $kw7$TRUE = makeKeyword( "TRUE" );
    $str8$Could_not_find_table_name_via___m = makeString( "Could not find table name via #$meaningSentencePredicateForSource for ~S of ~S" );
    $kw9$ROBUST = makeKeyword( "ROBUST" );
    $kw10$NORMAL = makeKeyword( "NORMAL" );
    $list11 = ConsesLow.list( T );
    $sym12$_EXIT = makeSymbol( "%EXIT" );
    $sym13$SKSI_CRM_RESULT_ITERATOR_NEXT = makeSymbol( "SKSI-CRM-RESULT-ITERATOR-NEXT" );
    $sym14$SKSI_CRM_RESULT_ITERATOR_DONE = makeSymbol( "SKSI-CRM-RESULT-ITERATOR-DONE" );
    $sym15$SKSI_CRM_RESULT_ITERATOR_FINALIZE = makeSymbol( "SKSI-CRM-RESULT-ITERATOR-FINALIZE" );
    $list16 = ConsesLow.list( makeSymbol( "ASENT-MT" ), makeSymbol( "ASENT-ASENT" ) );
    $list17 = ConsesLow.list( makeSymbol( "ORIGINAL-MT" ), makeSymbol( "ORIGINAL-ASENT" ) );
    $kw18$SKSI = makeKeyword( "SKSI" );
    $const19$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $const20$genlInverse = constant_handles.reader_make_constant_shell( makeString( "genlInverse" ) );
    $str21$Unknown_support_keyword__a_ = makeString( "Unknown support keyword ~a." );
    $list22 = ConsesLow.list( makeSymbol( "QUEUE" ), makeSymbol( "RS-ITERATOR" ), makeSymbol( "VAR-DECODING-MAP" ), makeSymbol( "SUPPORT-TEMPLATE" ), makeSymbol( "SKS" ), makeSymbol( "CONTENT-MT" ) );
    $sym23$SKSI_CRM_RESULT_ITERATOR_P = makeSymbol( "SKSI-CRM-RESULT-ITERATOR-P" );
    $kw24$RS_INDEX = makeKeyword( "RS-INDEX" );
    $kw25$DECODE = makeKeyword( "DECODE" );
    $sym26$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $sym27$FIRST = makeSymbol( "FIRST" );
    $sym28$ALPHA_OR_UNDERSCORE_P = makeSymbol( "ALPHA-OR-UNDERSCORE-P" );
    $sym29$SKSI_CSQL_ATOMS_EQUAL = makeSymbol( "SKSI-CSQL-ATOMS-EQUAL" );
    $sym30$TEST_SKSI_CONJUNCTIVE_QUERY_TO_CSQL = makeSymbol( "TEST-SKSI-CONJUNCTIVE-QUERY-TO-CSQL" );
    $kw31$TEST = makeKeyword( "TEST" );
    $sym32$SKSI_CSQL_EQUIVALENT = makeSymbol( "SKSI-CSQL-EQUIVALENT" );
    $kw33$OWNER = makeKeyword( "OWNER" );
    $kw34$CLASSES = makeKeyword( "CLASSES" );
    $kw35$KB = makeKeyword( "KB" );
    $kw36$FULL = makeKeyword( "FULL" );
    $kw37$WORKING_ = makeKeyword( "WORKING?" );
    $list38 = _constant_38_initializer();
  }

  public static final class $sksi_crm_result_iterator_done$UnaryFunction
      extends
        UnaryFunction
  {
    public $sksi_crm_result_iterator_done$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SKSI-CRM-RESULT-ITERATOR-DONE" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return sksi_crm_result_iterator_done( arg1 );
    }
  }
}
/*
 * 
 * Total time: 563 ms
 * 
 */