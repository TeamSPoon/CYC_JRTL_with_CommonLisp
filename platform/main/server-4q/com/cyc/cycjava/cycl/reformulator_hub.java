package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class reformulator_hub
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.reformulator_hub";
  public static final String myFingerPrint = "f9cd1a8c2151237e1ea914a391053434e6c82ff713050ffabcf3b3ae161c1bdd";
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 10814L)
  private static SubLSymbol $reformulator_timeout_time$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
  private static SubLSymbol $all_kb_modal_operators_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 21339L)
  private static SubLSymbol $rl_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 21388L)
  private static SubLSymbol $rl_old$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 21511L)
  private static SubLSymbol $rl_new$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 23854L)
  private static SubLSymbol $ref_trace_level$;
  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 29859L)
  private static SubLSymbol $ignore_modules_unless_focussed$;
  private static final SubLSymbol $sym0$VARIABLE_P;
  private static final SubLString $str1$The_expression__s_contains_an_HL_;
  private static final SubLString $str2$reformulate_cycl_cannot_be_called;
  private static final SubLSymbol $kw3$TRUE;
  private static final SubLSymbol $kw4$FALSE;
  private static final SubLSymbol $kw5$UNLESS_REWRITE_OF;
  private static final SubLSymbol $sym6$MEMOIZATION_STATE_P;
  private static final SubLSymbol $kw7$MAX_TIME;
  private static final SubLSymbol $kw8$ILL_FORMED;
  private static final SubLSymbol $sym9$ALL_KB_MODAL_OPERATORS;
  private static final SubLObject $const10$ModalOperator;
  private static final SubLObject $const11$UniversalVocabularyMt;
  private static final SubLSymbol $sym12$_ALL_KB_MODAL_OPERATORS_CACHING_STATE_;
  private static final SubLString $str13$The_reformulator_currently_cannot;
  private static final SubLSymbol $kw14$NONE;
  private static final SubLSymbol $sym15$CONTAINS_OLD_RL_;
  private static final SubLSymbol $sym16$SUBST_NEW_RL;
  private static final SubLSymbol $sym17$REFORMULATE_EXPRESSION;
  private static final SubLSymbol $kw18$APPLY_FIRST_RECURSIVELY;
  private static final SubLInteger $int19$64;
  private static final SubLSymbol $kw20$FOCUS;
  private static final SubLSymbol $kw21$IGNORE;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$_;
  private static final SubLSymbol $sym24$CDR;
  private static final SubLSymbol $sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED;
  private static final SubLSymbol $kw26$ALL;
  private static final SubLSymbol $kw27$ARITY;
  private static final SubLSymbol $kw28$KB;
  private static final SubLObject $const29$reformulatorEquals;
  private static final SubLObject $const30$reformulatorEquiv;
  private static final SubLSymbol $sym31$FIRST;
  private static final SubLSymbol $sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED;
  private static final SubLSymbol $sym33$RELEVANT_MT_IS_GENL_MT;
  private static final SubLSymbol $sym34$RL_EVALUATABLE_EXPRESSION_;
  private static final SubLSymbol $sym35$TRANSFORM_EVALUATION_EXPRESSION;
  private static final SubLObject $const36$evaluateAtEL;
  private static final SubLSymbol $sym37$RL_UNEVALUATABLE_EXPRESSION_;
  private static final SubLString $str38$All___s__Arity___s__KB___s__None_;
  private static final SubLString $str39$Average_number_of_FORTs_mentioned;
  private static final SubLString $str40$RL_EL_mismatch_substitution;
  private static final SubLString $str41$Restrict_reformulation_inside_mod;
  private static final SubLString $str42$Uniquify_variables;
  private static final SubLString $str43$reformulator_hub_test_suite;

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 8570L)
  public static SubLObject reformulate_cycl(final SubLObject expression, SubLObject mt, SubLObject settings)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( settings == UNPROVIDED )
    {
      settings = NIL;
    }
    if( NIL != cycl_utilities.expression_find_if( Symbols.symbol_function( $sym0$VARIABLE_P ), expression, NIL, UNPROVIDED ) )
    {
      ref_warn( ONE_INTEGER, $str1$The_expression__s_contains_an_HL_, expression, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      return NIL;
    }
    if( NIL == kb_control_vars.reformulator_kb_loaded_p() )
    {
      Errors.error( $str2$reformulate_cycl_cannot_be_called );
    }
    reformulator_datastructures.ensure_reformulator_initialized();
    final SubLObject fixed_settings = reformulator_datastructures.fix_invalid_settings( settings, mt );
    final SubLObject clear_cachesP = reformulator_datastructures.get_clear_reformulator_cachesP( fixed_settings );
    if( $kw3$TRUE == clear_cachesP )
    {
      reformulator_datastructures.clear_reformulator_caches();
    }
    return reformulate_cycl_int( expression, mt, fixed_settings );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 10463L)
  public static SubLObject reformulate_atoms_criterion_metP(final SubLObject expression, final SubLObject settings)
  {
    if( NIL == el_utilities.el_formula_p( expression ) )
    {
      final SubLObject pcase_var;
      final SubLObject reformulate_atomsP = pcase_var = reformulator_datastructures.get_reformulate_atomsP( settings );
      if( pcase_var.eql( $kw3$TRUE ) )
      {
        return T;
      }
      if( pcase_var.eql( $kw4$FALSE ) )
      {
        return NIL;
      }
      if( pcase_var.eql( $kw5$UNLESS_REWRITE_OF ) )
      {
        return equality_store.some_source_rewrite_of_assertions_somewhereP( expression );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 11039L)
  public static SubLObject reformulator_timeout_time(final SubLObject settings)
  {
    final SubLObject delay_in_seconds = reformulator_datastructures.get_max_time( settings );
    return ( NIL != delay_in_seconds ) ? Numbers.add( Time.get_internal_real_time(), Numbers.floor( Numbers.multiply( delay_in_seconds, time_high.$internal_time_units_per_second$.getGlobalValue() ), UNPROVIDED ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 11443L)
  public static SubLObject reformulate_cycl_int(final SubLObject expression, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject return_values = NIL;
    SubLObject number_of_reformulations = ZERO_INTEGER;
    SubLObject previous_rl_expr = NIL;
    SubLObject new_expression = NIL;
    SubLObject reformulation_history = NIL;
    SubLObject original_clause = NIL;
    final SubLObject _prev_bind_0 = $reformulator_timeout_time$.currentBinding( thread );
    try
    {
      $reformulator_timeout_time$.bind( reformulator_timeout_time( settings ), thread );
      if( NIL != reformulate_atoms_criterion_metP( expression, settings ) )
      {
        final SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
        assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
        final SubLObject _prev_bind_0_$1 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding( thread );
        try
        {
          reformulator_datastructures.$reformulator_memoization_state$.bind( v_memoization_state, thread );
          final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue( thread );
          final SubLObject _prev_bind_0_$2 = memoization_state.$memoization_state$.currentBinding( thread );
          try
          {
            memoization_state.$memoization_state$.bind( local_state, thread );
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
            try
            {
              final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt_relevance_macros.determine_inference_mt_relevance_el_spec( mt ) );
              final SubLObject _prev_bind_0_$3 = mt_relevance_macros.$mt$.currentBinding( thread );
              final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
              final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
              try
              {
                mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
                mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
                mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
                final SubLObject recursion_limit = reformulator_datastructures.get_recursion_limit( settings );
                final SubLObject reformulate_subformulasP = reformulator_datastructures.get_reformulate_subformulasP( settings );
                final SubLObject wff_degree = reformulator_datastructures.get_wff_enforcement( settings );
                SubLObject doneP = NIL;
                SubLObject stack = NIL;
                final SubLObject modal_operator_if_any = possible_modal( expression );
                if( NIL != modal_operator_if_any )
                {
                  final SubLObject non_modal_expression = cycl_utilities.formula_arg1( expression, UNPROVIDED );
                  previous_rl_expr = canonicalize_reformulator_expression_cached( non_modal_expression, mt, NIL, wff_degree );
                }
                else
                {
                  previous_rl_expr = canonicalize_reformulator_expression_cached( expression, mt, NIL, wff_degree );
                }
                original_clause = previous_rl_expr;
                if( NIL != previous_rl_expr )
                {
                  while ( NIL == doneP && number_of_reformulations.numLE( recursion_limit ))
                  {
                    thread.resetMultipleValues();
                    final SubLObject thrown_old_expr = reformulate_expression( previous_rl_expr, previous_rl_expr, original_clause, mt, settings, Equality.eql( $kw3$TRUE, reformulate_subformulasP ) );
                    final SubLObject thrown_new_expr = thread.secondMultipleValue();
                    final SubLObject thrown_justification = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if( NIL == thrown_justification )
                    {
                      doneP = T;
                    }
                    else
                    {
                      new_expression = reformulator_subst( thrown_new_expr, thrown_old_expr, previous_rl_expr, mt );
                      if( NIL != Sequences.find( new_expression, stack, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                      {
                        doneP = T;
                      }
                      else
                      {
                        stack = ConsesLow.cons( new_expression, stack );
                        reformulation_history = ConsesLow.cons( construct_reformulation_step( thrown_old_expr, thrown_new_expr, thrown_justification ), reformulation_history );
                        number_of_reformulations = Numbers.add( number_of_reformulations, ONE_INTEGER );
                        previous_rl_expr = ( original_clause = new_expression );
                        new_expression = NIL;
                      }
                    }
                    if( NIL != $reformulator_timeout_time$.getDynamicValue( thread ) && Time.get_internal_real_time().numG( $reformulator_timeout_time$.getDynamicValue( thread ) ) )
                    {
                      doneP = T;
                    }
                  }
                  previous_rl_expr = uncanonicalize_rl_expression_cached( previous_rl_expr, mt );
                  if( NIL != modal_operator_if_any )
                  {
                    previous_rl_expr = ConsesLow.list( modal_operator_if_any, previous_rl_expr );
                  }
                }
              }
              finally
              {
                mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
                mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
                mt_relevance_macros.$mt$.rebind( _prev_bind_0_$3, thread );
              }
              reformulation_history = Sequences.reverse( reformulation_history );
              if( $kw3$TRUE == reformulator_datastructures.get_eliminate_transitivity_in_reformulation_historyP( settings ) )
              {
                reformulation_history = eliminate_transitivity_in_reformulation_history( reformulation_history );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
              }
            }
          }
          finally
          {
            memoization_state.$memoization_state$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          reformulator_datastructures.$reformulator_memoization_state$.rebind( _prev_bind_0_$1, thread );
        }
      }
      final SubLObject timed_out_return_value = ( NIL != $reformulator_timeout_time$.getDynamicValue( thread ) && Time.get_internal_real_time().numG( $reformulator_timeout_time$.getDynamicValue( thread ) ) )
          ? $kw7$MAX_TIME
          : NIL;
      if( number_of_reformulations.isPositive() )
      {
        return_values = ConsesLow.list( previous_rl_expr, reformulation_history, timed_out_return_value );
      }
      else if( NIL == previous_rl_expr )
      {
        return_values = ConsesLow.list( expression, $kw8$ILL_FORMED, timed_out_return_value );
      }
      else
      {
        return_values = ConsesLow.list( previous_rl_expr, NIL, timed_out_return_value );
      }
    }
    finally
    {
      $reformulator_timeout_time$.rebind( _prev_bind_0, thread );
    }
    return subl_promotions.values_list( return_values );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 15220L)
  public static SubLObject eliminate_transitivity_in_reformulation_history(final SubLObject reformulation_history)
  {
    SubLObject result = NIL;
    SubLObject cdolist_list_var = reformulation_history;
    SubLObject reformulation_step = NIL;
    reformulation_step = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject original = reformulation_step_struct_expression( reformulation_step );
      final SubLObject reformulation = reformulation_step_struct_result( reformulation_step );
      final SubLObject justification = reformulation_step_struct_justification( reformulation_step );
      SubLObject result_changedP = NIL;
      SubLObject cdolist_list_var_$5 = result;
      SubLObject result_step = NIL;
      result_step = cdolist_list_var_$5.first();
      while ( NIL != cdolist_list_var_$5)
      {
        final SubLObject result_original = reformulation_step_struct_expression( result_step );
        final SubLObject result_reformulation = reformulation_step_struct_result( result_step );
        final SubLObject result_justification = reformulation_step_struct_justification( result_step );
        if( original.equalp( result_reformulation ) )
        {
          result_changedP = T;
          final SubLObject new_result_step = ConsesLow.list( result_original, reformulation, ConsesLow.append( result_justification, justification ) );
          result = conses_high.subst( new_result_step, result_step, result, EQUALP, UNPROVIDED );
        }
        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
        result_step = cdolist_list_var_$5.first();
      }
      if( NIL == result_changedP )
      {
        result = ConsesLow.cons( reformulation_step, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      reformulation_step = cdolist_list_var.first();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 16580L)
  public static SubLObject reformulator_subst(final SubLObject v_new, final SubLObject old, final SubLObject expression, final SubLObject mt)
  {
    if( old.equal( expression ) )
    {
      return recanonicalize_rl_expression( v_new, mt );
    }
    final SubLObject uncanon_new = ( NIL != clauses.clauses_p( v_new ) ) ? uncanonicalize_rl_expression_cached( v_new, mt ) : v_new;
    SubLObject new_expression = NIL;
    if( NIL != clauses.clauses_p( v_new ) && NIL != clauses.clauses_p( old ) && NIL != clauses.clauses_p( expression ) )
    {
      new_expression = rl_clauses_merge_subst( v_new, old, expression, mt );
    }
    else
    {
      new_expression = cycl_utilities.expression_subst( uncanon_new, old, expression, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    if( expression.equal( new_expression ) )
    {
      new_expression = nested_rl_expression_subst( uncanon_new, old, expression, mt );
    }
    return recanonicalize_rl_expression( new_expression, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
  public static SubLObject clear_all_kb_modal_operators()
  {
    final SubLObject cs = $all_kb_modal_operators_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
  public static SubLObject remove_all_kb_modal_operators()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $all_kb_modal_operators_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
  public static SubLObject all_kb_modal_operators_internal()
  {
    return isa.all_fort_instances( $const10$ModalOperator, $const11$UniversalVocabularyMt, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17307L)
  public static SubLObject all_kb_modal_operators()
  {
    SubLObject caching_state = $all_kb_modal_operators_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym9$ALL_KB_MODAL_OPERATORS, $sym12$_ALL_KB_MODAL_OPERATORS_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( all_kb_modal_operators_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17439L)
  public static SubLObject possible_modal(final SubLObject expression)
  {
    if( NIL != el_utilities.el_formula_p( expression ) )
    {
      final SubLObject operator = cycl_utilities.formula_operator( expression );
      if( NIL != subl_promotions.memberP( operator, all_kb_modal_operators(), UNPROVIDED, UNPROVIDED ) )
      {
        return operator;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 17906L)
  public static SubLObject rl_clauses_merge_subst(final SubLObject new_clauses, final SubLObject old_clauses, final SubLObject all_clauses, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( NIL == list_utilities.singletonP( old_clauses ) || NIL == clause_utilities.pos_atomic_cnf_p( old_clauses.first() ) ) )
    {
      Errors.error( $str13$The_reformulator_currently_cannot );
    }
    SubLObject result_clauses = NIL;
    final SubLObject old_lit = clause_utilities.gaf_cnf_literal( old_clauses.first() );
    if( NIL != list_utilities.singletonP( new_clauses ) )
    {
      final SubLObject new_pos_lits = clauses.pos_lits( new_clauses.first() );
      final SubLObject new_neg_lits = clauses.neg_lits( new_clauses.first() );
      SubLObject cdolist_list_var = all_clauses;
      SubLObject clause = NIL;
      clause = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject result_pos_lits = NIL;
        SubLObject result_neg_lits = NIL;
        SubLObject cdolist_list_var_$6 = clauses.pos_lits( clause );
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var_$6.first();
        while ( NIL != cdolist_list_var_$6)
        {
          if( pos_lit.equal( old_lit ) )
          {
            if( NIL != new_pos_lits )
            {
              result_pos_lits = ConsesLow.append( result_pos_lits, new_pos_lits );
            }
          }
          else
          {
            result_pos_lits = ConsesLow.cons( pos_lit, result_pos_lits );
          }
          cdolist_list_var_$6 = cdolist_list_var_$6.rest();
          pos_lit = cdolist_list_var_$6.first();
        }
        SubLObject cdolist_list_var_$7 = clauses.neg_lits( clause );
        SubLObject neg_lit = NIL;
        neg_lit = cdolist_list_var_$7.first();
        while ( NIL != cdolist_list_var_$7)
        {
          if( neg_lit.equal( old_lit ) )
          {
            if( NIL != list_utilities.sublisp_boolean( new_neg_lits ) )
            {
              result_neg_lits = ConsesLow.append( result_neg_lits, new_neg_lits );
            }
            else if( NIL != list_utilities.sublisp_boolean( new_pos_lits ) )
            {
              result_neg_lits = ConsesLow.append( result_neg_lits, new_pos_lits );
            }
          }
          else
          {
            result_neg_lits = ConsesLow.cons( neg_lit, result_neg_lits );
          }
          cdolist_list_var_$7 = cdolist_list_var_$7.rest();
          neg_lit = cdolist_list_var_$7.first();
        }
        if( NIL != result_pos_lits || NIL != result_neg_lits )
        {
          result_clauses = ConsesLow.cons( clauses.make_cnf( Sequences.reverse( result_neg_lits ), Sequences.reverse( result_pos_lits ) ), result_clauses );
        }
        cdolist_list_var = cdolist_list_var.rest();
        clause = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject old_lit_not_aloneP = NIL;
      if( NIL == old_lit_not_aloneP )
      {
        SubLObject csome_list_var = all_clauses;
        SubLObject clause2 = NIL;
        clause2 = csome_list_var.first();
        while ( NIL == old_lit_not_aloneP && NIL != csome_list_var)
        {
          SubLObject result_pos_lits2 = NIL;
          SubLObject result_neg_lits2 = NIL;
          SubLObject saw_old_lit_this_clauseP = NIL;
          SubLObject saw_non_old_lit_this_clauseP = NIL;
          SubLObject cdolist_list_var2 = clauses.pos_lits( clause2 );
          SubLObject pos_lit2 = NIL;
          pos_lit2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( pos_lit2.equal( old_lit ) )
            {
              saw_old_lit_this_clauseP = T;
            }
            else
            {
              saw_non_old_lit_this_clauseP = T;
              result_pos_lits2 = ConsesLow.cons( pos_lit2, result_pos_lits2 );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            pos_lit2 = cdolist_list_var2.first();
          }
          cdolist_list_var2 = clauses.neg_lits( clause2 );
          SubLObject neg_lit2 = NIL;
          neg_lit2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            if( neg_lit2.equal( old_lit ) )
            {
              saw_old_lit_this_clauseP = T;
            }
            else
            {
              saw_non_old_lit_this_clauseP = T;
              result_neg_lits2 = ConsesLow.cons( neg_lit2, result_neg_lits2 );
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            neg_lit2 = cdolist_list_var2.first();
          }
          if( NIL != saw_old_lit_this_clauseP && NIL != saw_non_old_lit_this_clauseP )
          {
            old_lit_not_aloneP = T;
          }
          if( NIL != result_pos_lits2 || NIL != result_neg_lits2 )
          {
            result_clauses = ConsesLow.cons( clauses.make_cnf( Sequences.reverse( result_neg_lits2 ), Sequences.reverse( result_pos_lits2 ) ), result_clauses );
          }
          csome_list_var = csome_list_var.rest();
          clause2 = csome_list_var.first();
        }
      }
      if( NIL == old_lit_not_aloneP )
      {
        result_clauses = ConsesLow.append( result_clauses, new_clauses );
      }
      else
      {
        result_clauses = NIL;
        final SubLObject el_all = uncanonicalize_rl_expression_cached( all_clauses, mt );
        final SubLObject el_new = uncanonicalize_rl_expression_cached( new_clauses, mt );
        final SubLObject el_result = cycl_utilities.expression_subst( el_new, old_lit, el_all, Symbols.symbol_function( EQUAL ), UNPROVIDED );
        result_clauses = canonicalize_reformulator_expression( el_result, mt, NIL, $kw14$NONE, UNPROVIDED );
      }
    }
    return Sequences.reverse( result_clauses );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 21547L)
  public static SubLObject nested_rl_expression_subst(final SubLObject uncanon_new, final SubLObject old, final SubLObject expression, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = $rl_mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $rl_old$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $rl_new$.currentBinding( thread );
    try
    {
      $rl_mt$.bind( mt, thread );
      $rl_old$.bind( ( NIL != clauses.clauses_p( old ) ) ? old : recanonicalize_rl_expression( old, $rl_mt$.getDynamicValue( thread ) ), thread );
      $rl_new$.bind( uncanon_new, thread );
      result = cycl_utilities.expression_transform( expression, $sym15$CONTAINS_OLD_RL_, $sym16$SUBST_NEW_RL, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      $rl_new$.rebind( _prev_bind_3, thread );
      $rl_old$.rebind( _prev_bind_2, thread );
      $rl_mt$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 22091L)
  public static SubLObject contains_old_rlP(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( expression.equal( $rl_new$.getDynamicValue( thread ) ) )
    {
      return NIL;
    }
    final SubLObject canon_expression = recanonicalize_rl_expression( expression, $rl_mt$.getDynamicValue( thread ) );
    if( NIL != clauses.clauses_p( canon_expression ) && NIL != clauses.clauses_p( $rl_old$.getDynamicValue( thread ) ) )
    {
      return conses_high.subsetp( $rl_old$.getDynamicValue( thread ), canon_expression, Symbols.symbol_function( EQUAL ), UNPROVIDED );
    }
    return list_utilities.sublisp_boolean( cycl_utilities.expression_find( $rl_old$.getDynamicValue( thread ), canon_expression, NIL, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 22464L)
  public static SubLObject subst_new_rl(final SubLObject expression)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject canon_expression = recanonicalize_rl_expression( expression, $rl_mt$.getDynamicValue( thread ) );
    final SubLObject canon_old = ( NIL != clauses.clauses_p( $rl_old$.getDynamicValue( thread ) ) ) ? $rl_old$.getDynamicValue( thread )
        : recanonicalize_rl_expression( $rl_old$.getDynamicValue( thread ), $rl_mt$.getDynamicValue( thread ) );
    final SubLObject canon_new = recanonicalize_rl_expression( $rl_new$.getDynamicValue( thread ), $rl_mt$.getDynamicValue( thread ) );
    if( NIL != clauses.clauses_p( canon_new ) && NIL != clauses.clauses_p( canon_old ) && NIL != clauses.clauses_p( canon_expression ) )
    {
      return uncanonicalize_rl_expression( rl_clauses_merge_subst( canon_new, canon_old, canon_expression, $rl_mt$.getDynamicValue( thread ) ), $rl_mt$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 22967L)
  public static SubLObject construct_reformulation_step(final SubLObject expression, final SubLObject result, final SubLObject justification)
  {
    return ConsesLow.list( expression, result, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 23335L)
  public static SubLObject reformulation_step_struct_expression(final SubLObject reformulation_step)
  {
    return reformulation_step.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 23509L)
  public static SubLObject reformulation_step_struct_result(final SubLObject reformulation_step)
  {
    return conses_high.second( reformulation_step );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 23680L)
  public static SubLObject reformulation_step_struct_justification(final SubLObject reformulation_step)
  {
    return conses_high.third( reformulation_step );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 24303L)
  public static SubLObject ref_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $ref_trace_level$.getDynamicValue( thread ).numGE( level ) )
    {
      Errors.warn( format_str, new SubLObject[] { arg1, arg2, arg3, arg4, arg5
      } );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 24486L)
  public static SubLObject reformulate_expression_internal(final SubLObject expression, SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, SubLObject settings,
      final SubLObject reformulate_subformulasP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject justification = NIL;
    final SubLObject apply_first = reformulator_datastructures.get_apply_first_recursively( settings );
    if( NIL != reformulate_atoms_criterion_metP( expression, settings ) )
    {
      if( NIL != apply_first && NIL != reformulate_subformulasP )
      {
        settings = conses_high.remf( conses_high.copy_list( settings ), $kw18$APPLY_FIRST_RECURSIVELY );
        thread.resetMultipleValues();
        final SubLObject old_expression_$8 = reformulate_cycl_apply_first_recursively( expression, old_expression, original_clause, mt, settings, apply_first );
        final SubLObject result_$9 = thread.secondMultipleValue();
        final SubLObject justification_$10 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        old_expression = old_expression_$8;
        result = result_$9;
        justification = justification_$10;
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject result_$10 = try_rl_modules_with_expression( expression, original_clause, mt, settings );
        final SubLObject justification_$11 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$10;
        justification = justification_$11;
      }
    }
    if( NIL != justification )
    {
      return Values.values( old_expression, result, justification );
    }
    if( NIL != el_utilities.el_formula_p( expression ) && NIL != reformulate_subformulasP )
    {
      return map_reformulate_cycl( expression, original_clause, mt, settings );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 24486L)
  public static SubLObject reformulate_expression(final SubLObject expression, final SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings,
      final SubLObject reformulate_subformulasP)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return reformulate_expression_internal( expression, old_expression, original_clause, mt, settings, reformulate_subformulasP );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym17$REFORMULATE_EXPRESSION, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym17$REFORMULATE_EXPRESSION, SIX_INTEGER, $int19$64, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym17$REFORMULATE_EXPRESSION, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( expression, old_expression, original_clause, mt, settings, reformulate_subformulasP );
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
        if( expression.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( old_expression.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( original_clause.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( mt.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( settings.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && reformulate_subformulasP.equal( cached_args.first() ) )
                  {
                    return memoization_state.caching_results( results2 );
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( reformulate_expression_internal( expression, old_expression, original_clause, mt, settings,
        reformulate_subformulasP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( expression, old_expression, original_clause, mt, settings, reformulate_subformulasP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 26329L)
  public static SubLObject reformulate_cycl_apply_first_recursively(final SubLObject expression, final SubLObject old_expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings,
      final SubLObject apply_first)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cdolist_list_var = ConsesLow.append( apply_first, ConsesLow.list( NIL ) );
    SubLObject rl_module_name = NIL;
    rl_module_name = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject focused_settings = conses_high.putf( conses_high.copy_list( settings ), $kw20$FOCUS, rl_module_name );
      thread.resetMultipleValues();
      final SubLObject new_old_expression = reformulate_expression( expression, old_expression, original_clause, mt, focused_settings, T );
      final SubLObject new_expression = thread.secondMultipleValue();
      final SubLObject justification = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != justification )
      {
        return Values.values( new_old_expression, new_expression, justification );
      }
      cdolist_list_var = cdolist_list_var.rest();
      rl_module_name = cdolist_list_var.first();
    }
    return Values.values( old_expression, expression, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 27092L)
  public static SubLObject map_reformulate_cycl(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != clauses.clauses_p( expression ) )
    {
      if( NIL != list_utilities.singletonP( expression ) && NIL != clauses.atomic_clause_p( expression.first() ) )
      {
        final SubLObject clause = expression.first();
        if( NIL != clause_utilities.neg_atomic_cnf_p( clause ) )
        {
          final SubLObject inverted_neg_pos_atomic_clause = clause_utilities.make_gaf_cnf( clause_utilities.atomic_cnf_asent( clause ) );
          thread.resetMultipleValues();
          final SubLObject sub_expression = reformulate_expression( inverted_neg_pos_atomic_clause, expression, original_clause, mt, settings, T );
          final SubLObject sub_result = thread.secondMultipleValue();
          final SubLObject justification = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != justification )
          {
            return Values.values( sub_expression, sub_result, justification );
          }
        }
        final SubLObject pos_lit = clauses.pos_lits( clause ).first();
        final SubLObject neg_lit = clauses.neg_lits( clause ).first();
        return map_reformulate_cycl( ( NIL != pos_lit ) ? pos_lit : neg_lit, original_clause, mt, settings );
      }
      SubLObject cdolist_list_var = expression;
      SubLObject clause2 = NIL;
      clause2 = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$13 = clauses.pos_lits( clause2 );
        SubLObject pos_lit2 = NIL;
        pos_lit2 = cdolist_list_var_$13.first();
        while ( NIL != cdolist_list_var_$13)
        {
          final SubLObject v_clauses = ConsesLow.list( clause_utilities.make_gaf_cnf( pos_lit2 ) );
          thread.resetMultipleValues();
          final SubLObject sub_expression2 = reformulate_expression( v_clauses, v_clauses, original_clause, mt, settings, T );
          final SubLObject sub_result2 = thread.secondMultipleValue();
          final SubLObject justification2 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != justification2 )
          {
            return Values.values( sub_expression2, sub_result2, justification2 );
          }
          cdolist_list_var_$13 = cdolist_list_var_$13.rest();
          pos_lit2 = cdolist_list_var_$13.first();
        }
        SubLObject cdolist_list_var_$14 = clauses.neg_lits( clause2 );
        SubLObject neg_lit2 = NIL;
        neg_lit2 = cdolist_list_var_$14.first();
        while ( NIL != cdolist_list_var_$14)
        {
          final SubLObject v_clauses = ConsesLow.list( clause_utilities.make_gaf_cnf( neg_lit2 ) );
          thread.resetMultipleValues();
          final SubLObject sub_expression2 = reformulate_expression( v_clauses, v_clauses, original_clause, mt, settings, T );
          final SubLObject sub_result2 = thread.secondMultipleValue();
          final SubLObject justification2 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if( NIL != justification2 )
          {
            return Values.values( sub_expression2, sub_result2, justification2 );
          }
          cdolist_list_var_$14 = cdolist_list_var_$14.rest();
          neg_lit2 = cdolist_list_var_$14.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        clause2 = cdolist_list_var.first();
      }
    }
    else
    {
      SubLObject cdolist_list_var2;
      final SubLObject terms = cdolist_list_var2 = cycl_utilities.formula_terms( expression, $kw21$IGNORE );
      SubLObject sub_term = NIL;
      sub_term = cdolist_list_var2.first();
      while ( NIL != cdolist_list_var2)
      {
        thread.resetMultipleValues();
        final SubLObject sub_expression3 = map_reformulate_expression( sub_term, original_clause, mt, settings );
        final SubLObject sub_result3 = thread.secondMultipleValue();
        final SubLObject justification3 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if( NIL != justification3 )
        {
          return Values.values( sub_expression3, sub_result3, justification3 );
        }
        cdolist_list_var2 = cdolist_list_var2.rest();
        sub_term = cdolist_list_var2.first();
      }
    }
    return Values.values( expression, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 29514L)
  public static SubLObject map_reformulate_expression(final SubLObject sub_term, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    SubLObject canon_subterm = sub_term;
    if( NIL != cycl_grammar.cycl_sentence_p( sub_term ) )
    {
      canon_subterm = canonicalize_reformulator_expression_cached( sub_term, mt, NIL, $kw14$NONE );
    }
    return reformulate_expression( canon_subterm, sub_term, original_clause, mt, settings, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 30150L)
  public static SubLObject try_rl_modules_with_expression(final SubLObject expression, final SubLObject original_clause, final SubLObject mt, final SubLObject settings)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = expression;
    SubLObject justification = NIL;
    final SubLObject focus = reformulator_datastructures.get_reformulation_focus( settings );
    final SubLObject ignore_list = reformulator_datastructures.get_ignore_rl_modules( settings );
    SubLObject rl_module_cost_pairs = NIL;
    if( NIL != focus )
    {
      final SubLObject rl_module = reformulator_module_harness.get_rl_module_from_store( focus );
      if( NIL != reformulator_module_harness.rl_module_applicableP( rl_module, expression, mt, settings ) )
      {
        rl_module_cost_pairs = ConsesLow.list( reader.bq_cons( rl_module, ZERO_INTEGER ) );
      }
      else
      {
        rl_module_cost_pairs = NIL;
      }
    }
    else
    {
      SubLObject cdolist_list_var = reformulator_module_harness.rl_module_store();
      SubLObject mod = NIL;
      mod = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject rl_module2 = mod;
        final SubLObject module_name = reformulator_module_harness.rl_module_name( rl_module2 );
        if( NIL == subl_promotions.memberP( module_name, ignore_list, UNPROVIDED, UNPROVIDED ) && NIL == conses_high.member( module_name, $ignore_modules_unless_focussed$.getGlobalValue(), UNPROVIDED, UNPROVIDED ) )
        {
          final SubLObject requiredP = reformulator_module_harness.rl_module_applicableP( rl_module2, expression, mt, settings );
          if( NIL != requiredP )
          {
            final SubLObject cost = reformulator_module_harness.rl_module_cost( rl_module2, expression, mt, settings );
            rl_module_cost_pairs = ConsesLow.cons( ConsesLow.cons( rl_module2, cost ), rl_module_cost_pairs );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        mod = cdolist_list_var.first();
      }
    }
    rl_module_cost_pairs = Sort.sort( rl_module_cost_pairs, Symbols.symbol_function( $sym23$_ ), Symbols.symbol_function( $sym24$CDR ) );
    if( NIL == justification )
    {
      SubLObject csome_list_var = rl_module_cost_pairs;
      SubLObject rl_moduleXcost = NIL;
      rl_moduleXcost = csome_list_var.first();
      while ( NIL == justification && NIL != csome_list_var)
      {
        final SubLObject rl_module2 = rl_moduleXcost.first();
        thread.resetMultipleValues();
        final SubLObject result_$15 = reformulator_module_harness.rl_module_reformulate( rl_module2, expression, original_clause, mt, settings );
        final SubLObject justification_$16 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        result = result_$15;
        justification = justification_$16;
        if( NIL != justification )
        {
          if( T.eql( justification ) )
          {
            justification = ConsesLow.list( reformulator_module_harness.rl_module_name( rl_module2 ) );
          }
          else if( justification.isCons() )
          {
            justification = ConsesLow.cons( reformulator_module_harness.rl_module_name( rl_module2 ), justification );
          }
          else
          {
            justification = ConsesLow.cons( reformulator_module_harness.rl_module_name( rl_module2 ), ConsesLow.list( justification ) );
          }
        }
        if( NIL != $reformulator_timeout_time$.getDynamicValue( thread ) && Time.get_internal_real_time().numG( $reformulator_timeout_time$.getDynamicValue( thread ) ) )
        {
          justification = NIL;
        }
        csome_list_var = csome_list_var.rest();
        rl_moduleXcost = csome_list_var.first();
      }
    }
    return Values.values( result, justification );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 32511L)
  public static SubLObject canonicalize_reformulator_expression_cached_internal(final SubLObject expression, final SubLObject mt, final SubLObject templateP, final SubLObject wff_degree)
  {
    return canonicalize_reformulator_expression( expression, mt, templateP, wff_degree, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 32511L)
  public static SubLObject canonicalize_reformulator_expression_cached(final SubLObject expression, final SubLObject mt, final SubLObject templateP, final SubLObject wff_degree)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return canonicalize_reformulator_expression_cached_internal( expression, mt, templateP, wff_degree );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( expression, mt, templateP, wff_degree );
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
        if( expression.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( templateP.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && wff_degree.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( canonicalize_reformulator_expression_cached_internal( expression, mt, templateP, wff_degree ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( expression, mt, templateP, wff_degree ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 33103L)
  public static SubLObject canonicalize_reformulator_expression(final SubLObject expression, final SubLObject mt, final SubLObject templateP, SubLObject wff_degree, SubLObject rule_pred)
  {
    if( wff_degree == UNPROVIDED )
    {
      wff_degree = NIL;
    }
    if( rule_pred == UNPROVIDED )
    {
      rule_pred = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject canon_expression = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$add_term_of_unit_litsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = czer_vars.$reify_skolemsP$.currentBinding( thread );
    final SubLObject _prev_bind_4 = czer_vars.$express_as_rule_macroP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = czer_vars.$canonicalize_variablesP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = czer_vars.$simplify_non_wff_literalP$.currentBinding( thread );
    final SubLObject _prev_bind_7 = czer_vars.$robust_assertion_lookup$.currentBinding( thread );
    final SubLObject _prev_bind_8 = czer_vars.$robust_nart_lookup$.currentBinding( thread );
    final SubLObject _prev_bind_9 = czer_vars.$implicitify_universalsP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = wff_vars.$reject_sbhl_conflictsP$.currentBinding( thread );
    try
    {
      czer_vars.$expand_el_relationsP$.bind( NIL, thread );
      czer_vars.$add_term_of_unit_litsP$.bind( NIL, thread );
      czer_vars.$reify_skolemsP$.bind( NIL, thread );
      czer_vars.$express_as_rule_macroP$.bind( NIL, thread );
      czer_vars.$canonicalize_variablesP$.bind( NIL, thread );
      czer_vars.$simplify_non_wff_literalP$.bind( NIL, thread );
      czer_vars.$robust_assertion_lookup$.bind( NIL, thread );
      czer_vars.$robust_nart_lookup$.bind( NIL, thread );
      czer_vars.$implicitify_universalsP$.bind( makeBoolean( NIL == templateP ), thread );
      wff_vars.$reject_sbhl_conflictsP$.bind( NIL, thread );
      if( NIL != wff_degree )
      {
        canon_expression = canonicalize_reformulator_expression_with_wff_degree( expression, mt, wff_degree, rule_pred );
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject canon_expression_$17 = canonicalize_reformulator_expression_wXo_wff_degree( expression, mt, rule_pred );
        final SubLObject wff_degree_$18 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_expression = canon_expression_$17;
        wff_degree = wff_degree_$18;
      }
    }
    finally
    {
      wff_vars.$reject_sbhl_conflictsP$.rebind( _prev_bind_10, thread );
      czer_vars.$implicitify_universalsP$.rebind( _prev_bind_9, thread );
      czer_vars.$robust_nart_lookup$.rebind( _prev_bind_8, thread );
      czer_vars.$robust_assertion_lookup$.rebind( _prev_bind_7, thread );
      czer_vars.$simplify_non_wff_literalP$.rebind( _prev_bind_6, thread );
      czer_vars.$canonicalize_variablesP$.rebind( _prev_bind_5, thread );
      czer_vars.$express_as_rule_macroP$.rebind( _prev_bind_4, thread );
      czer_vars.$reify_skolemsP$.rebind( _prev_bind_3, thread );
      czer_vars.$add_term_of_unit_litsP$.rebind( _prev_bind_2, thread );
      czer_vars.$expand_el_relationsP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( canon_expression, wff_degree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 34268L)
  public static SubLObject canonicalize_reformulator_expression_wXo_wff_degree(final SubLObject expression, final SubLObject mt, SubLObject rule_pred)
  {
    if( rule_pred == UNPROVIDED )
    {
      rule_pred = NIL;
    }
    final SubLObject wff_degree_order = ConsesLow.list( $kw26$ALL, $kw27$ARITY, $kw28$KB, $kw14$NONE );
    SubLObject wff_degree = NIL;
    SubLObject canon_expression = NIL;
    if( NIL == wff_degree )
    {
      SubLObject csome_list_var = wff_degree_order;
      SubLObject each_wff_degree = NIL;
      each_wff_degree = csome_list_var.first();
      while ( NIL == wff_degree && NIL != csome_list_var)
      {
        canon_expression = canonicalize_reformulator_expression_with_wff_degree( expression, mt, each_wff_degree, rule_pred );
        if( NIL != canon_expression )
        {
          wff_degree = each_wff_degree;
        }
        csome_list_var = csome_list_var.rest();
        each_wff_degree = csome_list_var.first();
      }
    }
    return Values.values( canon_expression, wff_degree );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 34996L)
  public static SubLObject canonicalize_reformulator_expression_with_wff_degree(final SubLObject expression, final SubLObject mt, final SubLObject wff_degree, SubLObject rule_pred)
  {
    if( rule_pred == UNPROVIDED )
    {
      rule_pred = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject canon_expression = NIL;
    if( wff_degree.eql( $kw14$NONE ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
      final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
      final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
      final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
      final SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding( thread );
      final SubLObject _prev_bind_13 = cycl_grammar.$grammar_uses_kbP$.currentBinding( thread );
      try
      {
        control_vars.$within_assert$.bind( NIL, thread );
        wff_utilities.$check_arg_typesP$.bind( NIL, thread );
        at_vars.$at_check_arg_typesP$.bind( NIL, thread );
        wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
        wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
        wff_utilities.$check_var_typesP$.bind( NIL, thread );
        czer_vars.$simplify_literalP$.bind( NIL, thread );
        at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
        at_vars.$at_check_arg_formatP$.bind( NIL, thread );
        wff_vars.$validate_constantsP$.bind( NIL, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
        wff_utilities.$check_arityP$.bind( NIL, thread );
        cycl_grammar.$grammar_uses_kbP$.bind( NIL, thread );
        canon_expression = canonicalize_reformulator_expression_int( expression, mt, rule_pred );
      }
      finally
      {
        cycl_grammar.$grammar_uses_kbP$.rebind( _prev_bind_13, thread );
        wff_utilities.$check_arityP$.rebind( _prev_bind_12, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
        wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
        at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
        at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
        czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
        wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
        wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
        wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
        at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
        wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
        control_vars.$within_assert$.rebind( _prev_bind_0, thread );
      }
    }
    else if( wff_degree.eql( $kw28$KB ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
      final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
      final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
      final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
      final SubLObject _prev_bind_12 = wff_utilities.$check_arityP$.currentBinding( thread );
      try
      {
        control_vars.$within_assert$.bind( NIL, thread );
        wff_utilities.$check_arg_typesP$.bind( NIL, thread );
        at_vars.$at_check_arg_typesP$.bind( NIL, thread );
        wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
        wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
        wff_utilities.$check_var_typesP$.bind( NIL, thread );
        czer_vars.$simplify_literalP$.bind( NIL, thread );
        at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
        at_vars.$at_check_arg_formatP$.bind( NIL, thread );
        wff_vars.$validate_constantsP$.bind( NIL, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
        wff_utilities.$check_arityP$.bind( NIL, thread );
        canon_expression = canonicalize_reformulator_expression_int( expression, mt, rule_pred );
      }
      finally
      {
        wff_utilities.$check_arityP$.rebind( _prev_bind_12, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
        wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
        at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
        at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
        czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
        wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
        wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
        wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
        at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
        wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
        control_vars.$within_assert$.rebind( _prev_bind_0, thread );
      }
    }
    else if( wff_degree.eql( $kw27$ARITY ) )
    {
      final SubLObject _prev_bind_0 = control_vars.$within_assert$.currentBinding( thread );
      final SubLObject _prev_bind_2 = wff_utilities.$check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding( thread );
      final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding( thread );
      final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding( thread );
      final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding( thread );
      final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding( thread );
      final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding( thread );
      final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding( thread );
      final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding( thread );
      try
      {
        control_vars.$within_assert$.bind( NIL, thread );
        wff_utilities.$check_arg_typesP$.bind( NIL, thread );
        at_vars.$at_check_arg_typesP$.bind( NIL, thread );
        wff_utilities.$check_wff_semanticsP$.bind( NIL, thread );
        wff_utilities.$check_wff_coherenceP$.bind( NIL, thread );
        wff_utilities.$check_var_typesP$.bind( NIL, thread );
        czer_vars.$simplify_literalP$.bind( NIL, thread );
        at_vars.$at_check_relator_constraintsP$.bind( NIL, thread );
        at_vars.$at_check_arg_formatP$.bind( NIL, thread );
        wff_vars.$validate_constantsP$.bind( NIL, thread );
        system_parameters.$suspend_sbhl_type_checkingP$.bind( T, thread );
        canon_expression = canonicalize_reformulator_expression_int( expression, mt, rule_pred );
      }
      finally
      {
        system_parameters.$suspend_sbhl_type_checkingP$.rebind( _prev_bind_11, thread );
        wff_vars.$validate_constantsP$.rebind( _prev_bind_10, thread );
        at_vars.$at_check_arg_formatP$.rebind( _prev_bind_9, thread );
        at_vars.$at_check_relator_constraintsP$.rebind( _prev_bind_8, thread );
        czer_vars.$simplify_literalP$.rebind( _prev_bind_7, thread );
        wff_utilities.$check_var_typesP$.rebind( _prev_bind_6, thread );
        wff_utilities.$check_wff_coherenceP$.rebind( _prev_bind_5, thread );
        wff_utilities.$check_wff_semanticsP$.rebind( _prev_bind_4, thread );
        at_vars.$at_check_arg_typesP$.rebind( _prev_bind_3, thread );
        wff_utilities.$check_arg_typesP$.rebind( _prev_bind_2, thread );
        control_vars.$within_assert$.rebind( _prev_bind_0, thread );
      }
    }
    else if( wff_degree.eql( $kw26$ALL ) )
    {
      final SubLObject _prev_bind_0 = czer_vars.$must_enforce_semanticsP$.currentBinding( thread );
      try
      {
        czer_vars.$must_enforce_semanticsP$.bind( T, thread );
        canon_expression = canonicalize_reformulator_expression_int( expression, mt, rule_pred );
      }
      finally
      {
        czer_vars.$must_enforce_semanticsP$.rebind( _prev_bind_0, thread );
      }
    }
    return canon_expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 35888L)
  public static SubLObject canonicalize_reformulator_expression_int(final SubLObject expression, final SubLObject mt, SubLObject rule_pred)
  {
    if( rule_pred == UNPROVIDED )
    {
      rule_pred = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject canon_expression = NIL;
    SubLObject canon_expression_and_stuff = NIL;
    SubLObject clauses_and_stuffP = NIL;
    if( NIL != rule_pred )
    {
      if( NIL != genl_predicates.genl_predP( rule_pred, $const29$reformulatorEquals, UNPROVIDED, UNPROVIDED ) )
      {
        canon_expression_and_stuff = czer_main.canonicalize_term( expression, mt );
        clauses_and_stuffP = NIL;
      }
      else if( NIL != genl_predicates.genl_predP( rule_pred, $const30$reformulatorEquiv, UNPROVIDED, UNPROVIDED ) )
      {
        canon_expression_and_stuff = czer_main.canonicalize_cycl( expression, mt );
        clauses_and_stuffP = czer_utilities.list_of_clause_binding_list_pairs_p( canon_expression_and_stuff );
      }
      else
      {
        thread.resetMultipleValues();
        final SubLObject canon_expression_and_stuff_$19 = czer_main.canonicalize_expression( expression, mt, UNPROVIDED );
        final SubLObject clauses_and_stuffP_$20 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        canon_expression_and_stuff = canon_expression_and_stuff_$19;
        clauses_and_stuffP = clauses_and_stuffP_$20;
      }
    }
    else
    {
      thread.resetMultipleValues();
      final SubLObject canon_expression_and_stuff_$20 = czer_main.canonicalize_expression( expression, mt, UNPROVIDED );
      final SubLObject clauses_and_stuffP_$21 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      canon_expression_and_stuff = canon_expression_and_stuff_$20;
      clauses_and_stuffP = clauses_and_stuffP_$21;
    }
    if( NIL != clauses_and_stuffP )
    {
      canon_expression = czer_main.sort_clauses( Mapping.mapcar( Symbols.symbol_function( $sym31$FIRST ), canon_expression_and_stuff ) );
    }
    else
    {
      canon_expression = canon_expression_and_stuff;
    }
    return canon_expression;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 36904L)
  public static SubLObject recanonicalize_rl_expression(final SubLObject expression, final SubLObject mt)
  {
    return canonicalize_reformulator_expression_cached( uncanonicalize_rl_expression_cached( expression, mt ), mt, NIL, $kw14$NONE );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 37086L)
  public static SubLObject uncanonicalize_rl_expression_cached_internal(final SubLObject expression, final SubLObject mt)
  {
    return uncanonicalize_rl_expression( expression, mt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 37086L)
  public static SubLObject uncanonicalize_rl_expression_cached(final SubLObject expression, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return uncanonicalize_rl_expression_cached_internal( expression, mt );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED, TWO_INTEGER, $int19$64, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( expression, mt );
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
        if( expression.equal( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( uncanonicalize_rl_expression_cached_internal( expression, mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( expression, mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 37260L)
  public static SubLObject uncanonicalize_rl_expression(final SubLObject expression, final SubLObject mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = czer_vars.$expand_el_relationsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = czer_vars.$unremove_universalsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      czer_vars.$expand_el_relationsP$.bind( NIL, thread );
      czer_vars.$unremove_universalsP$.bind( NIL, thread );
      mt_relevance_macros.$relevant_mt_function$.bind( $sym33$RELEVANT_MT_IS_GENL_MT, thread );
      mt_relevance_macros.$mt$.bind( mt, thread );
      if( NIL != clauses.clauses_p( expression ) )
      {
        result = uncanonicalizer.cnfs_el_formula( expression, mt, UNPROVIDED );
      }
      else
      {
        result = expression;
      }
      result = rl_evaluatable_expressions_out( result );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_3, thread );
      czer_vars.$unremove_universalsP$.rebind( _prev_bind_2, thread );
      czer_vars.$expand_el_relationsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 37935L)
  public static SubLObject rl_evaluatable_expressions_out(final SubLObject formula)
  {
    if( NIL != cycl_utilities.expression_find_if( $sym34$RL_EVALUATABLE_EXPRESSION_, formula, NIL, UNPROVIDED ) )
    {
      return transform_list_utilities.quiescent_transform( formula, $sym34$RL_EVALUATABLE_EXPRESSION_, $sym35$TRANSFORM_EVALUATION_EXPRESSION, UNPROVIDED, UNPROVIDED );
    }
    return formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 38373L)
  public static SubLObject rl_evaluatable_expressionP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      result = makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != rl_evaluatable_functorP( cycl_utilities.formula_arg0( v_object ), mt ) && NIL != el_utilities.evaluatable_el_expressionP( v_object )
          && NIL != rl_evaluatable_subexpressionsP( v_object, mt ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 38759L)
  public static SubLObject rl_evaluatable_functorP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( NIL != forts.fort_p( v_object ) )
    {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts( v_object, $const36$evaluateAtEL, mt, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 38954L)
  public static SubLObject rl_evaluatable_subexpressionsP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject rl_evaluatableP = NIL;
    final SubLObject mt_var = mt;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.possibly_in_mt_determine_function( mt_var ), thread );
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.possibly_in_mt_determine_mt( mt_var ), thread );
      rl_evaluatableP = makeBoolean( NIL == cycl_utilities.expression_find_if( $sym37$RL_UNEVALUATABLE_EXPRESSION_, v_object, UNPROVIDED, UNPROVIDED ) );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return rl_evaluatableP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 39198L)
  public static SubLObject rl_unevaluatable_expressionP(final SubLObject v_object, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    return makeBoolean( NIL != el_utilities.el_formula_p( v_object ) && NIL != relation_evaluation.evaluatable_expressionP( v_object ) && NIL == rl_evaluatable_functorP( cycl_utilities.formula_arg0( v_object ), mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 39407L)
  public static SubLObject hl_formula_for_reformulator_rule(final SubLObject rr)
  {
    final SubLObject assertion_for_rule = reformulator_rule_unifier_datastructures.reformulator_rule_assertion( rr );
    SubLObject hl_formula = NIL;
    if( NIL != assertion_for_rule )
    {
      hl_formula = fi.assertion_hl_formula( assertion_for_rule, UNPROVIDED );
    }
    return hl_formula;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 39889L)
  public static SubLObject reformulator_template_mentions_fortP(final SubLObject rt, final SubLObject fort)
  {
    return list_utilities.sublisp_boolean( Sequences.find( fort, reformulator_rule_unifier_datastructures.reformulator_template_forts( rt ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 40018L)
  public static SubLObject reformulator_rule_mentions_fortP(final SubLObject rr, final SubLObject fort)
  {
    return makeBoolean( NIL != reformulator_template_mentions_fortP( reformulator_rule_unifier_datastructures.reformulator_rule_first_rt( rr ), fort ) || NIL != reformulator_template_mentions_fortP(
        reformulator_rule_unifier_datastructures.reformulator_rule_second_rt( rr ), fort ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 40254L)
  public static SubLObject reformulator_rules_mentioning_fort(final SubLObject fort)
  {
    if( NIL == reformulator_datastructures.reformulator_initializedP() )
    {
      return NIL;
    }
    return ConsesLow.append( Hashtables.gethash( fort, reformulator_rule_unifier_datastructures.constant_reformulator_rule_table(), UNPROVIDED ), Hashtables.gethash( fort, reformulator_rule_unifier_datastructures
        .nart_reformulator_rule_table(), UNPROVIDED ), Hashtables.gethash( fort, reformulator_rule_unifier_datastructures.fort_reformulator_rule_table(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 40546L)
  public static SubLObject print_wff_reformulator_rules()
  {
    if( NIL == reformulator_datastructures.reformulator_initializedP() )
    {
      return NIL;
    }
    SubLObject no_all = ZERO_INTEGER;
    SubLObject no_arity = ZERO_INTEGER;
    SubLObject no_kb = ZERO_INTEGER;
    SubLObject no_none = ZERO_INTEGER;
    final SubLObject cdohash_table = reformulator_rule_unifier_datastructures.reformulator_rules();
    SubLObject key = NIL;
    SubLObject rr = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        rr = Hashtables.getEntryValue( cdohash_entry );
        final SubLObject pcase_var;
        final SubLObject rule_wff = pcase_var = reformulator_rule_unifier_datastructures.reformulator_rule_wff_degree( rr );
        if( pcase_var.eql( $kw26$ALL ) )
        {
          no_all = Numbers.add( no_all, ONE_INTEGER );
        }
        else if( pcase_var.eql( $kw27$ARITY ) )
        {
          no_arity = Numbers.add( no_arity, ONE_INTEGER );
        }
        else if( pcase_var.eql( $kw28$KB ) )
        {
          no_kb = Numbers.add( no_kb, ONE_INTEGER );
        }
        else
        {
          if( !pcase_var.eql( $kw14$NONE ) )
          {
            continue;
          }
          no_none = Numbers.add( no_none, ONE_INTEGER );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    PrintLow.format( T, $str38$All___s__Arity___s__KB___s__None_, new SubLObject[] { no_all, no_arity, no_kb, no_none
    } );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/reformulator-hub.lisp", position = 41202L)
  public static SubLObject compute_average_number_of_forts_mentioned_in_reformulator_rules()
  {
    if( NIL == reformulator_datastructures.reformulator_initializedP() )
    {
      return NIL;
    }
    SubLObject num_rules = ZERO_INTEGER;
    SubLObject num_forts = ZERO_INTEGER;
    final SubLObject cdohash_table = reformulator_rule_unifier_datastructures.reformulator_rules();
    SubLObject key = NIL;
    SubLObject rr = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        key = Hashtables.getEntryKey( cdohash_entry );
        rr = Hashtables.getEntryValue( cdohash_entry );
        num_rules = Numbers.add( num_rules, ONE_INTEGER );
        num_forts = Numbers.add( num_forts, Sequences.length( reformulator_rule_unifier_datastructures.reformulator_rule_forts( rr ) ) );
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    PrintLow.format( T, $str39$Average_number_of_FORTs_mentioned, Numbers.divide( num_forts, num_rules ) );
    return NIL;
  }

  public static SubLObject declare_reformulator_hub_file()
  {
    SubLFiles.declareFunction( me, "reformulate_cycl", "REFORMULATE-CYCL", 1, 2, false );
    SubLFiles.declareFunction( me, "reformulate_atoms_criterion_metP", "REFORMULATE-ATOMS-CRITERION-MET?", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_timeout_time", "REFORMULATOR-TIMEOUT-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulate_cycl_int", "REFORMULATE-CYCL-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "eliminate_transitivity_in_reformulation_history", "ELIMINATE-TRANSITIVITY-IN-REFORMULATION-HISTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_subst", "REFORMULATOR-SUBST", 4, 0, false );
    SubLFiles.declareFunction( me, "clear_all_kb_modal_operators", "CLEAR-ALL-KB-MODAL-OPERATORS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_all_kb_modal_operators", "REMOVE-ALL-KB-MODAL-OPERATORS", 0, 0, false );
    SubLFiles.declareFunction( me, "all_kb_modal_operators_internal", "ALL-KB-MODAL-OPERATORS-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "all_kb_modal_operators", "ALL-KB-MODAL-OPERATORS", 0, 0, false );
    SubLFiles.declareFunction( me, "possible_modal", "POSSIBLE-MODAL", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_clauses_merge_subst", "RL-CLAUSES-MERGE-SUBST", 4, 0, false );
    SubLFiles.declareFunction( me, "nested_rl_expression_subst", "NESTED-RL-EXPRESSION-SUBST", 4, 0, false );
    SubLFiles.declareFunction( me, "contains_old_rlP", "CONTAINS-OLD-RL?", 1, 0, false );
    SubLFiles.declareFunction( me, "subst_new_rl", "SUBST-NEW-RL", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_reformulation_step", "CONSTRUCT-REFORMULATION-STEP", 3, 0, false );
    SubLFiles.declareFunction( me, "reformulation_step_struct_expression", "REFORMULATION-STEP-STRUCT-EXPRESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulation_step_struct_result", "REFORMULATION-STEP-STRUCT-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulation_step_struct_justification", "REFORMULATION-STEP-STRUCT-JUSTIFICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "ref_warn", "REF-WARN", 2, 5, false );
    SubLFiles.declareFunction( me, "reformulate_expression_internal", "REFORMULATE-EXPRESSION-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "reformulate_expression", "REFORMULATE-EXPRESSION", 6, 0, false );
    SubLFiles.declareFunction( me, "reformulate_cycl_apply_first_recursively", "REFORMULATE-CYCL-APPLY-FIRST-RECURSIVELY", 6, 0, false );
    SubLFiles.declareFunction( me, "map_reformulate_cycl", "MAP-REFORMULATE-CYCL", 4, 0, false );
    SubLFiles.declareFunction( me, "map_reformulate_expression", "MAP-REFORMULATE-EXPRESSION", 4, 0, false );
    SubLFiles.declareFunction( me, "try_rl_modules_with_expression", "TRY-RL-MODULES-WITH-EXPRESSION", 4, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_reformulator_expression_cached_internal", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_reformulator_expression_cached", "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED", 4, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_reformulator_expression", "CANONICALIZE-REFORMULATOR-EXPRESSION", 3, 2, false );
    SubLFiles.declareFunction( me, "canonicalize_reformulator_expression_wXo_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-W/O-WFF-DEGREE", 2, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_reformulator_expression_with_wff_degree", "CANONICALIZE-REFORMULATOR-EXPRESSION-WITH-WFF-DEGREE", 3, 1, false );
    SubLFiles.declareFunction( me, "canonicalize_reformulator_expression_int", "CANONICALIZE-REFORMULATOR-EXPRESSION-INT", 2, 1, false );
    SubLFiles.declareFunction( me, "recanonicalize_rl_expression", "RECANONICALIZE-RL-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "uncanonicalize_rl_expression_cached_internal", "UNCANONICALIZE-RL-EXPRESSION-CACHED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "uncanonicalize_rl_expression_cached", "UNCANONICALIZE-RL-EXPRESSION-CACHED", 2, 0, false );
    SubLFiles.declareFunction( me, "uncanonicalize_rl_expression", "UNCANONICALIZE-RL-EXPRESSION", 2, 0, false );
    SubLFiles.declareFunction( me, "rl_evaluatable_expressions_out", "RL-EVALUATABLE-EXPRESSIONS-OUT", 1, 0, false );
    SubLFiles.declareFunction( me, "rl_evaluatable_expressionP", "RL-EVALUATABLE-EXPRESSION?", 1, 1, false );
    SubLFiles.declareFunction( me, "rl_evaluatable_functorP", "RL-EVALUATABLE-FUNCTOR?", 1, 1, false );
    SubLFiles.declareFunction( me, "rl_evaluatable_subexpressionsP", "RL-EVALUATABLE-SUBEXPRESSIONS?", 1, 1, false );
    SubLFiles.declareFunction( me, "rl_unevaluatable_expressionP", "RL-UNEVALUATABLE-EXPRESSION?", 1, 1, false );
    SubLFiles.declareFunction( me, "hl_formula_for_reformulator_rule", "HL-FORMULA-FOR-REFORMULATOR-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "reformulator_template_mentions_fortP", "REFORMULATOR-TEMPLATE-MENTIONS-FORT?", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rule_mentions_fortP", "REFORMULATOR-RULE-MENTIONS-FORT?", 2, 0, false );
    SubLFiles.declareFunction( me, "reformulator_rules_mentioning_fort", "REFORMULATOR-RULES-MENTIONING-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "print_wff_reformulator_rules", "PRINT-WFF-REFORMULATOR-RULES", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_average_number_of_forts_mentioned_in_reformulator_rules", "COMPUTE-AVERAGE-NUMBER-OF-FORTS-MENTIONED-IN-REFORMULATOR-RULES", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_reformulator_hub_file()
  {
    $reformulator_timeout_time$ = SubLFiles.defparameter( "*REFORMULATOR-TIMEOUT-TIME*", NIL );
    $all_kb_modal_operators_caching_state$ = SubLFiles.deflexical( "*ALL-KB-MODAL-OPERATORS-CACHING-STATE*", NIL );
    $rl_mt$ = SubLFiles.defparameter( "*RL-MT*", mt_vars.$default_ask_mt$.getGlobalValue() );
    $rl_old$ = SubLFiles.defparameter( "*RL-OLD*", NIL );
    $rl_new$ = SubLFiles.defparameter( "*RL-NEW*", NIL );
    $ref_trace_level$ = SubLFiles.defparameter( "*REF-TRACE-LEVEL*", ONE_INTEGER );
    $ignore_modules_unless_focussed$ = SubLFiles.deflexical( "*IGNORE-MODULES-UNLESS-FOCUSSED*", $list22 );
    return NIL;
  }

  public static SubLObject setup_reformulator_hub_file()
  {
    memoization_state.note_globally_cached_function( $sym9$ALL_KB_MODAL_OPERATORS );
    memoization_state.note_memoized_function( $sym17$REFORMULATE_EXPRESSION );
    memoization_state.note_memoized_function( $sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED );
    memoization_state.note_memoized_function( $sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED );
    sunit_external.define_test_category( $str40$RL_EL_mismatch_substitution, UNPROVIDED );
    sunit_external.define_test_category( $str41$Restrict_reformulation_inside_mod, UNPROVIDED );
    sunit_external.define_test_category( $str42$Uniquify_variables, UNPROVIDED );
    sunit_external.define_test_suite( $str43$reformulator_hub_test_suite, ConsesLow.list( $str40$RL_EL_mismatch_substitution, $str41$Restrict_reformulation_inside_mod, $str42$Uniquify_variables ), UNPROVIDED,
        UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_reformulator_hub_file();
  }

  @Override
  public void initializeVariables()
  {
    init_reformulator_hub_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_reformulator_hub_file();
  }
  static
  {
    me = new reformulator_hub();
    $reformulator_timeout_time$ = null;
    $all_kb_modal_operators_caching_state$ = null;
    $rl_mt$ = null;
    $rl_old$ = null;
    $rl_new$ = null;
    $ref_trace_level$ = null;
    $ignore_modules_unless_focussed$ = null;
    $sym0$VARIABLE_P = makeSymbol( "VARIABLE-P" );
    $str1$The_expression__s_contains_an_HL_ = makeString( "The expression ~s contains an HL variable, and the CycL reformulator cannot handle it." );
    $str2$reformulate_cycl_cannot_be_called = makeString( "reformulate-cycl cannot be called when the Cyc KB does not contain the knowledge necessary for reformulation." );
    $kw3$TRUE = makeKeyword( "TRUE" );
    $kw4$FALSE = makeKeyword( "FALSE" );
    $kw5$UNLESS_REWRITE_OF = makeKeyword( "UNLESS-REWRITE-OF" );
    $sym6$MEMOIZATION_STATE_P = makeSymbol( "MEMOIZATION-STATE-P" );
    $kw7$MAX_TIME = makeKeyword( "MAX-TIME" );
    $kw8$ILL_FORMED = makeKeyword( "ILL-FORMED" );
    $sym9$ALL_KB_MODAL_OPERATORS = makeSymbol( "ALL-KB-MODAL-OPERATORS" );
    $const10$ModalOperator = constant_handles.reader_make_constant_shell( makeString( "ModalOperator" ) );
    $const11$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $sym12$_ALL_KB_MODAL_OPERATORS_CACHING_STATE_ = makeSymbol( "*ALL-KB-MODAL-OPERATORS-CACHING-STATE*" );
    $str13$The_reformulator_currently_cannot = makeString( "The reformulator currently cannot handle the n-conjuncts problem." );
    $kw14$NONE = makeKeyword( "NONE" );
    $sym15$CONTAINS_OLD_RL_ = makeSymbol( "CONTAINS-OLD-RL?" );
    $sym16$SUBST_NEW_RL = makeSymbol( "SUBST-NEW-RL" );
    $sym17$REFORMULATE_EXPRESSION = makeSymbol( "REFORMULATE-EXPRESSION" );
    $kw18$APPLY_FIRST_RECURSIVELY = makeKeyword( "APPLY-FIRST-RECURSIVELY" );
    $int19$64 = makeInteger( 64 );
    $kw20$FOCUS = makeKeyword( "FOCUS" );
    $kw21$IGNORE = makeKeyword( "IGNORE" );
    $list22 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "WffViolationResolutionRLModule" ) ) );
    $sym23$_ = makeSymbol( "<" );
    $sym24$CDR = makeSymbol( "CDR" );
    $sym25$CANONICALIZE_REFORMULATOR_EXPRESSION_CACHED = makeSymbol( "CANONICALIZE-REFORMULATOR-EXPRESSION-CACHED" );
    $kw26$ALL = makeKeyword( "ALL" );
    $kw27$ARITY = makeKeyword( "ARITY" );
    $kw28$KB = makeKeyword( "KB" );
    $const29$reformulatorEquals = constant_handles.reader_make_constant_shell( makeString( "reformulatorEquals" ) );
    $const30$reformulatorEquiv = constant_handles.reader_make_constant_shell( makeString( "reformulatorEquiv" ) );
    $sym31$FIRST = makeSymbol( "FIRST" );
    $sym32$UNCANONICALIZE_RL_EXPRESSION_CACHED = makeSymbol( "UNCANONICALIZE-RL-EXPRESSION-CACHED" );
    $sym33$RELEVANT_MT_IS_GENL_MT = makeSymbol( "RELEVANT-MT-IS-GENL-MT" );
    $sym34$RL_EVALUATABLE_EXPRESSION_ = makeSymbol( "RL-EVALUATABLE-EXPRESSION?" );
    $sym35$TRANSFORM_EVALUATION_EXPRESSION = makeSymbol( "TRANSFORM-EVALUATION-EXPRESSION" );
    $const36$evaluateAtEL = constant_handles.reader_make_constant_shell( makeString( "evaluateAtEL" ) );
    $sym37$RL_UNEVALUATABLE_EXPRESSION_ = makeSymbol( "RL-UNEVALUATABLE-EXPRESSION?" );
    $str38$All___s__Arity___s__KB___s__None_ = makeString( "All: ~s  Arity: ~s  KB: ~s  None: ~s~%" );
    $str39$Average_number_of_FORTs_mentioned = makeString( "Average number of FORTs mentioned in reformulator rules: ~s" );
    $str40$RL_EL_mismatch_substitution = makeString( "RL-EL mismatch substitution" );
    $str41$Restrict_reformulation_inside_mod = makeString( "Restrict reformulation inside modals" );
    $str42$Uniquify_variables = makeString( "Uniquify variables" );
    $str43$reformulator_hub_test_suite = makeString( "reformulator-hub-test-suite" );
  }
}
/*
 * 
 * Total time: 328 ms
 * 
 */