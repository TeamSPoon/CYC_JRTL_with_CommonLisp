package com.cyc.cycjava.cycl.inference.modules.removal;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.inference.inference_iterators;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_lookahead_productivity;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.assertions_high;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class removal_modules_known_antecedent_rule
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule";
  public static final String myFingerPrint = "58a5d06b0af3a2d421bf4315d315a6989c65f8591d063e3e730df514f785ac2a";
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 1969L)
  public static SubLSymbol $known_antecedent_rule_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 3680L)
  private static SubLSymbol $via_known_antecedent_rule_string$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 6736L)
  private static SubLSymbol $within_removal_known_antecedent_rule_costP$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 9889L)
  private static SubLSymbol $known_antecedent_rule_hl_module_index$;
  private static final SubLString $str0$__knownAntecedentRule_support_is_;
  private static final SubLString $str1$_via_known_antecedent_rule;
  private static final SubLSymbol $sym2$RULE_ASSERTION_;
  private static final SubLString $str3$__knownAntecedentRule_currently_o;
  private static final SubLString $str4$__knownAntecedentRule_cannot_hand;
  private static final SubLSymbol $kw5$POS;
  private static final SubLSymbol $kw6$SENSE;
  private static final SubLSymbol $kw7$DIRECTION;
  private static final SubLString $str8$__knownAntecedentRule_currently_o;
  private static final SubLSymbol $kw9$PREDICATE;
  private static final SubLSymbol $kw10$ARITY;
  private static final SubLSymbol $kw11$REQUIRED_MT;
  private static final SubLSymbol $kw12$UNIFY;
  private static final SubLSymbol $kw13$REQUIRED_PATTERN;
  private static final SubLSymbol $kw14$CALL;
  private static final SubLSymbol $sym15$REMOVAL_KNOWN_ANTECEDENT_RULE_COST;
  private static final SubLSymbol $kw16$INPUT;
  private static final SubLSymbol $kw17$COST_PATTERN;
  private static final SubLSymbol $sym18$REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR;
  private static final SubLSymbol $kw19$NOT;
  private static final SubLSymbol $kw20$OUTPUT_GENERATE_PATTERN;
  private static final SubLSymbol $sym21$DESTROY_INFERENCE;
  private static final SubLSymbol $kw22$PROBLEM_STORE;
  private static final SubLSymbol $kw23$RESULT_UNIQUENESS;
  private static final SubLSymbol $kw24$PROOF;
  private static final SubLSymbol $kw25$ALLOWED_RULES;
  private static final SubLSymbol $kw26$ALLOWED_MODULES;
  private static final SubLSymbol $kw27$CONTINUABLE_;
  private static final SubLSymbol $kw28$MAX_TRANSFORMATION_DEPTH;
  private static final SubLSymbol $kw29$RETURN;
  private static final SubLSymbol $kw30$TEMPLATE;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw33$HL;
  private static final SubLSymbol $kw34$CACHE_INFERENCE_RESULTS_;
  private static final SubLSymbol $sym35$_KNOWN_ANTECEDENT_RULE_HL_MODULE_INDEX_;

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 2213L)
  public static SubLObject declare_known_antecedent_rule_removal_module_for_rule(final SubLObject rule, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $known_antecedent_rule_enabledP$.getDynamicValue( thread ) )
    {
      Errors.warn( $str0$__knownAntecedentRule_support_is_, rule );
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject plist = known_antecedent_rule_removal_module_plist( rule );
    final SubLObject name = thread.secondMultipleValue();
    thread.resetMultipleValues();
    final SubLObject hl_module = inference_modules.inference_removal_module( name, plist );
    note_hl_module_for_known_antecedent_rule( rule, hl_module );
    if( NIL != reclassifyP )
    {
      inference_modules.reclassify_removal_modules();
    }
    return hl_module;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 3090L)
  public static SubLObject undeclare_known_antecedent_rule_removal_module_for_rule(final SubLObject rule, SubLObject reclassifyP)
  {
    if( reclassifyP == UNPROVIDED )
    {
      reclassifyP = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    clear_hl_module_for_known_antecedent_rule( rule );
    if( NIL != assertion_handles.valid_assertionP( rule, UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject plist = known_antecedent_rule_removal_module_plist( rule );
      final SubLObject name = thread.secondMultipleValue();
      thread.resetMultipleValues();
      return inference_modules.undeclare_inference_removal_module( name, reclassifyP );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 3461L)
  public static SubLObject redeclare_known_antecedent_rule_removal_module_for_rule(final SubLObject rule)
  {
    undeclare_known_antecedent_rule_removal_module_for_rule( rule, UNPROVIDED );
    return declare_known_antecedent_rule_removal_module_for_rule( rule, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 3983L)
  public static SubLObject undeclare_all_known_antecedent_rule_removal_modules()
  {
    SubLObject count = ZERO_INTEGER;
    final SubLObject cdohash_table = inference_modules.hl_module_store();
    SubLObject name_var = NIL;
    SubLObject hl_module = NIL;
    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( cdohash_table );
    try
    {
      while ( Hashtables.iteratorHasNext( cdohash_iterator ))
      {
        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
        name_var = Hashtables.getEntryKey( cdohash_entry );
        hl_module = Hashtables.getEntryValue( cdohash_entry );
        final SubLObject name = inference_modules.hl_module_name( hl_module );
        if( NIL != string_utilities.substringP( $via_known_antecedent_rule_string$.getGlobalValue(), string_utilities.str( name ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
        {
          count = Numbers.add( count, ONE_INTEGER );
          inference_modules.undeclare_inference_removal_module( name, NIL );
        }
      }
    }
    finally
    {
      Hashtables.releaseEntrySetIterator( cdohash_iterator );
    }
    inference_modules.reclassify_removal_modules();
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 4342L)
  public static SubLObject known_antecedent_rule_removal_module_plist(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != assertions_high.rule_assertionP( rule ) : rule;
    SubLObject plist = NIL;
    SubLObject name = NIL;
    final SubLObject cnf = assertions_high.assertion_cnf( rule );
    final SubLObject pos_lits = clauses.pos_lits( cnf );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !ONE_INTEGER.numE( Sequences.length( pos_lits ) ) )
    {
      Errors.error( $str3$__knownAntecedentRule_currently_o, rule );
    }
    final SubLObject pos_lit = pos_lits.first();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != el_utilities.sequence_var( pos_lit, UNPROVIDED ) )
    {
      Errors.error( $str4$__knownAntecedentRule_cannot_hand, rule );
    }
    final SubLObject sense = $kw5$POS;
    plist = conses_high.putf( plist, $kw6$SENSE, sense );
    final SubLObject direction = assertions_high.assertion_direction( rule );
    plist = conses_high.putf( plist, $kw7$DIRECTION, direction );
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( pos_lit );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == forts.fort_p( predicate ) )
    {
      Errors.error( $str8$__knownAntecedentRule_currently_o, rule );
    }
    plist = conses_high.putf( plist, $kw9$PREDICATE, predicate );
    name = known_antecedent_rule_hl_module_name( rule );
    final SubLObject v_arity = el_utilities.formula_arity( pos_lit, UNPROVIDED );
    plist = conses_high.putf( plist, $kw10$ARITY, v_arity );
    final SubLObject mt = assertions_high.assertion_mt( rule );
    plist = conses_high.putf( plist, $kw11$REQUIRED_MT, mt );
    final SubLObject required_pattern = ConsesLow.list( $kw12$UNIFY, pos_lit );
    plist = conses_high.putf( plist, $kw13$REQUIRED_PATTERN, required_pattern );
    final SubLObject cost_pattern = ConsesLow.list( $kw14$CALL, $sym15$REMOVAL_KNOWN_ANTECEDENT_RULE_COST, $kw16$INPUT, rule );
    plist = conses_high.putf( plist, $kw17$COST_PATTERN, cost_pattern );
    final SubLObject output_generate_pattern = ConsesLow.list( $kw14$CALL, $sym18$REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR, $kw16$INPUT, rule, ConsesLow.list( $kw19$NOT, name ) );
    plist = conses_high.putf( plist, $kw20$OUTPUT_GENERATE_PATTERN, output_generate_pattern );
    return Values.values( plist, name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 6547L)
  public static SubLObject known_antecedent_rule_removal_module_name(final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject plist = known_antecedent_rule_removal_module_plist( rule );
    final SubLObject name = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 6809L)
  public static SubLObject removal_known_antecedent_rule_cost(final SubLObject asent, final SubLObject rule)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cost = NIL;
    if( NIL == $within_removal_known_antecedent_rule_costP$.getDynamicValue( thread ) )
    {
      final SubLObject _prev_bind_0 = $within_removal_known_antecedent_rule_costP$.currentBinding( thread );
      try
      {
        $within_removal_known_antecedent_rule_costP$.bind( T, thread );
        final SubLObject store = inference_worker.currently_active_problem_store();
        if( NIL != store )
        {
          final SubLObject meta_store = inference_datastructures_problem_store.problem_store_meta_problem_store( store );
          final SubLObject mt = mt_relevance_macros.inference_relevant_mt();
          final SubLObject name = known_antecedent_rule_removal_module_name( rule );
          final SubLObject query_static_properties = removal_known_antecedent_rule_static_properties( asent, rule, meta_store, ConsesLow.list( $kw19$NOT, name ) );
          final SubLObject removal_inference = inference_utilities.new_continuable_antecedent_inference( asent, mt, rule, meta_store, query_static_properties );
          final SubLObject transformed_problem = inference_datastructures_inference.inference_root_problem( removal_inference );
          if( NIL != transformed_problem && NIL != inference_datastructures_inference.simplest_inference_p( removal_inference ) )
          {
            final SubLObject strategy = inference_datastructures_inference.simplest_inference_strategy( removal_inference );
            cost = inference_datastructures_enumerated_types.number_of_children_for_productivity( inference_lookahead_productivity.memoized_problem_max_removal_productivity( transformed_problem, strategy ) );
          }
          inference_datastructures_inference.destroy_inference( removal_inference );
        }
      }
      finally
      {
        $within_removal_known_antecedent_rule_costP$.rebind( _prev_bind_0, thread );
      }
    }
    return cost;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 8077L)
  public static SubLObject removal_known_antecedent_rule_inference(final SubLObject sentence, final SubLObject mt, final SubLObject rule, final SubLObject problem_store, final SubLObject allowed_modules)
  {
    final SubLObject query_static_properties = removal_known_antecedent_rule_static_properties( sentence, rule, problem_store, allowed_modules );
    final SubLObject inference = inference_kernel.new_continuable_inference( sentence, mt, query_static_properties );
    return inference;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 8415L)
  public static SubLObject removal_known_antecedent_rule_iterator(final SubLObject sentence, final SubLObject rule, final SubLObject allowed_modules)
  {
    final SubLObject problem_store = inference_worker.currently_active_problem_store();
    final SubLObject query_static_properties = removal_known_antecedent_rule_static_properties( sentence, rule, problem_store, allowed_modules );
    final SubLObject inference = inference_utilities.new_continuable_antecedent_inference( sentence, mt_relevance_macros.inference_relevant_mt(), rule, problem_store, query_static_properties );
    final SubLObject query_dynamic_properties = removal_known_antecedent_rule_dynamic_properties( sentence );
    final SubLObject iterator = inference_iterators.new_inference_iterator( inference, query_dynamic_properties, $sym21$DESTROY_INFERENCE );
    return iterator;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 9015L)
  public static SubLObject removal_known_antecedent_rule_static_properties(final SubLObject sentence, final SubLObject rule, final SubLObject problem_store, final SubLObject allowed_modules)
  {
    final SubLObject query_static_properties = ConsesLow.list( $kw22$PROBLEM_STORE, problem_store, $kw23$RESULT_UNIQUENESS, $kw24$PROOF, $kw25$ALLOWED_RULES, ConsesLow.list( rule ), $kw26$ALLOWED_MODULES,
        allowed_modules );
    return query_static_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 9516L)
  public static SubLObject removal_known_antecedent_rule_dynamic_properties(final SubLObject sentence)
  {
    final SubLObject query_dynamic_properties = ConsesLow.list( new SubLObject[] { $kw27$CONTINUABLE_, NIL, $kw28$MAX_TRANSFORMATION_DEPTH, ONE_INTEGER, $kw29$RETURN, ConsesLow.list( $kw30$TEMPLATE, reader.bq_cons(
        sentence, $list31 ) ), $kw32$ANSWER_LANGUAGE, $kw33$HL, $kw34$CACHE_INFERENCE_RESULTS_, NIL
    } );
    return query_dynamic_properties;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 10109L)
  public static SubLObject note_hl_module_for_known_antecedent_rule(final SubLObject rule, final SubLObject hl_module)
  {
    return dictionary.dictionary_enter( $known_antecedent_rule_hl_module_index$.getGlobalValue(), rule, hl_module );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 10267L)
  public static SubLObject clear_hl_module_for_known_antecedent_rule(final SubLObject rule)
  {
    return dictionary.dictionary_remove( $known_antecedent_rule_hl_module_index$.getGlobalValue(), rule );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 10407L)
  public static SubLObject hl_module_for_known_antecedent_rule(final SubLObject rule)
  {
    return dictionary.dictionary_lookup( $known_antecedent_rule_hl_module_index$.getGlobalValue(), rule, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/modules/removal/removal-modules-known-antecedent-rule.lisp", position = 10541L)
  public static SubLObject known_antecedent_rule_hl_module_name(final SubLObject rule)
  {
    final SubLObject existing_hl_module = hl_module_for_known_antecedent_rule( rule );
    if( NIL != existing_hl_module )
    {
      return inference_modules.hl_module_name( existing_hl_module );
    }
    final SubLObject pos_lit = clauses.pos_lits( assertions_high.assertion_cnf( rule ) ).first();
    final SubLObject predicate = cycl_utilities.atomic_sentence_predicate( pos_lit );
    final SubLObject sense = $kw5$POS;
    final SubLObject string = Sequences.cconcatenate( string_utilities.str( predicate ), $via_known_antecedent_rule_string$.getGlobalValue() );
    return removal_module_utilities.determine_hl_module_name( string, sense );
  }

  public static SubLObject declare_removal_modules_known_antecedent_rule_file()
  {
    SubLFiles.declareFunction( me, "declare_known_antecedent_rule_removal_module_for_rule", "DECLARE-KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-FOR-RULE", 1, 1, false );
    SubLFiles.declareFunction( me, "undeclare_known_antecedent_rule_removal_module_for_rule", "UNDECLARE-KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-FOR-RULE", 1, 1, false );
    SubLFiles.declareFunction( me, "redeclare_known_antecedent_rule_removal_module_for_rule", "REDECLARE-KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-FOR-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "undeclare_all_known_antecedent_rule_removal_modules", "UNDECLARE-ALL-KNOWN-ANTECEDENT-RULE-REMOVAL-MODULES", 0, 0, false );
    SubLFiles.declareFunction( me, "known_antecedent_rule_removal_module_plist", "KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "known_antecedent_rule_removal_module_name", "KNOWN-ANTECEDENT-RULE-REMOVAL-MODULE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "removal_known_antecedent_rule_cost", "REMOVAL-KNOWN-ANTECEDENT-RULE-COST", 2, 0, false );
    SubLFiles.declareFunction( me, "removal_known_antecedent_rule_inference", "REMOVAL-KNOWN-ANTECEDENT-RULE-INFERENCE", 5, 0, false );
    SubLFiles.declareFunction( me, "removal_known_antecedent_rule_iterator", "REMOVAL-KNOWN-ANTECEDENT-RULE-ITERATOR", 3, 0, false );
    SubLFiles.declareFunction( me, "removal_known_antecedent_rule_static_properties", "REMOVAL-KNOWN-ANTECEDENT-RULE-STATIC-PROPERTIES", 4, 0, false );
    SubLFiles.declareFunction( me, "removal_known_antecedent_rule_dynamic_properties", "REMOVAL-KNOWN-ANTECEDENT-RULE-DYNAMIC-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "note_hl_module_for_known_antecedent_rule", "NOTE-HL-MODULE-FOR-KNOWN-ANTECEDENT-RULE", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_hl_module_for_known_antecedent_rule", "CLEAR-HL-MODULE-FOR-KNOWN-ANTECEDENT-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_module_for_known_antecedent_rule", "HL-MODULE-FOR-KNOWN-ANTECEDENT-RULE", 1, 0, false );
    SubLFiles.declareFunction( me, "known_antecedent_rule_hl_module_name", "KNOWN-ANTECEDENT-RULE-HL-MODULE-NAME", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_removal_modules_known_antecedent_rule_file()
  {
    $known_antecedent_rule_enabledP$ = SubLFiles.defvar( "*KNOWN-ANTECEDENT-RULE-ENABLED?*", NIL );
    $via_known_antecedent_rule_string$ = SubLFiles.deflexical( "*VIA-KNOWN-ANTECEDENT-RULE-STRING*", $str1$_via_known_antecedent_rule );
    $within_removal_known_antecedent_rule_costP$ = SubLFiles.defparameter( "*WITHIN-REMOVAL-KNOWN-ANTECEDENT-RULE-COST?*", NIL );
    $known_antecedent_rule_hl_module_index$ = SubLFiles.deflexical( "*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*", maybeDefault( $sym35$_KNOWN_ANTECEDENT_RULE_HL_MODULE_INDEX_, $known_antecedent_rule_hl_module_index$,
        () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQL ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_removal_modules_known_antecedent_rule_file()
  {
    subl_macro_promotions.declare_defglobal( $sym35$_KNOWN_ANTECEDENT_RULE_HL_MODULE_INDEX_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_removal_modules_known_antecedent_rule_file();
  }

  @Override
  public void initializeVariables()
  {
    init_removal_modules_known_antecedent_rule_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_removal_modules_known_antecedent_rule_file();
  }
  static
  {
    me = new removal_modules_known_antecedent_rule();
    $known_antecedent_rule_enabledP$ = null;
    $via_known_antecedent_rule_string$ = null;
    $within_removal_known_antecedent_rule_costP$ = null;
    $known_antecedent_rule_hl_module_index$ = null;
    $str0$__knownAntecedentRule_support_is_ = makeString( "#$knownAntecedentRule support is disabled.  Asserting #$knownAntecedentRule on ~s will have no effect.~%" );
    $str1$_via_known_antecedent_rule = makeString( "-via-known-antecedent-rule" );
    $sym2$RULE_ASSERTION_ = makeSymbol( "RULE-ASSERTION?" );
    $str3$__knownAntecedentRule_currently_o = makeString( "#$knownAntecedentRule currently only applies to rules with exactly one poslit, but was applied to ~s" );
    $str4$__knownAntecedentRule_cannot_hand = makeString( "#$knownAntecedentRule cannot handle poslits with sequence variables, but was applied to ~s" );
    $kw5$POS = makeKeyword( "POS" );
    $kw6$SENSE = makeKeyword( "SENSE" );
    $kw7$DIRECTION = makeKeyword( "DIRECTION" );
    $str8$__knownAntecedentRule_currently_o = makeString( "#$knownAntecedentRule currently only applies to rules with a fort as the predicate of their single pos-lit, but was applied to ~s" );
    $kw9$PREDICATE = makeKeyword( "PREDICATE" );
    $kw10$ARITY = makeKeyword( "ARITY" );
    $kw11$REQUIRED_MT = makeKeyword( "REQUIRED-MT" );
    $kw12$UNIFY = makeKeyword( "UNIFY" );
    $kw13$REQUIRED_PATTERN = makeKeyword( "REQUIRED-PATTERN" );
    $kw14$CALL = makeKeyword( "CALL" );
    $sym15$REMOVAL_KNOWN_ANTECEDENT_RULE_COST = makeSymbol( "REMOVAL-KNOWN-ANTECEDENT-RULE-COST" );
    $kw16$INPUT = makeKeyword( "INPUT" );
    $kw17$COST_PATTERN = makeKeyword( "COST-PATTERN" );
    $sym18$REMOVAL_KNOWN_ANTECEDENT_RULE_ITERATOR = makeSymbol( "REMOVAL-KNOWN-ANTECEDENT-RULE-ITERATOR" );
    $kw19$NOT = makeKeyword( "NOT" );
    $kw20$OUTPUT_GENERATE_PATTERN = makeKeyword( "OUTPUT-GENERATE-PATTERN" );
    $sym21$DESTROY_INFERENCE = makeSymbol( "DESTROY-INFERENCE" );
    $kw22$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $kw23$RESULT_UNIQUENESS = makeKeyword( "RESULT-UNIQUENESS" );
    $kw24$PROOF = makeKeyword( "PROOF" );
    $kw25$ALLOWED_RULES = makeKeyword( "ALLOWED-RULES" );
    $kw26$ALLOWED_MODULES = makeKeyword( "ALLOWED-MODULES" );
    $kw27$CONTINUABLE_ = makeKeyword( "CONTINUABLE?" );
    $kw28$MAX_TRANSFORMATION_DEPTH = makeKeyword( "MAX-TRANSFORMATION-DEPTH" );
    $kw29$RETURN = makeKeyword( "RETURN" );
    $kw30$TEMPLATE = makeKeyword( "TEMPLATE" );
    $list31 = ConsesLow.list( makeKeyword( "SUPPORTS" ) );
    $kw32$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw33$HL = makeKeyword( "HL" );
    $kw34$CACHE_INFERENCE_RESULTS_ = makeKeyword( "CACHE-INFERENCE-RESULTS?" );
    $sym35$_KNOWN_ANTECEDENT_RULE_HL_MODULE_INDEX_ = makeSymbol( "*KNOWN-ANTECEDENT-RULE-HL-MODULE-INDEX*" );
  }
}
/*
 * 
 * Total time: 113 ms
 * 
 */