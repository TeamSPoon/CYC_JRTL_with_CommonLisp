package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.backward;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_kb_sentence
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_kb_sentence";
  public static final String myFingerPrint = "665bef54de72dfaf42b09baae2b592fd7dcec9d5e88c253dd51d9edfd4b4b7fc";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 980L)
  private static SubLSymbol $default_kb_sentence_check_cost$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 1076L)
  private static SubLSymbol $kb_sentence_allowed_modules_spec$;
  private static final SubLObject $const0$kbSentence;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$POS;
  private static final SubLSymbol $sym3$MIN;
  private static final SubLFloat $float4$0_01;
  private static final SubLSymbol $kw5$RETURN;
  private static final SubLSymbol $kw6$BINDINGS_AND_SUPPORTS;
  private static final SubLSymbol $kw7$ALLOWED_MODULES;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$REMOVAL_KB_SENTENCE_LOOKUP_POS;
  private static final SubLList $list10;
  private static final SubLSymbol $kw11$OPAQUE;
  private static final SubLSymbol $kw12$REMOVAL_KB_SENTENCE_CHECK_NEG;
  private static final SubLList $list13;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 1314L)
  public static SubLObject removal_kb_sentence_lookup_pos_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    return removal_kb_sentence_lookup_pos_cost_int( subsentence );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 1636L)
  public static SubLObject removal_kb_sentence_lookup_pos_cost_int(final SubLObject sentence)
  {
    if( NIL != variables.fully_bound_p( sentence ) )
    {
      return $default_kb_sentence_check_cost$.getGlobalValue();
    }
    if( NIL != el_utilities.atomic_sentenceP( sentence ) )
    {
      return inference_utilities.literal_removal_cost( sentence, $kw2$POS, UNPROVIDED, UNPROVIDED );
    }
    if( NIL != el_utilities.el_conjunction_p( sentence ) )
    {
      return removal_kb_sentence_lookup_pos_conjunction_cost( sentence );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 2058L)
  public static SubLObject removal_kb_sentence_lookup_pos_conjunction_cost(final SubLObject conjunction)
  {
    final SubLObject conjuncts = cycl_utilities.formula_args( conjunction, UNPROVIDED );
    SubLObject costs = NIL;
    SubLObject cdolist_list_var = conjuncts;
    SubLObject conjunct = NIL;
    conjunct = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject conjunct_cost = removal_kb_sentence_lookup_pos_cost_int( conjunct );
      if( NIL != conjunct_cost )
      {
        costs = ConsesLow.cons( conjunct_cost, costs );
      }
      cdolist_list_var = cdolist_list_var.rest();
      conjunct = cdolist_list_var.first();
    }
    return removal_kb_sentence_guess_cost_from_literal_costs( costs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 2442L)
  public static SubLObject removal_kb_sentence_guess_cost_from_literal_costs(final SubLObject costs)
  {
    if( NIL != costs )
    {
      final SubLObject min_cost = Functions.apply( $sym3$MIN, costs );
      return min_cost.isZero() ? min_cost : Numbers.max( removal_kb_sentence_adjust_cost_guess( min_cost ), $float4$0_01 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 2788L)
  public static SubLObject removal_kb_sentence_adjust_cost_guess(final SubLObject cost)
  {
    return Numbers.divide( cost, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 2872L)
  public static SubLObject removal_kb_sentence_lookup_pos_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
    return removal_kb_sentence_lookup_pos_expand_subsentence( subsentence, mt, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 3132L)
  public static SubLObject removal_kb_sentence_lookup_pos_expand_subsentence(final SubLObject subsentence, final SubLObject mt, final SubLObject sense)
  {
    SubLObject cdolist_list_var;
    final SubLObject result = cdolist_list_var = ask_utilities.inference_recursive_query( subsentence, mt, ConsesLow.list( $kw5$RETURN, $kw6$BINDINGS_AND_SUPPORTS, $kw7$ALLOWED_MODULES, $kb_sentence_allowed_modules_spec$
        .getGlobalValue() ) );
    SubLObject bindings_and_supports = NIL;
    bindings_and_supports = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = bindings_and_supports;
      SubLObject v_bindings = NIL;
      SubLObject supports = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list8 );
      supports = current.first();
      current = current.rest();
      if( NIL == current )
      {
        backward.removal_add_node( supports.first(), v_bindings, supports.rest() );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list8 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      bindings_and_supports = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 4340L)
  public static SubLObject removal_kb_sentence_neg_gaf_cost(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    return $default_kb_sentence_check_cost$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 4584L)
  public static SubLObject removal_kb_sentence_check_neg_expand(final SubLObject asent, SubLObject sense)
  {
    if( sense == UNPROVIDED )
    {
      sense = NIL;
    }
    final SubLObject subsentence = cycl_utilities.atomic_sentence_arg1( asent, UNPROVIDED );
    final SubLObject mt = inference_worker.mt_of_currently_executing_tactic();
    return removal_kb_sentence_check_neg_expand_subsentence( subsentence, mt, sense );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-kb-sentence.lisp", position = 4841L)
  public static SubLObject removal_kb_sentence_check_neg_expand_subsentence(final SubLObject subsentence, final SubLObject mt, final SubLObject sense)
  {
    final SubLObject result = ask_utilities.inference_recursive_query( subsentence, mt, ConsesLow.list( $kw7$ALLOWED_MODULES, $kb_sentence_allowed_modules_spec$.getGlobalValue() ) );
    if( NIL == result )
    {
      backward.removal_add_node( arguments.make_hl_support( $kw11$OPAQUE, el_utilities.make_negation( subsentence ), mt, UNPROVIDED ), UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject declare_removal_modules_kb_sentence_file()
  {
    SubLFiles.declareFunction( me, "removal_kb_sentence_lookup_pos_cost", "REMOVAL-KB-SENTENCE-LOOKUP-POS-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_lookup_pos_cost_int", "REMOVAL-KB-SENTENCE-LOOKUP-POS-COST-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_lookup_pos_conjunction_cost", "REMOVAL-KB-SENTENCE-LOOKUP-POS-CONJUNCTION-COST", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_guess_cost_from_literal_costs", "REMOVAL-KB-SENTENCE-GUESS-COST-FROM-LITERAL-COSTS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_adjust_cost_guess", "REMOVAL-KB-SENTENCE-ADJUST-COST-GUESS", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_lookup_pos_expand", "REMOVAL-KB-SENTENCE-LOOKUP-POS-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_lookup_pos_expand_subsentence", "REMOVAL-KB-SENTENCE-LOOKUP-POS-EXPAND-SUBSENTENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_neg_gaf_cost", "REMOVAL-KB-SENTENCE-NEG-GAF-COST", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_check_neg_expand", "REMOVAL-KB-SENTENCE-CHECK-NEG-EXPAND", 1, 1, false );
    SubLFiles.declareFunction( me, "removal_kb_sentence_check_neg_expand_subsentence", "REMOVAL-KB-SENTENCE-CHECK-NEG-EXPAND-SUBSENTENCE", 3, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_kb_sentence_file()
  {
    $default_kb_sentence_check_cost$ = SubLFiles.deflexical( "*DEFAULT-KB-SENTENCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue() );
    $kb_sentence_allowed_modules_spec$ = SubLFiles.deflexical( "*KB-SENTENCE-ALLOWED-MODULES-SPEC*", $list1 );
    return NIL;
  }

  public static SubLObject setup_removal_modules_kb_sentence_file()
  {
    inference_modules.register_solely_specific_removal_module_predicate( $const0$kbSentence );
    inference_modules.inference_removal_module( $kw9$REMOVAL_KB_SENTENCE_LOOKUP_POS, $list10 );
    inference_modules.inference_removal_module( $kw12$REMOVAL_KB_SENTENCE_CHECK_NEG, $list13 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_kb_sentence_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_kb_sentence_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_kb_sentence_file();
  }
  static
  {
    me = new removal_modules_kb_sentence();
    $default_kb_sentence_check_cost$ = null;
    $kb_sentence_allowed_modules_spec$ = null;
    $const0$kbSentence = constant_handles.reader_make_constant_shell( makeString( "kbSentence" ) );
    $list1 = ConsesLow.list( makeKeyword( "OR" ), ConsesLow.list( makeKeyword( "MODULE-SUBTYPE" ), makeKeyword( "KB" ) ), ConsesLow.list( makeKeyword( "AND" ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list(
        makeKeyword( "MODULE-TYPE" ), makeKeyword( "REMOVAL" ) ) ), ConsesLow.list( makeKeyword( "NOT" ), ConsesLow.list( makeKeyword( "MODULE-TYPE" ), makeKeyword( "REMOVAL-CONJUNCTIVE" ) ) ) ) );
    $kw2$POS = makeKeyword( "POS" );
    $sym3$MIN = makeSymbol( "MIN" );
    $float4$0_01 = makeDouble( 0.01 );
    $kw5$RETURN = makeKeyword( "RETURN" );
    $kw6$BINDINGS_AND_SUPPORTS = makeKeyword( "BINDINGS-AND-SUPPORTS" );
    $kw7$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $list8 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "SUPPORTS" ) );
    $kw9$REMOVAL_KB_SENTENCE_LOOKUP_POS = makeKeyword( "REMOVAL-KB-SENTENCE-LOOKUP-POS" );
    $list10 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "POS" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "kbSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "kbSentence" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.cons( makeKeyword( "FULLY-BOUND" ), makeKeyword(
            "FULLY-BOUND" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ), makeSymbol( "INFERENCE-PREDICATE-P" ) ), makeKeyword( "ANYTHING" ) ), ConsesLow.cons( constant_handles.reader_make_constant_shell(
                makeString( "and" ) ), makeKeyword( "ANYTHING" ) ) ) ), makeKeyword( "COST" ), makeSymbol( "REMOVAL-KB-SENTENCE-LOOKUP-POS-COST" ), makeKeyword( "COMPLETENESS" ), makeKeyword( "COMPLETE" ), makeKeyword(
                    "EXPAND" ), makeSymbol( "REMOVAL-KB-SENTENCE-LOOKUP-POS-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
                        "(#$kbSentence (<non-predicate> . <fully-bound>)) or \n    (#$kbSentence (<predicate> . <anything>)) or\n    (#$kbSentence (#$and . <anything>))\n    by recursively asking sentence w/o any sksi support\n    and succeeding if the ask succeeds" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$kbSentence\n     (#$thereExists ?SPEC\n      (#$genls ?SPEC #$BinaryRelation)))" )
    } );
    $kw11$OPAQUE = makeKeyword( "OPAQUE" );
    $kw12$REMOVAL_KB_SENTENCE_CHECK_NEG = makeKeyword( "REMOVAL-KB-SENTENCE-CHECK-NEG" );
    $list13 = ConsesLow.list( new SubLObject[] { makeKeyword( "SENSE" ), makeKeyword( "NEG" ), makeKeyword( "PREDICATE" ), constant_handles.reader_make_constant_shell( makeString( "kbSentence" ) ), makeKeyword(
        "REQUIRED-PATTERN" ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "kbSentence" ) ), ConsesLow.list( makeKeyword( "OR" ), ConsesLow.cons( ConsesLow.list( makeKeyword( "TEST" ),
            makeSymbol( "INFERENCE-PREDICATE-P" ) ), makeKeyword( "FULLY-BOUND" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "not" ) ), ConsesLow.cons( ConsesLow.list( makeKeyword(
                "TEST" ), makeSymbol( "INFERENCE-PREDICATE-P" ) ), makeKeyword( "FULLY-BOUND" ) ) ) ) ), makeKeyword( "COST-EXPRESSION" ), makeSymbol( "*DEFAULT-KB-SENTENCE-CHECK-COST*" ), makeKeyword( "COMPLETENESS" ),
      makeKeyword( "COMPLETE" ), makeKeyword( "EXPAND" ), makeSymbol( "REMOVAL-KB-SENTENCE-CHECK-NEG-EXPAND" ), makeKeyword( "DOCUMENTATION" ), makeString(
          "(#$not (#$kbSentence (<predicate> . <fully-bound>))) or\n    (#$not (#$kbSentence (#$not (<predicate> . <fully-bound>))))\n    by recursively asking sentence (<predicate> . <fully-bound>) or \n                                   (#$not (<predicate> . <fully-bound>))\n    without any sksi support\n    and succeeding if the ask succeeds" ),
      makeKeyword( "EXAMPLE" ), makeString( "(#$not (#$kbSentence\n     (#$not (#$genls #$Microtheory #$BinaryPredicate))))" )
    } );
  }
}
/*
 * 
 * Total time: 93 ms
 * 
 */