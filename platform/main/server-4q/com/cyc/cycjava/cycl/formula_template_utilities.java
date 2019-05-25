package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class formula_template_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.formula_template_utilities";
  public static final String myFingerPrint = "4e650404a9b1f0312cdc36cae56995f2f3b2ecb6040ce89f33044a06ac6ed697";
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 8746L)
  public static SubLSymbol $assume_induced_fet_templates_already_reifiedP$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 31708L)
  private static SubLSymbol $promising_induction_topic_type_collectionP_verify_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 48271L)
  private static SubLSymbol $make_fet_gloss_for_arg2_of_binary_pred_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 50904L)
  private static SubLSymbol $make_fet_gloss_for_meta_isa_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 67934L)
  private static SubLSymbol $ftemplate_utilities_example_template_topic_cases$;
  private static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const1$EverythingPSC;
  private static final SubLObject $const2$FormulaTemplateTopicType;
  private static final SubLSymbol $sym3$STRING_;
  private static final SubLSymbol $sym4$FORT_NAME;
  private static final SubLObject $const5$FormulaTemplateMicrotheory_FET;
  private static final SubLSymbol $kw6$TYPE;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLSymbol $sym10$_TERM;
  private static final SubLSymbol $sym11$_TOPIC;
  private static final SubLSymbol $sym12$FORMULA_TEMPLATE_DEFTUPLE_ORDER;
  private static final SubLList $list13;
  private static final SubLSymbol $sym14$_COL;
  private static final SubLSymbol $sym15$SECOND;
  private static final SubLObject $const16$InferencePSC;
  private static final SubLSymbol $kw17$ANSWER_LANGUAGE;
  private static final SubLSymbol $kw18$HL;
  private static final SubLSymbol $kw19$INTERMEDIATE_STEP_VALIDATION_LEVEL;
  private static final SubLSymbol $kw20$NONE;
  private static final SubLSymbol $kw21$PROBLEM_STORE;
  private static final SubLList $list22;
  private static final SubLObject $const23$and;
  private static final SubLObject $const24$relationAllInstance;
  private static final SubLObject $const25$meetsSomeConstraintOfTopicType;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLSymbol $kw28$BREADTH;
  private static final SubLSymbol $kw29$QUEUE;
  private static final SubLSymbol $kw30$STACK;
  private static final SubLSymbol $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV;
  private static final SubLSymbol $kw32$ERROR;
  private static final SubLString $str33$_A_is_not_a__A;
  private static final SubLSymbol $sym34$SBHL_TRUE_TV_P;
  private static final SubLSymbol $kw35$CERROR;
  private static final SubLString $str36$continue_anyway;
  private static final SubLSymbol $kw37$WARN;
  private static final SubLString $str38$_A_is_not_a_valid__sbhl_type_erro;
  private static final SubLObject $const39$genls;
  private static final SubLObject $const40$assertedSentence;
  private static final SubLString $str41$_A_is_neither_SET_P_nor_LISTP_;
  private static final SubLString $str42$attempting_to_bind_direction_link;
  private static final SubLString $str43$Node__a_does_not_pass_sbhl_type_t;
  private static final SubLSymbol $kw44$GAF;
  private static final SubLObject $const45$isa;
  private static final SubLObject $const46$meetsSomeGenlsConstraintOfTopicTy;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$APPLICABLE_TEMPLATE_TOPICS_FOR_TERM;
  private static final SubLFloat $float49$0_1;
  private static final SubLString $str50$Took__S_seconds_to_determine_indu;
  private static final SubLSymbol $kw51$DEPTH;
  private static final SubLObject $const52$True_JustificationTruth;
  private static final SubLObject $const53$FormulaTemplateInductionTopicType;
  private static final SubLObject $const54$formulaTemplateHasType;
  private static final SubLList $list55;
  private static final SubLSymbol $sym56$_TEMPLATE;
  private static final SubLList $list57;
  private static final SubLSymbol $sym58$_TOPIC_TYPE;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLList $list61;
  private static final SubLSymbol $sym62$_WHAT;
  private static final SubLObject $const63$templateTypeForFocalTermType;
  private static final SubLList $list64;
  private static final SubLObject $const65$ist_Asserted;
  private static final SubLSymbol $sym66$_WHERE;
  private static final SubLObject $const67$templateTopicGenls;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$FIRST;
  private static final SubLObject $const70$termOfUnit;
  private static final SubLObject $const71$BaseKB;
  private static final SubLObject $const72$Cyc;
  private static final SubLString $str73$;
  private static final SubLString $str74$Can_t_use_a_non_FORT_for_an_FET_t;
  private static final SubLString $str75$No_subtopics_;
  private static final SubLString $str76$No_templates_;
  private static final SubLString $str77$Can_t_use_a_non_FORT_for_an_FET_s;
  private static final SubLString $str78$SalientDescriptorFETFn;
  private static final SubLSymbol $sym79$MAKE_SPECS_FN;
  private static final SubLSymbol $kw80$ISA;
  private static final SubLObject $const81$promisingSalientDescriptorInducti;
  private static final SubLObject $const82$promisingSalientDescriptorInducti;
  private static final SubLString $str83$promisingSalientDescriptorInducti;
  private static final SubLInteger $int84$90;
  private static final SubLObject $const85$DateBeforeFn;
  private static final SubLObject $const86$DaysDuration;
  private static final SubLSymbol $sym87$PROMISING_INDUCTION_TOPIC_TYPE_COLLECTION__VERIFY;
  private static final SubLSymbol $sym88$_PROMISING_INDUCTION_TOPIC_TYPE_COLLECTION__VERIFY_CACHING_STATE_;
  private static final SubLObject $const89$InducedFormulaTemplate;
  private static final SubLObject $const90$SalientDescriptorFETForTypeFn;
  private static final SubLSymbol $sym91$FOCAL_TERM_TYPE_FOR_TOPIC_TYPE;
  private static final SubLSymbol $sym92$EL_FORT_P;
  private static final SubLSymbol $kw93$MAX_NUMBER;
  private static final SubLSymbol $sym94$_COLLECTION;
  private static final SubLString $str95$focalTermTypeForInducedTemplateTy;
  private static final SubLSymbol $sym96$_MT;
  private static final SubLSymbol $kw97$TOPICS;
  private static final SubLObject $const98$ist;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLSymbol $sym101$TERM__;
  private static final SubLList $list102;
  private static final SubLSymbol $kw103$TOPIC_TYPE;
  private static final SubLList $list104;
  private static final SubLList $list105;
  private static final SubLObject $const106$FormulaArgPositionFn;
  private static final SubLObject $const107$SomeExampleFn;
  private static final SubLObject $const108$SingleAssertionEntry;
  private static final SubLObject $const109$MultipleAssertionEntry;
  private static final SubLSymbol $kw110$WHAT;
  private static final SubLList $list111;
  private static final SubLList $list112;
  private static final SubLList $list113;
  private static final SubLObject $const114$relationAllExists;
  private static final SubLString $str115$_;
  private static final SubLString $str116$__type__;
  private static final SubLObject $const117$glossForInducedSuggestionPred;
  private static final SubLObject $const118$GKEFormulaTemplatesMt;
  private static final SubLList $list119;
  private static final SubLString $str120$______;
  private static final SubLString $str121$arg__S_of__S_;
  private static final SubLSymbol $sym122$MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED;
  private static final SubLSymbol $sym123$PREDICATE_P;
  private static final SubLObject $const124$DenotesArgInRelnPredicate;
  private static final SubLList $list125;
  private static final SubLList $list126;
  private static final SubLSymbol $sym127$_MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED_CACHING_STATE_;
  private static final SubLSymbol $sym128$CLEAR_MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED;
  private static final SubLList $list129;
  private static final SubLList $list130;
  private static final SubLSymbol $sym131$ISA_VAR;
  private static final SubLSymbol $sym132$META_ISA;
  private static final SubLList $list133;
  private static final SubLList $list134;
  private static final SubLSymbol $sym135$MAKE_FET_GLOSS_FOR_META_ISA;
  private static final SubLSymbol $sym136$_MAKE_FET_GLOSS_FOR_META_ISA_CACHING_STATE_;
  private static final SubLSymbol $sym137$ARG_POSITION_P;
  private static final SubLObject $const138$nonPlural_Generic;
  private static final SubLList $list139;
  private static final SubLObject $const140$formulaTemplateTypeHasTopicType;
  private static final SubLObject $const141$UniversalVocabularyMt;
  private static final SubLList $list142;
  private static final SubLObject $const143$formulaForFormulaTemplate;
  private static final SubLObject $const144$assertMtForFormulaTemplate;
  private static final SubLObject $const145$focalTermPositionForFormulaTempla;
  private static final SubLObject $const146$assertionFormatForFormulaTemplate;
  private static final SubLObject $const147$formulaTemplateArgExplanation;
  private static final SubLObject $const148$glossForFormulaTemplate;
  private static final SubLObject $const149$candidateReplacementForPosition;
  private static final SubLObject $const150$validationRequiredOnTemplatePosit;
  private static final SubLObject $const151$templateReplacementsInvisibleForP;
  private static final SubLObject $const152$formulaTemplateExample;
  private static final SubLObject $const153$higherPriorityTemplateForType;
  private static final SubLSymbol $sym154$CONSTANT_P;
  private static final SubLObject $const155$TKBTemplate_Attack;
  private static final SubLList $list156;
  private static final SubLList $list157;
  private static final SubLSymbol $sym158$REST;
  private static final SubLSymbol $sym159$CONSTRAINT_COL_FOR_CONSTRAINT_TERM;
  private static final SubLList $list160;
  private static final SubLInteger $int161$350;
  private static final SubLSymbol $sym162$ARG_POSITION_CANDIDATES_MEMOIZED;
  private static final SubLSymbol $sym163$_;
  private static final SubLSymbol $sym164$NUM_INDEX;
  private static final SubLObject $const165$IndexicalConcept;
  private static final SubLObject $const166$SomeExampleSpecFn;
  private static final SubLObject $const167$SpecsFn;
  private static final SubLString $str168$__Couldn_t_find__S___in_denots_of;
  private static final SubLList $list169;
  private static final SubLSymbol $kw170$OK;
  private static final SubLList $list171;
  private static final SubLString $str172$_;
  private static final SubLString $str173$_xml;
  private static final SubLString $str174$Generating__S_seen_from__S_into__;
  private static final SubLSymbol $kw175$OUTPUT;
  private static final SubLString $str176$Unable_to_open__S;
  private static final SubLString $str177$_done__;
  private static final SubLInteger $int178$100;
  private static final SubLList $list179;
  private static final SubLSymbol $sym180$ISA;
  private static final SubLSymbol $sym181$WITH_ALL_MTS;
  private static final SubLSymbol $sym182$DO_ALL_ISA;
  private static final SubLSymbol $sym183$CDOLIST;
  private static final SubLSymbol $sym184$PRED_VALUES;
  private static final SubLList $list185;
  private static final SubLString $str186$mapping_Cyc_FORTs;
  private static final SubLSymbol $kw187$SKIP;
  private static final SubLObject $const188$InducedFormulaTemplateTopicType;
  private static final SubLObject $const189$keInducedStrongSuggestionPreds;
  private static final SubLObject $const190$keInducedWeakSuggestionPreds;
  private static final SubLObject $const191$keInducedSuggestionPreds;
  private static final SubLInteger $int192$1000;
  private static final SubLString $str193$__Total___S_Have_topic___S___4F__;
  private static final SubLString $str194$__Hand___S___4F___Induced___S___4;

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 866L)
  public static SubLObject get_all_formula_template_topics()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject topics_found = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      SubLObject cdolist_list_var = isa.all_fort_instances( $const2$FormulaTemplateTopicType, UNPROVIDED, UNPROVIDED );
      SubLObject topic_type = NIL;
      topic_type = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cdolist_list_var_$1;
        final SubLObject specs = cdolist_list_var_$1 = genls.all_specs( topic_type, UNPROVIDED, UNPROVIDED );
        SubLObject spec = NIL;
        spec = cdolist_list_var_$1.first();
        while ( NIL != cdolist_list_var_$1)
        {
          dictionary.dictionary_enter( topics_found, spec, spec );
          cdolist_list_var_$1 = cdolist_list_var_$1.rest();
          spec = cdolist_list_var_$1.first();
        }
        cdolist_list_var = cdolist_list_var.rest();
        topic_type = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    final SubLObject topics = dictionary.dictionary_keys( topics_found );
    return Sort.sort( topics, Symbols.symbol_function( $sym3$STRING_ ), $sym4$FORT_NAME );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 1294L)
  public static SubLObject formula_template_topic_typeP(final SubLObject v_object)
  {
    return isa.isa_in_any_mtP( v_object, $const2$FormulaTemplateTopicType );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 1408L)
  public static SubLObject get_all_formula_template_subtopics()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject topics = get_all_formula_template_topics();
    SubLObject subtopics = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      SubLObject cdolist_list_var = topics;
      SubLObject topic = NIL;
      topic = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( NIL == formula_template_topic_typeP( topic ) )
        {
          subtopics = ConsesLow.cons( topic, subtopics );
        }
        cdolist_list_var = cdolist_list_var.rest();
        topic = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( subtopics );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 1706L)
  public static SubLObject get_all_template_topics()
  {
    return Sort.sort( isa.all_fort_instances( $const2$FormulaTemplateTopicType, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( $sym3$STRING_ ), Symbols.symbol_function( $sym4$FORT_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 1836L)
  public static SubLObject get_all_formula_template_definition_mts()
  {
    final SubLObject mts = isa.all_fort_instances( $const5$FormulaTemplateMicrotheory_FET, UNPROVIDED, UNPROVIDED );
    SubLObject scanned_mts = NIL;
    SubLObject cdolist_list_var = mts;
    SubLObject mt = NIL;
    mt = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != narts_high.naut_p( mt ) )
      {
        mt = narts_high.find_nart( mt );
      }
      if( NIL != forts.fort_p( mt ) )
      {
        scanned_mts = ConsesLow.cons( mt, scanned_mts );
      }
      cdolist_list_var = cdolist_list_var.rest();
      mt = cdolist_list_var.first();
    }
    return Sort.sort( scanned_mts, Symbols.symbol_function( $sym3$STRING_ ), Symbols.symbol_function( $sym4$FORT_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 2180L)
  public static SubLObject get_all_formula_templated_types()
  {
    return get_applicable_formula_templated_types( $const1$EverythingPSC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 2298L)
  public static SubLObject get_applicable_formula_templated_types(final SubLObject mt)
  {
    final SubLObject types = ask_utilities.ask_variable( $kw6$TYPE, $list7, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject scanned_types = NIL;
    SubLObject cdolist_list_var = types;
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != narts_high.naut_p( type ) )
      {
        type = narts_high.find_nart( type );
      }
      if( NIL != forts.fort_p( type ) )
      {
        scanned_types = ConsesLow.cons( type, scanned_types );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return Sort.sort( scanned_types, Symbols.symbol_function( $sym3$STRING_ ), Symbols.symbol_function( $sym4$FORT_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 2734L)
  public static SubLObject get_all_formula_template_definition_tuples()
  {
    return get_applicable_formula_template_definition_tuples( $const1$EverythingPSC );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 2874L)
  public static SubLObject get_applicable_formula_template_definition_tuples(final SubLObject mt)
  {
    final SubLObject binding_lists = rkf_query_utilities.rkf_ask( $list8, mt, ZERO_INTEGER, NIL, UNPROVIDED, UNPROVIDED );
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var = binding_lists;
    SubLObject binding_list = NIL;
    binding_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding_list;
      SubLObject v_bindings = NIL;
      SubLObject assertions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      assertions = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject term_type = conses_high.assoc( $sym10$_TERM, v_bindings, UNPROVIDED, UNPROVIDED ).rest();
        final SubLObject topic_type = conses_high.assoc( $sym11$_TOPIC, v_bindings, UNPROVIDED, UNPROVIDED ).rest();
        final SubLObject assertion = assertions.first();
        final SubLObject elmt = assertions_high.assertion_mt( assertion );
        tuples = ConsesLow.cons( ConsesLow.list( term_type, topic_type, elmt ), tuples );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_list = cdolist_list_var.first();
    }
    return Sort.sort( tuples, Symbols.symbol_function( $sym3$STRING_ ), Symbols.symbol_function( $sym12$FORMULA_TEMPLATE_DEFTUPLE_ORDER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 3544L)
  public static SubLObject get_applicable_formula_template_collection_tuples(final SubLObject mt)
  {
    final SubLObject binding_lists = rkf_query_utilities.rkf_ask( $list13, mt, ZERO_INTEGER, NIL, UNPROVIDED, UNPROVIDED );
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var = binding_lists;
    SubLObject binding_list = NIL;
    binding_list = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = binding_list;
      SubLObject v_bindings = NIL;
      SubLObject assertions = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      v_bindings = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list9 );
      assertions = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject term_type = conses_high.assoc( $sym14$_COL, v_bindings, UNPROVIDED, UNPROVIDED ).rest();
        final SubLObject topic_type = conses_high.assoc( $sym11$_TOPIC, v_bindings, UNPROVIDED, UNPROVIDED ).rest();
        final SubLObject assertion = assertions.first();
        final SubLObject elmt = assertions_high.assertion_mt( assertion );
        tuples = ConsesLow.cons( ConsesLow.list( term_type, topic_type, elmt ), tuples );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list9 );
      }
      cdolist_list_var = cdolist_list_var.rest();
      binding_list = cdolist_list_var.first();
    }
    return Sort.sort( tuples, Symbols.symbol_function( $sym3$STRING_ ), Symbols.symbol_function( $sym12$FORMULA_TEMPLATE_DEFTUPLE_ORDER ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 4202L)
  public static SubLObject formula_template_deftuple_order(final SubLObject element)
  {
    return kb_paths.fort_name( conses_high.second( element ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 4299L)
  public static SubLObject get_template_topic_loading_elmt(final SubLObject template_topic)
  {
    final SubLObject template_tupples = get_all_formula_template_definition_tuples();
    final SubLObject template_mt = conses_high.third( Sequences.find( template_topic, template_tupples, Symbols.symbol_function( EQ ), Symbols.symbol_function( $sym15$SECOND ), UNPROVIDED, UNPROVIDED ) );
    return template_mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 4547L)
  public static SubLObject applicable_template_topics_for_collection(final SubLObject coll, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const16$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject results = NIL;
    if( NIL != fort_types_interface.isa_collectionP( coll, UNPROVIDED ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject v_properties = ConsesLow.list( $kw17$ANSWER_LANGUAGE, $kw18$HL, $kw19$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw20$NONE );
        final SubLObject problem_store_properties = inference_datastructures_enumerated_types.extract_problem_store_static_properties( v_properties );
        SubLObject problem_store = NIL;
        try
        {
          problem_store = inference_datastructures_problem_store.new_problem_store( problem_store_properties );
          final SubLObject query_properties = conses_high.putf( v_properties, $kw21$PROBLEM_STORE, problem_store );
          final SubLObject instance_topic_tuples = applicable_template_instance_topics_for_collection( coll, mt, query_properties );
          final SubLObject spec_topic_tuples = applicable_template_spec_topics_for_collection( coll, mt, query_properties );
          results = ConsesLow.append( instance_topic_tuples, spec_topic_tuples );
        }
        finally
        {
          final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            inference_datastructures_problem_store.destroy_problem_store( problem_store );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
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
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 5578L)
  public static SubLObject applicable_template_instance_topics_for_collection(final SubLObject coll, final SubLObject mt, final SubLObject query_properties)
  {
    return applicable_template_instance_topics_for_collection_via_index_surfing( coll, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 5779L)
  public static SubLObject applicable_template_instance_topics_for_collection_via_inference(final SubLObject coll, final SubLObject mt, final SubLObject query_properties)
  {
    final SubLObject template = $list22;
    final SubLObject query_sentence = ConsesLow.listS( $const23$and, ConsesLow.listS( $const24$relationAllInstance, $const25$meetsSomeConstraintOfTopicType, coll, $list26 ), $list27 );
    return ask_utilities.query_template( template, query_sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 6175L)
  public static SubLObject applicable_template_instance_topics_for_collection_tva_workaround(final SubLObject coll, final SubLObject mt, final SubLObject query_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject template = $list22;
    SubLObject tuples = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject node_var = coll;
      final SubLObject deck_type = $kw30$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$3 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw32$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw35$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw37$WARN ) )
              {
                Errors.warn( $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const39$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const39$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const39$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const39$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( coll, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$7 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const39$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject genl = node_var;
                    final SubLObject query_sentence = ConsesLow.listS( $const23$and, ConsesLow.list( $const40$assertedSentence, ConsesLow.listS( $const24$relationAllInstance, $const25$meetsSomeConstraintOfTopicType,
                        genl, $list26 ) ), $list27 );
                    SubLObject cdolist_list_var = ask_utilities.query_template( template, query_sentence, mt, query_properties );
                    SubLObject tuple = NIL;
                    tuple = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      tuples = ConsesLow.cons( tuple, tuples );
                      cdolist_list_var = cdolist_list_var.rest();
                      tuple = cdolist_list_var.first();
                    }
                    SubLObject cdolist_list_var2;
                    final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const39$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var2.first();
                    while ( NIL != cdolist_list_var2)
                    {
                      final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
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
                                final SubLObject mt_$14 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$14 ) )
                                {
                                  final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$14, thread );
                                    SubLObject iteration_state_$16;
                                    for( iteration_state_$16 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$16 ); iteration_state_$16 = dictionary_contents.do_dictionary_contents_next( iteration_state_$16 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$16 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                                deck.deck_push( node_vars_link_node, recur_deck );
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
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$9, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$16 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$8, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$18;
                          final SubLObject new_list = cdolist_list_var_$18 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$18.first();
                          while ( NIL != cdolist_list_var_$18)
                          {
                            final SubLObject _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    deck.deck_push( node_vars_link_node3, recur_deck );
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
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$10, thread );
                            }
                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                            generating_fn = cdolist_list_var_$18.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$8, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$7, thread );
                      }
                      cdolist_list_var2 = cdolist_list_var2.rest();
                      module_var = cdolist_list_var2.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$9, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$7, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$6, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, coll, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$8, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$6, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$5, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$5, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$4, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$3, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 6810L)
  public static SubLObject applicable_template_instance_topics_for_collection_via_index_surfing(final SubLObject coll, final SubLObject mt, final SubLObject query_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tuples = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      SubLObject node_var = coll;
      final SubLObject deck_type = $kw30$STACK;
      final SubLObject recur_deck = deck.create_deck( deck_type );
      final SubLObject _prev_bind_0_$21 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
      try
      {
        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
        try
        {
          final SubLObject tv_var = NIL;
          final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
          final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
          try
          {
            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
            {
              final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
              if( pcase_var.eql( $kw32$ERROR ) )
              {
                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw35$CERROR ) )
              {
                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
              }
              else if( pcase_var.eql( $kw37$WARN ) )
              {
                Errors.warn( $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
              }
              else
              {
                Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
              }
            }
            final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
            final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
            final SubLObject _prev_bind_2_$26 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const39$genls ), thread );
              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const39$genls ) ), thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const39$genls ) ), thread );
              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const39$genls ), thread );
              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( coll, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
              {
                final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                final SubLObject _prev_bind_1_$25 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                final SubLObject _prev_bind_2_$27 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                try
                {
                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(
                      $const39$genls ) ), thread );
                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                  sbhl_marking_utilities.sbhl_mark_node_marked( node_var, UNPROVIDED );
                  while ( NIL != node_var)
                  {
                    final SubLObject genl = node_var;
                    final SubLObject pred_var = $const24$relationAllInstance;
                    if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( genl, TWO_INTEGER, pred_var ) )
                    {
                      final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( genl, TWO_INTEGER, pred_var );
                      SubLObject done_var = NIL;
                      final SubLObject token_var = NIL;
                      while ( NIL == done_var)
                      {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                        final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                        if( NIL != valid )
                        {
                          SubLObject final_index_iterator = NIL;
                          try
                          {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw44$GAF, NIL, NIL );
                            SubLObject done_var_$30 = NIL;
                            final SubLObject token_var_$31 = NIL;
                            while ( NIL == done_var_$30)
                            {
                              final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$31 );
                              final SubLObject valid_$32 = makeBoolean( !token_var_$31.eql( gaf ) );
                              if( NIL != valid_$32 && assertions_high.gaf_arg1( gaf ).eql( $const25$meetsSomeConstraintOfTopicType ) )
                              {
                                final SubLObject topic = assertions_high.gaf_arg3( gaf );
                                final SubLObject mt_$33 = assertions_high.assertion_mt( gaf );
                                final SubLObject item_var;
                                final SubLObject tuple = item_var = ConsesLow.list( topic, mt_$33, $const45$isa );
                                if( NIL == conses_high.member( item_var, tuples, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
                                {
                                  tuples = ConsesLow.cons( item_var, tuples );
                                }
                              }
                              done_var_$30 = makeBoolean( NIL == valid_$32 );
                            }
                          }
                          finally
                          {
                            final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                            try
                            {
                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                              final SubLObject _values = Values.getValuesAsVector();
                              if( NIL != final_index_iterator )
                              {
                                kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                              }
                              Values.restoreValuesFromVector( _values );
                            }
                            finally
                            {
                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
                            }
                          }
                        }
                        done_var = makeBoolean( NIL == valid );
                      }
                    }
                    SubLObject cdolist_list_var;
                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const39$genls ) );
                    SubLObject module_var = NIL;
                    module_var = cdolist_list_var.first();
                    while ( NIL != cdolist_list_var)
                    {
                      final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        final SubLObject node = function_terms.naut_to_nart( node_var );
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
                                final SubLObject mt_$34 = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt_$34 ) )
                                {
                                  final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt_$34, thread );
                                    SubLObject iteration_state_$39;
                                    for( iteration_state_$39 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                        iteration_state_$39 ); iteration_state_$39 = dictionary_contents.do_dictionary_contents_next( iteration_state_$39 ) )
                                    {
                                      thread.resetMultipleValues();
                                      final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$39 );
                                      final SubLObject link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
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
                                                deck.deck_push( node_vars_link_node, recur_deck );
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
                                                deck.deck_push( node_vars_link_node2, recur_deck );
                                              }
                                              csome_list_var = csome_list_var.rest();
                                              node_vars_link_node2 = csome_list_var.first();
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$28, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$39 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$27, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          SubLObject cdolist_list_var_$41;
                          final SubLObject new_list = cdolist_list_var_$41 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                              .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                  UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          SubLObject generating_fn = NIL;
                          generating_fn = cdolist_list_var_$41.first();
                          while ( NIL != cdolist_list_var_$41)
                          {
                            final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
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
                                    deck.deck_push( node_vars_link_node3, recur_deck );
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
                                    deck.deck_push( node_vars_link_node4, recur_deck );
                                  }
                                  csome_list_var2 = csome_list_var2.rest();
                                  node_vars_link_node4 = csome_list_var2.first();
                                }
                              }
                              else
                              {
                                Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$29, thread );
                            }
                            cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                            generating_fn = cdolist_list_var_$41.first();
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$26, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$26, thread );
                      }
                      cdolist_list_var = cdolist_list_var.rest();
                      module_var = cdolist_list_var.first();
                    }
                    node_var = deck.deck_pop( recur_deck );
                  }
                }
                finally
                {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$27, thread );
                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$25, thread );
                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$24, thread );
                }
              }
              else
              {
                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, coll, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED, UNPROVIDED,
                    UNPROVIDED );
              }
            }
            finally
            {
              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$26, thread );
              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$24, thread );
              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$23, thread );
            }
          }
          finally
          {
            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$23, thread );
            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$22, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
          }
        }
      }
      finally
      {
        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$21, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return tuples;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 7435L)
  public static SubLObject applicable_template_spec_topics_for_collection(final SubLObject coll, final SubLObject mt, final SubLObject query_properties)
  {
    final SubLObject template = $list22;
    final SubLObject query_sentence = ConsesLow.listS( $const23$and, ConsesLow.listS( $const46$meetsSomeGenlsConstraintOfTopicTy, coll, $list26 ), $list47 );
    return ask_utilities.query_template( template, query_sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 7794L)
  public static SubLObject applicable_template_topics_for_term(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const16$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject timeP = NIL;
    SubLObject time = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    SubLObject problem_store = NIL;
    try
    {
      problem_store = inference_datastructures_problem_store.new_problem_store( NIL );
      final SubLObject v_properties = ConsesLow.list( $kw21$PROBLEM_STORE, problem_store );
      final SubLObject candidate_topic_tuples = candidate_topic_tuples_for_term( v_term, mt, v_properties );
      thread.resetMultipleValues();
      final SubLObject filtered_topics = filter_topic_tuples_for_term( v_term, mt, candidate_topic_tuples, v_properties );
      final SubLObject mt_dictionary = thread.secondMultipleValue();
      thread.resetMultipleValues();
      SubLObject cdolist_list_var = filtered_topics;
      SubLObject topic = NIL;
      topic = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        result = ConsesLow.cons( ConsesLow.list( topic, dictionary.dictionary_lookup( mt_dictionary, topic, UNPROVIDED ) ), result );
        cdolist_list_var = cdolist_list_var.rest();
        topic = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        inference_datastructures_problem_store.destroy_problem_store( problem_store );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    if( NIL != timeP && time.numG( $float49$0_1 ) )
    {
      Errors.warn( $str50$Took__S_seconds_to_determine_indu, time, v_term );
    }
    return Sequences.delete_duplicates( result, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 8824L)
  public static SubLObject term_has_induced_fet_topicP(final SubLObject v_term)
  {
    final SubLObject topic_type = make_induced_topic_type_for_term( v_term );
    if( NIL != nart_handles.nart_p( topic_type ) )
    {
      return list_utilities.sublisp_boolean( find_valid_fet_topic( topic_type, $const16$InferencePSC ) );
    }
    return term_has_induced_fet_topicP_via_index_surfing( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 9104L)
  public static SubLObject term_has_induced_fet_topicP_via_index_surfing(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      if( NIL == ans )
      {
        final SubLObject deck_type = $kw29$QUEUE;
        final SubLObject recur_deck = deck.create_deck( deck_type );
        final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
        try
        {
          sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
          try
          {
            final SubLObject tv_var = $const52$True_JustificationTruth;
            final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
            final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
            try
            {
              sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
              sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
              if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
              {
                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                if( pcase_var.eql( $kw32$ERROR ) )
                {
                  sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw35$CERROR ) )
                {
                  sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
                else if( pcase_var.eql( $kw37$WARN ) )
                {
                  Errors.warn( $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
                }
                else
                {
                  Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                  Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
                }
              }
              final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
              final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
              final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
              final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
              final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
              try
              {
                sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( v_term, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                {
                  final SubLObject _prev_bind_0_$47 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$48 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                  final SubLObject _prev_bind_2_$51 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$isa ) );
                    SubLObject rest;
                    SubLObject module_var;
                    SubLObject _prev_bind_0_$48;
                    SubLObject _prev_bind_1_$49;
                    SubLObject node;
                    SubLObject d_link;
                    SubLObject mt_links;
                    SubLObject iteration_state;
                    SubLObject mt;
                    SubLObject tv_links;
                    SubLObject _prev_bind_0_$49;
                    SubLObject iteration_state_$55;
                    SubLObject tv;
                    SubLObject link_nodes;
                    SubLObject _prev_bind_0_$50;
                    SubLObject sol;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject node_vars_link_node;
                    SubLObject csome_list_var;
                    SubLObject node_vars_link_node2;
                    SubLObject new_list;
                    SubLObject rest_$57;
                    SubLObject generating_fn;
                    SubLObject _prev_bind_0_$51;
                    SubLObject sol2;
                    SubLObject link_nodes2;
                    SubLObject set_contents_var2;
                    SubLObject basis_object2;
                    SubLObject state2;
                    SubLObject node_vars_link_node3;
                    SubLObject csome_list_var2;
                    SubLObject node_vars_link_node4;
                    for( rest = NIL, rest = accessible_modules; NIL == ans && NIL != rest; rest = rest.rest() )
                    {
                      module_var = rest.first();
                      _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                      _prev_bind_1_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                      try
                      {
                        sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                        sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                            .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                        node = function_terms.naut_to_nart( v_term );
                        if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                        {
                          d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                          if( NIL != d_link )
                          {
                            mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                            if( NIL != mt_links )
                            {
                              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == ans && NIL == dictionary_contents.do_dictionary_contents_doneP(
                                  iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                              {
                                thread.resetMultipleValues();
                                mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                {
                                  _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                    for( iteration_state_$55 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == ans && NIL == dictionary_contents
                                        .do_dictionary_contents_doneP( iteration_state_$55 ); iteration_state_$55 = dictionary_contents.do_dictionary_contents_next( iteration_state_$55 ) )
                                    {
                                      thread.resetMultipleValues();
                                      tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$55 );
                                      link_nodes = thread.secondMultipleValue();
                                      thread.resetMultipleValues();
                                      if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                      {
                                        _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                          sol = link_nodes;
                                          if( NIL != set.set_p( sol ) )
                                          {
                                            set_contents_var = set.do_set_internal( sol );
                                            for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                set_contents_var ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                            {
                                              node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                              if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node,
                                                  UNPROVIDED ) )
                                              {
                                                sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                deck.deck_push( node_vars_link_node, recur_deck );
                                              }
                                            }
                                          }
                                          else if( sol.isList() )
                                          {
                                            if( NIL == ans )
                                            {
                                              csome_list_var = sol;
                                              node_vars_link_node2 = NIL;
                                              node_vars_link_node2 = csome_list_var.first();
                                              while ( NIL == ans && NIL != csome_list_var)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node2, recur_deck );
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                node_vars_link_node2 = csome_list_var.first();
                                              }
                                            }
                                          }
                                          else
                                          {
                                            Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol );
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$50, thread );
                                        }
                                      }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize( iteration_state_$55 );
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$49, thread );
                                  }
                                }
                              }
                              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                            }
                          }
                          else
                          {
                            sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                          }
                        }
                        else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                        {
                          new_list = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                              .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                  .get_sbhl_module( UNPROVIDED ) ) );
                          for( rest_$57 = NIL, rest_$57 = new_list; NIL == ans && NIL != rest_$57; rest_$57 = rest_$57.rest() )
                          {
                            generating_fn = rest_$57.first();
                            _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                            try
                            {
                              sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                              link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                              if( NIL != set.set_p( sol2 ) )
                              {
                                set_contents_var2 = set.do_set_internal( sol2 );
                                for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                    set_contents_var2 ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                {
                                  node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                  if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                      UNPROVIDED ) )
                                  {
                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                    deck.deck_push( node_vars_link_node3, recur_deck );
                                  }
                                }
                              }
                              else if( sol2.isList() )
                              {
                                if( NIL == ans )
                                {
                                  csome_list_var2 = sol2;
                                  node_vars_link_node4 = NIL;
                                  node_vars_link_node4 = csome_list_var2.first();
                                  while ( NIL == ans && NIL != csome_list_var2)
                                  {
                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                    {
                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                      deck.deck_push( node_vars_link_node4, recur_deck );
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    node_vars_link_node4 = csome_list_var2.first();
                                  }
                                }
                              }
                              else
                              {
                                Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                              }
                            }
                            finally
                            {
                              sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$51, thread );
                            }
                          }
                        }
                      }
                      finally
                      {
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$49, thread );
                        sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$48, thread );
                      }
                    }
                    SubLObject node_var = deck.deck_pop( recur_deck );
                    final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$52 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                    try
                    {
                      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_search_vars.get_sbhl_search_module() ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                      while ( NIL != node_var && NIL == ans)
                      {
                        final SubLObject v_isa = node_var;
                        ans = collection_has_induced_fet_topicP( v_isa );
                        final SubLObject accessible_modules2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                        SubLObject rest2;
                        SubLObject module_var2;
                        SubLObject _prev_bind_0_$53;
                        SubLObject _prev_bind_1_$51;
                        SubLObject node2;
                        SubLObject d_link2;
                        SubLObject mt_links2;
                        SubLObject iteration_state2;
                        SubLObject mt2;
                        SubLObject tv_links2;
                        SubLObject _prev_bind_0_$54;
                        SubLObject iteration_state_$56;
                        SubLObject tv2;
                        SubLObject link_nodes3;
                        SubLObject _prev_bind_0_$55;
                        SubLObject sol3;
                        SubLObject set_contents_var3;
                        SubLObject basis_object3;
                        SubLObject state3;
                        SubLObject node_vars_link_node5;
                        SubLObject csome_list_var3;
                        SubLObject node_vars_link_node6;
                        SubLObject new_list2;
                        SubLObject rest_$58;
                        SubLObject generating_fn2;
                        SubLObject _prev_bind_0_$56;
                        SubLObject sol4;
                        SubLObject link_nodes4;
                        SubLObject set_contents_var4;
                        SubLObject basis_object4;
                        SubLObject state4;
                        SubLObject csome_list_var4;
                        SubLObject node_vars_link_node7;
                        for( rest2 = NIL, rest2 = accessible_modules2; NIL == ans && NIL != rest2; rest2 = rest2.rest() )
                        {
                          module_var2 = rest2.first();
                          _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                          _prev_bind_1_$51 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                          try
                          {
                            sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                            sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                            node2 = function_terms.naut_to_nart( node_var );
                            if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                            {
                              d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                              if( NIL != d_link2 )
                              {
                                mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                if( NIL != mt_links2 )
                                {
                                  for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == ans && NIL == dictionary_contents
                                      .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                  {
                                    thread.resetMultipleValues();
                                    mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                    tv_links2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                    {
                                      _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                      try
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                        for( iteration_state_$56 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == ans && NIL == dictionary_contents
                                            .do_dictionary_contents_doneP( iteration_state_$56 ); iteration_state_$56 = dictionary_contents.do_dictionary_contents_next( iteration_state_$56 ) )
                                        {
                                          thread.resetMultipleValues();
                                          tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$56 );
                                          link_nodes3 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                          {
                                            _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                            try
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                              sol3 = link_nodes3;
                                              if( NIL != set.set_p( sol3 ) )
                                              {
                                                set_contents_var3 = set.do_set_internal( sol3 );
                                                for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state( basis_object3,
                                                    set_contents_var3 ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents.do_set_contents_update_state( state3 ) )
                                                {
                                                  node_vars_link_node5 = set_contents.do_set_contents_next( basis_object3, state3 );
                                                  if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node5 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                      node_vars_link_node5, UNPROVIDED ) )
                                                  {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node5, UNPROVIDED );
                                                    deck.deck_push( node_vars_link_node5, recur_deck );
                                                  }
                                                }
                                              }
                                              else if( sol3.isList() )
                                              {
                                                if( NIL == ans )
                                                {
                                                  csome_list_var3 = sol3;
                                                  node_vars_link_node6 = NIL;
                                                  node_vars_link_node6 = csome_list_var3.first();
                                                  while ( NIL == ans && NIL != csome_list_var3)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node6, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node6, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node6, recur_deck );
                                                    }
                                                    csome_list_var3 = csome_list_var3.rest();
                                                    node_vars_link_node6 = csome_list_var3.first();
                                                  }
                                                }
                                              }
                                              else
                                              {
                                                Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                              }
                                            }
                                            finally
                                            {
                                              sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$55, thread );
                                            }
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize( iteration_state_$56 );
                                      }
                                      finally
                                      {
                                        sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$54, thread );
                                      }
                                    }
                                  }
                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                            {
                              new_list2 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars
                                  .get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                      .get_sbhl_module( UNPROVIDED ) ) );
                              for( rest_$58 = NIL, rest_$58 = new_list2; NIL == ans && NIL != rest_$58; rest_$58 = rest_$58.rest() )
                              {
                                generating_fn2 = rest_$58.first();
                                _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                try
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                  link_nodes4 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                  if( NIL != set.set_p( sol4 ) )
                                  {
                                    set_contents_var4 = set.do_set_internal( sol4 );
                                    for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                        set_contents_var4 ); NIL == ans && NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                    {
                                      node_vars_link_node2 = set_contents.do_set_contents_next( basis_object4, state4 );
                                      if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node2 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2,
                                          UNPROVIDED ) )
                                      {
                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                        deck.deck_push( node_vars_link_node2, recur_deck );
                                      }
                                    }
                                  }
                                  else if( sol4.isList() )
                                  {
                                    if( NIL == ans )
                                    {
                                      csome_list_var4 = sol4;
                                      node_vars_link_node7 = NIL;
                                      node_vars_link_node7 = csome_list_var4.first();
                                      while ( NIL == ans && NIL != csome_list_var4)
                                      {
                                        if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node7, UNPROVIDED ) )
                                        {
                                          sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node7, UNPROVIDED );
                                          deck.deck_push( node_vars_link_node7, recur_deck );
                                        }
                                        csome_list_var4 = csome_list_var4.rest();
                                        node_vars_link_node7 = csome_list_var4.first();
                                      }
                                    }
                                  }
                                  else
                                  {
                                    Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                  }
                                }
                                finally
                                {
                                  sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$56, thread );
                                }
                              }
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$51, thread );
                            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$53, thread );
                          }
                        }
                        node_var = deck.deck_pop( recur_deck );
                      }
                    }
                    finally
                    {
                      sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$52, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$50, thread );
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$52, thread );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$51, thread );
                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$48, thread );
                    sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$47, thread );
                  }
                }
                else
                {
                  sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, v_term, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), UNPROVIDED,
                      UNPROVIDED, UNPROVIDED );
                }
              }
              finally
              {
                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_3, thread );
                sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$47, thread );
                sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$46, thread );
              }
            }
            finally
            {
              sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$46, thread );
              sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$45, thread );
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
          sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$44, thread );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 9346L)
  public static SubLObject collection_has_induced_fet_topicP(final SubLObject collection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      final SubLObject pred_var = $const24$relationAllInstance;
      if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( collection, TWO_INTEGER, pred_var ) )
      {
        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( collection, TWO_INTEGER, pred_var );
        SubLObject done_var = ans;
        final SubLObject token_var = NIL;
        while ( NIL == done_var)
        {
          final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
          final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
          if( NIL != valid )
          {
            SubLObject final_index_iterator = NIL;
            try
            {
              final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw44$GAF, NIL, NIL );
              SubLObject done_var_$70 = ans;
              final SubLObject token_var_$71 = NIL;
              while ( NIL == done_var_$70)
              {
                final SubLObject rai_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$71 );
                final SubLObject valid_$72 = makeBoolean( !token_var_$71.eql( rai_gaf ) );
                if( NIL != valid_$72 && assertions_high.gaf_arg1( rai_gaf ).eql( $const25$meetsSomeConstraintOfTopicType ) )
                {
                  final SubLObject topic = assertions_high.gaf_arg3( rai_gaf );
                  if( NIL != nart_handles.nart_p( topic ) && cycl_utilities.nat_functor( topic ).eql( $const53$FormulaTemplateInductionTopicType ) && ( NIL != kb_mapping_utilities.some_pred_value( topic,
                      $const54$formulaTemplateHasType, TWO_INTEGER, UNPROVIDED ) || NIL != kb_mapping_utilities.some_pred_value( topic, $const45$isa, TWO_INTEGER, UNPROVIDED ) ) )
                  {
                    ans = T;
                  }
                }
                done_var_$70 = makeBoolean( NIL == valid_$72 || NIL != ans );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$73 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( NIL != final_index_iterator )
                {
                  kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$73, thread );
              }
            }
          }
          done_var = makeBoolean( NIL == valid || NIL != ans );
        }
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 9962L)
  public static SubLObject term_has_induced_fet_topicP_via_inference(final SubLObject v_term)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assume_templates_reifiedP = $assume_induced_fet_templates_already_reifiedP$.getDynamicValue( thread );
    SubLObject conjuncts = reader.bq_cons( ConsesLow.listS( $const25$meetsSomeConstraintOfTopicType, v_term, $list26 ), $list55 );
    if( NIL != assume_templates_reifiedP )
    {
      conjuncts = ConsesLow.cons( el_utilities.make_existential( $sym56$_TEMPLATE, $list57 ), conjuncts );
    }
    final SubLObject conjunction = el_utilities.make_conjunction( conjuncts );
    final SubLObject existential = el_utilities.make_existential( $sym58$_TOPIC_TYPE, el_utilities.make_existential( $sym11$_TOPIC, conjunction ) );
    final SubLObject v_properties = $list59;
    return cyc_kernel.closed_query_success_result_p( inference_kernel.new_cyc_query( existential, $const16$InferencePSC, v_properties ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 10830L)
  public static SubLObject candidate_topic_tuples_for_term(final SubLObject v_term, final SubLObject mt, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    query_properties = conses_high.putf( query_properties, $kw17$ANSWER_LANGUAGE, $kw18$HL );
    query_properties = conses_high.putf( query_properties, $kw19$INTERMEDIATE_STEP_VALIDATION_LEVEL, $kw20$NONE );
    final SubLObject template = $list60;
    final SubLObject query_sentence = ConsesLow.listS( $const23$and, ConsesLow.listS( $const25$meetsSomeConstraintOfTopicType, v_term, $list26 ), $list61 );
    return ask_utilities.query_template( template, query_sentence, mt, query_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 11434L)
  public static SubLObject filter_topic_tuples_for_term(final SubLObject v_term, final SubLObject mt, final SubLObject candidate_topic_tuples, SubLObject query_properties)
  {
    if( query_properties == UNPROVIDED )
    {
      query_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_dictionary = dictionary_utilities.add_tuple_list_to_dictionary( candidate_topic_tuples, UNPROVIDED );
    SubLObject filtered_topics = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject term_isas = isa.all_isa( v_term, UNPROVIDED, UNPROVIDED );
      final SubLObject term_genls = genls.all_genls( v_term, UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = candidate_topic_tuples;
      SubLObject candidate_topic_tuple = NIL;
      candidate_topic_tuple = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject topic = candidate_topic_tuple.first();
        final SubLObject isas_for_topic = ask_utilities.query_variable( $sym62$_WHAT, ConsesLow.list( $const63$templateTypeForFocalTermType, $sym62$_WHAT, topic ), mt, query_properties );
        final SubLObject genls_for_topic_tuple = ask_utilities.query_template( $list64, ConsesLow.list( $const65$ist_Asserted, $sym66$_WHERE, ConsesLow.listS( $const67$templateTopicGenls, topic, $list68 ) ), mt,
            query_properties );
        final SubLObject genls_for_topic = Mapping.mapcar( Symbols.symbol_function( $sym69$FIRST ), genls_for_topic_tuple );
        dictionary_utilities.add_tuple_list_to_dictionary( genls_for_topic_tuple, mt_dictionary );
        if( NIL != genls.all_genl_of_someP( term_isas, isas_for_topic, UNPROVIDED, UNPROVIDED ) && NIL == disjoint_with.any_disjoint_withP( isas_for_topic, term_isas, UNPROVIDED, UNPROVIDED ) && NIL != genls
            .all_genl_of_someP( term_genls, genls_for_topic, UNPROVIDED, UNPROVIDED ) && NIL == disjoint_with.any_disjoint_withP( genls_for_topic, term_genls, UNPROVIDED, UNPROVIDED ) && ( NIL == forts.fort_p( topic )
                || NIL != valid_fet_topic_fortP( topic, mt, T ) ) )
        {
          filtered_topics = ConsesLow.cons( topic, filtered_topics );
        }
        cdolist_list_var = cdolist_list_var.rest();
        candidate_topic_tuple = cdolist_list_var.first();
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( filtered_topics, mt_dictionary );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 12777L)
  public static SubLObject find_valid_fet_topic(SubLObject template_topic_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const16$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != narts_high.naut_p( template_topic_term ) )
    {
      final SubLObject nart = czer_main.cyc_find_or_create_nart( template_topic_term, UNPROVIDED );
      final SubLObject tou_gaf = czer_meta.find_assertion_cycl( ConsesLow.list( $const70$termOfUnit, template_topic_term, template_topic_term ), $const71$BaseKB );
      final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding( thread );
      try
      {
        api_control_vars.$the_cyclist$.bind( ( NIL != ke.cyclist_is_guest() ) ? $const72$Cyc : api_control_vars.$the_cyclist$.getDynamicValue( thread ), thread );
        ke.ke_repropagate_assertion_now( tou_gaf );
      }
      finally
      {
        api_control_vars.$the_cyclist$.rebind( _prev_bind_0, thread );
      }
      template_topic_term = nart;
    }
    thread.resetMultipleValues();
    final SubLObject validP = valid_fet_topic_fortP( template_topic_term, mt, UNPROVIDED );
    final SubLObject error_message = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( ( NIL != validP ) ? template_topic_term : NIL, error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 13547L)
  public static SubLObject valid_fet_topic_fortP(final SubLObject template_topic_term, SubLObject mt, SubLObject check_for_induced_templatesP)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const16$InferencePSC;
    }
    if( check_for_induced_templatesP == UNPROVIDED )
    {
      check_for_induced_templatesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = NIL;
    SubLObject error_message = $str73$;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == forts.fort_p( template_topic_term ) )
      {
        error_message = $str74$Can_t_use_a_non_FORT_for_an_FET_t;
      }
      else if( NIL == formula_templates.fet_topic_fort_has_subtopicsP( template_topic_term, mt ) )
      {
        error_message = $str75$No_subtopics_;
      }
      else if( ( NIL != check_for_induced_templatesP || NIL == induction_topic_typeP( template_topic_term ) ) && NIL == formula_templates.fet_topic_fort_has_templatesP( template_topic_term, mt ) )
      {
        error_message = $str76$No_templates_;
      }
      else
      {
        okP = T;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( okP, error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 14634L)
  public static SubLObject valid_fet_subtopic_fortP(final SubLObject template_subtopic_term, SubLObject mt, SubLObject check_for_induced_templatesP)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const16$InferencePSC;
    }
    if( check_for_induced_templatesP == UNPROVIDED )
    {
      check_for_induced_templatesP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject okP = NIL;
    SubLObject error_message = $str73$;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == forts.fort_p( template_subtopic_term ) )
      {
        error_message = $str77$Can_t_use_a_non_FORT_for_an_FET_s;
      }
      else if( ( NIL != check_for_induced_templatesP || NIL == induction_topic_typeP( template_subtopic_term ) ) && NIL == formula_templates.fet_topic_fort_has_templatesP( template_subtopic_term, mt ) )
      {
        error_message = $str76$No_templates_;
      }
      else
      {
        okP = T;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return Values.values( okP, error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 15636L)
  public static SubLObject salient_descriptor_fet_fn()
  {
    return constants_high.find_constant( $str78$SalientDescriptorFETFn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 15733L)
  public static SubLObject make_induced_topic_type_for_term(final SubLObject v_term)
  {
    return function_terms.naut_to_nart( el_utilities.make_unary_formula( salient_descriptor_fet_fn(), v_term ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 15870L)
  public static SubLObject induce_formula_template_subtopics_for_type(final SubLObject topic, final SubLObject elmt)
  {
    SubLObject cdolist_list_var = induced_formula_template_subtopics_for_type( topic, elmt );
    SubLObject subtopic = NIL;
    subtopic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert_formula_template_type_subtopic( topic, subtopic );
      cdolist_list_var = cdolist_list_var.rest();
      subtopic = cdolist_list_var.first();
    }
    return topic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 16165L)
  public static SubLObject induced_formula_template_subtopics_for_type(final SubLObject topic, final SubLObject elmt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject subtopics = NIL;
    if( NIL != induction_topic_typeP( topic ) && NIL != nart_handles.nart_p( topic ) && cycl_utilities.nat_functor( topic ).eql( salient_descriptor_fet_fn() ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( elmt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        final SubLObject focal_term = cycl_utilities.nat_arg1( topic, UNPROVIDED );
        final SubLObject term_isas = ConsesLow.append( isa.all_isa( focal_term, UNPROVIDED, UNPROVIDED ), Mapping.mapcar( $sym79$MAKE_SPECS_FN, genls.all_genls( focal_term, UNPROVIDED, UNPROVIDED ) ) );
        final SubLObject induceP = T;
        subtopics = promising_induction_topic_types( term_isas, elmt, induceP );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return subtopics;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 16754L)
  public static SubLObject promising_induction_topic_types(final SubLObject term_isas, final SubLObject mt, SubLObject induceP)
  {
    if( induceP == UNPROVIDED )
    {
      induceP = NIL;
    }
    SubLObject promising = NIL;
    SubLObject problem_store = NIL;
    try
    {
      problem_store = inference_datastructures_problem_store.new_problem_store( NIL );
      SubLObject cdolist_list_var = term_isas;
      SubLObject v_isa = NIL;
      v_isa = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject topic_type = induction_topic_type_for_collection( v_isa );
        if( NIL != forts.fort_p( topic_type ) )
        {
          if( NIL != valid_fet_subtopic_fortP( topic_type, mt, NIL ) )
          {
            promising = ConsesLow.cons( topic_type, promising );
          }
        }
        else if( NIL != induceP && NIL != promising_induction_topic_type_collectionP( v_isa, mt, problem_store, UNPROVIDED ) )
        {
          promising = ConsesLow.cons( topic_type, promising );
        }
        cdolist_list_var = cdolist_list_var.rest();
        v_isa = cdolist_list_var.first();
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        inference_datastructures_problem_store.destroy_problem_store( problem_store );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return promising;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 17281L)
  public static SubLObject promising_induction_collection_pred_for_type(final SubLObject type)
  {
    return ( type == $kw80$ISA ) ? $const81$promisingSalientDescriptorInducti : $const82$promisingSalientDescriptorInducti;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 30316L)
  public static SubLObject promising_induction_topic_type_collectionP(final SubLObject collection, final SubLObject mt, SubLObject problem_store, SubLObject type)
  {
    if( problem_store == UNPROVIDED )
    {
      problem_store = NIL;
    }
    if( type == UNPROVIDED )
    {
      type = $kw80$ISA;
    }
    final SubLObject promising_pred = constants_high.find_constant( $str83$promisingSalientDescriptorInducti );
    if( NIL != promising_pred )
    {
      final SubLObject today = date_utilities.indexical_today();
      final SubLObject days_ago_limit = $int84$90;
      final SubLObject prior_day = relation_evaluation.cyc_evaluate( ConsesLow.list( $const85$DateBeforeFn, today, ConsesLow.list( $const86$DaysDuration, days_ago_limit ) ) );
      SubLObject okP = NIL;
      if( NIL == okP )
      {
        SubLObject csome_list_var = promising_induction_assertions_for_collection( collection, mt, type );
        SubLObject gaf = NIL;
        gaf = csome_list_var.first();
        while ( NIL == okP && NIL != csome_list_var)
        {
          final SubLObject gaf_mt = assertions_high.assertion_mt( gaf );
          final SubLObject time_index = mt_time_index( gaf_mt );
          okP = makeBoolean( NIL == date_utilities.date_p( time_index ) || NIL != date_utilities.dateLE( prior_day, date_utilities.cycl_date_final_second( time_index ) ) );
          csome_list_var = csome_list_var.rest();
          gaf = csome_list_var.first();
        }
      }
      return okP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 31181L)
  public static SubLObject promising_induction_assertions_for_collection(final SubLObject collection, SubLObject mt, SubLObject type)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const16$InferencePSC;
    }
    if( type == UNPROVIDED )
    {
      type = $kw80$ISA;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject assertions = NIL;
    final SubLObject promising_pred = promising_induction_collection_pred_for_type( type );
    if( NIL != constant_handles.valid_constantP( promising_pred, UNPROVIDED ) )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        assertions = kb_mapping.gather_gaf_arg_index( collection, ONE_INTEGER, promising_pred, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    return assertions;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 31602L)
  public static SubLObject mt_time_index(final SubLObject mt)
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), hlmt.explode_hlmt_temporal_facets_with_defaults( mt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 31708L)
  public static SubLObject clear_promising_induction_topic_type_collectionP_verify()
  {
    final SubLObject cs = $promising_induction_topic_type_collectionP_verify_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 31708L)
  public static SubLObject remove_promising_induction_topic_type_collectionP_verify(final SubLObject collection, final SubLObject mt, SubLObject type, SubLObject minimum)
  {
    if( type == UNPROVIDED )
    {
      type = $kw80$ISA;
    }
    if( minimum == UNPROVIDED )
    {
      minimum = THREE_INTEGER;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $promising_induction_topic_type_collectionP_verify_caching_state$.getGlobalValue(), ConsesLow.list( collection, mt, type, minimum ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 31708L)
  public static SubLObject promising_induction_topic_type_collectionP_verify_internal(final SubLObject collection, final SubLObject mt, final SubLObject type, final SubLObject minimum)
  {
    final SubLObject mt_to_use = $const16$InferencePSC;
    return rkf_salient_descriptor.rkf_collection_promising_for_binary_pred_inductionP( mt_to_use, collection, type, minimum );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 31708L)
  public static SubLObject promising_induction_topic_type_collectionP_verify(final SubLObject collection, final SubLObject mt, SubLObject type, SubLObject minimum)
  {
    if( type == UNPROVIDED )
    {
      type = $kw80$ISA;
    }
    if( minimum == UNPROVIDED )
    {
      minimum = THREE_INTEGER;
    }
    SubLObject caching_state = $promising_induction_topic_type_collectionP_verify_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym87$PROMISING_INDUCTION_TOPIC_TYPE_COLLECTION__VERIFY, $sym88$_PROMISING_INDUCTION_TOPIC_TYPE_COLLECTION__VERIFY_CACHING_STATE_, NIL, EQ,
          FOUR_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_4( collection, mt, type, minimum );
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
        if( collection.eql( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( mt.eql( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( type.eql( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( NIL != cached_args && NIL == cached_args.rest() && minimum.eql( cached_args.first() ) )
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
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( promising_induction_topic_type_collectionP_verify_internal( collection, mt, type, minimum ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( collection, mt, type, minimum ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 32030L)
  public static SubLObject induction_topic_type_for_collection(final SubLObject collection)
  {
    return narts_high.nart_substitute( el_utilities.make_unary_formula( $const53$FormulaTemplateInductionTopicType, collection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 32196L)
  public static SubLObject induction_topic_typeP(final SubLObject v_object)
  {
    return makeBoolean( NIL != forts.fort_p( v_object ) && NIL != genls.genlP( v_object, $const89$InducedFormulaTemplate, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 32321L)
  public static SubLObject induced_formula_template_forts_for_focal_term_type(final SubLObject focal_term_type, final SubLObject elmt, SubLObject topic_id)
  {
    if( topic_id == UNPROVIDED )
    {
      topic_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( topic_id ) )
    {
      topic_id = induction_topic_type_for_collection( focal_term_type );
      if( NIL != el_utilities.possibly_naut_p( topic_id ) )
      {
        topic_id = czer_main.cyc_find_or_create_nart( topic_id, UNPROVIDED );
      }
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.currentBinding( thread );
    final SubLObject _prev_bind_2 = rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.currentBinding( thread );
    try
    {
      rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.bind( NIL, thread );
      rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.bind( ZERO_INTEGER, thread );
      SubLObject cdolist_list_var = rkf_salient_descriptor_prompter.rkf_induced_salient_descriptor_prompts_for_focal_term_type( focal_term_type, elmt );
      SubLObject prompt = NIL;
      prompt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ans = ConsesLow.cons( rkf_salient_descriptor_prompter.formula_template_fort_for_rkf_salient_descriptor_prompt( prompt, topic_id ), ans );
        cdolist_list_var = cdolist_list_var.rest();
        prompt = cdolist_list_var.first();
      }
    }
    finally
    {
      rkf_salient_descriptor.$rkf_salient_descriptor_transformation_cutoff$.rebind( _prev_bind_2, thread );
      rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 33034L)
  public static SubLObject rkf_salient_descriptor_formula_template_forts_for_focal_term_type(final SubLObject focal_term_type, final SubLObject elmt, SubLObject topic_id)
  {
    if( topic_id == UNPROVIDED )
    {
      topic_id = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == forts.fort_p( topic_id ) )
    {
      topic_id = rkf_salient_descriptor_topic_type_for_collection( focal_term_type );
      if( NIL != el_utilities.possibly_naut_p( topic_id ) )
      {
        topic_id = czer_main.cyc_find_or_create_nart( topic_id, UNPROVIDED );
      }
    }
    SubLObject ans = NIL;
    final SubLObject _prev_bind_0 = rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.currentBinding( thread );
    try
    {
      rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.bind( NIL, thread );
      SubLObject cdolist_list_var = rkf_salient_descriptor_prompter.rkf_salient_descriptor_prompts_for_focal_term_type( focal_term_type, elmt );
      SubLObject prompt = NIL;
      prompt = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        ans = ConsesLow.cons( rkf_salient_descriptor_prompter.formula_template_fort_for_rkf_salient_descriptor_prompt( prompt, topic_id ), ans );
        cdolist_list_var = cdolist_list_var.rest();
        prompt = cdolist_list_var.first();
      }
    }
    finally
    {
      rkf_salient_descriptor.$rkf_salient_descriptor_number_cutoff$.rebind( _prev_bind_0, thread );
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 33713L)
  public static SubLObject rkf_salient_descriptor_topic_type_for_collection(final SubLObject collection)
  {
    return narts_high.nart_substitute( el_utilities.make_unary_formula( $const90$SalientDescriptorFETForTypeFn, collection ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 34157L)
  public static SubLObject focal_term_type_for_topic_type(final SubLObject topic_type, SubLObject elmt)
  {
    if( elmt == UNPROVIDED )
    {
      elmt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    assert NIL != term.el_fort_p( topic_type ) : topic_type;
    final SubLObject v_properties = ConsesLow.list( $kw17$ANSWER_LANGUAGE, $kw18$HL, $kw93$MAX_NUMBER, ONE_INTEGER );
    final SubLObject focal_term_type = ask_utilities.query_variable( $sym94$_COLLECTION, ConsesLow.list( $const63$templateTypeForFocalTermType, $sym94$_COLLECTION, topic_type ), elmt, v_properties ).first();
    return focal_term_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 34560L)
  public static SubLObject focal_term_type_for_induced_template_type(final SubLObject template_type, final SubLObject elmt)
  {
    assert NIL != term.el_fort_p( template_type ) : template_type;
    final SubLObject new_pred = constants_high.find_constant( $str95$focalTermTypeForInducedTemplateTy );
    final SubLObject pred = ( NIL != new_pred ) ? new_pred : $const63$templateTypeForFocalTermType;
    final SubLObject v_properties = ConsesLow.list( $kw17$ANSWER_LANGUAGE, $kw18$HL, $kw93$MAX_NUMBER, ONE_INTEGER );
    final SubLObject focal_term_type = ask_utilities.query_variable( $sym94$_COLLECTION, ConsesLow.list( pred, $sym94$_COLLECTION, template_type ), elmt, v_properties ).first();
    return focal_term_type;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 35060L)
  public static SubLObject applicable_template_topics_by_types(final SubLObject v_term, SubLObject mt)
  {
    if( mt == UNPROVIDED )
    {
      mt = $const16$InferencePSC;
    }
    final SubLObject collection_var = $sym14$_COL;
    final SubLObject mt_var = $sym96$_MT;
    final SubLObject topic_var = $sym11$_TOPIC;
    final SubLObject tvi_query_sentence = topics_via_isa_query_sentence( v_term, mt_var, topic_var, collection_var );
    final SubLObject topics_via_isas = ask_utilities.query_template( ConsesLow.list( topic_var, mt_var, collection_var ), tvi_query_sentence, mt, UNPROVIDED );
    final SubLObject tvg_query_sentence = topics_via_genls_query_sentence( v_term, mt_var, topic_var, collection_var );
    final SubLObject topics_via_genls = ( NIL != fort_types_interface.collectionP( v_term ) ) ? ask_utilities.query_template( ConsesLow.list( topic_var, mt_var, collection_var ), tvg_query_sentence, mt, UNPROVIDED )
        : NIL;
    return ConsesLow.list( ConsesLow.list( $const45$isa, topics_via_isas ), ConsesLow.list( $const39$genls, topics_via_genls ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 35946L)
  public static SubLObject topics_via_isa_query_sentence(final SubLObject v_term, SubLObject mt_var, SubLObject topic_var, SubLObject collection_var)
  {
    if( mt_var == UNPROVIDED )
    {
      mt_var = $sym96$_MT;
    }
    if( topic_var == UNPROVIDED )
    {
      topic_var = $sym11$_TOPIC;
    }
    if( collection_var == UNPROVIDED )
    {
      collection_var = $sym14$_COL;
    }
    return ConsesLow.list( $const23$and, ConsesLow.list( $const45$isa, v_term, collection_var ), ConsesLow.list( $const65$ist_Asserted, mt_var, ConsesLow.list( $const63$templateTypeForFocalTermType, collection_var,
        topic_var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 36244L)
  public static SubLObject topics_via_genls_query_sentence(final SubLObject v_term, SubLObject mt_var, SubLObject topic_var, SubLObject collection_var)
  {
    if( mt_var == UNPROVIDED )
    {
      mt_var = $sym96$_MT;
    }
    if( topic_var == UNPROVIDED )
    {
      topic_var = $sym11$_TOPIC;
    }
    if( collection_var == UNPROVIDED )
    {
      collection_var = $sym14$_COL;
    }
    return ConsesLow.list( $const23$and, ConsesLow.list( $const39$genls, v_term, collection_var ), ConsesLow.list( $const65$ist_Asserted, mt_var, ConsesLow.list( $const67$templateTopicGenls, topic_var,
        collection_var ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 36542L)
  public static SubLObject suggest_template_topic_for_term(final SubLObject v_term, final SubLObject term_definition_mt, SubLObject template_mt)
  {
    if( template_mt == UNPROVIDED )
    {
      template_mt = NIL;
    }
    if( NIL == template_mt )
    {
      template_mt = term_definition_mt;
    }
    final SubLObject types = ask_utilities.ask_variable( $kw97$TOPICS, ConsesLow.list( $const23$and, ConsesLow.listS( $const98$ist, template_mt, $list99 ), ConsesLow.list( $const98$ist, term_definition_mt, ConsesLow
        .listS( $const45$isa, v_term, $list100 ) ) ), term_definition_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject scanned_types = NIL;
    SubLObject cdolist_list_var = types;
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != narts_high.naut_p( type ) )
      {
        type = narts_high.find_nart( type );
      }
      if( NIL != forts.fort_p( type ) )
      {
        scanned_types = ConsesLow.cons( type, scanned_types );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return Sort.sort( scanned_types, Symbols.symbol_function( $sym101$TERM__ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 37381L)
  public static SubLObject suggest_template_topic_for_collection(final SubLObject collection, final SubLObject collection_definition_mt, SubLObject template_mt)
  {
    if( template_mt == UNPROVIDED )
    {
      template_mt = NIL;
    }
    if( NIL == template_mt )
    {
      template_mt = collection_definition_mt;
    }
    if( NIL == fort_types_interface.collectionP( collection ) )
    {
      return NIL;
    }
    final SubLObject types = ask_utilities.ask_variable( $kw97$TOPICS, ConsesLow.list( $const23$and, ConsesLow.listS( $const98$ist, template_mt, $list102 ), ConsesLow.list( $const98$ist, collection_definition_mt,
        ConsesLow.listS( $const39$genls, collection, $list100 ) ) ), collection_definition_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject scanned_types = NIL;
    SubLObject cdolist_list_var = types;
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != narts_high.naut_p( type ) )
      {
        type = narts_high.find_nart( type );
      }
      if( NIL != forts.fort_p( type ) )
      {
        scanned_types = ConsesLow.cons( type, scanned_types );
      }
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return Sort.sort( scanned_types, Symbols.symbol_function( $sym101$TERM__ ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 38256L)
  public static SubLObject formula_template_topic_type_from_topic(final SubLObject parent_topic, final SubLObject elmt)
  {
    return ask_utilities.ask_variable( $kw103$TOPIC_TYPE, ConsesLow.list( $const23$and, $list104, ConsesLow.listS( $const39$genls, parent_topic, $list105 ) ), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        .first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 38608L)
  public static SubLObject formula_template_prototype_from_el_formula(final SubLObject name, final SubLObject parent_topic, final SubLObject el_formula, SubLObject focal_argpos, SubLObject editable_positions,
      SubLObject validation_positions, SubLObject replacement_invisible_positions, SubLObject elmt)
  {
    if( focal_argpos == UNPROVIDED )
    {
      focal_argpos = ONE_INTEGER;
    }
    if( editable_positions == UNPROVIDED )
    {
      editable_positions = NIL;
    }
    if( validation_positions == UNPROVIDED )
    {
      validation_positions = NIL;
    }
    if( replacement_invisible_positions == UNPROVIDED )
    {
      replacement_invisible_positions = NIL;
    }
    if( elmt == UNPROVIDED )
    {
      elmt = NIL;
    }
    final SubLObject formula_template = create_formula_template_from_name_and_topic( name, parent_topic );
    final SubLObject assertion_formula = el_utilities.copy_formula( el_formula );
    final SubLObject predicate = cycl_utilities.formula_operator( assertion_formula );
    SubLObject argpos_details = NIL;
    SubLObject single_entryP = NIL;
    if( NIL == editable_positions )
    {
      SubLObject cdotimes_end_var;
      SubLObject i;
      for( cdotimes_end_var = Sequences.length( el_formula ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        editable_positions = ConsesLow.cons( i, editable_positions );
      }
      editable_positions = Sequences.nreverse( editable_positions );
    }
    formula_templates._csetf_formula_template_elmt( formula_template, elmt );
    final SubLObject argpos_fn = el_utilities.make_unary_formula( $const106$FormulaArgPositionFn, focal_argpos );
    final SubLObject argpos_detail = formula_templates.get_ftemplate_arg_position_details( formula_template, argpos_fn );
    SubLObject arg_isa = template_type_for_focal_term_type( parent_topic, $const1$EverythingPSC );
    SubLObject new_term = NIL;
    if( NIL == arg_isa )
    {
      arg_isa = lexification_utilities.most_specific_argn_constraint( predicate, focal_argpos );
    }
    new_term = el_utilities.make_unary_formula( $const107$SomeExampleFn, arg_isa );
    cycl_utilities.formula_arg_position_nsubst( new_term, argpos_fn.rest(), assertion_formula );
    formula_templates._csetf_arg_position_details_ordering( argpos_detail, Numbers.$most_positive_fixnum$.getGlobalValue() );
    formula_templates._csetf_formula_template_focal_term( formula_template, argpos_detail );
    argpos_details = ConsesLow.cons( argpos_detail, argpos_details );
    SubLObject ordering = ZERO_INTEGER;
    SubLObject cdotimes_end_var2;
    SubLObject j;
    SubLObject argpos;
    SubLObject argpos_fn2;
    SubLObject argpos_detail2;
    SubLObject arg_isa2;
    SubLObject new_term2;
    for( cdotimes_end_var2 = arity.arity( predicate ), j = NIL, j = ZERO_INTEGER; j.numL( cdotimes_end_var2 ); j = Numbers.add( j, ONE_INTEGER ) )
    {
      argpos = Numbers.add( j, ONE_INTEGER );
      if( NIL != subl_promotions.memberP( argpos, editable_positions, UNPROVIDED, UNPROVIDED ) )
      {
        ordering = Numbers.add( ordering, ONE_INTEGER );
        argpos_fn2 = el_utilities.make_unary_formula( $const106$FormulaArgPositionFn, argpos );
        argpos_detail2 = formula_templates.get_ftemplate_arg_position_details( formula_template, argpos_fn2 );
        formula_templates._csetf_arg_position_details_ordering( argpos_detail2, ordering );
        formula_templates._csetf_arg_position_details_is_editable( argpos_detail2, T );
        formula_templates._csetf_arg_position_details_invisible_replacement_positions( argpos_detail2, subl_promotions.memberP( argpos, replacement_invisible_positions, UNPROVIDED, UNPROVIDED ) );
        formula_templates._csetf_arg_position_details_requires_validation( argpos_detail2, subl_promotions.memberP( argpos, validation_positions, UNPROVIDED, UNPROVIDED ) );
        if( NIL == single_entryP && NIL != kb_accessors.arg_n_single_entry_formatP( predicate, argpos, elmt ) )
        {
          single_entryP = T;
        }
        arg_isa2 = lexification_utilities.most_specific_argn_constraint( predicate, argpos );
        new_term2 = el_utilities.make_unary_formula( $const107$SomeExampleFn, arg_isa2 );
        cycl_utilities.formula_arg_position_nsubst( new_term2, argpos_fn2.rest(), assertion_formula );
        argpos_details = ConsesLow.cons( argpos_detail2, argpos_details );
      }
    }
    formula_templates._csetf_formula_template_formula( formula_template, assertion_formula );
    formula_templates._csetf_formula_template_argpos_ordering( formula_template, formula_templates.sort_argpos_details_by_ordering( argpos_details ) );
    formula_templates._csetf_formula_template_entry_format( formula_template, ( NIL != single_entryP ) ? $const108$SingleAssertionEntry : $const109$MultipleAssertionEntry );
    return formula_template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 42408L)
  public static SubLObject formula_template_prototype_from_assertion(final SubLObject name, final SubLObject parent_topic, final SubLObject base_assertion, SubLObject focal_argpos, SubLObject editable_positions,
      SubLObject validation_positions, SubLObject replacement_invisible_positions)
  {
    if( focal_argpos == UNPROVIDED )
    {
      focal_argpos = ONE_INTEGER;
    }
    if( editable_positions == UNPROVIDED )
    {
      editable_positions = NIL;
    }
    if( validation_positions == UNPROVIDED )
    {
      validation_positions = NIL;
    }
    if( replacement_invisible_positions == UNPROVIDED )
    {
      replacement_invisible_positions = NIL;
    }
    return formula_template_prototype_from_el_formula( name, parent_topic, uncanonicalizer.assertion_el_formula( base_assertion ), focal_argpos, editable_positions, validation_positions, replacement_invisible_positions,
        assertions_high.assertion_mt( base_assertion ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 43068L)
  public static SubLObject template_type_for_focal_term_type(final SubLObject topic, final SubLObject elmt)
  {
    return template_type_for_focal_term_types( topic, elmt ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 43207L)
  public static SubLObject template_type_for_focal_term_types(final SubLObject topic, final SubLObject elmt)
  {
    return ask_utilities.ask_variable( $kw110$WHAT, ConsesLow.list( $const63$templateTypeForFocalTermType, $kw110$WHAT, topic ), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 43354L)
  public static SubLObject template_topic_genls(final SubLObject topic, final SubLObject elmt)
  {
    return ask_utilities.ask_variable( $kw110$WHAT, ConsesLow.listS( $const67$templateTopicGenls, topic, $list111 ), elmt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 43477L)
  public static SubLObject create_formula_template_from_name_and_topic(final SubLObject name, final SubLObject parent)
  {
    final SubLObject formula_template = formula_templates.new_formula_template( name, parent );
    return formula_template;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 43680L)
  public static SubLObject find_matching_formula_template_argpos_details(final SubLObject formula_template, final SubLObject arg_pos)
  {
    SubLObject cdolist_list_var = formula_templates.formula_template_argpos_ordering( formula_template );
    SubLObject argpos_detail = NIL;
    argpos_detail = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( arg_pos.numE( conses_high.second( formula_templates.arg_position_details_argument_position( argpos_detail ) ) ) )
      {
        return argpos_detail;
      }
      cdolist_list_var = cdolist_list_var.rest();
      argpos_detail = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 43977L)
  public static SubLObject maybe_assert_fet_gloss_for_arg_position(final SubLObject arg_position, final SubLObject formula, SubLObject language_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject gloss = NIL;
    if( NIL != el_utilities.el_binary_formula_p( formula ) && arg_position.equal( $list112 ) )
    {
      gloss = maybe_assert_fet_gloss_for_arg2_of_binary_pred_formula( formula, language_mt );
    }
    else if( arg_position.equal( $list113 ) && NIL != el_utilities.el_formula_with_operator_p( formula, $const24$relationAllInstance ) )
    {
      final SubLObject binary_version = cycl_utilities.formula_args( formula, UNPROVIDED );
      gloss = maybe_assert_fet_gloss_for_arg2_of_binary_pred_formula( binary_version, language_mt );
    }
    else if( arg_position.equal( $list113 ) && NIL != el_utilities.el_formula_with_operator_p( formula, $const114$relationAllExists ) )
    {
      final SubLObject binary_version = cycl_utilities.formula_args( formula, UNPROVIDED );
      final SubLObject instance_level_gloss = maybe_assert_fet_gloss_for_arg2_of_binary_pred_formula( binary_version, language_mt );
      final SubLObject no_colon = string_utilities.post_remove( instance_level_gloss, $str115$_, UNPROVIDED );
      final SubLObject type_level_gloss = gloss = Sequences.cconcatenate( no_colon, $str116$__type__ );
    }
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 45108L)
  public static SubLObject maybe_assert_fet_gloss_for_arg2_of_binary_pred_formula(final SubLObject formula, final SubLObject language_mt)
  {
    final SubLObject arg0 = cycl_utilities.formula_arg0( formula );
    final SubLObject gloss = maybe_assert_fet_gloss_for_arg2_of_binary_pred( arg0, language_mt );
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 45338L)
  public static SubLObject maybe_assert_fet_gloss_for_arg2_of_binary_pred(final SubLObject bin_pred, SubLObject language_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject gloss = NIL;
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( language_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      gloss = kb_mapping_utilities.fpred_value( bin_pred, $const117$glossForInducedSuggestionPred, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    if( !gloss.isString() )
    {
      gloss = make_fet_gloss_for_arg2_of_binary_pred( bin_pred, language_mt );
      if( NIL != ke.cyclist_is_guest() )
      {
        operation_communication.set_the_cyclist( $const72$Cyc );
      }
      ke.ke_assert( ConsesLow.list( $const117$glossForInducedSuggestionPred, bin_pred, gloss ), $const118$GKEFormulaTemplatesMt, UNPROVIDED, UNPROVIDED );
    }
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 45893L)
  public static SubLObject make_fet_gloss_for_arg_position(final SubLObject arg_position, final SubLObject formula, SubLObject language_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject arg0 = cycl_utilities.formula_arg0( formula );
    final SubLObject use_generation_with_blankP = NIL;
    final SubLObject use_formula_with_blankP = T;
    SubLObject gloss = NIL;
    if( NIL != el_utilities.el_binary_formula_p( formula ) && ( arg_position.equal( $list112 ) || ( NIL != fort_types_interface.symmetric_binary_predicate_p( cycl_utilities.formula_arg0( formula ) ) && arg_position
        .equal( $list119 ) ) ) )
    {
      gloss = make_fet_gloss_for_arg2_of_binary_pred_formula( formula, language_mt );
    }
    else if( arg_position.equal( $list113 ) && NIL != el_utilities.el_formula_with_operator_p( formula, $const24$relationAllInstance ) )
    {
      final SubLObject binary_version = cycl_utilities.formula_args( formula, UNPROVIDED );
      gloss = make_fet_gloss_for_arg2_of_binary_pred_formula( binary_version, language_mt );
    }
    else if( arg_position.equal( $list113 ) && NIL != el_utilities.el_formula_with_operator_p( formula, $const114$relationAllExists ) )
    {
      final SubLObject binary_version = cycl_utilities.formula_args( formula, UNPROVIDED );
      final SubLObject instance_level_gloss = make_fet_gloss_for_arg2_of_binary_pred_formula( binary_version, language_mt );
      final SubLObject no_colon = string_utilities.post_remove( instance_level_gloss, $str115$_, UNPROVIDED );
      final SubLObject type_level_gloss = gloss = Sequences.cconcatenate( no_colon, $str116$__type__ );
    }
    else if( NIL != formula_template_meta_isaP( formula, arg_position ) )
    {
      gloss = make_fet_gloss_for_meta_isa_formula( arg_position, formula, language_mt );
    }
    if( !gloss.isString() && NIL != use_generation_with_blankP )
    {
      final SubLObject var = czer_utilities.unique_el_var_wrt_expression( formula, UNPROVIDED );
      final SubLObject formula_with_var = el_utilities.replace_formula_arg_position( arg_position, var, formula );
      final SubLObject _prev_bind_0 = pph_vars.$pph_blanks_for_varsP$.currentBinding( thread );
      try
      {
        pph_vars.$pph_blanks_for_varsP$.bind( T, thread );
        gloss = pph_question.generate_question( formula_with_var, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        pph_vars.$pph_blanks_for_varsP$.rebind( _prev_bind_0, thread );
      }
    }
    if( !gloss.isString() && NIL != use_formula_with_blankP )
    {
      final SubLObject blank_string = $str120$______;
      final SubLObject formula_with_blank = el_utilities.replace_formula_arg_position( arg_position, blank_string, formula );
      gloss = print_high.princ_to_string( formula_with_blank );
    }
    return string_utilities.nupcase_leading( ( NIL != gloss ) ? gloss : PrintLow.format( NIL, $str121$arg__S_of__S_, arg_position, arg0 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 48009L)
  public static SubLObject make_fet_gloss_for_arg2_of_binary_pred_formula(final SubLObject formula, SubLObject language_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    final SubLObject arg0 = cycl_utilities.formula_arg0( formula );
    final SubLObject gloss = make_fet_gloss_for_arg2_of_binary_pred( arg0, language_mt );
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 48271L)
  public static SubLObject clear_make_fet_gloss_for_arg2_of_binary_pred()
  {
    final SubLObject cs = $make_fet_gloss_for_arg2_of_binary_pred_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 48271L)
  public static SubLObject remove_make_fet_gloss_for_arg2_of_binary_pred(final SubLObject bin_pred, SubLObject language_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    return memoization_state.caching_state_remove_function_results_with_args( $make_fet_gloss_for_arg2_of_binary_pred_caching_state$.getGlobalValue(), ConsesLow.list( bin_pred, language_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 48271L)
  public static SubLObject make_fet_gloss_for_arg2_of_binary_pred_internal(final SubLObject bin_pred, final SubLObject language_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != fort_types_interface.predicate_p( bin_pred ) : bin_pred;
    SubLObject gloss = NIL;
    final SubLObject use_denotes_arg_in_relnP = T;
    final SubLObject use_pred_generationP = T;
    final SubLObject use_constant_nameP = T;
    if( NIL != use_denotes_arg_in_relnP )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( language_mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        SubLObject assertions = NIL;
        if( NIL == gloss )
        {
          SubLObject csome_list_var = isa.all_fort_instances( $const124$DenotesArgInRelnPredicate, UNPROVIDED, UNPROVIDED );
          SubLObject air_pred = NIL;
          air_pred = csome_list_var.first();
          while ( NIL == gloss && NIL != csome_list_var)
          {
            final SubLObject denot_arg = lexicon_utilities.denotatum_arg_of_pred_cached( air_pred );
            if( NIL != denot_arg )
            {
              final SubLObject pred_var = air_pred;
              if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( bin_pred, denot_arg, pred_var ) )
              {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( bin_pred, denot_arg, pred_var );
                SubLObject done_var = gloss;
                final SubLObject token_var = NIL;
                while ( NIL == done_var)
                {
                  final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
                  final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
                  if( NIL != valid )
                  {
                    SubLObject final_index_iterator = NIL;
                    try
                    {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw44$GAF, NIL, NIL );
                      SubLObject done_var_$74 = gloss;
                      final SubLObject token_var_$75 = NIL;
                      while ( NIL == done_var_$74)
                      {
                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$75 );
                        final SubLObject valid_$76 = makeBoolean( !token_var_$75.eql( gaf ) );
                        if( NIL != valid_$76 && TWO_INTEGER.eql( list_utilities.last_one( assertions_high.gaf_args( gaf ) ) ) )
                        {
                          assertions = ConsesLow.cons( gaf, assertions );
                        }
                        done_var_$74 = makeBoolean( NIL == valid_$76 || NIL != gloss );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$77 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        if( NIL != final_index_iterator )
                        {
                          kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                        }
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$77, thread );
                      }
                    }
                  }
                  done_var = makeBoolean( NIL == valid || NIL != gloss );
                }
              }
            }
            csome_list_var = csome_list_var.rest();
            air_pred = csome_list_var.first();
          }
        }
        SubLObject cdolist_list_var = pph_utilities.pph_sort_assertions( assertions, Symbols.symbol_function( IDENTITY ), language_mt );
        SubLObject gaf2 = NIL;
        gaf2 = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject _prev_bind_0_$78 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
          try
          {
            lexicon_vars.$lexicon_lookup_mt$.bind( language_mt, thread );
            final SubLObject nl_preds = $list125;
            if( NIL == gloss )
            {
              SubLObject csome_list_var2 = lexification_utilities.phrases_from_semantic_assertion( gaf2, nl_preds );
              SubLObject phrase = NIL;
              phrase = csome_list_var2.first();
              while ( NIL == gloss && NIL != csome_list_var2)
              {
                if( phrase.isString() )
                {
                  gloss = Sequences.cconcatenate( phrase, $str115$_ );
                }
                csome_list_var2 = csome_list_var2.rest();
                phrase = csome_list_var2.first();
              }
            }
          }
          finally
          {
            lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0_$78, thread );
          }
          cdolist_list_var = cdolist_list_var.rest();
          gaf2 = cdolist_list_var.first();
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    if( !gloss.isString() && NIL != use_pred_generationP )
    {
      final SubLObject _prev_bind_4 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
      try
      {
        pph_vars.$pph_demerit_cutoff$.bind( number_utilities.positive_infinity(), thread );
        gloss = Sequences.cconcatenate( pph_main.generate_phrase( bin_pred, $list126, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), $str115$_ );
      }
      finally
      {
        pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_4, thread );
      }
    }
    if( !gloss.isString() && NIL != use_constant_nameP )
    {
      gloss = Sequences.cconcatenate( string_utilities.to_string( bin_pred ), $str115$_ );
    }
    return gloss.isString() ? string_utilities.nupcase_leading( gloss ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 48271L)
  public static SubLObject make_fet_gloss_for_arg2_of_binary_pred(final SubLObject bin_pred, SubLObject language_mt)
  {
    if( language_mt == UNPROVIDED )
    {
      language_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
    }
    SubLObject caching_state = $make_fet_gloss_for_arg2_of_binary_pred_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym122$MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED, $sym127$_MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER,
          ZERO_INTEGER );
      memoization_state.register_hl_store_cache_clear_callback( $sym128$CLEAR_MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( bin_pred, language_mt );
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
        if( bin_pred.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && language_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( make_fet_gloss_for_arg2_of_binary_pred_internal( bin_pred, language_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( bin_pred, language_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 49832L)
  public static SubLObject formula_template_meta_isaP(final SubLObject formula, final SubLObject arg_position)
  {
    return list_utilities.sublisp_boolean( formula_template_meta_isa( formula, arg_position ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 49967L)
  public static SubLObject formula_template_meta_isa(final SubLObject formula, final SubLObject arg_position)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != conses_high.member( arg_position, $list129, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( formula, $list130 );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject isa_var = list_utilities.alist_lookup_without_values( v_bindings, $sym131$ISA_VAR, UNPROVIDED, UNPROVIDED );
        final SubLObject meta_isa = list_utilities.alist_lookup_without_values( v_bindings, $sym132$META_ISA, UNPROVIDED, UNPROVIDED );
        if( NIL != cycl_variables.el_varP( isa_var ) && NIL != forts.fort_p( meta_isa ) )
        {
          return meta_isa;
        }
      }
    }
    else
    {
      if( NIL == conses_high.member( arg_position, $list133, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        return NIL;
      }
      thread.resetMultipleValues();
      final SubLObject success = formula_pattern_match.formula_matches_pattern( formula, $list134 );
      final SubLObject v_bindings = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != success )
      {
        final SubLObject isa_var = list_utilities.alist_lookup_without_values( v_bindings, $sym131$ISA_VAR, UNPROVIDED, UNPROVIDED );
        final SubLObject meta_isa = list_utilities.alist_lookup_without_values( v_bindings, $sym132$META_ISA, UNPROVIDED, UNPROVIDED );
        if( NIL != cycl_variables.el_varP( isa_var ) && NIL != forts.fort_p( meta_isa ) )
        {
          return meta_isa;
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 50667L)
  public static SubLObject make_fet_gloss_for_meta_isa_formula(final SubLObject arg_position, final SubLObject formula, final SubLObject language_mt)
  {
    final SubLObject meta_isa = formula_template_meta_isa( formula, arg_position );
    final SubLObject gloss = make_fet_gloss_for_meta_isa( meta_isa, language_mt );
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 50904L)
  public static SubLObject clear_make_fet_gloss_for_meta_isa()
  {
    final SubLObject cs = $make_fet_gloss_for_meta_isa_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 50904L)
  public static SubLObject remove_make_fet_gloss_for_meta_isa(final SubLObject meta_isa, final SubLObject language_mt)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $make_fet_gloss_for_meta_isa_caching_state$.getGlobalValue(), ConsesLow.list( meta_isa, language_mt ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 50904L)
  public static SubLObject make_fet_gloss_for_meta_isa_internal(final SubLObject meta_isa, final SubLObject language_mt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject gloss = NIL;
    final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding( thread );
    try
    {
      lexicon_vars.$lexicon_lookup_mt$.bind( language_mt, thread );
      final SubLObject nl_preds = $list125;
      final SubLObject phrase = pph_main.generate_phrase( meta_isa, nl_preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( phrase.isString() )
      {
        gloss = Sequences.cconcatenate( phrase, $str115$_ );
      }
    }
    finally
    {
      lexicon_vars.$lexicon_lookup_mt$.rebind( _prev_bind_0, thread );
    }
    return gloss;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 50904L)
  public static SubLObject make_fet_gloss_for_meta_isa(final SubLObject meta_isa, final SubLObject language_mt)
  {
    SubLObject caching_state = $make_fet_gloss_for_meta_isa_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym135$MAKE_FET_GLOSS_FOR_META_ISA, $sym136$_MAKE_FET_GLOSS_FOR_META_ISA_CACHING_STATE_, NIL, EQUAL, TWO_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_2( meta_isa, language_mt );
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
        if( meta_isa.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( NIL != cached_args && NIL == cached_args.rest() && language_mt.equal( cached_args.first() ) )
          {
            return memoization_state.caching_results( results2 );
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( make_fet_gloss_for_meta_isa_internal( meta_isa, language_mt ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( meta_isa, language_mt ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 51239L)
  public static SubLObject make_fet_explanation_for_arg_position(final SubLObject arg_position, final SubLObject focal_term_arg_position, final SubLObject formula, SubLObject pph_language_mt)
  {
    if( pph_language_mt == UNPROVIDED )
    {
      pph_language_mt = pph_vars.$pph_language_mt$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_utilities.arg_position_p( arg_position ) : arg_position;
    assert NIL != cycl_utilities.arg_position_p( focal_term_arg_position ) : focal_term_arg_position;
    final SubLObject focal_term = cycl_utilities.formula_arg_position( formula, focal_term_arg_position, UNPROVIDED );
    final SubLObject term_to_explain = cycl_utilities.formula_arg_position( formula, arg_position, UNPROVIDED );
    SubLObject formula_to_paraphrase = el_utilities.copy_expression( formula );
    SubLObject explanation_string = $str73$;
    if( NIL != rkf_domain_examples.rkf_generic_example_p( focal_term ) )
    {
      final SubLObject collection = cycl_utilities.formula_arg1( focal_term, UNPROVIDED );
      final SubLObject focal_term_type = ( NIL != rkf_domain_examples.rkf_generic_example_instance_level_p( focal_term ) ) ? collection : el_utilities.make_specs_fn( collection );
      final SubLObject new_focal_term = ConsesLow.list( pph_functions.bestdetnbarfn_definite(), ConsesLow.list( pph_functions.termparaphrasefn_constrained(), $const138$nonPlural_Generic, focal_term_type ) );
      formula_to_paraphrase = el_utilities.nreplace_formula_arg_position( focal_term_arg_position, new_focal_term, formula_to_paraphrase );
    }
    if( NIL != rkf_domain_examples.rkf_generic_example_p( term_to_explain ) )
    {
      final SubLObject collection = cycl_utilities.formula_arg1( term_to_explain, UNPROVIDED );
      final SubLObject term_to_explain_type = ( NIL != rkf_domain_examples.rkf_generic_example_instance_level_p( term_to_explain ) ) ? collection : el_utilities.make_specs_fn( collection );
      final SubLObject new_term_to_explain = ConsesLow.list( pph_functions.bestdetnbarfn(), reader.bq_cons( pph_functions.termparaphrasefn(), $list139 ), ConsesLow.list( pph_functions.termparaphrasefn_constrained(),
          $const138$nonPlural_Generic, term_to_explain_type ) );
      formula_to_paraphrase = el_utilities.nreplace_formula_arg_position( arg_position, new_term_to_explain, formula_to_paraphrase );
    }
    final SubLObject _prev_bind_0 = pph_vars.$pph_language_mt$.currentBinding( thread );
    try
    {
      pph_vars.$pph_language_mt$.bind( pph_language_mt, thread );
      explanation_string = pph_main.generate_text( formula_to_paraphrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      pph_vars.$pph_language_mt$.rebind( _prev_bind_0, thread );
    }
    return explanation_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 53048L)
  public static SubLObject reify_formula_template_description(final SubLObject formula_template)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject name = formula_templates.formula_template_id( formula_template );
    if( NIL == forts.fort_p( name ) )
    {
      SubLObject v_term = constants_high.find_constant( name );
      if( NIL == forts.fort_p( v_term ) )
      {
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding( thread );
        try
        {
          api_control_vars.$use_local_queueP$.bind( NIL, thread );
          v_term = ke.ke_create( name );
        }
        finally
        {
          api_control_vars.$use_local_queueP$.rebind( _prev_bind_0, thread );
        }
      }
      if( NIL != forts.fort_p( v_term ) )
      {
        formula_templates._csetf_formula_template_id( formula_template, v_term );
      }
    }
    return forts.fort_p( formula_templates.formula_template_id( formula_template ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 53592L)
  public static SubLObject assert_formula_template_type_subtopic(final SubLObject topic, final SubLObject subtopic)
  {
    final SubLObject successP = rkf_assertion_utilities.rkf_assert_now( ConsesLow.list( $const140$formulaTemplateTypeHasTopicType, subtopic, topic ), $const71$BaseKB );
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 53785L)
  public static SubLObject make_formula_template_type_assertions(final SubLObject formula_template)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject topic = formula_templates.formula_template_topic( formula_template );
    SubLObject successP = NIL;
    successP = makeBoolean( NIL != list_utilities.sublisp_boolean( rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const54$formulaTemplateHasType, v_term, topic ), $const141$UniversalVocabularyMt, UNPROVIDED,
        UNPROVIDED ) ) && NIL != list_utilities.sublisp_boolean( rkf_assertion_utilities.rkf_assert( ConsesLow.listS( $const45$isa, v_term, $list142 ), $const141$UniversalVocabularyMt, UNPROVIDED, UNPROVIDED ) ) );
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 54231L)
  public static SubLObject assert_formula_template_formula(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject formula = formula_templates.formula_template_formula( formula_template );
    return list_utilities.sublisp_boolean( rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const143$formulaForFormulaTemplate, v_term, formula ), target_mt, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 54519L)
  public static SubLObject assert_formula_template_elmt(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject elmt = formula_templates.formula_template_elmt( formula_template );
    return list_utilities.sublisp_boolean( rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const144$assertMtForFormulaTemplate, v_term, elmt ), target_mt, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 54796L)
  public static SubLObject assert_formula_template_focal_term_position(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject focal_term = formula_templates.formula_template_focal_term( formula_template );
    final SubLObject focal_term_pos = formula_templates.arg_position_details_argument_position( focal_term );
    final SubLObject topic = formula_templates.formula_template_topic( formula_template );
    final SubLObject topic_type = formula_template_topic_type_from_topic( topic, target_mt );
    return list_utilities.sublisp_boolean( rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const145$focalTermPositionForFormulaTempla, v_term, focal_term_pos, topic_type ), target_mt, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 55407L)
  public static SubLObject assert_formula_template_assertion_format(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject entry_format = formula_templates.formula_template_entry_format( formula_template );
    final SubLObject topic = formula_templates.formula_template_topic( formula_template );
    final SubLObject topic_type = formula_template_topic_type_from_topic( topic, target_mt );
    return list_utilities.sublisp_boolean( rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const146$assertionFormatForFormulaTemplate, v_term, entry_format, topic_type ), target_mt, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 55937L)
  public static SubLObject assert_formula_template_assertion_explanations(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject topic = formula_templates.formula_template_topic( formula_template );
    final SubLObject topic_type = formula_template_topic_type_from_topic( topic, target_mt );
    final SubLObject argpos_details = formula_templates.formula_template_argpos_ordering( formula_template );
    SubLObject successP = T;
    SubLObject list_var = NIL;
    SubLObject argpos = NIL;
    SubLObject number = NIL;
    list_var = argpos_details;
    argpos = list_var.first();
    for( number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), argpos = list_var.first(), number = Numbers.add( ONE_INTEGER, number ) )
    {
      final SubLObject term_pos = formula_templates.arg_position_details_argument_position( argpos );
      final SubLObject explanation = formula_templates.arg_position_details_explanation( argpos );
      if( explanation.isString() && NIL == string_utilities.empty_string_p( explanation ) )
      {
        successP = makeBoolean( NIL != rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const147$formulaTemplateArgExplanation, v_term, topic_type, term_pos, explanation ), target_mt, UNPROVIDED, UNPROVIDED )
            && NIL != successP );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 56901L)
  public static SubLObject assert_formula_template_assertion_glosses(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject topic = formula_templates.formula_template_topic( formula_template );
    final SubLObject topic_type = formula_template_topic_type_from_topic( topic, target_mt );
    final SubLObject argpos_details = formula_templates.formula_template_argpos_ordering( formula_template );
    SubLObject successP = T;
    SubLObject list_var = NIL;
    SubLObject argpos = NIL;
    SubLObject number = NIL;
    list_var = argpos_details;
    argpos = list_var.first();
    for( number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), argpos = list_var.first(), number = Numbers.add( ONE_INTEGER, number ) )
    {
      final SubLObject term_pos = formula_templates.arg_position_details_argument_position( argpos );
      final SubLObject gloss = formula_templates.arg_position_details_gloss( argpos );
      final SubLObject position = Numbers.add( ONE_INTEGER, number );
      if( gloss.isString() && NIL == string_utilities.empty_string_p( gloss ) )
      {
        successP = makeBoolean( NIL != rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const148$glossForFormulaTemplate, v_term, topic_type, term_pos, gloss, position ), target_mt, UNPROVIDED, UNPROVIDED )
            && NIL != successP );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 57871L)
  public static SubLObject assert_formula_template_candidate_replacements(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject argpos_details = formula_templates.formula_template_argpos_ordering( formula_template );
    SubLObject successP = T;
    SubLObject list_var = NIL;
    SubLObject argpos = NIL;
    SubLObject number = NIL;
    list_var = argpos_details;
    argpos = list_var.first();
    for( number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), argpos = list_var.first(), number = Numbers.add( ONE_INTEGER, number ) )
    {
      final SubLObject term_pos = formula_templates.arg_position_details_argument_position( argpos );
      SubLObject cdolist_list_var = formula_templates.arg_position_details_candidate_replacements( argpos );
      SubLObject candidate_replacement = NIL;
      candidate_replacement = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        successP = makeBoolean( NIL != rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const149$candidateReplacementForPosition, v_term, term_pos, candidate_replacement ), target_mt, UNPROVIDED, UNPROVIDED )
            && NIL != successP );
        cdolist_list_var = cdolist_list_var.rest();
        candidate_replacement = cdolist_list_var.first();
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 58623L)
  public static SubLObject assert_formula_template_assertion_validation_required(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject argpos_details = formula_templates.formula_template_argpos_ordering( formula_template );
    SubLObject successP = T;
    SubLObject list_var = NIL;
    SubLObject argpos = NIL;
    SubLObject number = NIL;
    list_var = argpos_details;
    argpos = list_var.first();
    for( number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), argpos = list_var.first(), number = Numbers.add( ONE_INTEGER, number ) )
    {
      final SubLObject term_pos = formula_templates.arg_position_details_argument_position( argpos );
      if( NIL != formula_templates.arg_position_details_requires_validation( argpos ) )
      {
        successP = makeBoolean( NIL != rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const150$validationRequiredOnTemplatePosit, v_term, term_pos ), target_mt, UNPROVIDED, UNPROVIDED ) && NIL != successP );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 59339L)
  public static SubLObject assert_formula_template_assertion_replacements_invisible(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject argpos_details = formula_templates.formula_template_argpos_ordering( formula_template );
    SubLObject successP = T;
    SubLObject list_var = NIL;
    SubLObject argpos = NIL;
    SubLObject number = NIL;
    list_var = argpos_details;
    argpos = list_var.first();
    for( number = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), argpos = list_var.first(), number = Numbers.add( ONE_INTEGER, number ) )
    {
      final SubLObject term_pos = formula_templates.arg_position_details_argument_position( argpos );
      if( NIL != formula_templates.arg_position_details_invisible_replacement_positions( argpos ) )
      {
        successP = makeBoolean( NIL != rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const151$templateReplacementsInvisibleForP, v_term, term_pos ), target_mt, UNPROVIDED, UNPROVIDED ) && NIL != successP );
      }
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 60068L)
  public static SubLObject assert_formula_template_examples(final SubLObject formula_template, final SubLObject target_mt)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject topic = formula_templates.formula_template_topic( formula_template );
    final SubLObject topic_type = formula_template_topic_type_from_topic( topic, target_mt );
    SubLObject successP = T;
    SubLObject cdolist_list_var = formula_templates.formula_template_examples( formula_template );
    SubLObject example = NIL;
    example = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != el_utilities.el_formula_p( example ) )
      {
        successP = makeBoolean( NIL != rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const152$formulaTemplateExample, v_term, topic_type, example ), target_mt, UNPROVIDED, UNPROVIDED ) && NIL != successP );
      }
      cdolist_list_var = cdolist_list_var.rest();
      example = cdolist_list_var.first();
    }
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 60714L)
  public static SubLObject assert_formula_template_priority_ordering(final SubLObject formula_template, final SubLObject target_mt, final SubLObject higher_template_id)
  {
    final SubLObject v_term = formula_templates.formula_template_id( formula_template );
    final SubLObject topic = formula_templates.formula_template_topic( formula_template );
    SubLObject successP = T;
    successP = makeBoolean( NIL != rkf_assertion_utilities.rkf_assert( ConsesLow.list( $const153$higherPriorityTemplateForType, higher_template_id, v_term, topic ), target_mt, UNPROVIDED, UNPROVIDED )
        && NIL != successP );
    return successP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 61191L)
  public static SubLObject find_ftemplate_topic_from_id(final SubLObject topic_id, final SubLObject template_elmt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject template_topic = NIL;
    final SubLObject local_state = formula_template_vars.get_template_topic_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        template_topic = api_widgets.formula_template_load_template_graph_memoized( topic_id, template_elmt );
      }
      finally
      {
        final SubLObject _prev_bind_0_$79 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$79, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return template_topic;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 61454L)
  public static SubLObject find_ftemplate_from_ids(final SubLObject template_id, final SubLObject topic_id, final SubLObject template_elmt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject template_topic = find_ftemplate_topic_from_id( topic_id, template_elmt );
    SubLObject ftemplate = NIL;
    final SubLObject local_state = formula_template_vars.get_template_topic_memoization_state();
    final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding( thread );
    try
    {
      memoization_state.$memoization_state$.bind( local_state, thread );
      final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
      try
      {
        ftemplate = find_ftemplate_in_template_topic( template_id, template_topic );
      }
      finally
      {
        final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$80, thread );
        }
      }
    }
    finally
    {
      memoization_state.$memoization_state$.rebind( _prev_bind_0, thread );
    }
    return ftemplate;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 61764L)
  public static SubLObject find_ftemplate_in_template_topic(final SubLObject template_id, final SubLObject template_topic)
  {
    SubLObject ans = NIL;
    if( NIL == ans )
    {
      SubLObject csome_list_var = formula_templates.template_topic_templates( template_topic );
      SubLObject ftemplate = NIL;
      ftemplate = csome_list_var.first();
      while ( NIL == ans && NIL != csome_list_var)
      {
        if( formula_templates.formula_template_id( ftemplate ).eql( template_id ) )
        {
          ans = ftemplate;
        }
        csome_list_var = csome_list_var.rest();
        ftemplate = csome_list_var.first();
      }
    }
    if( NIL == ans )
    {
      SubLObject csome_list_var;
      SubLObject subtopic;
      for( csome_list_var = formula_templates.template_topic_subtopics( template_topic ), subtopic = NIL, subtopic = csome_list_var.first(); NIL == ans && NIL != csome_list_var; ans = find_ftemplate_in_template_topic(
          template_id, subtopic ), csome_list_var = csome_list_var.rest(), subtopic = csome_list_var.first() )
      {
      }
    }
    return ans;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 62182L)
  public static SubLObject perform_after_creatings_for_new_template_term(final SubLObject template_id, final SubLObject new_constant)
  {
    assert NIL != term.el_fort_p( template_id ) : template_id;
    assert NIL != constant_handles.constant_p( new_constant ) : new_constant;
    SubLObject cdolist_list_var = after_creating_function_specs_for_template_id( template_id );
    SubLObject fn_spec = NIL;
    fn_spec = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( fn_spec.isFunctionSpec() )
      {
        Functions.apply( fn_spec, ConsesLow.list( new_constant ) );
      }
      cdolist_list_var = cdolist_list_var.rest();
      fn_spec = cdolist_list_var.first();
    }
    return new_constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 62610L)
  public static SubLObject after_creating_function_specs_for_template_id(final SubLObject template_id)
  {
    if( template_id.eql( $const155$TKBTemplate_Attack ) )
    {
      return $list156;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 62827L)
  public static SubLObject check_template_type_menu_item_parsing(final SubLObject template_type, SubLObject domain_mt)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $const16$InferencePSC;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject done = set.new_set( UNPROVIDED, UNPROVIDED );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject local_state;
      final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
      final SubLObject _prev_bind_0_$81 = memoization_state.$memoization_state$.currentBinding( thread );
      try
      {
        memoization_state.$memoization_state$.bind( local_state, thread );
        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
        try
        {
          final SubLObject _prev_bind_0_$82 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
          final SubLObject _prev_bind_1_$83 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding( thread );
          try
          {
            sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
            sbhl_marking_vars.$sbhl_gather_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
            try
            {
              SubLObject node_var_$84 = template_type;
              final SubLObject deck_type = $kw30$STACK;
              final SubLObject recur_deck = deck.create_deck( deck_type );
              final SubLObject _prev_bind_0_$83 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                try
                {
                  final SubLObject tv_var = NIL;
                  final SubLObject _prev_bind_0_$84 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                  final SubLObject _prev_bind_1_$84 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                  try
                  {
                    sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                    if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                    {
                      final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                      if( pcase_var.eql( $kw32$ERROR ) )
                      {
                        sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      else if( pcase_var.eql( $kw35$CERROR ) )
                      {
                        sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                      else if( pcase_var.eql( $kw37$WARN ) )
                      {
                        Errors.warn( $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
                      }
                      else
                      {
                        Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                        Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
                      }
                    }
                    final SubLObject _prev_bind_0_$85 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$85 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                    final SubLObject _prev_bind_2_$90 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                    try
                    {
                      sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                      sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                          $const45$isa ) ) ), thread );
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars
                          .get_sbhl_module( $const45$isa ) ) ), thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                      sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                      if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( template_type, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                      {
                        final SubLObject _prev_bind_0_$86 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                        final SubLObject _prev_bind_1_$86 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                        final SubLObject _prev_bind_2_$91 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                        try
                        {
                          sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_backward_search_direction(), thread );
                          sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.sbhl_search_direction_to_link_direction( sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities
                              .get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module( $const45$isa ) ) ), thread );
                          sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                          sbhl_marking_utilities.sbhl_mark_node_marked( node_var_$84, UNPROVIDED );
                          while ( NIL != node_var_$84)
                          {
                            final SubLObject tt_node_var = node_var_$84;
                            SubLObject cdolist_list_var;
                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$isa ) );
                            SubLObject module_var = NIL;
                            module_var = cdolist_list_var.first();
                            while ( NIL != cdolist_list_var)
                            {
                              final SubLObject _prev_bind_0_$87 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$87 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                              try
                              {
                                sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                    .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                final SubLObject node = function_terms.naut_to_nart( tt_node_var );
                                if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                {
                                  final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != d_link )
                                  {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const45$isa ) ),
                                        sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
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
                                          final SubLObject _prev_bind_0_$88 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                            SubLObject iteration_state_$97;
                                            for( iteration_state_$97 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                                .do_dictionary_contents_doneP( iteration_state_$97 ); iteration_state_$97 = dictionary_contents.do_dictionary_contents_next( iteration_state_$97 ) )
                                            {
                                              thread.resetMultipleValues();
                                              final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$97 );
                                              final SubLObject link_nodes = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                              {
                                                final SubLObject _prev_bind_0_$89 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                  final SubLObject sol = link_nodes;
                                                  if( NIL != set.set_p( sol ) )
                                                  {
                                                    final SubLObject set_contents_var = set.do_set_internal( sol );
                                                    SubLObject basis_object;
                                                    SubLObject state_$99;
                                                    SubLObject template;
                                                    for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$99 = NIL, state_$99 = set_contents.do_set_contents_initial_state(
                                                        basis_object, set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state_$99 ); state_$99 = set_contents.do_set_contents_update_state(
                                                            state_$99 ) )
                                                    {
                                                      template = set_contents.do_set_contents_next( basis_object, state_$99 );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state_$99, template ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( template,
                                                          sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( template, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        if( NIL != forts.fort_p( template ) )
                                                        {
                                                          check_template_menu_item_parsing( template, domain_mt, done );
                                                        }
                                                      }
                                                    }
                                                  }
                                                  else if( sol.isList() )
                                                  {
                                                    SubLObject csome_list_var = sol;
                                                    SubLObject template2 = NIL;
                                                    template2 = csome_list_var.first();
                                                    while ( NIL != csome_list_var)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( template2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( template2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                        if( NIL != forts.fort_p( template2 ) )
                                                        {
                                                          check_template_menu_item_parsing( template2, domain_mt, done );
                                                        }
                                                      }
                                                      csome_list_var = csome_list_var.rest();
                                                      template2 = csome_list_var.first();
                                                    }
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$89, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state_$97 );
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$88, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                    }
                                  }
                                  else
                                  {
                                    sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                  if( NIL != sbhl_macros.do_sbhl_non_fort_linksP( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                  {
                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup( node );
                                    SubLObject instance_tuple = NIL;
                                    instance_tuple = csome_list_var2.first();
                                    while ( NIL != csome_list_var2)
                                    {
                                      SubLObject current;
                                      final SubLObject datum = current = instance_tuple;
                                      SubLObject link_node = NIL;
                                      SubLObject mt2 = NIL;
                                      SubLObject tv2 = NIL;
                                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
                                      link_node = current.first();
                                      current = current.rest();
                                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
                                      mt2 = current.first();
                                      current = current.rest();
                                      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list157 );
                                      tv2 = current.first();
                                      current = current.rest();
                                      if( NIL == current )
                                      {
                                        if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                        {
                                          final SubLObject _prev_bind_0_$90 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                            if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                            {
                                              final SubLObject _prev_bind_0_$91 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                final SubLObject sol;
                                                final SubLObject link_nodes2 = sol = ConsesLow.list( link_node );
                                                if( NIL != set.set_p( sol ) )
                                                {
                                                  final SubLObject set_contents_var = set.do_set_internal( sol );
                                                  SubLObject basis_object;
                                                  SubLObject template;
                                                  SubLObject state_$100;
                                                  for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state_$100 = NIL, state_$100 = set_contents.do_set_contents_initial_state(
                                                      basis_object, set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state_$100 ); state_$100 = set_contents.do_set_contents_update_state(
                                                          state_$100 ) )
                                                  {
                                                    template = set_contents.do_set_contents_next( basis_object, state_$100 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state_$100, template ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( template,
                                                        sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( template, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( template ) )
                                                      {
                                                        check_template_menu_item_parsing( template, domain_mt, done );
                                                      }
                                                    }
                                                  }
                                                }
                                                else if( sol.isList() )
                                                {
                                                  SubLObject csome_list_var_$103 = sol;
                                                  SubLObject template2 = NIL;
                                                  template2 = csome_list_var_$103.first();
                                                  while ( NIL != csome_list_var_$103)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( template2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( template2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                                      if( NIL != forts.fort_p( template2 ) )
                                                      {
                                                        check_template_menu_item_parsing( template2, domain_mt, done );
                                                      }
                                                    }
                                                    csome_list_var_$103 = csome_list_var_$103.rest();
                                                    template2 = csome_list_var_$103.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$91, thread );
                                              }
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$90, thread );
                                          }
                                        }
                                      }
                                      else
                                      {
                                        cdestructuring_bind.cdestructuring_bind_error( datum, $list157 );
                                      }
                                      csome_list_var2 = csome_list_var2.rest();
                                      instance_tuple = csome_list_var2.first();
                                    }
                                  }
                                }
                                else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                {
                                  SubLObject cdolist_list_var_$104;
                                  final SubLObject new_list = cdolist_list_var_$104 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                      .get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const45$isa ) ),
                                          sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                                      : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_module_utilities.get_sbhl_module_backward_direction( sbhl_module_vars.get_sbhl_module( $const45$isa ) ),
                                          sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                  SubLObject generating_fn = NIL;
                                  generating_fn = cdolist_list_var_$104.first();
                                  while ( NIL != cdolist_list_var_$104)
                                  {
                                    final SubLObject _prev_bind_0_$92 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                      final SubLObject sol2;
                                      final SubLObject link_nodes3 = sol2 = Functions.funcall( generating_fn, node );
                                      if( NIL != set.set_p( sol2 ) )
                                      {
                                        final SubLObject set_contents_var2 = set.do_set_internal( sol2 );
                                        SubLObject basis_object2;
                                        SubLObject state_$101;
                                        SubLObject template3;
                                        for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state_$101 = NIL, state_$101 = set_contents.do_set_contents_initial_state( basis_object2,
                                            set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state_$101 ); state_$101 = set_contents.do_set_contents_update_state( state_$101 ) )
                                        {
                                          template3 = set_contents.do_set_contents_next( basis_object2, state_$101 );
                                          if( NIL != set_contents.do_set_contents_element_validP( state_$101, template3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( template3,
                                              sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( template3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            if( NIL != forts.fort_p( template3 ) )
                                            {
                                              check_template_menu_item_parsing( template3, domain_mt, done );
                                            }
                                          }
                                        }
                                      }
                                      else if( sol2.isList() )
                                      {
                                        SubLObject csome_list_var3 = sol2;
                                        SubLObject template4 = NIL;
                                        template4 = csome_list_var3.first();
                                        while ( NIL != csome_list_var3)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( template4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( template4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                                            if( NIL != forts.fort_p( template4 ) )
                                            {
                                              check_template_menu_item_parsing( template4, domain_mt, done );
                                            }
                                          }
                                          csome_list_var3 = csome_list_var3.rest();
                                          template4 = csome_list_var3.first();
                                        }
                                      }
                                      else
                                      {
                                        Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$92, thread );
                                    }
                                    cdolist_list_var_$104 = cdolist_list_var_$104.rest();
                                    generating_fn = cdolist_list_var_$104.first();
                                  }
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$87, thread );
                                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$87, thread );
                              }
                              cdolist_list_var = cdolist_list_var.rest();
                              module_var = cdolist_list_var.first();
                            }
                            SubLObject cdolist_list_var2;
                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_module_vars.get_sbhl_module(
                                $const45$isa ) ) );
                            SubLObject module_var2 = NIL;
                            module_var2 = cdolist_list_var2.first();
                            while ( NIL != cdolist_list_var2)
                            {
                              final SubLObject _prev_bind_0_$93 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                              final SubLObject _prev_bind_1_$88 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                              try
                              {
                                sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                                sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean( NIL == sbhl_search_vars.$genl_inverse_mode_p$
                                    .getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                final SubLObject node2 = function_terms.naut_to_nart( node_var_$84 );
                                if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                                {
                                  final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                  if( NIL != d_link2 )
                                  {
                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                    if( NIL != mt_links2 )
                                    {
                                      SubLObject iteration_state2;
                                      for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                          iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                      {
                                        thread.resetMultipleValues();
                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                        {
                                          final SubLObject _prev_bind_0_$94 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                            SubLObject iteration_state_$98;
                                            for( iteration_state_$98 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                                .do_dictionary_contents_doneP( iteration_state_$98 ); iteration_state_$98 = dictionary_contents.do_dictionary_contents_next( iteration_state_$98 ) )
                                            {
                                              thread.resetMultipleValues();
                                              final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$98 );
                                              final SubLObject link_nodes4 = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                              {
                                                final SubLObject _prev_bind_0_$95 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                  final SubLObject sol3 = link_nodes4;
                                                  if( NIL != set.set_p( sol3 ) )
                                                  {
                                                    final SubLObject set_contents_var3 = set.do_set_internal( sol3 );
                                                    SubLObject basis_object3;
                                                    SubLObject state_$102;
                                                    SubLObject node_vars_link_node;
                                                    for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state_$102 = NIL, state_$102 = set_contents.do_set_contents_initial_state(
                                                        basis_object3, set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state_$102 ); state_$102 = set_contents.do_set_contents_update_state(
                                                            state_$102 ) )
                                                    {
                                                      node_vars_link_node = set_contents.do_set_contents_next( basis_object3, state_$102 );
                                                      if( NIL != set_contents.do_set_contents_element_validP( state_$102, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                          node_vars_link_node, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node, recur_deck );
                                                      }
                                                    }
                                                  }
                                                  else if( sol3.isList() )
                                                  {
                                                    SubLObject csome_list_var4 = sol3;
                                                    SubLObject node_vars_link_node2 = NIL;
                                                    node_vars_link_node2 = csome_list_var4.first();
                                                    while ( NIL != csome_list_var4)
                                                    {
                                                      if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                      {
                                                        sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                        deck.deck_push( node_vars_link_node2, recur_deck );
                                                      }
                                                      csome_list_var4 = csome_list_var4.rest();
                                                      node_vars_link_node2 = csome_list_var4.first();
                                                    }
                                                  }
                                                  else
                                                  {
                                                    Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                  }
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$95, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state_$98 );
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$94, thread );
                                          }
                                        }
                                      }
                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                    }
                                  }
                                  else
                                  {
                                    sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                  }
                                }
                                else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                                {
                                  SubLObject cdolist_list_var_$105;
                                  final SubLObject new_list2 = cdolist_list_var_$105 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                      .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars.get_sbhl_module(
                                          UNPROVIDED ) ) )
                                      : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                          sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                  SubLObject generating_fn2 = NIL;
                                  generating_fn2 = cdolist_list_var_$105.first();
                                  while ( NIL != cdolist_list_var_$105)
                                  {
                                    final SubLObject _prev_bind_0_$96 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                      final SubLObject sol4;
                                      final SubLObject link_nodes5 = sol4 = Functions.funcall( generating_fn2, node2 );
                                      if( NIL != set.set_p( sol4 ) )
                                      {
                                        final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                        SubLObject basis_object4;
                                        SubLObject state_$103;
                                        SubLObject node_vars_link_node3;
                                        for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state_$103 = NIL, state_$103 = set_contents.do_set_contents_initial_state( basis_object4,
                                            set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state_$103 ); state_$103 = set_contents.do_set_contents_update_state( state_$103 ) )
                                        {
                                          node_vars_link_node3 = set_contents.do_set_contents_next( basis_object4, state_$103 );
                                          if( NIL != set_contents.do_set_contents_element_validP( state_$103, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3,
                                              UNPROVIDED ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                            deck.deck_push( node_vars_link_node3, recur_deck );
                                          }
                                        }
                                      }
                                      else if( sol4.isList() )
                                      {
                                        SubLObject csome_list_var5 = sol4;
                                        SubLObject node_vars_link_node4 = NIL;
                                        node_vars_link_node4 = csome_list_var5.first();
                                        while ( NIL != csome_list_var5)
                                        {
                                          if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                          {
                                            sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                            deck.deck_push( node_vars_link_node4, recur_deck );
                                          }
                                          csome_list_var5 = csome_list_var5.rest();
                                          node_vars_link_node4 = csome_list_var5.first();
                                        }
                                      }
                                      else
                                      {
                                        Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$96, thread );
                                    }
                                    cdolist_list_var_$105 = cdolist_list_var_$105.rest();
                                    generating_fn2 = cdolist_list_var_$105.first();
                                  }
                                }
                              }
                              finally
                              {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$88, thread );
                                sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$93, thread );
                              }
                              cdolist_list_var2 = cdolist_list_var2.rest();
                              module_var2 = cdolist_list_var2.first();
                            }
                            node_var_$84 = deck.deck_pop( recur_deck );
                          }
                        }
                        finally
                        {
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$91, thread );
                          sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$86, thread );
                          sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$86, thread );
                        }
                      }
                      else
                      {
                        sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, template_type, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                            UNPROVIDED, UNPROVIDED, UNPROVIDED );
                      }
                    }
                    finally
                    {
                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_4, thread );
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$90, thread );
                      sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$85, thread );
                      sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$85, thread );
                    }
                  }
                  finally
                  {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$84, thread );
                    sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$84, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$83, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$98 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue( thread ) );
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$98, thread );
              }
            }
          }
          finally
          {
            sbhl_marking_vars.$sbhl_gather_space$.rebind( _prev_bind_1_$83, thread );
            sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$82, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$99 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$99, thread );
          }
        }
      }
      finally
      {
        memoization_state.$memoization_state$.rebind( _prev_bind_0_$81, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 63258L)
  public static SubLObject check_template_menu_item_parsing(final SubLObject template, SubLObject domain_mt, SubLObject done)
  {
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $const16$InferencePSC;
    }
    if( done == UNPROVIDED )
    {
      done = set.new_set( UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      final SubLObject formula = kb_mapping_utilities.fpred_value( template, $const143$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != formula )
      {
        SubLObject cdolist_list_var = cycl_utilities.arg_positions_if_bfs( $sym159$CONSTRAINT_COL_FOR_CONSTRAINT_TERM, formula, UNPROVIDED );
        SubLObject arg_pos = NIL;
        arg_pos = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          if( NIL == subl_promotions.memberP( arg_pos, kb_mapping_utilities.pred_values( template, $const145$focalTermPositionForFormulaTempla, UNPROVIDED, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQUAL ),
              Symbols.symbol_function( $sym158$REST ) ) && NIL == conses_high.member( arg_pos, kb_mapping_utilities.pred_values( template, $const151$templateReplacementsInvisibleForP, UNPROVIDED, UNPROVIDED,
                  UNPROVIDED ), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( $sym158$REST ) ) )
          {
            check_template_arg_pos_menu_item_parsing( template, arg_pos, formula, domain_mt, done );
          }
          cdolist_list_var = cdolist_list_var.rest();
          arg_pos = cdolist_list_var.first();
        }
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 63940L)
  public static SubLObject check_template_arg_pos_menu_item_parsing(final SubLObject template, final SubLObject arg_pos, SubLObject formula, SubLObject domain_mt, SubLObject done)
  {
    if( formula == UNPROVIDED )
    {
      formula = NIL;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $const16$InferencePSC;
    }
    if( done == UNPROVIDED )
    {
      done = set.new_set( UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != cycl_utilities.arg_position_p( arg_pos ) : arg_pos;
    if( NIL == formula )
    {
      final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
      final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
        formula = kb_mapping_utilities.fpred_value( template, $const143$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
      }
    }
    if( NIL != formula )
    {
      SubLObject found_replacement_gafP = NIL;
      final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
      final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding( thread );
      final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
      final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
      try
      {
        mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var2 ), thread );
        mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var2 ), thread );
        final SubLObject pred_var = $const149$candidateReplacementForPosition;
        if( NIL != kb_mapping_macros.do_gaf_arg_index_key_validator( template, NIL, pred_var ) )
        {
          final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator( template, NIL, pred_var );
          SubLObject done_var = NIL;
          final SubLObject token_var = NIL;
          while ( NIL == done_var)
          {
            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper( iterator_var, token_var );
            final SubLObject valid = makeBoolean( !token_var.eql( final_index_spec ) );
            if( NIL != valid )
            {
              SubLObject final_index_iterator = NIL;
              try
              {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator( final_index_spec, $kw44$GAF, NIL, NIL );
                SubLObject done_var_$119 = NIL;
                final SubLObject token_var_$120 = NIL;
                while ( NIL == done_var_$119)
                {
                  final SubLObject replacement_gaf = iteration.iteration_next_without_values_macro_helper( final_index_iterator, token_var_$120 );
                  final SubLObject valid_$121 = makeBoolean( !token_var_$120.eql( replacement_gaf ) );
                  if( NIL != valid_$121 && arg_pos.equal( cycl_utilities.nat_args( assertions_high.gaf_arg2( replacement_gaf ), UNPROVIDED ) ) )
                  {
                    found_replacement_gafP = T;
                    check_template_candidate_replacement_gaf_parsing( replacement_gaf, formula, domain_mt, done );
                  }
                  done_var_$119 = makeBoolean( NIL == valid_$121 );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$122 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != final_index_iterator )
                  {
                    kb_mapping_macros.destroy_final_index_iterator( final_index_iterator );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$122, thread );
                }
              }
            }
            done_var = makeBoolean( NIL == valid );
          }
        }
      }
      finally
      {
        mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_6, thread );
        mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_5, thread );
        mt_relevance_macros.$mt$.rebind( _prev_bind_4, thread );
      }
      if( NIL == found_replacement_gafP )
      {
        final SubLObject constraint_col = constraint_col_for_formula_arg_position( formula, arg_pos );
        check_template_arg_position_candidates( constraint_col, constraint_col, domain_mt, done );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 64924L)
  public static SubLObject check_template_candidate_replacement_gaf_parsing(final SubLObject replacement_gaf, SubLObject formula, SubLObject domain_mt, SubLObject done)
  {
    if( formula == UNPROVIDED )
    {
      formula = NIL;
    }
    if( domain_mt == UNPROVIDED )
    {
      domain_mt = $const16$InferencePSC;
    }
    if( done == UNPROVIDED )
    {
      done = set.new_set( UNPROVIDED, UNPROVIDED );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current;
    final SubLObject datum = current = assertions_high.gaf_args( replacement_gaf );
    SubLObject template = NIL;
    SubLObject el_arg_pos = NIL;
    SubLObject set_or_collection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list160 );
    template = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list160 );
    el_arg_pos = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list160 );
    set_or_collection = current.first();
    current = current.rest();
    if( NIL == current )
    {
      if( NIL == formula )
      {
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( domain_mt );
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
        try
        {
          mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
          mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
          mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
          formula = kb_mapping_utilities.fpred_value( template, $const143$formulaForFormulaTemplate, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
          mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
          mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
        }
      }
      if( NIL != formula )
      {
        final SubLObject arg_pos = el_arg_pos.rest();
        final SubLObject constraint_col = constraint_col_for_formula_arg_position( formula, arg_pos );
        if( NIL != constraint_col )
        {
          check_template_arg_position_candidates( set_or_collection, constraint_col, domain_mt, done );
        }
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list160 );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 65728L)
  public static SubLObject check_template_arg_position_candidates(final SubLObject set_or_collection, final SubLObject constraint_col, final SubLObject domain_mt, final SubLObject done)
  {
    SubLObject cdolist_list_var;
    final SubLObject candidates = cdolist_list_var = arg_position_candidates_memoized( set_or_collection, domain_mt, $int161$350 );
    SubLObject candidate = NIL;
    candidate = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == set.set_memberP( candidate, done ) )
      {
        check_template_candidate_replacement_parsing( candidate, constraint_col );
        set.set_add( candidate, done );
      }
      cdolist_list_var = cdolist_list_var.rest();
      candidate = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 66111L)
  public static SubLObject arg_position_candidates_memoized_internal(final SubLObject set_or_collection, final SubLObject domain_mt, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $int161$350;
    }
    if( NIL != forts.fort_p( set_or_collection ) && NIL == api_widgets.get_collection_extent_estimates( set_or_collection, domain_mt ).first() )
    {
      return NIL;
    }
    final SubLObject filtered = rkf_ontology_utilities.rkf_all_instantiations( set_or_collection, domain_mt );
    final SubLObject sorted = Sort.sort( filtered, Symbols.symbol_function( $sym163$_ ), Symbols.symbol_function( $sym164$NUM_INDEX ) );
    final SubLObject candidates = list_utilities.first_n( n, sorted );
    if( NIL == candidates )
    {
    }
    return candidates;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 66111L)
  public static SubLObject arg_position_candidates_memoized(final SubLObject set_or_collection, final SubLObject domain_mt, SubLObject n)
  {
    if( n == UNPROVIDED )
    {
      n = $int161$350;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return arg_position_candidates_memoized_internal( set_or_collection, domain_mt, n );
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym162$ARG_POSITION_CANDIDATES_MEMOIZED, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym162$ARG_POSITION_CANDIDATES_MEMOIZED, THREE_INTEGER, NIL, EQUAL, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym162$ARG_POSITION_CANDIDATES_MEMOIZED, caching_state );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_3( set_or_collection, domain_mt, n );
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
        if( set_or_collection.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( domain_mt.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( NIL != cached_args && NIL == cached_args.rest() && n.equal( cached_args.first() ) )
            {
              return memoization_state.caching_results( results2 );
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( arg_position_candidates_memoized_internal( set_or_collection, domain_mt, n ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( set_or_collection, domain_mt, n ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 66747L)
  public static SubLObject omit_from_fet_menuP(final SubLObject v_object)
  {
    return makeBoolean( NIL != nart_handles.nart_p( v_object ) || NIL != isa.isa_in_any_mtP( v_object, $const165$IndexicalConcept ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 66872L)
  public static SubLObject constraint_col_for_formula_arg_position(final SubLObject formula, final SubLObject arg_pos)
  {
    final SubLObject constraint_term = cycl_utilities.formula_arg_position( formula, arg_pos, UNPROVIDED );
    return constraint_col_for_constraint_term( constraint_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 67079L)
  public static SubLObject constraint_col_for_constraint_term(final SubLObject constraint_term)
  {
    if( NIL != el_utilities.el_formula_with_operator_p( constraint_term, $const107$SomeExampleFn ) )
    {
      return cycl_utilities.nat_arg1( constraint_term, UNPROVIDED );
    }
    if( NIL != el_utilities.el_formula_with_operator_p( constraint_term, $const166$SomeExampleSpecFn ) )
    {
      return ConsesLow.list( $const167$SpecsFn, cycl_utilities.nat_arg1( constraint_term, UNPROVIDED ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 67406L)
  public static SubLObject check_template_candidate_replacement_parsing(final SubLObject candidate, final SubLObject constraint_col)
  {
    SubLObject failed_phrases = NIL;
    SubLObject cdolist_list_var = pph_methods_lexicon.all_phrases_for_term( candidate, $list169, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject phrase = NIL;
    phrase = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject parsed = lexicon_accessors.typed_denots_of_string( phrase, constraint_col, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL == subl_promotions.memberP( candidate, parsed, UNPROVIDED, UNPROVIDED ) )
      {
        PrintLow.format( T, $str168$__Couldn_t_find__S___in_denots_of, new SubLObject[] { candidate, phrase, constraint_col, parsed
        } );
        failed_phrases = ConsesLow.cons( phrase, failed_phrases );
      }
      cdolist_list_var = cdolist_list_var.rest();
      phrase = cdolist_list_var.first();
    }
    return ( NIL != failed_phrases ) ? failed_phrases : $kw170$OK;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 68233L)
  public static SubLObject ftemplate_utilities_generate_example_template_topic_cases(SubLObject output_dir, SubLObject examples)
  {
    if( examples == UNPROVIDED )
    {
      examples = $ftemplate_utilities_example_template_topic_cases$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == string_utilities.ends_with( output_dir, $str172$_, UNPROVIDED ) )
    {
      output_dir = Sequences.cconcatenate( output_dir, $str172$_ );
    }
    SubLObject cdolist_list_var = examples;
    SubLObject example_template_topic = NIL;
    example_template_topic = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject output_filename = Sequences.cconcatenate( output_dir, new SubLObject[] { kb_paths.fort_name( example_template_topic ), $str173$_xml
      } );
      final SubLObject template_topic_mt = get_template_topic_loading_elmt( example_template_topic );
      if( NIL != hlmt.possibly_hlmt_p( template_topic_mt ) )
      {
        PrintLow.format( T, $str174$Generating__S_seen_from__S_into__, new SubLObject[] { example_template_topic, template_topic_mt, output_filename
        } );
        SubLObject stream = NIL;
        try
        {
          final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream = compatibility.open_text( output_filename, $kw175$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
          }
          if( !stream.isStream() )
          {
            Errors.error( $str176$Unable_to_open__S, output_filename );
          }
          final SubLObject s = stream;
          final SubLObject xml_string = api_widgets.get_template_topic_in_xml( example_template_topic, template_topic_mt );
          streams_high.write_string( xml_string, s, UNPROVIDED, UNPROVIDED );
        }
        finally
        {
          final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream.isStream() )
            {
              streams_high.close( stream, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
          }
        }
        PrintLow.format( T, $str177$_done__ );
      }
      cdolist_list_var = cdolist_list_var.rest();
      example_template_topic = cdolist_list_var.first();
    }
    return output_dir;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 69277L)
  public static SubLObject ftemplate_utilities_generate_example_instances_for_template_topic(SubLObject output_dir, final SubLObject collection, final SubLObject template_topic, final SubLObject elmt,
      SubLObject percentage)
  {
    if( percentage == UNPROVIDED )
    {
      percentage = $float49$0_1;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == string_utilities.ends_with( output_dir, $str172$_, UNPROVIDED ) )
    {
      output_dir = Sequences.cconcatenate( output_dir, $str172$_ );
    }
    if( ONE_INTEGER.numL( percentage ) )
    {
      percentage = Numbers.divide( percentage, $int178$100 );
    }
    final SubLObject template_topic_mt = get_template_topic_loading_elmt( template_topic );
    final SubLObject in_most_known_order = rkf_ontology_utilities.rkf_salient_instance_exemplars( collection, elmt, UNPROVIDED );
    final SubLObject top_n = Numbers.round( Numbers.multiply( percentage, Sequences.length( in_most_known_order ) ), UNPROVIDED );
    SubLObject cdolist_list_var;
    final SubLObject top_most_known = cdolist_list_var = list_utilities.first_n( top_n, in_most_known_order );
    SubLObject instance = NIL;
    instance = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject output_filename = Sequences.cconcatenate( output_dir, new SubLObject[] { kb_paths.fort_name( instance ), $str173$_xml
      } );
      PrintLow.format( T, $str174$Generating__S_seen_from__S_into__, new SubLObject[] { instance, elmt, output_filename
      } );
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( output_filename, $kw175$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str176$Unable_to_open__S, output_filename );
        }
        final SubLObject s = stream;
        streams_high.write_string( api_widgets.get_template_topic_assertions_for_match_in_xml( template_topic, template_topic_mt, elmt, instance, UNPROVIDED ), s, UNPROVIDED, UNPROVIDED );
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
      PrintLow.format( T, $str177$_done__ );
      cdolist_list_var = cdolist_list_var.rest();
      instance = cdolist_list_var.first();
    }
    return output_dir;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 71166L)
  public static SubLObject do_quick_fort_topics(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list179 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject topic = NIL;
    SubLObject fort = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list179 );
    topic = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list179 );
    fort = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject v_isa = $sym180$ISA;
      return ConsesLow.list( $sym181$WITH_ALL_MTS, ConsesLow.list( $sym182$DO_ALL_ISA, ConsesLow.list( v_isa, fort ), ConsesLow.listS( $sym183$CDOLIST, ConsesLow.list( topic, ConsesLow.listS( $sym184$PRED_VALUES, v_isa,
          $list185 ) ), ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list179 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/formula-template-utilities.lisp", position = 71455L)
  public static SubLObject gather_fet_stats()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject total = ZERO_INTEGER;
    SubLObject has_hand = ZERO_INTEGER;
    SubLObject has_induced = ZERO_INTEGER;
    SubLObject has_topic = ZERO_INTEGER;
    SubLObject has_both = ZERO_INTEGER;
    SubLObject could_have_topic = ZERO_INTEGER;
    final SubLObject promising = dictionary.new_dictionary( UNPROVIDED, UNPROVIDED );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
      final SubLObject message = $str186$mapping_Cyc_FORTs;
      final SubLObject total_$123 = forts.fort_count();
      SubLObject sofar = ZERO_INTEGER;
      final SubLObject _prev_bind_0_$124 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$125 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( message );
          SubLObject cdolist_list_var = forts.do_forts_tables();
          SubLObject table_var = NIL;
          table_var = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            final SubLObject idx = table_var;
            if( NIL == id_index.id_index_objects_empty_p( idx, $kw187$SKIP ) )
            {
              final SubLObject idx_$126 = idx;
              if( NIL == id_index.id_index_dense_objects_empty_p( idx_$126, $kw187$SKIP ) )
              {
                final SubLObject vector_var = id_index.id_index_dense_objects( idx_$126 );
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject fort;
                SubLObject has_handP;
                SubLObject has_inducedP;
                SubLObject _prev_bind_0_$125;
                SubLObject _prev_bind_1_$126;
                SubLObject node_var;
                SubLObject deck_type;
                SubLObject recur_deck;
                SubLObject _prev_bind_0_$126;
                SubLObject tv_var;
                SubLObject _prev_bind_0_$127;
                SubLObject _prev_bind_1_$127;
                SubLObject pcase_var;
                SubLObject _prev_bind_0_$128;
                SubLObject _prev_bind_1_$128;
                SubLObject _prev_bind_2_$134;
                SubLObject _prev_bind_3_$135;
                SubLObject _prev_bind_5;
                SubLObject _prev_bind_0_$129;
                SubLObject _prev_bind_1_$129;
                SubLObject _prev_bind_2_$135;
                SubLObject cdolist_list_var_$139;
                SubLObject accessible_modules;
                SubLObject module_var;
                SubLObject _prev_bind_0_$130;
                SubLObject _prev_bind_1_$130;
                SubLObject node;
                SubLObject d_link;
                SubLObject mt_links;
                SubLObject iteration_state;
                SubLObject mt;
                SubLObject tv_links;
                SubLObject _prev_bind_0_$131;
                SubLObject iteration_state_$143;
                SubLObject tv;
                SubLObject link_nodes;
                SubLObject _prev_bind_0_$132;
                SubLObject sol;
                SubLObject set_contents_var;
                SubLObject basis_object;
                SubLObject state;
                SubLObject node_vars_link_node;
                SubLObject csome_list_var;
                SubLObject node_vars_link_node2;
                SubLObject cdolist_list_var_$140;
                SubLObject new_list;
                SubLObject generating_fn;
                SubLObject _prev_bind_0_$133;
                SubLObject sol2;
                SubLObject link_nodes2;
                SubLObject set_contents_var2;
                SubLObject basis_object2;
                SubLObject state2;
                SubLObject node_vars_link_node3;
                SubLObject csome_list_var2;
                SubLObject node_vars_link_node4;
                SubLObject _prev_bind_0_$134;
                SubLObject _prev_bind_1_$131;
                SubLObject _prev_bind_2_$136;
                SubLObject v_isa;
                SubLObject cdolist_list_var_$141;
                SubLObject topic;
                SubLObject inducedP;
                SubLObject cdolist_list_var_$142;
                SubLObject accessible_modules2;
                SubLObject module_var2;
                SubLObject _prev_bind_0_$135;
                SubLObject _prev_bind_1_$132;
                SubLObject node2;
                SubLObject d_link2;
                SubLObject mt_links2;
                SubLObject iteration_state2;
                SubLObject mt2;
                SubLObject tv_links2;
                SubLObject _prev_bind_0_$136;
                SubLObject iteration_state_$144;
                SubLObject tv2;
                SubLObject link_nodes3;
                SubLObject _prev_bind_0_$137;
                SubLObject sol3;
                SubLObject set_contents_var3;
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject node_vars_link_node5;
                SubLObject csome_list_var3;
                SubLObject node_vars_link_node6;
                SubLObject cdolist_list_var_$143;
                SubLObject new_list2;
                SubLObject generating_fn2;
                SubLObject _prev_bind_0_$138;
                SubLObject sol4;
                SubLObject link_nodes4;
                SubLObject set_contents_var4;
                SubLObject basis_object4;
                SubLObject state4;
                SubLObject csome_list_var4;
                SubLObject node_vars_link_node7;
                SubLObject _prev_bind_0_$139;
                SubLObject _values;
                SubLObject could_have_topicP;
                SubLObject node_var2;
                SubLObject deck_type2;
                SubLObject recur_deck2;
                SubLObject _prev_bind_0_$140;
                SubLObject tv_var2;
                SubLObject _prev_bind_0_$141;
                SubLObject _prev_bind_1_$133;
                SubLObject pcase_var2;
                SubLObject _prev_bind_0_$142;
                SubLObject _prev_bind_1_$134;
                SubLObject _prev_bind_2_$137;
                SubLObject _prev_bind_3_$136;
                SubLObject _prev_bind_6;
                SubLObject _prev_bind_0_$143;
                SubLObject _prev_bind_1_$135;
                SubLObject _prev_bind_2_$138;
                SubLObject cdolist_list_var_$144;
                SubLObject accessible_modules3;
                SubLObject module_var3;
                SubLObject _prev_bind_0_$144;
                SubLObject _prev_bind_1_$136;
                SubLObject node3;
                SubLObject d_link3;
                SubLObject mt_links3;
                SubLObject iteration_state3;
                SubLObject mt3;
                SubLObject tv_links3;
                SubLObject _prev_bind_0_$145;
                SubLObject iteration_state_$145;
                SubLObject tv3;
                SubLObject _prev_bind_0_$146;
                SubLObject sol5;
                SubLObject set_contents_var5;
                SubLObject basis_object5;
                SubLObject state5;
                SubLObject node_vars_link_node8;
                SubLObject csome_list_var5;
                SubLObject node_vars_link_node9;
                SubLObject cdolist_list_var_$145;
                SubLObject new_list3;
                SubLObject generating_fn3;
                SubLObject _prev_bind_0_$147;
                SubLObject sol6;
                SubLObject link_nodes5;
                SubLObject set_contents_var6;
                SubLObject basis_object6;
                SubLObject state6;
                SubLObject node_vars_link_node10;
                SubLObject csome_list_var6;
                SubLObject node_vars_link_node11;
                SubLObject _prev_bind_0_$148;
                SubLObject _prev_bind_1_$137;
                SubLObject _prev_bind_2_$139;
                SubLObject v_isa2;
                SubLObject cdolist_list_var_$146;
                SubLObject accessible_modules4;
                SubLObject module_var4;
                SubLObject _prev_bind_0_$149;
                SubLObject _prev_bind_1_$138;
                SubLObject node4;
                SubLObject d_link4;
                SubLObject mt_links4;
                SubLObject iteration_state4;
                SubLObject mt4;
                SubLObject tv_links4;
                SubLObject _prev_bind_0_$150;
                SubLObject iteration_state_$146;
                SubLObject tv4;
                SubLObject link_nodes6;
                SubLObject _prev_bind_0_$151;
                SubLObject sol7;
                SubLObject set_contents_var7;
                SubLObject basis_object7;
                SubLObject state7;
                SubLObject node_vars_link_node12;
                SubLObject csome_list_var7;
                SubLObject cdolist_list_var_$147;
                SubLObject new_list4;
                SubLObject generating_fn4;
                SubLObject _prev_bind_0_$152;
                SubLObject sol8;
                SubLObject link_nodes7;
                SubLObject set_contents_var8;
                SubLObject basis_object8;
                SubLObject state8;
                SubLObject csome_list_var8;
                SubLObject _prev_bind_0_$153;
                SubLObject _values2;
                for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
                {
                  id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                  fort = Vectors.aref( vector_var, id );
                  if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw187$SKIP ) )
                  {
                    if( NIL != id_index.id_index_tombstone_p( fort ) )
                    {
                      fort = $kw187$SKIP;
                    }
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total_$123 );
                    total = Numbers.add( total, ONE_INTEGER );
                    has_handP = NIL;
                    has_inducedP = NIL;
                    _prev_bind_0_$125 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                    _prev_bind_1_$126 = mt_relevance_macros.$mt$.currentBinding( thread );
                    try
                    {
                      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
                      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
                      node_var = fort;
                      deck_type = $kw29$QUEUE;
                      recur_deck = deck.create_deck( deck_type );
                      _prev_bind_0_$126 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                      try
                      {
                        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                        try
                        {
                          tv_var = NIL;
                          _prev_bind_0_$127 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                          _prev_bind_1_$127 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var ) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread );
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ), thread );
                            if( NIL != tv_var && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var ) )
                            {
                              pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                              if( pcase_var.eql( $kw32$ERROR ) )
                              {
                                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var.eql( $kw35$CERROR ) )
                              {
                                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var.eql( $kw37$WARN ) )
                              {
                                Errors.warn( $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
                              }
                              else
                              {
                                Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                                Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var, $sym34$SBHL_TRUE_TV_P );
                              }
                            }
                            _prev_bind_0_$128 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                            _prev_bind_1_$128 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                            _prev_bind_2_$134 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                            _prev_bind_3_$135 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( fort, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                _prev_bind_0_$129 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                                _prev_bind_1_$129 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                _prev_bind_2_$135 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                  accessible_modules = ( cdolist_list_var_$139 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$isa ) ) );
                                  module_var = NIL;
                                  module_var = cdolist_list_var_$139.first();
                                  while ( NIL != cdolist_list_var_$139)
                                  {
                                    _prev_bind_0_$130 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                    _prev_bind_1_$130 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_module_vars.$sbhl_module$.bind( module_var, thread );
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                          NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                      node = function_terms.naut_to_nart( node_var );
                                      if( NIL != sbhl_link_vars.sbhl_node_object_p( node ) )
                                      {
                                        d_link = sbhl_graphs.get_sbhl_graph_link( node, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                        if( NIL != d_link )
                                        {
                                          mt_links = sbhl_links.get_sbhl_mt_links( d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                          if( NIL != mt_links )
                                          {
                                            for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links ) ); NIL == dictionary_contents.do_dictionary_contents_doneP(
                                                iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
                                            {
                                              thread.resetMultipleValues();
                                              mt = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                                              tv_links = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != mt_relevance_macros.relevant_mtP( mt ) )
                                              {
                                                _prev_bind_0_$131 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt, thread );
                                                  for( iteration_state_$143 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links ) ); NIL == dictionary_contents
                                                      .do_dictionary_contents_doneP( iteration_state_$143 ); iteration_state_$143 = dictionary_contents.do_dictionary_contents_next( iteration_state_$143 ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    tv = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$143 );
                                                    link_nodes = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv ) )
                                                    {
                                                      _prev_bind_0_$132 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv, thread );
                                                        sol = link_nodes;
                                                        if( NIL != set.set_p( sol ) )
                                                        {
                                                          set_contents_var = set.do_set_internal( sol );
                                                          for( basis_object = set_contents.do_set_contents_basis_object( set_contents_var ), state = NIL, state = set_contents.do_set_contents_initial_state( basis_object,
                                                              set_contents_var ); NIL == set_contents.do_set_contents_doneP( basis_object, state ); state = set_contents.do_set_contents_update_state( state ) )
                                                          {
                                                            node_vars_link_node = set_contents.do_set_contents_next( basis_object, state );
                                                            if( NIL != set_contents.do_set_contents_element_validP( state, node_vars_link_node ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                node_vars_link_node, UNPROVIDED ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                              deck.deck_push( node_vars_link_node, recur_deck );
                                                            }
                                                          }
                                                        }
                                                        else if( sol.isList() )
                                                        {
                                                          csome_list_var = sol;
                                                          node_vars_link_node2 = NIL;
                                                          node_vars_link_node2 = csome_list_var.first();
                                                          while ( NIL != csome_list_var)
                                                          {
                                                            if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node2, UNPROVIDED ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                              deck.deck_push( node_vars_link_node2, recur_deck );
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            node_vars_link_node2 = csome_list_var.first();
                                                          }
                                                        }
                                                        else
                                                        {
                                                          Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol );
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$132, thread );
                                                      }
                                                    }
                                                  }
                                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$143 );
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$131, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state );
                                          }
                                        }
                                        else
                                        {
                                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                        }
                                      }
                                      else if( NIL != obsolete.cnat_p( node, UNPROVIDED ) )
                                      {
                                        new_list = ( cdolist_list_var_$140 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                .get_sbhl_module( UNPROVIDED ) ) )
                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) ) );
                                        generating_fn = NIL;
                                        generating_fn = cdolist_list_var_$140.first();
                                        while ( NIL != cdolist_list_var_$140)
                                        {
                                          _prev_bind_0_$133 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn, thread );
                                            link_nodes2 = ( sol2 = Functions.funcall( generating_fn, node ) );
                                            if( NIL != set.set_p( sol2 ) )
                                            {
                                              set_contents_var2 = set.do_set_internal( sol2 );
                                              for( basis_object2 = set_contents.do_set_contents_basis_object( set_contents_var2 ), state2 = NIL, state2 = set_contents.do_set_contents_initial_state( basis_object2,
                                                  set_contents_var2 ); NIL == set_contents.do_set_contents_doneP( basis_object2, state2 ); state2 = set_contents.do_set_contents_update_state( state2 ) )
                                              {
                                                node_vars_link_node3 = set_contents.do_set_contents_next( basis_object2, state2 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state2, node_vars_link_node3 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                    node_vars_link_node3, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node3, recur_deck );
                                                }
                                              }
                                            }
                                            else if( sol2.isList() )
                                            {
                                              csome_list_var2 = sol2;
                                              node_vars_link_node4 = NIL;
                                              node_vars_link_node4 = csome_list_var2.first();
                                              while ( NIL != csome_list_var2)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node4, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node4, recur_deck );
                                                }
                                                csome_list_var2 = csome_list_var2.rest();
                                                node_vars_link_node4 = csome_list_var2.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol2 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$133, thread );
                                          }
                                          cdolist_list_var_$140 = cdolist_list_var_$140.rest();
                                          generating_fn = cdolist_list_var_$140.first();
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$130, thread );
                                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$130, thread );
                                    }
                                    cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                                    module_var = cdolist_list_var_$139.first();
                                  }
                                  node_var = deck.deck_pop( recur_deck );
                                  _prev_bind_0_$134 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                  _prev_bind_1_$131 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                  _prev_bind_2_$136 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_search_vars.get_sbhl_search_module() ), thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                                    while ( NIL != node_var)
                                    {
                                      v_isa = node_var;
                                      cdolist_list_var_$141 = kb_mapping_utilities.pred_values( v_isa, $const63$templateTypeForFocalTermType, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                      topic = NIL;
                                      topic = cdolist_list_var_$141.first();
                                      while ( NIL != cdolist_list_var_$141)
                                      {
                                        if( NIL == has_handP || NIL == has_inducedP )
                                        {
                                          inducedP = isa.isaP( topic, $const188$InducedFormulaTemplateTopicType, UNPROVIDED, UNPROVIDED );
                                          if( NIL != inducedP )
                                          {
                                            has_inducedP = T;
                                          }
                                          else
                                          {
                                            has_handP = T;
                                          }
                                        }
                                        cdolist_list_var_$141 = cdolist_list_var_$141.rest();
                                        topic = cdolist_list_var_$141.first();
                                      }
                                      accessible_modules2 = ( cdolist_list_var_$142 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                      module_var2 = NIL;
                                      module_var2 = cdolist_list_var_$142.first();
                                      while ( NIL != cdolist_list_var_$142)
                                      {
                                        _prev_bind_0_$135 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                        _prev_bind_1_$132 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_module_vars.$sbhl_module$.bind( module_var2, thread );
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                              NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                          node2 = function_terms.naut_to_nart( node_var );
                                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node2 ) )
                                          {
                                            d_link2 = sbhl_graphs.get_sbhl_graph_link( node2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                            if( NIL != d_link2 )
                                            {
                                              mt_links2 = sbhl_links.get_sbhl_mt_links( d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                              if( NIL != mt_links2 )
                                              {
                                                for( iteration_state2 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links2 ) ); NIL == dictionary_contents
                                                    .do_dictionary_contents_doneP( iteration_state2 ); iteration_state2 = dictionary_contents.do_dictionary_contents_next( iteration_state2 ) )
                                                {
                                                  thread.resetMultipleValues();
                                                  mt2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state2 );
                                                  tv_links2 = thread.secondMultipleValue();
                                                  thread.resetMultipleValues();
                                                  if( NIL != mt_relevance_macros.relevant_mtP( mt2 ) )
                                                  {
                                                    _prev_bind_0_$136 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                    try
                                                    {
                                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt2, thread );
                                                      for( iteration_state_$144 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links2 ) ); NIL == dictionary_contents
                                                          .do_dictionary_contents_doneP( iteration_state_$144 ); iteration_state_$144 = dictionary_contents.do_dictionary_contents_next( iteration_state_$144 ) )
                                                      {
                                                        thread.resetMultipleValues();
                                                        tv2 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$144 );
                                                        link_nodes3 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv2 ) )
                                                        {
                                                          _prev_bind_0_$137 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                          try
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv2, thread );
                                                            sol3 = link_nodes3;
                                                            if( NIL != set.set_p( sol3 ) )
                                                            {
                                                              set_contents_var3 = set.do_set_internal( sol3 );
                                                              for( basis_object3 = set_contents.do_set_contents_basis_object( set_contents_var3 ), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(
                                                                  basis_object3, set_contents_var3 ); NIL == set_contents.do_set_contents_doneP( basis_object3, state3 ); state3 = set_contents
                                                                      .do_set_contents_update_state( state3 ) )
                                                              {
                                                                node_vars_link_node5 = set_contents.do_set_contents_next( basis_object3, state3 );
                                                                if( NIL != set_contents.do_set_contents_element_validP( state3, node_vars_link_node5 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                    node_vars_link_node5, UNPROVIDED ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node5, UNPROVIDED );
                                                                  deck.deck_push( node_vars_link_node5, recur_deck );
                                                                }
                                                              }
                                                            }
                                                            else if( sol3.isList() )
                                                            {
                                                              csome_list_var3 = sol3;
                                                              node_vars_link_node6 = NIL;
                                                              node_vars_link_node6 = csome_list_var3.first();
                                                              while ( NIL != csome_list_var3)
                                                              {
                                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node6, UNPROVIDED ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node6, UNPROVIDED );
                                                                  deck.deck_push( node_vars_link_node6, recur_deck );
                                                                }
                                                                csome_list_var3 = csome_list_var3.rest();
                                                                node_vars_link_node6 = csome_list_var3.first();
                                                              }
                                                            }
                                                            else
                                                            {
                                                              Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol3 );
                                                            }
                                                          }
                                                          finally
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$137, thread );
                                                          }
                                                        }
                                                      }
                                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$144 );
                                                    }
                                                    finally
                                                    {
                                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$136, thread );
                                                    }
                                                  }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize( iteration_state2 );
                                              }
                                            }
                                            else
                                            {
                                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                            }
                                          }
                                          else if( NIL != obsolete.cnat_p( node2, UNPROVIDED ) )
                                          {
                                            new_list2 = ( cdolist_list_var_$143 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                    .get_sbhl_module( UNPROVIDED ) ) )
                                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) ) );
                                            generating_fn2 = NIL;
                                            generating_fn2 = cdolist_list_var_$143.first();
                                            while ( NIL != cdolist_list_var_$143)
                                            {
                                              _prev_bind_0_$138 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn2, thread );
                                                link_nodes4 = ( sol4 = Functions.funcall( generating_fn2, node2 ) );
                                                if( NIL != set.set_p( sol4 ) )
                                                {
                                                  set_contents_var4 = set.do_set_internal( sol4 );
                                                  for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state( basis_object4,
                                                      set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state( state4 ) )
                                                  {
                                                    node_vars_link_node2 = set_contents.do_set_contents_next( basis_object4, state4 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node2 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node2, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node2, recur_deck );
                                                    }
                                                  }
                                                }
                                                else if( sol4.isList() )
                                                {
                                                  csome_list_var4 = sol4;
                                                  node_vars_link_node7 = NIL;
                                                  node_vars_link_node7 = csome_list_var4.first();
                                                  while ( NIL != csome_list_var4)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node7, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node7, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node7, recur_deck );
                                                    }
                                                    csome_list_var4 = csome_list_var4.rest();
                                                    node_vars_link_node7 = csome_list_var4.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$138, thread );
                                              }
                                              cdolist_list_var_$143 = cdolist_list_var_$143.rest();
                                              generating_fn2 = cdolist_list_var_$143.first();
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$132, thread );
                                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$135, thread );
                                        }
                                        cdolist_list_var_$142 = cdolist_list_var_$142.rest();
                                        module_var2 = cdolist_list_var_$142.first();
                                      }
                                      node_var = deck.deck_pop( recur_deck );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$136, thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$131, thread );
                                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$134, thread );
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$135, thread );
                                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$129, thread );
                                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$129, thread );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, fort, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            finally
                            {
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_5, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$135, thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$134, thread );
                              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$128, thread );
                              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$128, thread );
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$127, thread );
                            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$127, thread );
                          }
                        }
                        finally
                        {
                          _prev_bind_0_$139 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                            Values.restoreValuesFromVector( _values );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$139, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$126, thread );
                      }
                    }
                    finally
                    {
                      mt_relevance_macros.$mt$.rebind( _prev_bind_1_$126, thread );
                      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$125, thread );
                    }
                    if( NIL != has_inducedP && NIL != has_handP )
                    {
                      has_induced = Numbers.add( has_induced, ONE_INTEGER );
                      has_hand = Numbers.add( has_hand, ONE_INTEGER );
                      has_topic = Numbers.add( has_topic, ONE_INTEGER );
                      has_both = Numbers.add( has_both, ONE_INTEGER );
                    }
                    else if( NIL != has_inducedP )
                    {
                      has_induced = Numbers.add( has_induced, ONE_INTEGER );
                      has_topic = Numbers.add( has_topic, ONE_INTEGER );
                    }
                    else if( NIL != has_handP )
                    {
                      has_hand = Numbers.add( has_hand, ONE_INTEGER );
                      has_topic = Numbers.add( has_topic, ONE_INTEGER );
                    }
                    else
                    {
                      could_have_topicP = NIL;
                      node_var2 = fort;
                      deck_type2 = $kw29$QUEUE;
                      recur_deck2 = deck.create_deck( deck_type2 );
                      _prev_bind_0_$140 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                      try
                      {
                        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                        try
                        {
                          tv_var2 = NIL;
                          _prev_bind_0_$141 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                          _prev_bind_1_$133 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var2 ) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread );
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var2 ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ),
                                thread );
                            if( NIL != tv_var2 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var2 ) )
                            {
                              pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                              if( pcase_var2.eql( $kw32$ERROR ) )
                              {
                                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var2, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var2.eql( $kw35$CERROR ) )
                              {
                                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var2, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var2.eql( $kw37$WARN ) )
                              {
                                Errors.warn( $str33$_A_is_not_a__A, tv_var2, $sym34$SBHL_TRUE_TV_P );
                              }
                              else
                              {
                                Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                                Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var2, $sym34$SBHL_TRUE_TV_P );
                              }
                            }
                            _prev_bind_0_$142 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                            _prev_bind_1_$134 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                            _prev_bind_2_$137 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                            _prev_bind_3_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            _prev_bind_6 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( fort, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                _prev_bind_0_$143 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                                _prev_bind_1_$135 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                _prev_bind_2_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                  accessible_modules3 = ( cdolist_list_var_$144 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$isa ) ) );
                                  module_var3 = NIL;
                                  module_var3 = cdolist_list_var_$144.first();
                                  while ( NIL != cdolist_list_var_$144)
                                  {
                                    _prev_bind_0_$144 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                    _prev_bind_1_$136 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_module_vars.$sbhl_module$.bind( module_var3, thread );
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                          NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                      node3 = function_terms.naut_to_nart( node_var2 );
                                      if( NIL != sbhl_link_vars.sbhl_node_object_p( node3 ) )
                                      {
                                        d_link3 = sbhl_graphs.get_sbhl_graph_link( node3, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                        if( NIL != d_link3 )
                                        {
                                          mt_links3 = sbhl_links.get_sbhl_mt_links( d_link3, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                          if( NIL != mt_links3 )
                                          {
                                            for( iteration_state3 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links3 ) ); NIL == dictionary_contents
                                                .do_dictionary_contents_doneP( iteration_state3 ); iteration_state3 = dictionary_contents.do_dictionary_contents_next( iteration_state3 ) )
                                            {
                                              thread.resetMultipleValues();
                                              mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state3 );
                                              tv_links3 = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                              {
                                                _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                                  for( iteration_state_$145 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links3 ) ); NIL == dictionary_contents
                                                      .do_dictionary_contents_doneP( iteration_state_$145 ); iteration_state_$145 = dictionary_contents.do_dictionary_contents_next( iteration_state_$145 ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    tv3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$145 );
                                                    link_nodes4 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv3 ) )
                                                    {
                                                      _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv3, thread );
                                                        sol5 = link_nodes4;
                                                        if( NIL != set.set_p( sol5 ) )
                                                        {
                                                          set_contents_var5 = set.do_set_internal( sol5 );
                                                          for( basis_object5 = set_contents.do_set_contents_basis_object( set_contents_var5 ), state5 = NIL, state5 = set_contents.do_set_contents_initial_state(
                                                              basis_object5, set_contents_var5 ); NIL == set_contents.do_set_contents_doneP( basis_object5, state5 ); state5 = set_contents.do_set_contents_update_state(
                                                                  state5 ) )
                                                          {
                                                            node_vars_link_node8 = set_contents.do_set_contents_next( basis_object5, state5 );
                                                            if( NIL != set_contents.do_set_contents_element_validP( state5, node_vars_link_node8 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                node_vars_link_node8, UNPROVIDED ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node8, UNPROVIDED );
                                                              deck.deck_push( node_vars_link_node8, recur_deck2 );
                                                            }
                                                          }
                                                        }
                                                        else if( sol5.isList() )
                                                        {
                                                          csome_list_var5 = sol5;
                                                          node_vars_link_node9 = NIL;
                                                          node_vars_link_node9 = csome_list_var5.first();
                                                          while ( NIL != csome_list_var5)
                                                          {
                                                            if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node9, UNPROVIDED ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node9, UNPROVIDED );
                                                              deck.deck_push( node_vars_link_node9, recur_deck2 );
                                                            }
                                                            csome_list_var5 = csome_list_var5.rest();
                                                            node_vars_link_node9 = csome_list_var5.first();
                                                          }
                                                        }
                                                        else
                                                        {
                                                          Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol5 );
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$146, thread );
                                                      }
                                                    }
                                                  }
                                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$145 );
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$145, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state3 );
                                          }
                                        }
                                        else
                                        {
                                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                        }
                                      }
                                      else if( NIL != obsolete.cnat_p( node3, UNPROVIDED ) )
                                      {
                                        new_list3 = ( cdolist_list_var_$145 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                .get_sbhl_module( UNPROVIDED ) ) )
                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) ) );
                                        generating_fn3 = NIL;
                                        generating_fn3 = cdolist_list_var_$145.first();
                                        while ( NIL != cdolist_list_var_$145)
                                        {
                                          _prev_bind_0_$147 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn3, thread );
                                            link_nodes5 = ( sol6 = Functions.funcall( generating_fn3, node3 ) );
                                            if( NIL != set.set_p( sol6 ) )
                                            {
                                              set_contents_var6 = set.do_set_internal( sol6 );
                                              for( basis_object6 = set_contents.do_set_contents_basis_object( set_contents_var6 ), state6 = NIL, state6 = set_contents.do_set_contents_initial_state( basis_object6,
                                                  set_contents_var6 ); NIL == set_contents.do_set_contents_doneP( basis_object6, state6 ); state6 = set_contents.do_set_contents_update_state( state6 ) )
                                              {
                                                node_vars_link_node10 = set_contents.do_set_contents_next( basis_object6, state6 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state6, node_vars_link_node10 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                    node_vars_link_node10, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node10, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node10, recur_deck2 );
                                                }
                                              }
                                            }
                                            else if( sol6.isList() )
                                            {
                                              csome_list_var6 = sol6;
                                              node_vars_link_node11 = NIL;
                                              node_vars_link_node11 = csome_list_var6.first();
                                              while ( NIL != csome_list_var6)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node11, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node11, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node11, recur_deck2 );
                                                }
                                                csome_list_var6 = csome_list_var6.rest();
                                                node_vars_link_node11 = csome_list_var6.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol6 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$147, thread );
                                          }
                                          cdolist_list_var_$145 = cdolist_list_var_$145.rest();
                                          generating_fn3 = cdolist_list_var_$145.first();
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$136, thread );
                                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$144, thread );
                                    }
                                    cdolist_list_var_$144 = cdolist_list_var_$144.rest();
                                    module_var3 = cdolist_list_var_$144.first();
                                  }
                                  node_var2 = deck.deck_pop( recur_deck2 );
                                  _prev_bind_0_$148 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                  _prev_bind_1_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                  _prev_bind_2_$139 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_search_vars.get_sbhl_search_module() ), thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                                    while ( NIL != node_var2)
                                    {
                                      v_isa2 = node_var2;
                                      if( NIL == could_have_topicP && NIL != kb_mapping_utilities.some_pred_value( v_isa2, $const189$keInducedStrongSuggestionPreds, UNPROVIDED, UNPROVIDED ) && NIL != kb_mapping_utilities
                                          .some_pred_value( v_isa2, $const190$keInducedWeakSuggestionPreds, UNPROVIDED, UNPROVIDED ) && NIL != kb_mapping_utilities.some_pred_value( v_isa2,
                                              $const191$keInducedSuggestionPreds, UNPROVIDED, UNPROVIDED ) )
                                      {
                                        could_have_topicP = T;
                                        dictionary_utilities.dictionary_increment( promising, v_isa2, UNPROVIDED );
                                      }
                                      accessible_modules4 = ( cdolist_list_var_$146 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                      module_var4 = NIL;
                                      module_var4 = cdolist_list_var_$146.first();
                                      while ( NIL != cdolist_list_var_$146)
                                      {
                                        _prev_bind_0_$149 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                        _prev_bind_1_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_module_vars.$sbhl_module$.bind( module_var4, thread );
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                              NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                          node4 = function_terms.naut_to_nart( node_var2 );
                                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node4 ) )
                                          {
                                            d_link4 = sbhl_graphs.get_sbhl_graph_link( node4, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                            if( NIL != d_link4 )
                                            {
                                              mt_links4 = sbhl_links.get_sbhl_mt_links( d_link4, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                              if( NIL != mt_links4 )
                                              {
                                                for( iteration_state4 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links4 ) ); NIL == dictionary_contents
                                                    .do_dictionary_contents_doneP( iteration_state4 ); iteration_state4 = dictionary_contents.do_dictionary_contents_next( iteration_state4 ) )
                                                {
                                                  thread.resetMultipleValues();
                                                  mt4 = dictionary_contents.do_dictionary_contents_key_value( iteration_state4 );
                                                  tv_links4 = thread.secondMultipleValue();
                                                  thread.resetMultipleValues();
                                                  if( NIL != mt_relevance_macros.relevant_mtP( mt4 ) )
                                                  {
                                                    _prev_bind_0_$150 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                    try
                                                    {
                                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt4, thread );
                                                      for( iteration_state_$146 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links4 ) ); NIL == dictionary_contents
                                                          .do_dictionary_contents_doneP( iteration_state_$146 ); iteration_state_$146 = dictionary_contents.do_dictionary_contents_next( iteration_state_$146 ) )
                                                      {
                                                        thread.resetMultipleValues();
                                                        tv4 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$146 );
                                                        link_nodes6 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv4 ) )
                                                        {
                                                          _prev_bind_0_$151 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                          try
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv4, thread );
                                                            sol7 = link_nodes6;
                                                            if( NIL != set.set_p( sol7 ) )
                                                            {
                                                              set_contents_var7 = set.do_set_internal( sol7 );
                                                              for( basis_object7 = set_contents.do_set_contents_basis_object( set_contents_var7 ), state7 = NIL, state7 = set_contents.do_set_contents_initial_state(
                                                                  basis_object7, set_contents_var7 ); NIL == set_contents.do_set_contents_doneP( basis_object7, state7 ); state7 = set_contents
                                                                      .do_set_contents_update_state( state7 ) )
                                                              {
                                                                node_vars_link_node12 = set_contents.do_set_contents_next( basis_object7, state7 );
                                                                if( NIL != set_contents.do_set_contents_element_validP( state7, node_vars_link_node12 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                    node_vars_link_node12, UNPROVIDED ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node12, UNPROVIDED );
                                                                  deck.deck_push( node_vars_link_node12, recur_deck2 );
                                                                }
                                                              }
                                                            }
                                                            else if( sol7.isList() )
                                                            {
                                                              csome_list_var7 = sol7;
                                                              node_vars_link_node = NIL;
                                                              node_vars_link_node = csome_list_var7.first();
                                                              while ( NIL != csome_list_var7)
                                                              {
                                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node, UNPROVIDED ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                                  deck.deck_push( node_vars_link_node, recur_deck2 );
                                                                }
                                                                csome_list_var7 = csome_list_var7.rest();
                                                                node_vars_link_node = csome_list_var7.first();
                                                              }
                                                            }
                                                            else
                                                            {
                                                              Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol7 );
                                                            }
                                                          }
                                                          finally
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$151, thread );
                                                          }
                                                        }
                                                      }
                                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$146 );
                                                    }
                                                    finally
                                                    {
                                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$150, thread );
                                                    }
                                                  }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize( iteration_state4 );
                                              }
                                            }
                                            else
                                            {
                                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                            }
                                          }
                                          else if( NIL != obsolete.cnat_p( node4, UNPROVIDED ) )
                                          {
                                            new_list4 = ( cdolist_list_var_$147 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                    .get_sbhl_module( UNPROVIDED ) ) )
                                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) ) );
                                            generating_fn4 = NIL;
                                            generating_fn4 = cdolist_list_var_$147.first();
                                            while ( NIL != cdolist_list_var_$147)
                                            {
                                              _prev_bind_0_$152 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn4, thread );
                                                link_nodes7 = ( sol8 = Functions.funcall( generating_fn4, node4 ) );
                                                if( NIL != set.set_p( sol8 ) )
                                                {
                                                  set_contents_var8 = set.do_set_internal( sol8 );
                                                  for( basis_object8 = set_contents.do_set_contents_basis_object( set_contents_var8 ), state8 = NIL, state8 = set_contents.do_set_contents_initial_state( basis_object8,
                                                      set_contents_var8 ); NIL == set_contents.do_set_contents_doneP( basis_object8, state8 ); state8 = set_contents.do_set_contents_update_state( state8 ) )
                                                  {
                                                    node_vars_link_node9 = set_contents.do_set_contents_next( basis_object8, state8 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state8, node_vars_link_node9 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node9, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node9, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node9, recur_deck2 );
                                                    }
                                                  }
                                                }
                                                else if( sol8.isList() )
                                                {
                                                  csome_list_var8 = sol8;
                                                  node_vars_link_node3 = NIL;
                                                  node_vars_link_node3 = csome_list_var8.first();
                                                  while ( NIL != csome_list_var8)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node3, recur_deck2 );
                                                    }
                                                    csome_list_var8 = csome_list_var8.rest();
                                                    node_vars_link_node3 = csome_list_var8.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol8 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$152, thread );
                                              }
                                              cdolist_list_var_$147 = cdolist_list_var_$147.rest();
                                              generating_fn4 = cdolist_list_var_$147.first();
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$138, thread );
                                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$149, thread );
                                        }
                                        cdolist_list_var_$146 = cdolist_list_var_$146.rest();
                                        module_var4 = cdolist_list_var_$146.first();
                                      }
                                      node_var2 = deck.deck_pop( recur_deck2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$139, thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$137, thread );
                                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$148, thread );
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$138, thread );
                                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$135, thread );
                                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$143, thread );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, fort, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            finally
                            {
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_6, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$136, thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$137, thread );
                              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$134, thread );
                              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$142, thread );
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$133, thread );
                            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$141, thread );
                          }
                        }
                        finally
                        {
                          _prev_bind_0_$153 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            _values2 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                            Values.restoreValuesFromVector( _values2 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$153, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$140, thread );
                      }
                      if( NIL != could_have_topicP )
                      {
                        could_have_topic = Numbers.add( could_have_topic, ONE_INTEGER );
                      }
                    }
                    if( Numbers.mod( total, $int192$1000 ).isZero() )
                    {
                      PrintLow.format( T, $str193$__Total___S_Have_topic___S___4F__, new SubLObject[] { total, has_topic, Numbers.multiply( $int178$100, Numbers.divide( has_topic, total ) ), could_have_topic, Numbers
                          .multiply( $int178$100, Numbers.divide( could_have_topic, total ) )
                      } );
                      PrintLow.format( T, $str194$__Hand___S___4F___Induced___S___4, new SubLObject[] { has_hand, Numbers.multiply( $int178$100, Numbers.divide( has_hand, total ) ), has_induced, Numbers.multiply(
                          $int178$100, Numbers.divide( has_induced, total ) ), has_both, Numbers.multiply( $int178$100, Numbers.divide( has_both, total ) )
                      } );
                      format_nil.print_one_per_line( list_utilities.first_n( TEN_INTEGER, dictionary_utilities.sort_dictionary_by_values( promising, Symbols.symbol_function( $sym163$_ ) ) ), UNPROVIDED );
                    }
                  }
                }
              }
              final SubLObject idx_$127 = idx;
              if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$127 ) || NIL == id_index.id_index_skip_tombstones_p( $kw187$SKIP ) )
              {
                final SubLObject sparse = id_index.id_index_sparse_objects( idx_$127 );
                SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$127 );
                final SubLObject end_id = id_index.id_index_next_id( idx_$127 );
                final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw187$SKIP ) ) ? NIL : $kw187$SKIP;
                while ( id2.numL( end_id ))
                {
                  final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                  if( NIL == id_index.id_index_skip_tombstones_p( $kw187$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                  {
                    sofar = Numbers.add( sofar, ONE_INTEGER );
                    utilities_macros.note_percent_progress( sofar, total_$123 );
                    total = Numbers.add( total, ONE_INTEGER );
                    SubLObject has_handP2 = NIL;
                    SubLObject has_inducedP2 = NIL;
                    final SubLObject _prev_bind_0_$154 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
                    final SubLObject _prev_bind_1_$139 = mt_relevance_macros.$mt$.currentBinding( thread );
                    try
                    {
                      mt_relevance_macros.$relevant_mt_function$.bind( $sym0$RELEVANT_MT_IS_EVERYTHING, thread );
                      mt_relevance_macros.$mt$.bind( $const1$EverythingPSC, thread );
                      SubLObject node_var2 = fort2;
                      final SubLObject deck_type2 = $kw29$QUEUE;
                      final SubLObject recur_deck2 = deck.create_deck( deck_type2 );
                      final SubLObject _prev_bind_0_$155 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                      try
                      {
                        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                        try
                        {
                          final SubLObject tv_var2 = NIL;
                          final SubLObject _prev_bind_0_$156 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$140 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var2 ) ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread );
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var2 ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ),
                                thread );
                            if( NIL != tv_var2 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var2 ) )
                            {
                              final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                              if( pcase_var2.eql( $kw32$ERROR ) )
                              {
                                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var2, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var2.eql( $kw35$CERROR ) )
                              {
                                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var2, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var2.eql( $kw37$WARN ) )
                              {
                                Errors.warn( $str33$_A_is_not_a__A, tv_var2, $sym34$SBHL_TRUE_TV_P );
                              }
                              else
                              {
                                Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                                Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var2, $sym34$SBHL_TRUE_TV_P );
                              }
                            }
                            final SubLObject _prev_bind_0_$157 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$141 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$140 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                            final SubLObject _prev_bind_3_$137 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            final SubLObject _prev_bind_6 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( fort2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                final SubLObject _prev_bind_0_$158 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$142 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                final SubLObject _prev_bind_2_$141 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                  SubLObject cdolist_list_var_$148;
                                  final SubLObject accessible_modules3 = cdolist_list_var_$148 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$isa ) );
                                  SubLObject module_var3 = NIL;
                                  module_var3 = cdolist_list_var_$148.first();
                                  while ( NIL != cdolist_list_var_$148)
                                  {
                                    final SubLObject _prev_bind_0_$159 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                    final SubLObject _prev_bind_1_$143 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_module_vars.$sbhl_module$.bind( module_var3, thread );
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                          NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                      final SubLObject node3 = function_terms.naut_to_nart( node_var2 );
                                      if( NIL != sbhl_link_vars.sbhl_node_object_p( node3 ) )
                                      {
                                        final SubLObject d_link3 = sbhl_graphs.get_sbhl_graph_link( node3, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                        if( NIL != d_link3 )
                                        {
                                          final SubLObject mt_links3 = sbhl_links.get_sbhl_mt_links( d_link3, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                          if( NIL != mt_links3 )
                                          {
                                            SubLObject iteration_state3;
                                            for( iteration_state3 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links3 ) ); NIL == dictionary_contents
                                                .do_dictionary_contents_doneP( iteration_state3 ); iteration_state3 = dictionary_contents.do_dictionary_contents_next( iteration_state3 ) )
                                            {
                                              thread.resetMultipleValues();
                                              final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state3 );
                                              final SubLObject tv_links3 = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != mt_relevance_macros.relevant_mtP( mt3 ) )
                                              {
                                                final SubLObject _prev_bind_0_$160 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt3, thread );
                                                  SubLObject iteration_state_$147;
                                                  for( iteration_state_$147 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links3 ) ); NIL == dictionary_contents
                                                      .do_dictionary_contents_doneP( iteration_state_$147 ); iteration_state_$147 = dictionary_contents.do_dictionary_contents_next( iteration_state_$147 ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    final SubLObject tv3 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$147 );
                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv3 ) )
                                                    {
                                                      final SubLObject _prev_bind_0_$161 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv3, thread );
                                                        final SubLObject sol5 = link_nodes4;
                                                        if( NIL != set.set_p( sol5 ) )
                                                        {
                                                          final SubLObject set_contents_var5 = set.do_set_internal( sol5 );
                                                          SubLObject basis_object5;
                                                          SubLObject state5;
                                                          SubLObject node_vars_link_node8;
                                                          for( basis_object5 = set_contents.do_set_contents_basis_object( set_contents_var5 ), state5 = NIL, state5 = set_contents.do_set_contents_initial_state(
                                                              basis_object5, set_contents_var5 ); NIL == set_contents.do_set_contents_doneP( basis_object5, state5 ); state5 = set_contents.do_set_contents_update_state(
                                                                  state5 ) )
                                                          {
                                                            node_vars_link_node8 = set_contents.do_set_contents_next( basis_object5, state5 );
                                                            if( NIL != set_contents.do_set_contents_element_validP( state5, node_vars_link_node8 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                node_vars_link_node8, UNPROVIDED ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node8, UNPROVIDED );
                                                              deck.deck_push( node_vars_link_node8, recur_deck2 );
                                                            }
                                                          }
                                                        }
                                                        else if( sol5.isList() )
                                                        {
                                                          SubLObject csome_list_var5 = sol5;
                                                          SubLObject node_vars_link_node9 = NIL;
                                                          node_vars_link_node9 = csome_list_var5.first();
                                                          while ( NIL != csome_list_var5)
                                                          {
                                                            if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node9, UNPROVIDED ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node9, UNPROVIDED );
                                                              deck.deck_push( node_vars_link_node9, recur_deck2 );
                                                            }
                                                            csome_list_var5 = csome_list_var5.rest();
                                                            node_vars_link_node9 = csome_list_var5.first();
                                                          }
                                                        }
                                                        else
                                                        {
                                                          Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol5 );
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$161, thread );
                                                      }
                                                    }
                                                  }
                                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$147 );
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$160, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state3 );
                                          }
                                        }
                                        else
                                        {
                                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                        }
                                      }
                                      else if( NIL != obsolete.cnat_p( node3, UNPROVIDED ) )
                                      {
                                        SubLObject cdolist_list_var_$149;
                                        final SubLObject new_list3 = cdolist_list_var_$149 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                .get_sbhl_module( UNPROVIDED ) ) )
                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                        SubLObject generating_fn3 = NIL;
                                        generating_fn3 = cdolist_list_var_$149.first();
                                        while ( NIL != cdolist_list_var_$149)
                                        {
                                          final SubLObject _prev_bind_0_$162 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn3, thread );
                                            final SubLObject sol6;
                                            final SubLObject link_nodes5 = sol6 = Functions.funcall( generating_fn3, node3 );
                                            if( NIL != set.set_p( sol6 ) )
                                            {
                                              final SubLObject set_contents_var6 = set.do_set_internal( sol6 );
                                              SubLObject basis_object6;
                                              SubLObject state6;
                                              SubLObject node_vars_link_node10;
                                              for( basis_object6 = set_contents.do_set_contents_basis_object( set_contents_var6 ), state6 = NIL, state6 = set_contents.do_set_contents_initial_state( basis_object6,
                                                  set_contents_var6 ); NIL == set_contents.do_set_contents_doneP( basis_object6, state6 ); state6 = set_contents.do_set_contents_update_state( state6 ) )
                                              {
                                                node_vars_link_node10 = set_contents.do_set_contents_next( basis_object6, state6 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state6, node_vars_link_node10 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                    node_vars_link_node10, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node10, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node10, recur_deck2 );
                                                }
                                              }
                                            }
                                            else if( sol6.isList() )
                                            {
                                              SubLObject csome_list_var6 = sol6;
                                              SubLObject node_vars_link_node11 = NIL;
                                              node_vars_link_node11 = csome_list_var6.first();
                                              while ( NIL != csome_list_var6)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node11, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node11, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node11, recur_deck2 );
                                                }
                                                csome_list_var6 = csome_list_var6.rest();
                                                node_vars_link_node11 = csome_list_var6.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol6 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$162, thread );
                                          }
                                          cdolist_list_var_$149 = cdolist_list_var_$149.rest();
                                          generating_fn3 = cdolist_list_var_$149.first();
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$143, thread );
                                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$159, thread );
                                    }
                                    cdolist_list_var_$148 = cdolist_list_var_$148.rest();
                                    module_var3 = cdolist_list_var_$148.first();
                                  }
                                  node_var2 = deck.deck_pop( recur_deck2 );
                                  final SubLObject _prev_bind_0_$163 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                  final SubLObject _prev_bind_2_$142 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_search_vars.get_sbhl_search_module() ), thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                                    while ( NIL != node_var2)
                                    {
                                      final SubLObject v_isa2 = node_var2;
                                      SubLObject cdolist_list_var_$150 = kb_mapping_utilities.pred_values( v_isa2, $const63$templateTypeForFocalTermType, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                      SubLObject topic2 = NIL;
                                      topic2 = cdolist_list_var_$150.first();
                                      while ( NIL != cdolist_list_var_$150)
                                      {
                                        if( NIL == has_handP2 || NIL == has_inducedP2 )
                                        {
                                          final SubLObject inducedP2 = isa.isaP( topic2, $const188$InducedFormulaTemplateTopicType, UNPROVIDED, UNPROVIDED );
                                          if( NIL != inducedP2 )
                                          {
                                            has_inducedP2 = T;
                                          }
                                          else
                                          {
                                            has_handP2 = T;
                                          }
                                        }
                                        cdolist_list_var_$150 = cdolist_list_var_$150.rest();
                                        topic2 = cdolist_list_var_$150.first();
                                      }
                                      SubLObject cdolist_list_var_$151;
                                      final SubLObject accessible_modules4 = cdolist_list_var_$151 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                      SubLObject module_var4 = NIL;
                                      module_var4 = cdolist_list_var_$151.first();
                                      while ( NIL != cdolist_list_var_$151)
                                      {
                                        final SubLObject _prev_bind_0_$164 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                        final SubLObject _prev_bind_1_$145 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_module_vars.$sbhl_module$.bind( module_var4, thread );
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                              NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                          final SubLObject node4 = function_terms.naut_to_nart( node_var2 );
                                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node4 ) )
                                          {
                                            final SubLObject d_link4 = sbhl_graphs.get_sbhl_graph_link( node4, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                            if( NIL != d_link4 )
                                            {
                                              final SubLObject mt_links4 = sbhl_links.get_sbhl_mt_links( d_link4, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                              if( NIL != mt_links4 )
                                              {
                                                SubLObject iteration_state4;
                                                for( iteration_state4 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links4 ) ); NIL == dictionary_contents
                                                    .do_dictionary_contents_doneP( iteration_state4 ); iteration_state4 = dictionary_contents.do_dictionary_contents_next( iteration_state4 ) )
                                                {
                                                  thread.resetMultipleValues();
                                                  final SubLObject mt4 = dictionary_contents.do_dictionary_contents_key_value( iteration_state4 );
                                                  final SubLObject tv_links4 = thread.secondMultipleValue();
                                                  thread.resetMultipleValues();
                                                  if( NIL != mt_relevance_macros.relevant_mtP( mt4 ) )
                                                  {
                                                    final SubLObject _prev_bind_0_$165 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                    try
                                                    {
                                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt4, thread );
                                                      SubLObject iteration_state_$148;
                                                      for( iteration_state_$148 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links4 ) ); NIL == dictionary_contents
                                                          .do_dictionary_contents_doneP( iteration_state_$148 ); iteration_state_$148 = dictionary_contents.do_dictionary_contents_next( iteration_state_$148 ) )
                                                      {
                                                        thread.resetMultipleValues();
                                                        final SubLObject tv4 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$148 );
                                                        final SubLObject link_nodes6 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv4 ) )
                                                        {
                                                          final SubLObject _prev_bind_0_$166 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                          try
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv4, thread );
                                                            final SubLObject sol7 = link_nodes6;
                                                            if( NIL != set.set_p( sol7 ) )
                                                            {
                                                              final SubLObject set_contents_var7 = set.do_set_internal( sol7 );
                                                              SubLObject basis_object7;
                                                              SubLObject state7;
                                                              SubLObject node_vars_link_node12;
                                                              for( basis_object7 = set_contents.do_set_contents_basis_object( set_contents_var7 ), state7 = NIL, state7 = set_contents.do_set_contents_initial_state(
                                                                  basis_object7, set_contents_var7 ); NIL == set_contents.do_set_contents_doneP( basis_object7, state7 ); state7 = set_contents
                                                                      .do_set_contents_update_state( state7 ) )
                                                              {
                                                                node_vars_link_node12 = set_contents.do_set_contents_next( basis_object7, state7 );
                                                                if( NIL != set_contents.do_set_contents_element_validP( state7, node_vars_link_node12 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                    node_vars_link_node12, UNPROVIDED ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node12, UNPROVIDED );
                                                                  deck.deck_push( node_vars_link_node12, recur_deck2 );
                                                                }
                                                              }
                                                            }
                                                            else if( sol7.isList() )
                                                            {
                                                              SubLObject csome_list_var7 = sol7;
                                                              SubLObject node_vars_link_node = NIL;
                                                              node_vars_link_node = csome_list_var7.first();
                                                              while ( NIL != csome_list_var7)
                                                              {
                                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node, UNPROVIDED ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node, UNPROVIDED );
                                                                  deck.deck_push( node_vars_link_node, recur_deck2 );
                                                                }
                                                                csome_list_var7 = csome_list_var7.rest();
                                                                node_vars_link_node = csome_list_var7.first();
                                                              }
                                                            }
                                                            else
                                                            {
                                                              Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol7 );
                                                            }
                                                          }
                                                          finally
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$166, thread );
                                                          }
                                                        }
                                                      }
                                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$148 );
                                                    }
                                                    finally
                                                    {
                                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$165, thread );
                                                    }
                                                  }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize( iteration_state4 );
                                              }
                                            }
                                            else
                                            {
                                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                            }
                                          }
                                          else if( NIL != obsolete.cnat_p( node4, UNPROVIDED ) )
                                          {
                                            SubLObject cdolist_list_var_$152;
                                            final SubLObject new_list4 = cdolist_list_var_$152 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                    .get_sbhl_module( UNPROVIDED ) ) )
                                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                            SubLObject generating_fn4 = NIL;
                                            generating_fn4 = cdolist_list_var_$152.first();
                                            while ( NIL != cdolist_list_var_$152)
                                            {
                                              final SubLObject _prev_bind_0_$167 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn4, thread );
                                                final SubLObject sol8;
                                                final SubLObject link_nodes7 = sol8 = Functions.funcall( generating_fn4, node4 );
                                                if( NIL != set.set_p( sol8 ) )
                                                {
                                                  final SubLObject set_contents_var8 = set.do_set_internal( sol8 );
                                                  SubLObject node_vars_link_node9;
                                                  SubLObject basis_object8;
                                                  SubLObject state8;
                                                  for( basis_object8 = set_contents.do_set_contents_basis_object( set_contents_var8 ), state8 = NIL, state8 = set_contents.do_set_contents_initial_state( basis_object8,
                                                      set_contents_var8 ); NIL == set_contents.do_set_contents_doneP( basis_object8, state8 ); state8 = set_contents.do_set_contents_update_state( state8 ) )
                                                  {
                                                    node_vars_link_node9 = set_contents.do_set_contents_next( basis_object8, state8 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state8, node_vars_link_node9 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node9, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node9, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node9, recur_deck2 );
                                                    }
                                                  }
                                                }
                                                else if( sol8.isList() )
                                                {
                                                  SubLObject csome_list_var8 = sol8;
                                                  SubLObject node_vars_link_node3 = NIL;
                                                  node_vars_link_node3 = csome_list_var8.first();
                                                  while ( NIL != csome_list_var8)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node3, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node3, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node3, recur_deck2 );
                                                    }
                                                    csome_list_var8 = csome_list_var8.rest();
                                                    node_vars_link_node3 = csome_list_var8.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol8 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$167, thread );
                                              }
                                              cdolist_list_var_$152 = cdolist_list_var_$152.rest();
                                              generating_fn4 = cdolist_list_var_$152.first();
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$145, thread );
                                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$164, thread );
                                        }
                                        cdolist_list_var_$151 = cdolist_list_var_$151.rest();
                                        module_var4 = cdolist_list_var_$151.first();
                                      }
                                      node_var2 = deck.deck_pop( recur_deck2 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$142, thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$144, thread );
                                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$163, thread );
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$141, thread );
                                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$142, thread );
                                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$158, thread );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, fort2, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            finally
                            {
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_6, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$137, thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$140, thread );
                              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$141, thread );
                              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$157, thread );
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$140, thread );
                            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$156, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$168 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values3 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                            Values.restoreValuesFromVector( _values3 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$168, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$155, thread );
                      }
                    }
                    finally
                    {
                      mt_relevance_macros.$mt$.rebind( _prev_bind_1_$139, thread );
                      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0_$154, thread );
                    }
                    if( NIL != has_inducedP2 && NIL != has_handP2 )
                    {
                      has_induced = Numbers.add( has_induced, ONE_INTEGER );
                      has_hand = Numbers.add( has_hand, ONE_INTEGER );
                      has_topic = Numbers.add( has_topic, ONE_INTEGER );
                      has_both = Numbers.add( has_both, ONE_INTEGER );
                    }
                    else if( NIL != has_inducedP2 )
                    {
                      has_induced = Numbers.add( has_induced, ONE_INTEGER );
                      has_topic = Numbers.add( has_topic, ONE_INTEGER );
                    }
                    else if( NIL != has_handP2 )
                    {
                      has_hand = Numbers.add( has_hand, ONE_INTEGER );
                      has_topic = Numbers.add( has_topic, ONE_INTEGER );
                    }
                    else
                    {
                      SubLObject could_have_topicP2 = NIL;
                      SubLObject node_var3 = fort2;
                      final SubLObject deck_type3 = $kw29$QUEUE;
                      final SubLObject recur_deck3 = deck.create_deck( deck_type3 );
                      final SubLObject _prev_bind_0_$169 = sbhl_marking_vars.$sbhl_space$.currentBinding( thread );
                      try
                      {
                        sbhl_marking_vars.$sbhl_space$.bind( sbhl_marking_vars.get_sbhl_marking_space(), thread );
                        try
                        {
                          final SubLObject tv_var3 = NIL;
                          final SubLObject _prev_bind_0_$170 = sbhl_search_vars.$sbhl_tv$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$146 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding( thread );
                          try
                          {
                            sbhl_search_vars.$sbhl_tv$.bind( ( NIL != tv_var3 ) ? tv_var3 : sbhl_search_vars.get_sbhl_true_tv(), thread );
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind( ( NIL != tv_var3 ) ? $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue( thread ),
                                thread );
                            if( NIL != tv_var3 && NIL != sbhl_paranoia.sbhl_object_type_checking_p() && NIL == sbhl_search_vars.sbhl_true_tv_p( tv_var3 ) )
                            {
                              final SubLObject pcase_var3 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread );
                              if( pcase_var3.eql( $kw32$ERROR ) )
                              {
                                sbhl_paranoia.sbhl_error( ONE_INTEGER, $str33$_A_is_not_a__A, tv_var3, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var3.eql( $kw35$CERROR ) )
                              {
                                sbhl_paranoia.sbhl_cerror( ONE_INTEGER, $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var3, $sym34$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                              else if( pcase_var3.eql( $kw37$WARN ) )
                              {
                                Errors.warn( $str33$_A_is_not_a__A, tv_var3, $sym34$SBHL_TRUE_TV_P );
                              }
                              else
                              {
                                Errors.warn( $str38$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue( thread ) );
                                Errors.cerror( $str36$continue_anyway, $str33$_A_is_not_a__A, tv_var3, $sym34$SBHL_TRUE_TV_P );
                              }
                            }
                            final SubLObject _prev_bind_0_$171 = sbhl_search_vars.$sbhl_search_module$.currentBinding( thread );
                            final SubLObject _prev_bind_1_$147 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding( thread );
                            final SubLObject _prev_bind_2_$143 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding( thread );
                            final SubLObject _prev_bind_3_$138 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                            final SubLObject _prev_bind_7 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                            try
                            {
                              sbhl_search_vars.$sbhl_search_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                              sbhl_search_vars.$sbhl_search_module_type$.bind( sbhl_module_utilities.get_sbhl_module_type( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind( sbhl_module_utilities.get_sbhl_add_node_to_result_test( sbhl_module_vars.get_sbhl_module( $const45$isa ) ), thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                              sbhl_module_vars.$sbhl_module$.bind( sbhl_module_vars.get_sbhl_module( $const45$isa ), thread );
                              if( NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || NIL != sbhl_module_utilities.apply_sbhl_module_type_test( fort2, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) )
                              {
                                final SubLObject _prev_bind_0_$172 = sbhl_search_vars.$sbhl_search_direction$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$148 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                final SubLObject _prev_bind_2_$144 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                try
                                {
                                  sbhl_search_vars.$sbhl_search_direction$.bind( sbhl_search_vars.get_sbhl_forward_search_direction(), thread );
                                  sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                  SubLObject cdolist_list_var_$153;
                                  final SubLObject accessible_modules5 = cdolist_list_var_$153 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( $const45$isa ) );
                                  SubLObject module_var5 = NIL;
                                  module_var5 = cdolist_list_var_$153.first();
                                  while ( NIL != cdolist_list_var_$153)
                                  {
                                    final SubLObject _prev_bind_0_$173 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                    final SubLObject _prev_bind_1_$149 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                    try
                                    {
                                      sbhl_module_vars.$sbhl_module$.bind( module_var5, thread );
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                          NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                      final SubLObject node5 = function_terms.naut_to_nart( node_var3 );
                                      if( NIL != sbhl_link_vars.sbhl_node_object_p( node5 ) )
                                      {
                                        final SubLObject d_link5 = sbhl_graphs.get_sbhl_graph_link( node5, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                        if( NIL != d_link5 )
                                        {
                                          final SubLObject mt_links5 = sbhl_links.get_sbhl_mt_links( d_link5, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                          if( NIL != mt_links5 )
                                          {
                                            SubLObject iteration_state5;
                                            for( iteration_state5 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links5 ) ); NIL == dictionary_contents
                                                .do_dictionary_contents_doneP( iteration_state5 ); iteration_state5 = dictionary_contents.do_dictionary_contents_next( iteration_state5 ) )
                                            {
                                              thread.resetMultipleValues();
                                              final SubLObject mt5 = dictionary_contents.do_dictionary_contents_key_value( iteration_state5 );
                                              final SubLObject tv_links5 = thread.secondMultipleValue();
                                              thread.resetMultipleValues();
                                              if( NIL != mt_relevance_macros.relevant_mtP( mt5 ) )
                                              {
                                                final SubLObject _prev_bind_0_$174 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                try
                                                {
                                                  sbhl_link_vars.$sbhl_link_mt$.bind( mt5, thread );
                                                  SubLObject iteration_state_$149;
                                                  for( iteration_state_$149 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links5 ) ); NIL == dictionary_contents
                                                      .do_dictionary_contents_doneP( iteration_state_$149 ); iteration_state_$149 = dictionary_contents.do_dictionary_contents_next( iteration_state_$149 ) )
                                                  {
                                                    thread.resetMultipleValues();
                                                    final SubLObject tv5 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$149 );
                                                    final SubLObject link_nodes7 = thread.secondMultipleValue();
                                                    thread.resetMultipleValues();
                                                    if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv5 ) )
                                                    {
                                                      final SubLObject _prev_bind_0_$175 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                      try
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.bind( tv5, thread );
                                                        final SubLObject sol4 = link_nodes7;
                                                        if( NIL != set.set_p( sol4 ) )
                                                        {
                                                          final SubLObject set_contents_var4 = set.do_set_internal( sol4 );
                                                          SubLObject node_vars_link_node2;
                                                          SubLObject basis_object4;
                                                          SubLObject state4;
                                                          for( basis_object4 = set_contents.do_set_contents_basis_object( set_contents_var4 ), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(
                                                              basis_object4, set_contents_var4 ); NIL == set_contents.do_set_contents_doneP( basis_object4, state4 ); state4 = set_contents.do_set_contents_update_state(
                                                                  state4 ) )
                                                          {
                                                            node_vars_link_node2 = set_contents.do_set_contents_next( basis_object4, state4 );
                                                            if( NIL != set_contents.do_set_contents_element_validP( state4, node_vars_link_node2 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                node_vars_link_node2, UNPROVIDED ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node2, UNPROVIDED );
                                                              deck.deck_push( node_vars_link_node2, recur_deck3 );
                                                            }
                                                          }
                                                        }
                                                        else if( sol4.isList() )
                                                        {
                                                          SubLObject csome_list_var4 = sol4;
                                                          SubLObject node_vars_link_node7 = NIL;
                                                          node_vars_link_node7 = csome_list_var4.first();
                                                          while ( NIL != csome_list_var4)
                                                          {
                                                            if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node7, UNPROVIDED ) )
                                                            {
                                                              sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node7, UNPROVIDED );
                                                              deck.deck_push( node_vars_link_node7, recur_deck3 );
                                                            }
                                                            csome_list_var4 = csome_list_var4.rest();
                                                            node_vars_link_node7 = csome_list_var4.first();
                                                          }
                                                        }
                                                        else
                                                        {
                                                          Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol4 );
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$175, thread );
                                                      }
                                                    }
                                                  }
                                                  dictionary_contents.do_dictionary_contents_finalize( iteration_state_$149 );
                                                }
                                                finally
                                                {
                                                  sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$174, thread );
                                                }
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize( iteration_state5 );
                                          }
                                        }
                                        else
                                        {
                                          sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                        }
                                      }
                                      else if( NIL != obsolete.cnat_p( node5, UNPROVIDED ) )
                                      {
                                        SubLObject cdolist_list_var_$154;
                                        final SubLObject new_list5 = cdolist_list_var_$154 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                            .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                .get_sbhl_module( UNPROVIDED ) ) )
                                            : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                        SubLObject generating_fn5 = NIL;
                                        generating_fn5 = cdolist_list_var_$154.first();
                                        while ( NIL != cdolist_list_var_$154)
                                        {
                                          final SubLObject _prev_bind_0_$176 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                          try
                                          {
                                            sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn5, thread );
                                            final SubLObject sol9;
                                            final SubLObject link_nodes8 = sol9 = Functions.funcall( generating_fn5, node5 );
                                            if( NIL != set.set_p( sol9 ) )
                                            {
                                              final SubLObject set_contents_var9 = set.do_set_internal( sol9 );
                                              SubLObject node_vars_link_node4;
                                              SubLObject basis_object9;
                                              SubLObject state9;
                                              for( basis_object9 = set_contents.do_set_contents_basis_object( set_contents_var9 ), state9 = NIL, state9 = set_contents.do_set_contents_initial_state( basis_object9,
                                                  set_contents_var9 ); NIL == set_contents.do_set_contents_doneP( basis_object9, state9 ); state9 = set_contents.do_set_contents_update_state( state9 ) )
                                              {
                                                node_vars_link_node4 = set_contents.do_set_contents_next( basis_object9, state9 );
                                                if( NIL != set_contents.do_set_contents_element_validP( state9, node_vars_link_node4 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                    node_vars_link_node4, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node4, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node4, recur_deck3 );
                                                }
                                              }
                                            }
                                            else if( sol9.isList() )
                                            {
                                              SubLObject csome_list_var9 = sol9;
                                              SubLObject node_vars_link_node13 = NIL;
                                              node_vars_link_node13 = csome_list_var9.first();
                                              while ( NIL != csome_list_var9)
                                              {
                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node13, UNPROVIDED ) )
                                                {
                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node13, UNPROVIDED );
                                                  deck.deck_push( node_vars_link_node13, recur_deck3 );
                                                }
                                                csome_list_var9 = csome_list_var9.rest();
                                                node_vars_link_node13 = csome_list_var9.first();
                                              }
                                            }
                                            else
                                            {
                                              Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol9 );
                                            }
                                          }
                                          finally
                                          {
                                            sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$176, thread );
                                          }
                                          cdolist_list_var_$154 = cdolist_list_var_$154.rest();
                                          generating_fn5 = cdolist_list_var_$154.first();
                                        }
                                      }
                                    }
                                    finally
                                    {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$149, thread );
                                      sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$173, thread );
                                    }
                                    cdolist_list_var_$153 = cdolist_list_var_$153.rest();
                                    module_var5 = cdolist_list_var_$153.first();
                                  }
                                  node_var3 = deck.deck_pop( recur_deck3 );
                                  final SubLObject _prev_bind_0_$177 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                  final SubLObject _prev_bind_1_$150 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                  final SubLObject _prev_bind_2_$145 = sbhl_link_vars.$sbhl_link_direction$.currentBinding( thread );
                                  try
                                  {
                                    sbhl_module_vars.$sbhl_module$.bind( sbhl_module_utilities.get_sbhl_transfers_through_module( sbhl_search_vars.get_sbhl_search_module() ), thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind( NIL, thread );
                                    sbhl_link_vars.$sbhl_link_direction$.bind( sbhl_module_utilities.get_sbhl_module_forward_direction( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ), thread );
                                    while ( NIL != node_var3)
                                    {
                                      final SubLObject v_isa3 = node_var3;
                                      if( NIL == could_have_topicP2 && NIL != kb_mapping_utilities.some_pred_value( v_isa3, $const189$keInducedStrongSuggestionPreds, UNPROVIDED, UNPROVIDED )
                                          && NIL != kb_mapping_utilities.some_pred_value( v_isa3, $const190$keInducedWeakSuggestionPreds, UNPROVIDED, UNPROVIDED ) && NIL != kb_mapping_utilities.some_pred_value( v_isa3,
                                              $const191$keInducedSuggestionPreds, UNPROVIDED, UNPROVIDED ) )
                                      {
                                        could_have_topicP2 = T;
                                        dictionary_utilities.dictionary_increment( promising, v_isa3, UNPROVIDED );
                                      }
                                      SubLObject cdolist_list_var_$155;
                                      final SubLObject accessible_modules6 = cdolist_list_var_$155 = sbhl_macros.get_sbhl_accessible_modules( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                      SubLObject module_var6 = NIL;
                                      module_var6 = cdolist_list_var_$155.first();
                                      while ( NIL != cdolist_list_var_$155)
                                      {
                                        final SubLObject _prev_bind_0_$178 = sbhl_module_vars.$sbhl_module$.currentBinding( thread );
                                        final SubLObject _prev_bind_1_$151 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding( thread );
                                        try
                                        {
                                          sbhl_module_vars.$sbhl_module$.bind( module_var6, thread );
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind( ( NIL != sbhl_search_vars.flip_genl_inverse_modeP( UNPROVIDED, UNPROVIDED ) ) ? makeBoolean(
                                              NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ) ) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue( thread ), thread );
                                          final SubLObject node6 = function_terms.naut_to_nart( node_var3 );
                                          if( NIL != sbhl_link_vars.sbhl_node_object_p( node6 ) )
                                          {
                                            final SubLObject d_link6 = sbhl_graphs.get_sbhl_graph_link( node6, sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                            if( NIL != d_link6 )
                                            {
                                              final SubLObject mt_links6 = sbhl_links.get_sbhl_mt_links( d_link6, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module( UNPROVIDED ) );
                                              if( NIL != mt_links6 )
                                              {
                                                SubLObject iteration_state6;
                                                for( iteration_state6 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( mt_links6 ) ); NIL == dictionary_contents
                                                    .do_dictionary_contents_doneP( iteration_state6 ); iteration_state6 = dictionary_contents.do_dictionary_contents_next( iteration_state6 ) )
                                                {
                                                  thread.resetMultipleValues();
                                                  final SubLObject mt6 = dictionary_contents.do_dictionary_contents_key_value( iteration_state6 );
                                                  final SubLObject tv_links6 = thread.secondMultipleValue();
                                                  thread.resetMultipleValues();
                                                  if( NIL != mt_relevance_macros.relevant_mtP( mt6 ) )
                                                  {
                                                    final SubLObject _prev_bind_0_$179 = sbhl_link_vars.$sbhl_link_mt$.currentBinding( thread );
                                                    try
                                                    {
                                                      sbhl_link_vars.$sbhl_link_mt$.bind( mt6, thread );
                                                      SubLObject iteration_state_$150;
                                                      for( iteration_state_$150 = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( tv_links6 ) ); NIL == dictionary_contents
                                                          .do_dictionary_contents_doneP( iteration_state_$150 ); iteration_state_$150 = dictionary_contents.do_dictionary_contents_next( iteration_state_$150 ) )
                                                      {
                                                        thread.resetMultipleValues();
                                                        final SubLObject tv6 = dictionary_contents.do_dictionary_contents_key_value( iteration_state_$150 );
                                                        final SubLObject link_nodes9 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if( NIL != sbhl_search_vars.relevant_sbhl_tvP( tv6 ) )
                                                        {
                                                          final SubLObject _prev_bind_0_$180 = sbhl_link_vars.$sbhl_link_tv$.currentBinding( thread );
                                                          try
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind( tv6, thread );
                                                            final SubLObject sol10 = link_nodes9;
                                                            if( NIL != set.set_p( sol10 ) )
                                                            {
                                                              final SubLObject set_contents_var10 = set.do_set_internal( sol10 );
                                                              SubLObject node_vars_link_node6;
                                                              SubLObject basis_object10;
                                                              SubLObject state10;
                                                              for( basis_object10 = set_contents.do_set_contents_basis_object( set_contents_var10 ), state10 = NIL, state10 = set_contents.do_set_contents_initial_state(
                                                                  basis_object10, set_contents_var10 ); NIL == set_contents.do_set_contents_doneP( basis_object10, state10 ); state10 = set_contents
                                                                      .do_set_contents_update_state( state10 ) )
                                                              {
                                                                node_vars_link_node6 = set_contents.do_set_contents_next( basis_object10, state10 );
                                                                if( NIL != set_contents.do_set_contents_element_validP( state10, node_vars_link_node6 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                                    node_vars_link_node6, UNPROVIDED ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node6, UNPROVIDED );
                                                                  deck.deck_push( node_vars_link_node6, recur_deck3 );
                                                                }
                                                              }
                                                            }
                                                            else if( sol10.isList() )
                                                            {
                                                              SubLObject csome_list_var10 = sol10;
                                                              SubLObject node_vars_link_node8 = NIL;
                                                              node_vars_link_node8 = csome_list_var10.first();
                                                              while ( NIL != csome_list_var10)
                                                              {
                                                                if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node8, UNPROVIDED ) )
                                                                {
                                                                  sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node8, UNPROVIDED );
                                                                  deck.deck_push( node_vars_link_node8, recur_deck3 );
                                                                }
                                                                csome_list_var10 = csome_list_var10.rest();
                                                                node_vars_link_node8 = csome_list_var10.first();
                                                              }
                                                            }
                                                            else
                                                            {
                                                              Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol10 );
                                                            }
                                                          }
                                                          finally
                                                          {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind( _prev_bind_0_$180, thread );
                                                          }
                                                        }
                                                      }
                                                      dictionary_contents.do_dictionary_contents_finalize( iteration_state_$150 );
                                                    }
                                                    finally
                                                    {
                                                      sbhl_link_vars.$sbhl_link_mt$.rebind( _prev_bind_0_$179, thread );
                                                    }
                                                  }
                                                }
                                                dictionary_contents.do_dictionary_contents_finalize( iteration_state6 );
                                              }
                                            }
                                            else
                                            {
                                              sbhl_paranoia.sbhl_error( FIVE_INTEGER, $str42$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                                            }
                                          }
                                          else if( NIL != obsolete.cnat_p( node6, UNPROVIDED ) )
                                          {
                                            SubLObject cdolist_list_var_$156;
                                            final SubLObject new_list6 = cdolist_list_var_$156 = ( ( NIL != sbhl_link_vars.sbhl_randomize_lists_p() ) ? list_utilities.randomize_list( sbhl_module_utilities
                                                .get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ), sbhl_module_vars
                                                    .get_sbhl_module( UNPROVIDED ) ) )
                                                : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators( sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue( thread ),
                                                    sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ) );
                                            SubLObject generating_fn6 = NIL;
                                            generating_fn6 = cdolist_list_var_$156.first();
                                            while ( NIL != cdolist_list_var_$156)
                                            {
                                              final SubLObject _prev_bind_0_$181 = sbhl_link_vars.$sbhl_link_generator$.currentBinding( thread );
                                              try
                                              {
                                                sbhl_link_vars.$sbhl_link_generator$.bind( generating_fn6, thread );
                                                final SubLObject sol11;
                                                final SubLObject link_nodes10 = sol11 = Functions.funcall( generating_fn6, node6 );
                                                if( NIL != set.set_p( sol11 ) )
                                                {
                                                  final SubLObject set_contents_var11 = set.do_set_internal( sol11 );
                                                  SubLObject node_vars_link_node7;
                                                  SubLObject basis_object11;
                                                  SubLObject state11;
                                                  for( basis_object11 = set_contents.do_set_contents_basis_object( set_contents_var11 ), state11 = NIL, state11 = set_contents.do_set_contents_initial_state(
                                                      basis_object11, set_contents_var11 ); NIL == set_contents.do_set_contents_doneP( basis_object11, state11 ); state11 = set_contents.do_set_contents_update_state(
                                                          state11 ) )
                                                  {
                                                    node_vars_link_node7 = set_contents.do_set_contents_next( basis_object11, state11 );
                                                    if( NIL != set_contents.do_set_contents_element_validP( state11, node_vars_link_node7 ) && NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(
                                                        node_vars_link_node7, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node7, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node7, recur_deck3 );
                                                    }
                                                  }
                                                }
                                                else if( sol11.isList() )
                                                {
                                                  SubLObject csome_list_var11 = sol11;
                                                  SubLObject node_vars_link_node10 = NIL;
                                                  node_vars_link_node10 = csome_list_var11.first();
                                                  while ( NIL != csome_list_var11)
                                                  {
                                                    if( NIL == sbhl_marking_utilities.sbhl_search_path_termination_p( node_vars_link_node10, UNPROVIDED ) )
                                                    {
                                                      sbhl_marking_utilities.sbhl_mark_node_marked( node_vars_link_node10, UNPROVIDED );
                                                      deck.deck_push( node_vars_link_node10, recur_deck3 );
                                                    }
                                                    csome_list_var11 = csome_list_var11.rest();
                                                    node_vars_link_node10 = csome_list_var11.first();
                                                  }
                                                }
                                                else
                                                {
                                                  Errors.error( $str41$_A_is_neither_SET_P_nor_LISTP_, sol11 );
                                                }
                                              }
                                              finally
                                              {
                                                sbhl_link_vars.$sbhl_link_generator$.rebind( _prev_bind_0_$181, thread );
                                              }
                                              cdolist_list_var_$156 = cdolist_list_var_$156.rest();
                                              generating_fn6 = cdolist_list_var_$156.first();
                                            }
                                          }
                                        }
                                        finally
                                        {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$151, thread );
                                          sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$178, thread );
                                        }
                                        cdolist_list_var_$155 = cdolist_list_var_$155.rest();
                                        module_var6 = cdolist_list_var_$155.first();
                                      }
                                      node_var3 = deck.deck_pop( recur_deck3 );
                                    }
                                  }
                                  finally
                                  {
                                    sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_2_$145, thread );
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_1_$150, thread );
                                    sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_0_$177, thread );
                                  }
                                }
                                finally
                                {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_2_$144, thread );
                                  sbhl_link_vars.$sbhl_link_direction$.rebind( _prev_bind_1_$148, thread );
                                  sbhl_search_vars.$sbhl_search_direction$.rebind( _prev_bind_0_$172, thread );
                                }
                              }
                              else
                              {
                                sbhl_paranoia.sbhl_warn( TWO_INTEGER, $str43$Node__a_does_not_pass_sbhl_type_t, fort2, sbhl_module_utilities.get_sbhl_type_test( sbhl_module_vars.get_sbhl_module( UNPROVIDED ) ),
                                    UNPROVIDED, UNPROVIDED, UNPROVIDED );
                              }
                            }
                            finally
                            {
                              sbhl_module_vars.$sbhl_module$.rebind( _prev_bind_7, thread );
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind( _prev_bind_3_$138, thread );
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind( _prev_bind_2_$143, thread );
                              sbhl_search_vars.$sbhl_search_module_type$.rebind( _prev_bind_1_$147, thread );
                              sbhl_search_vars.$sbhl_search_module$.rebind( _prev_bind_0_$171, thread );
                            }
                          }
                          finally
                          {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind( _prev_bind_1_$146, thread );
                            sbhl_search_vars.$sbhl_tv$.rebind( _prev_bind_0_$170, thread );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$182 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values4 = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space( sbhl_marking_vars.$sbhl_space$.getDynamicValue( thread ) );
                            Values.restoreValuesFromVector( _values4 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$182, thread );
                          }
                        }
                      }
                      finally
                      {
                        sbhl_marking_vars.$sbhl_space$.rebind( _prev_bind_0_$169, thread );
                      }
                      if( NIL != could_have_topicP2 )
                      {
                        could_have_topic = Numbers.add( could_have_topic, ONE_INTEGER );
                      }
                    }
                    if( Numbers.mod( total, $int192$1000 ).isZero() )
                    {
                      PrintLow.format( T, $str193$__Total___S_Have_topic___S___4F__, new SubLObject[] { total, has_topic, Numbers.multiply( $int178$100, Numbers.divide( has_topic, total ) ), could_have_topic, Numbers
                          .multiply( $int178$100, Numbers.divide( could_have_topic, total ) )
                      } );
                      PrintLow.format( T, $str194$__Hand___S___4F___Induced___S___4, new SubLObject[] { has_hand, Numbers.multiply( $int178$100, Numbers.divide( has_hand, total ) ), has_induced, Numbers.multiply(
                          $int178$100, Numbers.divide( has_induced, total ) ), has_both, Numbers.multiply( $int178$100, Numbers.divide( has_both, total ) )
                      } );
                      format_nil.print_one_per_line( list_utilities.first_n( TEN_INTEGER, dictionary_utilities.sort_dictionary_by_values( promising, Symbols.symbol_function( $sym163$_ ) ) ), UNPROVIDED );
                    }
                  }
                  id2 = Numbers.add( id2, ONE_INTEGER );
                }
              }
            }
            cdolist_list_var = cdolist_list_var.rest();
            table_var = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$183 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values5 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values5 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$183, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$125, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$124, thread );
      }
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  public static SubLObject declare_formula_template_utilities_file()
  {
    SubLFiles.declareFunction( me, "get_all_formula_template_topics", "GET-ALL-FORMULA-TEMPLATE-TOPICS", 0, 0, false );
    SubLFiles.declareFunction( me, "formula_template_topic_typeP", "FORMULA-TEMPLATE-TOPIC-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "get_all_formula_template_subtopics", "GET-ALL-FORMULA-TEMPLATE-SUBTOPICS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_template_topics", "GET-ALL-TEMPLATE-TOPICS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_formula_template_definition_mts", "GET-ALL-FORMULA-TEMPLATE-DEFINITION-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_all_formula_templated_types", "GET-ALL-FORMULA-TEMPLATED-TYPES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_applicable_formula_templated_types", "GET-APPLICABLE-FORMULA-TEMPLATED-TYPES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_all_formula_template_definition_tuples", "GET-ALL-FORMULA-TEMPLATE-DEFINITION-TUPLES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_applicable_formula_template_definition_tuples", "GET-APPLICABLE-FORMULA-TEMPLATE-DEFINITION-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "get_applicable_formula_template_collection_tuples", "GET-APPLICABLE-FORMULA-TEMPLATE-COLLECTION-TUPLES", 1, 0, false );
    SubLFiles.declareFunction( me, "formula_template_deftuple_order", "FORMULA-TEMPLATE-DEFTUPLE-ORDER", 1, 0, false );
    SubLFiles.declareFunction( me, "get_template_topic_loading_elmt", "GET-TEMPLATE-TOPIC-LOADING-ELMT", 1, 0, false );
    SubLFiles.declareFunction( me, "applicable_template_topics_for_collection", "APPLICABLE-TEMPLATE-TOPICS-FOR-COLLECTION", 1, 1, false );
    SubLFiles.declareFunction( me, "applicable_template_instance_topics_for_collection", "APPLICABLE-TEMPLATE-INSTANCE-TOPICS-FOR-COLLECTION", 3, 0, false );
    SubLFiles.declareFunction( me, "applicable_template_instance_topics_for_collection_via_inference", "APPLICABLE-TEMPLATE-INSTANCE-TOPICS-FOR-COLLECTION-VIA-INFERENCE", 3, 0, false );
    SubLFiles.declareFunction( me, "applicable_template_instance_topics_for_collection_tva_workaround", "APPLICABLE-TEMPLATE-INSTANCE-TOPICS-FOR-COLLECTION-TVA-WORKAROUND", 3, 0, false );
    SubLFiles.declareFunction( me, "applicable_template_instance_topics_for_collection_via_index_surfing", "APPLICABLE-TEMPLATE-INSTANCE-TOPICS-FOR-COLLECTION-VIA-INDEX-SURFING", 3, 0, false );
    SubLFiles.declareFunction( me, "applicable_template_spec_topics_for_collection", "APPLICABLE-TEMPLATE-SPEC-TOPICS-FOR-COLLECTION", 3, 0, false );
    SubLFiles.declareFunction( me, "applicable_template_topics_for_term", "APPLICABLE-TEMPLATE-TOPICS-FOR-TERM", 1, 1, false );
    SubLFiles.declareFunction( me, "term_has_induced_fet_topicP", "TERM-HAS-INDUCED-FET-TOPIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_has_induced_fet_topicP_via_index_surfing", "TERM-HAS-INDUCED-FET-TOPIC?-VIA-INDEX-SURFING", 1, 0, false );
    SubLFiles.declareFunction( me, "collection_has_induced_fet_topicP", "COLLECTION-HAS-INDUCED-FET-TOPIC?", 1, 0, false );
    SubLFiles.declareFunction( me, "term_has_induced_fet_topicP_via_inference", "TERM-HAS-INDUCED-FET-TOPIC?-VIA-INFERENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "candidate_topic_tuples_for_term", "CANDIDATE-TOPIC-TUPLES-FOR-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "filter_topic_tuples_for_term", "FILTER-TOPIC-TUPLES-FOR-TERM", 3, 1, false );
    SubLFiles.declareFunction( me, "find_valid_fet_topic", "FIND-VALID-FET-TOPIC", 1, 1, false );
    SubLFiles.declareFunction( me, "valid_fet_topic_fortP", "VALID-FET-TOPIC-FORT?", 1, 2, false );
    SubLFiles.declareFunction( me, "valid_fet_subtopic_fortP", "VALID-FET-SUBTOPIC-FORT?", 1, 2, false );
    SubLFiles.declareFunction( me, "salient_descriptor_fet_fn", "SALIENT-DESCRIPTOR-FET-FN", 0, 0, false );
    SubLFiles.declareFunction( me, "make_induced_topic_type_for_term", "MAKE-INDUCED-TOPIC-TYPE-FOR-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "induce_formula_template_subtopics_for_type", "INDUCE-FORMULA-TEMPLATE-SUBTOPICS-FOR-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "induced_formula_template_subtopics_for_type", "INDUCED-FORMULA-TEMPLATE-SUBTOPICS-FOR-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "promising_induction_topic_types", "PROMISING-INDUCTION-TOPIC-TYPES", 2, 1, false );
    SubLFiles.declareFunction( me, "promising_induction_collection_pred_for_type", "PROMISING-INDUCTION-COLLECTION-PRED-FOR-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "promising_induction_topic_type_collectionP", "PROMISING-INDUCTION-TOPIC-TYPE-COLLECTION?", 2, 2, false );
    SubLFiles.declareFunction( me, "promising_induction_assertions_for_collection", "PROMISING-INDUCTION-ASSERTIONS-FOR-COLLECTION", 1, 2, false );
    SubLFiles.declareFunction( me, "mt_time_index", "MT-TIME-INDEX", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_promising_induction_topic_type_collectionP_verify", "CLEAR-PROMISING-INDUCTION-TOPIC-TYPE-COLLECTION?-VERIFY", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_promising_induction_topic_type_collectionP_verify", "REMOVE-PROMISING-INDUCTION-TOPIC-TYPE-COLLECTION?-VERIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "promising_induction_topic_type_collectionP_verify_internal", "PROMISING-INDUCTION-TOPIC-TYPE-COLLECTION?-VERIFY-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "promising_induction_topic_type_collectionP_verify", "PROMISING-INDUCTION-TOPIC-TYPE-COLLECTION?-VERIFY", 2, 2, false );
    SubLFiles.declareFunction( me, "induction_topic_type_for_collection", "INDUCTION-TOPIC-TYPE-FOR-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "induction_topic_typeP", "INDUCTION-TOPIC-TYPE?", 1, 0, false );
    SubLFiles.declareFunction( me, "induced_formula_template_forts_for_focal_term_type", "INDUCED-FORMULA-TEMPLATE-FORTS-FOR-FOCAL-TERM-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_formula_template_forts_for_focal_term_type", "RKF-SALIENT-DESCRIPTOR-FORMULA-TEMPLATE-FORTS-FOR-FOCAL-TERM-TYPE", 2, 1, false );
    SubLFiles.declareFunction( me, "rkf_salient_descriptor_topic_type_for_collection", "RKF-SALIENT-DESCRIPTOR-TOPIC-TYPE-FOR-COLLECTION", 1, 0, false );
    SubLFiles.declareFunction( me, "focal_term_type_for_topic_type", "FOCAL-TERM-TYPE-FOR-TOPIC-TYPE", 1, 1, false );
    SubLFiles.declareFunction( me, "focal_term_type_for_induced_template_type", "FOCAL-TERM-TYPE-FOR-INDUCED-TEMPLATE-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "applicable_template_topics_by_types", "APPLICABLE-TEMPLATE-TOPICS-BY-TYPES", 1, 1, false );
    SubLFiles.declareFunction( me, "topics_via_isa_query_sentence", "TOPICS-VIA-ISA-QUERY-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "topics_via_genls_query_sentence", "TOPICS-VIA-GENLS-QUERY-SENTENCE", 1, 3, false );
    SubLFiles.declareFunction( me, "suggest_template_topic_for_term", "SUGGEST-TEMPLATE-TOPIC-FOR-TERM", 2, 1, false );
    SubLFiles.declareFunction( me, "suggest_template_topic_for_collection", "SUGGEST-TEMPLATE-TOPIC-FOR-COLLECTION", 2, 1, false );
    SubLFiles.declareFunction( me, "formula_template_topic_type_from_topic", "FORMULA-TEMPLATE-TOPIC-TYPE-FROM-TOPIC", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_template_prototype_from_el_formula", "FORMULA-TEMPLATE-PROTOTYPE-FROM-EL-FORMULA", 3, 5, false );
    SubLFiles.declareFunction( me, "formula_template_prototype_from_assertion", "FORMULA-TEMPLATE-PROTOTYPE-FROM-ASSERTION", 3, 4, false );
    SubLFiles.declareFunction( me, "template_type_for_focal_term_type", "TEMPLATE-TYPE-FOR-FOCAL-TERM-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "template_type_for_focal_term_types", "TEMPLATE-TYPE-FOR-FOCAL-TERM-TYPES", 2, 0, false );
    SubLFiles.declareFunction( me, "template_topic_genls", "TEMPLATE-TOPIC-GENLS", 2, 0, false );
    SubLFiles.declareFunction( me, "create_formula_template_from_name_and_topic", "CREATE-FORMULA-TEMPLATE-FROM-NAME-AND-TOPIC", 2, 0, false );
    SubLFiles.declareFunction( me, "find_matching_formula_template_argpos_details", "FIND-MATCHING-FORMULA-TEMPLATE-ARGPOS-DETAILS", 2, 0, false );
    SubLFiles.declareFunction( me, "maybe_assert_fet_gloss_for_arg_position", "MAYBE-ASSERT-FET-GLOSS-FOR-ARG-POSITION", 2, 1, false );
    SubLFiles.declareFunction( me, "maybe_assert_fet_gloss_for_arg2_of_binary_pred_formula", "MAYBE-ASSERT-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "maybe_assert_fet_gloss_for_arg2_of_binary_pred", "MAYBE-ASSERT-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "make_fet_gloss_for_arg_position", "MAKE-FET-GLOSS-FOR-ARG-POSITION", 2, 1, false );
    SubLFiles.declareFunction( me, "make_fet_gloss_for_arg2_of_binary_pred_formula", "MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED-FORMULA", 1, 1, false );
    SubLFiles.declareFunction( me, "clear_make_fet_gloss_for_arg2_of_binary_pred", "CLEAR-MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_make_fet_gloss_for_arg2_of_binary_pred", "REMOVE-MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "make_fet_gloss_for_arg2_of_binary_pred_internal", "MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_fet_gloss_for_arg2_of_binary_pred", "MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED", 1, 1, false );
    SubLFiles.declareFunction( me, "formula_template_meta_isaP", "FORMULA-TEMPLATE-META-ISA?", 2, 0, false );
    SubLFiles.declareFunction( me, "formula_template_meta_isa", "FORMULA-TEMPLATE-META-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_fet_gloss_for_meta_isa_formula", "MAKE-FET-GLOSS-FOR-META-ISA-FORMULA", 3, 0, false );
    SubLFiles.declareFunction( me, "clear_make_fet_gloss_for_meta_isa", "CLEAR-MAKE-FET-GLOSS-FOR-META-ISA", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_make_fet_gloss_for_meta_isa", "REMOVE-MAKE-FET-GLOSS-FOR-META-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_fet_gloss_for_meta_isa_internal", "MAKE-FET-GLOSS-FOR-META-ISA-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "make_fet_gloss_for_meta_isa", "MAKE-FET-GLOSS-FOR-META-ISA", 2, 0, false );
    SubLFiles.declareFunction( me, "make_fet_explanation_for_arg_position", "MAKE-FET-EXPLANATION-FOR-ARG-POSITION", 3, 1, false );
    SubLFiles.declareFunction( me, "reify_formula_template_description", "REIFY-FORMULA-TEMPLATE-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_type_subtopic", "ASSERT-FORMULA-TEMPLATE-TYPE-SUBTOPIC", 2, 0, false );
    SubLFiles.declareFunction( me, "make_formula_template_type_assertions", "MAKE-FORMULA-TEMPLATE-TYPE-ASSERTIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_formula", "ASSERT-FORMULA-TEMPLATE-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_elmt", "ASSERT-FORMULA-TEMPLATE-ELMT", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_focal_term_position", "ASSERT-FORMULA-TEMPLATE-FOCAL-TERM-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_assertion_format", "ASSERT-FORMULA-TEMPLATE-ASSERTION-FORMAT", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_assertion_explanations", "ASSERT-FORMULA-TEMPLATE-ASSERTION-EXPLANATIONS", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_assertion_glosses", "ASSERT-FORMULA-TEMPLATE-ASSERTION-GLOSSES", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_candidate_replacements", "ASSERT-FORMULA-TEMPLATE-CANDIDATE-REPLACEMENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_assertion_validation_required", "ASSERT-FORMULA-TEMPLATE-ASSERTION-VALIDATION-REQUIRED", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_assertion_replacements_invisible", "ASSERT-FORMULA-TEMPLATE-ASSERTION-REPLACEMENTS-INVISIBLE", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_examples", "ASSERT-FORMULA-TEMPLATE-EXAMPLES", 2, 0, false );
    SubLFiles.declareFunction( me, "assert_formula_template_priority_ordering", "ASSERT-FORMULA-TEMPLATE-PRIORITY-ORDERING", 3, 0, false );
    SubLFiles.declareFunction( me, "find_ftemplate_topic_from_id", "FIND-FTEMPLATE-TOPIC-FROM-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "find_ftemplate_from_ids", "FIND-FTEMPLATE-FROM-IDS", 3, 0, false );
    SubLFiles.declareFunction( me, "find_ftemplate_in_template_topic", "FIND-FTEMPLATE-IN-TEMPLATE-TOPIC", 2, 0, false );
    SubLFiles.declareFunction( me, "perform_after_creatings_for_new_template_term", "PERFORM-AFTER-CREATINGS-FOR-NEW-TEMPLATE-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "after_creating_function_specs_for_template_id", "AFTER-CREATING-FUNCTION-SPECS-FOR-TEMPLATE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "check_template_type_menu_item_parsing", "CHECK-TEMPLATE-TYPE-MENU-ITEM-PARSING", 1, 1, false );
    SubLFiles.declareFunction( me, "check_template_menu_item_parsing", "CHECK-TEMPLATE-MENU-ITEM-PARSING", 1, 2, false );
    SubLFiles.declareFunction( me, "check_template_arg_pos_menu_item_parsing", "CHECK-TEMPLATE-ARG-POS-MENU-ITEM-PARSING", 2, 3, false );
    SubLFiles.declareFunction( me, "check_template_candidate_replacement_gaf_parsing", "CHECK-TEMPLATE-CANDIDATE-REPLACEMENT-GAF-PARSING", 1, 3, false );
    SubLFiles.declareFunction( me, "check_template_arg_position_candidates", "CHECK-TEMPLATE-ARG-POSITION-CANDIDATES", 4, 0, false );
    SubLFiles.declareFunction( me, "arg_position_candidates_memoized_internal", "ARG-POSITION-CANDIDATES-MEMOIZED-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "arg_position_candidates_memoized", "ARG-POSITION-CANDIDATES-MEMOIZED", 2, 1, false );
    SubLFiles.declareFunction( me, "omit_from_fet_menuP", "OMIT-FROM-FET-MENU?", 1, 0, false );
    SubLFiles.declareFunction( me, "constraint_col_for_formula_arg_position", "CONSTRAINT-COL-FOR-FORMULA-ARG-POSITION", 2, 0, false );
    SubLFiles.declareFunction( me, "constraint_col_for_constraint_term", "CONSTRAINT-COL-FOR-CONSTRAINT-TERM", 1, 0, false );
    SubLFiles.declareFunction( me, "check_template_candidate_replacement_parsing", "CHECK-TEMPLATE-CANDIDATE-REPLACEMENT-PARSING", 2, 0, false );
    SubLFiles.declareFunction( me, "ftemplate_utilities_generate_example_template_topic_cases", "FTEMPLATE-UTILITIES-GENERATE-EXAMPLE-TEMPLATE-TOPIC-CASES", 1, 1, false );
    SubLFiles.declareFunction( me, "ftemplate_utilities_generate_example_instances_for_template_topic", "FTEMPLATE-UTILITIES-GENERATE-EXAMPLE-INSTANCES-FOR-TEMPLATE-TOPIC", 4, 1, false );
    SubLFiles.declareMacro( me, "do_quick_fort_topics", "DO-QUICK-FORT-TOPICS" );
    SubLFiles.declareFunction( me, "gather_fet_stats", "GATHER-FET-STATS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_formula_template_utilities_file()
  {
    $assume_induced_fet_templates_already_reifiedP$ = SubLFiles.defparameter( "*ASSUME-INDUCED-FET-TEMPLATES-ALREADY-REIFIED?*", NIL );
    $promising_induction_topic_type_collectionP_verify_caching_state$ = SubLFiles.deflexical( "*PROMISING-INDUCTION-TOPIC-TYPE-COLLECTION?-VERIFY-CACHING-STATE*", NIL );
    $make_fet_gloss_for_arg2_of_binary_pred_caching_state$ = SubLFiles.deflexical( "*MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED-CACHING-STATE*", NIL );
    $make_fet_gloss_for_meta_isa_caching_state$ = SubLFiles.deflexical( "*MAKE-FET-GLOSS-FOR-META-ISA-CACHING-STATE*", NIL );
    $ftemplate_utilities_example_template_topic_cases$ = SubLFiles.defparameter( "*FTEMPLATE-UTILITIES-EXAMPLE-TEMPLATE-TOPIC-CASES*", $list171 );
    return NIL;
  }

  public static SubLObject setup_formula_template_utilities_file()
  {
    access_macros.register_external_symbol( $sym48$APPLICABLE_TEMPLATE_TOPICS_FOR_TERM );
    memoization_state.note_globally_cached_function( $sym87$PROMISING_INDUCTION_TOPIC_TYPE_COLLECTION__VERIFY );
    access_macros.register_external_symbol( $sym91$FOCAL_TERM_TYPE_FOR_TOPIC_TYPE );
    memoization_state.note_globally_cached_function( $sym122$MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED );
    memoization_state.note_globally_cached_function( $sym135$MAKE_FET_GLOSS_FOR_META_ISA );
    memoization_state.note_memoized_function( $sym162$ARG_POSITION_CANDIDATES_MEMOIZED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_formula_template_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_formula_template_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_formula_template_utilities_file();
  }
  static
  {
    me = new formula_template_utilities();
    $assume_induced_fet_templates_already_reifiedP$ = null;
    $promising_induction_topic_type_collectionP_verify_caching_state$ = null;
    $make_fet_gloss_for_arg2_of_binary_pred_caching_state$ = null;
    $make_fet_gloss_for_meta_isa_caching_state$ = null;
    $ftemplate_utilities_example_template_topic_cases$ = null;
    $sym0$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const1$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $const2$FormulaTemplateTopicType = constant_handles.reader_make_constant_shell( makeString( "FormulaTemplateTopicType" ) );
    $sym3$STRING_ = makeSymbol( "STRING<" );
    $sym4$FORT_NAME = makeSymbol( "FORT-NAME" );
    $const5$FormulaTemplateMicrotheory_FET = constant_handles.reader_make_constant_shell( makeString( "FormulaTemplateMicrotheory-FET" ) );
    $kw6$TYPE = makeKeyword( "TYPE" );
    $list7 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "templateTypeForFocalTermType" ) ), makeKeyword( "TYPE" ), makeSymbol( "??TOPICS" ) );
    $list8 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "templateTypeForFocalTermType" ) ), makeSymbol( "?TERM" ), makeSymbol( "?TOPIC" ) );
    $list9 = ConsesLow.list( makeSymbol( "BINDINGS" ), makeSymbol( "ASSERTIONS" ) );
    $sym10$_TERM = makeSymbol( "?TERM" );
    $sym11$_TOPIC = makeSymbol( "?TOPIC" );
    $sym12$FORMULA_TEMPLATE_DEFTUPLE_ORDER = makeSymbol( "FORMULA-TEMPLATE-DEFTUPLE-ORDER" );
    $list13 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "templateTopicGenls" ) ), makeSymbol( "?TOPIC" ), makeSymbol( "?COL" ) );
    $sym14$_COL = makeSymbol( "?COL" );
    $sym15$SECOND = makeSymbol( "SECOND" );
    $const16$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw17$ANSWER_LANGUAGE = makeKeyword( "ANSWER-LANGUAGE" );
    $kw18$HL = makeKeyword( "HL" );
    $kw19$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword( "INTERMEDIATE-STEP-VALIDATION-LEVEL" );
    $kw20$NONE = makeKeyword( "NONE" );
    $kw21$PROBLEM_STORE = makeKeyword( "PROBLEM-STORE" );
    $list22 = ConsesLow.list( makeSymbol( "?TOPIC" ), makeSymbol( "?WHERE" ), makeSymbol( "?REL" ) );
    $const23$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $const24$relationAllInstance = constant_handles.reader_make_constant_shell( makeString( "relationAllInstance" ) );
    $const25$meetsSomeConstraintOfTopicType = constant_handles.reader_make_constant_shell( makeString( "meetsSomeConstraintOfTopicType" ) );
    $list26 = ConsesLow.list( makeSymbol( "?TOPIC" ) );
    $list27 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "definingMt" ) ), makeSymbol( "?TOPIC" ), makeSymbol( "?WHERE" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?REL" ), constant_handles.reader_make_constant_shell( makeString( "isa" ) ) ) );
    $kw28$BREADTH = makeKeyword( "BREADTH" );
    $kw29$QUEUE = makeKeyword( "QUEUE" );
    $kw30$STACK = makeKeyword( "STACK" );
    $sym31$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol( "RELEVANT-SBHL-TV-IS-GENERAL-TV" );
    $kw32$ERROR = makeKeyword( "ERROR" );
    $str33$_A_is_not_a__A = makeString( "~A is not a ~A" );
    $sym34$SBHL_TRUE_TV_P = makeSymbol( "SBHL-TRUE-TV-P" );
    $kw35$CERROR = makeKeyword( "CERROR" );
    $str36$continue_anyway = makeString( "continue anyway" );
    $kw37$WARN = makeKeyword( "WARN" );
    $str38$_A_is_not_a_valid__sbhl_type_erro = makeString( "~A is not a valid *sbhl-type-error-action* value" );
    $const39$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $const40$assertedSentence = constant_handles.reader_make_constant_shell( makeString( "assertedSentence" ) );
    $str41$_A_is_neither_SET_P_nor_LISTP_ = makeString( "~A is neither SET-P nor LISTP." );
    $str42$attempting_to_bind_direction_link = makeString( "attempting to bind direction link variable, to NIL. macro body not executed." );
    $str43$Node__a_does_not_pass_sbhl_type_t = makeString( "Node ~a does not pass sbhl-type-test ~a~%" );
    $kw44$GAF = makeKeyword( "GAF" );
    $const45$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $const46$meetsSomeGenlsConstraintOfTopicTy = constant_handles.reader_make_constant_shell( makeString( "meetsSomeGenlsConstraintOfTopicType" ) );
    $list47 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "definingMt" ) ), makeSymbol( "?TOPIC" ), makeSymbol( "?WHERE" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "equals" ) ), makeSymbol( "?REL" ), constant_handles.reader_make_constant_shell( makeString( "genls" ) ) ) );
    $sym48$APPLICABLE_TEMPLATE_TOPICS_FOR_TERM = makeSymbol( "APPLICABLE-TEMPLATE-TOPICS-FOR-TERM" );
    $float49$0_1 = makeDouble( 0.1 );
    $str50$Took__S_seconds_to_determine_indu = makeString( "Took ~S seconds to determine induced fet topics for ~S" );
    $kw51$DEPTH = makeKeyword( "DEPTH" );
    $const52$True_JustificationTruth = constant_handles.reader_make_constant_shell( makeString( "True-JustificationTruth" ) );
    $const53$FormulaTemplateInductionTopicType = constant_handles.reader_make_constant_shell( makeString( "FormulaTemplateInductionTopicTypeFn" ) );
    $const54$formulaTemplateHasType = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateHasType" ) );
    $list55 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TOPIC" ), constant_handles.reader_make_constant_shell( makeString(
        "InducedFormulaTemplateTopicType" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "formulaTemplateTypeHasTopicType" ) ), makeSymbol( "?TOPIC" ), makeSymbol( "?TOPIC-TYPE" ) ) );
    $sym56$_TEMPLATE = makeSymbol( "?TEMPLATE" );
    $list57 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "formulaTemplateHasType" ) ), makeSymbol( "?TEMPLATE" ), makeSymbol( "?TOPIC" ) );
    $sym58$_TOPIC_TYPE = makeSymbol( "?TOPIC-TYPE" );
    $list59 = ConsesLow.list( makeKeyword( "MAX-NUMBER" ), ONE_INTEGER );
    $list60 = ConsesLow.list( makeSymbol( "?TOPIC" ), makeSymbol( "?WHERE" ) );
    $list61 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "definingMt" ) ), makeSymbol( "?TOPIC" ), makeSymbol( "?WHERE" ) ), ConsesLow.list( constant_handles
        .reader_make_constant_shell( makeString( "unknownSentence" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeSymbol( "?TOPIC" ), constant_handles
            .reader_make_constant_shell( makeString( "InducedFormulaTemplateTopicType" ) ) ) ) );
    $sym62$_WHAT = makeSymbol( "?WHAT" );
    $const63$templateTypeForFocalTermType = constant_handles.reader_make_constant_shell( makeString( "templateTypeForFocalTermType" ) );
    $list64 = ConsesLow.list( makeSymbol( "?WHAT" ), makeSymbol( "?WHERE" ) );
    $const65$ist_Asserted = constant_handles.reader_make_constant_shell( makeString( "ist-Asserted" ) );
    $sym66$_WHERE = makeSymbol( "?WHERE" );
    $const67$templateTopicGenls = constant_handles.reader_make_constant_shell( makeString( "templateTopicGenls" ) );
    $list68 = ConsesLow.list( makeSymbol( "?WHAT" ) );
    $sym69$FIRST = makeSymbol( "FIRST" );
    $const70$termOfUnit = constant_handles.reader_make_constant_shell( makeString( "termOfUnit" ) );
    $const71$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $const72$Cyc = constant_handles.reader_make_constant_shell( makeString( "Cyc" ) );
    $str73$ = makeString( "" );
    $str74$Can_t_use_a_non_FORT_for_an_FET_t = makeString( "Can't use a non-FORT for an FET topic." );
    $str75$No_subtopics_ = makeString( "No subtopics." );
    $str76$No_templates_ = makeString( "No templates." );
    $str77$Can_t_use_a_non_FORT_for_an_FET_s = makeString( "Can't use a non-FORT for an FET subtopic." );
    $str78$SalientDescriptorFETFn = makeString( "SalientDescriptorFETFn" );
    $sym79$MAKE_SPECS_FN = makeSymbol( "MAKE-SPECS-FN" );
    $kw80$ISA = makeKeyword( "ISA" );
    $const81$promisingSalientDescriptorInducti = constant_handles.reader_make_constant_shell( makeString( "promisingSalientDescriptorInductionCollection" ) );
    $const82$promisingSalientDescriptorInducti = constant_handles.reader_make_constant_shell( makeString( "promisingSalientDescriptorInductionCollectionForSpecs" ) );
    $str83$promisingSalientDescriptorInducti = makeString( "promisingSalientDescriptorInductionCollection" );
    $int84$90 = makeInteger( 90 );
    $const85$DateBeforeFn = constant_handles.reader_make_constant_shell( makeString( "DateBeforeFn" ) );
    $const86$DaysDuration = constant_handles.reader_make_constant_shell( makeString( "DaysDuration" ) );
    $sym87$PROMISING_INDUCTION_TOPIC_TYPE_COLLECTION__VERIFY = makeSymbol( "PROMISING-INDUCTION-TOPIC-TYPE-COLLECTION?-VERIFY" );
    $sym88$_PROMISING_INDUCTION_TOPIC_TYPE_COLLECTION__VERIFY_CACHING_STATE_ = makeSymbol( "*PROMISING-INDUCTION-TOPIC-TYPE-COLLECTION?-VERIFY-CACHING-STATE*" );
    $const89$InducedFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "InducedFormulaTemplate" ) );
    $const90$SalientDescriptorFETForTypeFn = constant_handles.reader_make_constant_shell( makeString( "SalientDescriptorFETForTypeFn" ) );
    $sym91$FOCAL_TERM_TYPE_FOR_TOPIC_TYPE = makeSymbol( "FOCAL-TERM-TYPE-FOR-TOPIC-TYPE" );
    $sym92$EL_FORT_P = makeSymbol( "EL-FORT-P" );
    $kw93$MAX_NUMBER = makeKeyword( "MAX-NUMBER" );
    $sym94$_COLLECTION = makeSymbol( "?COLLECTION" );
    $str95$focalTermTypeForInducedTemplateTy = makeString( "focalTermTypeForInducedTemplateType" );
    $sym96$_MT = makeSymbol( "?MT" );
    $kw97$TOPICS = makeKeyword( "TOPICS" );
    $const98$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $list99 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "templateTypeForFocalTermType" ) ), makeSymbol( "?TYPE" ), makeKeyword( "TOPICS" ) ) );
    $list100 = ConsesLow.list( makeSymbol( "?TYPE" ) );
    $sym101$TERM__ = makeSymbol( "TERM-<" );
    $list102 = ConsesLow.list( ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "templateTopicGenls" ) ), makeKeyword( "TOPICS" ), makeSymbol( "?TYPE" ) ) );
    $kw103$TOPIC_TYPE = makeKeyword( "TOPIC-TYPE" );
    $list104 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "TOPIC-TYPE" ), constant_handles.reader_make_constant_shell( makeString( "FormulaTemplateTopicType" ) ) );
    $list105 = ConsesLow.list( makeKeyword( "TOPIC-TYPE" ) );
    $const106$FormulaArgPositionFn = constant_handles.reader_make_constant_shell( makeString( "FormulaArgPositionFn" ) );
    $const107$SomeExampleFn = constant_handles.reader_make_constant_shell( makeString( "SomeExampleFn" ) );
    $const108$SingleAssertionEntry = constant_handles.reader_make_constant_shell( makeString( "SingleAssertionEntry" ) );
    $const109$MultipleAssertionEntry = constant_handles.reader_make_constant_shell( makeString( "MultipleAssertionEntry" ) );
    $kw110$WHAT = makeKeyword( "WHAT" );
    $list111 = ConsesLow.list( makeKeyword( "WHAT" ) );
    $list112 = ConsesLow.list( TWO_INTEGER );
    $list113 = ConsesLow.list( THREE_INTEGER );
    $const114$relationAllExists = constant_handles.reader_make_constant_shell( makeString( "relationAllExists" ) );
    $str115$_ = makeString( ":" );
    $str116$__type__ = makeString( " (type):" );
    $const117$glossForInducedSuggestionPred = constant_handles.reader_make_constant_shell( makeString( "glossForInducedSuggestionPred" ) );
    $const118$GKEFormulaTemplatesMt = constant_handles.reader_make_constant_shell( makeString( "GKEFormulaTemplatesMt" ) );
    $list119 = ConsesLow.list( ONE_INTEGER );
    $str120$______ = makeString( "______" );
    $str121$arg__S_of__S_ = makeString( "arg ~S of ~S:" );
    $sym122$MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED = makeSymbol( "MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED" );
    $sym123$PREDICATE_P = makeSymbol( "PREDICATE-P" );
    $const124$DenotesArgInRelnPredicate = constant_handles.reader_make_constant_shell( makeString( "DenotesArgInRelnPredicate" ) );
    $list125 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) );
    $list126 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "singular-Generic" ) ), constant_handles.reader_make_constant_shell( makeString( "thirdPersonSg-Generic" ) ) );
    $sym127$_MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED_CACHING_STATE_ = makeSymbol( "*MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED-CACHING-STATE*" );
    $sym128$CLEAR_MAKE_FET_GLOSS_FOR_ARG2_OF_BINARY_PRED = makeSymbol( "CLEAR-MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED" );
    $list129 = ConsesLow.list( ConsesLow.list( ONE_INTEGER, ONE_INTEGER ), ConsesLow.list( TWO_INTEGER, TWO_INTEGER ) );
    $list130 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword(
        "BIND" ), makeSymbol( "ISA-VAR" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "META-ISA" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword(
            "ANYTHING" ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ISA-VAR" ) ) ) );
    $sym131$ISA_VAR = makeSymbol( "ISA-VAR" );
    $sym132$META_ISA = makeSymbol( "META-ISA" );
    $list133 = ConsesLow.list( ConsesLow.list( ONE_INTEGER, TWO_INTEGER ), ConsesLow.list( TWO_INTEGER, ONE_INTEGER ) );
    $list134 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "and" ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), makeKeyword( "ANYTHING" ), ConsesLow
        .list( makeKeyword( "BIND" ), makeSymbol( "ISA-VAR" ) ) ), ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "isa" ) ), ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "ISA-VAR" ) ),
            ConsesLow.list( makeKeyword( "BIND" ), makeSymbol( "META-ISA" ) ) ) );
    $sym135$MAKE_FET_GLOSS_FOR_META_ISA = makeSymbol( "MAKE-FET-GLOSS-FOR-META-ISA" );
    $sym136$_MAKE_FET_GLOSS_FOR_META_ISA_CACHING_STATE_ = makeSymbol( "*MAKE-FET-GLOSS-FOR-META-ISA-CACHING-STATE*" );
    $sym137$ARG_POSITION_P = makeSymbol( "ARG-POSITION-P" );
    $const138$nonPlural_Generic = constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) );
    $list139 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Demonstrative-ClassA-NLAttr" ) ) );
    $const140$formulaTemplateTypeHasTopicType = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateTypeHasTopicType" ) );
    $const141$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $list142 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) );
    $const143$formulaForFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "formulaForFormulaTemplate" ) );
    $const144$assertMtForFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "assertMtForFormulaTemplate" ) );
    $const145$focalTermPositionForFormulaTempla = constant_handles.reader_make_constant_shell( makeString( "focalTermPositionForFormulaTemplate" ) );
    $const146$assertionFormatForFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "assertionFormatForFormulaTemplate" ) );
    $const147$formulaTemplateArgExplanation = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateArgExplanation" ) );
    $const148$glossForFormulaTemplate = constant_handles.reader_make_constant_shell( makeString( "glossForFormulaTemplate" ) );
    $const149$candidateReplacementForPosition = constant_handles.reader_make_constant_shell( makeString( "candidateReplacementForPosition" ) );
    $const150$validationRequiredOnTemplatePosit = constant_handles.reader_make_constant_shell( makeString( "validationRequiredOnTemplatePosition" ) );
    $const151$templateReplacementsInvisibleForP = constant_handles.reader_make_constant_shell( makeString( "templateReplacementsInvisibleForPosition" ) );
    $const152$formulaTemplateExample = constant_handles.reader_make_constant_shell( makeString( "formulaTemplateExample" ) );
    $const153$higherPriorityTemplateForType = constant_handles.reader_make_constant_shell( makeString( "higherPriorityTemplateForType" ) );
    $sym154$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $const155$TKBTemplate_Attack = constant_handles.reader_make_constant_shell( makeString( "TKBTemplate-Attack" ) );
    $list156 = ConsesLow.list( makeSymbol( "LAUNCH-LEXIFY-TERRORIST-ATTACK-TASK" ) );
    $list157 = ConsesLow.list( makeUninternedSymbol( "LINK-NODE" ), makeUninternedSymbol( "MT" ), makeUninternedSymbol( "TV" ) );
    $sym158$REST = makeSymbol( "REST" );
    $sym159$CONSTRAINT_COL_FOR_CONSTRAINT_TERM = makeSymbol( "CONSTRAINT-COL-FOR-CONSTRAINT-TERM" );
    $list160 = ConsesLow.list( makeSymbol( "TEMPLATE" ), makeSymbol( "EL-ARG-POS" ), makeSymbol( "SET-OR-COLLECTION" ) );
    $int161$350 = makeInteger( 350 );
    $sym162$ARG_POSITION_CANDIDATES_MEMOIZED = makeSymbol( "ARG-POSITION-CANDIDATES-MEMOIZED" );
    $sym163$_ = makeSymbol( ">" );
    $sym164$NUM_INDEX = makeSymbol( "NUM-INDEX" );
    $const165$IndexicalConcept = constant_handles.reader_make_constant_shell( makeString( "IndexicalConcept" ) );
    $const166$SomeExampleSpecFn = constant_handles.reader_make_constant_shell( makeString( "SomeExampleSpecFn" ) );
    $const167$SpecsFn = constant_handles.reader_make_constant_shell( makeString( "SpecsFn" ) );
    $str168$__Couldn_t_find__S___in_denots_of = makeString( "~%Couldn't find ~S~% in denots of ~S qua ~S~% Found ~S~%" );
    $list169 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nounStrings" ) ), constant_handles.reader_make_constant_shell( makeString( "properNameStrings" ) ), constant_handles
        .reader_make_constant_shell( makeString( "adjStrings" ) ) );
    $kw170$OK = makeKeyword( "OK" );
    $list171 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TKBTemplate-Individual" ) ), constant_handles.reader_make_constant_shell( makeString( "TKBTemplate-Organization" ) ),
        constant_handles.reader_make_constant_shell( makeString( "TKBTemplate-Attack" ) ) );
    $str172$_ = makeString( "/" );
    $str173$_xml = makeString( ".xml" );
    $str174$Generating__S_seen_from__S_into__ = makeString( "Generating ~S seen from ~S into ~S ... " );
    $kw175$OUTPUT = makeKeyword( "OUTPUT" );
    $str176$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str177$_done__ = makeString( " done~%" );
    $int178$100 = makeInteger( 100 );
    $list179 = ConsesLow.list( ConsesLow.list( makeSymbol( "TOPIC" ), makeSymbol( "FORT" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym180$ISA = makeUninternedSymbol( "ISA" );
    $sym181$WITH_ALL_MTS = makeSymbol( "WITH-ALL-MTS" );
    $sym182$DO_ALL_ISA = makeSymbol( "DO-ALL-ISA" );
    $sym183$CDOLIST = makeSymbol( "CDOLIST" );
    $sym184$PRED_VALUES = makeSymbol( "PRED-VALUES" );
    $list185 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "templateTypeForFocalTermType" ) ) );
    $str186$mapping_Cyc_FORTs = makeString( "mapping Cyc FORTs" );
    $kw187$SKIP = makeKeyword( "SKIP" );
    $const188$InducedFormulaTemplateTopicType = constant_handles.reader_make_constant_shell( makeString( "InducedFormulaTemplateTopicType" ) );
    $const189$keInducedStrongSuggestionPreds = constant_handles.reader_make_constant_shell( makeString( "keInducedStrongSuggestionPreds" ) );
    $const190$keInducedWeakSuggestionPreds = constant_handles.reader_make_constant_shell( makeString( "keInducedWeakSuggestionPreds" ) );
    $const191$keInducedSuggestionPreds = constant_handles.reader_make_constant_shell( makeString( "keInducedSuggestionPreds" ) );
    $int192$1000 = makeInteger( 1000 );
    $str193$__Total___S_Have_topic___S___4F__ = makeString( "~&Total: ~S Have topic: ~S (~4F%) Could have topic: ~S (~4F%)~%" );
    $str194$__Hand___S___4F___Induced___S___4 = makeString( "~&Hand: ~S (~4F%) Induced: ~S (~4F%) Both: ~S (~4F%)~%" );
  }
}
/*
 * 
 * Total time: 17731 ms
 * 
 */